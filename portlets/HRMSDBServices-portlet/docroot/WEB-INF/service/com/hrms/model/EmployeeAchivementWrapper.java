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
 * This class is a wrapper for {@link EmployeeAchivement}.
 * </p>
 *
 * @author yashpalsinh
 * @see EmployeeAchivement
 * @generated
 */
public class EmployeeAchivementWrapper implements EmployeeAchivement,
	ModelWrapper<EmployeeAchivement> {
	public EmployeeAchivementWrapper(EmployeeAchivement employeeAchivement) {
		_employeeAchivement = employeeAchivement;
	}

	@Override
	public Class<?> getModelClass() {
		return EmployeeAchivement.class;
	}

	@Override
	public String getModelClassName() {
		return EmployeeAchivement.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("employeeAchivementId", getEmployeeAchivementId());
		attributes.put("achivedBy", getAchivedBy());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("achivementDate", getAchivementDate());
		attributes.put("achivementTitle", getAchivementTitle());
		attributes.put("achivementDiscription", getAchivementDiscription());
		attributes.put("status", getStatus());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("createBy", getCreateBy());
		attributes.put("modifiedBy", getModifiedBy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long employeeAchivementId = (Long)attributes.get("employeeAchivementId");

		if (employeeAchivementId != null) {
			setEmployeeAchivementId(employeeAchivementId);
		}

		Long achivedBy = (Long)attributes.get("achivedBy");

		if (achivedBy != null) {
			setAchivedBy(achivedBy);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Date achivementDate = (Date)attributes.get("achivementDate");

		if (achivementDate != null) {
			setAchivementDate(achivementDate);
		}

		String achivementTitle = (String)attributes.get("achivementTitle");

		if (achivementTitle != null) {
			setAchivementTitle(achivementTitle);
		}

		String achivementDiscription = (String)attributes.get(
				"achivementDiscription");

		if (achivementDiscription != null) {
			setAchivementDiscription(achivementDiscription);
		}

		Boolean status = (Boolean)attributes.get("status");

		if (status != null) {
			setStatus(status);
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
	* Returns the primary key of this employee achivement.
	*
	* @return the primary key of this employee achivement
	*/
	@Override
	public long getPrimaryKey() {
		return _employeeAchivement.getPrimaryKey();
	}

	/**
	* Sets the primary key of this employee achivement.
	*
	* @param primaryKey the primary key of this employee achivement
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_employeeAchivement.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the employee achivement ID of this employee achivement.
	*
	* @return the employee achivement ID of this employee achivement
	*/
	@Override
	public long getEmployeeAchivementId() {
		return _employeeAchivement.getEmployeeAchivementId();
	}

	/**
	* Sets the employee achivement ID of this employee achivement.
	*
	* @param employeeAchivementId the employee achivement ID of this employee achivement
	*/
	@Override
	public void setEmployeeAchivementId(long employeeAchivementId) {
		_employeeAchivement.setEmployeeAchivementId(employeeAchivementId);
	}

	/**
	* Returns the achived by of this employee achivement.
	*
	* @return the achived by of this employee achivement
	*/
	@Override
	public long getAchivedBy() {
		return _employeeAchivement.getAchivedBy();
	}

	/**
	* Sets the achived by of this employee achivement.
	*
	* @param achivedBy the achived by of this employee achivement
	*/
	@Override
	public void setAchivedBy(long achivedBy) {
		_employeeAchivement.setAchivedBy(achivedBy);
	}

	/**
	* Returns the group ID of this employee achivement.
	*
	* @return the group ID of this employee achivement
	*/
	@Override
	public long getGroupId() {
		return _employeeAchivement.getGroupId();
	}

	/**
	* Sets the group ID of this employee achivement.
	*
	* @param groupId the group ID of this employee achivement
	*/
	@Override
	public void setGroupId(long groupId) {
		_employeeAchivement.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this employee achivement.
	*
	* @return the company ID of this employee achivement
	*/
	@Override
	public long getCompanyId() {
		return _employeeAchivement.getCompanyId();
	}

	/**
	* Sets the company ID of this employee achivement.
	*
	* @param companyId the company ID of this employee achivement
	*/
	@Override
	public void setCompanyId(long companyId) {
		_employeeAchivement.setCompanyId(companyId);
	}

	/**
	* Returns the achivement date of this employee achivement.
	*
	* @return the achivement date of this employee achivement
	*/
	@Override
	public java.util.Date getAchivementDate() {
		return _employeeAchivement.getAchivementDate();
	}

	/**
	* Sets the achivement date of this employee achivement.
	*
	* @param achivementDate the achivement date of this employee achivement
	*/
	@Override
	public void setAchivementDate(java.util.Date achivementDate) {
		_employeeAchivement.setAchivementDate(achivementDate);
	}

	/**
	* Returns the achivement title of this employee achivement.
	*
	* @return the achivement title of this employee achivement
	*/
	@Override
	public java.lang.String getAchivementTitle() {
		return _employeeAchivement.getAchivementTitle();
	}

	/**
	* Sets the achivement title of this employee achivement.
	*
	* @param achivementTitle the achivement title of this employee achivement
	*/
	@Override
	public void setAchivementTitle(java.lang.String achivementTitle) {
		_employeeAchivement.setAchivementTitle(achivementTitle);
	}

	/**
	* Returns the achivement discription of this employee achivement.
	*
	* @return the achivement discription of this employee achivement
	*/
	@Override
	public java.lang.String getAchivementDiscription() {
		return _employeeAchivement.getAchivementDiscription();
	}

	/**
	* Sets the achivement discription of this employee achivement.
	*
	* @param achivementDiscription the achivement discription of this employee achivement
	*/
	@Override
	public void setAchivementDiscription(java.lang.String achivementDiscription) {
		_employeeAchivement.setAchivementDiscription(achivementDiscription);
	}

	/**
	* Returns the status of this employee achivement.
	*
	* @return the status of this employee achivement
	*/
	@Override
	public boolean getStatus() {
		return _employeeAchivement.getStatus();
	}

	/**
	* Returns <code>true</code> if this employee achivement is status.
	*
	* @return <code>true</code> if this employee achivement is status; <code>false</code> otherwise
	*/
	@Override
	public boolean isStatus() {
		return _employeeAchivement.isStatus();
	}

	/**
	* Sets whether this employee achivement is status.
	*
	* @param status the status of this employee achivement
	*/
	@Override
	public void setStatus(boolean status) {
		_employeeAchivement.setStatus(status);
	}

	/**
	* Returns the create date of this employee achivement.
	*
	* @return the create date of this employee achivement
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _employeeAchivement.getCreateDate();
	}

	/**
	* Sets the create date of this employee achivement.
	*
	* @param createDate the create date of this employee achivement
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_employeeAchivement.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this employee achivement.
	*
	* @return the modified date of this employee achivement
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _employeeAchivement.getModifiedDate();
	}

	/**
	* Sets the modified date of this employee achivement.
	*
	* @param modifiedDate the modified date of this employee achivement
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_employeeAchivement.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the create by of this employee achivement.
	*
	* @return the create by of this employee achivement
	*/
	@Override
	public long getCreateBy() {
		return _employeeAchivement.getCreateBy();
	}

	/**
	* Sets the create by of this employee achivement.
	*
	* @param createBy the create by of this employee achivement
	*/
	@Override
	public void setCreateBy(long createBy) {
		_employeeAchivement.setCreateBy(createBy);
	}

	/**
	* Returns the modified by of this employee achivement.
	*
	* @return the modified by of this employee achivement
	*/
	@Override
	public long getModifiedBy() {
		return _employeeAchivement.getModifiedBy();
	}

	/**
	* Sets the modified by of this employee achivement.
	*
	* @param modifiedBy the modified by of this employee achivement
	*/
	@Override
	public void setModifiedBy(long modifiedBy) {
		_employeeAchivement.setModifiedBy(modifiedBy);
	}

	@Override
	public boolean isNew() {
		return _employeeAchivement.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_employeeAchivement.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _employeeAchivement.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_employeeAchivement.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _employeeAchivement.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _employeeAchivement.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_employeeAchivement.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _employeeAchivement.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_employeeAchivement.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_employeeAchivement.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_employeeAchivement.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new EmployeeAchivementWrapper((EmployeeAchivement)_employeeAchivement.clone());
	}

	@Override
	public int compareTo(com.hrms.model.EmployeeAchivement employeeAchivement) {
		return _employeeAchivement.compareTo(employeeAchivement);
	}

	@Override
	public int hashCode() {
		return _employeeAchivement.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.hrms.model.EmployeeAchivement> toCacheModel() {
		return _employeeAchivement.toCacheModel();
	}

	@Override
	public com.hrms.model.EmployeeAchivement toEscapedModel() {
		return new EmployeeAchivementWrapper(_employeeAchivement.toEscapedModel());
	}

	@Override
	public com.hrms.model.EmployeeAchivement toUnescapedModel() {
		return new EmployeeAchivementWrapper(_employeeAchivement.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _employeeAchivement.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _employeeAchivement.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_employeeAchivement.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof EmployeeAchivementWrapper)) {
			return false;
		}

		EmployeeAchivementWrapper employeeAchivementWrapper = (EmployeeAchivementWrapper)obj;

		if (Validator.equals(_employeeAchivement,
					employeeAchivementWrapper._employeeAchivement)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public EmployeeAchivement getWrappedEmployeeAchivement() {
		return _employeeAchivement;
	}

	@Override
	public EmployeeAchivement getWrappedModel() {
		return _employeeAchivement;
	}

	@Override
	public void resetOriginalValues() {
		_employeeAchivement.resetOriginalValues();
	}

	private EmployeeAchivement _employeeAchivement;
}