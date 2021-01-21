package com.data.structures;

public class Stack {
	int top = -1;
	int max;
	int array[];

	public Stack(int size) {
		max = size;
		array = new int[size];
	}

	public boolean push(int value) {
		if (top >= max - 1) {
			System.out.println("Stack is full");
			return false;
		} else {
			array[++top] = value;
			return true;
		}
	}
	
	public int pop() {
		if(top<0) {
			System.out.println("Stack is empty");
			return 0;
		}else {
			return array[top--];
		}
	}
	
	public void print() {
		for(int i=0;i<=top;i++) {
			System.out.println(array[i]);
		}
	}
}
