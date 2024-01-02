package com.fucntionalinterfaces;

import java.util.Arrays;
import java.util.function.Supplier;
import data.*;
public class SupplierExample {
	public static void main(String[] args) {
     
		Supplier<Student>supplier=()->{
			return new Student("Adam",2,3.6,"male",Arrays.asList("swimming","basketball","volleyball"));
			
		};
		Student student = supplier.get();
		System.out.println(student);
	}
}
