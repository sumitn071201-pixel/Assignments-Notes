package com.demo.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;
import com.demo.entity.Employee;
import com.demo.entity.Project;

public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeDao eDao ;
    
    public EmployeeServiceImpl() {
    	eDao = new EmployeeDaoImpl();
    }

	@Override
	public Boolean registerNewEmployee() {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter employee name.");
			String name = sc.next();
			System.out.println("Enter employee salary.");
			double salary = sc.nextDouble();
			System.out.println("Enter employee hire date in format (dd/mm/yyyy).");
			String dt = sc.next();
			LocalDate hiredate = LocalDate.parse(dt , DateTimeFormatter.ofPattern("dd/MM/yyyy"));
			Employee e = new Employee(name , salary , hiredate);
			return eDao.save(e);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return false;
	}

	@Override
	public Employee findEmpById(int id) {
		return eDao.findById(id);
	}

	@Override
	public boolean AssignProjectToEmployee(Employee e, Project p) {
		return eDao.update(e , p);
	}

	@Override
	public List<Employee> findAllEmployees() {
		return eDao.findAlById();
	}
}
