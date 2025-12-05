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
public class Project {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private LocalDate startDate;
	@ManyToMany (mappedBy = "projects" ,fetch = FetchType.EAGER)
	private List<Employee> Employee = new ArrayList<Employee>();
	
	public Project() {
		super(); 
	}

	public Project(String name, LocalDate startDate) {
		super();
		this.name = name;
		this.startDate = startDate;
	}

	public Project(String name, LocalDate startDate, List<com.demo.entity.Employee> employee) {
		super();
		this.name = name;
		this.startDate = startDate;
		Employee = employee;
	}

	public Project(int id, String name, LocalDate startDate, List<com.demo.entity.Employee> employee) {
		super();
		this.id = id;
		this.name = name;
		this.startDate = startDate;
		Employee = employee;
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

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public List<Employee> getEmployee() {
		return Employee;
	}

	public void setEmployee(List<Employee> employee) {
		Employee = employee;
	}

	@Override
	public String toString() {
		return "Project [id=" + id + ", name=" + name + ", startDate=" + startDate + "]";
	}
	
	
}
