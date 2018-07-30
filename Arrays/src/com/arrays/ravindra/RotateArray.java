package com.arrays.ravindra;

public class RotateArray {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7};
		rotateArray(arr,2);
		
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
	
	public static void rotateArray(int[] a, int rotateBy){
		
		reverse(a,0,rotateBy-1);
		reverse(a,rotateBy,a.length-1);
		reverse(a,0,a.length-1);
	}
	
	public static void reverse(int[] a , int start, int end){
		while(start<end){
			int temp = a[start];
			a[start] = a[end];
			a[end]  = temp;
			start++;
			end--;
		}
	}

}
