package com.demo.test;

import com.demo.beans.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestGetData {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		Course d=session.get(Course.class, 1);
		Student s=session.get(Student.class, 1);
		Student s1=session.get(Student.class, 2);
		System.out.println(d);
		System.out.println(s);
		System.out.println(s1);
		

	}

}
