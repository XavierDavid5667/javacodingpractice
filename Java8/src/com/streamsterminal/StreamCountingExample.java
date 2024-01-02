package com.streamsterminal;

import java.util.stream.Collectors;

import data.StudentDatabase;

public class StreamCountingExample {
	
	public static long count() {
	   return StudentDatabase.getAllStudents().stream().filter(s->s.getGpa()>=3.9).collect(Collectors.counting());
	}
	public static void main(String[] args) {
       System.out.println(count() );
	}
}
