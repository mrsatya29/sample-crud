package com.example.samplecrud.model;


public class Employee {

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	private int empId;
	private String empName;
	private String empOrg;
	private String dateOfJoining;
	public Employee(int empId, String empName, String empOrg, String dateOfJoining) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empOrg = empOrg;
		this.dateOfJoining = dateOfJoining;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateOfJoining == null) ? 0 : dateOfJoining.hashCode());
		result = prime * result + empId;
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		result = prime * result + ((empOrg == null) ? 0 : empOrg.hashCode());
		return result;
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
		if (dateOfJoining == null) {
			if (other.dateOfJoining != null)
				return false;
		} else if (!dateOfJoining.equals(other.dateOfJoining))
			return false;
		if (empId != other.empId)
			return false;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		if (empOrg == null) {
			if (other.empOrg != null)
				return false;
		} else if (!empOrg.equals(other.empOrg))
			return false;
		return true;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpOrg() {
		return empOrg;
	}

	public void setEmpOrg(String empOrg) {
		this.empOrg = empOrg;
	}

	public String getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empOrg=" + empOrg + ", dateOfJoining="
				+ dateOfJoining + "]";
	}

}
