package com.fucntionalinterfaces;

import java.util.List;
import java.util.function.Predicate;

import data.Student;
import data.StudentDatabase;

public class PredicateExample2 {
	static Predicate<Student> studentPredicate=(s)->s.getGradeLevel()>=3;
	
	public static void filterStudentsByGradeLevel() {
		List<Student> allStudents = StudentDatabase.getAllStudents();
		allStudents.forEach(student->{
			if(studentPredicate.test(student)) {
				System.out.println(student);
			}
		}); 
	}
	public static void main(String[] args) {
     filterStudentsByGradeLevel();
		
	}
}
