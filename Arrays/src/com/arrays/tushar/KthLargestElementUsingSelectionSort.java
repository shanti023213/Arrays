package com.arrays.tushar;

public class KthLargestElementUsingSelectionSort {

	public static void main(String[] args) {
		int[] a ={3,4,12,19,7,26,5};
		System.out.println(kthLargestElement(a,0,a.length-1,3));

	}
	
	public static int kthLargestElement(int[] arr ,int l, int r, int k){
		
		while(l<=r){
			
			int pos = partition(arr,l,r);
			if(pos == arr.length-k){
				return arr[pos];
			}else if(pos<arr.length-k){
				l=pos+1;
			}else{
				r=pos-1;
			}
			System.out.println("**");
		}
		
		
		return 0;
	}

	public static int partition(int[] arr,int l, int r){
		
		int i= l-1;
		for(int j=l;j<r;j++){
			
			if(arr[j]<arr[r]){
				i++;
				int temp= arr[j];
				arr[j]= arr[i];
				arr[i]=temp;
			}
			
		}
		i++;
		int temp= arr[r];
		arr[r]= arr[i];
		arr[i]=temp;
		
		return i;
	}
}
