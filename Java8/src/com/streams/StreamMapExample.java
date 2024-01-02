package com.streams;

import java.util.List;
import java.util.stream.Collectors;

import data.Student;
import data.StudentDatabase;

public class StreamMapExample {
	
	public static List<Student> getAllStudents(){
		 return StudentDatabase.getAllStudents();
	}
	public static void main(String[] args) {
         List<String> collect = getAllStudents().stream().map(Student::getName).map(String::toUpperCase).collect(Collectors.toList());
         System.out.println(collect);
	}
}
