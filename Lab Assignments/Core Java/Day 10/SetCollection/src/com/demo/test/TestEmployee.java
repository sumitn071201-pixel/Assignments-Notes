package com.demo.test;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.demo.beans.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;

public class TestEmployee {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EmployeeService eservice=new EmployeeServiceImpl();
		int choice=0;
		do {
			System.out.println("1. add new employee\n 2. display all\n3. search by id");
			System.out.println("4. Search by name\n 5. update sal\n6. delete by id\n7. delete by salary\n");
			System.out.println("8. search by salary \n 9. sort by salary\n10. Sort By name\n 11. Sort By id\n12. exit\n choice: ");
			choice=sc.nextInt();
			switch(choice) {
			case 1->{
				boolean status=eservice.addNewEmployee();
				if(status) {
					System.out.println("Added Successfully!");
				}
				else {
					System.out.println("Duplicate id, Not Added");
				}
				
			}
			
			case 2->{
				Set<Employee> eset=eservice.displayAll();
				eset.forEach(System.out::println);
				
			}
			
			case 3->{
				System.out.println("Enter Id:");
				int id=sc.nextInt();
				Employee e=eservice.displayById(id);
				if(e!=null) {
					System.out.println(e);
				}
				else {
					System.out.println("Not Found");
				}
				
			}
			
			case 4->{
				System.out.println("Enter Name:");
				String nm=sc.next();
				Set<Employee> eset=eservice.displayByName(nm);
				if(eset !=null) {
					eset.forEach(System.out::println);
				}else {
					System.out.println("Not Found");
				}
				
			}
			
			case 5->{
				System.out.println("Enter Id:");
				int id=sc.nextInt();
				
				System.out.println("Enter Sal:");
				double sal=sc.nextDouble();
				
				boolean status =eservice.updateBySal(id,sal);
				if(status) {
					System.out.println("Updated Successfully!");
				}
				else {
					System.out.println("Not Found");
				}
				
			}
			
			case 6->{
				System.out.println("Enter id to Delete");
				int id = sc.nextInt();
				boolean status =eservice.deleteById(id);
				if(status) {
					System.out.println("Deleted Successfully");
					
				}
				else {
					System.out.println("Not Found");
				}
				
				
			}
			
			case 7->{
				System.out.println("Enter Salary:");
				double sal=sc.nextDouble();
				boolean status = eservice.deleteBySal(sal);
				if(status) {
					System.out.println("Deleted Successfully");
				}
				else {
					System.out.println("Not Found");
				}
				
			}
			
			case 8->{
				System.out.println("Enter Salary:");
				double sal=sc.nextDouble();
				Set<Employee> eset=eservice.displayBySal(sal);
				if(eset !=null) {
					eset.forEach(System.out::println);
				}else {
					System.out.println("Not Found");
				}
			}
			
			case 9->{
				List<Employee> elist=eservice.sortBySal();
				elist.forEach(System.out::println);
				
			}
			
			case 10->{
				List<Employee> elist=eservice.sortByName();
				elist.forEach(System.out::println);
				
			}
			
			case 11->{
				Set<Employee> elist=eservice.sortById();
				elist.forEach(System.out::println);
			}
		
			case 12->{
				System.out.println("ThankYou for visiting!");
				sc.close();
			}
			
			default ->{
				System.out.println("Wrong Choice..");
			}
			
			}
		}while(choice!=12);
		
	}

}
