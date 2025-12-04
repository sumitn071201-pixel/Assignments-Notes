package com.demo.dao;

import java.util.List;

import com.demo.entity.Employee;
import com.demo.entity.Project;

public interface EmployeeDao {

	Boolean save(Employee e);

	Employee findById(int id);

	boolean update(Employee e, Project p);

	List<Employee> findAlById();

}
