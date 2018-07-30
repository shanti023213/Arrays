package com.arrays.ravindra;

public class NoOfTriangles {

	public static void main(String[] args) {
		int arr[] = {10, 21, 22, 100, 101, 200, 300};
		
		noOfTriangles(arr);

	}

	public static void noOfTriangles(int[] arr){
		
		int count =0; int size = arr.length;
		for(int i=0;i<size-2;i++){
			
			for(int j=i+1;j<size-1;j++){
				int k =i+2;
				while(k<size && arr[i]+arr[j]>arr[k]){
					k=k+1;
				}
				count+=k-j-1;
			}
			
		}
		
		System.out.println(count);
	}
}
