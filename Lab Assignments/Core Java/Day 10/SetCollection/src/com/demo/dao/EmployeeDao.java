package com.demo.dao;

import java.util.List;
import java.util.Set;

import com.demo.beans.Employee;

public interface EmployeeDao {

	boolean save(Employee e);

	Set<Employee> findAll();

	Employee findById(int id);

	Set<Employee> findByName(String nm);

	boolean updateBySal(int id, double sal);

	boolean removeById(int id);

	boolean removeBySal(double sal);

	Set<Employee> findBySal(double sal);

	List<Employee> sortBySal();

	List<Employee> sortByName();

	Set<Employee> sortById();

}
