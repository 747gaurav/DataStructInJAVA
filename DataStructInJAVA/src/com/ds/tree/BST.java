package com.ds.tree;

import java.util.LinkedList;
import java.util.List;

public class BST implements Tree {

	private TreeNode root;
	@Override
	public boolean add(int value) {
		// TODO Auto-generated method stub
		
		if(root ==null){
			root = TreeNode.createNode(value);
			return true;
		}else{
			return checkAdd(this.root, value);
		}
		
	}

	private boolean checkAdd(TreeNode root, int value){
		if(root == null){
			return false;
		}
		
		if(value < root.data){
			if(root.left == null){
				TreeNode t = TreeNode.createNode(value);
				root.left = t;
				return true;
			}else{
				return checkAdd(root.left, value);
			}
		}else if(value > root.data){
			if(root.right == null){
				TreeNode t= TreeNode.createNode(value);
				root.right =t;
				return true;
			}else{
				return checkAdd(root.right, value);
			}
		}else{
			System.out.println("Duplicate element "+value);
			return false;
		}
	}
	@Override
	public boolean remove(int value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List inOrder(TreeNode root, List result) {
		// TODO Auto-generated method stub
		
		if(root == null)
		{
			return result;
		}
		if(result == null)
		{
			result = new LinkedList<Integer>();
		}
		
		inOrder(root.left, result);
		result.add(root.data);
		System.out.print(", "+root.data);
		inOrder(root.right, result);
		return result;
	}


	
	@Override
	public List<Integer> preOrder(TreeNode root, List<Integer> result) {
		// TODO Auto-generated method stub

		if(root == null)
		{
			return result;
		}
		if(result == null)
		{
			result = new LinkedList<Integer>();
		}
		result.add(root.data);
		System.out.print(", "+root.data);
		preOrder(root.left, result);
		
		preOrder(root.right, result);
		return result;
	}

	@Override
	public List<Integer> postOrder(TreeNode root, List<Integer> result) {
		// TODO Auto-generated method stub
		if(root == null)
		{
			return result;
		}
		if(result == null)
		{
			result = new LinkedList<Integer>();
		}
		
		postOrder(root.left, result);
		
		postOrder(root.right, result);
		result.add(root.data);
		System.out.print(", "+root.data);
		return result;
	}

	@Override
	public TreeNode getRoot() {
		return root;
	}

}
