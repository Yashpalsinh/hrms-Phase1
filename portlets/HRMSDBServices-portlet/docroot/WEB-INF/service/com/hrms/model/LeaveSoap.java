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
 * This class is used by SOAP remote services, specifically {@link com.hrms.service.http.LeaveServiceSoap}.
 *
 * @author yashpalsinh
 * @see com.hrms.service.http.LeaveServiceSoap
 * @generated
 */
public class LeaveSoap implements Serializable {
	public static LeaveSoap toSoapModel(Leave model) {
		LeaveSoap soapModel = new LeaveSoap();

		soapModel.setLeaveId(model.getLeaveId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setLeaveName(model.getLeaveName());
		soapModel.setLeaveType(model.getLeaveType());
		soapModel.setLeavesAllowedPerYear(model.getLeavesAllowedPerYear());
		soapModel.setCarryOver(model.getCarryOver());
		soapModel.setCarryOverLimit(model.getCarryOverLimit());
		soapModel.setEncachement(model.getEncachement());
		soapModel.setStatus(model.getStatus());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setCreateBy(model.getCreateBy());
		soapModel.setModifiedBy(model.getModifiedBy());

		return soapModel;
	}

	public static LeaveSoap[] toSoapModels(Leave[] models) {
		LeaveSoap[] soapModels = new LeaveSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static LeaveSoap[][] toSoapModels(Leave[][] models) {
		LeaveSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new LeaveSoap[models.length][models[0].length];
		}
		else {
			soapModels = new LeaveSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static LeaveSoap[] toSoapModels(List<Leave> models) {
		List<LeaveSoap> soapModels = new ArrayList<LeaveSoap>(models.size());

		for (Leave model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new LeaveSoap[soapModels.size()]);
	}

	public LeaveSoap() {
	}

	public long getPrimaryKey() {
		return _leaveId;
	}

	public void setPrimaryKey(long pk) {
		setLeaveId(pk);
	}

	public long getLeaveId() {
		return _leaveId;
	}

	public void setLeaveId(long leaveId) {
		_leaveId = leaveId;
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

	public String getLeaveName() {
		return _leaveName;
	}

	public void setLeaveName(String leaveName) {
		_leaveName = leaveName;
	}

	public String getLeaveType() {
		return _leaveType;
	}

	public void setLeaveType(String leaveType) {
		_leaveType = leaveType;
	}

	public int getLeavesAllowedPerYear() {
		return _leavesAllowedPerYear;
	}

	public void setLeavesAllowedPerYear(int leavesAllowedPerYear) {
		_leavesAllowedPerYear = leavesAllowedPerYear;
	}

	public boolean getCarryOver() {
		return _carryOver;
	}

	public boolean isCarryOver() {
		return _carryOver;
	}

	public void setCarryOver(boolean carryOver) {
		_carryOver = carryOver;
	}

	public int getCarryOverLimit() {
		return _carryOverLimit;
	}

	public void setCarryOverLimit(int carryOverLimit) {
		_carryOverLimit = carryOverLimit;
	}

	public boolean getEncachement() {
		return _encachement;
	}

	public boolean isEncachement() {
		return _encachement;
	}

	public void setEncachement(boolean encachement) {
		_encachement = encachement;
	}

	public boolean getStatus() {
		return _status;
	}

	public boolean isStatus() {
		return _status;
	}

	public void setStatus(boolean status) {
		_status = status;
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

	private long _leaveId;
	private long _groupId;
	private long _companyId;
	private String _leaveName;
	private String _leaveType;
	private int _leavesAllowedPerYear;
	private boolean _carryOver;
	private int _carryOverLimit;
	private boolean _encachement;
	private boolean _status;
	private Date _createDate;
	private Date _modifiedDate;
	private long _createBy;
	private long _modifiedBy;
}