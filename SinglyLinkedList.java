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

	public void Append(ListNode previous, int data) {
		if(previous == null) {
			System.out.println("The Given previous node cannot be null");
			return;
		}
		
		ListNode newNode = new ListNode(data);
		newNode.next = previous.next;
		previous.next = newNode;
	}

	public void display() {
		ListNode current = head;
		while(current != null) {
			System.out.print(current.data + " --> ");
			current = current.next;
		}
		System.out.print("null");
	}

	public ListNode insertAtPosition(ListNode head, int position, int value){
		// 56 -- 70
		// 56 --> 30 -->70
		ListNode node = new ListNode(value);

		if(position == 1){
			newNode.next = head;
			head = newNode;
		} else {
			ListNode previous = head;
			int count = 1; // position - 1

			while(count < position - 1){
				previous = previous.next;
				count++;
			}

			ListNode current = previous.next;
			previous.next = newNode;
			return head;
		}
	}

	public ListNode deleteFirst() {
		if(head == null) {
			return null;
		}
		ListNode temp = head;
		head = head.next;
		temp.next = null;
		return temp;
	}

	public ListNode deleteLast() {
		if(head == null) {
			return head;
		}

		if(head.next == null) {
			ListNode temp = head;
			head = head.next;
			return temp;
		}

		ListNode current = head;
		ListNode previous = null;

		while(current.next != null) {
			previous = current;
			current = current.next;
		}
		previous.next = null; // break the chain
		return current;
	}

	public ListNode getMiddleNode() {
		if(head == null) {
			return null;
		}
		ListNode slowPtr = head;
		ListNode fastPtr = head;

		while(fastPtr != null && fastPtr.next != null) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
		}
		return slowPtr;
	}

	public static void main(String[] args){
	//Create A LinkedList
	
		SinglyLinkedList sll = new SinglyLinkedList();

		ListNode head = new ListNode(56);
		ListNode second = new ListNode(30);
		ListNode third = new ListNode(70);

		head = first;
		first.next = second;
		second.next = third;

		sll.display();
		System.out.println();
		third = sll.insertAtPosition(head, 3, 40);
		sll.display();
	}
}
