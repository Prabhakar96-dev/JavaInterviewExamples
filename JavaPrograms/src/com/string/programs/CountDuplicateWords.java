package com.string.programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountDuplicateWords {

	public static Map<String, Integer> count(String str) {
		Map<String, Integer> map = new HashMap<>();
		if (str != null) {
				String[] split = str.split(" ");
			for (String s : split) {
				if (map.containsKey(s)) {
					map.put(s, map.get(s) + 1);
				} else {
					map.put(s, 1);
				}
			}
		}
		return map;
	}

	//Using JAVA 8
    public static  Map<String, Long>  frequencyMap(Stream<String> elements) {
        return elements.collect(
            Collectors.groupingBy(
            Function.identity(),
            Collectors.counting()
            )
        );
    }
    
	public static void main(String[] args) {
		Map<String, Integer> countMap = count("Prabhakar billingi prabha billingi");
		System.out.println(countMap);
		System.out.println("===========  java 8  =========");
		List<String> words = Arrays.asList("hello", "hello", "mighty");
        System.out.println(frequencyMap(words.stream()));
	}
}
