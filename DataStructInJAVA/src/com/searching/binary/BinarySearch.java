package com.searching.binary;

import java.util.Arrays;

import com.sorting.quick.QuickSort;

public class BinarySearch {

	public int binSearch(int a[], int start, int end, int x)
	{
		if(start > end)
		{
			return -1;
		}
		int mid = (start+end)/2;
		if(a[mid] == x)
			return mid;
		else if(x < a[mid]){
			return binSearch(a, start, mid-1, x);
		}else{
			return binSearch(a, mid+1, end, x);
		}
		
	}
	int search(int[] a, int x){
		return binSearch(a, 0, a.length-1, x);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {9, 7, 2, 10, 5, 8, 5, 3, 4};
		QuickSort qs = new QuickSort();
		qs.sortQuickly(a, 0, a.length-1);
		System.out.println("Sorted array ="+ Arrays.toString(a));
		BinarySearch bs = new BinarySearch();
		System.out.println("Searched element is found at ="+bs.search(a, 7));
	}

}
