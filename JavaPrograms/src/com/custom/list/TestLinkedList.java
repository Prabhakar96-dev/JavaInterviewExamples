package com.custom.list;

public class TestLinkedList {

	public static void main(String[] args) {

		MyLinkedList<Integer> list=new MyLinkedList<>();
		list.addElement(0);
		list.addElement(1);
		list.addElement(2);
		list.addElement(3);
		//Print Elements
		list.printElements();
		list.addFirst(4);
		list.printElements();
		list.addElement(1,5);
		list.printElements();
		list.size();
		list.remove(1);
		list.printElements();
		list.size();
		list.remove(2,5);
		list.printElements();
		list.size();
		
	}

}
