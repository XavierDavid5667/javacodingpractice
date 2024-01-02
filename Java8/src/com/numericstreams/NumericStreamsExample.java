package com.numericstreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamsExample {

	public static int sumOfNumbers(List<Integer> integerList) {
		return integerList.stream().reduce(0, (a, b) -> a + b); //unboxing to convert the Integer to int
	}
	
	public static int sumOfNNumbersIntStream() {
	   return IntStream.rangeClosed(1, 6).sum();
	}

	public static void main(String[] args) {
		List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6);
		System.out.println(sumOfNumbers(integerList));
		System.out.println(sumOfNNumbersIntStream());
	}
}
