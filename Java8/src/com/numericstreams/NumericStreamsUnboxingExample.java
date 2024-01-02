package com.numericstreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamsUnboxingExample {
	
	public static void boxing() {
		List<Integer> collect = IntStream.rangeClosed(1, 10)
		//int
		.boxed()
		//Integer
		.collect(Collectors.toList());
		System.out.println(collect);
	}
	public static void unBoxing(List<Integer> integerList){
		//wrapper to primitive
		int sum = integerList.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum);
		
	}
	public static void main(String[] args) {
      boxing();
      unBoxing(List.of(1,2,3,4,5,9,10));
	}
}
