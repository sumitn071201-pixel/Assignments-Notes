package com.demo.dao;

import java.util.List;

import com.demo.beans.MyStudent;

public interface StudentDao {

	List<MyStudent> findAllStudents();

	boolean save(MyStudent p);

	MyStudent findById(int pid);

	boolean modifyStudent(MyStudent s);

	boolean removeById(int pid);

}
