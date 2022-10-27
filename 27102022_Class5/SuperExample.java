/**
   Super is a keyword among 55plus keywords in java
   by using this keyword wwe can call super class instance varbales, instance methods
   and constructors as well.

   We can not call the static vables and methods even from static context(sttaic methods)

   Inside constructor the super keyword shuld be in first statement otherwise compiler will give an error

   Inside instance method you call any where

*/

class SuperExample extends Super2
{
SuperExample(){
  
	 super(5000);//super keyword should use irst statment in the constructor
   System.out.println("Hello World!");
  

}
public void display(){


		System.out.println("Inside method one ");
       System.out.println("Inside method"+ super.i);
  
}
 
	public static void main(String[] args) 
	{
		

		SuperExample obj = new SuperExample();
		obj.display();
		
	}
}
