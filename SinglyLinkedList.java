package linkedlist;

public class SinglyLinkedList {
	
	private ListNode head;

	private static class ListNode {
		private int data; // Can be a generic type
		private ListNode next; // Reference to next ListNode in list

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static void main(String[] args){
	//Create A LinkedList

	ListNode head = new ListNode(70);
	ListNode second = new ListNode(30);
	ListNode third = new ListNode(56);

	}
}
