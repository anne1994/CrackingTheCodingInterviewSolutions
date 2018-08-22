package _8FirstCommonAncestor;

import common.TreeNode;

class FirstCommonAncestor{
	
	public static TreeNode commonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		
		if(root == null) {
			return null;
		} else if(root == p || root == q) {
			return root;
		}
		
		TreeNode left = commonAncestor(root.left, p, q);
		TreeNode right = commonAncestor(root.right, p, q);
		if(left == null) {
			return right;
		} else if(right == null) {
			return left;
		} else {
			return root;
		}
	}
}
