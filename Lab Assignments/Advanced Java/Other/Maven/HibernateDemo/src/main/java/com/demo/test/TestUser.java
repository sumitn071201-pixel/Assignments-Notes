package com.demo.test;
import com.demo.beans.*;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import javax.persistence.Query;



public class TestUser {

	public static void main(String[] args) {
		SessionFactory sf = new  Configuration().configure().buildSessionFactory();
        Session session=sf.openSession();
        Transaction tr=session.beginTransaction();
         User u1 = new User(1 ,"abc" ,"g");
         User u2 = new User(2,"abc" ,"g");
         User u3 = new User(3 ,"abc" ,"g");
         session.save(u3);
         session.save(u1);
         session.save(u2);
        List<User> users = session.createQuery("from User", User.class).getResultList();
    
    
        tr.commit();
        System.out.println(users);
        session.close();
        sf.close();
        }

}
