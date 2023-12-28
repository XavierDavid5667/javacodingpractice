package com.string;

import java.util.Scanner;

/**
 * Count number of vowels in a given string
 * @author xdavid
 *
 */
public class Program1 {
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string");
	String s=sc.nextLine().toLowerCase();
	int count=0;
    char[] charArray = s.toCharArray();
    for(char c:charArray) {
    	switch (c) {
		case 'a': 
		case 'e':
		case 'i':
		case 'o':
	    case 'u':
	    	count++;
	    	break;
		}
    
    }
	System.out.println("The count of vowels is: "+count);	
 }
}
