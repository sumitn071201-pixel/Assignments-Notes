package com.demo.beans;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="studentDetails")
public class Student {
	@Id
	private int id;
	private String name;
	private String email;
	@ManyToOne(cascade = CascadeType.ALL)
	private Course course;
	public Student() {
		super();
	}
	public Student(String name, String email, Course course) {
		super();
		this.name = name;
		this.email = email;
		this.course = course;
	}
	public Student(int id, String name, String email, Course course) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.course = course;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	
	
}
