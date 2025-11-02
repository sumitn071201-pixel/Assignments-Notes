package com.demo.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.demo.beans.*;



public class EmployeeService {
	 static Employee[] emparr;
	   static int count;
	   static {
		   emparr=new Employee[100];
		   emparr[0]=new SalariedEmp("Rajan",new Date(2000,04,23),"HR","Designer",88888);
	   	   emparr[1]=new SalariedEmp("Revati",new Date(2000,04,23),"UX","Designer",99999);
		   emparr[2]=new ContractEmp("Ameya",new Date(2000,04,23),"HR","Designer",80,3000);
		   emparr[3]=new ContractEmp("Ashu",new Date(2000,04,23),"UX","Designer",80,4000);	
		   emparr[4]=new VendorEmp("Shweta",new Date(2000,04,23),"HR","Designer",90,40000);
		   emparr[5]=new VendorEmp("Shruti",new Date(2000,04,23),"UX","Designer",80,30000);
		   count=6;
	   }
	   public static boolean addNewEmployee(int ch) {
		   Scanner sc=new Scanner(System.in);
		   if(count<emparr.length) {
			   System.out.println("Enter Name:");
			   String nm=sc.next();
			   System.out.println("Enter Birth Date(dd/MM/yyyy)");
			   String bdate=sc.next();
			   SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
			   Date dt=null;
			   try {
				   dt=sdf.parse(bdate);
			   }catch(ParseException e) {
				   e.printStackTrace();
			   }
			   System.out.println("Enter Department:");
			   String dept=sc.next();
			   
			   System.out.println("Enter Designation"); 
			   String desg=sc.next();
			   
			   if(ch==1) {
				   System.out.println("Enter Salary:");
				   double sal=sc.nextDouble();
				   emparr[count]=new SalariedEmp(nm,dt,dept,desg,sal);
				   count++;
			   }
			   else if(ch==2) {
				   System.out.println("Enter hrs:");
				   float hrs=sc.nextFloat();
				   System.out.println("Enter Charges:");
				   double charges=sc.nextDouble();
				   emparr[count]=new ContractEmp(nm,dt,dept,desg,hrs,charges);
				   count++;
			   }
			   else {
				   System.out.println("Enter No of Employees:");
				   int noOfEmployees=sc.nextInt();
				   System.out.println("Ente Amount");
				   double amount =sc.nextDouble();
				   emparr[count]=new VendorEmp(nm,dt,dept,desg,noOfEmployees,amount);
				   count++;
			   }return true;
		   }
		   return false;
		   
	   }
	   public static void displayAll() {
		   for(Employee emp:emparr) {
			   if(emp != null) {
				   System.out.println(emp);
			   }
		   }
	   }
	   
	   public static void displayOnlySalariedEmp() {
		   for(Employee emp:emparr) {
			   if(emp != null && emp instanceof SalariedEmp) {
				   System.out.println(emp);
			   }
		   }
	   }
	   
	   public static void displayOnlyContractEmp() {
		   for(Employee emp:emparr) {
			   if(emp != null && emp instanceof ContractEmp) {
				   System.out.println(emp);
			   }
		   }
	   }
	   public static void displayOnlyVendorEmp() {
		   for(Employee emp:emparr) {
			   if(emp != null && emp instanceof VendorEmp) {
				   System.out.println(emp);
			   }
		   }
	   }
	   
	   public static Employee searchById(String id) {
		   for(Employee emp:emparr) {
			   if(emp != null && (emp.getPid().equals(id))) {
				   return emp;
			   }
		   }return null;
	   }
	   
	   public static boolean modifyById(String id,double charges) {
		   Employee emp=searchById(id);
		   if(emp != null ) {
			   if(emp instanceof SalariedEmp) {
			   ((SalariedEmp)(emp)).setSal(charges);
		   }
		
			   else if(emp instanceof ContractEmp) {
			   ((ContractEmp)(emp)).setCharges(charges);
		   }
			   else {
			   ((VendorEmp)(emp)).setAmount(charges);
		   }return true;
		   
	   }return false;
	}
}
