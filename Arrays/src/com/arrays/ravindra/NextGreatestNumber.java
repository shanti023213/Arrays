package com.arrays.ravindra;

import java.util.Arrays;

public class NextGreatestNumber {

	public static void main(String[] args) {
		 //char digits[] = { '2','1','8','7','6','5' };
		 char digits[] = { '5','3','4','9','7','6'};
		 nextGreatestNumber(digits);

	}
	
	public static void nextGreatestNumber(char[] arr){
		
		int index =-1;
		for(int i=arr.length-1;i-1>=0;i--){
			if(arr[i]>arr[i-1]){
				index = i-1;
				break;
			}
		}
		
		int min = index+1; int target =index;
		for(int i=index+2;i<arr.length;i++){
			if(arr[i] > arr[target] && arr[i]<arr[min] ){
				min = i;
			}
		}
		
		char temp = arr[min];
		arr[min] = arr[index];
		arr[index]= temp;
		Arrays.sort(arr,index+1,arr.length);
		
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}
