package com.nagarro.training.linkedlist;

public class iterator {
	node node;

	iterator(node head) {
		this.node = head;
	}

	boolean hasNext() {
		return (node != null);
	}

	int next() {
		int item = node.data;

		node = node.next;

		return item;
	}
}
