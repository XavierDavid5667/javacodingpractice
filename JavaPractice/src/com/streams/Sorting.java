package com.streams;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
public class Sorting {
	public static void main(String[] args) {
     
		List<Integer> asList = Arrays.asList(10, 23, -4, 0, 18);
		List<Integer> collect = asList.stream().sorted().collect(Collectors.toList());
		System.out.println("Natural or ascending order :"+collect);
		
		List<Integer> collect2 = asList.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println("Reverse or descending order :"+collect2);
		
		List<String> asList2 = Arrays.asList("John", "Mark", "Robert", "Lucas", "Brandon");
		List<String> collect3 = asList2.stream().sorted().collect(Collectors.toList());
		System.out.println("Natural order "+collect3);
		
		List<String> collect4 = asList2.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println("Descending order "+collect4);
		
		
	}
}
