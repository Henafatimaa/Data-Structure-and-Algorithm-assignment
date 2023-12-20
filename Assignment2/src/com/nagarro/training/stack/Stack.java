package com.nagarro.training.stack;

public class Stack {
		
		int top;
		int size;
		int[] stack;
		
		Stack(){
			top = -1;    /**condition for stack to be empty*/
			size = 10;
			stack = new int[size];
		}
		
		public boolean isEmpty() {
			  if(top == -1) {
				  return  true;
			  }
			  else {
				  return false;
			  }
		}
		
		public boolean isFull() {
			if(top == size-1){
			return  true;	
			}
			else {
				return false;
			}
		} 

		/**Pushing element in stack.*/
		public int push(int item) {
			if(top == size-1) {
				System.out.println("StackOverFlow");
			}
				return stack[++top] = item;
//				size=size+1;
			}
		
		/**Remove a element in stack*/
		public int pop() {
			if(top == -1) {
				System.out.println("StackUnderFlow");
			}
				return stack[top--];
		}
		
		/**fetching for top element in stack.*/
		public int peek() {
			if(isEmpty() == true) {
				System.out.println("Stack is Empty!");
			}
				return stack[top];
		}
		
		
		/**displaying the element present in stack*/
		public void display() {
			
		for(int i=0 ; i<=top ; i++) {
			System.out.println(stack[i]);
		}
		}
		
		/**contains function*/
		public void contains(int item) {
			boolean flag= false;
			for(int i=0 ; i<size ; i++) { 
				if(stack[i]==item) {
					flag=true;
					break;
				}}
					System.out.println(flag);
					}
		
		/**size*/
		public void size() {
			System.out.println(size);
		}
		
		/**middle element*/
		
		public void middle() {
			int x = size/2;
			int mid = stack[x];
			System.out.println(mid);
		}

		/**sorting of stack*/
		
		public void sort() {
			int temp;
			for(int i=0 ; i<size ; i++) {
				for(int j=i+1 ; j<size ; j++) {
					if(stack[i]<stack[j]) {
						temp = stack[i];
						stack[i] = stack[j];
						stack[j] = temp;
					}
				}
			}
		for(int i=0 ; i<size ; i++) {
			System.out.println(stack[i]);
		}
		
		}
		
		/**iterator*/
		
		/**Reverse the stack*/
		public void reverse() {
			for(int i=size-1 ; i>0 ; i--) {
				System.out.println(stack[i]);
			}
		}
		
}
