package com.string.programs;

public class ReverseEachWord {

	static void reverseEachWordOfString(String inputString) {
		String[] words = inputString.split(" ");
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			for (int j = word.length() - 1; j >= 0; j--) {
				builder.append(word.charAt(j));
			}
			builder.append(" ");
		}
		System.out.println(builder.toString());
	}

	public static void main(String[] args) {
		reverseEachWordOfString("Java Concept Of The Day");
	}
}
