package com.generic.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountPairsWitInArray {

	public void getPairsCount(int arr[], int n) {
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		for (int i = 0; i < n; i++)
			for (int j = i + 1; j < n; j++) {
				Integer data = arr[i] + arr[j];

				if (list.contains(data)) {
					System.out.println("i: "+arr[i]+" j: "+arr[j]+" === "+data);
				}
			}
	}

	public static void main(String[] args) {
		int arr[] = new int[99];
		int c=0;
		for (int i = 2; i <= 100; i++) {
			arr[c] = i * i;
			c++;
		}
		new CountPairsWitInArray().getPairsCount(arr, arr.length);
	}
}
