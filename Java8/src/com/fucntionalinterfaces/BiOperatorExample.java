package com.fucntionalinterfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BiOperatorExample {
	
	static Comparator<Integer> comparator=(a,b)->a.compareTo(b);
	
	public static void main(String[] args) {
    BinaryOperator<Integer>binaryOperator=(a,b)->a*b;
    System.out.println(binaryOperator.apply(2,3));
    
    BinaryOperator<Integer> minBy = BinaryOperator.minBy(comparator);
    Integer apply = minBy.apply(4,5);
    System.out.println("Min "+apply);
    
    BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comparator);
    Integer apply2 = maxBy.apply(4, 5);
    System.out.println("Max "+apply2);
    
    
	}
}
