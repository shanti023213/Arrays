package com.arrays.tushar;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


class ValueComparator1 implements Comparator{
	
	@Override
	public int compare(Object o1,Object o2){
		return (((Entry<Integer,Integer>)o2).getValue() - ((Entry<Integer,Integer>)o1).getValue());
		
	}
}



public class GroupElementsInSizeM2 {

    public static boolean group(int input[],int m){
    	
    	Map<Integer,Integer> map = new HashMap<Integer,Integer>();
    	
    	int max =1;
    	for(int i=0;i<input.length;i++){
    		
    		if(map.containsKey(input[i])){
    			int count = map.get(input[i]);
    			map.put(input[i], count+1);
    			if(count+1 >max){
    				max =count+1;
    			}
    		}else{
    			map.put(input[i],1);
    		}
    	}
    	if(max>Math.ceil(input.length*1.0/m)){
    		return false;
    	}
    	
    	List<Entry<Integer,Integer>> list = new LinkedList<Entry<Integer,Integer>>(map.entrySet());
    	
    	Collections.sort(list , new ValueComparator());
    	
    	Map<Integer,Integer> sortedMap = new LinkedHashMap<Integer,Integer>();
    	
    	Iterator it = list.iterator();
    	while(it.hasNext()){
    		Entry<Integer,Integer> entry = (Entry<Integer,Integer>)it.next();
    		sortedMap.put(entry.getKey(), entry.getValue());
    	}
    	
    	int currentIndex =0;
		int start =0;
    	for(Integer key: sortedMap.keySet()){
    		
    		int count = sortedMap.get(key);
    	
    		while(count>0){
    			input[start] = key;
    			start = start+m;
    			
    			if(start>input.length-1){
    				currentIndex++;
    				start = currentIndex;
    			}
    			count--;
    		}
    		
    	}
    	
    	return true;
    }
    
    public static void main(String args[]){
        int input[] = {2,1,5,1,3,5,3,3,4};
        int input1[] = {1,2,3,8,8,8,7,8};
        boolean r = group(input, 3);
        System.out.println(r);
        for(int i=0; i < input.length; i++){
            System.out.println(input[i]);
        }
    }
}
