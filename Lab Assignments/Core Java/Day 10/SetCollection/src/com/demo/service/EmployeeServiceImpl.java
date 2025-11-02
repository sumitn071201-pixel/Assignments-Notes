package com.demo.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.demo.beans.Employee;
import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService{
	private EmployeeDao edao;

	public EmployeeServiceImpl() {
		super();
		this.edao = new EmployeeDaoImpl();
	}

	@Override
	public boolean addNewEmployee() {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter id:");
		int id=sc.nextInt();
		System.out.println("Enter name:");
		String nm=sc.next();
		System.out.println("Enter salary:");
		double sal=sc.nextDouble();
		System.out.println("Enter date(dd/mm/yyyy):");
		String dt =sc.next();
		LocalDate ldt=LocalDate.parse(dt,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		Employee e = new Employee(id,nm,sal,ldt);
		return edao.save(e);
		}

	@Override
	public Set<Employee> displayAll() {
		return edao.findAll();
	}

	@Override
	public Employee displayById(int id) {
		
		return edao.findById(id);
	}

	@Override
	public Set<Employee> displayByName(String nm) {
		return edao.findByName(nm);
	}

	@Override
	public boolean updateBySal(int id, double sal) {
		return edao.updateBySal(id,sal);
	}

	@Override
	public boolean deleteById(int id) {
		return edao.removeById(id);
	}

	@Override
	public boolean deleteBySal(double sal) {
		return edao.removeBySal(sal);
	}

	@Override
	public Set<Employee> displayBySal(double sal) {
		return edao.findBySal(sal);
	}

	@Override
	public List<Employee> sortBySal() {
		return edao.sortBySal();
	}

	@Override
	public List<Employee> sortByName() {
		return edao.sortByName();
	}

	@Override
	public Set<Employee> sortById() {
		return edao.sortById();
	}
	
}
