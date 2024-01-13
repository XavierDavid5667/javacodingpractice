package com.jan13;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Program10 {
	public static void main(String[] args) {
     String str="aabbef";
    Map<Character,Integer>linkedHashMap=new LinkedHashMap<>();
     for(char c:str.toCharArray()) {
    	linkedHashMap.put(c,linkedHashMap.getOrDefault(c,0)+1);
    }
     System.out.println(linkedHashMap);
     Set<Entry<Character, Integer>> entrySet = linkedHashMap.entrySet();
     for(Map.Entry<Character,Integer> entry:entrySet) {
    	 if(entry.getValue()==1) {
    		 System.out.println(entry.getKey());
    		 break;
    	 }
     }
	}

}
