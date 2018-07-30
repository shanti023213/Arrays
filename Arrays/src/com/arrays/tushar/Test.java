package com.arrays.tushar;

//Java program to sum two numbers  
//represented two arrays.
import java.io.*;

public class Test {
	
	public static void main(String[] args){
	  int arr[] = {6, 7, 8, 1, 2, 3, 11, 10};
      System.out.println(maxProduct(arr));
      int arr1[] = {1, 5, 10, 8, 9};
      System.out.println(maxProduct(arr1));
	}
	
	
	public static int maxProduct(int[] arr){
		
		int[] a = new int[arr.length]; // left greatest smaller
		int[] b = new int[arr.length]; //Right greatest larger
		
		b[b.length-1] =0;int max = arr[arr.length-1];
		for(int i= b.length-2;i>=0;i--){
			
			if(max<arr[i]){
				max = arr[i];
			}else if(max>arr[i]){
				b[i] =max;
			}
			
		}
		
		a[0] = 0; 
		
		for(int i=1;i<b.length;i++){
			
			int j=i-1; int smallestMax = 0;
			while(j>=0){
				if(arr[i]>arr[j]){
					
					if(arr[j]>smallestMax){
						smallestMax =arr[j];
					}
				}
				j--;
			}
			
			a[i] = smallestMax;
		}
		
		int product=0; int result =0;
		
		for(int i=0;i<arr.length;i++){
			product =(a[i]*b[i]*arr[i]);
			if(product>result){
				result = product;
			}
		}
		return result;
	}
}

//This article is contributed by Gitanjali.