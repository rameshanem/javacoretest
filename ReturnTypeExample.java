/**
  about return type
  void
  int float,,....primitive data types
  Object type return type(Employee employee)
  List type (List<Employee> list  --> list)

  We can  not define return type for constructor
  we can use retur type only for the methods either static or instabce

  return type is nothing but returning result from where it is calling
  
*/
class ReturnTypeExample 
{
	 
	 public int retuningIntValue(){
       
	    int temp=500;
		int a=200;
	   return temp+a;
	 }
	public static void main(String[] args) 
	{
		ReturnTypeExample obj = new ReturnTypeExample();
							int res =obj.retuningIntValue();//caling from here
		System.out.println("Hello World!" + res);
	}
}
