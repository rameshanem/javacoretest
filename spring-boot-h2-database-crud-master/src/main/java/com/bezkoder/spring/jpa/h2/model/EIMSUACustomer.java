package com.bezkoder.spring.jpa.h2.model;

public class EIMSUACustomer {
	private int cid;
	private String name;
	private String address;
	private Long phoneno;
	private String email;
	private boolean flag;
	private String createddate;
	public int getCid() {
		return cid;
	}
	public EIMSUACustomer(int cid, String name, String address, Long phoneno, String email, boolean flag,
			String createddate) {
		super();
		this.cid = cid;
		this.name = name;
		this.address = address;
		this.phoneno = phoneno;
		this.email = email;
		this.flag = flag;
		this.createddate = createddate;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Long getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(Long phoneno) {
		this.phoneno = phoneno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	public String getCreateddate() {
		return createddate;
	}
	public void setCreateddate(String createddate) {
		this.createddate = createddate;
	}

}
