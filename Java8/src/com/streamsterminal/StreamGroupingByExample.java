package com.streamsterminal;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import data.Student;
import data.StudentDatabase;

public class StreamGroupingByExample {
	
	public static void groupStudentsByGender() {
		Map<String, List<Student>> map = StudentDatabase.getAllStudents().stream().collect(Collectors.groupingBy(Student::getGender));
		System.out.println(map);
	}
	
	public static void customizedGroupingBy() {
		Map<String, List<Student>> map = StudentDatabase.getAllStudents().stream().collect(Collectors.groupingBy(student->student.getGpa()>=3.8 ? "OUTSTANDING" : "AVERAGE"));
		System.out.println(map);
	}
	
	//two arguments grouping by
    public static void twoLevelGrouping_1() {
    	Map<Integer, Map<String, List<Student>>> collect = StudentDatabase.getAllStudents().stream().collect(Collectors.groupingBy(Student::getGradeLevel,Collectors.groupingBy(student->student.getGpa()>=3.8 ? "OUTSTANDING" : "AVERAGE")));
    	System.out.println(collect);
    
    }
    public static void twoLevelGrouping_2() {
    Map<Integer, Integer> collect = StudentDatabase.getAllStudents().stream().collect(Collectors.groupingBy(Student::getGradeLevel,Collectors.summingInt(Student::getNotebooks)));
    	System.out.println(collect);
    
    }
    
    // three argument groupingBy
    public static void threeArgumentGroupBy() {
    	LinkedHashMap<String, Set<Student>> collect = StudentDatabase.getAllStudents().stream().collect(Collectors.groupingBy(Student::getName,LinkedHashMap::new,Collectors.toSet()));
    	System.out.println(collect);
    }
    
    public static void calculateTopGpa() {
       Map<Integer, Optional<Student>> collect1 = StudentDatabase.getAllStudents().stream().collect(Collectors.groupingBy(Student::getGradeLevel,Collectors.maxBy(Comparator.comparing(Student::getGpa))));
       System.out.println(collect1);
       
        Map<Integer, Student> collect = StudentDatabase.getAllStudents().stream().collect(Collectors.groupingBy(Student::getGradeLevel,Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Student::getGpa)),Optional::get)));
       System.out.println(collect);
    }
    public static void calculateLeastGpa() {
        Map<Integer, Optional<Student>> collect1 = StudentDatabase.getAllStudents().stream().collect(Collectors.groupingBy(Student::getGradeLevel,Collectors.minBy(Comparator.comparing(Student::getGpa))));
        System.out.println(collect1);
        
         Map<Integer, Student> collect = StudentDatabase.getAllStudents().stream().collect(Collectors.groupingBy(Student::getGradeLevel,Collectors.collectingAndThen(Collectors.minBy(Comparator.comparing(Student::getGpa)),Optional::get)));
        System.out.println(collect);
     }
	public static void main(String[] args) {
	 	//groupStudentsByGender();
		//customizedGroupingBy();
		//twoLevelGrouping_1();
		//twoLevelGrouping_2();
		//threeArgumentGroupBy();
		calculateTopGpa();
		calculateLeastGpa();
	}

}
