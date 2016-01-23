package com.sorting.quick;

import java.util.Arrays;

public class QuickSort {

	public void sortQuickly(int a[], int start, int end)
	{
		int pivot = partisian2(a, start, end);
		if(start < pivot-1)
		{
		
		//left subArray recursion
		sortQuickly(a, start, pivot-1);
		}
		if(end>pivot)
		{
			//right sub array recursion
			sortQuickly(a, pivot, end);
		}
	}
	
	private int partisian(int sub[], int pstart, int pend)
	{	int pivotval = sub[pend];
		int l =pstart , i = pstart-1;
		
		for( int j = l ; j <=pend -1; j++)
		{
			int subj = sub[j];
			if(sub[j] <= pivotval){
				i++;
				int temp = sub[i];
				sub[i] = sub[j];
				sub[j] = temp;
			}
			
		}
		int temp = sub[i+1];
		sub[i+1] = sub[pend];
		sub[pend] = temp;
		
		return i+1;
	}
	
	/*
	 * In this function leftmost element is assumed as pivot
	 * 
	 */
	private int partisian2(int[] sub, int left, int right)
	{
		int pivot = sub[left];
		int pivIndex = left;
//		left++;
		
		while(left <= right){
			/* increment left till value @ left is less than pivot
			* for 1st iteration condition will be false as pivot = sub[left]
			* but next time onwards it will reduce the swaps.
			*/
			while(sub[left]<pivot)
			{
				left++;
			}
			
			while(sub[right]>pivot)
			{
				right--;
			}
			
			if(left <= right)
			{
				int temp = sub[left];
				sub[left] = sub[right];
				sub[right] = temp;
				
				left++;
				right--;
			}
		}
/*		int temp = sub[pivIndex];
		sub[pivIndex] = sub[right];
		sub[right] = temp;
		return right;
*/
		return left;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		QuickSort qs = new QuickSort();
		int a[] = {9, 7, 2, 1, 6, 8, 5, 3, 4};
		qs.sortQuickly(a, 0, a.length-1);
		
		System.out.println("Quickley sorted array ="+Arrays.toString(a));
	}

}
