package com.streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 *
 *  Q3) How to find duplicate elements in a given integers list 
 *  in java using Stream functions?
 *
 */
public class Program4 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 5, 6, 7, 8, 5, 7, 9, 10);
		Set<Integer>set=new HashSet<>();
		List<Integer> collect = list.stream().filter(num->!set.add(num)).collect(Collectors.toList());
		System.out.println(collect);
	}
}
