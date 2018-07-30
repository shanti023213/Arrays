package com.arrays.ravindra;

public class RepeatingElementsInanArray {

	public static void main(String[] args) {
	 int[] a ={2,4,2,5,4,3,1};
	 
	 repeatingElementsInArray(a);

	}
	
	public static void repeatingElementsInArray(int[] a){
		
		//1. target is to get xor of the two repeating elements
		//findout xor of all elements and xor them with n-2 natural numbers
		
		int xy=a[0]; int setbit; int x=0;int y=0;
		for(int i=1;i<a.length;i++){
			
			xy ^= a[i];
		}
		
		for(int i=1;i<=a.length-2;i++){
			
			xy ^= i;
		} //here xy contains xor of te repeating elements
		
		//find setbit
		
		setbit = (xy & (~(xy-1)));
		
		for(int i=0;i<a.length;i++){
			int temp= a[i] & setbit;
			if(temp!=0){
				x^=a[i];
				
			}else{
				y^=a[i];
			}
			
		}
		
		for(int i=0;i<=a.length-2;i++){
			
			int temp = i&setbit;
			
			if(temp!=0){
			x^=i;
			}else{
			y^=i;
		}
			}
		
		
		  System.out.println("The two reppeated elements are :");
	        System.out.println(x + " " + y);
	}

}
