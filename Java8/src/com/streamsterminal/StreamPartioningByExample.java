package com.streamsterminal;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import data.Student;
import data.StudentDatabase;

public class StreamPartioningByExample {
	
	public static void partioningBy_1() {
		Map<Boolean, List<Student>> collect = StudentDatabase.getAllStudents().stream().collect(Collectors.partitioningBy(s->s.getGpa()>=3.8));
		System.out.println(collect);
	}
	
	public static void partioningBy_2() {
	Map<Boolean, Set<Student>> collect = StudentDatabase.getAllStudents().stream().collect(Collectors.partitioningBy(s->s.getGpa()>=3.8,Collectors.toSet()));
		System.out.println(collect);
	}
	
	
	public static void main(String[] args) {
        // partioningBy_1();
		partioningBy_2();
	}
}
