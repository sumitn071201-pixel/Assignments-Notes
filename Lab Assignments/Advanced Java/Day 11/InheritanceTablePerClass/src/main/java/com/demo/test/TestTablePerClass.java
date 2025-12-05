package com.demo.test;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.NonPerishable;
import com.demo.beans.Perishable;
import com.demo.beans.Product;

public class TestTablePerClass {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session= sf.openSession();
		Transaction tr= session.beginTransaction();
		Product p2=new Product(10,"Cookies",23,45,LocalDate.of(2020,05,05));
		Product p=new Perishable(11,"Bread",24,34,LocalDate.of(2025, 12, 10),LocalDate.of(2025,12,11));
		Product p1=new NonPerishable(12,"Milk",15,24,LocalDate.of(2025, 12, 10), 10);
	
	session.save(p2);
	session.save(p);
	session.save(p1);
	tr.commit();
	session.close();
	sf.close();
  }
}
