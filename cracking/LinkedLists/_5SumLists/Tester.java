package _5SumLists;


import common.ListFunctions;
import common.ListNode;

class Tester{
	public static void main(String[] args) {
		System.out.println("add sum");
		testReverse(new ListNode(new int[] {2,4,3}), new ListNode(new int[] {5,6,4})); 
		//342 , 465
		testForward(new ListNode(new int[] {2,4,3}), new ListNode(new int[] {5,6,4}));
	}
	private static void testReverse(ListNode head1, ListNode head2) {	
		System.out.println("Reverse order inputs");
		ListNode sum = SumLists.addTwoNumbers(head1, head2); 
		ListFunctions.printList(head1);
		ListFunctions.printList(head2);
		System.out.println("Reverse order result");
		ListFunctions.printList(sum);
	}
	
	private static void testForward(ListNode head1, ListNode head2) {
		System.out.println("Forward order inputs");
		ListNode sum = SumLists.addForwardOrder(head1, head2); 
		ListFunctions.printList(head1);
		ListFunctions.printList(head2);
		System.out.println("Forward order result");
		ListFunctions.printList(sum);
	}
	
	
}