package com.fucntionalinterfaces;

import java.util.function.BiConsumer;

public class BiConsumerExample {
	public static void main(String[] args) {
    BiConsumer<String, String>biConsumer=(a,b)->System.out.println("a: "+a+" b: "+b);
    biConsumer.accept("Xavier","David");
    
    BiConsumer<Integer, Integer>multiply=(a,b)->System.out.println(a*b);
    multiply.accept(2,3);
	
	BiConsumer<Integer,Integer>division=(a,b)->System.out.println(a/b);
	division.accept(2,3);
	
	multiply.andThen(division).accept(3, 2);
	
}
}
