package com.demo.search;

public class SearchingService 
{
	public static int sequentialSearch(int [] arr, int search )
	{
		for (int i= 0; i<arr.length; i ++)
		{
			if(arr[i]==search)
			{
				return i;
				
			}
		}
		return -1;
	}
	
	public static int binarySearchNonRecursive(int[] arr, int search)
	{
		int low =0;
		int high=arr.length-1;
		int cnt=0;
		
		while (low<=high) 
		{
			int mid= (low+high)/2;
			cnt++;
			if (arr[mid]==search) 
			{ 
				System.out.println("Comparison are: " +cnt);
				return mid;
			}
				
				if(search<arr[mid])
				{
					high = mid-1;
				}	else 
					{
						low=mid+1;
					}
		}
		System.out.println("Comparison are: "+ cnt);
		return -1;
	}
	
	public static int binarySearchRecursive(int[]arr , int search, int low, int high)
	{
		System.out.println("Binary Search called" +low+"--------"+high);
		
		if(low<=high)
		{
			int mid=(low+high)/2;
			if (arr[mid]==search)
			{
				return mid;
			}	else if(search < arr[mid])
				{
					return binarySearchRecursive(arr, search, low, mid-1);
				}	else
					{
						return binarySearchRecursive(arr, search, mid+1, high);
					}
		}return -1;
	
	
	}
}