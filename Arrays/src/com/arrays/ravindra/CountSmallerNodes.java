package com.arrays.ravindra;


class Node{
	
	Node left, right;
	int data;
	int size,height;
	
	public Node(int data){
		this.data =data;
		this.size=1;
		this.height=1;
	}
}

public class CountSmallerNodes {


	public static void main(String[] args) {
		
		int arr[] = {10, 6, 15, 20, 30, 5, 7};
		int[] smaller = buildSmallerElements(arr);
		
		for(int i=0;i<arr.length;i++){
			System.out.println(smaller[i]);
		}
	}
	
	
	public static int[] buildSmallerElements(int[] arr){
		
		int[] smaller = new int[arr.length];
		Node root =null;
		
		for(int i=arr.length-1;i>=0;i--){
			root = insertIntoAVL(root, arr[i],smaller,i);
		}
		return smaller;
	}
	
	public static Node insertIntoAVL(Node node, int element, int[] smaller, int index){
		
		if(node==null){
			return new Node(element);
		}
		
		if(element>node.data){
			node.right = insertIntoAVL(node.right,element,smaller,index);
			smaller[index] = smaller[index] + size(node.left) + 1;
		}else if(element<node.data){
			node.left = insertIntoAVL(node.left,element,smaller,index);
			
		}
		
		node.height = 1+ Math.max(height(node.left), height(node.right));
		node.size = 1+ size(node.left)+size(node.right);
		
		int balance = height(node.left) - height(node.right);
		
		if(balance >1 && node.left.data >element){
			return rightRotation(node);
		}
		
		if(balance <-1 && node.right.data <element){
			return leftRotation(node);
		}
		
		if(balance >1 && node.left.data <element){
			node.left = leftRotation(node.left);
			return rightRotation(node);
		}
		
		if(balance <-1 && node.left.data >element){
			node.right = rightRotation(node.right);
			return leftRotation(node);
		}
		
		
		return node;
	}
	
	public static Node rightRotation(Node node){
		
		Node newRoot = node.left;
	    Node temp = newRoot.right;
	 
	    // Perform rotation
	    newRoot.right = node;
	    node.left = temp;
		
		node.height = Math.max(height(node.left),height(node.right))+1;
		newRoot.height = Math.max(height(newRoot.left),height(newRoot.right))+1;
		
		node.size = size(node.left)+size(node.right)+1;
		newRoot.size = size(newRoot.left)+size(newRoot.right)+1;
		return newRoot;
	}
	
	
	public static Node leftRotation(Node node){
	

		Node newRoot = node.right;
	    Node temp = newRoot.left;
	 
	    // Perform rotation
	    newRoot.left = node;
	    node.right = temp;
	 
	    //  Update heights
	    node.height = Math.max(height(node.left), height(node.right))+1;
	    newRoot.height = Math.max(newRoot.left.height, newRoot.right.height)+1;
	 
	    // Update sizes
	    node.size = size(node.left)+ size(node.right)+ 1;
	    newRoot.size = newRoot.left.size + newRoot.right.size + 1;
	 
	    // Return new root
	    return newRoot;
	}
	
	
	static int height(Node node)
	{
	    if (node == null)
	        return 0;
	    return node.height;
	}
	
	static int size(Node node)
	{
	    if (node == null)
	        return 0;
	    return node.size;
	}


}
