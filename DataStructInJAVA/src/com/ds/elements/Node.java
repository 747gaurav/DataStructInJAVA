package com.ds.elements;

public class Node {
	public int data;
	public Node link;
	
	public Node(int data){
		this.data = data;
	}
	@Override
	public boolean equals(Object obj){
		if(obj instanceof Node){
			if (this.data == ((Node)obj).data)
			{
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode(){
		return Integer.valueOf(data).hashCode();
	}
}
