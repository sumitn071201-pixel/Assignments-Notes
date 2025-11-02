package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Student;
import com.demo.service.StudentService;
import com.demo.service.StudentServiceImpl;


public class TestStudent {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StudentService stservice=new StudentServiceImpl();
		int choice = 0;
		do {
			System.out.println("1. add new student \n2. display all\n3. search by id");
			System.out.println("4. search by name\n5. update m1\n6.delete by id\n7. delete by avgmarks\n ");
			System.out.println("8. search by marks1\n9. sort by id\n10. sort by name \n11.sort by m1 \n12.exit\n choice:");
			choice =sc.nextInt();
			switch(choice) {
			case 1->{
				boolean status=stservice.addNewStudent();
				if(status) {
					System.out.println("Added Successfully!");
				}
				else {
					System.out.println("Not Found");
				}
				
			}
			case 2->{
				List<Student>slist=stservice.displayAll();
				slist.forEach(System.out::println);
			}
			
			case 3->{
				System.out.println("Enter id for search ");
				int id=sc.nextInt();
				Student s=stservice.searchById(id);
				if(s!=null) {
					System.out.println(s);
				}else {
					System.out.println("Not Found");
				}
			}
			case 4->{
				System.out.println("Enter name for search");
				String nm=sc.next();
				List<Student> slst=stservice.findByName(nm);
				if(slst!=null) {
					slst.forEach(System.out::println);
				}else {
					System.out.println("Not Found");
				}
			}
			case 5->{
				System.out.println("Enter id for search");
				int id=sc.nextInt();
				System.out.println("Enter marks1");
				float m1=sc.nextFloat();
				boolean status=stservice.updateById(id,m1);
				if(status) {
					System.out.println("Updated successfully");
				}else {
					System.out.println("Not Found");
				}
			}
			case 6->{
				System.out.println("Enter id for delete");
				int id=sc.nextInt();
				boolean status=stservice.deleteById(id);
				if(status) {
					System.out.println("Delete successfully");
				}
				else
				{
					System.out.println("Not Found");
				}
			}
			case 8->{
				System.out.println("Enter marks1 for searching");
				float m1=sc.nextFloat();
				List<Student> slst=stservice.searchByMarks1(m1);
				if(slst!=null) {
					slst.forEach(System.out::println);
				}
				else {
					System.out.println("Not Found");
				}
			}
			case 9->{
				List<Student> slst=stservice.sortById();
				slst.forEach(System.out::println);
				
			}
			case 10->{
				List<Student> slst=stservice.sortByName();
				slst.forEach(System.out::println);
				
			}
			case 11->{
				List<Student> slst=stservice.sortByMarks1();
				slst.forEach(System.out::println);
				
			}
			case 12->{
				System.out.println("Thankyou for visiting ...");
				sc.close();
			}
			
			default ->{
				System.out.println("Wrong Choice..");
			}
			
			}
	}while(choice!=12);

}
}
