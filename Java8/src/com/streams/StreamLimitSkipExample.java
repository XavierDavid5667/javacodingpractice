package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamLimitSkipExample {
	
	public static Optional<Integer>limit(List<Integer>integers){
		return integers.stream().limit(2).reduce((x,y)->x+y);
	}
	public static Optional<Integer> skip(List<Integer>integers){
		return integers.stream().skip(3).reduce((a,b)->a+b);
	}
	public static void main(String[] args) {
       List<Integer>integers=Arrays.asList(6,7,8,9,10);
       Optional<Integer> limit = limit(integers);
       if (limit.isPresent()) {
		System.out.println(limit.get());
	}
       Optional<Integer> skip = skip(integers);
       if(skip.isPresent()) {
    	   System.out.println(skip.get());
       }
	}
}
