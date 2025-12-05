package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.demo.beans.Course;
import com.demo.beans.Student;

public class TestGetData {
    public static void main(String[] args) {
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session session = sf.getCurrentSession();
        Transaction tr = session.beginTransaction();

        System.out.println("before get");
        Course c = session.get(Course.class, 12);

        System.out.println("after get");
        System.out.println("-----------------------");
        System.out.println(c);  

        System.out.println("before get student");
        Student s = session.load(Student.class, 3);
        System.out.println("after get student");
        System.out.println(s);

        tr.commit();
        sf.close();
    }
}
