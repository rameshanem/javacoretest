interface MultilpleInheritance1 
{
	
}
interface MultilpleInheritance2 extends MultilpleInheritance1
{

}

interface MultilpleInheritance3 extends MultilpleInheritance2,MultilpleInheritance1
{

	public static void main(String[] args) 
	{
		System.out.println("======main method");
		
	}
}
