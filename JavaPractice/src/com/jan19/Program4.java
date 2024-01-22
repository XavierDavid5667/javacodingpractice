package com.jan19;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program4 {
	public static void main(String[] args) {
     String str="laptop";
     LinkedHashMap<Character, Long> collect = str.chars().mapToObj(i->Character.valueOf((char)i)).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
     collect.entrySet().stream().filter(e->e.getValue()>1L).forEach(entry->System.out.println(entry.getKey()));;
	}
}
