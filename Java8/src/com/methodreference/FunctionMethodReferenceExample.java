package com.methodreference;

import java.util.function.Function;

public class FunctionMethodReferenceExample {
	
	static Function<String,String>toUpperCaseLambda=(s)->s.toUpperCase();
	static Function<String,String>toUpperCaseMethodReference=String::toUpperCase;
	public static void main(String[] args) {
     String apply1 = toUpperCaseLambda.apply("Xavier");
     String apply2 = toUpperCaseMethodReference.apply("David");
     System.out.println(apply1+" "+apply2);
	}
}
