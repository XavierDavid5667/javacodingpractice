package com.constructorreference;

import java.util.function.Function;
import java.util.function.Supplier;
import data.*;
public class ConstructorRefernceExample {
	
	static Supplier<Student>supplier=Student::new;
	
	static Function<String,Student>function=Student::new;
	public static void main(String[] args) {
    
		System.out.println(supplier.get());
		System.out.println(function.apply("Xavier"));
	
	}
}
