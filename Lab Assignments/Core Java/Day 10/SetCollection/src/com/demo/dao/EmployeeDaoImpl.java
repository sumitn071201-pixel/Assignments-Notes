package com.demo.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import com.demo.beans.Employee;

public class EmployeeDaoImpl implements EmployeeDao{
	static Set<Employee> eset;
	static {eset=new HashSet<>();
		eset.add(new Employee(105,"Amit",57565,LocalDate.of(2023, 11, 02)));
		eset.add(new Employee(109,"Ajay",56565,LocalDate.of(2024,10,11)));
		eset.add(new Employee(107,"Arti",46576,LocalDate.of(2024, 02,23)));
		eset.add(new Employee(110,"Anita",76789,LocalDate.of(2023,06, 28)));
		eset.add(new Employee(108,"Ajay",56565,LocalDate.of(2023, 04, 07)));
		
	}
	@Override
	public boolean save(Employee e) {
		return eset.add(e);
	}
	@Override
	public Set<Employee> findAll() {
		return eset;
	}
	@Override
	public Employee findById(int id) {
		for(Employee e:eset) {
			if(e.getEmpid()==id) {
				return e;
			}
		}return null;
		
	}
	@Override
	public Set<Employee> findByName(String nm) {
		Set<Employee> es=eset.stream().filter(e->e.getEname().equals(nm)).collect(Collectors.toSet());
		if(es.size()>0) {
			return es;
		}
		return null;
	}
	@Override
	public boolean updateBySal(int id, double sal) {
		Employee e=findById(id);
		if(e!=null) {
			e.setSal(sal);
			return true;
		}
		return false;
	}
	@Override
	public boolean removeById(int id) {
		return eset.remove(new Employee(id));
	}
	@Override
	public boolean removeBySal(double sal) {
		return eset.removeIf(e->e.getSal()>sal);   
	}
	@Override
	public Set<Employee> findBySal(double sal) {
		Set<Employee> es = eset.stream().filter(e->e.getSal()>sal).collect(Collectors.toSet());
		if(es.size()>0) {
			   return es;
		   }return null;
			
	}
	@Override
	public List<Employee> sortBySal() {
		Comparator<Employee> csal=(o1,o2)->{
			System.out.println("In Sal Comprator"+o1.getSal()+"-----"+o2.getSal());
			return (int)(o1.getSal()-o2.getSal());
		};
		List<Employee> elist=new ArrayList<>();
		for(Employee e:eset) {
			elist.add(e);
		}
		elist.sort(csal);
		return elist;
	}
	@Override
	public List<Employee> sortByName() {
		Comparator<Employee> c=(o1,o2)->{
			System.out.println("In Name Comparator"+o1.getEname()+"-----"+o2.getEname());
			return o1.getEname().compareTo(o2.getEname());
		};
		List<Employee> elist=new ArrayList<>();
		for(Employee e:eset) {
			elist.add(e);
		}
		elist.sort(c);
		return elist;
	}
	@Override
	public Set<Employee> sortById() {
		Set<Employee> tset=new TreeSet<>();
		for(Employee e:eset) {
			tset.add(e);
		}
		return tset;
	}

}
