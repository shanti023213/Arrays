package com.arrays.tushar;

public class TripletWithGivenSum {
	
	public static void main(String[] args){
		 int input[] = {1,2,6,9,11,18,26,28};
		 printTripetWithGivenSum(input,22);
	}

	
	public static void printTripetWithGivenSum(int[] arr, int sum){
		
		for(int i=0;i<arr.length;i++){
			
			int l=i+1; int r =arr.length-1;
			
			while(l<r){
				if(arr[i]+arr[l]+arr[r] ==sum){
					System.out.println(i+":"+l+":"+r);
					break;
				}else if(arr[i]+arr[l]+arr[r] <sum){
					l++;
				}else{
					r--;
				}
			}
		}
	}
}
