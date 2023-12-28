package com.oops;

public class MethodOverloading {
	
    static int add(int a, int b) {
    	return a+b;
    }
    static int add(int a,int b,int c) {
    	return a+b+c;
    }
	public static void main(String[] args) {
     
		int add = MethodOverloading.add(1, 2);
		System.out.println(add);
		int add2 = MethodOverloading.add(1, 2, 3);
		System.out.println(add2);
		
	}
}
