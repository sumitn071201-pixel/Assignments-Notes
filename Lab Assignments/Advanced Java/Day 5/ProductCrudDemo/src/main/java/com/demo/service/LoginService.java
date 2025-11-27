package com.demo.service;

import com.demo.beans.MyUser;

public interface LoginService {

	MyUser validateUser(String uname, String pass);

	boolean forgotPassword(String uname, String updatepassword);

	boolean signUp(String uname, String email, String role, String password);

}
