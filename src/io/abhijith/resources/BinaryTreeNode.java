package io.abhijith.resources;

public class BinaryTreeNode {
	
	String val;
	BinaryTreeNode left;
	BinaryTreeNode right;
	
	public BinaryTreeNode() {	
	}

	public String getVal() {
		return val;
	}

	public void setVal(String val) {
		this.val = val;
	}

	public BinaryTreeNode getLeft() {
		return left;
	}

	public void setLeft(BinaryTreeNode left) {
		this.left = left;
	}

	public BinaryTreeNode getRight() {
		return right;
	}

	public void setRight(BinaryTreeNode right) {
		this.right = right;
	}

	public BinaryTreeNode(String val, BinaryTreeNode left, BinaryTreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
	
}
