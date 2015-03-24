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
 * This class is a wrapper for {@link EmployeeQualification}.
 * </p>
 *
 * @author bhavik
 * @see EmployeeQualification
 * @generated
 */
public class EmployeeQualificationWrapper implements EmployeeQualification,
	ModelWrapper<EmployeeQualification> {
	public EmployeeQualificationWrapper(
		EmployeeQualification employeeQualification) {
		_employeeQualification = employeeQualification;
	}

	@Override
	public Class<?> getModelClass() {
		return EmployeeQualification.class;
	}

	@Override
	public String getModelClassName() {
		return EmployeeQualification.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("employeeQualificationId", getEmployeeQualificationId());
		attributes.put("userId", getUserId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("degreeName", getDegreeName());
		attributes.put("mainSubject", getMainSubject());
		attributes.put("university", getUniversity());
		attributes.put("score", getScore());
		attributes.put("startDate", getStartDate());
		attributes.put("endDate", getEndDate());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("createBy", getCreateBy());
		attributes.put("modifiedBy", getModifiedBy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long employeeQualificationId = (Long)attributes.get(
				"employeeQualificationId");

		if (employeeQualificationId != null) {
			setEmployeeQualificationId(employeeQualificationId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		String degreeName = (String)attributes.get("degreeName");

		if (degreeName != null) {
			setDegreeName(degreeName);
		}

		String mainSubject = (String)attributes.get("mainSubject");

		if (mainSubject != null) {
			setMainSubject(mainSubject);
		}

		String university = (String)attributes.get("university");

		if (university != null) {
			setUniversity(university);
		}

		String score = (String)attributes.get("score");

		if (score != null) {
			setScore(score);
		}

		Date startDate = (Date)attributes.get("startDate");

		if (startDate != null) {
			setStartDate(startDate);
		}

		Date endDate = (Date)attributes.get("endDate");

		if (endDate != null) {
			setEndDate(endDate);
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
	* Returns the primary key of this employee qualification.
	*
	* @return the primary key of this employee qualification
	*/
	@Override
	public long getPrimaryKey() {
		return _employeeQualification.getPrimaryKey();
	}

	/**
	* Sets the primary key of this employee qualification.
	*
	* @param primaryKey the primary key of this employee qualification
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_employeeQualification.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the employee qualification ID of this employee qualification.
	*
	* @return the employee qualification ID of this employee qualification
	*/
	@Override
	public long getEmployeeQualificationId() {
		return _employeeQualification.getEmployeeQualificationId();
	}

	/**
	* Sets the employee qualification ID of this employee qualification.
	*
	* @param employeeQualificationId the employee qualification ID of this employee qualification
	*/
	@Override
	public void setEmployeeQualificationId(long employeeQualificationId) {
		_employeeQualification.setEmployeeQualificationId(employeeQualificationId);
	}

	/**
	* Returns the user ID of this employee qualification.
	*
	* @return the user ID of this employee qualification
	*/
	@Override
	public long getUserId() {
		return _employeeQualification.getUserId();
	}

	/**
	* Sets the user ID of this employee qualification.
	*
	* @param userId the user ID of this employee qualification
	*/
	@Override
	public void setUserId(long userId) {
		_employeeQualification.setUserId(userId);
	}

	/**
	* Returns the user uuid of this employee qualification.
	*
	* @return the user uuid of this employee qualification
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employeeQualification.getUserUuid();
	}

	/**
	* Sets the user uuid of this employee qualification.
	*
	* @param userUuid the user uuid of this employee qualification
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_employeeQualification.setUserUuid(userUuid);
	}

	/**
	* Returns the group ID of this employee qualification.
	*
	* @return the group ID of this employee qualification
	*/
	@Override
	public long getGroupId() {
		return _employeeQualification.getGroupId();
	}

	/**
	* Sets the group ID of this employee qualification.
	*
	* @param groupId the group ID of this employee qualification
	*/
	@Override
	public void setGroupId(long groupId) {
		_employeeQualification.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this employee qualification.
	*
	* @return the company ID of this employee qualification
	*/
	@Override
	public long getCompanyId() {
		return _employeeQualification.getCompanyId();
	}

	/**
	* Sets the company ID of this employee qualification.
	*
	* @param companyId the company ID of this employee qualification
	*/
	@Override
	public void setCompanyId(long companyId) {
		_employeeQualification.setCompanyId(companyId);
	}

	/**
	* Returns the degree name of this employee qualification.
	*
	* @return the degree name of this employee qualification
	*/
	@Override
	public java.lang.String getDegreeName() {
		return _employeeQualification.getDegreeName();
	}

	/**
	* Sets the degree name of this employee qualification.
	*
	* @param degreeName the degree name of this employee qualification
	*/
	@Override
	public void setDegreeName(java.lang.String degreeName) {
		_employeeQualification.setDegreeName(degreeName);
	}

	/**
	* Returns the main subject of this employee qualification.
	*
	* @return the main subject of this employee qualification
	*/
	@Override
	public java.lang.String getMainSubject() {
		return _employeeQualification.getMainSubject();
	}

	/**
	* Sets the main subject of this employee qualification.
	*
	* @param mainSubject the main subject of this employee qualification
	*/
	@Override
	public void setMainSubject(java.lang.String mainSubject) {
		_employeeQualification.setMainSubject(mainSubject);
	}

	/**
	* Returns the university of this employee qualification.
	*
	* @return the university of this employee qualification
	*/
	@Override
	public java.lang.String getUniversity() {
		return _employeeQualification.getUniversity();
	}

	/**
	* Sets the university of this employee qualification.
	*
	* @param university the university of this employee qualification
	*/
	@Override
	public void setUniversity(java.lang.String university) {
		_employeeQualification.setUniversity(university);
	}

	/**
	* Returns the score of this employee qualification.
	*
	* @return the score of this employee qualification
	*/
	@Override
	public java.lang.String getScore() {
		return _employeeQualification.getScore();
	}

	/**
	* Sets the score of this employee qualification.
	*
	* @param score the score of this employee qualification
	*/
	@Override
	public void setScore(java.lang.String score) {
		_employeeQualification.setScore(score);
	}

	/**
	* Returns the start date of this employee qualification.
	*
	* @return the start date of this employee qualification
	*/
	@Override
	public java.util.Date getStartDate() {
		return _employeeQualification.getStartDate();
	}

	/**
	* Sets the start date of this employee qualification.
	*
	* @param startDate the start date of this employee qualification
	*/
	@Override
	public void setStartDate(java.util.Date startDate) {
		_employeeQualification.setStartDate(startDate);
	}

	/**
	* Returns the end date of this employee qualification.
	*
	* @return the end date of this employee qualification
	*/
	@Override
	public java.util.Date getEndDate() {
		return _employeeQualification.getEndDate();
	}

	/**
	* Sets the end date of this employee qualification.
	*
	* @param endDate the end date of this employee qualification
	*/
	@Override
	public void setEndDate(java.util.Date endDate) {
		_employeeQualification.setEndDate(endDate);
	}

	/**
	* Returns the create date of this employee qualification.
	*
	* @return the create date of this employee qualification
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _employeeQualification.getCreateDate();
	}

	/**
	* Sets the create date of this employee qualification.
	*
	* @param createDate the create date of this employee qualification
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_employeeQualification.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this employee qualification.
	*
	* @return the modified date of this employee qualification
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _employeeQualification.getModifiedDate();
	}

	/**
	* Sets the modified date of this employee qualification.
	*
	* @param modifiedDate the modified date of this employee qualification
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_employeeQualification.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the create by of this employee qualification.
	*
	* @return the create by of this employee qualification
	*/
	@Override
	public long getCreateBy() {
		return _employeeQualification.getCreateBy();
	}

	/**
	* Sets the create by of this employee qualification.
	*
	* @param createBy the create by of this employee qualification
	*/
	@Override
	public void setCreateBy(long createBy) {
		_employeeQualification.setCreateBy(createBy);
	}

	/**
	* Returns the modified by of this employee qualification.
	*
	* @return the modified by of this employee qualification
	*/
	@Override
	public long getModifiedBy() {
		return _employeeQualification.getModifiedBy();
	}

	/**
	* Sets the modified by of this employee qualification.
	*
	* @param modifiedBy the modified by of this employee qualification
	*/
	@Override
	public void setModifiedBy(long modifiedBy) {
		_employeeQualification.setModifiedBy(modifiedBy);
	}

	@Override
	public boolean isNew() {
		return _employeeQualification.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_employeeQualification.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _employeeQualification.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_employeeQualification.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _employeeQualification.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _employeeQualification.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_employeeQualification.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _employeeQualification.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_employeeQualification.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_employeeQualification.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_employeeQualification.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new EmployeeQualificationWrapper((EmployeeQualification)_employeeQualification.clone());
	}

	@Override
	public int compareTo(
		com.hrms.model.EmployeeQualification employeeQualification) {
		return _employeeQualification.compareTo(employeeQualification);
	}

	@Override
	public int hashCode() {
		return _employeeQualification.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.hrms.model.EmployeeQualification> toCacheModel() {
		return _employeeQualification.toCacheModel();
	}

	@Override
	public com.hrms.model.EmployeeQualification toEscapedModel() {
		return new EmployeeQualificationWrapper(_employeeQualification.toEscapedModel());
	}

	@Override
	public com.hrms.model.EmployeeQualification toUnescapedModel() {
		return new EmployeeQualificationWrapper(_employeeQualification.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _employeeQualification.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _employeeQualification.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_employeeQualification.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof EmployeeQualificationWrapper)) {
			return false;
		}

		EmployeeQualificationWrapper employeeQualificationWrapper = (EmployeeQualificationWrapper)obj;

		if (Validator.equals(_employeeQualification,
					employeeQualificationWrapper._employeeQualification)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public EmployeeQualification getWrappedEmployeeQualification() {
		return _employeeQualification;
	}

	@Override
	public EmployeeQualification getWrappedModel() {
		return _employeeQualification;
	}

	@Override
	public void resetOriginalValues() {
		_employeeQualification.resetOriginalValues();
	}

	private EmployeeQualification _employeeQualification;
}