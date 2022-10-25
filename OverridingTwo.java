class OverridingTwo extends OverridingOne
{

	public void clculate(int a, int b, int c){

      System.out.println("Inside OverridingTwo one clculate method"+ (a-b));
	}

	public void clculate(int a, int b, int c, int d){

      System.out.println("Inside OverridingTwo one clculate method"+ (a-b));
	}
	public static void main(String[] args) 
	{
		//OverridingTwo obj = new OverridingTwo();//prints OverridingTwo class method
		OverridingTwo obj = new OverridingTwo();//it prints the OverridingTwo class method//
		obj.clculate(100,200);
		obj.clculate(500,200,100);
		obj.toString();

		obj.clculate(500,200,100,1555);
		//obj.clculateTwo(20,10,20);


		System.out.println("Hello World!"+ obj.toString());
	}
}
