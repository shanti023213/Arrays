package com.arrays.ravindra;

public class SortArrayInWaveForm {

	public static void main(String[] args) {
		 int[] arr = {10, 5, 6, 3, 2, 20, 100, 80};
		 convertToWave(arr);
	}
	
	public static void convertToWave(int[] arr){
		
		for(int i=0;i<arr.length;i+=2){
			
				if( i>0 && arr[i]<arr[i-1]){
					int temp =arr[i];
					arr[i]= arr[i-1];
					arr[i-1]= temp;
				}
				
				if(i<arr.length-1 && arr[i]<arr[i+1]){
					int temp =arr[i];
					arr[i]= arr[i+1];
					arr[i+1]= temp;
				}
			
		}
		
		
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}

}
