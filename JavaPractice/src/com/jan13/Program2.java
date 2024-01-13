package com.jan13;

public class Program2 {
	
	public static void main(String[] args) {
      Day day = Day.WEDNESDAY;
      
      switch(day) {
      case MONDAY:
    	  System.out.println("It is a monday");
    	  break;
      case TUESDAY:
    	  System.out.println("It is a tuesday");
    	  break;
      case WEDNESDAY:
    	  System.out.println("It is a wednesday");
    	  break;
      case THURSDAY:
    	  System.out.println("It is thursday");
    	  break;
      case FRIDAY:
    	  System.out.println("It is a friday");
    	  break;
    default:
    	System.out.println("Matches none");
    	  
      }
	}
}
