package com.optional;

import java.util.Optional;

import data.Student;
import data.StudentDatabase;

public class OptionalExample {
	
	public static String getStudentName() {
		Student student = StudentDatabase.studentSupplier.get();
		if(student!=null) {
			return student.getName();
		}else {
			return null;
		}
	}
	public static Optional<String> getStudentNameOptional(){
		Optional<Student> ofNullable = Optional.ofNullable(StudentDatabase.studentSupplier.get());
		if(ofNullable.isPresent()) {
			return ofNullable.map(Student::getName);//Optional<String>
		}
		return Optional.empty();
	}
	public static void main(String[] args) {
		String studentName = getStudentName();
       System.out.println(studentName.length());
      Optional<String> studentNameOptional = getStudentNameOptional();
      if(studentNameOptional.isPresent()) {
    	  System.out.println(studentNameOptional.get());
      }else {
    	  System.out.println("Name not found");
      }
	}
}
