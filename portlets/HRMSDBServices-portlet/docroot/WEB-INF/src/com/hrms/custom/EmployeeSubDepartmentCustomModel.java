package com.hrms.custom;





public class EmployeeSubDepartmentCustomModel{
	private long employeeSubDepartmentId;
	private long employeeDepartmentId;
	private long srno;
	private String subDepartmentName;
	private String departmentName;
	private boolean status;
	
	
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
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	

}
