package com.fucntionalinterfaces;

import java.util.function.Predicate;

public class PredicateExample {
	public static void main(String[] args) {
     
		Predicate<Integer>predicate1=(i)->i%2==0;
		boolean test = predicate1.test(4);
		Predicate<Integer>predicate2=(i)->i%4==0;
		System.out.println(test);
		boolean test2 = predicate1.and(predicate2).test(4);
		System.out.println(test2);
		boolean test3 = predicate1.or(predicate2).test(2);
		System.out.println(test3);
	}
}
