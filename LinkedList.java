package linkedlist.Day16LinkedList;

class LinkedList

{
    Node head;  // head of list
 
    // Node Class 
    class Node
    {
        int data;
        Node next;
          
        // Constructor to create a new node
        Node(int d) {data = d; next = null; }
    }
	// This function prints contents of the linked list starting from head  
	 public void display()  
	 {  
	    Node n = head;  
	    while (n != null)  
	 {  
	    	System.out.print(n.data + " ");  
	        n = n.next;  
	 }  
}  
	 
	 //method to create a simple linked list with 3 nodes
	 public static void main(String[] args)  
	 {
		 
		 //Start with the empty list.   
		 LinkedList list = new LinkedList();  
	  
	 		 list.head = new Node(70);  
	         Node second = new Node(30);  
	         Node third  = new Node(56);  
	  
			 list.head.next = second; // Link first node with the second node  
			 second.next = third; // Link first node with the second node

			 list.display();  
	 }
}
