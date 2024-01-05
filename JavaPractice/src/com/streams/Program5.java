package com.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
 * * Given a list of integers, find the maximum 
 * value element present in it using Stream functions?
 */
public class Program5 {
	public static void main(String[] args) {
		List<Integer>list= Arrays.asList(1,2,3,4,5,6,44,55,66,77,23,999,100);
		Integer integer = list.stream().max(Comparator.naturalOrder()).get();
		System.out.println(integer);
	}
}
