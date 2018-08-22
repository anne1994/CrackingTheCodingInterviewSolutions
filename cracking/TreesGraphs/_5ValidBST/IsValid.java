package _5ValidBST;



import common.TreeNode;


public class IsValid{
	public static boolean checkBST(TreeNode root) {
		return checkBST(root, null,null);
	}
	
	private static boolean checkBST(TreeNode node, Integer min, Integer max) {
		if(node == null) {
			return true;
		}
		
		if ((min!=null && node.data <= min) || (max!=null && node.data > max)) { // tricky off-by-one errors for duplicates. Tricky whether it's <, <=, >, >=
			return false;
		}
		if((!checkBST(node.left, min, node.data)) || (!checkBST(node.right,node.data, max))){
			return false;
		}	
	return true;
	}
	
}

