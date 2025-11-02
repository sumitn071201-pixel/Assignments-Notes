package com.demo.test;

import java.util.Date;
import java.util.Scanner;

import com.demo.beans.*;


public class TestEmployee {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1. salaried \n 2. contract \n3. vendor");
		int choice=sc.nextInt();
		Employee e1=null;
		Employee e2=null;
		switch(choice) {
		case 1:
			e1=new SalariedEmp("Rajan",new Date(2000,04,23),"HR","Designer",88888);
	    	e2=new SalariedEmp("Arti",new Date(2000,04,23),"UX","Designer",99999);
	    	//System.out. println("net sal= "+e1.calculateSal());
	    	//System.out.println("net sal= "+e2.calculateSal());
	    	
			break;
		case 2:
			e1=new ContractEmp("Mugdha",new Date(2000,04,23),"HR","Designer",80,3000);
	    	e2=new ContractEmp("Tanaya",new Date(2000,04,23),"UX","Designer",80,4000);
	    	//System.out.println("net charges= "+e1.calculateSal());
	    	//System.out.println("net charges= "+e2.calculateSal());
			break;
		
		case 3:
		e1=new VendorEmp("Sakshi",new Date(2000,04,23),"HR","Designer",80,3000);
    	e2=new VendorEmp("Disha",new Date(2000,04,23),"UX","Designer",80,4000);
    	//System.out.println("net charges= "+e1.calculateSal());
    	//System.out.println("net charges= "+e2.calculateSal());
			
		case 4:
			System.out.println("thnak you for visiting....");
			break;
		}
		System.out.println("net Sal= "+e1.calculateSal());
    	System.out.println("net Sal= "+e2.calculateSal());

	}

}
