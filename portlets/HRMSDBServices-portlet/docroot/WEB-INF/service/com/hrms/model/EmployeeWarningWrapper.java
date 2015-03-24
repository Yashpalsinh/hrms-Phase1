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
 * This class is a wrapper for {@link EmployeeWarning}.
 * </p>
 *
 * @author bhavik
 * @see EmployeeWarning
 * @generated
 */
public class EmployeeWarningWrapper implements EmployeeWarning,
	ModelWrapper<EmployeeWarning> {
	public EmployeeWarningWrapper(EmployeeWarning employeeWarning) {
		_employeeWarning = employeeWarning;
	}

	@Override
	public Class<?> getModelClass() {
		return EmployeeWarning.class;
	}

	@Override
	public String getModelClassName() {
		return EmployeeWarning.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("employeeWarningId", getEmployeeWarningId());
		attributes.put("warningTo", getWarningTo());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("warningDate", getWarningDate());
		attributes.put("warningSubject", getWarningSubject());
		attributes.put("status", getStatus());
		attributes.put("warningBy", getWarningBy());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("createBy", getCreateBy());
		attributes.put("modifiedBy", getModifiedBy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long employeeWarningId = (Long)attributes.get("employeeWarningId");

		if (employeeWarningId != null) {
			setEmployeeWarningId(employeeWarningId);
		}

		Long warningTo = (Long)attributes.get("warningTo");

		if (warningTo != null) {
			setWarningTo(warningTo);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Date warningDate = (Date)attributes.get("warningDate");

		if (warningDate != null) {
			setWarningDate(warningDate);
		}

		String warningSubject = (String)attributes.get("warningSubject");

		if (warningSubject != null) {
			setWarningSubject(warningSubject);
		}

		Boolean status = (Boolean)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Long warningBy = (Long)attributes.get("warningBy");

		if (warningBy != null) {
			setWarningBy(warningBy);
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
	* Returns the primary key of this employee warning.
	*
	* @return the primary key of this employee warning
	*/
	@Override
	public long getPrimaryKey() {
		return _employeeWarning.getPrimaryKey();
	}

	/**
	* Sets the primary key of this employee warning.
	*
	* @param primaryKey the primary key of this employee warning
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_employeeWarning.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the employee warning ID of this employee warning.
	*
	* @return the employee warning ID of this employee warning
	*/
	@Override
	public long getEmployeeWarningId() {
		return _employeeWarning.getEmployeeWarningId();
	}

	/**
	* Sets the employee warning ID of this employee warning.
	*
	* @param employeeWarningId the employee warning ID of this employee warning
	*/
	@Override
	public void setEmployeeWarningId(long employeeWarningId) {
		_employeeWarning.setEmployeeWarningId(employeeWarningId);
	}

	/**
	* Returns the warning to of this employee warning.
	*
	* @return the warning to of this employee warning
	*/
	@Override
	public long getWarningTo() {
		return _employeeWarning.getWarningTo();
	}

	/**
	* Sets the warning to of this employee warning.
	*
	* @param warningTo the warning to of this employee warning
	*/
	@Override
	public void setWarningTo(long warningTo) {
		_employeeWarning.setWarningTo(warningTo);
	}

	/**
	* Returns the group ID of this employee warning.
	*
	* @return the group ID of this employee warning
	*/
	@Override
	public long getGroupId() {
		return _employeeWarning.getGroupId();
	}

	/**
	* Sets the group ID of this employee warning.
	*
	* @param groupId the group ID of this employee warning
	*/
	@Override
	public void setGroupId(long groupId) {
		_employeeWarning.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this employee warning.
	*
	* @return the company ID of this employee warning
	*/
	@Override
	public long getCompanyId() {
		return _employeeWarning.getCompanyId();
	}

	/**
	* Sets the company ID of this employee warning.
	*
	* @param companyId the company ID of this employee warning
	*/
	@Override
	public void setCompanyId(long companyId) {
		_employeeWarning.setCompanyId(companyId);
	}

	/**
	* Returns the warning date of this employee warning.
	*
	* @return the warning date of this employee warning
	*/
	@Override
	public java.util.Date getWarningDate() {
		return _employeeWarning.getWarningDate();
	}

	/**
	* Sets the warning date of this employee warning.
	*
	* @param warningDate the warning date of this employee warning
	*/
	@Override
	public void setWarningDate(java.util.Date warningDate) {
		_employeeWarning.setWarningDate(warningDate);
	}

	/**
	* Returns the warning subject of this employee warning.
	*
	* @return the warning subject of this employee warning
	*/
	@Override
	public java.lang.String getWarningSubject() {
		return _employeeWarning.getWarningSubject();
	}

	/**
	* Sets the warning subject of this employee warning.
	*
	* @param warningSubject the warning subject of this employee warning
	*/
	@Override
	public void setWarningSubject(java.lang.String warningSubject) {
		_employeeWarning.setWarningSubject(warningSubject);
	}

	/**
	* Returns the status of this employee warning.
	*
	* @return the status of this employee warning
	*/
	@Override
	public boolean getStatus() {
		return _employeeWarning.getStatus();
	}

	/**
	* Returns <code>true</code> if this employee warning is status.
	*
	* @return <code>true</code> if this employee warning is status; <code>false</code> otherwise
	*/
	@Override
	public boolean isStatus() {
		return _employeeWarning.isStatus();
	}

	/**
	* Sets whether this employee warning is status.
	*
	* @param status the status of this employee warning
	*/
	@Override
	public void setStatus(boolean status) {
		_employeeWarning.setStatus(status);
	}

	/**
	* Returns the warning by of this employee warning.
	*
	* @return the warning by of this employee warning
	*/
	@Override
	public long getWarningBy() {
		return _employeeWarning.getWarningBy();
	}

	/**
	* Sets the warning by of this employee warning.
	*
	* @param warningBy the warning by of this employee warning
	*/
	@Override
	public void setWarningBy(long warningBy) {
		_employeeWarning.setWarningBy(warningBy);
	}

	/**
	* Returns the modified date of this employee warning.
	*
	* @return the modified date of this employee warning
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _employeeWarning.getModifiedDate();
	}

	/**
	* Sets the modified date of this employee warning.
	*
	* @param modifiedDate the modified date of this employee warning
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_employeeWarning.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the create by of this employee warning.
	*
	* @return the create by of this employee warning
	*/
	@Override
	public long getCreateBy() {
		return _employeeWarning.getCreateBy();
	}

	/**
	* Sets the create by of this employee warning.
	*
	* @param createBy the create by of this employee warning
	*/
	@Override
	public void setCreateBy(long createBy) {
		_employeeWarning.setCreateBy(createBy);
	}

	/**
	* Returns the modified by of this employee warning.
	*
	* @return the modified by of this employee warning
	*/
	@Override
	public long getModifiedBy() {
		return _employeeWarning.getModifiedBy();
	}

	/**
	* Sets the modified by of this employee warning.
	*
	* @param modifiedBy the modified by of this employee warning
	*/
	@Override
	public void setModifiedBy(long modifiedBy) {
		_employeeWarning.setModifiedBy(modifiedBy);
	}

	@Override
	public boolean isNew() {
		return _employeeWarning.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_employeeWarning.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _employeeWarning.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_employeeWarning.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _employeeWarning.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _employeeWarning.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_employeeWarning.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _employeeWarning.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_employeeWarning.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_employeeWarning.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_employeeWarning.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new EmployeeWarningWrapper((EmployeeWarning)_employeeWarning.clone());
	}

	@Override
	public int compareTo(com.hrms.model.EmployeeWarning employeeWarning) {
		return _employeeWarning.compareTo(employeeWarning);
	}

	@Override
	public int hashCode() {
		return _employeeWarning.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.hrms.model.EmployeeWarning> toCacheModel() {
		return _employeeWarning.toCacheModel();
	}

	@Override
	public com.hrms.model.EmployeeWarning toEscapedModel() {
		return new EmployeeWarningWrapper(_employeeWarning.toEscapedModel());
	}

	@Override
	public com.hrms.model.EmployeeWarning toUnescapedModel() {
		return new EmployeeWarningWrapper(_employeeWarning.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _employeeWarning.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _employeeWarning.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_employeeWarning.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof EmployeeWarningWrapper)) {
			return false;
		}

		EmployeeWarningWrapper employeeWarningWrapper = (EmployeeWarningWrapper)obj;

		if (Validator.equals(_employeeWarning,
					employeeWarningWrapper._employeeWarning)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public EmployeeWarning getWrappedEmployeeWarning() {
		return _employeeWarning;
	}

	@Override
	public EmployeeWarning getWrappedModel() {
		return _employeeWarning;
	}

	@Override
	public void resetOriginalValues() {
		_employeeWarning.resetOriginalValues();
	}

	private EmployeeWarning _employeeWarning;
}