package com.fucntionalinterfaces;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;
import data.Student;
import data.StudentDatabase;
public class PredicateAndConsumerExample {
	
 static	Predicate<Student>p1=(s)->s.getGradeLevel()>=3;
 static Predicate<Student>p2=(s)->s.getGpa()>=3.9;
 static	BiPredicate<Integer, Double>biPredicate=(gradeLevel,gpa)->gradeLevel>=3 && gpa>=3.9;
	
	BiConsumer<String,List<String>>biConsumer=(name,activities)->System.out.println(name+" : "+activities);
	
	
	Consumer<Student>consumer=(student)->{
//		if(p1.and(p2).test(student)) {
//			biConsumer.accept(student.getName(),student.getActivities());
//		}
		if(biPredicate.test(student.getGradeLevel(),student.getGpa())) {
			biConsumer.accept(student.getName(),student.getActivities());
		}
	};
	public void printNameAndActivties(List<Student>students) {
		students.forEach(consumer);
	}
			
	public static void main(String[] args) {
     List<Student> allStudents = StudentDatabase.getAllStudents();
     new PredicateAndConsumerExample().printNameAndActivties(allStudents);
	}
}
