package com.arrays.tushar;

import java.util.ArrayList;
import java.util.List;

public class MissingRange {
	
	
	public static void main(String[] args){
		int[] arr = {0, 1, 3, 50, 75};
		System.out.println(getMissingRanges(arr,0,99));
	}
	
	
	public static List<String> getMissingRanges(int[] arr, int lower, int upper){
		
		List<String> list = new ArrayList<String>();
		if(arr == null || arr.length==0){
			 list.add(makeRange(lower, upper));
			 return list;
		}
		
		if(lower<arr[0]){
			list.add(makeRange(lower, arr[0]-1));
		}
		
		for(int i=0;i<arr.length-1;i++){
			if((arr[i]+1)!=arr[i+1]){
				list.add(makeRange(arr[i]+1,arr[i+1]-1));
			}
		}
		
		if(arr[arr.length-1] !=upper){
			list.add(makeRange(arr[arr.length-1]+1,upper));
		}
		
		return list;
	}
	
	
	public static String makeRange(int lower, int upper){
		if(lower == upper){
			return String.valueOf(lower);
		}else{
			return lower + "->" + upper;
		}
	}

}
