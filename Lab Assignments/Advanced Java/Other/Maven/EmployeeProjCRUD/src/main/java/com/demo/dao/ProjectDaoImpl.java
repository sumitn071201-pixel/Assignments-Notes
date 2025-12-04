package com.demo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.demo.entity.Employee;
import com.demo.entity.Project;

public class ProjectDaoImpl implements ProjectDao{
	private static SessionFactory sf ;
	
	static {
		sf = HibernateConfigUtil.getMySessionFactory();
	}

	@Override
	public Boolean save(Project p) {
		try {
			Session session = sf.openSession();
			Transaction tr = session.beginTransaction();
			session.save(p);
			tr.commit();
			session.close();
			return true;
		}catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}

	@Override
	public Project findById(int id) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Project p = session.get(Project.class , id);
		tr.commit();
		session.close();
		return p;
	}

	@Override
	public List<Employee> findAllEmpId(int id) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Project p = session.get(Project.class , id);
		tr.commit();
		session.close();
		if(p!=null) {
			return p.getEmployee();
		}
		return null;
	}

	@Override
	public List<Project> findAll() {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		List<Project> plist = session.createQuery("from Project",Project.class).getResultList();
		tr.commit();
		session.close();
		if(plist!=null) {
			return plist;
		}
		return null;
	}
}
