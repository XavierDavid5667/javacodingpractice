package com.searchingalgorithm;

public class BinarySearch {
	
	public  int binarySearch(int arr[],int low,int high,int a) {
		 if(high>=low) {
			 int mid=low+(high-low)/2;
			 if(arr[mid]==a) {
				 return mid;
			 }
			 else if(arr[mid]>a){
				 return binarySearch(arr,low,mid-1,a);
			 }
			 
			 else {
				 return binarySearch(arr,mid+1,high,a);
			 }
			 
		 }
		 return -1;
	 }
	
	
	public static void main(String[] args) {
		BinarySearch bs=new BinarySearch();
     int arr[]= {2,5,8,10,15,20,30};
     int high=arr.length-1;
     int result=bs.binarySearch(arr,0,high,5);
     if(result== -1) {
    	 System.out.println("Element is not present ");
     }else {
    	 System.out.println("Element is present at index "+result);
     }
	}
}
