package com.demo.beans;

import com.demo.exceptions.NegativeSalaryException;

public class Employee {
	private int eid;
	private String ename;
	private double sal;
	public Employee() {
		super();
		
	}
	public Employee(int eid, String ename, double sal) {
		this.eid = eid;
		this.ename = ename;
		this.sal = sal;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal)throws NegativeSalaryException{
		if(sal<0)
			throw new NegativeSalaryException("Salart cannot be -ve");
		else if(sal<2000) {
			throw new NegativeSalaryException("Salary cannot be less than 2000");
	
	}
	
		
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", sal=" + sal + "]";
	}
	

}
