package com.demo.beans;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "MyStudent")
public class Student {
    @Id
    private int sid;
    private String sname;


    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "courseid")
    private Course course;

    public Student() {
        super();
    }

    public Student(int sid, String sname, Course course) {
        super();
        this.sid = sid;
        this.sname = sname;
        this.course = course;
    }
    


	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}



	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
    public String toString() {
        return "Student [sid=" + sid + ", sname=" + sname + ", course=" + course + "]";
    }
}
