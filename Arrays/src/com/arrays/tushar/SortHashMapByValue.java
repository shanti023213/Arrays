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


class ValueComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return ((Map.Entry<Integer, Integer>) o2).getValue()-((Map.Entry<Integer, Integer>) o1).getValue();
	}
	
}

public class SortHashMapByValue {

	
	public static void main(String[] args){
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		map.put(1, 2);
		map.put(2, 3);
		map.put(4, 4);
		map.put(5, 5);
		map.put(6, 6);
		map.put(3, 7);
		
		Map<Integer,Integer> mapResult = sortMapByValue(map);
		System.out.println("******");
	}
	
	public static Map<Integer,Integer>  sortMapByValue(Map<Integer,Integer> map){
		
		List<Entry<Integer,Integer>> list = new LinkedList<Entry<Integer,Integer>>(map.entrySet());
		
		Collections.sort(list, new ValueComparator());
		
		HashMap<Integer,Integer> newMap = new LinkedHashMap<Integer,Integer>();
		
		Iterator it = list.iterator();
		while(it.hasNext()){
			Map.Entry<Integer, Integer> entry = (Map.Entry<Integer, Integer>)it.next();
			newMap.put(entry.getKey(), entry.getValue());
		}
		return newMap;
	}
	
}
