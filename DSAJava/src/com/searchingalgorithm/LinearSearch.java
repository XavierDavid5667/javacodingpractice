package com.searchingalgorithm;

public class LinearSearch {
	static int search(int arr[],int data) {
		for(int i:arr) {
			if(i==data) {
				return 1;
			}
		}
		return 0;
	}
	public static void main(String[] args) {
     int[] array= {13,6,1,7,4,8,9};
     int result=search(array, 8);
     if(result==1) {
    	 System.out.println("Element is present");
     }else {
    	 System.out.println("Element is not present");
     }
	}
}
