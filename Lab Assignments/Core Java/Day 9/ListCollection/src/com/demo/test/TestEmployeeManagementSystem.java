package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;

public class TestEmployeeManagementSystem {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EmployeeService eservice=new EmployeeServiceImpl();
		int choice = 0;
		do {
			System.out.println("1. add new employee \n2. display all\n3. search by id");
			System.out.println("4. search by name\n5. update sal\n6.delete by id\n7. delete by salary\n ");
			System.out.println("8. search by salary\n9. sort by salary\n10. sort by name \n11. exit\n choice:");
			choice =sc.nextInt();
			switch(choice) {
			case 1->{
				boolean status=eservice.addNewEmployee();
				if(status) {
					System.out.println("added successfully!");
				}else {
					System.out.println("not found");
				}
			}
			case 2->{
				List<Employee> elist=eservice.displayAll();
				elist.forEach(System.out::println);
			}
			case 3->{
				System.out.println("enter id for search");
				int eid=sc.nextInt();
				Employee e=eservice.searchById(eid);
				if(e!=null) {
					System.out.println(e);
				}else {
					System.out.println("not found");
				}
			}
			case 4->{
				System.out.println("enter name for searching");
				String nm=sc.next();
				List<Employee> elst=eservice.findByName(nm);
				if(elst!=null) {
					elst.forEach(System.out::println);
				}else {
					System.out.println("not found");
				}
			}
			
			case 5 ->{
				System.out.println("enter id for search");
				int eid=sc.nextInt();
				System.out.println("enter sal");
				double sal=sc.nextDouble();
				boolean status=eservice.updateById(eid,sal);
				if(status) {
					System.out.println("updated successfully!");
				}else {
					System.out.println("not found");
				}
			}
			case 6->{
				System.out.println("enter id for delete");
				int eid=sc.nextInt();
				boolean status=eservice.deleteById(eid);
				if(status) {
					System.out.println("delete succesfully");		
				}
			else {
				 System.out.println("not found");
			}
		}
			case 7->{
				System.out.println("enter salary for delete");
				double sal=sc.nextDouble();
				boolean status=eservice.deleteBySal(sal);
				if(status) {
					System.out.println("delete successfully");
				}else {
					System.out.println("not found");
				}
				
			}
			case 8->{
				System.out.println("enter salary for searching");
				double sal=sc.nextDouble();
				List<Employee> elst=eservice.searchBySal(sal);
				if(elst!=null) {
					elst.forEach(System.out::println);
				}else {
					System.out.println("not found");
				}
					
				
			}
			case 9->{
				List<Employee> lst=eservice.sortBySal();
				lst.forEach(System.out::println);
			}
			case 10->{
				List<Employee> lst=eservice.sortByName();
				lst.forEach(System.out::println);
			}
			case 11->{
				sc.close();
				System.out.println("Thankyou for visiting ...");
				
			}
			
			default->{
				System.out.println("wrong choice");
			}
			
			}
		}while(choice!=11);
		
	}

}
