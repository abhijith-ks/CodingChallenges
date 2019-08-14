package io.abhijith.challenges;

/**
 * Given a binary tree, return the postorder traversal of its nodes value
 * Use iterative approach
 * 
 * @author i332773
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import io.abhijith.resources.BinaryTreeNode;

public class PostorderTraversalBTIterative {
	
	public void findSolution() {
		BinaryTreeNode root = new BinaryTreeNode("1",
									null,
									new BinaryTreeNode("2",
											null, 
											new BinaryTreeNode("3", null, null)));
		
		List<String> list = new ArrayList<>();
		Stack<BinaryTreeNode> stack = new Stack<>();
		
		stack.push(root);
		
		while(!stack.isEmpty()) {
			BinaryTreeNode node = stack.pop();
			list.add(0, node.getVal()); // because of parameter '0', list will put the element in the beginning and push the rest to the right 
			if(node.getLeft() != null) {
				stack.push(node.getLeft());
			}
			if(node.getRight() != null) {
				stack.push(node.getRight());
			}
		}
		
		System.out.println(list);
	}

}
