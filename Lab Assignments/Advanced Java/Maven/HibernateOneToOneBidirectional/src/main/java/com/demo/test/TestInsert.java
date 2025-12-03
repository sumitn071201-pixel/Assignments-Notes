package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.entity.Course;
import com.demo.entity.Faculty;

public class TestInsert {
	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		
		Faculty f1 = new Faculty(  "abc");
		Faculty f2 = new Faculty(  "asd");
		
		Course c1 = new Course("java" , 56.5f , f1);
		Course c2 = new Course("database" , 56.5f , f2);
		
		session.save(f1);
		session.save(f2);
		session.save(c1);
		session.save(c2);
		tr.commit();
		session.close();
		sf.close();
		
	}
}
