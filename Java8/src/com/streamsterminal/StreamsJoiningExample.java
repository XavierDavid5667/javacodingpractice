package com.streamsterminal;

import java.util.stream.Collectors;

import data.Student;
import data.StudentDatabase;

public class StreamsJoiningExample {
	
	public static String joining_1() {
	  return StudentDatabase.getAllStudents().stream().map(Student::getName).collect(Collectors.joining());
	}
	
	public static String joining_2() {
		  return StudentDatabase.getAllStudents().stream().map(Student::getName).collect(Collectors.joining("-"));
		}
	
	
	public static String joining_3() {
		  return StudentDatabase.getAllStudents().stream().map(Student::getName).collect(Collectors.joining("-","{","}"));
		}
	
	public static void main(String[] args) {
      System.out.println("Joining1 "+joining_1());
      System.out.println("Joining2 "+joining_2());
      System.out.println("Joining3 "+joining_3());
	}
}
