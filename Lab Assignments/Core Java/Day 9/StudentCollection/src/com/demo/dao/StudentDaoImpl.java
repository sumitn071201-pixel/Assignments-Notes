package com.demo.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.demo.beans.Student;

public class StudentDaoImpl implements StudentDao {
	static List<Student> slist;
	static {
		slist=new ArrayList<>();
		slist.add(new Student(100,"Manjiri",80,87,LocalDate.of(2024, 11, 12)));
		slist.add(new Student(101,"Gauri",87,67,LocalDate.of(2024, 12, 23)));
		slist.add(new Student(102,"Kanchan",56,90,LocalDate.of(2024, 11, 24)));
		}

	@Override
	public boolean save(Student s) {
		slist.add(s);
		return true;
	}

	@Override
	public List<Student> findAll() {
		return slist;
	}

	@Override
	public Student findById(int id) {
		int pos=slist.indexOf(new Student(id));
		if(pos!=-1) {
			return slist.get(pos);
		}
		return null;
	}

	@Override
	public List<Student> findByName(String nm) {
		List<Student> temp=slist.stream().filter(stu->stu.getName().equals(nm)).collect(Collectors.toList());
		if(temp.size()>0) {
			return temp;
		}
		return null;
	}

	@Override
	public boolean modifyById(int id, float m1) {
		int pos=slist.indexOf(new Student(id));
		if(pos!=-1) {	
			Student s=slist.get(pos);
			s.setM1(m1);
		}
		return true;
	}

	@Override
	public boolean removeById(int id) {
		return slist.remove(new Student(id));
	}
	public List<Student> findByMarks(float m1){
		List<Student> lst = slist.stream()
				.filter(stu->stu.getM1()>m1)
				.collect(Collectors.toList());
		if(lst.size()>0) {
			return lst;
		}
		return null;
	}
	

	@Override
	public List<Student> sortById() {
	    List<Student> lst = new ArrayList<>();
	    for (Student s : slist) {
	        lst.add(s);
	    }

	    Comparator<Student> c = (o1, o2) -> {
	        System.out.println("In Functional Comparator");
	        if (o1.getId() > o2.getId()) return 1;
	        else if (o1.getId() < o2.getId()) return -1;
	        else return 0;
	    };

	    lst.sort(c);
	    return lst;
	}


	@Override
	public List<Student> sortByName() {
		List<Student> lst=new ArrayList<>();
		for(Student s:slist) {
			lst.add(s);
		}
		Comparator<Student> c=(o1,o2)->{
			System.out.println("In Functional Comparator");
			return o1.getName().compareTo(o2.getName());
		};
		lst.sort(c);
		return lst;
	}


	@Override
	public List<Student> sortByMarks1() {
		List<Student> lst=new ArrayList<>();
		for(Student s:slist) {
			lst.add(s);
		}
		lst.sort(null);
		return lst;
	}
		
	}


