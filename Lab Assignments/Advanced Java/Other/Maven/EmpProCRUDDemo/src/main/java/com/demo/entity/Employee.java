package com.demo.entity;

import java.time.LocalDate;
import java.util.*;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private double sal;
	private LocalDate hiredate;
	@ManyToMany(fetch = FetchType.EAGER)
	private List<Project> projects = new ArrayList<>();
	public Employee() {
		super();
	}
	public Employee(String name, double sal, LocalDate hiredate) {
		super();
		this.name = name;
		this.sal = sal;
		this.hiredate = hiredate;
	}
	public Employee(String name, double sal, LocalDate hiredate, List<Project> projects) {
		super();
		this.name = name;
		this.sal = sal;
		this.hiredate = hiredate;
		this.projects = projects;
	}
	public Employee(int id, String name, double sal, LocalDate hiredate, List<Project> projects) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.hiredate = hiredate;
		this.projects = projects;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public LocalDate getHiredate() {
		return hiredate;
	}
	public void setHiredate(LocalDate hiredate) {
		this.hiredate = hiredate;
	}
	public List<Project> getProjects() {
		return projects;
	}
	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + ", hiredate=" + hiredate + "]";
	}
	
	
}
