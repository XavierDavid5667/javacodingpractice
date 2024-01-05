package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupingByEaxmple {
	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(new Employee("Xavier", 23), new Employee("Gokulakrishnan", 22),
				new Employee("Varun", 23), new Employee("Puthin", 23));
        
		Map<Integer, List<Employee>> collect = list.stream().collect(Collectors.groupingBy(e->e.getName().length(),Collectors.mapping(Function.identity(),Collectors.toList())));
		System.out.println(collect);
		
	}
}
