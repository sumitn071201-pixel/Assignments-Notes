package com.demo.JWTSecurityUsingDatabase.beans;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="myuser")
public class MyUser {
	@Id
	private String uname;
	private String password;
	private String role;   //ROLE_ADMIN ROLE_USER
	public MyUser() {
		super();
	}
	public MyUser(String uname, String passwd, String role) {
		super();
		this.uname = uname;
		this.password = passwd;
		this.role = role;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String passwd) {
		this.password = passwd;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "MyUser [uname=" + uname + ", password=" + password + ", role=" + role + "]";
	}
	

}
