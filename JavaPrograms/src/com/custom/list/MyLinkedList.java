package com.custom.list;

public class MyLinkedList<T> {
	private Node<T> head;
	private int size;

	public void addElement(T data) {
		if (head == null) {
			head = new Node<T>(data);
		} else {
			Node<T> newNode = new Node<T>(data);
			Node<T> currentNode = head;
			while (currentNode.getNext() != null) {
				currentNode = currentNode.getNext();
			}
			currentNode.setNext(newNode);
		}
		this.size++;
	}

	public void addElement(int index, T data) {
		if (index < 0 || size < index)
			throw new IllegalArgumentException();
		if (index == 0) {
			Node<T> newNode = new Node<T>(data);
			newNode.setNext(head);
			head = newNode;
		} else {
			Node<T> currentNode = head;
			for (int i = 0; i < index - 1; i++)
				currentNode = currentNode.getNext();
			Node<T> newNode = new Node<T>(data);
			newNode.setNext(currentNode.getNext());
			currentNode.setNext(newNode);
			this.size++;
		}
	}

	public void addFirst(T data) {

		Node<T> newNode = new Node<T>(data);
		newNode.setNext(head);
		head = newNode;

		this.size++;
	}

	public void remove(T data) {
		// Store head node
		Node<T> temp = head, prev = null;
		// If head node itself holds the key to be deleted
		if (temp != null && temp.getData() == data) {
			head = temp.getNext(); // Changed head
			this.size--;
			return;
		}

		// Search for the key to be deleted, keep track of the
		// previous node as we need to change temp.next
		while (temp != null && temp.getData() != data) {
			prev = temp;
			temp = temp.getNext();
		}

		// If key was not present in linked list
		if (temp == null)
			return;

		// Unlink the node from linked list
		prev.setNext(temp.getNext());
		this.size--;
	}

	public void remove(int index, T data) {
		// Store head node
		Node<T> temp = head, prev = null;

		if (index < 0 || size < index)
			throw new IllegalArgumentException();
		if (index == 0 && temp != null && temp.getData() == data) {
			head = temp.getNext();
			return;
		} else {
			for (int i = 0; i < index - 1; i++) {
				prev = temp;
				temp = temp.getNext();
			}
			if (temp == null)
				return;

			if (temp.getData() == data)
				prev.setNext(temp.getNext());
			this.size--;
		}

	}

	public void printMiddle() {
		Node<T> slow = head;
		Node<T> fast = head;
		while(fast!=null && fast.getNext()!=null) {
			slow=slow.getNext();
			fast=fast.getNext().getNext();
		}
		System.out.println(slow.getData());
	}

	public void printMiddle1() {
		Node<T> mid = head;
		Node<T> prev = head;
		int count =0;
		while(prev!=null) {
			if((count%2)==1) {
				mid=mid.getNext();
			}
			prev=prev.getNext();
			count++;
		}
		System.out.println(mid.getData());
	}

	public void removeMiddle() {
		Node<T> mid = head;
		Node<T> prev = head;
		int count =0;
		while(prev!=null) {
			if((count%2)==1) {
				mid=mid.getNext();
			}
			prev=prev.getNext();
			count++;
		}
		remove(mid.getData());
	}
	
	
	public void printElements() {
		System.out.println(" ");
		Node<T> result = head;

		while (result != null) {
			System.out.print(result.getData());
			result = result.getNext();
			System.out.print(" ");
		}
		System.out.println();
	}
	public void size() {
		System.out.println("size: "+size);
	}
}
