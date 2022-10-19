/**About final keyword
1.) final is a keyword we can define for the class
2.) final keyword we can also define for the varbles but should be intilize the value
otherwise compile rgive an compilation error
3) final varble value can not be change once u intilize
4) final is not allowed for the constructor::: reason it wont allow object creation
5) once you define class as final you can not inherit or extend that class

thats why Java api have all wrapper clasess are final
  Integer, Float,Boolean, Char,......

  final key word we can also define for instance methods and static ethods as well
  astarct and final keywords not allowed for methods
   where as static and final will allow dor varables and methods as well


   We can also applay final keyword for object creation
*/
final class FinalExample 
{
     FinalExample(){

	}
	static final int finalValue=2058;
	static final void display(){
        System.out.println("Inside final method:");
	}

  void displayAbstarctMethod(){
        System.out.println("Inside final method:");
	}
	final int finalVar = 500;
	{//instance blcok
		 //finalVar =1000;//can not be intilize only once
	System.out.println("final varble is:::"+ finalVar);

	}
	public static void main(String[] args) 
	{
		 final FinalExample finalExample = new FinalExample();
		System.out.println("Hello World!"+ finalExample.toString());
	}
}

