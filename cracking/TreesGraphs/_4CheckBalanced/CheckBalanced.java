package _4CheckBalanced;

//balanced - for each node, the two subtrees differ
//in height by no more than one 

import common.TreeNode;


public class CheckBalanced{
	
	private static int checkHeight(TreeNode root) {
		if(root == null) return -1;
		int leftHeight = checkHeight(root.left);
		if(leftHeight == Integer.MIN_VALUE)
			return Integer.MIN_VALUE;
		int rightHeight = checkHeight(root.right);
		if(rightHeight == Integer.MIN_VALUE)
			return Integer.MIN_VALUE;
		int difference = leftHeight - rightHeight;
		if(Math.abs(difference) > 1) {
			return Integer.MIN_VALUE;
		}
		else {
			return Math.max(leftHeight, rightHeight)+1;
		}
	}
	
	public static boolean isBalanced(TreeNode root) {
		return checkHeight(root)!= Integer.MIN_VALUE;
	}
	
}