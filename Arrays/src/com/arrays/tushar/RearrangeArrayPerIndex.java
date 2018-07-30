package com.arrays.tushar;

import java.util.Arrays;

public class RearrangeArrayPerIndex {

    public void rearrange(int input[]) {

        for (int i = 0; i < input.length; i++) {
            input[i]++;
        }

        for (int i = 0; i < input.length; i++) {
            if (input[i] > 0) {
                rearrangeUtil(input, i);
            }
        }

        for (int i = 0; i < input.length; i++) {
            input[i] = -input[i] - 1;
        }
    }

    private void rearrangeUtil(int input[], int start) {
        int i = start + 1;
        int v = input[start];
        while (v > 0) {
            int t = input[v - 1];
            input[v - 1] = -i;
            i = v;
            v = t;
        }
    }

    public static void main(String args[]) {
        RearrangeArrayPerIndex rai = new RearrangeArrayPerIndex();
        int input[] = {1, 2, 0, 5, 3, 4};
        rai.rearrange(input);
        Arrays.stream(input).forEach(i -> System.out.print(i + " "));
    }

}
