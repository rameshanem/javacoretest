public class StudentInformation {
	
	private int sId;
	private String sNmae;
	private long sFees;
	public StudentInformation(int sId, String sNmae, long sFees) {
		super();
		this.sId = sId;
		this.sNmae = sNmae;
		this.sFees = sFees;
	}
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsNmae() {
		return sNmae;
	}
	public void setsNmae(String sNmae) {
		this.sNmae = sNmae;
	}
	public long getsFees() {
		return sFees;
	}
	public void setsFees(long sFees) {
		this.sFees = sFees;
	}
	

}
