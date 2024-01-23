package com.jan23;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program3 {
	public static void main(String[] args) {
     
		String str = "Hello, World!";

		// Collect characters to a new string
String reduce = str.chars().mapToObj(ch -> String.valueOf((char) ch)).reduce((a,b)->b+a).get();
System.out.println(reduce);
		                  // .collect(Collectors.joining("-","{","}"));
		//System.out.println(result);
	}
}
