package _3DeleteMiddleNode;

import common.ListNode;
class MiddleNode{
	
	public static boolean deleteMiddle(ListNode n) {
		if(n == null || n.next == null){
			return false;
		}
		n.data = n.next.data;
		n.next = n.next.next;
		return true;
	}
}