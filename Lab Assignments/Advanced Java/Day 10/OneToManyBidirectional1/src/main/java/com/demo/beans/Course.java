package com.demo.beans;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="MyCourse")
public class Course {
    @Id
    private int cid;
    private String cname;

    @OneToMany(mappedBy = "course")
    private Set<Student> students = new HashSet<>();

    public Course() {
        super();
    }

    public Course(int cid, String cname) {
        super();
        this.cid = cid;
        this.cname = cname;
    }

    public Course(int cid, String cname, Set<Student> students) {
        super();
        this.cid = cid;
        this.cname = cname;
        this.students = students;
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

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Course [cid=" + cid + ", cname=" + cname + "]";
    }
}
