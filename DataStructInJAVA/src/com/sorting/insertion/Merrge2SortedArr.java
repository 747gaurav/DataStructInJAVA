package com.sorting.insertion;

import java.util.Arrays;

public class Merrge2SortedArr {
	public int moveLeft(int a[], int b[] , int ai, int bj)
	{
		int retVal = a[ai];
		int toA = b[0];
		for(int i = 0 ; i<bj; i++)
		{
			b[i] = b[i+1];
		}
		
		int i = ai;
		while(i < a.length-1)
		{
			a[i] = a[i+1];
			i++;
		}
		a[a.length -1] = toA;
		return retVal;
	}

	public void merge2Arr(int a[], int b[])
	{
		int m = a.length;
		int n = b.length;
				
/*		for(int i = n-1 ; i >=0 ; i--)
		{
			for(int j = m-1 ; j >= 0; j--)
			{
				if(a[i] > b[j])
				{
					int bj = moveLeft(a, b, i, j);
					b[j]=bj;
				}
			}
		}
*/
		for (int i=n-1; i>=0; i--)
	    {
	        /* Find the smallest element greater than ar2[i]. Move all
	           elements one position ahead till the smallest greater
	           element is not found */
	        int j;
	        int last = a[m-1];
	        for (j=m-1; j >= 0 && a[j] > b[i]; j--)
	            a[j+1] = a[j];
	 
	        // If there was a greater element
	        if (j != m-1)
	        {
	            a[j+1] = b[i];
	            a[i] = last;
	        }
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1, 5, 9, 10, 15, 20};
		int b[] = {2, 3, 8, 13};
		System.out.println("Before merge =" + Arrays.toString(a)+ "   "+Arrays.toString(b));
		Merrge2SortedArr m2 = new Merrge2SortedArr();
		m2.merge2Arr(a, b);
		
		System.out.println("After merge ="+ Arrays.toString(a)+ "   "+ Arrays.toString(b));
		
	}

}
