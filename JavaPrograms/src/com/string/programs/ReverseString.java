package com.string.programs;

public class ReverseString {

	public static void reverse(String str) {
		char[] strArray = str.toCharArray();
		for (int i = strArray.length - 1; i >= 0; i--) {
			System.out.print(strArray[i]);
		}
	}
	
	public static String recursiveMethod(String str) {
		if(str==null || str.length()<=1) {
			return str;
		}
		return recursiveMethod(str.substring(1))+str.charAt(0);
	}

	public static void main(String[] args) {
		reverse("Prabhakar");
		System.out.println("");
		System.out.println("=============");
		String recursiveMethod = recursiveMethod("Prabhakar");
		System.out.println(recursiveMethod);
		
	}
}
