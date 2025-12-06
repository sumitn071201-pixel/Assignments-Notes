package com.demo.service;

import java.util.List;

import com.demo.beans.MyStudent;

public interface StudentService {

	List<MyStudent> getAllStudents();

	boolean addstudent(MyStudent s);

	MyStudent getById(int sid);

	boolean updatestudent(MyStudent s);

	boolean deleteById(int sid);


  
}
