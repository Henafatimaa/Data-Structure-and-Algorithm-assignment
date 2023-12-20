package com.nagarro.training.hashtable;

import java.util.Iterator;
import java.util.ArrayList;

public class hashTable<T> {
	Entry[] arrayHash;
	int size;
	
	//	constructor
	
	public hashTable(int size) {
		this.size = size;
		arrayHash = new Entry[size];
		for(int i=0;i<size;i++) {
			arrayHash[i] = new Entry();
		}
	}
	
	/*
	 * function for get hash index value
	 * */
	
	int getHash(int key) {
		return key%size;
	}
	
	/*
	 * Insert function 
	 * */
	
	public void insert(int key, Object value) {
		int hashIndex = getHash(key);
		Entry arrayValue = arrayHash[hashIndex];
		Entry newItem  = new Entry(key, value);
		newItem.next = arrayValue.next;
		arrayValue.next = newItem;
	}
	
	/*
	 * Get value by Key 
	 * */
	
	public T get(int key) {
		T value = null;
		int hashIndex = getHash(key);
		Entry arrayValue = arrayHash[hashIndex];
		while(arrayValue!=null) {
			if(arrayValue.getKey()==key) {
				value = (T) arrayValue.getValue();
				break;
			}
			arrayValue = arrayValue.next;
		}
		
		return value;
	}
	
	/*
	 * IsContains function 
	 * */
	
	public boolean isContains(String value) {
		boolean status = false;
		for(int i=0;i<size;i++) {
			if(arrayHash[i].next!=null) {
				Entry arrayValue = arrayHash[i].next;
				while(arrayValue!=null) {
					if(arrayValue.getValue()==value) {
						status = true;
						break;
					}
					arrayValue = arrayValue.next;
				}
			}
		}
		return status;
	}
	
	/*
	 * Size function
	 * */
	public int size_numberOfItems() {
		int numberOfItems = 0;
		for(int i=0;i<size;i++) {
			if(arrayHash[i].next!=null) {
				Entry arrayValue = arrayHash[i].next;
				while(arrayValue!=null) {
					numberOfItems+=1;
					arrayValue = arrayValue.next;
				}
			}
		}
		return numberOfItems;
	}
	
	/*
	 * Print/Traverse function
	 * */
	
	public void Print() {
		for(int i=0;i<size;i++) {
			if(arrayHash[i].next!=null) {
				Entry arrayValue = arrayHash[i].next;
				while(arrayValue!=null) {
					System.out.println("{key : "+arrayValue.getKey()+", value : "+arrayValue.getValue()+"}");
					arrayValue = arrayValue.next;
				}
			}
		}
	}
	
	/*
	 * Iterator function
	 * */
	
	public Iterator getiterator() {
		ArrayList<String> allItems = new ArrayList<String>();
		for(int i=0;i<size;i++) {
			if(arrayHash[i].next!=null) {
				Entry arrayValue = arrayHash[i].next;
				while(arrayValue!=null) {
					allItems.add(arrayValue.getValue().toString());
					arrayValue = arrayValue.next;
				}
			}
		}
		Iterator it = allItems.iterator();
		return it;
	}

}
