package com.arrays.ravindra;

public class DuplicateInAnArray {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 1, 3, 6, 6};
		printDuplicates(arr);

	}
	
	public static void printDuplicates(int[] arr){
		for(int i=0;i<arr.length;i++){
			if(arr[Math.abs(arr[i])] >=0){
				arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
			}else{
				System.out.println(Math.abs(arr[i]));
			}
		}
	}

}
