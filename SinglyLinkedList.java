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


	public static void createLikedList(String[] args){
	//Create A LinkedList

	ListNode head = new ListNode(56);
	ListNode second = new ListNode(30);
	ListNode third = new ListNode(70);

	head = first;
	first.next = second;
	second.next = third;

	public static void main(String[] args){
	
	    SinglyLinkedList sll = new SinglyLinkedList();
	    sll.display();
	    System.out.println();
            sll.Append(first, 30);
	    sll.display();
	    sll.Append(second, 70);
	    sll.display();
	}
}
