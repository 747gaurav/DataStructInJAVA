package com.ds.listimpl;

import com.ds.elements.Node;

public class LinkedListImpl extends AbstractList {

	@Override
	public void insertEnd(int data) {
		// TODO Auto-generated method stub
		Node t = new Node(data);
		if(head == null){
			head = t;
		}
		else{
			Node i = head;
			while(i.link != null){
				i = i.link;
			}
			i.link = t;
		}
	}

	@Override
	public void insertNext(Node pos, int data) {
		// TODO Auto-generated method stub

	}

	@Override
	public void insertFirst(int data) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteElement(int data) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteFirst() {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteLast() {
		// TODO Auto-generated method stub

	}
	
	public static void main(String[] args)
	{
		LinkedListImpl list = new LinkedListImpl();
		list.insertEnd(1);
		list.insertEnd(2);
		list.insertEnd(3);
		
		list.print();
	}

}
