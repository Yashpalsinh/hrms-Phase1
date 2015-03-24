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
 * This class is used by SOAP remote services, specifically {@link com.hrms.service.http.LeavesAppliedServiceSoap}.
 *
 * @author yashpalsinh
 * @see com.hrms.service.http.LeavesAppliedServiceSoap
 * @generated
 */
public class LeavesAppliedSoap implements Serializable {
	public static LeavesAppliedSoap toSoapModel(LeavesApplied model) {
		LeavesAppliedSoap soapModel = new LeavesAppliedSoap();

		soapModel.setAppliedLeaveId(model.getAppliedLeaveId());
		soapModel.setUserId(model.getUserId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setEmployeeName(model.getEmployeeName());
		soapModel.setLeaveName(model.getLeaveName());
		soapModel.setEntitlement(model.getEntitlement());
		soapModel.setLeaveDuration(model.getLeaveDuration());
		soapModel.setLeaveFrom(model.getLeaveFrom());
		soapModel.setLeaveTo(model.getLeaveTo());
		soapModel.setLeaveDate(model.getLeaveDate());
		soapModel.setLeavePeriod(model.getLeavePeriod());
		soapModel.setApprovalStatus(model.getApprovalStatus());
		soapModel.setLeaveId(model.getLeaveId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setCreateBy(model.getCreateBy());
		soapModel.setModifiedBy(model.getModifiedBy());

		return soapModel;
	}

	public static LeavesAppliedSoap[] toSoapModels(LeavesApplied[] models) {
		LeavesAppliedSoap[] soapModels = new LeavesAppliedSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static LeavesAppliedSoap[][] toSoapModels(LeavesApplied[][] models) {
		LeavesAppliedSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new LeavesAppliedSoap[models.length][models[0].length];
		}
		else {
			soapModels = new LeavesAppliedSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static LeavesAppliedSoap[] toSoapModels(List<LeavesApplied> models) {
		List<LeavesAppliedSoap> soapModels = new ArrayList<LeavesAppliedSoap>(models.size());

		for (LeavesApplied model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new LeavesAppliedSoap[soapModels.size()]);
	}

	public LeavesAppliedSoap() {
	}

	public long getPrimaryKey() {
		return _appliedLeaveId;
	}

	public void setPrimaryKey(long pk) {
		setAppliedLeaveId(pk);
	}

	public long getAppliedLeaveId() {
		return _appliedLeaveId;
	}

	public void setAppliedLeaveId(long appliedLeaveId) {
		_appliedLeaveId = appliedLeaveId;
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

	public String getEmployeeName() {
		return _employeeName;
	}

	public void setEmployeeName(String employeeName) {
		_employeeName = employeeName;
	}

	public String getLeaveName() {
		return _leaveName;
	}

	public void setLeaveName(String leaveName) {
		_leaveName = leaveName;
	}

	public String getEntitlement() {
		return _entitlement;
	}

	public void setEntitlement(String entitlement) {
		_entitlement = entitlement;
	}

	public String getLeaveDuration() {
		return _leaveDuration;
	}

	public void setLeaveDuration(String leaveDuration) {
		_leaveDuration = leaveDuration;
	}

	public Date getLeaveFrom() {
		return _leaveFrom;
	}

	public void setLeaveFrom(Date leaveFrom) {
		_leaveFrom = leaveFrom;
	}

	public Date getLeaveTo() {
		return _leaveTo;
	}

	public void setLeaveTo(Date leaveTo) {
		_leaveTo = leaveTo;
	}

	public Date getLeaveDate() {
		return _leaveDate;
	}

	public void setLeaveDate(Date leaveDate) {
		_leaveDate = leaveDate;
	}

	public String getLeavePeriod() {
		return _leavePeriod;
	}

	public void setLeavePeriod(String leavePeriod) {
		_leavePeriod = leavePeriod;
	}

	public String getApprovalStatus() {
		return _approvalStatus;
	}

	public void setApprovalStatus(String approvalStatus) {
		_approvalStatus = approvalStatus;
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

	private long _appliedLeaveId;
	private long _userId;
	private long _groupId;
	private long _companyId;
	private String _employeeName;
	private String _leaveName;
	private String _entitlement;
	private String _leaveDuration;
	private Date _leaveFrom;
	private Date _leaveTo;
	private Date _leaveDate;
	private String _leavePeriod;
	private String _approvalStatus;
	private long _leaveId;
	private Date _createDate;
	private Date _modifiedDate;
	private long _createBy;
	private long _modifiedBy;
}