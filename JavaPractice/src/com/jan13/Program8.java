package com.jan13;

public class Program8 {
	public static void main(String[] args) {
		 String str="Welcome to java world";
		 String reversedWord="";
		 
		  String[] split = str.split(" ");
		 for(int i=0;i<split.length;i++) {
			 String s=split[i];
			 String reversedString="";
			 for(int j=s.length()-1;j>=0;j--) {
				 reversedString=reversedString+s.charAt(j);
			 }
			 reversedWord=reversedWord+reversedString+" ";
		 }
		 String trim = reversedWord.trim();
		 System.out.println(trim);
	}
}
