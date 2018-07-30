package com.arrays.ravindra;

class Node1{
	int data;
	Node left, right;
	int height;
	int size;
	
	Node1(int data){
		this.data =data;
		size=1;
	}
}

public class Test {
	
	public static void main(String[] args){
		
		int[] arr= {10, 6, 15, 20, 30, 5, 7};
		int[] result = new int[arr.length];
		Node root = null;
		
		for(int i=arr.length-1;i>=0;i--){
			
			root = insertAVL(root,arr[i],result,i);
		}
		
		for(int i=0;i<arr.length;i++){
			System.out.println(result[i]);
		}
	}
	
	
	public static Node insertAVL(Node node, int element, int[] result, int index){
		
		if(node==null){
			return new Node(element);
		}
		
		if(element<node.data){
			node.left = insertAVL(node.left,element,result,index);
		}else{
			node.right = insertAVL(node.right,element,result,index);
			result[index] = 1+ size(node.left) +result[index];
		}
		
		int balance = height(node.left) -height(node.right);
		node.size = size(node.left)+size(node.right)+1;
		node.height =1+Math.max(height(node.left),height(node.right));
		
		if(balance >1 &&  element<node.left.data){
			return rightRotation(node);
		}
		
		if(balance >1 &&  element > node.left.data){
			
			node.left = leftRotation(node.left);
			return rightRotation(node);
		}
		
		if(balance <-1 &&  element >node.right.data){
			return leftRotation(node);
		}
		
		
		if(balance <-1 &&  element < node.right.data){
			
			node.right = rightRotation(node.right);
			return leftRotation(node);
		}

		
		
		return node;
	}
	
	
	static int height(Node node){
		if(node== null){
			return 0;
		}
		return node.height;
	}
	
	static int size(Node node){
		if(node== null){
			return 0;
		}
		return node.size;
	}
	
	
	static Node rightRotation(Node node){
		
		Node newNode = node.left;
		Node temp = node;
		
		temp.left = newNode.right;
		newNode.right = temp;
		
		temp.height = 1+ Math.max(height(temp.left),height(temp.right));
		temp.size = 1+size(temp.left)+size(temp.right);
		
		newNode.height = 1+ Math.max(height(newNode.left),height(newNode.right));
		newNode.size = 1+size(newNode.left)+size(newNode.right);
		return newNode;
	}
	
	static Node leftRotation(Node node){
		
		Node newNode = node.right;
		Node temp = node;
		
		temp.right = newNode.left;
		newNode.left = temp;
		

		temp.height = 1+ Math.max(height(temp.left),height(temp.right));
		temp.size = 1+size(temp.left)+size(temp.right);
		
		newNode.height = 1+ Math.max(height(newNode.left),height(newNode.right));
		newNode.size = 1+size(newNode.left)+size(newNode.right);
		return newNode;
	}
}
