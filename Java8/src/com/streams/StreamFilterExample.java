package com.streams;

import java.util.List;

import data.Student;
import data.StudentDatabase;

public class StreamFilterExample {
	
	public static List<Student>filterStudents(){
	  return StudentDatabase.getAllStudents().stream().filter(s->s.getGender().equals("female")).toList();
	}
	
	public static void main(String[] args) {
     System.out.println("Students with gender as female");
     System.out.println(filterStudents());
	}
}
