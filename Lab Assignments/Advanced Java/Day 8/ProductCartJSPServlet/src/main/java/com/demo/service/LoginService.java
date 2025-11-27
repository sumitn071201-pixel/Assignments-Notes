package com.demo.service;

import com.demo.beans.MyUser;

public interface LoginService {

	MyUser validateUSer(String uname, String pass);

}
