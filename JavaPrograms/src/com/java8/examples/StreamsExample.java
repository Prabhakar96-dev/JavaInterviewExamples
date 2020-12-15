package com.java8.examples;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsExample {
	public static void filetr() {

		List<String> lines = Arrays.asList("spring", "node", "mkyong");

		List<String> result = lines.stream().filter(line -> !"mkyong".equals(line)).collect(Collectors.toList());

		result.forEach(System.out::println);
	}

	public static void map() {
		List<String> alpha = Arrays.asList("a", "b", "c", "d");

		List<String> collect = alpha.stream().map(String::toUpperCase).collect(Collectors.toList());

		System.out.println(collect);
	}

	public static void flatMap() {
		List<String> l1 = Arrays.asList("a", "b");
		List<String> l2 = Arrays.asList("c", "d");

		List<String> betterLetters = Stream.of(l1, l2).flatMap(List::stream).map(String::toUpperCase)
				.collect(Collectors.toList());

		System.out.println(betterLetters);
	}

	public static void parallel() throws IOException {

		File fileName = new File("M:\\Documents\\Textfile.txt");
		Stream<String> text = Files.lines(fileName.toPath());
		text.parallel().forEach(System.out::println);
		text.close();
	}

	public static void fibonanic() {

		Stream.iterate(new int[] { 0, 1 }, n -> new int[] { n[1], n[0] + n[1] }).limit(20).map(n -> n[0])
				.forEach(x -> System.out.println(x));
	}

	public static void main(String[] args) {
		filetr();// stream.filter
	}
}
