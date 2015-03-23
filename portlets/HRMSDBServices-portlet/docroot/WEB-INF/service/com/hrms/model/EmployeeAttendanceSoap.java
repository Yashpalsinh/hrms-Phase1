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
 * This class is used by SOAP remote services, specifically {@link com.hrms.service.http.EmployeeAttendanceServiceSoap}.
 *
 * @author yashpalsinh
 * @see com.hrms.service.http.EmployeeAttendanceServiceSoap
 * @generated
 */
public class EmployeeAttendanceSoap implements Serializable {
	public static EmployeeAttendanceSoap toSoapModel(EmployeeAttendance model) {
		EmployeeAttendanceSoap soapModel = new EmployeeAttendanceSoap();

		soapModel.setAttendanceId(model.getAttendanceId());
		soapModel.setUserId(model.getUserId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setAttendanceDate(model.getAttendanceDate());
		soapModel.setSigninTime(model.getSigninTime());
		soapModel.setSignoutTime(model.getSignoutTime());
		soapModel.setTotalTime(model.getTotalTime());
		soapModel.setApproved(model.getApproved());
		soapModel.setApprovedBy(model.getApprovedBy());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setCreateBy(model.getCreateBy());
		soapModel.setModifiedBy(model.getModifiedBy());

		return soapModel;
	}

	public static EmployeeAttendanceSoap[] toSoapModels(
		EmployeeAttendance[] models) {
		EmployeeAttendanceSoap[] soapModels = new EmployeeAttendanceSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static EmployeeAttendanceSoap[][] toSoapModels(
		EmployeeAttendance[][] models) {
		EmployeeAttendanceSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new EmployeeAttendanceSoap[models.length][models[0].length];
		}
		else {
			soapModels = new EmployeeAttendanceSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static EmployeeAttendanceSoap[] toSoapModels(
		List<EmployeeAttendance> models) {
		List<EmployeeAttendanceSoap> soapModels = new ArrayList<EmployeeAttendanceSoap>(models.size());

		for (EmployeeAttendance model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new EmployeeAttendanceSoap[soapModels.size()]);
	}

	public EmployeeAttendanceSoap() {
	}

	public long getPrimaryKey() {
		return _attendanceId;
	}

	public void setPrimaryKey(long pk) {
		setAttendanceId(pk);
	}

	public long getAttendanceId() {
		return _attendanceId;
	}

	public void setAttendanceId(long attendanceId) {
		_attendanceId = attendanceId;
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

	public Date getAttendanceDate() {
		return _attendanceDate;
	}

	public void setAttendanceDate(Date attendanceDate) {
		_attendanceDate = attendanceDate;
	}

	public Date getSigninTime() {
		return _signinTime;
	}

	public void setSigninTime(Date signinTime) {
		_signinTime = signinTime;
	}

	public Date getSignoutTime() {
		return _signoutTime;
	}

	public void setSignoutTime(Date signoutTime) {
		_signoutTime = signoutTime;
	}

	public Date getTotalTime() {
		return _totalTime;
	}

	public void setTotalTime(Date totalTime) {
		_totalTime = totalTime;
	}

	public boolean getApproved() {
		return _approved;
	}

	public boolean isApproved() {
		return _approved;
	}

	public void setApproved(boolean approved) {
		_approved = approved;
	}

	public long getApprovedBy() {
		return _approvedBy;
	}

	public void setApprovedBy(long approvedBy) {
		_approvedBy = approvedBy;
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

	private long _attendanceId;
	private long _userId;
	private long _groupId;
	private long _companyId;
	private Date _attendanceDate;
	private Date _signinTime;
	private Date _signoutTime;
	private Date _totalTime;
	private boolean _approved;
	private long _approvedBy;
	private Date _createDate;
	private Date _modifiedDate;
	private long _createBy;
	private long _modifiedBy;
}