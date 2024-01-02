package com.streams;

import data.StudentDatabase;

public class StreamsMatchExample {
	
	public static boolean allMatch() {
		return StudentDatabase.getAllStudents().stream().allMatch(s->s.getGpa()>=3.9);
	}
	public static boolean anyMatch() {
		return StudentDatabase.getAllStudents().stream().anyMatch(s->s.getGpa()>=4);
	}
	
	public static boolean noneMatch() {
		return StudentDatabase.getAllStudents().stream().noneMatch(s->s.getGpa()>=5);
	}
	public static void main(String[] args) {
       System.out.println("Result of all Match :"+allMatch());
       System.out.println("Result of any Match :"+anyMatch());
       System.out.println("Result of none Match :"+noneMatch());
	}
}
