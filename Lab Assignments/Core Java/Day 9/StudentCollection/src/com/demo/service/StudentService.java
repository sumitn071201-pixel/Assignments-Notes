package com.demo.service;

import java.util.List;

import com.demo.beans.Student;

public interface StudentService {

	boolean addNewStudent();

	List<Student> displayAll();

	Student searchById(int id);

	List<Student> findByName(String nm);

	boolean updateById(int id, float m1);

	boolean deleteById(int id);

	List<Student> searchByMarks1(float m1);

	List<Student> sortById();

	List<Student> sortByName();

	List<Student> sortByMarks1();

	

}
