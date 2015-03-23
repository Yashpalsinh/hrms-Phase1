package com.hrms;

public class EmployeeRegistrationModel {
	private long userId;
	private String firstName;
	private String middleName;
	private String lastName;
	private String screenName;
	private String employeeId;
	private String emailAddress;
	private String employeeType;
	private long employeeDesignationId;
	private long recruitedById;
	private String password1;
	private String password2;
	private String dateOfBirth;
	private boolean gender;
	private String joiningDate;
	private long employeeDepartmentId;
	private long employeeSubDepartmentId;
	private int birthdayMonth;
	private int birthdayDay;
	private int birthdayYear;
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getScreenName() {
		return screenName;
	}
	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getEmployeeType() {
		return employeeType;
	}
	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}
	public long getEmployeeDesignationId() {
		return employeeDesignationId;
	}
	public void setEmployeeDesignationId(long employeeDesignationId) {
		this.employeeDesignationId = employeeDesignationId;
	}
	public long getRecruitedById() {
		return recruitedById;
	}
	public void setRecruitedById(long recruitedById) {
		this.recruitedById = recruitedById;
	}
	
	public String getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(String joiningDate) {
		this.joiningDate = joiningDate;
	}
	public long getEmployeeDepartmentId() {
		return employeeDepartmentId;
	}
	public void setEmployeeDepartmentId(long employeeDepartmentId) {
		this.employeeDepartmentId = employeeDepartmentId;
	}
	public long getEmployeeSubDepartmentId() {
		return employeeSubDepartmentId;
	}
	public void setEmployeeSubDepartmentId(long employeeSubDepartmentId) {
		this.employeeSubDepartmentId = employeeSubDepartmentId;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public String getPassword1() {
		return password1;
	}
	public void setPassword1(String password1) {
		this.password1 = password1;
	}
	public String getPassword2() {
		return password2;
	}
	public void setPassword2(String password2) {
		this.password2 = password2;
	}
	public int getBirthdayMonth() {
		return birthdayMonth;
	}
	public void setBirthdayMonth(int birthdayMonth) {
		this.birthdayMonth = birthdayMonth;
	}
	public int getBirthdayDay() {
		return birthdayDay;
	}
	public void setBirthdayDay(int birthdayDay) {
		this.birthdayDay = birthdayDay;
	}
	public int getBirthdayYear() {
		return birthdayYear;
	}
	public void setBirthdayYear(int birthdayYear) {
		this.birthdayYear = birthdayYear;
	}
	
}
