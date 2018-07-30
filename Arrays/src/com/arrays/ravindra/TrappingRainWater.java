package com.arrays.ravindra;

public class TrappingRainWater {

	public static void main(String[] args) {
		  int arr[] = {0, 1, 0, 2, 1, 0, 1,3, 2, 1, 2, 1};
		  trappingRainWater(arr);
	}
	
	public static void trappingRainWater(int[] arr){
		
		int[] left = new int[arr.length];int max = Integer.MIN_VALUE;
		int[] right = new int[arr.length];
		for(int i=0;i<arr.length;i++){
				if(arr[i]>max){
					max = arr[i];
				}
		left[i] = max;
		}
		
		max =Integer.MIN_VALUE;
		for(int i=arr.length-1; i>=0;i--){
			if(arr[i]>max){
				max= arr[i];
			}
			right[i]= max;
		}
		
		int result=0;
		
		for(int i=0;i<arr.length;i++){
			
			result+=Math.min(left[i], right[i])-arr[i];
		}
		
		System.out.println(result);
	}

}
