package com.demo.service;

import com.demo.beans.MyUser;
import com.demo.dao.RegistrationDao;
import com.demo.dao.RegistrationDaoImpl;

public class RegistrationServiceImpl implements RegistrationService {
    private RegistrationDao rdao;

    public RegistrationServiceImpl() {
        rdao = new RegistrationDaoImpl();
    }

    @Override
    public MyUser registerUser(String name, String email, String gender, String[] hobbies, String city) {
        MyUser user = new MyUser(name, email, gender, hobbies, city);
        return rdao.saveUser(user);
    }
}
