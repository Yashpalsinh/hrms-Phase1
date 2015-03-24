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
 * This class is used by SOAP remote services, specifically {@link com.hrms.service.http.EmployeeLeaveServiceSoap}.
 *
 * @author yashpalsinh
 * @see com.hrms.service.http.EmployeeLeaveServiceSoap
 * @generated
 */
public class EmployeeLeaveSoap implements Serializable {
	public static EmployeeLeaveSoap toSoapModel(EmployeeLeave model) {
		EmployeeLeaveSoap soapModel = new EmployeeLeaveSoap();

		soapModel.setEmployeeLeaveId(model.getEmployeeLeaveId());
		soapModel.setUserId(model.getUserId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setYear(model.getYear());
		soapModel.setLeavesCarriedOver(model.getLeavesCarriedOver());
		soapModel.setLeavesTakenThisYear(model.getLeavesTakenThisYear());
		soapModel.setRemainingLeaves(model.getRemainingLeaves());
		soapModel.setLeaveId(model.getLeaveId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setCreateBy(model.getCreateBy());
		soapModel.setModifiedBy(model.getModifiedBy());

		return soapModel;
	}

	public static EmployeeLeaveSoap[] toSoapModels(EmployeeLeave[] models) {
		EmployeeLeaveSoap[] soapModels = new EmployeeLeaveSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static EmployeeLeaveSoap[][] toSoapModels(EmployeeLeave[][] models) {
		EmployeeLeaveSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new EmployeeLeaveSoap[models.length][models[0].length];
		}
		else {
			soapModels = new EmployeeLeaveSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static EmployeeLeaveSoap[] toSoapModels(List<EmployeeLeave> models) {
		List<EmployeeLeaveSoap> soapModels = new ArrayList<EmployeeLeaveSoap>(models.size());

		for (EmployeeLeave model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new EmployeeLeaveSoap[soapModels.size()]);
	}

	public EmployeeLeaveSoap() {
	}

	public long getPrimaryKey() {
		return _employeeLeaveId;
	}

	public void setPrimaryKey(long pk) {
		setEmployeeLeaveId(pk);
	}

	public long getEmployeeLeaveId() {
		return _employeeLeaveId;
	}

	public void setEmployeeLeaveId(long employeeLeaveId) {
		_employeeLeaveId = employeeLeaveId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public int getYear() {
		return _year;
	}

	public void setYear(int year) {
		_year = year;
	}

	public int getLeavesCarriedOver() {
		return _leavesCarriedOver;
	}

	public void setLeavesCarriedOver(int leavesCarriedOver) {
		_leavesCarriedOver = leavesCarriedOver;
	}

	public int getLeavesTakenThisYear() {
		return _leavesTakenThisYear;
	}

	public void setLeavesTakenThisYear(int leavesTakenThisYear) {
		_leavesTakenThisYear = leavesTakenThisYear;
	}

	public int getRemainingLeaves() {
		return _remainingLeaves;
	}

	public void setRemainingLeaves(int remainingLeaves) {
		_remainingLeaves = remainingLeaves;
	}

	public long getLeaveId() {
		return _leaveId;
	}

	public void setLeaveId(long leaveId) {
		_leaveId = leaveId;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
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

	private long _employeeLeaveId;
	private long _userId;
	private long _groupId;
	private long _companyId;
	private int _year;
	private int _leavesCarriedOver;
	private int _leavesTakenThisYear;
	private int _remainingLeaves;
	private long _leaveId;
	private Date _createDate;
	private Date _modifiedDate;
	private long _createBy;
	private long _modifiedBy;
}