package com.sortingalgorithm;

public class BubbleSort {

	void bubbleSort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	void printArray(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
     BubbleSort bubbleSort=new BubbleSort();
     int[] arr= {4,3,5,2,1};
     bubbleSort.bubbleSort(arr);
     bubbleSort.printArray(arr);
	}
}
