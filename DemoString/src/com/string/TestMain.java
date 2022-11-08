package com.string;

public class TestMain {

	 public static void main(String[] args) {
		
		
		 
		/* char data[] = {'a', 'b', 'c'};
	     String str2 = new String(data);
	     
	     Integer it;*/

		 
		 //hhow to check whtehr two Objects or Content will be ame or not:::
		 String one=new String("Test");
		 String two=new String ("Test");
		
		 if(one == two) {
			 System.out.println(two.hashCode()+"result with using ===" + one.hashCode());
		 }
		 else {
			 System.out.println("Not same ");
		 }
		 
		 if(one.equals(two)) {
			 System.out.println(two.hashCode()+"result with using equals" + one.hashCode());
		 }
		 else {
			 System.out.println("Not same ");
		 }
		 
		 //String methods:::
		 char ch= one.charAt(2);
		 System.out.println(ch);
		 
		/*
		 * IntStream inStream = one.chars(); System.out.println(inStream);
		 */
		 
		 String strre =one.toString();
		 one.toUpperCase();
		 System.out.println("=="+  one.toLowerCase());
		 
	}
}
