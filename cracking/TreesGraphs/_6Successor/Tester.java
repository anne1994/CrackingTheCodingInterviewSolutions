package _6Successor;

import common.TreeNode;
import common.TreeOperations;

class Tester{
	
	
	public static void main(String[] args) {
	TreeNode node = TreeOperations.createBST();
	System.out.println("successor is " + Successor.inorderSucc(node).data);
	System.out.println("successor is " +Successor.inorderSucc(node.left).data);
	System.out.println("successor is " +Successor.inorderSucc(node.right).data);
	}
	
	
	
}