package com.recursion;

import java.util.Scanner;

public class Program2 {
	static int n1=0,n2=1,n3=0;	
	static void printFibo(int count) {
		if(count>0) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(" "+n3);
			printFibo(count-1);
		}
	}
	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   int num=sc.nextInt();
	   System.out.println("Enter the number for the number of terms for the series");
	   System.out.print(n1+" "+n2);
	   printFibo(num-2);
	}
}
