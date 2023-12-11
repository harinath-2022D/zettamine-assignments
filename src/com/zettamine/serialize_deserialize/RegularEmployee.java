package com.zettamine.serialize_deserialize;

import java.io.Serializable;
import java.util.Objects;

public class RegularEmployee extends Employee{
	
	private String pfNumber;

	public RegularEmployee(int empId, String empName, int dNo, String pfNumber) {
		super(empId, empName, dNo);
		this.pfNumber = pfNumber;
		
	}

	

	@Override
	public String toString() {
		return "RegularEmployee [pfNumber=" + pfNumber + ", " + super.toString() + "]";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(pfNumber);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if (getClass() != obj.getClass())
			return false;
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		
		RegularEmployee other = (RegularEmployee) obj;
		return Objects.equals(pfNumber, other.pfNumber);
	}

	public String getPfNumber() {
		return pfNumber;
	}

	public void setPfNumber(String pfNumber) {
		this.pfNumber = pfNumber;
	}
	
	

}
