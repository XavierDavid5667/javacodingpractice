package com.jan23;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program4 {
	public static void main(String[] args) {
	 String input = "Java articles are Awesome".toLowerCase().replaceAll(" ","");
	  Map<Character, Long> collect = input.chars().mapToObj(i->Character.valueOf((char)i)).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
	  System.out.println(collect);
	  Entry<Character, Long> entry = collect.entrySet().stream().filter(e->e.getValue()==1).findFirst().get();
	  System.out.println(entry.getKey()+" "+entry.getValue() );
	}
}
