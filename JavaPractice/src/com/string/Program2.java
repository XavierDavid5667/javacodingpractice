package com.string;

import java.util.Scanner;

/**
 * Program to find number of words in a sentence and the corresponding character
 * count
 * 
 * @author xdavid
 *
 */
public class Program2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String nextLine = sc.nextLine();
		String[] split = nextLine.split(" ");
		for(String s:split) {
			char[] charArray = s.toCharArray();
			int count=0;
			for(char c:charArray) {
				count++;
			}
			System.out.println(s+"---->"+count);
		}

	}
}
