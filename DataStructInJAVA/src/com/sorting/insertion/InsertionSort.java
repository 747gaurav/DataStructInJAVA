package com.sorting.insertion;

import java.util.Arrays;

public class InsertionSort {

	public void insertSort(int[] a){
		int n = a.length;
		for( int i =1 ; i<n ; i++)
		{
			for(int j =0 ; j < i-1 ; j++){
				if(a[j] > a[i])
				{
					int insert = move(a, j, i);
					a[j] = insert;
					break;
				}
			}
		}
	}
	private int move(int[]a , int j, int i){
		int retVal = a[i];
		for(int k = i; k>j; k--)
		{
			a[k] = a[k-1];
		}
		return retVal;
	}
	public static void main(String[] srgs){
		int a[] = { 34, 43, 3, -2, 1};
		InsertionSort in = new InsertionSort();
		in.insertSort(a);
		System.out.println("After sort ="+ Arrays.toString(a));
	}
}