package com.demo.service;

import java.util.List;
import java.util.Set;

import com.demo.beans.Employee;

public interface EmployeeService {

	boolean addNewEmployee();

	Set<Employee> displayAll();

	Employee displayById(int id);

	Set<Employee> displayByName(String nm);

	boolean updateBySal(int id, double sal);

	boolean deleteById(int id);

	boolean deleteBySal(double sal);

	Set<Employee> displayBySal(double sal);

	List<Employee> sortBySal();

	List<Employee> sortByName();

	Set<Employee> sortById();

}
