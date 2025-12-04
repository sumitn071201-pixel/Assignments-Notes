package com.demo.beans;

import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Course {
	@Id
	private int cid;
	private String cname;
	private float duration;
	@OneToMany(mappedBy="course")
	private Set<Student> student;
	public Course() {
		super();
	}
	public Course(int cid, String cname, float duration) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.duration = duration;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public float getDuration() {
		return duration;
	}
	public void setDuration(float duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", duration=" + duration + ", student=" + student + "]";
	}
	
	
}
