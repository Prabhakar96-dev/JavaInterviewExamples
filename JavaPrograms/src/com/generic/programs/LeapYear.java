package com.generic.programs;

public class LeapYear {
	static boolean checkYear(int year) {
		return (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0));
	}

	public static void main(String[] args) {
		int year = 100;
		System.out.println(checkYear(year) ? "Leap Year" : "Not a Leap Year");
	}

}
