package com.demo.beans;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

public class MyStudent {
	private int sid;
	private String sname;
	private String email;
	private String address;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate dob;
	public MyStudent() {
		super();
	}
	public MyStudent(int sid, String sname, String email, String address, LocalDate dob) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.email = email;
		this.address = address;
		this.dob = dob;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "MyStudent [sid=" + sid + ", sname=" + sname + ", email=" + email + ", address=" + address + ", dob="
				+ dob + "]";
	}
	
	
	
	
	

}
