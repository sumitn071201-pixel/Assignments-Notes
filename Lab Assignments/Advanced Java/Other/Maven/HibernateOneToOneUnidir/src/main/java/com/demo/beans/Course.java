package com.demo.beans;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Course {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private float time;
	@OneToOne(fetch =FetchType.LAZY)
	private Faculty faculty;
	public Course() {
		super();
	}
	public Course(String name, float time, Faculty faculty) {
		super();
		this.name = name;
		this.time = time;
		this.faculty = faculty;
	}
	public Course(int id, String name, float time, Faculty faculty) {
		super();
		this.id = id;
		this.name = name;
		this.time = time;
		this.faculty = faculty;
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
	public float getTime() {
		return time;
	}
	public void setTime(float time) {
		this.time = time;
	}
	public Faculty getFaculty() {
		return faculty;
	}
	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", time=" + time + ", faculty=" + faculty + "]";
	}
	
	
}
