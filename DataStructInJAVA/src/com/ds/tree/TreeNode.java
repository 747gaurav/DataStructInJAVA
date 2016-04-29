package com.ds.tree;

public class TreeNode {
	public int data;
	public TreeNode left;
	public TreeNode right;
	
	public TreeNode(){
		
	}
	public TreeNode(int data){
		this.data = data;
	}
	public static TreeNode createNode(int data)
	{
		return new TreeNode(data);
	}
}
