/**Encapsulation example
  It is amechnaisam where data embers and method data together into one single unit we can call it as Encasulation
  Ex:: Any model or entity cass
*/
class EncapsulationExample 
{
	//datamembers
	private int dat1;
	private int data2=100;

//methods datat
	public void performMethod(){
     System.out.println("Insatnc method is");
	}

	//methods datata
	public void performMethod1(){
        dat1 =200;
		int result = data2 + dat1;
System.out.println("Insatnce result is"+ result);
	}
	public static void main(String[] args) 
	{
		EncapsulationExample obj = new EncapsulationExample();
				obj.performMethod();
				obj.performMethod1();

		System.out.println("Hello World!");
	}
}
