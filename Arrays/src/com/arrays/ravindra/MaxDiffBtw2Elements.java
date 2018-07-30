package com.arrays.ravindra;

public class MaxDiffBtw2Elements {
	
	public static void main(String[] args) {
		int[] a ={4,3,10,2,9,1,6};
		
		System.out.print(maxDiff2(a));
	}

	
	public static int maxDiff1(int[] a){
		
		int maxDiff=0;
		int min_so_far = a[0];
		
		for(int i=1;i<a.length;i++){
			
			if(a[i] < min_so_far){
				
				min_so_far =a[i];
			}else{
				
				if(a[i] -min_so_far >maxDiff){
					maxDiff = a[i] -min_so_far;
				}
			}
		}
		
		return maxDiff;
		
	}
	
public static int maxDiff2(int[] a){
		
		
		int[] diff = new int[a.length-1];
		
		for(int i=0;i<diff.length;i++){
			
			diff[i] = a[i+1]-a[i];
		}
		
		int maxSumSubArray=0, current_sum= 0;
		
		for(int i=0;i<diff.length;i++){
			
			if(diff[i]+current_sum >0){
				
				current_sum= current_sum+diff[i];
				
				if(current_sum>maxSumSubArray){
					maxSumSubArray = current_sum;
				}
			}else{
				
				current_sum =0;
			}
		}
		
		
	
		return maxSumSubArray;
		
	}
}
