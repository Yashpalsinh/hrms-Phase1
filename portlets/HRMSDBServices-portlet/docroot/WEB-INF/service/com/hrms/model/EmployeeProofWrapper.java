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
 * This class is a wrapper for {@link EmployeeProof}.
 * </p>
 *
 * @author bhavik
 * @see EmployeeProof
 * @generated
 */
public class EmployeeProofWrapper implements EmployeeProof,
	ModelWrapper<EmployeeProof> {
	public EmployeeProofWrapper(EmployeeProof employeeProof) {
		_employeeProof = employeeProof;
	}

	@Override
	public Class<?> getModelClass() {
		return EmployeeProof.class;
	}

	@Override
	public String getModelClassName() {
		return EmployeeProof.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("employeeproofNo", getEmployeeproofNo());
		attributes.put("proofId", getProofId());
		attributes.put("userId", getUserId());
		attributes.put("expirationDate", getExpirationDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long employeeproofNo = (Long)attributes.get("employeeproofNo");

		if (employeeproofNo != null) {
			setEmployeeproofNo(employeeproofNo);
		}

		Long proofId = (Long)attributes.get("proofId");

		if (proofId != null) {
			setProofId(proofId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Date expirationDate = (Date)attributes.get("expirationDate");

		if (expirationDate != null) {
			setExpirationDate(expirationDate);
		}
	}

	/**
	* Returns the primary key of this employee proof.
	*
	* @return the primary key of this employee proof
	*/
	@Override
	public long getPrimaryKey() {
		return _employeeProof.getPrimaryKey();
	}

	/**
	* Sets the primary key of this employee proof.
	*
	* @param primaryKey the primary key of this employee proof
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_employeeProof.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the employeeproof no of this employee proof.
	*
	* @return the employeeproof no of this employee proof
	*/
	@Override
	public long getEmployeeproofNo() {
		return _employeeProof.getEmployeeproofNo();
	}

	/**
	* Sets the employeeproof no of this employee proof.
	*
	* @param employeeproofNo the employeeproof no of this employee proof
	*/
	@Override
	public void setEmployeeproofNo(long employeeproofNo) {
		_employeeProof.setEmployeeproofNo(employeeproofNo);
	}

	/**
	* Returns the proof ID of this employee proof.
	*
	* @return the proof ID of this employee proof
	*/
	@Override
	public long getProofId() {
		return _employeeProof.getProofId();
	}

	/**
	* Sets the proof ID of this employee proof.
	*
	* @param proofId the proof ID of this employee proof
	*/
	@Override
	public void setProofId(long proofId) {
		_employeeProof.setProofId(proofId);
	}

	/**
	* Returns the user ID of this employee proof.
	*
	* @return the user ID of this employee proof
	*/
	@Override
	public long getUserId() {
		return _employeeProof.getUserId();
	}

	/**
	* Sets the user ID of this employee proof.
	*
	* @param userId the user ID of this employee proof
	*/
	@Override
	public void setUserId(long userId) {
		_employeeProof.setUserId(userId);
	}

	/**
	* Returns the user uuid of this employee proof.
	*
	* @return the user uuid of this employee proof
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employeeProof.getUserUuid();
	}

	/**
	* Sets the user uuid of this employee proof.
	*
	* @param userUuid the user uuid of this employee proof
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_employeeProof.setUserUuid(userUuid);
	}

	/**
	* Returns the expiration date of this employee proof.
	*
	* @return the expiration date of this employee proof
	*/
	@Override
	public java.util.Date getExpirationDate() {
		return _employeeProof.getExpirationDate();
	}

	/**
	* Sets the expiration date of this employee proof.
	*
	* @param expirationDate the expiration date of this employee proof
	*/
	@Override
	public void setExpirationDate(java.util.Date expirationDate) {
		_employeeProof.setExpirationDate(expirationDate);
	}

	@Override
	public boolean isNew() {
		return _employeeProof.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_employeeProof.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _employeeProof.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_employeeProof.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _employeeProof.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _employeeProof.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_employeeProof.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _employeeProof.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_employeeProof.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_employeeProof.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_employeeProof.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new EmployeeProofWrapper((EmployeeProof)_employeeProof.clone());
	}

	@Override
	public int compareTo(com.hrms.model.EmployeeProof employeeProof) {
		return _employeeProof.compareTo(employeeProof);
	}

	@Override
	public int hashCode() {
		return _employeeProof.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.hrms.model.EmployeeProof> toCacheModel() {
		return _employeeProof.toCacheModel();
	}

	@Override
	public com.hrms.model.EmployeeProof toEscapedModel() {
		return new EmployeeProofWrapper(_employeeProof.toEscapedModel());
	}

	@Override
	public com.hrms.model.EmployeeProof toUnescapedModel() {
		return new EmployeeProofWrapper(_employeeProof.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _employeeProof.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _employeeProof.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_employeeProof.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof EmployeeProofWrapper)) {
			return false;
		}

		EmployeeProofWrapper employeeProofWrapper = (EmployeeProofWrapper)obj;

		if (Validator.equals(_employeeProof, employeeProofWrapper._employeeProof)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public EmployeeProof getWrappedEmployeeProof() {
		return _employeeProof;
	}

	@Override
	public EmployeeProof getWrappedModel() {
		return _employeeProof;
	}

	@Override
	public void resetOriginalValues() {
		_employeeProof.resetOriginalValues();
	}

	private EmployeeProof _employeeProof;
}