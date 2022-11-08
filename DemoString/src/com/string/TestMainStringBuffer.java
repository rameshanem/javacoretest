package com.string;

import java.util.Arrays;
import java.util.List;

public class TestMainStringBuffer {

	 public static void main(String[] args) {
		
		//creating StringBuffer Object
		 
		 StringBuilder sbOne = new StringBuilder("StringBuffer");
		 
		 String strOne="Sagar";//5  ==> 0 to 4
		 //StringBuffer sb = new StringBuffer(strOne);
		// sb = sb.append("kosuru");
		 System.out.println(sbOne.hashCode()   +  "====="+   sbOne.append("kosuru").hashCode());
		// String strTwo="Kosuru";
		 
		 
		 System.out.println("Reverse" + sbOne.reverse());
		 
      for(int i=0; i < sbOne.length(); i++) {
    	  
    	  System.out.println("======"+ sbOne.charAt(i));
      }
		 
      List<Integer> list = Arrays.asList(12,14,10,15);
      
      for(int i=0; i< list.size(); i ++) {
    	  
    	  System.out.println(list.get(i)+"This is Narmal for loop method");
      }
      
      
      for (Integer integer : list) {
		System.out.println(integer+"For Each");
	}
      
      System.out.println("Using java8   ");
      list.forEach(System.out::println );
		 
	}
}
