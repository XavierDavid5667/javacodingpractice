package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CustomComparator {
	public static void main(String[] args) {
		List<Employee>userList=Arrays.asList(new Employee("John",33),new Employee("Robert",26),new Employee("Mark",26),new Employee("Brandon",42));
		 List<Employee> collect = userList.stream().sorted((emp1,emp2)->{
			   int value= emp1.getAge()-emp2.getAge();
			   if(value==0) {
				   return emp1.getName().compareTo(emp2.getName());
			   }else if(value>=1) {
				   return 1;
			   }else {
				   return -1;
			   }
	
		 }).collect(Collectors.toList());
		 System.out.println(collect);
	}
}
