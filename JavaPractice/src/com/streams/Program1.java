package com.streams;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 * Q1) Given a list of integers, find out all the even numbers exist
 * in the list using Stream functions? list=[2,34,678,3]
 *
 */
public class Program1 {
	public static void main(String[] args) {
		List<Integer> list=List.of(2,34,678,3);
		List<Integer> collect = list.stream().filter(num->num%2==0).collect(Collectors.toList());
		System.out.println(collect);
	}
}
