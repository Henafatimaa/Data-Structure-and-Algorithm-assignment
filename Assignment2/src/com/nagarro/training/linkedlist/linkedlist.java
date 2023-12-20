package com.nagarro.training.linkedlist;

public class linkedlist {
	node head;
	
	void insert(int val) {
		node newnode=new node(val);
		if(head==null) {
			head = newnode;
		}
		else {
			node n=head;
			
		while (n.next != null) {
			n = n.next;
		}
		// set the last element of linked list to the new node
		n.next = newnode;
	}

	System.out.println(val + " inserted in Linked List");
	}

// Method to insert at a specific position of linked list
void insertAtPosition(int item, int p) {
	// initiate a pointer node to the head node of linked list
	node n = head;
	// Create a new node
	node newNode = new node(item);
	// check if entered position is a valid position in linked list
	if (p < 1 || p > size() + 1) {
		System.out.println("\nInvalid Position.\n");
		return;
	}

	int curPos = 1;

	// iterate to one less than the entered position of linked list
	while (curPos != p - 1) {
		n = n.next;
		curPos++;
	}
	// set the new node next to node next,
	// than set node next to the new Node
	newNode.next = n.next;
	n.next = newNode;

	System.out.println(item + " Inserted in Linked List at Position " + p);
}

// Method to delete an item from a linked list
void delete(int item) {
	// Check if list is not empty
	if (size() == 0) {
		System.out.println("Linked List is Empty.");
		return;
	}
	// initiate a pointer node to the head node
	node n = head;
	// check if head is equal to the entered item,
	// if so, change the head position to the next element
	if (n.data == item) {
		head = n.next;
		System.out.println(item + " is Deleted from Linked List.");
		return;
	}

	// iterate to the one short of last element of linked list
	while (n.next != null) {
		// check if the next node is equal to the item,
		// if so, set the current node to next of next node element
		if (n.next.data == item) {
			n.next = n.next.next;
			System.out.println(item + " is Deleted from Linked List.");
			return;
		}

		n = n.next;
	}

	System.out.println(item + " does not exists in Linked List.");
}

// Method to delete node at a specific position
void deleteAtPosition(int p) {
	// Check if Linked List is empty
	if (size() == 0) {
		System.out.println("Linked List is Empty");
	}
	// Check if the entered position exists in the linked list
	if (p < 1 || p > size()) {
		System.out.println("\nInvalid Position\n");
		return;
	}

	// check if the entered position is of head
	if (p == 1) {
		System.out.println(head.data + " is deleted from the linked list.");
		head = head.next;
		return;
	}

	// Initiate a pointer node, and a counter integer
	node n = head;
	int count = 1;
	// Iterate to the one sort of entered position
	while (count != p - 1) {
		n = n.next;
		count++;
	}

	System.out.println(n.next.data + " is deleted from the linked list.");

	// check if the next of next of current node exists in the linked list,
	// if so, change the current node next to next of next node,
	// otherwise change to current node next to the null
	if (n.next.next != null) {
		n.next = n.next.next;
	} else {
		n.next = null;
	}
}

// Method to return the center element of linked list
int center() {
	// Check if linked list is empty
	if (size() == 0) {
		System.out.println("Linked List is Empty");
	}
	// initialize a counter variable to 1
	int count = 1;
	// initialize a pointer node with head node
	node n = head;
	// iterate to the middle of linked list
	while (count != ((size() / 2) + 1)) {
		n = n.next;
		count++;
	}

	// return middle node
	return n.data;
}

// Method to sort a linked list
void sort() {
	// Check if linked list is empty
	if (size() == 0) {
		System.out.println("Linked List is Empty");
		return;
	}
	// Initialize two nodes and one temporary int variable
	node cur = head;
	node idx = null;
	int temp;

	// Iterate through the end of linked list
	while (cur != null) {
		// set index value to current node next
		idx = cur.next;
		// iterate till the end to the linked list
		while (idx != null) {
			// if node is less than current node than swap current node with index node
			if (cur.data > idx.data) {
				temp = cur.data;
				cur.data = idx.data;
				idx.data = temp;
			}
			// increment index variable value by 1
			idx = idx.next;
		}
		// increment current variable value by 1
		cur = cur.next;
	}

	System.out.println("Linked List Sorted Successfully");
}

// Method to reverse a linked list
void reverse() {
	// Check if linked list is empty
	if (size() == 0) {
		System.out.println("Linked List is Empty");
		return;
	}
	// Initiate pointer node to head,
	// nextNode to null, & prevNode to null
	node n = head;
	node nextNode = null;
	node prevNode = null;

	// Iterate through the end of linked list
	while (n != null) {
		// set nextNode pointer to the next node of current node
		nextNode = n.next;

		// set current node next to previous node
		n.next = prevNode;
		// set previous node to current node
		prevNode = n;
		// set current node pointer to the next node
		n = nextNode;
	}
	// set head to the previous node
	head = prevNode;

	System.out.println("\nLinked List is successfully reversed\n");
}

// Method to return the size of linked list
int size() {
	// initialize node pointer to head,
	// and counter variable to 0
	node n = head;
	int count = 0;

	// iterate to the end of linked list
	while (n != null) {
		count++;
		n = n.next;
	}
	// return the size of linked list
	return count;
}

// Method to Display the linked list
void traverse() {
	// Check if linked list is empty
	if (size() == 0) {
		System.out.println("Linked List is Empty");
		return;
	}
	// initialize the pointer node with head node
	node n = head;
	// iterate to the end of linked list
	while (n != null) {
		// print current node
		System.out.print(n.data);

		if (n.next != null)
			System.out.print("->");
		// set the pointer node to next node
		n = n.next;
	}

	System.out.println("\n");
	}
	

}

