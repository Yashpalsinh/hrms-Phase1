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
 * This class is a wrapper for {@link EmployeeSubDepartment}.
 * </p>
 *
 * @author yashpalsinh
 * @see EmployeeSubDepartment
 * @generated
 */
public class EmployeeSubDepartmentWrapper implements EmployeeSubDepartment,
	ModelWrapper<EmployeeSubDepartment> {
	public EmployeeSubDepartmentWrapper(
		EmployeeSubDepartment employeeSubDepartment) {
		_employeeSubDepartment = employeeSubDepartment;
	}

	@Override
	public Class<?> getModelClass() {
		return EmployeeSubDepartment.class;
	}

	@Override
	public String getModelClassName() {
		return EmployeeSubDepartment.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("employeeSubDepartmentId", getEmployeeSubDepartmentId());
		attributes.put("subDepartmentName", getSubDepartmentName());
		attributes.put("employeeDepartmentId", getEmployeeDepartmentId());
		attributes.put("status", getStatus());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long employeeSubDepartmentId = (Long)attributes.get(
				"employeeSubDepartmentId");

		if (employeeSubDepartmentId != null) {
			setEmployeeSubDepartmentId(employeeSubDepartmentId);
		}

		String subDepartmentName = (String)attributes.get("subDepartmentName");

		if (subDepartmentName != null) {
			setSubDepartmentName(subDepartmentName);
		}

		Long employeeDepartmentId = (Long)attributes.get("employeeDepartmentId");

		if (employeeDepartmentId != null) {
			setEmployeeDepartmentId(employeeDepartmentId);
		}

		Boolean status = (Boolean)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}
	}

	/**
	* Returns the primary key of this employee sub department.
	*
	* @return the primary key of this employee sub department
	*/
	@Override
	public long getPrimaryKey() {
		return _employeeSubDepartment.getPrimaryKey();
	}

	/**
	* Sets the primary key of this employee sub department.
	*
	* @param primaryKey the primary key of this employee sub department
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_employeeSubDepartment.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the employee sub department ID of this employee sub department.
	*
	* @return the employee sub department ID of this employee sub department
	*/
	@Override
	public long getEmployeeSubDepartmentId() {
		return _employeeSubDepartment.getEmployeeSubDepartmentId();
	}

	/**
	* Sets the employee sub department ID of this employee sub department.
	*
	* @param employeeSubDepartmentId the employee sub department ID of this employee sub department
	*/
	@Override
	public void setEmployeeSubDepartmentId(long employeeSubDepartmentId) {
		_employeeSubDepartment.setEmployeeSubDepartmentId(employeeSubDepartmentId);
	}

	/**
	* Returns the sub department name of this employee sub department.
	*
	* @return the sub department name of this employee sub department
	*/
	@Override
	public java.lang.String getSubDepartmentName() {
		return _employeeSubDepartment.getSubDepartmentName();
	}

	/**
	* Sets the sub department name of this employee sub department.
	*
	* @param subDepartmentName the sub department name of this employee sub department
	*/
	@Override
	public void setSubDepartmentName(java.lang.String subDepartmentName) {
		_employeeSubDepartment.setSubDepartmentName(subDepartmentName);
	}

	/**
	* Returns the employee department ID of this employee sub department.
	*
	* @return the employee department ID of this employee sub department
	*/
	@Override
	public long getEmployeeDepartmentId() {
		return _employeeSubDepartment.getEmployeeDepartmentId();
	}

	/**
	* Sets the employee department ID of this employee sub department.
	*
	* @param employeeDepartmentId the employee department ID of this employee sub department
	*/
	@Override
	public void setEmployeeDepartmentId(long employeeDepartmentId) {
		_employeeSubDepartment.setEmployeeDepartmentId(employeeDepartmentId);
	}

	/**
	* Returns the status of this employee sub department.
	*
	* @return the status of this employee sub department
	*/
	@Override
	public boolean getStatus() {
		return _employeeSubDepartment.getStatus();
	}

	/**
	* Returns <code>true</code> if this employee sub department is status.
	*
	* @return <code>true</code> if this employee sub department is status; <code>false</code> otherwise
	*/
	@Override
	public boolean isStatus() {
		return _employeeSubDepartment.isStatus();
	}

	/**
	* Sets whether this employee sub department is status.
	*
	* @param status the status of this employee sub department
	*/
	@Override
	public void setStatus(boolean status) {
		_employeeSubDepartment.setStatus(status);
	}

	@Override
	public boolean isNew() {
		return _employeeSubDepartment.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_employeeSubDepartment.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _employeeSubDepartment.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_employeeSubDepartment.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _employeeSubDepartment.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _employeeSubDepartment.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_employeeSubDepartment.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _employeeSubDepartment.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_employeeSubDepartment.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_employeeSubDepartment.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_employeeSubDepartment.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new EmployeeSubDepartmentWrapper((EmployeeSubDepartment)_employeeSubDepartment.clone());
	}

	@Override
	public int compareTo(
		com.hrms.model.EmployeeSubDepartment employeeSubDepartment) {
		return _employeeSubDepartment.compareTo(employeeSubDepartment);
	}

	@Override
	public int hashCode() {
		return _employeeSubDepartment.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.hrms.model.EmployeeSubDepartment> toCacheModel() {
		return _employeeSubDepartment.toCacheModel();
	}

	@Override
	public com.hrms.model.EmployeeSubDepartment toEscapedModel() {
		return new EmployeeSubDepartmentWrapper(_employeeSubDepartment.toEscapedModel());
	}

	@Override
	public com.hrms.model.EmployeeSubDepartment toUnescapedModel() {
		return new EmployeeSubDepartmentWrapper(_employeeSubDepartment.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _employeeSubDepartment.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _employeeSubDepartment.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_employeeSubDepartment.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof EmployeeSubDepartmentWrapper)) {
			return false;
		}

		EmployeeSubDepartmentWrapper employeeSubDepartmentWrapper = (EmployeeSubDepartmentWrapper)obj;

		if (Validator.equals(_employeeSubDepartment,
					employeeSubDepartmentWrapper._employeeSubDepartment)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public EmployeeSubDepartment getWrappedEmployeeSubDepartment() {
		return _employeeSubDepartment;
	}

	@Override
	public EmployeeSubDepartment getWrappedModel() {
		return _employeeSubDepartment;
	}

	@Override
	public void resetOriginalValues() {
		_employeeSubDepartment.resetOriginalValues();
	}

	private EmployeeSubDepartment _employeeSubDepartment;
}