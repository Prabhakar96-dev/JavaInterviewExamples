package com.array.programs;

import java.util.Arrays;

public class SubArrayWhoseSumIsNumber {
	static void findSubArray(int[] inputArray, int inputNumber) {
		int sum = 0;
		int start = 0;
		for (int i = 0; i < inputArray.length; i++) {
			sum = sum + inputArray[i];
			while (sum > inputNumber) {
				sum = sum - inputArray[start];
				start++;
			}
			if (sum == inputNumber) {
				System.out.println("Continuous sub array of " + Arrays.toString(inputArray) + " whose sum is "
						+ inputNumber + " is ");

				for (int j = start; j <= i; j++) {
					System.out.print(inputArray[j] + " ");
				}
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		findSubArray(new int[] { 42, 15, 12, 8, 6, 32 ,14,12}, 26);
	}
}
