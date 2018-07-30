package com.arrays.tushar;

public class IncreasingTriplet {
	
	public static boolean increasingTriplet(int[] nums) {
		int x = Integer.MAX_VALUE;
		int y = Integer.MAX_VALUE;
	 
		for (int i = 0; i < nums.length; i++) {
			int z = nums[i];
	 
			if (x >= z) {
				x = z;// update x to be a smaller value
			} else if (y >= z) {
				y = z; // update y to be a smaller value
			} else {
				return true;
			}
		}
	 
		return false;
	}
	
	
	public static void main(String args[]) {
        int input[] = {9, 10, -2, 12, 6, 7, -1};
        System.out.print(increasingTriplet(input));
    }

}
