package com.example.SpringBootRestWebservice.service;


import org.springframework.stereotype.Service;

import com.example.SpringBootRestWebservice.beans.MyUser;


@Service
public class LoginServiceImpl implements LoginService{
	 // @Autowired
     // LoginDao ldao;
	
	public MyUser validateUser(String uname, String passwd) {
		//return ldao.autheticateUser(uname,passwd);
		return null;
	}

}
