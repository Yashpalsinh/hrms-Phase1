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
 * This class is used by SOAP remote services, specifically {@link com.hrms.service.http.EmployeeLanguageDetailServiceSoap}.
 *
 * @author bhavik
 * @see com.hrms.service.http.EmployeeLanguageDetailServiceSoap
 * @generated
 */
public class EmployeeLanguageDetailSoap implements Serializable {
	public static EmployeeLanguageDetailSoap toSoapModel(
		EmployeeLanguageDetail model) {
		EmployeeLanguageDetailSoap soapModel = new EmployeeLanguageDetailSoap();

		soapModel.setEmployeeLanguageDetailId(model.getEmployeeLanguageDetailId());
		soapModel.setUserId(model.getUserId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setLanguageName(model.getLanguageName());
		soapModel.setRead(model.getRead());
		soapModel.setWrite(model.getWrite());
		soapModel.setSpeak(model.getSpeak());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setCreateBy(model.getCreateBy());
		soapModel.setModifiedBy(model.getModifiedBy());

		return soapModel;
	}

	public static EmployeeLanguageDetailSoap[] toSoapModels(
		EmployeeLanguageDetail[] models) {
		EmployeeLanguageDetailSoap[] soapModels = new EmployeeLanguageDetailSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static EmployeeLanguageDetailSoap[][] toSoapModels(
		EmployeeLanguageDetail[][] models) {
		EmployeeLanguageDetailSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new EmployeeLanguageDetailSoap[models.length][models[0].length];
		}
		else {
			soapModels = new EmployeeLanguageDetailSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static EmployeeLanguageDetailSoap[] toSoapModels(
		List<EmployeeLanguageDetail> models) {
		List<EmployeeLanguageDetailSoap> soapModels = new ArrayList<EmployeeLanguageDetailSoap>(models.size());

		for (EmployeeLanguageDetail model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new EmployeeLanguageDetailSoap[soapModels.size()]);
	}

	public EmployeeLanguageDetailSoap() {
	}

	public long getPrimaryKey() {
		return _employeeLanguageDetailId;
	}

	public void setPrimaryKey(long pk) {
		setEmployeeLanguageDetailId(pk);
	}

	public long getEmployeeLanguageDetailId() {
		return _employeeLanguageDetailId;
	}

	public void setEmployeeLanguageDetailId(long employeeLanguageDetailId) {
		_employeeLanguageDetailId = employeeLanguageDetailId;
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

	public String getLanguageName() {
		return _languageName;
	}

	public void setLanguageName(String languageName) {
		_languageName = languageName;
	}

	public boolean getRead() {
		return _read;
	}

	public boolean isRead() {
		return _read;
	}

	public void setRead(boolean read) {
		_read = read;
	}

	public boolean getWrite() {
		return _write;
	}

	public boolean isWrite() {
		return _write;
	}

	public void setWrite(boolean write) {
		_write = write;
	}

	public boolean getSpeak() {
		return _speak;
	}

	public boolean isSpeak() {
		return _speak;
	}

	public void setSpeak(boolean speak) {
		_speak = speak;
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

	private long _employeeLanguageDetailId;
	private long _userId;
	private long _groupId;
	private long _companyId;
	private String _languageName;
	private boolean _read;
	private boolean _write;
	private boolean _speak;
	private Date _createDate;
	private Date _modifiedDate;
	private long _createBy;
	private long _modifiedBy;
}