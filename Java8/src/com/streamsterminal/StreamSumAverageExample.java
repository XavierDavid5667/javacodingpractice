package com.streamsterminal;

import java.util.stream.Collectors;

import data.Student;
import data.StudentDatabase;

public class StreamSumAverageExample {
	
	public static int sum() {
	  return StudentDatabase.getAllStudents().stream().collect(Collectors.summingInt(Student::getNotebooks));
	}
	public static double average() {
		  return StudentDatabase.getAllStudents().stream().collect(Collectors.averagingInt(Student::getNotebooks));
		}
	public static void main(String[] args) {
       System.out.println(sum());
       System.out.println(average());
	}
}
