/*
  Object Type return types or different types of return types for the
  insatnce methods and static methods as well

  return type should used for instance methods and  static ethods not for constructor
  purpose of returning values means , sending from one place(method) to other place(method)
  words to remember here calling and called....

*/
class  ObjectTypeReturnExample
{

	public Employee displayEmploeeDetails(){

     Employee obj = new Employee(5000, "Ramesh");//constrcuotr calling
	   return obj;
	}
	public static void main(String[] args) 
	{

		ObjectTypeReturnExample obj= new ObjectTypeReturnExample();
		ObjectTypeReturnExample obj12= new ObjectTypeReturnExample();
		Employee empDetails = obj.displayEmploeeDetails();
		//db.save(empDetails);
		System.out.println(empDetails.getEmpName()+"Hello World!" + empDetails.getEmpId());


		//print Object class methods
		//empDetails.wait();
			System.out.println(obj12.hashCode()+"======"+ empDetails.hashCode());
	}
}
