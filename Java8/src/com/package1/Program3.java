package com.package1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Write a program to find duplicate elements in a list using stream api
 * 
 * @author xdavid
 *
 */
public class Program3 {
	public static void main(String[] args) {
    List<String>list=Arrays.asList("apple","banana","oranges","grapes","oranges","kiwi");
    Map<String, Long> collect = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
    collect.forEach((element,count)->{
    	if(count>1) {
    		System.out.println(element);
    	}
    });
}
}
