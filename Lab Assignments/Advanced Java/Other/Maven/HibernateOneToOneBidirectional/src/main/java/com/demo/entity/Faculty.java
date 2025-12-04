package com.demo.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Faculty {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	@OneToOne (mappedBy = "faculty" , fetch = FetchType.LAZY)
	Course course;
	public Faculty() {
		super();
	}
	public Faculty(String name) {
		super();
		this.name = name;
	}
	public Faculty(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	@Override
	public String toString() {
		return "Faculty [id=" + id + ", name=" + name + "]";
	}

	
	
}
