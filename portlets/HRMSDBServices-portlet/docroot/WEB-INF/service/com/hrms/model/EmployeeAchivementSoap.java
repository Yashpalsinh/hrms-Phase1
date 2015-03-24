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
 * This class is used by SOAP remote services, specifically {@link com.hrms.service.http.EmployeeAchivementServiceSoap}.
 *
 * @author yashpalsinh
 * @see com.hrms.service.http.EmployeeAchivementServiceSoap
 * @generated
 */
public class EmployeeAchivementSoap implements Serializable {
	public static EmployeeAchivementSoap toSoapModel(EmployeeAchivement model) {
		EmployeeAchivementSoap soapModel = new EmployeeAchivementSoap();

		soapModel.setEmployeeAchivementId(model.getEmployeeAchivementId());
		soapModel.setAchivedBy(model.getAchivedBy());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setAchivementDate(model.getAchivementDate());
		soapModel.setAchivementTitle(model.getAchivementTitle());
		soapModel.setAchivementDiscription(model.getAchivementDiscription());
		soapModel.setStatus(model.getStatus());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setCreateBy(model.getCreateBy());
		soapModel.setModifiedBy(model.getModifiedBy());

		return soapModel;
	}

	public static EmployeeAchivementSoap[] toSoapModels(
		EmployeeAchivement[] models) {
		EmployeeAchivementSoap[] soapModels = new EmployeeAchivementSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static EmployeeAchivementSoap[][] toSoapModels(
		EmployeeAchivement[][] models) {
		EmployeeAchivementSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new EmployeeAchivementSoap[models.length][models[0].length];
		}
		else {
			soapModels = new EmployeeAchivementSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static EmployeeAchivementSoap[] toSoapModels(
		List<EmployeeAchivement> models) {
		List<EmployeeAchivementSoap> soapModels = new ArrayList<EmployeeAchivementSoap>(models.size());

		for (EmployeeAchivement model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new EmployeeAchivementSoap[soapModels.size()]);
	}

	public EmployeeAchivementSoap() {
	}

	public long getPrimaryKey() {
		return _employeeAchivementId;
	}

	public void setPrimaryKey(long pk) {
		setEmployeeAchivementId(pk);
	}

	public long getEmployeeAchivementId() {
		return _employeeAchivementId;
	}

	public void setEmployeeAchivementId(long employeeAchivementId) {
		_employeeAchivementId = employeeAchivementId;
	}

	public long getAchivedBy() {
		return _achivedBy;
	}

	public void setAchivedBy(long achivedBy) {
		_achivedBy = achivedBy;
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

	public Date getAchivementDate() {
		return _achivementDate;
	}

	public void setAchivementDate(Date achivementDate) {
		_achivementDate = achivementDate;
	}

	public String getAchivementTitle() {
		return _achivementTitle;
	}

	public void setAchivementTitle(String achivementTitle) {
		_achivementTitle = achivementTitle;
	}

	public String getAchivementDiscription() {
		return _achivementDiscription;
	}

	public void setAchivementDiscription(String achivementDiscription) {
		_achivementDiscription = achivementDiscription;
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

	private long _employeeAchivementId;
	private long _achivedBy;
	private long _groupId;
	private long _companyId;
	private Date _achivementDate;
	private String _achivementTitle;
	private String _achivementDiscription;
	private boolean _status;
	private Date _createDate;
	private Date _modifiedDate;
	private long _createBy;
	private long _modifiedBy;
}