package com.streams;

import java.util.List;
import java.util.stream.Collectors;

import data.Student;
import data.StudentDatabase;

public class StreamFlatMapExample {

	public static List<String> printStudentActivities() {
		return StudentDatabase.getAllStudents().stream().map(Student::getActivities).flatMap(List::stream)
				.collect(Collectors.toList());
	}

	public static List<String> printStudentActivitiesDisttinct() {
		return StudentDatabase.getAllStudents().stream().map(Student::getActivities).flatMap(List::stream).distinct()
				.collect((Collectors.toList()));
	}

	public static Long printStudentActivitiesDisttinctCount() {
		return StudentDatabase.getAllStudents().stream().map(Student::getActivities).flatMap(List::stream).distinct()
				.count();
	}
	
	public static List<String> printStudentActivitiesDisttinctSorted() {
		return StudentDatabase.getAllStudents().stream().map(Student::getActivities).flatMap(List::stream).distinct()
				.sorted().collect(Collectors.toList());
	}

	public static void main(String[] args) {
		List<String> printStudentActivities = printStudentActivities();
		System.out.println(printStudentActivities);
		List<String> printStudentActivitiesDisttinct = printStudentActivitiesDisttinct();
		System.out.println(printStudentActivitiesDisttinct);
		Long printStudentActivitiesDisttinctCount = printStudentActivitiesDisttinctCount();
		System.out.println(printStudentActivitiesDisttinctCount);
		List<String> printStudentActivitiesDisttinctSorted = printStudentActivitiesDisttinctSorted();
		System.out.println(printStudentActivitiesDisttinctSorted);
	}
}
