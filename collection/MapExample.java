package com.collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class MapExample {
   public static void main(String[] args) {
	
	   Map<Integer, Integer> map = new Hashtable<Integer, Integer>();//creatio of Map Object
	   map.put(1,500);
	   map.put(100,555);
	 //  System.out.println(map);
	   map.put(5, 555);//map doenst not allowsd duplicate keys 
		/*
		 * map.put(null, 1000); map.put(null, 1056);//map allows only one null key
		 * map.put(null, null);//it allows one null key and multiple null value
		 * 
		 * map.put(100,null); map.put(1,null);
		 */
	for (Entry<Integer, Integer> entry : map.entrySet()) {
		
		System.out.println(entry.getKey() + "===" +entry.getValue());
		map.remove(entry.getKey());
	}
	
	//map.remove(100);
	
	   
}
}
