package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class TestMain {
   public static void main(String[] args) {
	//int a,b,c,d,e,f,n;
	//int arr[] = new int[];//invlid
	int arr[] = new int[3];//valid
	arr[0]=10;
	arr[1]=20;
	//arr[2]=30;
	//arr[3]=50;
	try {
	System.out.println(arr[3]);//facing problem with size
	//arr[2]=10.f;//it will allow only same data type
	}
	catch (Exception exp) {
		// TODO: handle exception
		exp.printStackTrace();
	}
	//arr[0]= new Employee();//object type not allowed
	
	Employee obj[] = new Employee[2];//it is valid
	obj[0] = new Employee();
	obj[1] = new Employee();
	
	//obj[0]= new Customer();//it allosws same object type
	
	
	Object object[] = new Object[2];
	object[0] = new Employee();
	object[1]= new Customer();//it allosws same object type
	object[1]= new Department();
	//.......n no of object type assign
	
	
	///But still what are the problems we can have it..?
	//finally size is fixed
	//underlying data structre ethods are not availabe
	
	
	Collection collection= new ArrayList();//crreating an object for the ..? 
	collection.add(123);
	collection.add("Test");
	collection.add(10.2f);
	//remove
	collection.remove(123);
	//collection.s
	//update
	
	System.out.println(collection.size()+"Collection data is::"+ collection);
	
    List<Integer> intList = new ArrayList<Integer>();
    intList.add(100);
    intList.add(500);
    intList.set(0, 1000);//update
    //intList.remove(0);
    System.out.println("before sortList data is:::"+ intList);
    Collections.sort(intList);
    System.out.println(" sortList data is:::"+ intList);
  
    
    
    for(int i=0; i< intList.size(); i++) {
    	  System.out.println(intList.get(i));
    }
	//list.re
	
	//
    List<Object> empList = new Stack<Object>();
    empList.add(new Employee());
    empList.add(new Employee());
    empList.add(new Customer());
    
    
    Integer arrType[]= {10,20,45,60};
    List<Integer> listOfInt = Arrays.asList(arrType);
   // listOfInt.forEach(System.out::println);//java9
    for(int i=0; i< listOfInt.size(); i++)
    	System.out.println(listOfInt.get(i)+"Narmal for loop");
    System.out.println("======");
    
    
    for (Integer integer : listOfInt) {
		System.out.println(integer+"For Each loop");
	}
    
    
	
}
}
