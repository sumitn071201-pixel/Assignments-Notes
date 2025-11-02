      package com.demo.dao;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeDao {
<<<<<<<< HEAD:DataAug 2025/Java/Day14/ObjectSerializationdemo/src/com/demo/dao/EmployeeDao.java

	void readData(String fname);

	boolean save(Employee e);

	boolean removeById(int empid);

	boolean updateById(int empid, double sal);

	List<Employee> findAll();

	Employee findById(int empid);

	void writeData(String fname);
========
	
	boolean save(Employee e);
	
	List<Employee> findAll();
	
	Employee findById(int eid);
	
	boolean removeById(int eid);
	
	List<Employee> findByName(String nm);
>>>>>>>> 2047228f263a60233d136c55f9ebd1ad976dbd0a:Core Java/Day 8/Collection/src/com/demo/dao/EmployeeDao.java

	List<Employee> findBySal(double sal);

	boolean removeBySal(double sal);

}
