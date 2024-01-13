package com.jan13;

import java.util.HashMap;
import java.util.Map;

public class Program9 {
	public static void main(String[] args) {
		String str1 = "listen";
        String str2 = "silent";
        Map<Character,Integer> map1=new HashMap<>();
        Map<Character,Integer> map2=new HashMap<>();
        for(char c:str1.toCharArray()) {
        	map1.put(c,map1.getOrDefault(c,0)+1);
        }
        for(char c:str2.toCharArray()) {
        	map2.put(c,map2.getOrDefault(c,0)+1);
        }
        System.out.println(map1);
        System.out.println(map2);
        if(map1.equals(map2)) {
        	System.out.println("Bot the strings are anagrams");
        }else {
        	System.out.println("Not anagrams");
        }
	}
}
