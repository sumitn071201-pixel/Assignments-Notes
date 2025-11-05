package com.demo.test;

import com.demo.search.SearchingService1;

public class TestSearch1{

	public static void main(String[] args) {
		String[] arr = {"banana", "apple", "grape", "kiwi", "orange"};
		int pos= SearchingService1.sequentialSearch(arr, "grape");
		if(pos!=-1)
		{
			System.out.println("String found at position: " +pos);
		}	
		else 
		{
			System.out.println("Not Found");
		}
		
	    String [] arr1 = {"apple", "banana", "grape", "kiwi", "orange"};
		    
		pos=SearchingService1.binarySearchNonRecursive(arr1, "apple");
		
		if(pos!=-1) 
		{
			System.out.println("Binary search string found at position: "+ pos);
		}
		else
		{
			System.out.println("Binary search string not found");
		}
	        pos=SearchingService1.binarySearchRecursive(arr1, "orange", 0 ,4);
		if(pos!=-1)
		{
			System.out.println("Binary search string found at position: " +pos);
		}
		else 
		{
			System.out.println("Binary search string not found");
		}
		}
	}


