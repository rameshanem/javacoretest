class BaseClass 
{
	String personName;
	int age;
	//String gender;
/*BaseClass(String personNameTest, int ageTest){
    this.personName= personNameTest;
	this.age= ageTest;
	//this.gender= genderTest;

}*/

public void displayPersonDetails(String personNameTest, int ageTest){
  
   System.out.println("Person details::with Name::"+ personNameTest);
   System.out.println("Person details::with age::"+ ageTest);
   //System.out.println("Person details::with gender::"+ gender);
}


/*public static void main(String[] args) 
	{
		
		BaseClass obj1= new BaseClass("Ramesh", 25, "Male");
		obj1.displayPersonDetails();


	}*/

}
