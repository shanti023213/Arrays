package com.arrays.tushar;

public class MaximumGap {

    class Bucket {
        int low ;
        int high;
        boolean isSet = false;
        void update(int val) {
            if (!isSet) {
                low = val;
                high = val;
                isSet = true;
            } else {
                low = Math.min(low, val);
                high = Math.max(high, val);
            }
        }
    }

    public int maximumGap(int[] input) {
        if (input == null || input.length < 2) {
            return 0;
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < input.length; i++) {
            min = Math.min(min, input[i]);
            max = Math.max(max, input[i]);
        }

        int gap = (int) Math.ceil((double) (max - min) / (input.length - 1));

        Bucket[] buckets = new Bucket[input.length - 1];

        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new Bucket();
        }

        for (int i = 0; i < input.length; i++) {
            if (input[i] == max || input[i] == min) {
                continue;
            }
            buckets[(input[i] - min) / gap].update(input[i]);
        }

        int prev = min;
        int maxGap = 0;
        for (int i = 0; i < buckets.length; i++) {
            if (!buckets[i].isSet) {
                continue;
            }
            maxGap = Math.max(maxGap, buckets[i].low - prev);
            prev = buckets[i].high;
        }

        return Math.max(maxGap, max - prev);
    }

    public static void main(String args[]) {
        int[] input = {1,2,3,4,5,6};
        MaximumGap mg = new MaximumGap();
        System.out.println(mg.maximumGap(input));
    }
}
