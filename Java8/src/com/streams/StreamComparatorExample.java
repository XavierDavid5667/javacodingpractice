package com.streams;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import data.Student;
import data.StudentDatabase;
public class StreamComparatorExample {
	
	public static List<Student> sortStudentsByName(){
		return StudentDatabase.getAllStudents().stream().sorted((s1,s2)->s2.getName().compareTo(s1.getName())).collect(Collectors.toList());
		
	}
	
	public static List<Student> sortStudentsByNameComapring(){
		return StudentDatabase.getAllStudents().stream().sorted((Comparator.comparing(Student::getName))).collect(Collectors.toList());
	}
	
	public static List<Student> sortStudentsByGpa(){
	  return StudentDatabase.getAllStudents().stream().sorted(Comparator.comparing(Student::getGpa)).collect(Collectors.toList());
	}
	public static List<Student> sortStudentsByGpaDesc(){
		  return StudentDatabase.getAllStudents().stream().sorted(Comparator.comparing(Student::getGpa).reversed()).collect(Collectors.toList());
		}
	
	public static void main(String[] args) {
     List<Student> sortStudentsByName = sortStudentsByName();
     System.out.println(sortStudentsByName);
     System.out.println("Sorting by name");
     List<Student> sortStudentsByNameComapring = sortStudentsByNameComapring();
     System.out.println(sortStudentsByNameComapring);
     System.out.println("Sort by GPA");
     System.out.println(sortStudentsByGpa());
     System.out.println("Sort students by GPA in reversed order");
     System.out.println(sortStudentsByGpaDesc());
	}
}
