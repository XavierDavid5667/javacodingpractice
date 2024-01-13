package com.jan11;

import java.util.Arrays;
import java.util.Scanner;

public class Program1 {
	public static void main(String[] args) {
      Scanner scanner=new Scanner(System.in);
      System.out.println("Enter the string");
      String s=scanner.next();
      char[] charArray = s.toCharArray();
      int[] countArray=new int[charArray.length];
      boolean[] visited=new boolean[charArray.length];
      
      for(int i=0;i<charArray.length;i++) {
    	  int count=1;
    	  countArray[i]=count;
    	  if(visited[i]) {
    		  continue;
    	  }
    	  for(int j=i+1;j<charArray.length;j++) {
    		  
    		  if(charArray[i]==charArray[j]) {
    			  visited[j]=true;
    			  count=count+1;
    			  countArray[i]=count;
    		  }
    	  }
      }
      for(int i=0;i<charArray.length;i++) {
    	  if(!visited[i]) {
    		 // System.out.println(charArray[i]+"    "+countArray[i]);
    		  System.out.print(charArray[i]);
    	  }
      }
//      System.out.println(Arrays.toString(visited));
//      System.out.println(Arrays.toString(charArray));
//      System.out.println(Arrays.toString(countArray));
      
	}
}
