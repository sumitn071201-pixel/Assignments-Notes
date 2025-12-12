package com.demo.SpringBootRestWebservice.service;


import org.springframework.stereotype.Service;

import com.demo.SpringBootRestWebservice.beans.MyUser;


@Service
public class LoginServiceImpl implements LoginService{
	 // @Autowired
     // LoginDao ldao;
	
	public MyUser validateUser(String uname, String passwd) {
		//return ldao.autheticateUser(uname,passwd);
		return null;
	}

}
