package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.entity.Course;
import com.demo.entity.Faculty;

public class TestGetData {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		System.out.println("before get");
		Course c1=session.get(Course.class, 1);
		Faculty a1=session.get(Faculty.class, 2); 
		session.save(a1);
		session.save(c1);
		System.out.println("after get");
		
		tr.commit();
		System.out.println(c1);
		System.out.println(a1);
		System.out.println(c1.getFaculty());
	   
		session.close();
		sf.close();
		

	}

}
