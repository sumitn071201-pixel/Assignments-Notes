package com.demo.dao;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Comparator;
import java.time.LocalDate;

import com.demo.beans.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	static List<Employee> elist;
	static {
		elist=new ArrayList<>();
		elist.add(new Employee(100,"Manjiri",45678,LocalDate.of(2024, 11, 12)));
		elist.add(new Employee(101,"Gauri",55678,LocalDate.of(2023,11,12)));
		elist.add(new Employee(102,"Kanchan",35678,LocalDate.of(2020, 11, 12)));
	}
	public boolean save(Employee e) {
		elist.add(e);
		return true;
	}
	
	public List<Employee> findAll(){
		return elist;
	}
	
	public Employee findById(int eid) {
		int pos=elist.indexOf(new Employee(eid));
		if(pos!=-1) {
			return elist.get(pos);
		}
		return null;
	}
	
	public boolean removeById(int eid) {
		return elist.remove(new Employee(eid));
	}
	
	public List<Employee> findByName(String nm){
		List<Employee> temp=elist.stream().filter(emp->emp.getEname().equals(nm)).collect(Collectors.toList());
		
		if(temp.size()>0) {
			return temp;
		}
		return null;
	}

//	@Override
//	public List<Employee> findBySal(double sal) {
//    List<Employee> temp=elist.stream().filter(emp->emp.getSal()==(sal)).collect(Collectors.toList());
//		
//		if(temp.size()>0) {
//			return temp;
//		}
//		return null;
//	}
	public boolean modifyById(int eid, double sal) {
		int pos=elist.indexOf(new Employee(eid));
		if(pos!=-1) {
				Employee e= elist.get(pos);
				e.setSal(sal);
		return true;
	}
		return false;
	}
	@Override
	public boolean removeBySal(double sal) {
		//return elist.removeIf(e -> e.getSal() == sal);
		return elist.removeIf(emp -> emp.getSal() > sal);
       }
	
	public List<Employee> findBySal(double sal){
		List<Employee> lst = elist.stream()
				.filter(emp -> emp.getSal()==sal)
				.collect(Collectors.toList());
		if(lst.size()>0) {
			return lst;
		}
		return null;
	}
	public List<Employee> sortBySal(double sal){
		List<Employee> lst=new ArrayList<>();
		for(Employee e:elist) {
			lst.add(e);
		}
		
		Comparator<Employee> c=(o1,o2)->{
			System.out.println("In Functional Comparator");
			return o1.getEname().compareTo(o2.getEname());
		};
		lst.sort(c);
		return lst;
	}
	
	
	@Override
	public List<Employee> sortBySal() {
		List<Employee> lst=new ArrayList<>();
		for(Employee e:elist) {
			lst.add(e);
		}
		lst.sort(null);
		return lst;
	}

	@Override
	public List<Employee> sortByName() {
		List<Employee> lst=new ArrayList<>();
		for(Employee e:elist) {
			lst.add(e);
		}
		Comparator<Employee> c=(o1,o2)->{
			System.out.println("In Functional Comparator");
			return o1.getEname().compareTo(o2.getEname());
		};
		lst.sort(c);
		return lst;
	}
	}
	
	

