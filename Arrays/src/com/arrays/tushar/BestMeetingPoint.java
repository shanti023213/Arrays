package com.arrays.tushar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BestMeetingPoint {
    public int minTotalDistance(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
     
        ArrayList<Integer> cols = new ArrayList<Integer>();
        ArrayList<Integer> rows = new ArrayList<Integer>();
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
               if(grid[i][j]==1){
                   cols.add(j);
                   rows.add(i);
               }
            }
        }
     
        int sum=0;
     
        for(Integer i: rows){
            sum += Math.abs(i - rows.get(rows.size()/2));    
        }
     
        Collections.sort(cols);
     
        for(Integer i: cols){
            sum+= Math.abs(i-cols.get(cols.size()/2));
        }
     
        return sum;
    }

    public static void main(String args[]) {
        BestMeetingPoint bmp = new BestMeetingPoint();
        int[][] grid = {{1, 0, 0, 0, 1}, {0, 0, 0, 0, 0},{0, 0, 1, 0, 0}};
        System.out.print(bmp.minTotalDistance(grid));
    }
}
