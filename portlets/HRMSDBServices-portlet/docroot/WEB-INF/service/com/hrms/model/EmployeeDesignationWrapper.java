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
 * This class is a wrapper for {@link EmployeeDesignation}.
 * </p>
 *
 * @author yashpalsinh
 * @see EmployeeDesignation
 * @generated
 */
public class EmployeeDesignationWrapper implements EmployeeDesignation,
	ModelWrapper<EmployeeDesignation> {
	public EmployeeDesignationWrapper(EmployeeDesignation employeeDesignation) {
		_employeeDesignation = employeeDesignation;
	}

	@Override
	public Class<?> getModelClass() {
		return EmployeeDesignation.class;
	}

	@Override
	public String getModelClassName() {
		return EmployeeDesignation.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("employeeDesignationId", getEmployeeDesignationId());
		attributes.put("designationName", getDesignationName());
		attributes.put("status", getStatus());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long employeeDesignationId = (Long)attributes.get(
				"employeeDesignationId");

		if (employeeDesignationId != null) {
			setEmployeeDesignationId(employeeDesignationId);
		}

		String designationName = (String)attributes.get("designationName");

		if (designationName != null) {
			setDesignationName(designationName);
		}

		Boolean status = (Boolean)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}
	}

	/**
	* Returns the primary key of this employee designation.
	*
	* @return the primary key of this employee designation
	*/
	@Override
	public long getPrimaryKey() {
		return _employeeDesignation.getPrimaryKey();
	}

	/**
	* Sets the primary key of this employee designation.
	*
	* @param primaryKey the primary key of this employee designation
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_employeeDesignation.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the employee designation ID of this employee designation.
	*
	* @return the employee designation ID of this employee designation
	*/
	@Override
	public long getEmployeeDesignationId() {
		return _employeeDesignation.getEmployeeDesignationId();
	}

	/**
	* Sets the employee designation ID of this employee designation.
	*
	* @param employeeDesignationId the employee designation ID of this employee designation
	*/
	@Override
	public void setEmployeeDesignationId(long employeeDesignationId) {
		_employeeDesignation.setEmployeeDesignationId(employeeDesignationId);
	}

	/**
	* Returns the designation name of this employee designation.
	*
	* @return the designation name of this employee designation
	*/
	@Override
	public java.lang.String getDesignationName() {
		return _employeeDesignation.getDesignationName();
	}

	/**
	* Sets the designation name of this employee designation.
	*
	* @param designationName the designation name of this employee designation
	*/
	@Override
	public void setDesignationName(java.lang.String designationName) {
		_employeeDesignation.setDesignationName(designationName);
	}

	/**
	* Returns the status of this employee designation.
	*
	* @return the status of this employee designation
	*/
	@Override
	public boolean getStatus() {
		return _employeeDesignation.getStatus();
	}

	/**
	* Returns <code>true</code> if this employee designation is status.
	*
	* @return <code>true</code> if this employee designation is status; <code>false</code> otherwise
	*/
	@Override
	public boolean isStatus() {
		return _employeeDesignation.isStatus();
	}

	/**
	* Sets whether this employee designation is status.
	*
	* @param status the status of this employee designation
	*/
	@Override
	public void setStatus(boolean status) {
		_employeeDesignation.setStatus(status);
	}

	@Override
	public boolean isNew() {
		return _employeeDesignation.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_employeeDesignation.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _employeeDesignation.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_employeeDesignation.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _employeeDesignation.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _employeeDesignation.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_employeeDesignation.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _employeeDesignation.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_employeeDesignation.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_employeeDesignation.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_employeeDesignation.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new EmployeeDesignationWrapper((EmployeeDesignation)_employeeDesignation.clone());
	}

	@Override
	public int compareTo(com.hrms.model.EmployeeDesignation employeeDesignation) {
		return _employeeDesignation.compareTo(employeeDesignation);
	}

	@Override
	public int hashCode() {
		return _employeeDesignation.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.hrms.model.EmployeeDesignation> toCacheModel() {
		return _employeeDesignation.toCacheModel();
	}

	@Override
	public com.hrms.model.EmployeeDesignation toEscapedModel() {
		return new EmployeeDesignationWrapper(_employeeDesignation.toEscapedModel());
	}

	@Override
	public com.hrms.model.EmployeeDesignation toUnescapedModel() {
		return new EmployeeDesignationWrapper(_employeeDesignation.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _employeeDesignation.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _employeeDesignation.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_employeeDesignation.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof EmployeeDesignationWrapper)) {
			return false;
		}

		EmployeeDesignationWrapper employeeDesignationWrapper = (EmployeeDesignationWrapper)obj;

		if (Validator.equals(_employeeDesignation,
					employeeDesignationWrapper._employeeDesignation)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public EmployeeDesignation getWrappedEmployeeDesignation() {
		return _employeeDesignation;
	}

	@Override
	public EmployeeDesignation getWrappedModel() {
		return _employeeDesignation;
	}

	@Override
	public void resetOriginalValues() {
		_employeeDesignation.resetOriginalValues();
	}

	private EmployeeDesignation _employeeDesignation;
}