package com.demo.test;

import java.util.HashSet;
import java.util.Set;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Course;
import com.demo.beans.Student;

public class TestOneToMany {
    public static void main(String[] args) {
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session session = sf.getCurrentSession();
        Transaction tr = session.beginTransaction();

        Course c = new Course(12, "CDAC");
        Course c1 = new Course(13, "AI");

        Student s1 = new Student(1, "Rajan",c);
        Student s2 = new Student(2, "Atharva",c);
        Student s3 = new Student(3, "Manjiri",c1);
        Student s4 = new Student(4, "Vidya", c1);

        Set<Student> set1 = new HashSet<>();
        set1.add(s1);
        set1.add(s2);

        Set<Student> set2 = new HashSet<>();
        set2.add(s3);
        set2.add(s4);

        c.setStudents(set1);
        c1.setStudents(set2);

        session.save(c);
        session.save(c1);
        session.save(s1);
        session.save(s2);
        session.save(s3);
        session.save(s4);

        tr.commit();
        sf.close();
    }
}
