package com.demo.test;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.demo.service.CourseService;
import com.demo.service.CourseServiceImpl;

public class TestCourse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CourseService cservice = new CourseServiceImpl();
		int choice = 0;
		do {
			System.out.println("1.Add New Course \n2. Display All \n3. Find by Course Name\n ");
			System.out.println("4. Modify Course Capacity \n5. Find By Course Capacity \n6. Modify Course Name\n");
			System.out.println("7. Display in Sorted Order of Key \n8. Display in Sorted Order of Value\n");
			System.out.println("9. Delete By Course Name \n10. Delete By Capacity \n.11 exit \n choice:");
			choice = sc.nextInt();
			switch(choice) {
			case 1->{
			boolean status = cservice.addNewCourse();
			if(status) {
				System.out.println("New Course Added!");
			}else {
					System.out.println("Duplicate Name");
				}
			}
			
			case 2->{
				Map<String,Integer> cmap=cservice.displayAll();
				Set<String> keys = cmap.keySet();
				keys.forEach(e->System.out.println(e+"----->"+cmap.get(e)));
				}
						
			case 3->{
				System.out.println("Enter Course Name:");
				String cname = sc.next();
				int capacity = cservice.searchByName(cname);
				if(capacity !=-1) {
					System.out.println("Course Name:"+cname+"Capacity:"+capacity);
				}else {
					System.out.println("Not Found");
				}
			}
			
			case 4->{
				System.out.println("Enter Course Name:");
				String cname = sc.next();
				System.out.println("Enter Course New Capacity");
				int newcap = sc.nextInt();
				boolean status = cservice.modifyByName(cname,newcap);
				if(status) {
					System.out.println("Modification Done!");
				}else {
					System.out.println("Not Found!");
				}	
			}
			
			case 5->{
				System.out.println("Enter Capacity: ");
				int capacity = sc.nextInt();
				Set<String> cset = cservice.displayByCapacity(capacity);
				if(cset!=null) {
					cset.forEach(System.out::println);
				}else {
					System.out.println("Not Found");
				}
			}
			
			case 6->{
			System.out.println("Enter old course name ");
			String oname=sc.next();
			System.out.println("Enter new course name");
			String nname=sc.next();
			boolean status=cservice.modifyCourseName(oname,nname);
			if(status) {
				System.out.println("Modification Done");
			}else
			{
				System.out.println("Not Found");
			}
				
			}	
			case 7->{
				Map<String ,Integer> cmap=cservice.sortByNmae();
				Set<String> keys=cmap.keySet();
				keys.forEach(e->System.out.println(e+"--->"+cmap.get(e)));
				
			}
			
			case 8->{
				Set<Map.Entry<String, Integer>> eset=cservice.sortByCapacity();
				eset.forEach(e->System.out.println(e.getKey()+"--->"+e.getValue()));
				
			}
			
			case 9->{
				System.out.println("Enter course name");
				String cname =sc.next();
				boolean status=cservice.deleteByName(cname);
				if(status) {
					System.out.println("Deleted Successfully");
				}else {
						System.out.println("Not Found");
					}
				}
				
			
			
			case 10 ->{
				System.out.println("Enter Capacity");
				int capacity=sc.nextInt();
				boolean status=cservice.deleteByCapacity(capacity);
				if(status) {
					System.out.println("Deleted Successfully");
				}else {
						System.out.println("Not Found");
					}
				}
			
			case 11->{
				sc.close();
				System.out.println("Thankyou for visiting...");
			}
			
			default ->{
				System.out.println("Wrong Choice");
			}
		}
			
			}while(choice!=11);
		
	

		}
	}
