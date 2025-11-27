package com.demo.service;

import com.demo.beans.MyUser;
import com.demo.dao.LoginDao;
import com.demo.dao.LoginDaoImpl;

public class LoginServiceImpl  implements LoginService{
	private LoginDao ldao;
	
	public LoginServiceImpl() {
		ldao= new LoginDaoImpl();

	}

	@Override
	public MyUser validateUser(String uname, String pass) {
		return ldao.checkUser(uname,pass);
	}

	@Override
	public boolean forgotPassword(String uname, String updatepassword) {
		return ldao.updatePassword(uname,updatepassword);
	}

	@Override
	public boolean signUp(String uname, String email, String role, String password) {
		return ldao.addUser(uname, email, role,password);
	}
	

}
