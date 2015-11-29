package com.ds.linear;

import com.ds.elements.Node;

public interface List {
	void insertEnd(int data);
	void insertNext(Node pos, int data);
	void insertFirst(int data);
	
	void deleteElement(int data);
	void deleteFirst();
	void deleteLast();
	
	void print();
}
