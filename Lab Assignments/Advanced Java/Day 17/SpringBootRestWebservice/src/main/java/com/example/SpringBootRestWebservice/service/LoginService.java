package com.example.SpringBootRestWebservice.service;

import com.example.SpringBootRestWebservice.beans.MyUser;

public interface LoginService {

	MyUser validateUser(String uname, String passwd);

}
