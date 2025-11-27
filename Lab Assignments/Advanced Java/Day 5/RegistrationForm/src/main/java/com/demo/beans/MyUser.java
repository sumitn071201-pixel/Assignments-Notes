package com.demo.beans;

import java.util.Arrays;

public class MyUser {
    private String uname;
    private String email;
    private String gender;
    private String[] hobbies;
    private String city;

    public MyUser(String uname, String email, String gender, String[] hobbies, String city) {
        this.uname = uname;
        this.email = email;
        this.gender = gender;
        this.hobbies = hobbies;
        this.city = city;
    }

    public String getUname() { 
    	return uname; 
    	}
    public void setUname(String uname) {
    	this.uname = uname;
    	}

    public String getEmail() {
    	return email;
    	}
    public void setEmail(String email) { 
    	this.email = email; 
    	}

    public String getGender() {
    	return gender; 
    	}
    public void setGender(String gender) { 
    	this.gender = gender; 
    	}

    public String[] getHobbies() { 
    	return hobbies;
    	}
    public void setHobbies(String[] hobbies) { 
    	this.hobbies = hobbies; 
    	}

    public String getCity() { 
    	return city; 
    	}
    public void setCity(String city) { 
    	this.city = city; 
    	}

    @Override
    public String toString() {
        return "MyUser{" +
                "uname='" + uname + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", hobbies=" + Arrays.toString(hobbies) +
                ", city='" + city + '\'' +
                '}';
    }
}
