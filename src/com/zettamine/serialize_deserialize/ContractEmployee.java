package com.zettamine.serialize_deserialize;

import java.util.Objects;

public class ContractEmployee extends Employee {
	
	private int contractorRegId;
	
	public ContractEmployee(int empId, String empName, int dNo, int contractorRegId) {
		super(empId, empName, dNo);
		this.contractorRegId = contractorRegId;
	}

	

	@Override
	public String toString() {
		return "ContractEmployee [contractorRegId=" + contractorRegId + ", " + super.toString() + "]";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(contractorRegId);
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
		ContractEmployee other = (ContractEmployee) obj;
		return contractorRegId == other.contractorRegId;
	}

	public int getContractorRegId() {
		return contractorRegId;
	}

	public void setContractorRegId(int contractorRegId) {
		this.contractorRegId = contractorRegId;
	}
	
	
	
	

}
