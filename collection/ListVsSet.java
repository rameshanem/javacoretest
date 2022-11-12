package com.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ListVsSet {
	public static void main(String[] args) {
		ArrayList<Integer> arrList = new ArrayList<Integer>();//List follows order so we can call it as Ordered collection
																	//list allows the duplicates
		arrList.add(100);												//list allows number of null values
		arrList.add(8560);
		arrList.add(150);
		arrList.add(1045);
		arrList.add(null);
		arrList.add(null);
		
		 for (Integer integer : arrList) { System.out.println(integer); }
		 
		
		
		//set implementation
		Set<Integer> setObj = new HashSet<Integer>();//Set follows un order so we can call it as Ordered collection it deosnt allow duplicates
		//only one null allows here
		setObj.add(100);
		setObj.add(8560);
		setObj.add(150);
		setObj.add(100);
		setObj.add(null);
		setObj.add(null);
	
		//setObj.addAll(arrList);
		
		for (Integer setIterator : setObj) {
			System.out.println(setIterator+"Set data");
		}
		if(setObj.contains(8560)){
			//statement
			//call the
			
			System.out.println("YES");
		}
		
	}
	


}
