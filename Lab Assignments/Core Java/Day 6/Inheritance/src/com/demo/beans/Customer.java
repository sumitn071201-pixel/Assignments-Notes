package com.demo.beans;

import java.util.Date;

public class Customer extends Person{
	private String address;

	public Customer() {
	
	}

	public Customer(String emptype, String pname, Date bdate) {
		super(emptype, pname, bdate);
		
		this.address=address;
	}

	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}@Override
	public String toString() {
		return "Customer [address=" + address + "]";
	}

	

}
