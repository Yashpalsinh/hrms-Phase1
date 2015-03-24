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
 * This class is used by SOAP remote services, specifically {@link com.hrms.service.http.EmployeeWarningServiceSoap}.
 *
 * @author yashpalsinh
 * @see com.hrms.service.http.EmployeeWarningServiceSoap
 * @generated
 */
public class EmployeeWarningSoap implements Serializable {
	public static EmployeeWarningSoap toSoapModel(EmployeeWarning model) {
		EmployeeWarningSoap soapModel = new EmployeeWarningSoap();

		soapModel.setEmployeeWarningId(model.getEmployeeWarningId());
		soapModel.setWarningTo(model.getWarningTo());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setWarningDate(model.getWarningDate());
		soapModel.setWarningSubject(model.getWarningSubject());
		soapModel.setStatus(model.getStatus());
		soapModel.setWarningBy(model.getWarningBy());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setCreateBy(model.getCreateBy());
		soapModel.setModifiedBy(model.getModifiedBy());

		return soapModel;
	}

	public static EmployeeWarningSoap[] toSoapModels(EmployeeWarning[] models) {
		EmployeeWarningSoap[] soapModels = new EmployeeWarningSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static EmployeeWarningSoap[][] toSoapModels(
		EmployeeWarning[][] models) {
		EmployeeWarningSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new EmployeeWarningSoap[models.length][models[0].length];
		}
		else {
			soapModels = new EmployeeWarningSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static EmployeeWarningSoap[] toSoapModels(
		List<EmployeeWarning> models) {
		List<EmployeeWarningSoap> soapModels = new ArrayList<EmployeeWarningSoap>(models.size());

		for (EmployeeWarning model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new EmployeeWarningSoap[soapModels.size()]);
	}

	public EmployeeWarningSoap() {
	}

	public long getPrimaryKey() {
		return _employeeWarningId;
	}

	public void setPrimaryKey(long pk) {
		setEmployeeWarningId(pk);
	}

	public long getEmployeeWarningId() {
		return _employeeWarningId;
	}

	public void setEmployeeWarningId(long employeeWarningId) {
		_employeeWarningId = employeeWarningId;
	}

	public long getWarningTo() {
		return _warningTo;
	}

	public void setWarningTo(long warningTo) {
		_warningTo = warningTo;
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

	public Date getWarningDate() {
		return _warningDate;
	}

	public void setWarningDate(Date warningDate) {
		_warningDate = warningDate;
	}

	public String getWarningSubject() {
		return _warningSubject;
	}

	public void setWarningSubject(String warningSubject) {
		_warningSubject = warningSubject;
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

	public long getWarningBy() {
		return _warningBy;
	}

	public void setWarningBy(long warningBy) {
		_warningBy = warningBy;
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

	private long _employeeWarningId;
	private long _warningTo;
	private long _groupId;
	private long _companyId;
	private Date _warningDate;
	private String _warningSubject;
	private boolean _status;
	private long _warningBy;
	private Date _modifiedDate;
	private long _createBy;
	private long _modifiedBy;
}