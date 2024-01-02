package com.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import data.Student;
import data.StudentDatabase;

public class StreamsExample {
	public static void main(String[] args) {
      //student name and their activties in a map
		  
		List<Student> allStudents = StudentDatabase.getAllStudents();
		Map<String, List<String>> collect = allStudents.stream().filter(s->s.getGradeLevel()>=3).filter(s->s.getGpa()>=3.9).collect((Collectors.toMap(Student::getName,Student::getActivities)));
		System.out.println(collect);
		
	}
}
