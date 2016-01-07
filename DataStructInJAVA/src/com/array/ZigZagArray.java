package com.array;

public class ZigZagArray {
	
	void printZigZag(String str, int n){
		char[] arr = str.toCharArray();
		short len = (short)str.length();
		String[] zig = new String[n];
		for(int i =0 ; i < n ; i++){
			zig[i] = "";
		}
		boolean dir = true; //down
		int sub =0;
		for(int i = 0 ; i < len ; i++)
		{
			String temp = String.valueOf(arr[i]);
			zig[sub] += temp;
			
			if(sub == n-1)
			{
				dir = false;
			}
			if(sub == 0){
				dir = true;
			}
			if(dir){
				sub++;
			}else{
				sub--;
			}
		}
		
		String output = "";
		for( int i = 0 ; i < n ; i++){
			output += zig[i];
		}
		System.out.println("input  ="+str);
		System.out.println("output ="+output);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZigZagArray obj = new ZigZagArray();
		
		obj.printZigZag("ABCDEFG", 3);
	}

}
