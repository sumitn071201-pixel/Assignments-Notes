package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.entity.Employee;
import com.demo.entity.Project;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;
import com.demo.service.ProjectService;
import com.demo.service.ProjectServiceImpl;

public class TestEmplProject {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		ProjectService pService = new ProjectServiceImpl();
		EmployeeService eService = new EmployeeServiceImpl();
		
		do{
			System.out.println("1)Add new Employee");
			System.out.println("2)Add new project");
			System.out.println("3)find Employee");
			System.out.println("4)find project");
			System.out.println("5)Assign project to employee");
			System.out.println("6)find All employees Assocuiated with a project");
			System.out.println("7)find all Employees");
			System.out.println("8)find all project");
			System.out.println("9)Exit");
			System.out.println("Enter your choice:");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:{
				Boolean status = eService.registerNewEmployee();
				if(status) {
					System.out.println("Employee Registerd successfully.");
				}else {
					System.out.println("Error to register employee.");
				}
				break;
			}
			
			case 2:{
				Boolean status = pService.registerNewProject();
				if(status) {
					System.out.println("Project Registerd successfully.");
				}else {
					System.out.println("Error to register project.");
				}
				break;
			}
			
			case 3:{
				System.out.println("Enter Emplyee Id..");
				int id = sc.nextInt();
				Employee e = eService.findEmpById(id);
				if(e!=null) {
					System.out.println(e);
				}else {
					System.out.println("Emplyee not found.");
				}
				break;
			}
			
			case 4:{
				System.out.println("Enter Project Id..");
				int id = sc.nextInt();
				Project p = pService.findEmpById(id);
				if(p!=null) {
					System.out.println(p);
				}else {
					System.out.println("Emplyee not found.");
				}
				break;
			}
			
			case 5:{
				System.out.println("Enter Project Id..");
				int pid = sc.nextInt();
				System.out.println("Enter Emplyee Id..");
				int eid = sc.nextInt();
				Employee e = eService.findEmpById(eid);
				Project p = pService.findEmpById(pid);
				if(e==null) {
					System.out.println("Employee does Not exist");
					break;
				}
				if(p==null) {
					System.out.println("project does Not exist");
					break;
				}
				boolean status = eService.AssignProjectToEmployee(e , p);
				if(status) {
					System.out.println("Project assigned  to employee sucessfully");
				}else {
					System.out.println("Error to assign the project to employee");
				}
				break;
			}
			
			case 6:{
				System.out.println("Enter Project Id..");
				int id = sc.nextInt();
				List<Employee> elist = pService.findAllEmpByProjectId(id);
				if(elist!=null) {
					System.out.println(elist);
				}else {
					System.out.println("projext not found.");
				}
				break;
			}
			
			case 7:{
				List<Employee> elist = eService.findAllEmployees();
				if(elist!=null) {
					System.out.println(elist);
				}else {
					System.out.println("Employees not found.");
				}
				break;
			}
			
			case 8:{
				List<Project> plist = pService.findAllProjects();
				if(plist!=null) {
					System.out.println(plist);
				}else {
					System.out.println("project not found.");
				}
				break;
			}
			
			default:{
				System.out.println("please Enter a valid choice....");
			}
			
			
			}
			
		}while(choice!=9);
	}
}
