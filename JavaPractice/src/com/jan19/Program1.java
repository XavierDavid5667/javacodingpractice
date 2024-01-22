package com.jan19;

import java.util.HashMap;
import java.util.Map;

//Count number of words in a given string
public class Program1 {
	public static void main(String[] args) {
      String str="I am learning learning java java programming";
      String[] split = str.split(" ");
     Map<String,Integer>hashmap=new HashMap<>();
      for(String s:split) {
    	  hashmap.put(s,hashmap.getOrDefault(s,0)+1);
      }
      System.out.println(hashmap);
	}
}
