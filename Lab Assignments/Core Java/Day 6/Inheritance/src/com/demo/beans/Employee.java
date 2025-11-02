package com.demo.beans;

import java.util.Date;

abstract public class Employee extends Person{
	private String dept;
	private String desg;
	public Employee() {
		super();
		System.out.println("in employee default constructor");
	}
	public Employee(String emptype,String pname,Date bdate,String dept,String desg) {
		super(emptype,pname,bdate);
		System.out.println("in employee parameterized constructor");
		this.dept=dept;
		this.desg=desg;
	}
	public String getDept() {
		return dept;
	}
	public String getDesg() {
		return desg;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	
	abstract public double calculateSal();
	@Override
	public String toString() {
		return "Employee [dept=" + dept + ", desg=" + desg + "]";
	}
	

}
