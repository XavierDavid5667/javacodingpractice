package com.package1;

public class QueueUsingArray {
	
	public static final int DEFAULT_SIZE=5;
	private Object data[];
	private int rear;
	public QueueUsingArray() {
		data=new Object[DEFAULT_SIZE];
	}
	public boolean isEmpty() {
		return rear==0;
	}
	
	public void enqueue(Object element) {
		if(rear==DEFAULT_SIZE-1) {
			System.out.println("Queue is full.");
		}
		this.data[rear]=element;
		this.rear++;
	}
	
	public Object dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
		}
		Object object=this.data[0];
		for(int i=0;i<this.rear-1;i++) {
			data[i]=data[i+1];
		}
		this.rear--;
		return object;
	}
	
	public void printStackElements() {
		System.out.println("Elements in the queue are");
		for(int i=0; i<data.length;i++) {
			System.out.println(data[i]);
		}
	}
	
	public static void main(String[] args) {
		QueueUsingArray queue=new QueueUsingArray();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		System.out.println(queue.dequeue());
		queue.enqueue(5);
		queue.enqueue(6);
	    queue.printStackElements();
	}
}
