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

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link EmployeeType}.
 * </p>
 *
 * @author bhavik
 * @see EmployeeType
 * @generated
 */
public class EmployeeTypeWrapper implements EmployeeType,
	ModelWrapper<EmployeeType> {
	public EmployeeTypeWrapper(EmployeeType employeeType) {
		_employeeType = employeeType;
	}

	@Override
	public Class<?> getModelClass() {
		return EmployeeType.class;
	}

	@Override
	public String getModelClassName() {
		return EmployeeType.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("employeeTypeId", getEmployeeTypeId());
		attributes.put("employeeTypeName", getEmployeeTypeName());
		attributes.put("status", getStatus());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long employeeTypeId = (Long)attributes.get("employeeTypeId");

		if (employeeTypeId != null) {
			setEmployeeTypeId(employeeTypeId);
		}

		String employeeTypeName = (String)attributes.get("employeeTypeName");

		if (employeeTypeName != null) {
			setEmployeeTypeName(employeeTypeName);
		}

		Boolean status = (Boolean)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}
	}

	/**
	* Returns the primary key of this employee type.
	*
	* @return the primary key of this employee type
	*/
	@Override
	public long getPrimaryKey() {
		return _employeeType.getPrimaryKey();
	}

	/**
	* Sets the primary key of this employee type.
	*
	* @param primaryKey the primary key of this employee type
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_employeeType.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the employee type ID of this employee type.
	*
	* @return the employee type ID of this employee type
	*/
	@Override
	public long getEmployeeTypeId() {
		return _employeeType.getEmployeeTypeId();
	}

	/**
	* Sets the employee type ID of this employee type.
	*
	* @param employeeTypeId the employee type ID of this employee type
	*/
	@Override
	public void setEmployeeTypeId(long employeeTypeId) {
		_employeeType.setEmployeeTypeId(employeeTypeId);
	}

	/**
	* Returns the employee type name of this employee type.
	*
	* @return the employee type name of this employee type
	*/
	@Override
	public java.lang.String getEmployeeTypeName() {
		return _employeeType.getEmployeeTypeName();
	}

	/**
	* Sets the employee type name of this employee type.
	*
	* @param employeeTypeName the employee type name of this employee type
	*/
	@Override
	public void setEmployeeTypeName(java.lang.String employeeTypeName) {
		_employeeType.setEmployeeTypeName(employeeTypeName);
	}

	/**
	* Returns the status of this employee type.
	*
	* @return the status of this employee type
	*/
	@Override
	public boolean getStatus() {
		return _employeeType.getStatus();
	}

	/**
	* Returns <code>true</code> if this employee type is status.
	*
	* @return <code>true</code> if this employee type is status; <code>false</code> otherwise
	*/
	@Override
	public boolean isStatus() {
		return _employeeType.isStatus();
	}

	/**
	* Sets whether this employee type is status.
	*
	* @param status the status of this employee type
	*/
	@Override
	public void setStatus(boolean status) {
		_employeeType.setStatus(status);
	}

	@Override
	public boolean isNew() {
		return _employeeType.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_employeeType.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _employeeType.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_employeeType.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _employeeType.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _employeeType.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_employeeType.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _employeeType.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_employeeType.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_employeeType.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_employeeType.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new EmployeeTypeWrapper((EmployeeType)_employeeType.clone());
	}

	@Override
	public int compareTo(com.hrms.model.EmployeeType employeeType) {
		return _employeeType.compareTo(employeeType);
	}

	@Override
	public int hashCode() {
		return _employeeType.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.hrms.model.EmployeeType> toCacheModel() {
		return _employeeType.toCacheModel();
	}

	@Override
	public com.hrms.model.EmployeeType toEscapedModel() {
		return new EmployeeTypeWrapper(_employeeType.toEscapedModel());
	}

	@Override
	public com.hrms.model.EmployeeType toUnescapedModel() {
		return new EmployeeTypeWrapper(_employeeType.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _employeeType.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _employeeType.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_employeeType.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof EmployeeTypeWrapper)) {
			return false;
		}

		EmployeeTypeWrapper employeeTypeWrapper = (EmployeeTypeWrapper)obj;

		if (Validator.equals(_employeeType, employeeTypeWrapper._employeeType)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public EmployeeType getWrappedEmployeeType() {
		return _employeeType;
	}

	@Override
	public EmployeeType getWrappedModel() {
		return _employeeType;
	}

	@Override
	public void resetOriginalValues() {
		_employeeType.resetOriginalValues();
	}

	private EmployeeType _employeeType;
}