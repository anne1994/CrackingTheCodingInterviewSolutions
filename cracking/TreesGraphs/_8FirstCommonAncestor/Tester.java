package _8FirstCommonAncestor;

import common.TreeNode;
import common.TreeOperations;

class Tester{
	
	
	public static void main(String[] args) {
		
		TreeNode root = TreeOperations.createTree();
		TreeNode ans = FirstCommonAncestor.commonAncestor(root, root.left.left, root.right.left);
		System.out.println("first common ancestor is: " + ans.data);
	}
}