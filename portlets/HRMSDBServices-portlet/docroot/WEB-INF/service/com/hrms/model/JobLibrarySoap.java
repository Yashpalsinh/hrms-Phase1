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
 * This class is used by SOAP remote services, specifically {@link com.hrms.service.http.JobLibraryServiceSoap}.
 *
 * @author yashpalsinh
 * @see com.hrms.service.http.JobLibraryServiceSoap
 * @generated
 */
public class JobLibrarySoap implements Serializable {
	public static JobLibrarySoap toSoapModel(JobLibrary model) {
		JobLibrarySoap soapModel = new JobLibrarySoap();

		soapModel.setJobLibraryId(model.getJobLibraryId());
		soapModel.setEmployeeDepartmentId(model.getEmployeeDepartmentId());
		soapModel.setJobTitle(model.getJobTitle());
		soapModel.setJobDescription(model.getJobDescription());
		soapModel.setResponsibility(model.getResponsibility());
		soapModel.setQualifications(model.getQualifications());
		soapModel.setNumberOfPosition(model.getNumberOfPosition());
		soapModel.setExperience(model.getExperience());
		soapModel.setSalaryStartRange(model.getSalaryStartRange());
		soapModel.setSalaryEndRange(model.getSalaryEndRange());
		soapModel.setBenefits(model.getBenefits());
		soapModel.setReportsToId(model.getReportsToId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setCreateBy(model.getCreateBy());
		soapModel.setModifiedBy(model.getModifiedBy());

		return soapModel;
	}

	public static JobLibrarySoap[] toSoapModels(JobLibrary[] models) {
		JobLibrarySoap[] soapModels = new JobLibrarySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static JobLibrarySoap[][] toSoapModels(JobLibrary[][] models) {
		JobLibrarySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new JobLibrarySoap[models.length][models[0].length];
		}
		else {
			soapModels = new JobLibrarySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static JobLibrarySoap[] toSoapModels(List<JobLibrary> models) {
		List<JobLibrarySoap> soapModels = new ArrayList<JobLibrarySoap>(models.size());

		for (JobLibrary model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new JobLibrarySoap[soapModels.size()]);
	}

	public JobLibrarySoap() {
	}

	public long getPrimaryKey() {
		return _jobLibraryId;
	}

	public void setPrimaryKey(long pk) {
		setJobLibraryId(pk);
	}

	public long getJobLibraryId() {
		return _jobLibraryId;
	}

	public void setJobLibraryId(long jobLibraryId) {
		_jobLibraryId = jobLibraryId;
	}

	public long getEmployeeDepartmentId() {
		return _employeeDepartmentId;
	}

	public void setEmployeeDepartmentId(long employeeDepartmentId) {
		_employeeDepartmentId = employeeDepartmentId;
	}

	public String getJobTitle() {
		return _jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		_jobTitle = jobTitle;
	}

	public String getJobDescription() {
		return _jobDescription;
	}

	public void setJobDescription(String jobDescription) {
		_jobDescription = jobDescription;
	}

	public String getResponsibility() {
		return _responsibility;
	}

	public void setResponsibility(String responsibility) {
		_responsibility = responsibility;
	}

	public String getQualifications() {
		return _qualifications;
	}

	public void setQualifications(String qualifications) {
		_qualifications = qualifications;
	}

	public int getNumberOfPosition() {
		return _numberOfPosition;
	}

	public void setNumberOfPosition(int numberOfPosition) {
		_numberOfPosition = numberOfPosition;
	}

	public String getExperience() {
		return _experience;
	}

	public void setExperience(String experience) {
		_experience = experience;
	}

	public long getSalaryStartRange() {
		return _salaryStartRange;
	}

	public void setSalaryStartRange(long salaryStartRange) {
		_salaryStartRange = salaryStartRange;
	}

	public long getSalaryEndRange() {
		return _salaryEndRange;
	}

	public void setSalaryEndRange(long salaryEndRange) {
		_salaryEndRange = salaryEndRange;
	}

	public String getBenefits() {
		return _benefits;
	}

	public void setBenefits(String benefits) {
		_benefits = benefits;
	}

	public long getReportsToId() {
		return _reportsToId;
	}

	public void setReportsToId(long reportsToId) {
		_reportsToId = reportsToId;
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

	private long _jobLibraryId;
	private long _employeeDepartmentId;
	private String _jobTitle;
	private String _jobDescription;
	private String _responsibility;
	private String _qualifications;
	private int _numberOfPosition;
	private String _experience;
	private long _salaryStartRange;
	private long _salaryEndRange;
	private String _benefits;
	private long _reportsToId;
	private Date _createDate;
	private Date _modifiedDate;
	private long _createBy;
	private long _modifiedBy;
}