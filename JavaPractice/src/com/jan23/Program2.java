package com.jan23;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Program2 {
	public static void main(String[] args) {
		 List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
		 int asInt = myList.stream().mapToInt(i->i).max().getAsInt();
		 System.out.println(asInt);
		 Integer integer = myList.stream().max(Integer::compare).get();
		 System.out.println(integer);
	}
}
