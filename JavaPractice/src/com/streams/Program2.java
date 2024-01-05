package com.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 
 * Given a list of integers, find out all the numbers
 * starting with 1 using Stream functions?
 *
 */
public class Program2 {
	public static void main(String[] args) {
		List<Integer>list= Arrays.asList(12,23,144,45,142,111,445,1101,112,113);
		List<Integer> list2 = list.stream().map(num->String.valueOf(num))
		             .filter((s)->s.startsWith("1"))
		             .map((s)->Integer.valueOf(s))
		             .sorted()
		             .collect(Collectors.toList());
		System.out.println(list2);
	}
}
