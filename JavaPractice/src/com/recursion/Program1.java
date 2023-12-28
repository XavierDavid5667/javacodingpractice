package com.recursion;

import java.util.Scanner;

/**
 * Program to find factorial of a number using recursion
 * 
 * @author xdavid
 *
 */
public class Program1 {
	static int factorial(int n) {
		if(n==1) {
			return 1;
		}
		return(n* factorial(n-1));
	}
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number for which you want to find the factorial");
    int num=sc.nextInt();
    System.out.println("The factorial of the entered number is: "+factorial(num));
	}
}
