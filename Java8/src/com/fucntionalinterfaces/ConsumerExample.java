package com.fucntionalinterfaces;
import java.util.List;
import java.util.function.Consumer;
import data.Student;
import data.StudentDatabase;

public class ConsumerExample {
	
	static Consumer c2=(s)->System.out.println(s);
	static Consumer<Student>c3=(student)->System.out.print(student.getName());
	static Consumer<Student>c4=(student)->System.out.println(student.getActivities());
	
	public static void printStudents() {

		List<Student> allStudents = StudentDatabase.getAllStudents();
		allStudents.forEach(c2);
		
	}
	public static void printNameAndActivities() {
		System.out.println("printNameAndActivities");
		List<Student> allStudents = StudentDatabase.getAllStudents();
		allStudents.forEach(c3.andThen(c4)); //consumer chaining
	}
	
	public static void printNameAndActivitiesUsingCondition() {
		System.out.println("printNameAndActivitiesUsingCondition");
		List<Student> allStudents = StudentDatabase.getAllStudents();
		allStudents.forEach((student)->{
		 if(student.getGradeLevel()>=3) {
			 c3.andThen(c4).accept(student);
		 }	
		});
	}
	 
	
	public static void main(String[] args) {
    Consumer<String>consumer=(s)->System.out.println(s.toUpperCase());
    consumer.accept("xavier david");
    printStudents();
    printNameAndActivities();
    printNameAndActivitiesUsingCondition();
 	}
}
