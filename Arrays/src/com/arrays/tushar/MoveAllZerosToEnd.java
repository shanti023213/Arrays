package com.arrays.tushar;

public class MoveAllZerosToEnd {
	  public static void main(String args[]){
	        int arr[] = {0,0,1,2,0,5,6,7,0};
	        moveZeros(arr);
	        for(int i=0; i < arr.length; i++){
	            System.out.print(arr[i]);
	        }
	    }
	  
	  
	  public static void moveZeros(int[] arr){
		  
		  int l= 0; int r =arr.length-1;
		  
		  while(l<r){
			  
			  while((l<r) && (arr[l]!=0)){
				  l++;
			  }
			  while((l<r) && (arr[r]==0)){
				  r--;
			  }
			  
			  if(l<r){
				  int temp =arr[l];
				  arr[l] = arr[r];
				  arr[r]=temp;
				  l++;
				  r--;
			  }
		  }
	  }
}

