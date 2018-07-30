package com.arrays.tushar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SummaryRanges {
	
	 public static void main(String args[])
	 {
		 int[] arr = {};
		 System.out.println(printSummaryRanges(arr));
	 }
	 
	 
	 public static List<String> printSummaryRanges(int[] arr){
		 
		 if (arr.length == 0) {
	            return Collections.emptyList();
	     }
		 List<String> list = new ArrayList<String>();
		 
		 if (arr.length == 1) {
			 list.add(String.valueOf(arr[0]));
	            return  list;
	     }
		 
		// List<String> list = new ArrayList<String>();
		 int start=arr[0]; int end = -1;
		 
		 for(int i=0;i<arr.length-1;i++){
			 
			 if((arr[i]+1)!=arr[i+1]){
				 end = arr[i];
				 if(start!=end){
					 list.add(start+"->"+end);
				 }else{
					 list.add(String.valueOf(start));
				 }
			 }
		 }
		 
		 if((arr[arr.length-2]+1) !=arr[arr.length-1]){
			 list.add(String.valueOf(arr[arr.length-1]));
		 }
		 
		return list;
	 }
	 

}
