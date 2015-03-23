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
 * This class is used by SOAP remote services, specifically {@link com.hrms.service.http.EmployeeQualificationServiceSoap}.
 *
 * @author yashpalsinh
 * @see com.hrms.service.http.EmployeeQualificationServiceSoap
 * @generated
 */
public class EmployeeQualificationSoap implements Serializable {
	public static EmployeeQualificationSoap toSoapModel(
		EmployeeQualification model) {
		EmployeeQualificationSoap soapModel = new EmployeeQualificationSoap();

		soapModel.setEmployeeQualificationId(model.getEmployeeQualificationId());
		soapModel.setUserId(model.getUserId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setDegreeName(model.getDegreeName());
		soapModel.setSpecialization(model.getSpecialization());
		soapModel.setUniversity(model.getUniversity());
		soapModel.setScore(model.getScore());
		soapModel.setStartDate(model.getStartDate());
		soapModel.setEndDate(model.getEndDate());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setCreateBy(model.getCreateBy());
		soapModel.setModifiedBy(model.getModifiedBy());

		return soapModel;
	}

	public static EmployeeQualificationSoap[] toSoapModels(
		EmployeeQualification[] models) {
		EmployeeQualificationSoap[] soapModels = new EmployeeQualificationSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static EmployeeQualificationSoap[][] toSoapModels(
		EmployeeQualification[][] models) {
		EmployeeQualificationSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new EmployeeQualificationSoap[models.length][models[0].length];
		}
		else {
			soapModels = new EmployeeQualificationSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static EmployeeQualificationSoap[] toSoapModels(
		List<EmployeeQualification> models) {
		List<EmployeeQualificationSoap> soapModels = new ArrayList<EmployeeQualificationSoap>(models.size());

		for (EmployeeQualification model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new EmployeeQualificationSoap[soapModels.size()]);
	}

	public EmployeeQualificationSoap() {
	}

	public long getPrimaryKey() {
		return _employeeQualificationId;
	}

	public void setPrimaryKey(long pk) {
		setEmployeeQualificationId(pk);
	}

	public long getEmployeeQualificationId() {
		return _employeeQualificationId;
	}

	public void setEmployeeQualificationId(long employeeQualificationId) {
		_employeeQualificationId = employeeQualificationId;
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

	public String getDegreeName() {
		return _degreeName;
	}

	public void setDegreeName(String degreeName) {
		_degreeName = degreeName;
	}

	public String getSpecialization() {
		return _specialization;
	}

	public void setSpecialization(String specialization) {
		_specialization = specialization;
	}

	public String getUniversity() {
		return _university;
	}

	public void setUniversity(String university) {
		_university = university;
	}

	public String getScore() {
		return _score;
	}

	public void setScore(String score) {
		_score = score;
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

	private long _employeeQualificationId;
	private long _userId;
	private long _groupId;
	private long _companyId;
	private String _degreeName;
	private String _specialization;
	private String _university;
	private String _score;
	private Date _startDate;
	private Date _endDate;
	private Date _createDate;
	private Date _modifiedDate;
	private long _createBy;
	private long _modifiedBy;
}