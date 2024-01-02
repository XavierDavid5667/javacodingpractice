package com.methodreference;

import java.util.function.Consumer;
import data.*;
public class ConsumerMethodReferenceExample {
    
	static Consumer<Student>consumerUsingLamba=p->System.out.println(p);
	static Consumer<Student>consumerUsingMethodRefernce=System.out::println;
	public static void main(String[] args) {
		StudentDatabase.getAllStudents().forEach(consumerUsingLamba);
		StudentDatabase.getAllStudents().forEach(consumerUsingMethodRefernce);
       System.err.println("hi this is error");
	}
}
