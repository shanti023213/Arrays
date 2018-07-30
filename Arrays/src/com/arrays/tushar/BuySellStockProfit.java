package com.arrays.tushar;

public class BuySellStockProfit {

    public int allTimeProfit(int arr[]){
    	
    	int profit =0;
    	for(int i=1;i<arr.length;i++){
    		if(arr[i] >arr[i-1]){
    			profit+=arr[i]-arr[i-1];
    		}
    	}
    	return profit;
    }
    
    public int oneProfit(int a[]){
    	
    	int smallSofar = a[0];
    	int maxDiff = Integer.MIN_VALUE;
    	
    	for(int i=1;i<a.length;i++){
    		if(a[i]>smallSofar){
    			
    			if(a[i]-smallSofar >maxDiff){
    				maxDiff= a[i]-smallSofar;
    			}
    		}else{
    			smallSofar = a[i];
    		}
    	}
    	
    	
    	return maxDiff;
    }
    
    public static void main(String args[]){
        int arr[] = {7,10,15,5,11,2,7,9,3};
        int arr1[] = {6,4,1,3,5,7,3,1,3,4,7,9,2,5,6,0,1,2};
        BuySellStockProfit bss = new BuySellStockProfit();
        System.out.println(bss.oneProfit(arr));
        System.out.print(bss.allTimeProfit(arr1));
        
    }
}