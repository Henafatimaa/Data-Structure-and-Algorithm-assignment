package com.nagarro.training.priority_queue;

public class PriorityQueueExceptions extends Exception {
	private String message; // message variable declaration
	
	public PriorityQueueExceptions(String message) {

		this.message = message;}
		
		
	public void message() {
		System.out.println(this.message);
	}

}
	
