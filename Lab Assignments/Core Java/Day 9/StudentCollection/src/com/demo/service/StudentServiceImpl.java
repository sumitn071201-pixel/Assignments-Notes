package com.demo.service;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import com.demo.beans.Student;
import com.demo.dao.StudentDao;
import com.demo.dao.StudentDaoImpl;

public class StudentServiceImpl implements StudentService{
private StudentDao sdao;
public StudentServiceImpl() {
	sdao=new StudentDaoImpl();
}

	@Override
	public boolean addNewStudent() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id ");
		int id=sc.nextInt();
		System.out.println("enter name ");
		String nm=sc.next();
		System.out.println("enter marks1 ");
		float m1=sc.nextFloat();
		System.out.println("enter marks2 ");
		float m2=sc.nextFloat();
		System.out.println("birth date (dd/mm/yyyy)");
		String dt=sc.next();
		LocalDate ldt=LocalDate.parse(dt,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		Student s =new Student(id,nm,m1,m2,ldt);
		return sdao.save(s);
		
		
	}

	@Override
	public List<Student> displayAll() {
		return sdao.findAll();
	}

	@Override
	public Student searchById(int id) {
		return sdao.findById(id);
	}

	@Override
	public List<Student> findByName(String nm) {
		return sdao.findByName(nm);
	}

	@Override
	public boolean updateById(int id, float m1) {
	
		return sdao.modifyById(id,m1);
	}

	@Override
	public boolean deleteById(int id) {
		return sdao.removeById(id);
	}

	@Override
	public List<Student> searchByMarks1(float m1) {
		
		return sdao.findByMarks(m1);
	}

	@Override
	public List<Student> sortById() {
		return sdao.sortById();
	}

	@Override
	public List<Student> sortByName() {
		return sdao.sortByName();
	}

	@Override
	public List<Student> sortByMarks1() {
		return sdao.sortByMarks1();
	}

}
