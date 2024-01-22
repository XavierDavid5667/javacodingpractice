package com.jan19;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

// program to calculate the count of characters in the given string
public class Program3 {
	public static void main(String[] args) {
		String str="Java is object oriented language";
		String replaceAll = str.replaceAll(" ", "");
		LinkedHashMap<Character, Long> collect = replaceAll.toLowerCase().chars().mapToObj(i->Character.valueOf((char)i)).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
		System.out.println(collect);
		
	}
}
