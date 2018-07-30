package com.arrays.tushar;

import java.util.HashMap;
import java.util.Map;

public class LargestSubArrayWithEqual1and0 {

	public static void main(String[] args) {
		 int arr[] = {1, 0, 0, 1, 0, 1, 1};
		 System.out.println(maxLengthSubArray(arr));
		 System.out.println(equalNumber(arr));

	}
	
	public static int maxLengthSubArray(int[] arr){
		
		int sum=0; int maxLength=0;
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for(int i=0;i<arr.length;i++){
			sum+=arr[i]==0?-1:1;
			
			if(map.containsKey(sum)){
				if(maxLength< i-map.get(sum)){
					maxLength =i-map.get(sum);
				}
			}else{
				map.put(sum, i);
			}
		}
		return maxLength;
	}
	
	
	    public static int equalNumber(int arr[]){

	        int sum[] = new int[arr.length];
	        sum[0] = arr[0] == 0? -1 : 1;
	        for(int i=1; i < sum.length; i++){
	            sum[i] = sum[i-1] + (arr[i] == 0? -1 : 1);
	        }
	        
	        Map<Integer,Integer> pos = new HashMap<Integer,Integer>();
	        int maxLen = 0;
	        int i = 0;
	        for(int s : sum){
	            if(s == 0){
	                maxLen = Math.max(maxLen, i+1);
	            }
	            if(pos.containsKey(s)){
	                maxLen = Math.max(maxLen, i-pos.get(s));
	            }else{
	                pos.put(s, i);
	            }
	            i++;
	        }
	        return maxLen;
	    }

}
