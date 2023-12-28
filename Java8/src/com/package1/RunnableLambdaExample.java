package com.package1;

public class RunnableLambdaExample {
	public static void main(String[] args) {
		
        //using anonymous class
		Runnable runnable=new Runnable() {
			
			@Override
			public void run() {
            System.out.println("Inside Runnable1");
				
			}
		};
		new Thread(runnable).start();
		
		
		//using lambda expression
		Runnable runnable2=()->{
			System.out.println("Inside Runnable2");
		};
		new Thread(runnable2).start();
		
		
		new Thread(()->System.out.println("Runnable3")).start();
	}
}
