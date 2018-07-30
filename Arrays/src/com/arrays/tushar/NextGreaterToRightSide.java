package com.arrays.tushar;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class NextGreaterToRightSide {

	public static void main(String[] args) {
		 int input[] = {4,2,-8,6,0,-3,-1,1,9};
		 int[] result = nextGreaterElements(input);
		 int[] result1 = larger(input);
		 
		 System.out.println("******");

	}

	public static int[] nextGreaterElements(int[] arr){
		
		int[] result = new int[arr.length];
		Stack<Integer> stack = new Stack<Integer>();
		stack.add(0);
		for(int i=1;i<arr.length;i++){
			
			if(arr[i]>arr[stack.peek()]){
				
				while(!stack.isEmpty() && arr[stack.peek()] <arr[i]){
					result[stack.pop()] = arr[i];
				}
				stack.push(i);
			}else{
				
				stack.push(i);
			}
		}
		
		while(!stack.isEmpty()){
			result[stack.pop()] = -1;
		}
		return result;
	}
	
	public static int[] larger(int input[]){
        Deque<Integer> stack = new LinkedList<Integer>();
        int result[] = new int[input.length];
        for(int i=0; i < result.length; i++){
            result[i] = -1;
        }
        
        stack.offerFirst(0);
        for(int i=1; i < input.length; i++){
            while(stack.size() > 0){
                int t = stack.peekFirst();
                if(input[t] < input[i]){
                    result[t] = i;
                    stack.pollFirst();
                }else{
                    break;
                }
            }
            stack.offerFirst(i);
        }
        return result;
    }
}
