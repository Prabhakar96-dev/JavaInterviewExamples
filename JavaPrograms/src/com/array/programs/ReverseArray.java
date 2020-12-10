package com.array.programs;

public class ReverseArray {

	public static void reverseArray(int a[]) {
		int temp;
		for (int i = 0; i < a.length / 2; i++) {
			temp = a[i];
			a[i] = a[a.length - 1 - i];
			a[a.length - 1 - i] = temp;
		}

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {
		reverseArray(new int[] { 45, 51, 28, 75, 49, 42 });
	}
}
