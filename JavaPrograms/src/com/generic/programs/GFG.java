package com.generic.programs;

public class GFG {
	public static int gcd(int a, int b) {
		if (a == 0)
			return b;
		return gcd(b % a, a);
	}

	public static void main(String[] args) {
		int a = 98, b = 56, g;
		g = gcd(a, b);
		System.out.println("GCD(" + a + " , " + b + ") = " + g);
	}

}
