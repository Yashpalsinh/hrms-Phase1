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
 * This class is a wrapper for {@link EmployeeDepartment}.
 * </p>
 *
 * @author bhavik
 * @see EmployeeDepartment
 * @generated
 */
public class EmployeeDepartmentWrapper implements EmployeeDepartment,
	ModelWrapper<EmployeeDepartment> {
	public EmployeeDepartmentWrapper(EmployeeDepartment employeeDepartment) {
		_employeeDepartment = employeeDepartment;
	}

	@Override
	public Class<?> getModelClass() {
		return EmployeeDepartment.class;
	}

	@Override
	public String getModelClassName() {
		return EmployeeDepartment.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("employeeDepartmentId", getEmployeeDepartmentId());
		attributes.put("departmentName", getDepartmentName());
		attributes.put("status", getStatus());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long employeeDepartmentId = (Long)attributes.get("employeeDepartmentId");

		if (employeeDepartmentId != null) {
			setEmployeeDepartmentId(employeeDepartmentId);
		}

		String departmentName = (String)attributes.get("departmentName");

		if (departmentName != null) {
			setDepartmentName(departmentName);
		}

		Boolean status = (Boolean)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}
	}

	/**
	* Returns the primary key of this employee department.
	*
	* @return the primary key of this employee department
	*/
	@Override
	public long getPrimaryKey() {
		return _employeeDepartment.getPrimaryKey();
	}

	/**
	* Sets the primary key of this employee department.
	*
	* @param primaryKey the primary key of this employee department
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_employeeDepartment.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the employee department ID of this employee department.
	*
	* @return the employee department ID of this employee department
	*/
	@Override
	public long getEmployeeDepartmentId() {
		return _employeeDepartment.getEmployeeDepartmentId();
	}

	/**
	* Sets the employee department ID of this employee department.
	*
	* @param employeeDepartmentId the employee department ID of this employee department
	*/
	@Override
	public void setEmployeeDepartmentId(long employeeDepartmentId) {
		_employeeDepartment.setEmployeeDepartmentId(employeeDepartmentId);
	}

	/**
	* Returns the department name of this employee department.
	*
	* @return the department name of this employee department
	*/
	@Override
	public java.lang.String getDepartmentName() {
		return _employeeDepartment.getDepartmentName();
	}

	/**
	* Sets the department name of this employee department.
	*
	* @param departmentName the department name of this employee department
	*/
	@Override
	public void setDepartmentName(java.lang.String departmentName) {
		_employeeDepartment.setDepartmentName(departmentName);
	}

	/**
	* Returns the status of this employee department.
	*
	* @return the status of this employee department
	*/
	@Override
	public boolean getStatus() {
		return _employeeDepartment.getStatus();
	}

	/**
	* Returns <code>true</code> if this employee department is status.
	*
	* @return <code>true</code> if this employee department is status; <code>false</code> otherwise
	*/
	@Override
	public boolean isStatus() {
		return _employeeDepartment.isStatus();
	}

	/**
	* Sets whether this employee department is status.
	*
	* @param status the status of this employee department
	*/
	@Override
	public void setStatus(boolean status) {
		_employeeDepartment.setStatus(status);
	}

	@Override
	public boolean isNew() {
		return _employeeDepartment.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_employeeDepartment.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _employeeDepartment.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_employeeDepartment.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _employeeDepartment.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _employeeDepartment.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_employeeDepartment.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _employeeDepartment.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_employeeDepartment.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_employeeDepartment.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_employeeDepartment.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new EmployeeDepartmentWrapper((EmployeeDepartment)_employeeDepartment.clone());
	}

	@Override
	public int compareTo(com.hrms.model.EmployeeDepartment employeeDepartment) {
		return _employeeDepartment.compareTo(employeeDepartment);
	}

	@Override
	public int hashCode() {
		return _employeeDepartment.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.hrms.model.EmployeeDepartment> toCacheModel() {
		return _employeeDepartment.toCacheModel();
	}

	@Override
	public com.hrms.model.EmployeeDepartment toEscapedModel() {
		return new EmployeeDepartmentWrapper(_employeeDepartment.toEscapedModel());
	}

	@Override
	public com.hrms.model.EmployeeDepartment toUnescapedModel() {
		return new EmployeeDepartmentWrapper(_employeeDepartment.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _employeeDepartment.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _employeeDepartment.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_employeeDepartment.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof EmployeeDepartmentWrapper)) {
			return false;
		}

		EmployeeDepartmentWrapper employeeDepartmentWrapper = (EmployeeDepartmentWrapper)obj;

		if (Validator.equals(_employeeDepartment,
					employeeDepartmentWrapper._employeeDepartment)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public EmployeeDepartment getWrappedEmployeeDepartment() {
		return _employeeDepartment;
	}

	@Override
	public EmployeeDepartment getWrappedModel() {
		return _employeeDepartment;
	}

	@Override
	public void resetOriginalValues() {
		_employeeDepartment.resetOriginalValues();
	}

	private EmployeeDepartment _employeeDepartment;
}