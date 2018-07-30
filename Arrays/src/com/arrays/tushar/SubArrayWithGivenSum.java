package com.arrays.tushar;

public class SubArrayWithGivenSum {

	public static void main(String args[]){
        int input[] = {6,3,9,11,1,3,5};
        subArrayGivenSum(input,15);
    }
	
	public static void subArrayGivenSum(int[] arr,int target){
		
		int l=0; int r=1; int sum =arr[l]+arr[r];
		
		while(l<=r && l<arr.length && r <arr.length){
			
			if(sum==target){
				break;
			}else if(sum<target){
				r++;
				sum+=arr[r];
			}else{
				
				sum-=arr[l];
				l++;
			}
		}
		
		System.out.println(l+":"+r);
	}
}
