package com.arrays.tushar;

public class ConvertAnArrayIntoDecreaseIncreaseFashion {

	public static void main(String[] args) {
		int arr[] = {0,6,9,13,10,-1,8,2,4,14,-5};
		convertArray(arr);

	}
	
	
	public static void convertArray(int[] arr){
		
		for(int i=0;i<arr.length;i++){
			if(i%2==1 && i>0){
				if(arr[i]<arr[i-1]){
					int temp =arr[i];
					arr[i]= arr[i-1];
					arr[i-1]= temp;
				}
			}
		}
		
		for(int i=0;i<arr.length;i++){
			if(i%2==1 && (i+1)<arr.length){
				if(arr[i]<arr[i+1]){
					int temp =arr[i];
					arr[i]= arr[i+1];
					arr[i+1]= temp;
				}
			}
		}
		
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}

}
