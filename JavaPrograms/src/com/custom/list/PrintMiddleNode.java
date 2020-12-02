package com.custom.list;

public class PrintMiddleNode {

	public static void main(String[] args) {

		MyLinkedList<Integer> list = new MyLinkedList<>();
		list.addElement(0);
		list.addElement(1);
		list.addElement(2);
		list.addElement(3);
		list.addElement(4);
		list.addElement(5);
		list.addElement(6);
		list.printElements();
		list.printMiddle();
		list.printMiddle1();
		list.removeMiddle();
		list.printElements();
	}
}
