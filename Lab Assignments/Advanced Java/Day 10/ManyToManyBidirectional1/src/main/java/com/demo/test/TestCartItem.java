package com.demo.test;

import com.demo.beans.*;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestCartItem {

	public static void main(String[] args) {
	SessionFactory sf=new Configuration().configure().buildSessionFactory();
	Session session=sf.openSession();
	Transaction tr=session.beginTransaction();

	Item i1= new Item(1,"abc",1200, 10);
	Item i2= new Item(2,"c",4400, 7);
	Item i3= new Item(3,"d",2200, 23);
	Item i4= new Item(4,"ac",550, 34); 
	

	List<Item>cart1=new ArrayList<Item>();
	cart1.add(i1);
	cart1.add(i2);
	cart1.add(i3);
	
	List<Item>cart2=new ArrayList<Item>();
	cart2.add(i1);
	cart2.add(i2);
	cart2.add(i4);
	
	List<Item>cart3=new ArrayList<Item>();
	cart3.add(i2);
	cart3.add(i3);
	cart3.add(i4);
	 
	Cart c1= new Cart(1,cart1);
	Cart c2= new Cart(2,cart2);
	Cart c3= new Cart(3,cart3);
	
//	List<Cart> ilist1=new ArrayList<Cart>();
//	ilist1.add(c1);
//	ilist1.add(c2);
	
	
	session.save(i1);
	session.save(i2);
	session.save(i3);
	session.save(i4);
	
	session.save(c1);
	session.save(c2);
	session.save(c3);
	
	
	tr.commit();
	session.close();
	sf.close();

	}

}
