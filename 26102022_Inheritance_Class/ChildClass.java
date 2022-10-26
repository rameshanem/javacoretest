/**

 Inheritance with single 
*/
class  ChildClass extends BaseClass
{

	int adharID;
	String address;
	String state;
/*ChildClass(String address, int adharID,String state){
    this.address= address;
	this.adharID= adharID;
	this.state= state;

}*/

public void displayAdharDetails(String address, int adharID,String state ){

 
   System.out.println("Adhar details::with adharID::"+ adharID);
   System.out.println("Adhar details::with address::"+ address);
   System.out.println("Adhar details::with state::"+ state);
}
	
}
