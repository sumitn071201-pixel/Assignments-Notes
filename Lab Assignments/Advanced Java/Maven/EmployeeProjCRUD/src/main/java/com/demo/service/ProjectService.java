package com.demo.service;

import java.util.List;

import com.demo.entity.Employee;
import com.demo.entity.Project;

public interface ProjectService{

	Boolean registerNewProject();

	Project findEmpById(int id);

	List<Employee> findAllEmpByProjectId(int id);

	List<Project> findAllProjects();

}
