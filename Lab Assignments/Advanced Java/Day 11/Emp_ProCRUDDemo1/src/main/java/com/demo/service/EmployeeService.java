package com.demo.service;

import java.util.List;

import com.demo.beans.Employee;
import com.demo.beans.Project;

public interface EmployeeService {

	Boolean registerNewEmployee();

	Employee findEmpById(int id);

	boolean AssignProjectToEmployee(Employee e, Project p);

	List<Employee> findAllEmployees();

}
