package com.nagarro.training.queue;

public class Queue {
	int front;
	int rear;
	
	int size = 9;
	int[] object;
	Queue(){
		front = -1;
		rear = -1;
		object = new int[size];
	}
	
	//to check if queue is empty
	boolean iSEmpty() {
		if(rear <= front) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//adding a element
	public int enqueue(int data) {
		return object[++rear] = data; 
	}
	
	
	//removing a element
	@SuppressWarnings("null")
	public int dequeue() {
		if(rear <= front) {
			System.out.println("queue is empty!");
		}
		if(rear >= front) {
			return object[++front];
		}
		return (Integer) null;
	}
	
	
	
	//display
	public void display() {
		for(int i=0 ; i<=rear ; i++) {
			System.out.println("Element added = " + object[i]);
		}
	}
	
	//peek of queue
	//element at the front 
	public void peek() {
		if(rear <= front) {
			System.out.println("queue is Empty!");
		}
			System.out.println("Peek gived =" + object[0]);  
	}
	
	//contains
	public void contains(int item) {
		boolean flag= false;
		for(int i=0 ; i<size ; i++) { 
			if(object[i]==item) {
				flag=true;
				break;
			}}
				System.out.println(flag);
				}
	
	//size of queue
		public int size() {
			return rear-front;
		}
	
	//middle element
	public void middle() {
		int x = size/2;
		int mid = object[x];
		System.out.println("Middle Element is = " + mid);
	}
	
	//sorting of queue
		public void sort() {
			int temp;
			for(int i=0 ; i<size ; i++) {
				for(int j=i+1 ; j<size ; j++) {
					if(object[i]<object[j]) {
						temp = object[i];
						object[i] = object[j];
						object[j] = temp;
					}
				}
			}
		for(int i=0 ; i<size ; i++) {
		System.out.print(object[i]);
		}}
	
		
		//Reverse the queue
		public void reverse() {
			for(int i=size-1 ; i>0 ; i--) {
				System.out.println(object[i]);
			}
		}
	
}
