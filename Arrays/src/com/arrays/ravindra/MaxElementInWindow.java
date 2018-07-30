package com.arrays.ravindra;

import java.util.Deque;
import java.util.LinkedList;

public class MaxElementInWindow {

	public static void main(String[] args) {
		int[] a ={10,4,2,11,3,15,12,8,7,9,21,50};
		
		maxElementInWindow(a,3);

	}
	
	public static void maxElementInWindow(int[] a , int windowSize){
		
		
		Deque<Integer> list = new LinkedList<Integer>();
		
		for(int i=0;i<windowSize;i++){
		while(!list.isEmpty() && a[i]>a[list.peekLast()]){
			
			list.removeLast();
		}	
		
		list.addLast(i);
		}
		
		for(int i=windowSize;i<a.length;i++){
			
			System.out.println(a[list.peek()]);
			
			while(!list.isEmpty() && list.peek()<=i-windowSize){
				list.removeFirst();
				
			}
			
			
			while(!list.isEmpty() && a[list.peekLast()]<a[i]){
				list.removeLast();
				
			}
			
			list.addLast(i);
		}
		
	     System.out.print(a[list.peek()]);
	}

}
