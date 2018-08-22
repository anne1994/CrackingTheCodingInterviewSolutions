package _4CheckBalanced;

import common.TreeNode;
import common.TreeOperations;

public class Tester{
	
	public static void main(String[] args) {
	
	//create tree , in tester.java
		TreeNode root = TreeOperations.createTree();
		System.out.println("is the binary tree balanced");
		System.out.format("%s", CheckBalanced.isBalanced(root));
		
	}
}