package com.nagarro.training.priority_queue;

import java.util.Scanner;
/**Author HenaFatima*/

class main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // creating object for scanner class

		// creating object 
		PriorityQueueOperationsImp pQueueOperation = new PriorityQueueOperationsImp();

		System.out.println("Priority Queue Data Structure Implementation using Max Heap:\n");
		System.out.println("Priority of element decide by its value.");
		System.out.println("(It can only store integer value)\n");
		/* Asking for maximum number of element in priority queue */
		System.out.println("Enter number of elements in Priority Queue:");
		int maxSize = sc.nextInt();

		/* creating object for queue and initializing with maxSize variable */
		MaxHeap heapObj = new MaxHeap(maxSize);

		/* using this for asking which queue operation you want to perform */
		do {

			/* using for performing particular operation according to choice */
			switch (pQueueOperation.menuChoice()) {

			/* insert element inside queue according to their priority */
			case 1:
				System.out.println("Enter value to insert(Integer Value):");
				int data = sc.nextInt();
				pQueueOperation.enqueue(data);
				pQueueOperation.traverse();
				break;

			/* delete least priority element */
			case 2:
				pQueueOperation.dequeue();
				pQueueOperation.traverse();
				break;

			/* print highest priority value */
			case 3:
				if (pQueueOperation.isEmpty()) {
					System.out.println(PriorityQueueConstants.QUEUE_UNDERFLOW);
				} else {
					System.out.println("Top Element of Queue:" + pQueueOperation.peek());
				}
				break;

			/* check given value exist or not */
			case 4:
				System.out.println("Enter element do you want to check(Integer Value):");
				int key = sc.nextInt();
				boolean result = pQueueOperation.contains(key);
				if (result) {
					System.out.println(key + " present in queue.");
				} else {
					System.out.println(key + " is not present in queue.");
				}
				break;

			/* for knowing size of priority queue */
			case 5:
				pQueueOperation.size();
				break;

			/* for reversing priority queue */
			case 6:
				if (pQueueOperation.isEmpty()) {
					System.out.println(PriorityQueueConstants.QUEUE_UNDERFLOW);
				} else {
					pQueueOperation.reverse(MaxHeap.heap);
					pQueueOperation.traverse();
				}
				break;

			/* return center of given priority queue */
			case 7:
				pQueueOperation.center(MaxHeap.heap);
				break;

			/* print priority queue element from given index */
			case 8:
				System.out.println("Enter index(Integer Value):");
				int index = sc.nextInt();
				pQueueOperation.iterator(index);
				break;

			/* print all elements of priority queue */
			case 9:
				pQueueOperation.traverse();
				break;

			/* default in case don't want to perform above operations */
			default:
				System.out.println("\n Wrong Choice!");
				break;
			}
		} while (pQueueOperation.choice().equalsIgnoreCase(PriorityQueueConstants.YES));

	}

}
