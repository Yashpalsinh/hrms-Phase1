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
 * This class is used by SOAP remote services, specifically {@link com.hrms.service.http.EmployeeMstServiceSoap}.
 *
 * @author yashpalsinh
 * @see com.hrms.service.http.EmployeeMstServiceSoap
 * @generated
 */
public class EmployeeMstSoap implements Serializable {
	public static EmployeeMstSoap toSoapModel(EmployeeMst model) {
		EmployeeMstSoap soapModel = new EmployeeMstSoap();

		soapModel.setEmployeeMstId(model.getEmployeeMstId());
		soapModel.setEmployeeId(model.getEmployeeId());
		soapModel.setUserId(model.getUserId());
		soapModel.setGender(model.getGender());
		soapModel.setDateOfBirth(model.getDateOfBirth());
		soapModel.setJoiningDate(model.getJoiningDate());
		soapModel.setLeavingDate(model.getLeavingDate());
		soapModel.setMaritualStatus(model.getMaritualStatus());
		soapModel.setNationality(model.getNationality());
		soapModel.setEmployeeDesignationId(model.getEmployeeDesignationId());
		soapModel.setEmployeeDepartmentId(model.getEmployeeDepartmentId());
		soapModel.setEmployeeSubDepartmentId(model.getEmployeeSubDepartmentId());
		soapModel.setEmployeeType(model.getEmployeeType());
		soapModel.setCreateBy(model.getCreateBy());
		soapModel.setModifiedBy(model.getModifiedBy());

		return soapModel;
	}

	public static EmployeeMstSoap[] toSoapModels(EmployeeMst[] models) {
		EmployeeMstSoap[] soapModels = new EmployeeMstSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static EmployeeMstSoap[][] toSoapModels(EmployeeMst[][] models) {
		EmployeeMstSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new EmployeeMstSoap[models.length][models[0].length];
		}
		else {
			soapModels = new EmployeeMstSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static EmployeeMstSoap[] toSoapModels(List<EmployeeMst> models) {
		List<EmployeeMstSoap> soapModels = new ArrayList<EmployeeMstSoap>(models.size());

		for (EmployeeMst model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new EmployeeMstSoap[soapModels.size()]);
	}

	public EmployeeMstSoap() {
	}

	public long getPrimaryKey() {
		return _employeeMstId;
	}

	public void setPrimaryKey(long pk) {
		setEmployeeMstId(pk);
	}

	public long getEmployeeMstId() {
		return _employeeMstId;
	}

	public void setEmployeeMstId(long employeeMstId) {
		_employeeMstId = employeeMstId;
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

	public boolean getGender() {
		return _gender;
	}

	public boolean isGender() {
		return _gender;
	}

	public void setGender(boolean gender) {
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

	public int getMaritualStatus() {
		return _maritualStatus;
	}

	public void setMaritualStatus(int maritualStatus) {
		_maritualStatus = maritualStatus;
	}

	public String getNationality() {
		return _nationality;
	}

	public void setNationality(String nationality) {
		_nationality = nationality;
	}

	public long getEmployeeDesignationId() {
		return _employeeDesignationId;
	}

	public void setEmployeeDesignationId(long employeeDesignationId) {
		_employeeDesignationId = employeeDesignationId;
	}

	public long getEmployeeDepartmentId() {
		return _employeeDepartmentId;
	}

	public void setEmployeeDepartmentId(long employeeDepartmentId) {
		_employeeDepartmentId = employeeDepartmentId;
	}

	public long getEmployeeSubDepartmentId() {
		return _employeeSubDepartmentId;
	}

	public void setEmployeeSubDepartmentId(long employeeSubDepartmentId) {
		_employeeSubDepartmentId = employeeSubDepartmentId;
	}

	public String getEmployeeType() {
		return _employeeType;
	}

	public void setEmployeeType(String employeeType) {
		_employeeType = employeeType;
	}

	public long getCreateBy() {
		return _createBy;
	}

	public void setCreateBy(long createBy) {
		_createBy = createBy;
	}

	public long getModifiedBy() {
		return _modifiedBy;
	}

	public void setModifiedBy(long modifiedBy) {
		_modifiedBy = modifiedBy;
	}

	private long _employeeMstId;
	private String _employeeId;
	private long _userId;
	private boolean _gender;
	private Date _dateOfBirth;
	private Date _joiningDate;
	private Date _leavingDate;
	private int _maritualStatus;
	private String _nationality;
	private long _employeeDesignationId;
	private long _employeeDepartmentId;
	private long _employeeSubDepartmentId;
	private String _employeeType;
	private long _createBy;
	private long _modifiedBy;
}