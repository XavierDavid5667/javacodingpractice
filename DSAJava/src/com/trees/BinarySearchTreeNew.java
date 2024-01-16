package com.trees;

public class BinarySearchTreeNew {
	Node root;
	public BinarySearchTreeNew() {
		this.root=null;
	}
	public void insert(int data) {
		root=insertHelper(root,data);
	}
	public Node insertHelper(Node root,int data) {
		if(root==null) {
			root=new Node(data);
			return root;
		}
		if(data<root.key) {
			root.left=insertHelper(root.left, data);
		}else if(data>root.key) {
			root.right=insertHelper(root.right, data);
		}
		return root;
	}
	
	
	public Node search(Node root,int data) {
		
		if(root==null || root.key==data) {
			return root;
		}
		if(data<root.key) {
			return search(root.left,data);
		}
		   return search(root.right, data);
	}
	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
		 tree.insertNode(8);
		 tree.insertNode(4);
		 tree.insertNode(1);
		 tree.insertNode(7);
		 tree.insertNode(12);
		 tree.insertNode(9);
		 tree.insertNode(14);
		 Node search = tree.search(tree.root, 14);
		 if(search==null) {
			 System.out.println("Not found");
		 }else {
			 System.out.println(search.key);
		 }
	}
}
