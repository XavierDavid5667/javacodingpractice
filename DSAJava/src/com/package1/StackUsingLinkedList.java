package com.package1;

public class StackUsingLinkedList {
	
	 private static Node first=null;
	 static StackUsingLinkedList stackUsingLinkedList=new StackUsingLinkedList();
	 
	 public static void push(int data) {
		 Node newNode=new Node(data);
		 newNode.next=first;
		 first=newNode;
	 }
	 public static void pop() {
		 Node temp=first;
		 first=first.next;
		 System.out.println("Removed element "+temp.data);
	 }
	 public static void printList(StackUsingLinkedList stack){
		 Node currentNode=stack.first;
		 while(currentNode!=null) {
			 System.out.println(currentNode.data);
			 currentNode=currentNode.next;
		 }
		 
	 }
	
	public static void main(String[] args) {
      stackUsingLinkedList.push(4);
      stackUsingLinkedList.push(6);
      stackUsingLinkedList.push(1);
      printList(stackUsingLinkedList);
      stackUsingLinkedList.pop();
      stackUsingLinkedList.pop();
      printList(stackUsingLinkedList);
     
	}
}
