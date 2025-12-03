package com.demo.dao;

import java.util.List;

import com.demo.entity.Employee;
import com.demo.entity.Project;

public interface ProjectDao {

	Boolean save(Project p);

	Project findById(int id);

	List<Employee> findAllEmpId(int id);

	List<Project> findAll();

}
