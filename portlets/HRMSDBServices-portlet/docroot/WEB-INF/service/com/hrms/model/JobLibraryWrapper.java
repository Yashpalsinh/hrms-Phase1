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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link JobLibrary}.
 * </p>
 *
 * @author bhavik
 * @see JobLibrary
 * @generated
 */
public class JobLibraryWrapper implements JobLibrary, ModelWrapper<JobLibrary> {
	public JobLibraryWrapper(JobLibrary jobLibrary) {
		_jobLibrary = jobLibrary;
	}

	@Override
	public Class<?> getModelClass() {
		return JobLibrary.class;
	}

	@Override
	public String getModelClassName() {
		return JobLibrary.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("jobLibraryId", getJobLibraryId());
		attributes.put("employeeDepartmentId", getEmployeeDepartmentId());
		attributes.put("jobTitle", getJobTitle());
		attributes.put("jobDescription", getJobDescription());
		attributes.put("responsibility", getResponsibility());
		attributes.put("qualifications", getQualifications());
		attributes.put("numberOfPosition", getNumberOfPosition());
		attributes.put("experience", getExperience());
		attributes.put("salaryStartRange", getSalaryStartRange());
		attributes.put("salaryEndRange", getSalaryEndRange());
		attributes.put("benefits", getBenefits());
		attributes.put("reportsToId", getReportsToId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("createBy", getCreateBy());
		attributes.put("modifiedBy", getModifiedBy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long jobLibraryId = (Long)attributes.get("jobLibraryId");

		if (jobLibraryId != null) {
			setJobLibraryId(jobLibraryId);
		}

		Long employeeDepartmentId = (Long)attributes.get("employeeDepartmentId");

		if (employeeDepartmentId != null) {
			setEmployeeDepartmentId(employeeDepartmentId);
		}

		String jobTitle = (String)attributes.get("jobTitle");

		if (jobTitle != null) {
			setJobTitle(jobTitle);
		}

		String jobDescription = (String)attributes.get("jobDescription");

		if (jobDescription != null) {
			setJobDescription(jobDescription);
		}

		String responsibility = (String)attributes.get("responsibility");

		if (responsibility != null) {
			setResponsibility(responsibility);
		}

		String qualifications = (String)attributes.get("qualifications");

		if (qualifications != null) {
			setQualifications(qualifications);
		}

		Integer numberOfPosition = (Integer)attributes.get("numberOfPosition");

		if (numberOfPosition != null) {
			setNumberOfPosition(numberOfPosition);
		}

		String experience = (String)attributes.get("experience");

		if (experience != null) {
			setExperience(experience);
		}

		Long salaryStartRange = (Long)attributes.get("salaryStartRange");

		if (salaryStartRange != null) {
			setSalaryStartRange(salaryStartRange);
		}

		Long salaryEndRange = (Long)attributes.get("salaryEndRange");

		if (salaryEndRange != null) {
			setSalaryEndRange(salaryEndRange);
		}

		String benefits = (String)attributes.get("benefits");

		if (benefits != null) {
			setBenefits(benefits);
		}

		Long reportsToId = (Long)attributes.get("reportsToId");

		if (reportsToId != null) {
			setReportsToId(reportsToId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long createBy = (Long)attributes.get("createBy");

		if (createBy != null) {
			setCreateBy(createBy);
		}

		Long modifiedBy = (Long)attributes.get("modifiedBy");

		if (modifiedBy != null) {
			setModifiedBy(modifiedBy);
		}
	}

	/**
	* Returns the primary key of this job library.
	*
	* @return the primary key of this job library
	*/
	@Override
	public long getPrimaryKey() {
		return _jobLibrary.getPrimaryKey();
	}

	/**
	* Sets the primary key of this job library.
	*
	* @param primaryKey the primary key of this job library
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_jobLibrary.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the job library ID of this job library.
	*
	* @return the job library ID of this job library
	*/
	@Override
	public long getJobLibraryId() {
		return _jobLibrary.getJobLibraryId();
	}

	/**
	* Sets the job library ID of this job library.
	*
	* @param jobLibraryId the job library ID of this job library
	*/
	@Override
	public void setJobLibraryId(long jobLibraryId) {
		_jobLibrary.setJobLibraryId(jobLibraryId);
	}

	/**
	* Returns the employee department ID of this job library.
	*
	* @return the employee department ID of this job library
	*/
	@Override
	public long getEmployeeDepartmentId() {
		return _jobLibrary.getEmployeeDepartmentId();
	}

	/**
	* Sets the employee department ID of this job library.
	*
	* @param employeeDepartmentId the employee department ID of this job library
	*/
	@Override
	public void setEmployeeDepartmentId(long employeeDepartmentId) {
		_jobLibrary.setEmployeeDepartmentId(employeeDepartmentId);
	}

	/**
	* Returns the job title of this job library.
	*
	* @return the job title of this job library
	*/
	@Override
	public java.lang.String getJobTitle() {
		return _jobLibrary.getJobTitle();
	}

	/**
	* Sets the job title of this job library.
	*
	* @param jobTitle the job title of this job library
	*/
	@Override
	public void setJobTitle(java.lang.String jobTitle) {
		_jobLibrary.setJobTitle(jobTitle);
	}

	/**
	* Returns the job description of this job library.
	*
	* @return the job description of this job library
	*/
	@Override
	public java.lang.String getJobDescription() {
		return _jobLibrary.getJobDescription();
	}

	/**
	* Sets the job description of this job library.
	*
	* @param jobDescription the job description of this job library
	*/
	@Override
	public void setJobDescription(java.lang.String jobDescription) {
		_jobLibrary.setJobDescription(jobDescription);
	}

	/**
	* Returns the responsibility of this job library.
	*
	* @return the responsibility of this job library
	*/
	@Override
	public java.lang.String getResponsibility() {
		return _jobLibrary.getResponsibility();
	}

	/**
	* Sets the responsibility of this job library.
	*
	* @param responsibility the responsibility of this job library
	*/
	@Override
	public void setResponsibility(java.lang.String responsibility) {
		_jobLibrary.setResponsibility(responsibility);
	}

	/**
	* Returns the qualifications of this job library.
	*
	* @return the qualifications of this job library
	*/
	@Override
	public java.lang.String getQualifications() {
		return _jobLibrary.getQualifications();
	}

	/**
	* Sets the qualifications of this job library.
	*
	* @param qualifications the qualifications of this job library
	*/
	@Override
	public void setQualifications(java.lang.String qualifications) {
		_jobLibrary.setQualifications(qualifications);
	}

	/**
	* Returns the number of position of this job library.
	*
	* @return the number of position of this job library
	*/
	@Override
	public int getNumberOfPosition() {
		return _jobLibrary.getNumberOfPosition();
	}

	/**
	* Sets the number of position of this job library.
	*
	* @param numberOfPosition the number of position of this job library
	*/
	@Override
	public void setNumberOfPosition(int numberOfPosition) {
		_jobLibrary.setNumberOfPosition(numberOfPosition);
	}

	/**
	* Returns the experience of this job library.
	*
	* @return the experience of this job library
	*/
	@Override
	public java.lang.String getExperience() {
		return _jobLibrary.getExperience();
	}

	/**
	* Sets the experience of this job library.
	*
	* @param experience the experience of this job library
	*/
	@Override
	public void setExperience(java.lang.String experience) {
		_jobLibrary.setExperience(experience);
	}

	/**
	* Returns the salary start range of this job library.
	*
	* @return the salary start range of this job library
	*/
	@Override
	public long getSalaryStartRange() {
		return _jobLibrary.getSalaryStartRange();
	}

	/**
	* Sets the salary start range of this job library.
	*
	* @param salaryStartRange the salary start range of this job library
	*/
	@Override
	public void setSalaryStartRange(long salaryStartRange) {
		_jobLibrary.setSalaryStartRange(salaryStartRange);
	}

	/**
	* Returns the salary end range of this job library.
	*
	* @return the salary end range of this job library
	*/
	@Override
	public long getSalaryEndRange() {
		return _jobLibrary.getSalaryEndRange();
	}

	/**
	* Sets the salary end range of this job library.
	*
	* @param salaryEndRange the salary end range of this job library
	*/
	@Override
	public void setSalaryEndRange(long salaryEndRange) {
		_jobLibrary.setSalaryEndRange(salaryEndRange);
	}

	/**
	* Returns the benefits of this job library.
	*
	* @return the benefits of this job library
	*/
	@Override
	public java.lang.String getBenefits() {
		return _jobLibrary.getBenefits();
	}

	/**
	* Sets the benefits of this job library.
	*
	* @param benefits the benefits of this job library
	*/
	@Override
	public void setBenefits(java.lang.String benefits) {
		_jobLibrary.setBenefits(benefits);
	}

	/**
	* Returns the reports to ID of this job library.
	*
	* @return the reports to ID of this job library
	*/
	@Override
	public long getReportsToId() {
		return _jobLibrary.getReportsToId();
	}

	/**
	* Sets the reports to ID of this job library.
	*
	* @param reportsToId the reports to ID of this job library
	*/
	@Override
	public void setReportsToId(long reportsToId) {
		_jobLibrary.setReportsToId(reportsToId);
	}

	/**
	* Returns the create date of this job library.
	*
	* @return the create date of this job library
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _jobLibrary.getCreateDate();
	}

	/**
	* Sets the create date of this job library.
	*
	* @param createDate the create date of this job library
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_jobLibrary.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this job library.
	*
	* @return the modified date of this job library
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _jobLibrary.getModifiedDate();
	}

	/**
	* Sets the modified date of this job library.
	*
	* @param modifiedDate the modified date of this job library
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_jobLibrary.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the create by of this job library.
	*
	* @return the create by of this job library
	*/
	@Override
	public long getCreateBy() {
		return _jobLibrary.getCreateBy();
	}

	/**
	* Sets the create by of this job library.
	*
	* @param createBy the create by of this job library
	*/
	@Override
	public void setCreateBy(long createBy) {
		_jobLibrary.setCreateBy(createBy);
	}

	/**
	* Returns the modified by of this job library.
	*
	* @return the modified by of this job library
	*/
	@Override
	public long getModifiedBy() {
		return _jobLibrary.getModifiedBy();
	}

	/**
	* Sets the modified by of this job library.
	*
	* @param modifiedBy the modified by of this job library
	*/
	@Override
	public void setModifiedBy(long modifiedBy) {
		_jobLibrary.setModifiedBy(modifiedBy);
	}

	@Override
	public boolean isNew() {
		return _jobLibrary.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_jobLibrary.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _jobLibrary.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_jobLibrary.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _jobLibrary.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _jobLibrary.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_jobLibrary.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _jobLibrary.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_jobLibrary.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_jobLibrary.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_jobLibrary.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new JobLibraryWrapper((JobLibrary)_jobLibrary.clone());
	}

	@Override
	public int compareTo(com.hrms.model.JobLibrary jobLibrary) {
		return _jobLibrary.compareTo(jobLibrary);
	}

	@Override
	public int hashCode() {
		return _jobLibrary.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.hrms.model.JobLibrary> toCacheModel() {
		return _jobLibrary.toCacheModel();
	}

	@Override
	public com.hrms.model.JobLibrary toEscapedModel() {
		return new JobLibraryWrapper(_jobLibrary.toEscapedModel());
	}

	@Override
	public com.hrms.model.JobLibrary toUnescapedModel() {
		return new JobLibraryWrapper(_jobLibrary.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _jobLibrary.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _jobLibrary.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_jobLibrary.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof JobLibraryWrapper)) {
			return false;
		}

		JobLibraryWrapper jobLibraryWrapper = (JobLibraryWrapper)obj;

		if (Validator.equals(_jobLibrary, jobLibraryWrapper._jobLibrary)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public JobLibrary getWrappedJobLibrary() {
		return _jobLibrary;
	}

	@Override
	public JobLibrary getWrappedModel() {
		return _jobLibrary;
	}

	@Override
	public void resetOriginalValues() {
		_jobLibrary.resetOriginalValues();
	}

	private JobLibrary _jobLibrary;
}