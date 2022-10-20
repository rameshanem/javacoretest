/**
   model class
*/
class Employee 
{   private long empId;
	private String empName;

    Employee(long empId, String empName){
		
        this.empId = empId;
		this.empName = empName;

	}

	public void setEmpId(long empId){
     
	 this.empId = empId;
	}

	public long getEmpId(){
     
	 return empId;
	}

	public void setEmpName(String empName){
     
	 this.empName = empName;
	}

	public String getEmpName(){
     
	 return empName;
	}
}
