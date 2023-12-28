package com.fucntionalinterfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import data.Student;
import data.StudentDatabase;

public class FunctionStudentExample {
	
	static Function<List<Student>,Map<String,Double>>studentFunction=(students)->{
		 Map<String,Double>studentGrademap=new HashMap();
		 students.forEach(student->{
			 studentGrademap.put(student.getName(),student.getGpa());
		 });
		 return studentGrademap;
	};
	
	public static void main(String[] args) {
    
		System.out.println(FunctionStudentExample.studentFunction.apply(StudentDatabase.getAllStudents()));
	}
}
