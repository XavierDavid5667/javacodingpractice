package com.streamsterminal;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import data.Student;
import data.StudentDatabase;

public class StreamsMappingExample {
	public static void main(String[] args) {
		List<String> collect = StudentDatabase.getAllStudents().stream().collect(Collectors.mapping(Student::getName,Collectors.toList()));
		System.out.println("Names List "+collect);
		
		
		Set<String> collect2 = StudentDatabase.getAllStudents().stream().collect(Collectors.mapping(Student::getName,Collectors.toSet()));
		System.out.println(collect2);
	}
}
