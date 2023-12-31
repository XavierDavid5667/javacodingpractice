package com.package1;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * 
 * Find the missing number in the list
 *
 */

public class Program1 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 7, 8, 9, 10 };
		int n = arr.length;
		int sumOfSequnce = (n + 1) * (n + 2) / 2;
		System.out.println(sumOfSequnce);
		Stream<Integer> mapToObj = Arrays.stream(arr).mapToObj(i -> (Integer) i);
		Integer reduce = mapToObj.reduce(0, (a, b) -> a + b);
		System.out.println(reduce);
		int diff = sumOfSequnce - reduce;
		System.out.println("Missing number in the array is: " + diff);

	}
}
