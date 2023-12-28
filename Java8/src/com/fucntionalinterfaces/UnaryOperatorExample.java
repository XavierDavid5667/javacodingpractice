package com.fucntionalinterfaces;

import java.util.function.UnaryOperator;

//Unary opertaor is used over the function fucntional
//interface when the input and the output is of the
//same time
public class UnaryOperatorExample {

	static UnaryOperator<String> unaryOperator = (s) -> s.concat("default");

	public static void main(String[] args) {
      
      System.out.println(unaryOperator.apply("java"));
	}
}
