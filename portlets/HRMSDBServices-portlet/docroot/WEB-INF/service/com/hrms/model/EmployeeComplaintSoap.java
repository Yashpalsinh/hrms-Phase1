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
 * This class is used by SOAP remote services, specifically {@link com.hrms.service.http.EmployeeComplaintServiceSoap}.
 *
 * @author bhavik
 * @see com.hrms.service.http.EmployeeComplaintServiceSoap
 * @generated
 */
public class EmployeeComplaintSoap implements Serializable {
	public static EmployeeComplaintSoap toSoapModel(EmployeeComplaint model) {
		EmployeeComplaintSoap soapModel = new EmployeeComplaintSoap();

		soapModel.setEmployeeComplaintId(model.getEmployeeComplaintId());
		soapModel.setUserId(model.getUserId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setComplaintTitle(model.getComplaintTitle());
		soapModel.setComplaintDiscription(model.getComplaintDiscription());
		soapModel.setComplaintFrom(model.getComplaintFrom());
		soapModel.setComplaintDate(model.getComplaintDate());
		soapModel.setStatus(model.getStatus());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setCreateBy(model.getCreateBy());
		soapModel.setModifiedBy(model.getModifiedBy());

		return soapModel;
	}

	public static EmployeeComplaintSoap[] toSoapModels(
		EmployeeComplaint[] models) {
		EmployeeComplaintSoap[] soapModels = new EmployeeComplaintSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static EmployeeComplaintSoap[][] toSoapModels(
		EmployeeComplaint[][] models) {
		EmployeeComplaintSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new EmployeeComplaintSoap[models.length][models[0].length];
		}
		else {
			soapModels = new EmployeeComplaintSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static EmployeeComplaintSoap[] toSoapModels(
		List<EmployeeComplaint> models) {
		List<EmployeeComplaintSoap> soapModels = new ArrayList<EmployeeComplaintSoap>(models.size());

		for (EmployeeComplaint model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new EmployeeComplaintSoap[soapModels.size()]);
	}

	public EmployeeComplaintSoap() {
	}

	public long getPrimaryKey() {
		return _employeeComplaintId;
	}

	public void setPrimaryKey(long pk) {
		setEmployeeComplaintId(pk);
	}

	public long getEmployeeComplaintId() {
		return _employeeComplaintId;
	}

	public void setEmployeeComplaintId(long employeeComplaintId) {
		_employeeComplaintId = employeeComplaintId;
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

	public String getComplaintTitle() {
		return _complaintTitle;
	}

	public void setComplaintTitle(String complaintTitle) {
		_complaintTitle = complaintTitle;
	}

	public String getComplaintDiscription() {
		return _complaintDiscription;
	}

	public void setComplaintDiscription(String complaintDiscription) {
		_complaintDiscription = complaintDiscription;
	}

	public long getComplaintFrom() {
		return _complaintFrom;
	}

	public void setComplaintFrom(long complaintFrom) {
		_complaintFrom = complaintFrom;
	}

	public Date getComplaintDate() {
		return _complaintDate;
	}

	public void setComplaintDate(Date complaintDate) {
		_complaintDate = complaintDate;
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

	private long _employeeComplaintId;
	private long _userId;
	private long _groupId;
	private long _companyId;
	private String _complaintTitle;
	private String _complaintDiscription;
	private long _complaintFrom;
	private Date _complaintDate;
	private boolean _status;
	private Date _modifiedDate;
	private long _createBy;
	private long _modifiedBy;
}