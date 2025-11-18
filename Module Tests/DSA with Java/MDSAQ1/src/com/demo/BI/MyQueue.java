/*wap to implement queue using linked list. implement function for below operations and test the program by accept 10 strings from user and add it in the queue, print the queue, then delete the strings one by one from the queue and display its length
 1. insert element in queue
 2.remove element from queue
 3. print elements of queue
 4.check if queue is full
 5.check if queue is empty*/

package com.demo.BI;

import java.util.Scanner;

public class MyQueue 
{	
	
	private static String a;
	private static int count=0;
	private static String[] arr;
	
	
	public MyQueue(String[] arr, String a, int count) 
	{
		super();
		MyQueue.arr = arr;
		MyQueue.a = a;
		MyQueue.count = count;
	}

	
	//1.add at the beginning of the queue
	public static String[] addElement(String a) 
	{
			 if(count!=arr.length) 
			 {
					for(int i=0; i<=arr.length; i++)
					arr[i]=a;
					count++;
			 }
			return arr;
	}	
	
	//2.Remove element from the queue
	public static String[] removeArrayElement(int n) 
	{	
		System.out.println("Enter the number of elements o remove from queue: " );
		Scanner sc= new Scanner(System.in);
		n =sc.nextInt();
		for(int j=1; j<=n;j++) 
		{
			for(int i=0; i<=arr.length;i++)
			{	
				arr[i]=arr[i+1];
				
			} count--;
		}
		
		System.out.println("The Length of the queue is: " +count);
		
		return arr;
	}
	
	//3.displaying the elements 
		public static String displayData() 
		{
			for(int i=0; i<=arr.length;i++) 
			{
				System.out.println("The Array has Stored the following String" + arr[i]);
			}
			return a;
		}
		
	//4.Check if the queue is empty
		public void isEmpty()
		{
			if (count==0) 
			{
				System.out.println("The Queue is empty");
			}
		}
		
		 
		//5.Check if the queue is full
		public void isFull() 
		{ 
			if(count==arr.length)
			{
			System.out.println("The Queue is full");
			}
		}		
}

