package com.demo.arrays;

import java.util.Scanner;

public class My2DArray {
	private int[][] arr;
	
	public My2DArray() {
		arr=new int[3][3];	
	}
	
	public My2DArray(int rows ,int cols) {
		arr=new int [rows][cols];
	}
	Scanner sc = new Scanner (System.in);
	public void acceptData() {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
			 
				System.out.println("Enter value " + i + " ,"+  j);
				
			arr[i][j] =sc.nextInt();
				
			}
		}
		
	}
	public void displayData() {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
			 	System.out.print(arr[i][j] + "\t");
				
			}
			System.out.println();
		}
		
	}
	
	public int[] findSumRowWise(){
		int [] sumrows =new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				sumrows[i]+=arr[i][j];
			}
			
		}
		return sumrows;
		
	}
	public int[] findSumColumnWise() {
	    int[] sumcols = new int[arr[0].length];
	    for (int i = 0; i < arr[0].length; i++) {
	        for (int j = 0; j < arr.length; j++) {
	            sumcols[i] += arr[j][i];
	        }
	    }
	    return sumcols;
	}

		
	 public int[][] add2DArrays(My2DArray ob) {
	        int[][] result = new int[arr.length][arr[0].length];
	        for (int i = 0; i < arr.length; i++) {
	            for (int j = 0; j < arr[i].length; j++) {
	                result[i][j] = arr[i][j] + ob.arr[i][j];
	            }
	        }
	        return result;
	    }
	 
	 public int[][] sub2DArrays(My2DArray ob) {
	        int[][] result = new int[arr.length][arr[0].length];
	        for (int i = 0; i < arr.length; i++) {
	            for (int j = 0; j < arr[i].length; j++) {
	                result[i][j] = arr[i][j] - ob.arr[i][j];
	            }
	        }
	        return result;
	    }
	
}


