package com.java8.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestJava8 {
	static List<Employee> list;
	static {
		list = new ArrayList<>();
		Employee e = new Employee("Prabha", 30);
		Employee e1 = new Employee("x", 10);
		Employee e2 = new Employee("y", 20);
		Employee e3 = new Employee("z", 19);
		Employee e4 = new Employee("a", 40);
		Employee e5 = new Employee("yax", 50);
		Employee e6 = new Employee("zz", 50);
		list.add(e);
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		list.add(e6);
	}
	//filter all the employee age>20
	static void age20AboveEmploye() {
		List<String> collect = list.stream()
				.filter(e -> e.getAge() > 20)
				.map(Employee::getName)
				.collect(Collectors.toList());
		System.out.println(collect);
		
		List<Employee> collect2 = list.stream()
		.filter(e -> e.getAge() > 20)
		.collect(Collectors.toList());
		System.out.println(collect2);
	}
	
	//count number of employees with age >25
	static void countEmploye() {
		List<String> collect = list.stream()
		.filter(e -> e.getAge() > 25)
		.map(Employee::getName)
		.collect(Collectors.toList());
		
		Map<String, Long> collect2 = collect.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(collect2);
		
		long count = list.stream()
		.filter(e -> e.getAge() > 25)
		.count();
		System.out.println("count:"+count);
	}
	
	//List to map by name
	static void toMapEmployee() {
		Map<String, Integer> map = list.stream()
				.collect(Collectors.toMap(Employee::getName, Employee::getAge,(old,newv)->old,LinkedHashMap::new));
		System.out.println(map);
		//Sort map based on key
		
		Map<String, Integer> collect = map.entrySet().stream()
		.sorted(Map.Entry.comparingByKey())
		.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(oldV,newV)->oldV, LinkedHashMap::new));
		System.out.println(collect);
		
		//sort by value
		Map<String, Integer> sortValue = map.entrySet().stream()
				.sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(oldV,newV)->oldV, LinkedHashMap::new));
				System.out.println(sortValue);
	}
	
	//find the employee with name
	static void findEmploye() {
		Optional<Employee> findAny = list.stream()
				.filter(e -> "Prabha".equals(e.getName()))
				.findAny();
		System.out.println(findAny.isPresent()?findAny.get():"Not Found");
	}
	
	//find maximum age of employee
	
	static void maxEmploye() {
		OptionalInt max = list.stream()
		.mapToInt(Employee::getAge)
		.max();
		System.out.println(max.getAsInt());
	}
	
	//find maximum age of employee and Details
	
	static void maxEmployeDetails() {
		 
		 List<Employee> value = list.stream()
	       .collect(Collectors.groupingBy(
	    		   Employee::getName,
	           TreeMap::new,
	           Collectors.toList()
	       ))
	       .lastEntry()
	       .getValue();
		System.out.println("max===> "+value);
	}
	
	//Sort employees
	
	static void sortEmploye() {
		list.sort((e1,e2)->e1.getAge()-e2.getAge());
		System.out.println(list);
	
	}
	
	//remove the duplicate elements from the list.
	static void duplicateRemove() {
	      Integer[] arr=new Integer[]{1,2,3,4,3,2,4,2};
	        List<Integer> listWithDuplicates = Arrays.asList(arr);
	 
	        Set<Integer> setWithoutDups = listWithDuplicates.stream().collect(Collectors.toSet());
	        System.out.println(setWithoutDups);
	}
	
	//GroupBy employee age
		static void groupByEmployeAge() {
		 Map<Integer, List<Employee>> collect = list.stream()
					.collect(Collectors.groupingBy(Employee::getAge));
		 System.out.println(collect);
		}
	public static void main(String[] args) {
		age20AboveEmploye();
		System.out.println("=================");
		countEmploye();
		System.out.println("=================");
		toMapEmployee();
		System.out.println("=================");
		findEmploye();
		System.out.println("=================");
		maxEmploye();
		System.out.println("=================");
		sortEmploye();
		groupByEmployeAge();
		System.out.println("=================");
		maxEmployeDetails();
	}

}
