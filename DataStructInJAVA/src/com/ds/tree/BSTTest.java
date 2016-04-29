package com.ds.tree;

import java.util.List;

public class BSTTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BST bstree= new BST();
		
		bstree.add(5);
		bstree.add(3);
		bstree.add(4);
		bstree.add(1);
		bstree.add(7);
		bstree.add(6);
		bstree.add(8);
		
		List l =bstree.inOrder(bstree.getRoot(), null);
		System.out.println("inOrder list   ="+l);
		System.out.println("preOrder list  ="+bstree.preOrder(bstree.getRoot(), null));
		System.out.println("postOrder list ="+bstree.postOrder(bstree.getRoot(), null));
	}

}
