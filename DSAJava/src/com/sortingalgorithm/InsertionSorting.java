package com.sortingalgorithm;

public class InsertionSorting {
	
	void sort(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			for(int j=i;j>0;j--) {
				if(arr[j]<arr[j-1]) {
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
		}
	}
	 static void printArray(int[] arr) {
		 for(int i:arr) {
			 System.out.print(i+" ");
		 }
	 }
	
	public static void main(String[] args) {
     InsertionSorting insertionSorting=new InsertionSorting();
     int[] arr= {5,2,3,1,4};
     for(int i:arr) {
     System.out.print(i+" ");
     }
     System.out.println();
     insertionSorting.sort(arr);
     printArray(arr);
	}
}
