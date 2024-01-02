package com.streams;

import java.util.List;
import java.util.Optional;
import data.*;

public class StreamReduceExample {
	
	public static int performMultiplication(List<Integer>integers) {
		//1
		//3
		//5
		//7
		//a=1,b=1 => result 1 is returned
		//a=1 b=3 result 3 is returned
		//a=3,b=5 result 15 returned
		//a=15,b=7 result 105 is returned
		return integers.stream().reduce(1,(a,b)->a*b);
	}
	
	public static Optional<Integer> perfomrMultiplicationWithoutIdentity(List<Integer> integers){
		return integers.stream().reduce((a,b)->a*b);
	}
	
	public static Optional<Student> getHighestGPAStudent(){
		 return  StudentDatabase.getAllStudents().stream()
		                 .reduce((s1,s2)->{
		                	 if(s1.getGpa()>s2.getGpa()) {
		                		 return s1;
		                	 }else {
		                		 return s2;
		                	 }
		                 });
	}
	
	public static void main(String[] args) {
     
		List<Integer>list=List.of(1,3,5,7);
		System.out.println(performMultiplication(list));
	   Optional<Integer> result = perfomrMultiplicationWithoutIdentity(list);
	   System.out.println(result.isPresent());
	   System.out.println(result.get());
	   
	   Optional<Student> studentOptional = getHighestGPAStudent();
	   if(studentOptional.isPresent()) {
		   System.out.println(studentOptional.get());
	   }
	}
}
