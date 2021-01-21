package com.data.structures;

public class Queue {
	private int capacity;
	int queueArr[];
	int front;
	int rear;
	int currentSize = 0;

	public Queue(int sizeOfQueue) {
		this.capacity = sizeOfQueue;
		front = 0;
		rear = -1;
		queueArr = new int[this.capacity];
	}

	public boolean isFull() {
		if (currentSize == capacity) {
			return true;
		}
		return false;
	}
}
