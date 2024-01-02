package com.streams;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
public class StreamsMinMaxExample {
	public static int findMaxValue(List<Integer>integerList) {
		return integerList.stream().reduce(0,(x,y)->x>y ? x :y);
	}
	
	public static Optional<Integer> findMaxValueOptional(List<Integer>integerList) {
		return integerList.stream().reduce((a,b)->a>b ? a : b);
		
	}
	public static void main(String[] args) {
     List<Integer>integerList=Arrays.asList(6,7,8,9,10);
     
     List<Integer>integers=new ArrayList<>();
     System.out.println(findMaxValue(integerList));
       Optional<Integer> findMaxValueOptional = findMaxValueOptional(integers);
       if(findMaxValueOptional.isPresent()) {
       System.out.println(findMaxValueOptional.get());
       }else {
    	   System.out.println("Returned value is null");
       }
	}
}
