//wap to sort the following array using quick sort int[] arr= {5,16,7,3,1,11,29,18,20,25}



package com.demo.test;
import com.demo.service.QuickSort;

public class TestQuickSort {
		public static void main(String[] args) {
			int[] arr= {5,16,7,3,1,11,29,18,20,25};
			QuickSort.quicksort(arr, 0, arr.length-1);
		}
	}


