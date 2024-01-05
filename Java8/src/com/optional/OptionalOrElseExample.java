package com.optional;

import java.util.Optional;
import data.StudentDatabase;
import data.*;

public class OptionalOrElseExample {
	
	public static String optionalOrElse() {
		Optional<Student>studentOptional=Optional.ofNullable(StudentDatabase.studentSupplier.get());
		String name=studentOptional.map(Student::getName).orElse("Deafult");
		return name;
	}
	public static String optionalOrElseGet() {
		Optional<Student>studentOptional=Optional.ofNullable(null);
	return studentOptional.map(Student::getName).orElseGet(()->"Default");
	}
	public static String optionalOrElseThrow() {
		Optional<Student>studentOptional=Optional.ofNullable(null);
	return studentOptional.map(Student::getName).orElseThrow(()->new RuntimeException("No Data Available"));
	}
	public static void main(String[] args) {
     System.out.println(optionalOrElse());
     System.out.println(optionalOrElseGet());
     System.out.println(optionalOrElseThrow());
	}
}
