package com.arrays.tushar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

class Interval implements Comparable<Interval>{
	int start;
	int end;
	
	public Interval(int start, int end){
		this.start = start;
		this.end =end;
	}
	
	

	@Override
	public int compareTo(Interval a) {
		
		return this.end-a.end;
	}
}

public class MeetingRoomScheduling {
	
	public static void main(String[] args){
		int[][] meetings ={{10,13},{9,14},{7,11},{12,16},{20,25},{1,50}};
		System.out.println(noOfMeetingRooms(meetings));
	}
	
	public static int noOfMeetingRooms(int[][] meetings){
		
		Interval[] list = new Interval[6];
		
		for(int i=0;i<meetings.length;i++){
			
			list[i] = new Interval(meetings[i][0],meetings[i][1]);
		}
		
		return minMeetingRooms1(list);
	}
	
	
	public static int minMeetingRooms1(Interval[] intervals) {
        int[] start = new int[intervals.length];
        int[] end = new int[intervals.length];

        for (int i = 0; i < intervals.length; i++) {
            start[i] = intervals[i].start;
            end[i] = intervals[i].end;
        }

        Arrays.sort(start);
        Arrays.sort(end);

        int j = 0;
        int rooms = 0;
        for (int i = 0; i < start.length; i++) {
            if (start[i] < end[j]) {
                rooms++;
            } else {
                j++;
            }
        }
        return rooms;
    }
	
	
	public static int minMeetingRooms(Interval[] intervals) {
	    if(intervals==null||intervals.length==0)
	        return 0;
	 
	    Arrays.sort(intervals, new Comparator<Interval>(){
	        public int compare(Interval i1, Interval i2){
	            return i1.start-i2.start;
	        }
	    });
	 
	    PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
	    int count=1;
	    queue.offer(intervals[0].end);
	 
	    for(int i=1; i<intervals.length; i++){
	        if(intervals[i].start<queue.peek()){
	            count++;
	 
	        }else{
	            queue.poll();
	        }
	 
	        queue.offer(intervals[i].end);
	    }
	 
	    return count;
	}

}
