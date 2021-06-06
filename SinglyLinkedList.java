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

	public void insertAtPosition(int position, int value){
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
	public static void main(String[] args){
	//Create A LinkedList

	ListNode head = new ListNode(56);
	ListNode second = new ListNode(30);
	ListNode third = new ListNode(70);

	head = first;
	first.next = second;
	second.next = third;
	
	SinglyLinkedList sll = new SinglyLinkedList();
	sll.display(head);
	System.out.println();
	head = sll.inserAtPosition(2, 30);
	sll.display();
	}
}
