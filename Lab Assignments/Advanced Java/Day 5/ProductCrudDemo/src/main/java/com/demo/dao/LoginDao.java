package com.demo.dao;

import com.demo.beans.MyUser;

public interface LoginDao {

	MyUser checkUser(String uname, String pass);

	boolean updatePassword(String uname, String updatepassword);

	boolean addUser(String uname, String email, String role, String password);

}
