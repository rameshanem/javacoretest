
public class TestMain {
	
	private static StudentInformation studentInformation = null;
	List<StudentInformation> setValuesForStudentInformation(){
		
		List <StudentInformation> studentInformationn = new ArrayList<StudentInformation>();
		
		StudentInformation studentInformation = new StudentInformation(1, null, 0);
		
		studentInformation.setsId(1);
		studentInformation.setsNmae("Naresh");
		studentInformation.setsFees(500000);
		
		
		StudentInformation studentInformation2 = new StudentInformation(1, "HII", 10000);
		studentInformation2.setsId(2);
		studentInformation2.setsNmae("Ravi");
		studentInformation2.setsFees(50000);
		
		
		studentInformationn.add(studentInformation);
		studentInformationn.add(studentInformation2);
		return  studentInformationn;
		
	}
	
	
	
	
	
	 EmployeeDetails employeeDetails = null;
         public   EmployeeDetails setEmployeeDetails(){
		
		EmployeeDetails employeeDetails = new EmployeeDetails(1, "Naresh", 10000);
		
		
	
		return  employeeDetails;
	
	}
         
         
        
         
	
	public static void main(String[] args) {
		TestMain testmain = new TestMain();
		List <StudentInformation> mnr=testmain.setValuesForStudentInformation();
		System.out.println(mnr);
		for (StudentInformation m :mnr) {
			System.out.println("id is "+m.getsId()+"  "+"name is:::"+m.getsNmae()+"  "+"fees is ::"+ m.getsFees());
		}
		
		
		EmployeeDetails	m=testmain.setEmployeeDetails();
	System.out.println("empid is ::"+m.getEmpId()+"  "+" emp name is ::"+ m.getEmpName()+"  "+"emp salary is "+ m.getEmpSalary());
//		
//		for (EmployeeDetails m : n ) {
//			System.out.println("empid is ::"+m.getEmpId()+" emp name is ::"+ m.getEmpName()+"emp salary is "+ m.getEmpSalary());
//			
//		}
	
//		
	
	
	Abstraction  abstraction  = null;
	provideBodyForAbstractMethod mnr2 =new provideBodyForAbstractMethod();
	mnr2.run();
	
	}

}
