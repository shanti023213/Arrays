package com.arrays.ravindra;

public class BinarySearchIterative {

	public static void main(String[] args) {
	int[] a = {3,4,5,6,7,8,9,10};
	
	//1,0,0,0,0,0,1,1,0
	
	System.out.println(BinarySearch(a,0,a.length, 6));

	}
	
	public static int BinarySearch(int[]a , int r, int l, int target)
	{
		
		int mid;
		
		while(r<=l){
			
			mid  = (l+r)/2;
			if(a[mid]==target){
				
				return mid;
			} else if(a[mid]> target){
				
				l= mid-1;
			}else{
				r= mid+1;
				
			}
		}
		
		return -1;
	}
}
