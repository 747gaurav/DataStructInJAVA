package com.sorting.merge;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSort {

	public void merge(int[]a, int l, int m, int r){
		int n1 = m-l+1;
		int n2 = r-m;
		
		int L[] = new int[n1], R[] = new int[n2];
		
		for(int i=0; i<n1; i++)
			L[i] = a[l+i];
		
		for(int i=0; i<n2 ; i++)
			R[i] = a[m+1+i];
		
		System.out.println("Left sub-array ="+Arrays.toString(L));
		System.out.println("Right sub-array ="+Arrays.toString(R));
		
		int i=0, j=0, k=l; 
		while (i < n1 && j < n2)
	    {
	        if (L[i] <= R[j])
	        {
	            a[k] = L[i];
	            i++;
	        }
	        else
	        {
	            a[k] = R[j];
	            j++;
	        }
	        k++;
	    }
		
		/* Copy the remaining elements of L[], if there are any */
	    while (i < n1)
	    {
	        a[k] = L[i];
	        i++;
	        k++;
	    }
	    
	    while(j<n2)
	    {
	    	a[k] = R[j];
	    	j++;
	    	k++;
	    }
	    
	    System.out.println("After merge ="+Arrays.toString(a));
	}
	
	public void mergeSort(int a[], int l, int r)
	{
		if (l < r)
	    {
	        int m = l+(r-l)/2; //Same as (l+r)/2, but avoids overflow for large l and h
	        mergeSort(a, l, m);
	        mergeSort(a, m+1, r);
	        merge(a, l, m, r);
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {38, 27, 43, 3, 9 ,82, 10};
		
		MergeSort m = new MergeSort();
//		m.merge(a, 4, 5, 6);
		m.mergeSort(a, 0, a.length-1);
	}

}
