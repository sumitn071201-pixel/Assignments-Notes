package com.demo.test;

import com.demo.search.SearchingService;

public class TestSearch {

	public static void main(String[] args) {
		int[] arr = {10,5,4,7,8,3,2,15};
		
		int pos= SearchingService.sequentialSearch(arr, 7);
			if(pos!=-1)
			{
				System.out.println("Number found at position: " +pos);
			}	
			else 
			{
				System.out.println("Not Found");
			}
		int [] arr1= {12,13,16,23,27,45,56,58,62,65,70};
		pos=SearchingService.binarySearchNonRecursive(arr1, 15);
			
			if(pos!=-1) 
			{
				System.out.println("Binary search number found at position: "+ pos);
			}
			else
			{
				System.out.println("Binary search number not found");
			}
		          pos=SearchingService.binarySearchRecursive(arr1, 15, 0 ,10 );
			if(pos!=-1)
			{
				System.out.println("Binary search number found at position: " +pos);
			}
			else 
			{
				System.out.println("Binary search number not found");
			}
			}
	}


