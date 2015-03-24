package com.hrms;

public class EmployeeDesignationModel {
		
	private long employeeDesignationId;
	private String designationName;
	private String status;
	public long getEmployeeDesignationId() {
		return employeeDesignationId;
	}
	public void setEmployeeDesignationId(long employeeDesignationId) { 
		this.employeeDesignationId = employeeDesignationId;
	}
	public String getDesignationName() {
		return designationName;
	}
	public void setDesignationName(String designationName) {
		this.designationName = designationName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	

	
}
