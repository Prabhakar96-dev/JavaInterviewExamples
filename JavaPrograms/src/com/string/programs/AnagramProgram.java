package com.string.programs;

public class AnagramProgram {
	static void isAnagram(String s1, String s2) {
		String copyOfs1 = s1.replaceAll("\s", "").toLowerCase();
		String copyOfs2 = s2.replaceAll("\s", "").toLowerCase();
		boolean status = true;
		if (copyOfs1.length() != copyOfs2.length()) {
			status = false;
		} else {
			char[] s1ToArray = copyOfs1.toCharArray();
			for (char c : s1ToArray) {
				int index = copyOfs2.indexOf(c);
				if (index != -1) {
					copyOfs2 = copyOfs2.substring(0, index) + copyOfs2.substring(index + 1, copyOfs2.length());
				} else {
					status = false;
					break;
				}
			}
		}
		if (status) {
			System.out.println("anagrams");
		} else {
			System.out.println("are not anagrams");
		}
	}

	public static void main(String[] args) {
		isAnagram("keep", "peek");
	}
}
