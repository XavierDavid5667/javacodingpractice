package com.package1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Sort in ascending order using bubble sort
 * @author xdavid
 *
 */
public class Program2 {
	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size of the array");
      int n=sc.nextInt();
      int[] arr=new int[n];
      for(int i=0;i<n;i++) {
    	  arr[i]=sc.nextInt();
      }
      System.out.println(Arrays.toString(arr));
      System.out.println("Sorting using bubble sort");
      for(int j=0;j<n;j++) {
    	  for(int k=0;k<n-j-1;k++) {
    		  if(arr[k]>arr[k+1]){
    			  int temp=arr[k];
    			  arr[k]=arr[k+1];
    			  arr[k+1]=temp;
    		  }
    	  }
      }
      System.out.println(Arrays.toString(arr));
	}
}
