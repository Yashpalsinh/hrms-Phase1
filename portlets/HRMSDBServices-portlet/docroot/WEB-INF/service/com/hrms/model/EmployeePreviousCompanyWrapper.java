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
 * This class is a wrapper for {@link EmployeePreviousCompany}.
 * </p>
 *
 * @author bhavik
 * @see EmployeePreviousCompany
 * @generated
 */
public class EmployeePreviousCompanyWrapper implements EmployeePreviousCompany,
	ModelWrapper<EmployeePreviousCompany> {
	public EmployeePreviousCompanyWrapper(
		EmployeePreviousCompany employeePreviousCompany) {
		_employeePreviousCompany = employeePreviousCompany;
	}

	@Override
	public Class<?> getModelClass() {
		return EmployeePreviousCompany.class;
	}

	@Override
	public String getModelClassName() {
		return EmployeePreviousCompany.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("employeePreviousCompanyId",
			getEmployeePreviousCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("companyName", getCompanyName());
		attributes.put("jobTitle", getJobTitle());
		attributes.put("jobDiscription", getJobDiscription());
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
		Long employeePreviousCompanyId = (Long)attributes.get(
				"employeePreviousCompanyId");

		if (employeePreviousCompanyId != null) {
			setEmployeePreviousCompanyId(employeePreviousCompanyId);
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

		String companyName = (String)attributes.get("companyName");

		if (companyName != null) {
			setCompanyName(companyName);
		}

		String jobTitle = (String)attributes.get("jobTitle");

		if (jobTitle != null) {
			setJobTitle(jobTitle);
		}

		String jobDiscription = (String)attributes.get("jobDiscription");

		if (jobDiscription != null) {
			setJobDiscription(jobDiscription);
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
	* Returns the primary key of this employee previous company.
	*
	* @return the primary key of this employee previous company
	*/
	@Override
	public long getPrimaryKey() {
		return _employeePreviousCompany.getPrimaryKey();
	}

	/**
	* Sets the primary key of this employee previous company.
	*
	* @param primaryKey the primary key of this employee previous company
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_employeePreviousCompany.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the employee previous company ID of this employee previous company.
	*
	* @return the employee previous company ID of this employee previous company
	*/
	@Override
	public long getEmployeePreviousCompanyId() {
		return _employeePreviousCompany.getEmployeePreviousCompanyId();
	}

	/**
	* Sets the employee previous company ID of this employee previous company.
	*
	* @param employeePreviousCompanyId the employee previous company ID of this employee previous company
	*/
	@Override
	public void setEmployeePreviousCompanyId(long employeePreviousCompanyId) {
		_employeePreviousCompany.setEmployeePreviousCompanyId(employeePreviousCompanyId);
	}

	/**
	* Returns the user ID of this employee previous company.
	*
	* @return the user ID of this employee previous company
	*/
	@Override
	public long getUserId() {
		return _employeePreviousCompany.getUserId();
	}

	/**
	* Sets the user ID of this employee previous company.
	*
	* @param userId the user ID of this employee previous company
	*/
	@Override
	public void setUserId(long userId) {
		_employeePreviousCompany.setUserId(userId);
	}

	/**
	* Returns the user uuid of this employee previous company.
	*
	* @return the user uuid of this employee previous company
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employeePreviousCompany.getUserUuid();
	}

	/**
	* Sets the user uuid of this employee previous company.
	*
	* @param userUuid the user uuid of this employee previous company
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_employeePreviousCompany.setUserUuid(userUuid);
	}

	/**
	* Returns the group ID of this employee previous company.
	*
	* @return the group ID of this employee previous company
	*/
	@Override
	public long getGroupId() {
		return _employeePreviousCompany.getGroupId();
	}

	/**
	* Sets the group ID of this employee previous company.
	*
	* @param groupId the group ID of this employee previous company
	*/
	@Override
	public void setGroupId(long groupId) {
		_employeePreviousCompany.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this employee previous company.
	*
	* @return the company ID of this employee previous company
	*/
	@Override
	public long getCompanyId() {
		return _employeePreviousCompany.getCompanyId();
	}

	/**
	* Sets the company ID of this employee previous company.
	*
	* @param companyId the company ID of this employee previous company
	*/
	@Override
	public void setCompanyId(long companyId) {
		_employeePreviousCompany.setCompanyId(companyId);
	}

	/**
	* Returns the company name of this employee previous company.
	*
	* @return the company name of this employee previous company
	*/
	@Override
	public java.lang.String getCompanyName() {
		return _employeePreviousCompany.getCompanyName();
	}

	/**
	* Sets the company name of this employee previous company.
	*
	* @param companyName the company name of this employee previous company
	*/
	@Override
	public void setCompanyName(java.lang.String companyName) {
		_employeePreviousCompany.setCompanyName(companyName);
	}

	/**
	* Returns the job title of this employee previous company.
	*
	* @return the job title of this employee previous company
	*/
	@Override
	public java.lang.String getJobTitle() {
		return _employeePreviousCompany.getJobTitle();
	}

	/**
	* Sets the job title of this employee previous company.
	*
	* @param jobTitle the job title of this employee previous company
	*/
	@Override
	public void setJobTitle(java.lang.String jobTitle) {
		_employeePreviousCompany.setJobTitle(jobTitle);
	}

	/**
	* Returns the job discription of this employee previous company.
	*
	* @return the job discription of this employee previous company
	*/
	@Override
	public java.lang.String getJobDiscription() {
		return _employeePreviousCompany.getJobDiscription();
	}

	/**
	* Sets the job discription of this employee previous company.
	*
	* @param jobDiscription the job discription of this employee previous company
	*/
	@Override
	public void setJobDiscription(java.lang.String jobDiscription) {
		_employeePreviousCompany.setJobDiscription(jobDiscription);
	}

	/**
	* Returns the start date of this employee previous company.
	*
	* @return the start date of this employee previous company
	*/
	@Override
	public java.util.Date getStartDate() {
		return _employeePreviousCompany.getStartDate();
	}

	/**
	* Sets the start date of this employee previous company.
	*
	* @param startDate the start date of this employee previous company
	*/
	@Override
	public void setStartDate(java.util.Date startDate) {
		_employeePreviousCompany.setStartDate(startDate);
	}

	/**
	* Returns the end date of this employee previous company.
	*
	* @return the end date of this employee previous company
	*/
	@Override
	public java.util.Date getEndDate() {
		return _employeePreviousCompany.getEndDate();
	}

	/**
	* Sets the end date of this employee previous company.
	*
	* @param endDate the end date of this employee previous company
	*/
	@Override
	public void setEndDate(java.util.Date endDate) {
		_employeePreviousCompany.setEndDate(endDate);
	}

	/**
	* Returns the create date of this employee previous company.
	*
	* @return the create date of this employee previous company
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _employeePreviousCompany.getCreateDate();
	}

	/**
	* Sets the create date of this employee previous company.
	*
	* @param createDate the create date of this employee previous company
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_employeePreviousCompany.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this employee previous company.
	*
	* @return the modified date of this employee previous company
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _employeePreviousCompany.getModifiedDate();
	}

	/**
	* Sets the modified date of this employee previous company.
	*
	* @param modifiedDate the modified date of this employee previous company
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_employeePreviousCompany.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the create by of this employee previous company.
	*
	* @return the create by of this employee previous company
	*/
	@Override
	public long getCreateBy() {
		return _employeePreviousCompany.getCreateBy();
	}

	/**
	* Sets the create by of this employee previous company.
	*
	* @param createBy the create by of this employee previous company
	*/
	@Override
	public void setCreateBy(long createBy) {
		_employeePreviousCompany.setCreateBy(createBy);
	}

	/**
	* Returns the modified by of this employee previous company.
	*
	* @return the modified by of this employee previous company
	*/
	@Override
	public long getModifiedBy() {
		return _employeePreviousCompany.getModifiedBy();
	}

	/**
	* Sets the modified by of this employee previous company.
	*
	* @param modifiedBy the modified by of this employee previous company
	*/
	@Override
	public void setModifiedBy(long modifiedBy) {
		_employeePreviousCompany.setModifiedBy(modifiedBy);
	}

	@Override
	public boolean isNew() {
		return _employeePreviousCompany.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_employeePreviousCompany.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _employeePreviousCompany.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_employeePreviousCompany.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _employeePreviousCompany.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _employeePreviousCompany.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_employeePreviousCompany.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _employeePreviousCompany.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_employeePreviousCompany.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_employeePreviousCompany.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_employeePreviousCompany.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new EmployeePreviousCompanyWrapper((EmployeePreviousCompany)_employeePreviousCompany.clone());
	}

	@Override
	public int compareTo(
		com.hrms.model.EmployeePreviousCompany employeePreviousCompany) {
		return _employeePreviousCompany.compareTo(employeePreviousCompany);
	}

	@Override
	public int hashCode() {
		return _employeePreviousCompany.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.hrms.model.EmployeePreviousCompany> toCacheModel() {
		return _employeePreviousCompany.toCacheModel();
	}

	@Override
	public com.hrms.model.EmployeePreviousCompany toEscapedModel() {
		return new EmployeePreviousCompanyWrapper(_employeePreviousCompany.toEscapedModel());
	}

	@Override
	public com.hrms.model.EmployeePreviousCompany toUnescapedModel() {
		return new EmployeePreviousCompanyWrapper(_employeePreviousCompany.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _employeePreviousCompany.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _employeePreviousCompany.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_employeePreviousCompany.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof EmployeePreviousCompanyWrapper)) {
			return false;
		}

		EmployeePreviousCompanyWrapper employeePreviousCompanyWrapper = (EmployeePreviousCompanyWrapper)obj;

		if (Validator.equals(_employeePreviousCompany,
					employeePreviousCompanyWrapper._employeePreviousCompany)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public EmployeePreviousCompany getWrappedEmployeePreviousCompany() {
		return _employeePreviousCompany;
	}

	@Override
	public EmployeePreviousCompany getWrappedModel() {
		return _employeePreviousCompany;
	}

	@Override
	public void resetOriginalValues() {
		_employeePreviousCompany.resetOriginalValues();
	}

	private EmployeePreviousCompany _employeePreviousCompany;
}