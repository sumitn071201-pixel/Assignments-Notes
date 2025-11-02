package com.demo.test;

import java.util.Scanner;
import java.util.List;
import java.util.Set;

import com.demo.beans.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;

public class TestEmployeeSetDetails {
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	EmployeeService eservice=new EmployeeServiceImpl();
	int choice=0;
	do {
		System.out.println("1.Add new Employee\n2.Display all\n3.Search by Id");
	}