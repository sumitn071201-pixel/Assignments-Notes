package com.demo.beans;

import java.time.LocalDate;

public class Employee {
	private int empid;
	private String ename;
	private double sal;
	private LocalDate jdt;
	
<<<<<<<< HEAD:DataAug 2025/Java/Day11/src/com/demo/beans/Employee.java
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Employee(int empid, String ename, double sal, LocalDate jdt) {
========
	public Employee() {
>>>>>>>> 2047228f263a60233d136c55f9ebd1ad976dbd0a:Core Java/Day 8/Collection/src/com/demo/beans/Employee.java
		super();
	}
<<<<<<<< HEAD:DataAug 2025/Java/Day11/src/com/demo/beans/Employee.java


	public Employee(int empid) {
		super();
		this.empid = empid;
========
	
	public Employee(int empid) {
		super();
		this.empid=empid;
	}
	
	public Employee(int empid, String ename, double sal, LocalDate jdt) {
		super();
		this.empid=empid;
		this.ename=ename;
		this.sal=sal;
		this.jdt=jdt;
	}
	
	public boolean equals(Object obj) {
		System.out.println("in equals method"+this.empid+"------"+((Employee)obj).empid);
		return this.empid==((Employee)obj).empid;
>>>>>>>> 2047228f263a60233d136c55f9ebd1ad976dbd0a:Core Java/Day 8/Collection/src/com/demo/beans/Employee.java
	}


	public int getEmpid() {
		return empid;
	}

<<<<<<<< HEAD:DataAug 2025/Java/Day11/src/com/demo/beans/Employee.java

	public void setEmpid(int empid) {
		this.empid = empid;
	}


========
>>>>>>>> 2047228f263a60233d136c55f9ebd1ad976dbd0a:Core Java/Day 8/Collection/src/com/demo/beans/Employee.java
	public String getEname() {
		return ename;
	}

<<<<<<<< HEAD:DataAug 2025/Java/Day11/src/com/demo/beans/Employee.java

	public void setEname(String ename) {
		this.ename = ename;
	}


========
>>>>>>>> 2047228f263a60233d136c55f9ebd1ad976dbd0a:Core Java/Day 8/Collection/src/com/demo/beans/Employee.java
	public double getSal() {
		return sal;
	}

<<<<<<<< HEAD:DataAug 2025/Java/Day11/src/com/demo/beans/Employee.java

	public void setSal(double sal) {
		this.sal = sal;
	}


========
>>>>>>>> 2047228f263a60233d136c55f9ebd1ad976dbd0a:Core Java/Day 8/Collection/src/com/demo/beans/Employee.java
	public LocalDate getJdt() {
		return jdt;
	}

<<<<<<<< HEAD:DataAug 2025/Java/Day11/src/com/demo/beans/Employee.java
========
	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}
>>>>>>>> 2047228f263a60233d136c55f9ebd1ad976dbd0a:Core Java/Day 8/Collection/src/com/demo/beans/Employee.java

	public void setJdt(LocalDate jdt) {
		this.jdt = jdt;
	}

<<<<<<<< HEAD:DataAug 2025/Java/Day11/src/com/demo/beans/Employee.java

========
>>>>>>>> 2047228f263a60233d136c55f9ebd1ad976dbd0a:Core Java/Day 8/Collection/src/com/demo/beans/Employee.java
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + ", sal=" + sal + ", jdt=" + jdt + "]";
	}
<<<<<<<< HEAD:DataAug 2025/Java/Day11/src/com/demo/beans/Employee.java


	public int compareTo(Employee o) {
		System.out.println("in compareTo method "+ this.empid+ "----"+ o.empid);
		
		return this.empid-o.empid;
	}

========
	
>>>>>>>> 2047228f263a60233d136c55f9ebd1ad976dbd0a:Core Java/Day 8/Collection/src/com/demo/beans/Employee.java
	

}
