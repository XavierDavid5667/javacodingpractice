package com.jan13;

import java.util.Scanner;

public class Program1 {
	public static void main(String[] args) {
     Scanner scanner=new Scanner(System.in);
     System.out.println("Enter the day of the week");
     int day=scanner.nextInt();
     System.out.println("Entered day is :"+day);
     switch(day) {
     case 1:{
    	 System.out.println("It is Monday");
    	 System.out.println("Block of codes");
    	 System.out.println("Block of codes"); 
    	 System.out.println("Block of codes");
    	 break;
     }
     case 2:
    	 System.out.println("It is a tuesday");
    	 break;
    
     case 3:
    	 System.out.println("It is a wednesday");
    	 break;
     
    
     case 4:
    	 System.out.println("It is a thursday");
    	 break;
    
     case 5:
    	 System.out.println("It is a fridday");
    	 break;
     case 6:
    	 System.out.println("It is saturday");
    	 break;
    	 
     case 7:
    	 System.out.println("It is a sunday");
    	 break;
    	 
    default:
    	System.out.println("This is default statement");
     }
	}
}
