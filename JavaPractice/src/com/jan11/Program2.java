//package com.jan11;
//
//import java.util.LinkedHashMap;
//import java.util.Scanner;
//import java.util.function.Function;
//import java.util.stream.Collectors;
//
//public class Program2 {
//	
//	
//	public static String nonRepeatingCharacters(String s) {
//		s.chars().mapToObj(c->Character.valueOf((char)c).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting())));
//		return null;
//	}
//	public static void main(String[] args) {
//      Scanner scanner=new Scanner(System.in);
//      System.out.println("Enter the String");
//      String str=scanner.next();
//      String nonRepeatingCharacters = nonRepeatingCharacters(str);
//		
//	}
//}
