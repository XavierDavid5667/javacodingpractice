package com.streams;

import data.Student;
import data.StudentDatabase;

public class StreamMapReduceExample {
	
	private static int noOfNoteBooks() {
		
	return	StudentDatabase.getAllStudents()
		          .stream().filter(s->s.getGradeLevel()>=3).map(Student::getNotebooks).reduce(0,(a,b)->a+b);
	}
	
	public static void main(String[] args) {
     System.out.println(noOfNoteBooks());
	}
}
