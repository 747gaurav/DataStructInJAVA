package com.ds.listimpl;

import com.ds.elements.Node;
import com.ds.linear.List;

public abstract class AbstractList implements List{
	protected Node head = null;
	
	@Override
	public void print(){
		System.out.print("\nList contents are =");
		if(head == null)
			System.out.print("null\n");
		else{
			
			for(Node i = head; i!=null; i = i.link)
			{
				System.out.print(i.data+" -> ");
			}
			System.out.print('X');
			System.out.println("");
		}
	}
}
