package com.arrays.ravindra;

public class Seperate0sAnd1s {

	public static void main(String[] args) {
		int[] a ={1,0,0,0,1,1,0,1,0,0};
		//seperateTechnique1(a);
		seperateTechnique2(a);

	}
	

	
	public static void seperateTechnique1(int[] a) {

		int coutZeros = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				coutZeros++;
			}
		}

		for (int i = 0; i < a.length; i++) {
			a[i] = (coutZeros > 0) ? 0 : 1;
			coutZeros--;
		}

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}
	
	public static void seperateTechnique2(int[] a) {
		
		int l=0,r=a.length-1; //int[] a ={1,0,0,0,1,1,0,1,0,0};
		
		while(l<r){
			
			while(a[l]==0 &&l<r){
				
				l++;
				
			}
			
			while(a[r] ==1 && l<r){
				
				r--;
				
			}
			
			if(l<r){
			a[l++]=0;
			a[r--]=1;
			}
			
		}
		
		
	}
	

}
