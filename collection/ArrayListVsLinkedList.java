package com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class ArrayListVsLinkedList {
	
	public static void main(String[] args) {
	ArrayList<Integer> arrList = new ArrayList<Integer>();
	arrList.add(100);
	arrList.add(100);
	arrList.add(150);
	arrList.add(110);
	arrList.add(1000);
	
	
	/*Employee obj = new Employee();
	obj.setEmpid(100);
	obj.setEmpnae("Ramesh");*/

	
	/*
	 * for (Integer integer : arrList) { System.out.println(arrList.remove(0)); }
	 */
	  Iterator it = arrList.iterator();
	  while (it.hasNext()) {
		  int i = (int) it.next();
		  it.remove();
		
	}
	
	//System.out.println("Before dipsly list elemnts::"+ System.currentTimeMillis());
	
	/*arrList.add(3, 5000);
	arrList.add(2, 5000);
	arrList.add(1, 5000);*/
	
	System.out.println(arrList+"After update list elemnts::"+ System.currentTimeMillis());
	
	LinkedList<Integer> linkedList = new LinkedList<Integer>();
	linkedList.add(100);
	linkedList.add(100);
	linkedList.add(150);
	linkedList.add(110);
	linkedList.add(1000);
	
	
//System.out.println("Before dipsly Linkedlist elemnts::"+ System.currentTimeMillis());
	
linkedList.add(3, 5000);
linkedList.add(2, 5000);
linkedList.add(1, 5000);

Collections.synchronizedList(linkedList);
	
	System.out.println(linkedList+"After update linkedList elemnts::"+ System.currentTimeMillis());
	}

}
