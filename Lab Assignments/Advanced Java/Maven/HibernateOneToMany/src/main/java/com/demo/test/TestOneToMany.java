package com.demo.test;

import com.demo.beans.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestOneToMany {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		Course c1= new Course(3,"java",1.3f);
		Course c2= new Course(4,"hr",2.5f);
	    Student s1=new Student(7,"sakshi","abc@gmail.com",c1);
		Student s2=new Student(8,"sakshi","abc@gmail.com",c2);
		Student s3=new Student(9,"sakshi","abc@gmail.com",c1);
		Student s4=new Student(10,"sakshi","abc@gmail.com",c2);
		
		session.save(s1);
		session.save(s2);
		session.save(s3);
		session.save(s4);
		tr.commit();
		session.close();
		sf.close();
		
		}

}
