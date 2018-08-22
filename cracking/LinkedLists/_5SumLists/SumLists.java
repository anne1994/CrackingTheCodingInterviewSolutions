package _5SumLists;

import java.util.Stack;

import common.ListNode;


//solution obtained from leetcode
//Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
//Output: 7 -> 0 -> 8
//Explanation: 342 + 465 = 807.
class SumLists{
	
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode dummyHead = new ListNode(0);
		ListNode p = l1, q = l2, curr = dummyHead;
		int carry = 0;
		while(p!=null || q!=null) {
			 int x = (p != null) ? p.data : 0;
		        int y = (q != null) ? q.data : 0;
		        int sum = carry + x + y;
		        carry = sum / 10;
		        curr.next = new ListNode(sum % 10);
		        curr = curr.next;
		        if (p != null) p = p.next;
		        if (q != null) q = q.next;
		}
		if (carry > 0) {
	        curr.next = new ListNode(carry);
	}
		return dummyHead.next;
}
	
	 public static ListNode addForwardOrder(ListNode l1, ListNode l2) {
	        Stack<Integer> s1 = new Stack<Integer>();
	        Stack<Integer> s2 = new Stack<Integer>();
	        
	        while(l1 != null) {
	            s1.push(l1.data);
	            l1 = l1.next;
	        };
	        while(l2 != null) {
	            s2.push(l2.data);
	            l2 = l2.next;
	        }
	        
	        int sum = 0;
	        ListNode list = new ListNode(0);
	        while (!s1.empty() || !s2.empty()) {
	            if (!s1.empty()) sum += s1.pop();
	            if (!s2.empty()) sum += s2.pop();
	            list.data = sum % 10;
	            ListNode head = new ListNode(sum / 10);
	            head.next = list;
	            list = head;
	            sum /= 10;
	        }
	        
	        return list.data == 0 ? list.next : list;
	    }
	}
		



