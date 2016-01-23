package com.sorting.bubble;

import java.util.Arrays;

public class BubbleSort {

	public void bubbleSort(int a[]){
		int n = a.length;
		boolean flag = false;
		for( int i = 0 ; i < n-1 ; i++)
		{
			flag = true;
			for( int j =0 ; j < n-1-i ; j++)
			{
				if(a[j] > a[j+1])
				{
					flag = false;
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
				//flag=true;
			}
			if(flag)
			{
				System.out.println("break hit");
				break;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {34,5,1,3};
		BubbleSort b = new BubbleSort();
		b.bubbleSort(a);
		System.out.println("Sorted array ="+Arrays.toString(a));
	}

}
