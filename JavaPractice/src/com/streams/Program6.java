package com.streams;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Given a String, find the first non-repeated character in it 
 * using Stream functions?
 * @author xdavid
 *
 */
public class Program6 {
	public static void main(String[] args) {
		 String str="Java articles are Awesome";
		 String replaceAll = str.replaceAll(" ","").toLowerCase();
		 LinkedHashMap<Character, Long> collect = replaceAll.chars().mapToObj(c->Character.valueOf((char)c)).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
		 System.out.println(collect);
		 Character character = collect.entrySet().stream().filter(entry->entry.getValue()==1).map(entry->entry.getKey()).findFirst().get();
		 System.out.println(character);

	}
}
