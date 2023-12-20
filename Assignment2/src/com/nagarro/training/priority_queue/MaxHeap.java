package com.nagarro.training.priority_queue;

public class MaxHeap {
	public static int heap[];
	public static int maxSize;


	public MaxHeap(int maxSize) {
		this.maxSize = maxSize;
		MaxHeap.heap = new int[maxSize];
	}

	public static int[] getHeap() {
		return heap;
	}

	public static void setHeap(int[] heap) {
		MaxHeap.heap = heap;
	}

	// return the maxSize
	public static int getMaxSize() {
		return maxSize;
	}

	/**
	 maxSize the maxSize to set
	 */
	public static void setMaxSize(int maxSize) {
		MaxHeap.maxSize = maxSize;
	}


}
