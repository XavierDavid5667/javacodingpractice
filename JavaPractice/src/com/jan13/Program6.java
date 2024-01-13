package com.jan13;

public class Program6 {
	public static void main(String[] args) {
		String str = "Xavier";
	//	System.out.println("hi");
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
		char[] charArray = str.toCharArray();
		for(int i=charArray.length-1;i>=0;i--) {
			System.out.print(charArray[i]);
		}
	}
}
