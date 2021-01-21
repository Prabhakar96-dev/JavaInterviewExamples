package com.data.structures;

public class TestStack {
	public static void main(String[] args) {
		Stack s = new Stack(3);
		s.push(10);
		s.push(11);
		s.push(12);
		s.pop();
		s.pop();
		s.print();
	}
}
