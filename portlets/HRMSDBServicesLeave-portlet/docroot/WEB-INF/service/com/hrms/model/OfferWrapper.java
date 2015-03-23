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
 * This class is a wrapper for {@link Offer}.
 * </p>
 *
 * @author yashpalsinh
 * @see Offer
 * @generated
 */
public class OfferWrapper implements Offer, ModelWrapper<Offer> {
	public OfferWrapper(Offer offer) {
		_offer = offer;
	}

	@Override
	public Class<?> getModelClass() {
		return Offer.class;
	}

	@Override
	public String getModelClassName() {
		return Offer.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("OferrId", getOferrId());
		attributes.put("candidateId", getCandidateId());
		attributes.put("employeeDepartmentId", getEmployeeDepartmentId());
		attributes.put("employeeDesignationId", getEmployeeDesignationId());
		attributes.put("employeeTypeId", getEmployeeTypeId());
		attributes.put("salary", getSalary());
		attributes.put("joiningDate", getJoiningDate());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("createBy", getCreateBy());
		attributes.put("modifiedBy", getModifiedBy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long OferrId = (Long)attributes.get("OferrId");

		if (OferrId != null) {
			setOferrId(OferrId);
		}

		Long candidateId = (Long)attributes.get("candidateId");

		if (candidateId != null) {
			setCandidateId(candidateId);
		}

		Long employeeDepartmentId = (Long)attributes.get("employeeDepartmentId");

		if (employeeDepartmentId != null) {
			setEmployeeDepartmentId(employeeDepartmentId);
		}

		Long employeeDesignationId = (Long)attributes.get(
				"employeeDesignationId");

		if (employeeDesignationId != null) {
			setEmployeeDesignationId(employeeDesignationId);
		}

		Long employeeTypeId = (Long)attributes.get("employeeTypeId");

		if (employeeTypeId != null) {
			setEmployeeTypeId(employeeTypeId);
		}

		Long salary = (Long)attributes.get("salary");

		if (salary != null) {
			setSalary(salary);
		}

		Date joiningDate = (Date)attributes.get("joiningDate");

		if (joiningDate != null) {
			setJoiningDate(joiningDate);
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
	* Returns the primary key of this offer.
	*
	* @return the primary key of this offer
	*/
	@Override
	public long getPrimaryKey() {
		return _offer.getPrimaryKey();
	}

	/**
	* Sets the primary key of this offer.
	*
	* @param primaryKey the primary key of this offer
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_offer.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the oferr ID of this offer.
	*
	* @return the oferr ID of this offer
	*/
	@Override
	public long getOferrId() {
		return _offer.getOferrId();
	}

	/**
	* Sets the oferr ID of this offer.
	*
	* @param OferrId the oferr ID of this offer
	*/
	@Override
	public void setOferrId(long OferrId) {
		_offer.setOferrId(OferrId);
	}

	/**
	* Returns the candidate ID of this offer.
	*
	* @return the candidate ID of this offer
	*/
	@Override
	public long getCandidateId() {
		return _offer.getCandidateId();
	}

	/**
	* Sets the candidate ID of this offer.
	*
	* @param candidateId the candidate ID of this offer
	*/
	@Override
	public void setCandidateId(long candidateId) {
		_offer.setCandidateId(candidateId);
	}

	/**
	* Returns the employee department ID of this offer.
	*
	* @return the employee department ID of this offer
	*/
	@Override
	public long getEmployeeDepartmentId() {
		return _offer.getEmployeeDepartmentId();
	}

	/**
	* Sets the employee department ID of this offer.
	*
	* @param employeeDepartmentId the employee department ID of this offer
	*/
	@Override
	public void setEmployeeDepartmentId(long employeeDepartmentId) {
		_offer.setEmployeeDepartmentId(employeeDepartmentId);
	}

	/**
	* Returns the employee designation ID of this offer.
	*
	* @return the employee designation ID of this offer
	*/
	@Override
	public long getEmployeeDesignationId() {
		return _offer.getEmployeeDesignationId();
	}

	/**
	* Sets the employee designation ID of this offer.
	*
	* @param employeeDesignationId the employee designation ID of this offer
	*/
	@Override
	public void setEmployeeDesignationId(long employeeDesignationId) {
		_offer.setEmployeeDesignationId(employeeDesignationId);
	}

	/**
	* Returns the employee type ID of this offer.
	*
	* @return the employee type ID of this offer
	*/
	@Override
	public long getEmployeeTypeId() {
		return _offer.getEmployeeTypeId();
	}

	/**
	* Sets the employee type ID of this offer.
	*
	* @param employeeTypeId the employee type ID of this offer
	*/
	@Override
	public void setEmployeeTypeId(long employeeTypeId) {
		_offer.setEmployeeTypeId(employeeTypeId);
	}

	/**
	* Returns the salary of this offer.
	*
	* @return the salary of this offer
	*/
	@Override
	public long getSalary() {
		return _offer.getSalary();
	}

	/**
	* Sets the salary of this offer.
	*
	* @param salary the salary of this offer
	*/
	@Override
	public void setSalary(long salary) {
		_offer.setSalary(salary);
	}

	/**
	* Returns the joining date of this offer.
	*
	* @return the joining date of this offer
	*/
	@Override
	public java.util.Date getJoiningDate() {
		return _offer.getJoiningDate();
	}

	/**
	* Sets the joining date of this offer.
	*
	* @param joiningDate the joining date of this offer
	*/
	@Override
	public void setJoiningDate(java.util.Date joiningDate) {
		_offer.setJoiningDate(joiningDate);
	}

	/**
	* Returns the create date of this offer.
	*
	* @return the create date of this offer
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _offer.getCreateDate();
	}

	/**
	* Sets the create date of this offer.
	*
	* @param createDate the create date of this offer
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_offer.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this offer.
	*
	* @return the modified date of this offer
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _offer.getModifiedDate();
	}

	/**
	* Sets the modified date of this offer.
	*
	* @param modifiedDate the modified date of this offer
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_offer.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the create by of this offer.
	*
	* @return the create by of this offer
	*/
	@Override
	public long getCreateBy() {
		return _offer.getCreateBy();
	}

	/**
	* Sets the create by of this offer.
	*
	* @param createBy the create by of this offer
	*/
	@Override
	public void setCreateBy(long createBy) {
		_offer.setCreateBy(createBy);
	}

	/**
	* Returns the modified by of this offer.
	*
	* @return the modified by of this offer
	*/
	@Override
	public long getModifiedBy() {
		return _offer.getModifiedBy();
	}

	/**
	* Sets the modified by of this offer.
	*
	* @param modifiedBy the modified by of this offer
	*/
	@Override
	public void setModifiedBy(long modifiedBy) {
		_offer.setModifiedBy(modifiedBy);
	}

	@Override
	public boolean isNew() {
		return _offer.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_offer.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _offer.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_offer.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _offer.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _offer.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_offer.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _offer.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_offer.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_offer.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_offer.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new OfferWrapper((Offer)_offer.clone());
	}

	@Override
	public int compareTo(com.hrms.model.Offer offer) {
		return _offer.compareTo(offer);
	}

	@Override
	public int hashCode() {
		return _offer.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.hrms.model.Offer> toCacheModel() {
		return _offer.toCacheModel();
	}

	@Override
	public com.hrms.model.Offer toEscapedModel() {
		return new OfferWrapper(_offer.toEscapedModel());
	}

	@Override
	public com.hrms.model.Offer toUnescapedModel() {
		return new OfferWrapper(_offer.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _offer.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _offer.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_offer.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof OfferWrapper)) {
			return false;
		}

		OfferWrapper offerWrapper = (OfferWrapper)obj;

		if (Validator.equals(_offer, offerWrapper._offer)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Offer getWrappedOffer() {
		return _offer;
	}

	@Override
	public Offer getWrappedModel() {
		return _offer;
	}

	@Override
	public void resetOriginalValues() {
		_offer.resetOriginalValues();
	}

	private Offer _offer;
}