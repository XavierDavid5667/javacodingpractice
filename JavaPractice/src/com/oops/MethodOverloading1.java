package com.oops;

public class MethodOverloading1 {
	
	static int add(int a,int b) {
		return a+b;
	}
	static double add(double a ,double b,double c) {
		return a+b+c;
	}
	public static void main(String[] args) {
	 int add = MethodOverloading1.add(1, 2);
     System.out.println(add);
     double add2 = MethodOverloading1.add(1, 2, 3);
     System.out.println(add2);
     
	}
}
