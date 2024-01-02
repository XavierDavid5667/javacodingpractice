package com.streams;

import java.util.Optional;

import data.*;

public class StreamFindFirstAnyFirstExample {
	
	public static Optional<Student> findAnyStudent(){
	return	StudentDatabase.getAllStudents().stream().filter(s->s.getGpa()>=3.9).findAny();
	}
	public static Optional<Student> findFirstStudent(){
	return	StudentDatabase.getAllStudents().stream().filter(s->s.getGpa()>=3.9).findFirst();
	}
	public static void main(String[] args) {
      Optional<Student> findAnyStudent = findAnyStudent();
      if(findAnyStudent.isPresent()) {
    	  System.out.println(findAnyStudent.get());
      }
      Optional<Student> findFirstStudent = findFirstStudent();
      if(findFirstStudent.isPresent()) {
    	  System.out.println(findFirstStudent.get());
      }
	}
}
