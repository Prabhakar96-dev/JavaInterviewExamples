package com.generic.programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class WeekDay {
	public static String solution(String day, int k) {
	    String[] days = {"Mon", "Tue", "Wed", 
	                           "Thu", "Fri", "Sat","Sun"};
	    List<String> list=Arrays.asList(days);
	    HashMap<String, Integer> map = new HashMap<>();
	    map.put("Mon", 0);
	    map.put("Tue", 1);
	    map.put("Wed", 2);
	    map.put("Thu", 3);
	    map.put("Fri", 4);
	    map.put("Sat", 5);
	    map.put("Sun", 6);
	    return list.get((map.get(day) + k) % 7);
	}
	
	public static void main(String[] args) {
		System.out.println(solution("Wed", 2));
	}
}
