/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * The contents of this file are subject to the terms of the Liferay Enterprise
 * Subscription License ("License"). You may not use this file except in
 * compliance with the License. You can obtain a copy of the License by
 * contacting Liferay, Inc. See the License for the specific language governing
 * permissions and limitations under the License, including but not limited to
 * distribution rights of the Software.
 *
 *
 *
 */

package com.hrms.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.hrms.service.http.EmployeeMasterServiceSoap}.
 *
 * @author yashpalsinh
 * @see com.hrms.service.http.EmployeeMasterServiceSoap
 * @generated
 */
public class EmployeeMasterSoap implements Serializable {
	public static EmployeeMasterSoap toSoapModel(EmployeeMaster model) {
		EmployeeMasterSoap soapModel = new EmployeeMasterSoap();

		soapModel.setEmployeeMasterId(model.getEmployeeMasterId());
		soapModel.setEmployeeId(model.getEmployeeId());
		soapModel.setUserId(model.getUserId());
		soapModel.setGender(model.getGender());
		soapModel.setDateOfBirth(model.getDateOfBirth());
		soapModel.setJoiningDate(model.getJoiningDate());
		soapModel.setLeavingDate(model.getLeavingDate());
		soapModel.setMaritalStatus(model.getMaritalStatus());
		soapModel.setNationality(model.getNationality());
		soapModel.setEmployeeDesignationId(model.getEmployeeDesignationId());
		soapModel.setEmployeeDepartmentId(model.getEmployeeDepartmentId());
		soapModel.setEmployeeSubDepartmentId(model.getEmployeeSubDepartmentId());
		soapModel.setEmployeeTypeId(model.getEmployeeTypeId());
		soapModel.setRecruitedOnBasisOf(model.getRecruitedOnBasisOf());
		soapModel.setRecruitedBy(model.getRecruitedBy());
		soapModel.setCreateBy(model.getCreateBy());
		soapModel.setModifiedBy(model.getModifiedBy());

		return soapModel;
	}

	public static EmployeeMasterSoap[] toSoapModels(EmployeeMaster[] models) {
		EmployeeMasterSoap[] soapModels = new EmployeeMasterSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static EmployeeMasterSoap[][] toSoapModels(EmployeeMaster[][] models) {
		EmployeeMasterSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new EmployeeMasterSoap[models.length][models[0].length];
		}
		else {
			soapModels = new EmployeeMasterSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static EmployeeMasterSoap[] toSoapModels(List<EmployeeMaster> models) {
		List<EmployeeMasterSoap> soapModels = new ArrayList<EmployeeMasterSoap>(models.size());

		for (EmployeeMaster model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new EmployeeMasterSoap[soapModels.size()]);
	}

	public EmployeeMasterSoap() {
	}

	public long getPrimaryKey() {
		return _employeeMasterId;
	}

	public void setPrimaryKey(long pk) {
		setEmployeeMasterId(pk);
	}

	public long getEmployeeMasterId() {
		return _employeeMasterId;
	}

	public void setEmployeeMasterId(long employeeMasterId) {
		_employeeMasterId = employeeMasterId;
	}

	public String getEmployeeId() {
		return _employeeId;
	}

	public void setEmployeeId(String employeeId) {
		_employeeId = employeeId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public int getGender() {
		return _gender;
	}

	public void setGender(int gender) {
		_gender = gender;
	}

	public Date getDateOfBirth() {
		return _dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		_dateOfBirth = dateOfBirth;
	}

	public Date getJoiningDate() {
		return _joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		_joiningDate = joiningDate;
	}

	public Date getLeavingDate() {
		return _leavingDate;
	}

	public void setLeavingDate(Date leavingDate) {
		_leavingDate = leavingDate;
	}

	public int getMaritalStatus() {
		return _maritalStatus;
	}

	public void setMaritalStatus(int maritalStatus) {
		_maritalStatus = maritalStatus;
	}

	public String getNationality() {
		return _nationality;
	}

	public void setNationality(String nationality) {
		_nationality = nationality;
	}

	public int getEmployeeDesignationId() {
		return _employeeDesignationId;
	}

	public void setEmployeeDesignationId(int employeeDesignationId) {
		_employeeDesignationId = employeeDesignationId;
	}

	public int getEmployeeDepartmentId() {
		return _employeeDepartmentId;
	}

	public void setEmployeeDepartmentId(int employeeDepartmentId) {
		_employeeDepartmentId = employeeDepartmentId;
	}

	public int getEmployeeSubDepartmentId() {
		return _employeeSubDepartmentId;
	}

	public void setEmployeeSubDepartmentId(int employeeSubDepartmentId) {
		_employeeSubDepartmentId = employeeSubDepartmentId;
	}

	public int getEmployeeTypeId() {
		return _employeeTypeId;
	}

	public void setEmployeeTypeId(int employeeTypeId) {
		_employeeTypeId = employeeTypeId;
	}

	public String getRecruitedOnBasisOf() {
		return _recruitedOnBasisOf;
	}

	public void setRecruitedOnBasisOf(String recruitedOnBasisOf) {
		_recruitedOnBasisOf = recruitedOnBasisOf;
	}

	public long getRecruitedBy() {
		return _recruitedBy;
	}

	public void setRecruitedBy(long recruitedBy) {
		_recruitedBy = recruitedBy;
	}

	public int getCreateBy() {
		return _createBy;
	}

	public void setCreateBy(int createBy) {
		_createBy = createBy;
	}

	public int getModifiedBy() {
		return _modifiedBy;
	}

	public void setModifiedBy(int modifiedBy) {
		_modifiedBy = modifiedBy;
	}

	private long _employeeMasterId;
	private String _employeeId;
	private long _userId;
	private int _gender;
	private Date _dateOfBirth;
	private Date _joiningDate;
	private Date _leavingDate;
	private int _maritalStatus;
	private String _nationality;
	private int _employeeDesignationId;
	private int _employeeDepartmentId;
	private int _employeeSubDepartmentId;
	private int _employeeTypeId;
	private String _recruitedOnBasisOf;
	private long _recruitedBy;
	private int _createBy;
	private int _modifiedBy;
}