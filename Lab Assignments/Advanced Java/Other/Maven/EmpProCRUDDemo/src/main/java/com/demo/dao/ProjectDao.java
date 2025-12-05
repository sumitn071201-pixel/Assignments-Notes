package com.demo.dao;

import java.util.List;

import com.demo.beans.Employee;
import com.demo.beans.Project;

public interface ProjectDao {

	Boolean save(Project p);

	Project findById(int id);

	List<Employee> findAllEmpId(int id);

	List<Project> findAll();

}
