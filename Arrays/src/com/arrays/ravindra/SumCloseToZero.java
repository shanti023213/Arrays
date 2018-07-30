package com.arrays.ravindra;

public class SumCloseToZero {

	public static void main(String[] args) {
		
		int[] a= {-2,9,6,1,2,-5};
		sort(a,0,a.length-1);
		
		
		sumClosetoZero(a);

	}
	
	public static void sumClosetoZero(int[] a){
		
		int l=0,r=a.length-1,start = -1,end = -1,diffCloseTozero =Integer.MAX_VALUE;
		
		while(l<r){
			
		int diff = Math.abs(a[r])-Math.abs(a[l]);
		
		if(diffCloseTozero>Math.abs(diff)){
			diffCloseTozero =diff;
			start =l;
			end=r;
		}
		if(diff<0)
			l++;
		else if(diff>0)
			r--;
		else 
			break;
		}
		
		System.out.println("Differnce close to zero found at"+""+start+" to "+end+ "and the difference is"+diffCloseTozero);
		
	}
	
	public static void sort(int[] a, int l, int r)
	{
		if(l<r){
			
			int m = (l+r)/2;
			sort(a,l,m);
			sort(a,m+1,r);
			merge(a,l,m,r);
		}
		
	}
	
	//9,8,7,6,5,4,3,2,1
	public static void merge(int[] a, int l, int m,int r)
	{
		int n1= m-l+1;
		int n2= r-m;
		
		int[] left = new int[n1];
		int[] right = new int[n1];
		
		for(int i=0;i<n1;i++){
			left[i] = a[l+i];
			
		}
		
		for(int i=0;i<n2;i++){
			right[i] = a[m+1+i];
			
		}
		
		
		int i=0,j=0,k=l;
		while(i<n1&&j<n2){
			
			
			if(left[i]<=right[j]){
				
				a[k] =left[i];
				i++;
				
			}else{
				
				a[k]=right[j];
				j++;
				
			}
			
			k++;
		}
		
		while(i<n1){
			
			a[k]=left[i];
			i++;
			k++;
			
		}
		
		while(j<n2){
			
			a[k]=right[j];
			j++;
			k++;
			
		}
	
	}
}
