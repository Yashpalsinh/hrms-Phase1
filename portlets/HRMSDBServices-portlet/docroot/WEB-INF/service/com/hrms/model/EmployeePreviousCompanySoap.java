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
 * This class is used by SOAP remote services, specifically {@link com.hrms.service.http.EmployeePreviousCompanyServiceSoap}.
 *
 * @author bhavik
 * @see com.hrms.service.http.EmployeePreviousCompanyServiceSoap
 * @generated
 */
public class EmployeePreviousCompanySoap implements Serializable {
	public static EmployeePreviousCompanySoap toSoapModel(
		EmployeePreviousCompany model) {
		EmployeePreviousCompanySoap soapModel = new EmployeePreviousCompanySoap();

		soapModel.setEmployeePreviousCompanyId(model.getEmployeePreviousCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setCompanyName(model.getCompanyName());
		soapModel.setJobTitle(model.getJobTitle());
		soapModel.setJobDiscription(model.getJobDiscription());
		soapModel.setStartDate(model.getStartDate());
		soapModel.setEndDate(model.getEndDate());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setCreateBy(model.getCreateBy());
		soapModel.setModifiedBy(model.getModifiedBy());

		return soapModel;
	}

	public static EmployeePreviousCompanySoap[] toSoapModels(
		EmployeePreviousCompany[] models) {
		EmployeePreviousCompanySoap[] soapModels = new EmployeePreviousCompanySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static EmployeePreviousCompanySoap[][] toSoapModels(
		EmployeePreviousCompany[][] models) {
		EmployeePreviousCompanySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new EmployeePreviousCompanySoap[models.length][models[0].length];
		}
		else {
			soapModels = new EmployeePreviousCompanySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static EmployeePreviousCompanySoap[] toSoapModels(
		List<EmployeePreviousCompany> models) {
		List<EmployeePreviousCompanySoap> soapModels = new ArrayList<EmployeePreviousCompanySoap>(models.size());

		for (EmployeePreviousCompany model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new EmployeePreviousCompanySoap[soapModels.size()]);
	}

	public EmployeePreviousCompanySoap() {
	}

	public long getPrimaryKey() {
		return _employeePreviousCompanyId;
	}

	public void setPrimaryKey(long pk) {
		setEmployeePreviousCompanyId(pk);
	}

	public long getEmployeePreviousCompanyId() {
		return _employeePreviousCompanyId;
	}

	public void setEmployeePreviousCompanyId(long employeePreviousCompanyId) {
		_employeePreviousCompanyId = employeePreviousCompanyId;
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

	public String getCompanyName() {
		return _companyName;
	}

	public void setCompanyName(String companyName) {
		_companyName = companyName;
	}

	public String getJobTitle() {
		return _jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		_jobTitle = jobTitle;
	}

	public String getJobDiscription() {
		return _jobDiscription;
	}

	public void setJobDiscription(String jobDiscription) {
		_jobDiscription = jobDiscription;
	}

	public Date getStartDate() {
		return _startDate;
	}

	public void setStartDate(Date startDate) {
		_startDate = startDate;
	}

	public Date getEndDate() {
		return _endDate;
	}

	public void setEndDate(Date endDate) {
		_endDate = endDate;
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

	private long _employeePreviousCompanyId;
	private long _userId;
	private long _groupId;
	private long _companyId;
	private String _companyName;
	private String _jobTitle;
	private String _jobDiscription;
	private Date _startDate;
	private Date _endDate;
	private Date _createDate;
	private Date _modifiedDate;
	private long _createBy;
	private long _modifiedBy;
}