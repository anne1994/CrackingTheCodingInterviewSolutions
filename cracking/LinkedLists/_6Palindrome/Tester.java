package _6Palindrome;

import common.ListFunctions;
import common.ListNode;

class Tester{
	
	public static void main(String[] args) {
		test(new ListNode(new int[]{1,2,3,3,2,1}));
		test(new ListNode(new int[]{4,5,6,7,8}));
		test(new ListNode(new int[]{1,2,3,2,1}));
	}
	
	private static void test(ListNode head){
		ListFunctions.printList(head);
		System.out.println("Palindrome ? " + Palindrome.isPalindrome(head));
	}

}