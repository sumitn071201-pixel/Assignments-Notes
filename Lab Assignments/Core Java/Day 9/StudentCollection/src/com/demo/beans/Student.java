package com.demo.beans;
import java.time.LocalDate;

public class Student implements Comparable<Student> {
	
	private int id;
	private String name;
	private float m1;
	private float m2;
	private LocalDate bdate;
	
	public Student() {
		id=0;
		name=null;
		m1=0.0f;
		m2=0.0f;
		bdate=null;
	}
	

	public Student(int id) {
		super();
		this.id = id;
	}


	public Student(int id, String name, float m1, float m2, LocalDate bdate) {
	
		this.id = id;
		this.name = name;
		this.m1 = m1;
		this.m2 = m2;
		this.bdate = bdate;
	}
	public boolean equals(Object obj) {
		System.out.println("in equals method"+this.id+"------"+((Student)obj).id);
		return this.id==((Student)obj).id;
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

	public float getM1() {
		return m1;
	}

	public void setM1(float m1) {
		this.m1 = m1;
	}

	public float getM2() {
		return m2;
	}

	public void setM2(float m2) {
		this.m2 = m2;
	}

	public LocalDate getBdate() {
		return bdate;
	}

	public void setBdate(LocalDate bdate) {
		this.bdate = bdate;
	}

	public String toString() {
		return "id=" + id + ", name=" + name + ", m1=" + m1 + ", m2=" + m2 + ", bdate=" + bdate ;
	}


	@Override
	public int compareTo(Student ob) {
		System.out.println("in compareTo method "+this.id+"----"+ob.id);
		System.out.println("Marks1---> "+this.m1+"----"+ob.m1);
		return (int)(this.m1-ob.m1);
		
	}
	
	
	
	
	
	

}
