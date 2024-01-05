package com.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CustomSorting {
	public static void main(String[] args) {
     
		List<Employee>userList=Arrays.asList(new Employee("John",33),new Employee("Robert",26),new Employee("Mark",26),new Employee("Brandon",42));
		System.out.println(userList);
		
		List<Employee> collect = userList.stream().sorted(Comparator.comparingInt(Employee::getAge)).collect(Collectors.toList());
		System.out.println("Ascending or natural order :"+collect);
		
		List<Employee> collect2 = userList.stream().sorted(Comparator.comparingInt(Employee::getAge).reversed()).collect(Collectors.toList());
		System.out.println(collect2);
		
	}
}
