package com.collections;

import java.util.ArrayList;

public class ArrayListAddTest {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("100");
		list.add("50");
		list.add("40");
		list.add("30");
		System.out.println(list);
		list.set(1, "10");
		System.out.println(list);
		list.add(1, "20");
		System.out.println(list);
		list.set(1, "11");
		System.out.println(list);
	}

}
