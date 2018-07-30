package com.arrays.ravindra;

import java.util.HashSet;

public class PairOfNumbersWhoseSumIsGivenNumber {
	
	public static void PairOfNumbersMethod1(int[] a, int sum) {

		HashSet<Integer> hashset = new HashSet<Integer>();

		for (int i = 0; i < a.length; i++) {

			if (hashset.contains(sum - a[i])) {

				System.out.println("Numbers exists for a given sum and they are " + a[i] + " " + (sum - a[i]));
			} else {

				hashset.add(a[i]);
			}
		}
	}
	
	public static void PairOfNumbersMethod2(int[] a, int sum) {

		boolean[] hashset = new boolean[100000];
		int temp;

		for (int i = 0; i < a.length; i++) {
			
			temp= sum - a[i];

			if (temp>0 && hashset[temp]) {

				System.out.println("Numbers exists for a given sum and they are " + a[i] + " " + (sum - a[i]));
			} else {

				hashset[a[i]]=true;
			}
		}
	}
	
	
	
	
    
	public static void main(String[] args) {
		int a[] = {8, 4, 45, 6, 10, 8};
	    int n = 16;
	    
	    PairOfNumbersMethod2(a,n);

	}

}
