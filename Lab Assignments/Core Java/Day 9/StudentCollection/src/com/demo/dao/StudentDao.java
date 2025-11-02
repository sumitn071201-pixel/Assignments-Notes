package com.demo.dao;

import java.util.List;

import com.demo.beans.Student;

public interface StudentDao {

	boolean save(Student s);

	List<Student> findAll();

	Student findById(int id);

	List<Student> findByName(String nm);

	boolean modifyById(int id, float m1);

	boolean removeById(int id);

	List<Student> findByMarks(float m1);

	List<Student> sortByName();

	List<Student> sortByMarks1();

	List<Student> sortById();

}
