package com.arrays.ravindra;

import java.util.Arrays;

public class SmallestSumNotPossible {

	public static void main(String[] args) {
	
		int[] arr = {1, 2, 3, 4, 5, 6};
		smallestSumNotPossible(arr);

	}
	
	public static void smallestSumNotPossible(int[] arr){
		
		Arrays.sort(arr);
		int p=1+arr[0];// dont take arr[0] what if arr[0] starts from 2 ? so take p as 1
		
		for(int i=1;i<arr.length;i++){
			if(p<arr[i]){
				break;
			}
			p+=arr[i];
		}
		
		System.out.println(p+1);
	}

}
