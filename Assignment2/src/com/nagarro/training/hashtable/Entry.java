package com.nagarro.training.hashtable;

public class Entry {
	int key;
	Object value;
	Entry next;
	// constructor with values
	public Entry(int key, Object value) {
		this.key = key;
		this.value = value;
		next = null;
	}
	public Entry() {
		next = null;
	}
	public int getKey() {
		return key;
	}
	public Object getValue() {
		return value;
	}
}

