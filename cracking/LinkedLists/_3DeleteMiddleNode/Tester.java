package _3DeleteMiddleNode;

import common.ListFunctions;
import common.ListNode;

class Tester{
	
	public static void main(String[] args) {
		test(new ListNode(new int[] {7,5,3,8}));
		test(new ListNode(new int[] {6,8,9,10,11}));
	}
	private static void test(ListNode head) {
		ListFunctions.printList(head);
		MiddleNode.deleteMiddle(head.next.next);
		ListFunctions.printList(head);
	}
}