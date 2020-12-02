package com.string.programs;

public class SwapTwoStrings {
	public static void swap(String s1,String s2) {
		System.out.println("before swap: s1 : "+s1+" s2: "+s2);
		
		s1=s1+s2;
		s2=s1.substring(0,s1.length()-s2.length());
		s1=s1.substring(s2.length(),s1.length());
		System.out.println("S1: "+s1+" S2: "+s2);
	}

	public static void main(String[] args) {
		swap("prabha", "billingi");
	}
}
