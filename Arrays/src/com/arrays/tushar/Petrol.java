package com.arrays.tushar;

public class Petrol {
	
	  public static void main(String args[]){
	        int[] gasAvailable = {4, 4, 6};
	        int[] gasRequired = {5, 6, 7};
	        System.out.println(startTour(gasAvailable, gasRequired));
	       
	    }

	  public static int startTour(int[] gasAvailable, int[] gasRequired){
		  
		  int currentGas = gasAvailable[0] -gasRequired[0];
		  int start =0; int end =1; int n = gasAvailable.length;
		  
		  while(start!=end || currentGas<0){
			  while(start!=end && currentGas<0){
				  currentGas = currentGas +gasRequired[start] -gasAvailable[start];
				  start = (start+1)%n;
			  }
			  
			  if(start==0){
				  return -1;
			  }
			  currentGas = currentGas+gasAvailable[start]-gasRequired[start];
			  end = (end+1)%n;
		  }
		  
		  return start;
	  }
}
