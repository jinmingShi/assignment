package week3;

//Write a sample code to reverse Singly Linked List by iterating through it only once.

public class Question6 {
	public static void reverseListNode() {
		
	}
	
	ListNode reverse(ListNode node) {
		ListNode prev = null;
		ListNode current = node;
		ListNode next = null;
    while (current != null) {
        next = current.next;
        current.next = prev;
        prev = current;
        current = next;
    }
    node = prev;
    return node;
	}
}
