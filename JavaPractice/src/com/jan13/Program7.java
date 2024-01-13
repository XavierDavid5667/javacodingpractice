package com.jan13;


//Welcome to java world

//o/p world java to Welcome
public class Program7  {
	public static void main(String[] args) {
     String str="Welcome to java world";
     String reversedWord="";
     String[] split = str.split(" ");
     for(int i=split.length-1;i>=0;i--) {
    	 reversedWord=reversedWord+split[i]+" ";
     }
     String trim = reversedWord.trim();
     System.out.println(trim);
	}
}
