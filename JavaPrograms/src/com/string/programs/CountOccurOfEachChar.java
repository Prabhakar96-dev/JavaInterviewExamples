package com.string.programs;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountOccurOfEachChar {

	public static Map<Character, Integer> count(String str) {
		Map<Character, Integer> map = new HashMap<>();
		if (str != null) {
			char[] charArray = str.toCharArray();
			for (char ch : charArray) {
				if (map.containsKey(ch)) {
					map.put(ch, map.get(ch) + 1);
				} else {
					map.put(ch, 1);
				}
			}
		}
		return map;
	}
 
	//Using JAVA 8
    public static Map<Character, Long>  frequencyMap(Stream<Character> elements) {
        return elements.collect(
            Collectors.groupingBy(
            Function.identity(),
            Collectors.counting()
            )
        );
    }
    
	public static void main(String[] args) {
		Map<Character, Integer> countMap = count("Prabhakar");
		System.out.println(countMap);
		System.out.println("===========  java 8  =========");
		System.out.println(frequencyMap("Prabhakar".chars().mapToObj(c -> (char) c)));
	}
}
