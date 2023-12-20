package com.nagarro.training.priority_queue;

public interface PriorityQueueOperation {
	public void enqueue(int data);

	/** delete least priority element from priority queue*/
	public void dequeue();

	/**
	 * return highest priority element
	 */
	public int peek();

	/**
	 * check given data element exist or not
	 */
	public boolean contains(int data);

	/**print size of priority queue
	*/
	public void size();

	/** reverse given priority queue*/
	public void reverse(int[] queue);

	/**print center element for given queue if number of elements are even the print
	//both middle elements else only print single middle element*/
	 
	public void center(int[] queue);

	/**
	 * print priority from given index value
	 
	 */
	public void iterator(int index);

	/**
	 * print all elements of priority queue
	 */
	public void traverse();

	/**
	 * This is a menu of operations that can be conducted on particular data
	 * structure.
	 */
	public void operationMenu();

	/**
	 * return choice whether yes or no for performing further operations
	 * 
	 * @return choice
	 */
	public String choice();

	/**
	 * return integer according to the choice from given menu
	 * @return menuChoice
	 */
	public int menuChoice();

	/**
	 * return true when queue is empty else return false
	 * 
	 * @return true for empty else false
	 */
	public boolean isEmpty();

	/**
	 * return true when queue is full else return false
	 * 
	 * @return true if full else false
	 */
	public boolean isFull();

	/**
	 * swap given variable with the help of third variable
	
	 */
	public void swap(int a, int b);

	/**
	 * arranging the nodes in correct order so that they follow max-heap property
	 */
	public void maxHeapify(int[] array, int index);

	/**
	 * shift value at their respective location according to the priority 
	 */
	void increaseValue(int size);

}



