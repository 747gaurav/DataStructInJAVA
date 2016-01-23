package com.sorting.selection;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String... args)
	{
		int[] a = {76,9,0,8,2};
		int n = a.length;
		for( int i = 0 ; i< n-1 ; i++)
		{
			int iMin = i;
			for(int j = i+1 ; j < n ; j++ )
			{
				if(a[iMin] > a[j])
				{
					iMin=j;
				}
			}
			int temp = a[iMin];
			a[iMin] = a[i];
			a[i] = temp;
		}
		System.out.println("sorted array ="+Arrays.toString(a));
	}
}
