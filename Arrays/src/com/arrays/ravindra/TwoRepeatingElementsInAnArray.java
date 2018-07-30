package com.arrays.ravindra;

public class TwoRepeatingElementsInAnArray {

	public static void main(String[] args) {
		int[] arr = {4, 2, 4, 5, 2, 3, 1};
		RepeatingElements(arr);

	}
	
	public static void RepeatingElements(int[] arr){
			
		int result =0;
		for(int i=0;i<arr.length;i++){
			result = result^arr[i];
		}
		for(int i=1; i<=arr.length-2;i++){
			result = result ^i;
		}
		int setBit = result & ~(result-1);
		
		int x =0; int y =0;
		
		for(int i=0;i<arr.length;i++){
			
			if((setBit & arr[i]) !=0){
				x = x^arr[i];
			}else{
				y= y^arr[i];
			}
		}
		
		for(int i=1;i<=arr.length-2;i++){
			
			if((setBit & i) !=0){
				x = x^i;
			}else{
				y= y^i;
			}
		}
		
		System.out.println(x + "****" +y);
		
	}

}
