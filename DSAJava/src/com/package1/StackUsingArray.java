package com.package1;

public class StackUsingArray {
	static final int MAX=100;
	int top;
	int arr[]=new int[MAX];
	
	StackUsingArray() {
		top=-1;
	}
	public boolean isEmpty() {
		return (top<0);
	}
	public boolean push(int e) {
		if(top>=(MAX-1)) {
			System.out.println("Stack Overflow");
			return false;
		}
		top++;
		arr[top]=e;
		System.out.println(e+" is pushed to the stack");
		return true;
	}
	
	public int pop() {
		if(top<0) {
			System.out.println("Stack Underflow");
			return 0;
		}else {
			int e=arr[top];
			top--;
			return e;
		}
	}
	public void printStackElements() {
		System.out.println("Elements are in stack: ");
		for(int i=0;i<=top;i++) {
			System.out.println(arr[i]);
		}
	}
	
	
public static void main(String[] args) {
	StackUsingArray stackUsingArray=new StackUsingArray();
	stackUsingArray.push(1);
	stackUsingArray.push(2);
	stackUsingArray.push(3);
	System.out.println("The elements of the array are ");
	stackUsingArray.printStackElements();
	System.out.println(stackUsingArray.pop()+" removed from the stack");
	
}
}
