package _6Palindrome;

import java.util.Stack;

import common.ListFunctions;
import common.ListNode;

class Palindrome{
	public static boolean isPalindrome(ListNode head) {
		int size = ListFunctions.calculateSize(head);
		ListNode fast = head;
		ListNode slow = head;
		Stack<Integer> s = new Stack<Integer>();
		
		while(fast!=null && fast.next!=null) {
			s.push(slow.data);
			slow = slow.next;
			fast = fast.next.next;
		}
		
//		//has odd number of elements 
//		if(fast!=null) {
//			slow = slow.next;
//		}
		if(size%2 == 1) {
			slow = slow.next;
		}
		
		while(slow!=null) {
			if(s.pop().intValue() != slow.data) {
				return false;
			}
			slow = slow.next;
		}
		return true;
	}
	
}