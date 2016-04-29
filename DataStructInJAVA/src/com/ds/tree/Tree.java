package com.ds.tree;

import java.util.List;

public interface Tree {
	public boolean add(int value);
	
	public TreeNode getRoot();
	public boolean remove(int value);
	
	public List<Integer> inOrder(TreeNode root, List<Integer> result);
	
	public List<Integer> preOrder(TreeNode root, List<Integer> result);
	
	public List<Integer> postOrder(TreeNode root, List<Integer> result);
}
