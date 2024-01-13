package com.jan13;

public class Program3 {
  private  static Program3 instance;
  
  private Program3() {
	  
  }
  public static Program3 getInstance() {
	  if(instance==null) {
		  Program3 instance = new Program3();
	  }
	  return instance;
  }
}
