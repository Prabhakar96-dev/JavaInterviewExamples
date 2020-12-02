package com.string.programs;

public class RemoveWhiteSpaces {

	public static void withBuiltMethod(String str) {
		String stringWithoutSpaces = str.replaceAll("\s+", "");
		System.out.println(stringWithoutSpaces);
	}
	
	public static void withCustom(String str) {
		String[] split = str.split(" ");
		StringBuilder builder=new StringBuilder();
		for(String s:split) {
			builder.append(s);
		}
		System.out.println("==========");
		System.out.println(builder.toString());
	}
	
	public static void withOutSplit(String str) {
		char[] charArray = str.toCharArray();
		StringBuilder builder=new StringBuilder();
		for(int i=0;i<=charArray.length-1;i++) {
			if(charArray[i]!=' ' || charArray[i]!='\t')
			builder.append(charArray[i]);
		}
		System.out.println("==========");
		System.out.println(builder.toString());
	}
	
	public static void main(String[] args) {
		withBuiltMethod("Hi this is prabhakar");
		withCustom("Hi this is prabhakar");
		withOutSplit("Hi this is prabhakar");
	}
}
