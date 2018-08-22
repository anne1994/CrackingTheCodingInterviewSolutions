package _6Successor;

import common.TreeNode;

class Successor{
	
	static TreeNode inorderSucc(TreeNode n) {
		if(n == null) return null;
		
		//found right, return the left most child of right subtree
		if(n.right != null) {
			return leftMostChild(n.right);
		} else {
			TreeNode q = n;
			TreeNode x = q.parent; //assuming we have links to the parent
			//go until we are on left instead of right
			while(x != null && x.left!=q) {
				q=x;
				x=x.parent;
			}
			return x;			
		}
	}
	
	private static TreeNode leftMostChild(TreeNode n) {
		if(n == null) {
			return null;
		}
		while(n.left != null) {
			n = n.left;
		}
		return n;
	}
	
}