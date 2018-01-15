package week3;

//"You are given two linked lists representing two non-negative numbers. 
//The digits are stored in reverse order and each of their nodes contain a single digit.
//Add the two numbers and return it as a linked list.
//Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
//Output: 7 -> 0 -> 8"
public class Question3 {
	
	public static ListNode add(ListNode l1, ListNode l2) {
		int carryForward=0;
		ListNode result=new ListNode(0);
		ListNode tmp1=l1, tmp2=l2, tmp3=result;

		while(tmp1 != null || tmp2 != null) {
			if (tmp1 != null) {
				carryForward += tmp1.val;
				tmp1 = tmp1.next;
			}
			if(tmp2 != null) {
				carryForward += tmp2.val;
				tmp2 = tmp2.next;
			}
			tmp3.next = new ListNode(carryForward%10);
			tmp3 = tmp3.next;
			carryForward /= 10;
		}
		if(carryForward == 1) {
			tmp3.next = new ListNode(1);
		}
		return result.next;
	}
}

class ListNode {
	int val;
	ListNode next;
	
	ListNode(int val) {
		this.val = val;
		
	}
}