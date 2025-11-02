package com.demo.beans;

import java.util.Date;

public class VendorEmp extends Employee{
    private int noOfEmployees;
    private double amount;
	public VendorEmp() {
	
	}
	public VendorEmp(String pname, Date bdate, String dept, String desg,int noOfEmployees,double amount) {
		super("v", pname, bdate, dept, desg);
		this.noOfEmployees=noOfEmployees;
		this.amount=amount;
		
	}
	public int getNoOfEmployees() {
		return noOfEmployees;
	}
	public double getAmount() {
		return amount;
	}
	public void setNoOfEmployees(int noOfEmployees) {
		this.noOfEmployees = noOfEmployees;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public double calculateSal() {
		return noOfEmployees*amount;
	}
	@Override
	public String toString() {
		return "VendorEmp [noOfEmployees=" + noOfEmployees + ", amount=" + amount + "]";
	}
}
