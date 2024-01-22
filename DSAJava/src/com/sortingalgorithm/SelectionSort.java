package com.sortingalgorithm;

public class SelectionSort {
	
	void sort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int min_idx=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[min_idx])
					min_idx=j;
				
			}
			int temp=arr[min_idx];
			arr[min_idx]=arr[i];
			arr[i]=temp;
		}
	}
	
	void printArray(int[] arr) {
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
	public static void main(String[] args) {
       SelectionSort selectionSort=new SelectionSort();
       int[] arr= {4,3,5,2,1};
       selectionSort.sort(arr);
       selectionSort.printArray(arr);
    
	}
}
