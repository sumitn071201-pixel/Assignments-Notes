package com.demo.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.demo.entity.Employee;
import com.demo.entity.Project;

import java.util.*;

public class EmployeeDaoImpl implements EmployeeDao{
	private static SessionFactory sf ;
	
	static {
		sf = HibernateConfigUtil.getMySessionFactory();
	}

	@Override
	public Boolean save(Employee e) {
		try {
			Session session = sf.openSession();
			Transaction tr = session.beginTransaction();
			session.save(e);
			tr.commit();
			session.close();
			return true;
		}catch (Exception err) {
			System.out.println(err.getMessage());
		}
		return false;
	}

	@Override
	public Employee findById(int id) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Employee e= session.get(Employee.class , id);
		tr.commit();
		session.close();
		return e;
	}

	@Override
	public boolean update(Employee e, Project p) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		e.getProjects().add(p);
		session.saveOrUpdate(e);
		tr.commit();
		session.close();
		return true;
	}

	@Override
	public List<Employee> findAlById() {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		List<Employee> elist= session.createQuery("from Employee" , Employee.class).getResultList();
		tr.commit();
		session.close();
		return elist;
	}
}
