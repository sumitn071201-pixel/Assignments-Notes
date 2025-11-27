package com.demo.service;

import com.demo.beans.MyUser;

public interface RegistrationService {
    MyUser registerUser(String name, String email, String gender, String[] hobbies, String city);
}
