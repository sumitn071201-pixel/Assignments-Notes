package com.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.bean.HelloWorld;
import com.demo.bean.Student;

public class TestApplication {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Student s = (Student) context.getBean("s1");
		
		System.out.println(s);
		
		((ClassPathXmlApplicationContext)context).close();
	}

}
