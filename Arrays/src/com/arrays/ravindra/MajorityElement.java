package com.arrays.ravindra;

public class MajorityElement {

	public static void main(String[] args) {
		int[] a ={1,2,1,3,1,4,5,1};
		
		majorityEle(a);
	}
	
	public static void majorityEle(int[] a){
		
		int major = a[0]; int votes=1;
		
		for(int i=1;i<a.length;i++){
			
			if(a[i]== a[i-1]){
				
				++votes;
			}else{
				
				--votes;
			}
			
			if(votes<=0){
				major =a[i];
		}
		}
		
		int size =0;
		for(int i=0;i<a.length;i++){
			if(a[i] == major){
				size++;
				
			}
			
		}
		
		if(a.length/2 <=size){

			System.out.println("MajorityElement " + major);
		}
		
	}

}
