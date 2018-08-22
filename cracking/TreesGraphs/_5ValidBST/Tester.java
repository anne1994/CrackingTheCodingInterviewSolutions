package _5ValidBST;

import common.TreeNode;
import common.TreeOperations;

public class Tester{ 
	
	public static void main(String[] args) {
		TreeNode root1 = TreeOperations.createTree();
		test(root1);
		TreeNode root2 = TreeOperations.createBST();
		test(root2);
	}
	private static void test(TreeNode tree) {
		System.out.format("Tree with node %d is BST: %s\n",tree.data , IsValid.checkBST(tree));
}
	
	
}