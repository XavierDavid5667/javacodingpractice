package com.package1;

public class QueueUsingLinkedList {

	Node front, rear;

	public QueueUsingLinkedList() {
		this.front = null;
		this.rear = null;
	}

	public void enQueue(int e) {
		Node node = new Node(e);
		if (this.rear == null) {
			this.front = this.rear = node;
			return;
		}
		this.rear.next = node;
		this.rear = node;
	}

	public Node deQueue() {
		if (this.front == null) {
			return null;
		}
		Node temp = this.front;
		this.front = this.front.next;
		if (this.front == null) {
			this.rear = null;
		}
		return temp;
	}

	public static void printList(QueueUsingLinkedList queue) {
		Node currentNode = queue.front;
		System.out.println("Linked List elements are: ");
		while (currentNode != null) {
			System.out.println(currentNode.data);
			currentNode = currentNode.next;
		}
	}

	public static void main(String[] args) {
		QueueUsingLinkedList linkedList = new QueueUsingLinkedList();
		linkedList.enQueue(1);
		linkedList.enQueue(2);
		linkedList.enQueue(3);
		linkedList.enQueue(4);
		printList(linkedList);
		System.out.println("Dequeued Item is " + linkedList.deQueue().data);
		printList(linkedList);
	}

}
