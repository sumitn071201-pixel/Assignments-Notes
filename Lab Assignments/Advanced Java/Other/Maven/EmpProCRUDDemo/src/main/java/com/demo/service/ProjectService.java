package com.demo.service;

import java.util.List;

import com.demo.beans.Employee;
import com.demo.beans.Project;

public interface ProjectService{

	Boolean registerNewProject();

	Project findEmpById(int id);

	List<Employee> findAllEmpByProjectId(int id);

	List<Project> findAllProjects();

}
