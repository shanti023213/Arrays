package com.arrays.ravindra;

import java.util.HashMap;
import java.util.Map;

public class LargestSumArrayEqual0and1 {

	public static void main(String[] args) {
		 	int arr[] = {1, 0, 0, 1, 0, 1, 1 ,0};
		 	
		 	System.out.println(maxLen(arr));

	}

	public static int maxLen(int[] arr){
		
		int sum =0; int length =0;
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for(int i=0;i<arr.length;i++){
			sum +=arr[i]==1?1:-1;
			
			if(sum==0){
				
					length =i+1;
				continue;
			}
			if(map.containsKey(sum)){
				int index = map.get(sum);
				if(i-index>length){
					length = i-index;
				}
			}else{
				map.put(sum, i);
			}
		}
		return length;
	}
}
