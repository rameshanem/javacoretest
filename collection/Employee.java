package com.collection;

import java.util.Objects;

public class Employee {
	private int empid;
	private String empnae;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpnae() {
		return empnae;
	}
	public void setEmpnae(String empnae) {
		this.empnae = empnae;
	}
	@Override
	public int hashCode() {
		return Objects.hash(empid, empnae);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return empid == other.empid && Objects.equals(empnae, other.empnae);
	}

}
