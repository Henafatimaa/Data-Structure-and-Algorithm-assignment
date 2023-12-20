package com.nagarro.training.priority_queue;
import java.util.Scanner;


public class PriorityQueueOperationsImp implements PriorityQueueOperation  {
	int sizeOfHeap = -1;

	/**
	 * This is a menu of operations that can be conducted on particular data
	 * structure.
	 */
	public void operationMenu() {
		System.out.println("Implementation of Max Priority Queue via Heap:");
		System.out.println("Enter Number according to your choice:");
		System.out.println("**********MANU**********");
		System.out.println("1 : Enqueue");
		System.out.println("2 : Dequeue(Highest Priority)");
		System.out.println("3 : Peek(Highest Priority)");
		System.out.println("4 : Contain");
		System.out.println("5 : Size");
		System.out.println("6 : Reverse");
		System.out.println("7 : Center");
		System.out.println("8 : Iterator");
		System.out.println("9 : Traverse");
	}

	/**
	 * return choice whether yes or no for performing further operations
	
	 */
	public String choice() {
		try {
			String choice; // Declaration of choice variable
			Scanner sc = new Scanner(System.in); // creating object for scanner class
			System.out.println("Do you want to perform another operation(y/n):");
			choice = sc.nextLine(); // taking value for choice
			if ((!choice.equalsIgnoreCase(PriorityQueueConstants.NO))
					&& (!choice.equalsIgnoreCase(PriorityQueueConstants.YES))) {
				throw new PriorityQueueExceptions(PriorityQueueConstants.MESSAGE_1);
			}
			return choice;
		} catch (PriorityQueueExceptions e) {
			e.message();
			return choice();
		}
	}

	/**
	 * return integer according to the choice from given menu
	 * 
	
	 */
	public int menuChoice() {
		int menuChoice;
		try {
			operationMenu();
			Scanner sc = new Scanner(System.in); // creating object for scanner class
			// sc.nextLine();
			menuChoice = Integer.parseInt(sc.nextLine());
			// for empty check
			return menuChoice;
		} catch (NumberFormatException e) {

			System.out.println(PriorityQueueConstants.MESSAGE_2);
			return menuChoice();
		}
	}

	/**
	 * swap given variable with the help of third variable
	
	 */
	public void swap(int a, int b) {
		int temp;
		temp = MaxHeap.heap[a];
		MaxHeap.heap[a] = MaxHeap.heap[b];
		MaxHeap.heap[b] = temp;
	}

	/**
	 * return true when queue is empty else return false
	 *
	 * 
	 */
	public boolean isEmpty() {
		if (sizeOfHeap < 0) {
			return true;
		}
		return false;
	}

	/**
	 * return true when queue is full else return false
	 
	 * 
	 */
	public boolean isFull() {
		if (sizeOfHeap == MaxHeap.maxSize) {
			return true;
		}
		return false;
	}

	/**
	 * arranging the nodes in correct order so that they follow max-heap property
	 * 
	 */
	public void maxHeapify(int[] array, int index) {
		int left = 2 * index + 1;
		int right = 2 * index + 2;
		int largest;
		if (left <= sizeOfHeap && array[left] > array[index]) {
			largest = left;
		} else {
			largest = index;
		}
		if (right <= sizeOfHeap && array[right] > array[index]) {
			largest = right;
		}

		if (largest != index) {
			swap(index, largest);
			maxHeapify(array, largest);
		}
	}

	/**
	 * shift value at their respective location according to the priority
	 
	 */
	public void increaseValue(int i) {
		while (i > 0 && MaxHeap.heap[(i - 1) / 2] < MaxHeap.heap[i]) {
			swap((i - 1) / 2, i);
			i = (i - 1) / 2;
		}
	}

	/**
	 * insert given data according to their priority
	 *
	 */
	public void enqueue(int data) {
		if (isFull()) {
			System.out.println(PriorityQueueConstants.QUEUE_OVERFLOW);
		}
		sizeOfHeap++;
		MaxHeap.heap[sizeOfHeap] = data;
		increaseValue(sizeOfHeap);

	}

	/**
	 * delete least priority element from priority queue
	 */
	public void dequeue() {
		if (isEmpty()) {
			System.out.println(PriorityQueueConstants.QUEUE_UNDERFLOW);
		}
		int max = MaxHeap.heap[0];
		MaxHeap.heap[0] = MaxHeap.heap[sizeOfHeap];
		sizeOfHeap--;
		maxHeapify(MaxHeap.heap, 0);

	}

	/**
	 * return highest priority element
	 * 
	 
	 */
	public int peek() {
		return MaxHeap.heap[0];
	}

	/**
	 * check given data element exist or not
	 
	 */
	public boolean contains(int data) {
		for (int i = 0; i <= sizeOfHeap; i++) {
			if (MaxHeap.heap[i] == data) {
				return true;
			}
		}
		return false;
	}

	/**
	 * print size of priority queue
	 */
	public void size() {
		if (isEmpty()) {
			System.out.println(PriorityQueueConstants.QUEUE_UNDERFLOW);
			return;
		} else {
			System.out.println("Size of Priority Queue is:" + (sizeOfHeap + 1));
		}

	}

	/**
	 * reverse given priority queue
	
	 */
	public void reverse(int[] heap) {
		if (isEmpty()) {
			System.out.println(PriorityQueueConstants.QUEUE_UNDERFLOW);
			return;
		} else {
			int temp;
			for (int i = 0; i <= sizeOfHeap / 2; i++) {
				temp = heap[i];
				heap[i] = heap[sizeOfHeap - i];
				heap[sizeOfHeap - i] = temp;
			}
		}
	}

	/**
	 * print center element for given queue if number of elements are even the print
	
	 */
	public void center(int[] queue) {
		if (isEmpty()) {
			System.out.println(PriorityQueueConstants.QUEUE_UNDERFLOW);
			return;
		} else {
			int index = (sizeOfHeap + 1) / 2;
			if ((sizeOfHeap + 1) % 2 == 0) {
				System.out.println("Center when no of elements are even:" + MaxHeap.heap[index - 1] + " and "
						+ MaxHeap.heap[index]);
			} else {
				System.out.println("Center when no of elements are odd:" + MaxHeap.heap[index]);
			}
		}
	}

	/**
	 * print priority from given index value
	
	 */
	public void iterator(int index) {
		if (index > sizeOfHeap) {
			System.out.println(index + " is more than heap size.");
			return;
		} else if (isEmpty()) {
			System.out.println(PriorityQueueConstants.QUEUE_UNDERFLOW);
			return;
		} else {
			int i = index;
			System.out.println("Priority Queue Elements:");
			while (i <= sizeOfHeap) {
				System.out.print(MaxHeap.heap[i] + " ");
				i++;
			}
			System.out.println("\n");
		}
	}

	/**
	 * print all elements of priority queue
	 */
	public void traverse() {
		if (isEmpty()) {
			System.out.println(PriorityQueueConstants.QUEUE_UNDERFLOW);
			return;
		} else {
            int i = 0;
			System.out.println("Priority Queue Elements:");
			while (i <= sizeOfHeap) {
				System.out.print(MaxHeap.heap[i] + " ");
				i++;
			}
			System.out.print("\n");
		}

	}

	

}
