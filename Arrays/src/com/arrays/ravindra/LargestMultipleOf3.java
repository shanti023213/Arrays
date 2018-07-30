package com.arrays.ravindra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class LargestMultipleOf3 {

	public static void main(String[] args) {
		int[] arr = {5, 4, 3, 1, 1} ;
		
		findMaxMultupleOf3(arr);
	}
	
	public static void findMaxMultupleOf3( int[] arr)
	{
	    Arrays.sort(arr);
	    
	 
	    // Create 3 queues to store numbers with remainder 0, 1
	    // and 2 respectively
	    Queue<Integer>  queue0 = new LinkedList<Integer>();
	    Queue<Integer>  queue1 = new LinkedList<Integer>();
	    Queue<Integer>  queue2 = new LinkedList<Integer>();
	 
	    // Step 2 and 3 get the sum of numbers and place them in
	    // corresponding queues
	    int i, sum;
	    for ( i = 0, sum = 0; i < arr.length; ++i )
	    {
	        sum += arr[i];
	        if ( (arr[i] % 3) == 0 )
	            queue0.add(arr[i] );
	        else if ( (arr[i] % 3) == 1 )
	        	 queue1.add(arr[i] );
	        else
	        	 queue2.add(arr[i] );
	    }
	 
	    // Step 4.2: The sum produces remainder 1
	    if ( (sum % 3) == 1 )
	    {
	        // either remove one item from queue1
	        if (!queue1.isEmpty())
	            queue1.poll();
	 
	        // or remove two items from queue2
	        else
	        {
	            if (!queue2.isEmpty())
	                queue2.poll();
	            else
	                System.out.println("Not possible");
	 
	            if (!queue2.isEmpty())
	            	queue2.poll();
	            else
	                System.out.println("Not possible");
	        }
	    }
	 
	    // Step 4.3: The sum produces remainder 2
	    else if ((sum % 3) == 2)
	    {
	        // either remove one item from queue2
	        if (!queue2.isEmpty())
	        	queue2.poll();
	 
	        // or remove two items from queue1
	        else
	        {
	            if (!queue1.isEmpty())
	            	queue1.poll();
	            else
	                System.out.println("Not possible");
	 
	            if (!queue1.isEmpty())
	            	queue1.poll();
	            else
	                System.out.println("Not possible");
	        }
	    }
	 
	    ArrayList<Integer> list = new ArrayList<Integer>();
	    populateAux (list, queue0, queue1, queue2);
	    Collections.sort(list, Collections.reverseOrder()); 
	    
	    for(int k=0;k<list.size();k++){
	    	System.out.println(list.get(k));
	    }
	    }
	
	
	public static void populateAux (ArrayList<Integer>list, Queue<Integer> queue0, Queue<Integer> queue1,
			Queue<Integer> queue2){
			// Put all items of first queue in aux[]
		while (!queue0.isEmpty())
			list.add(queue0.poll());
		
		// Put all items of second queue in aux[]
		while (!queue1.isEmpty())
			list.add(queue1.poll());
		
		// Put all items of third queue in aux[]
		while (!queue2.isEmpty())
			list.add(queue2.poll());
	
}
}
