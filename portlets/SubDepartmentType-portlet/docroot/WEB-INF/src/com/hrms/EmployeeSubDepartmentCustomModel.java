package com.hrms;

public class EmployeeSubDepartmentCustomModel {
		
	private long employeeSubDepartmentId;
	private long employeeDepartmentId;
	private long srno;
	private String subDepartmentName;
	private String departmentName;
	private String status;
	private boolean stat;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public long getEmployeeSubDepartmentId() {
		return employeeSubDepartmentId;
	}
	public void setEmployeeSubDepartmentId(long employeeSubDepartmentId) {
		this.employeeSubDepartmentId = employeeSubDepartmentId;
	}
	public String getSubDepartmentName() {
		return subDepartmentName;
	}
	public void setSubDepartmentName(String subDepartmentName) {
		this.subDepartmentName = subDepartmentName;
	}
	public long getEmployeeDepartmentId() {
		return employeeDepartmentId;
	}
	public void setEmployeeDepartmentId(long employeeDepartmentId) {
		this.employeeDepartmentId = employeeDepartmentId;
	}
	public long getSrno() {
		return srno;
	}
	public void setSrno(long srno) {
		this.srno = srno;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public boolean isStat() {
		return stat;
	}
	public void setStat(boolean stat) {
		this.stat = stat;
	}
	
	

	
}
