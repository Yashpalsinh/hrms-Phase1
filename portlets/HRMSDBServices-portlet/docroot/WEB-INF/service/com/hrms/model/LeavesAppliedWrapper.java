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
 * This class is a wrapper for {@link LeavesApplied}.
 * </p>
 *
 * @author bhavik
 * @see LeavesApplied
 * @generated
 */
public class LeavesAppliedWrapper implements LeavesApplied,
	ModelWrapper<LeavesApplied> {
	public LeavesAppliedWrapper(LeavesApplied leavesApplied) {
		_leavesApplied = leavesApplied;
	}

	@Override
	public Class<?> getModelClass() {
		return LeavesApplied.class;
	}

	@Override
	public String getModelClassName() {
		return LeavesApplied.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("appliedLeaveId", getAppliedLeaveId());
		attributes.put("userId", getUserId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("employeeName", getEmployeeName());
		attributes.put("leaveName", getLeaveName());
		attributes.put("entitlement", getEntitlement());
		attributes.put("leaveDuration", getLeaveDuration());
		attributes.put("leaveFrom", getLeaveFrom());
		attributes.put("leaveTo", getLeaveTo());
		attributes.put("leaveDate", getLeaveDate());
		attributes.put("leavePeriod", getLeavePeriod());
		attributes.put("approvalStatus", getApprovalStatus());
		attributes.put("leaveId", getLeaveId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("createBy", getCreateBy());
		attributes.put("modifiedBy", getModifiedBy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long appliedLeaveId = (Long)attributes.get("appliedLeaveId");

		if (appliedLeaveId != null) {
			setAppliedLeaveId(appliedLeaveId);
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

		String employeeName = (String)attributes.get("employeeName");

		if (employeeName != null) {
			setEmployeeName(employeeName);
		}

		String leaveName = (String)attributes.get("leaveName");

		if (leaveName != null) {
			setLeaveName(leaveName);
		}

		String entitlement = (String)attributes.get("entitlement");

		if (entitlement != null) {
			setEntitlement(entitlement);
		}

		String leaveDuration = (String)attributes.get("leaveDuration");

		if (leaveDuration != null) {
			setLeaveDuration(leaveDuration);
		}

		Date leaveFrom = (Date)attributes.get("leaveFrom");

		if (leaveFrom != null) {
			setLeaveFrom(leaveFrom);
		}

		Date leaveTo = (Date)attributes.get("leaveTo");

		if (leaveTo != null) {
			setLeaveTo(leaveTo);
		}

		Date leaveDate = (Date)attributes.get("leaveDate");

		if (leaveDate != null) {
			setLeaveDate(leaveDate);
		}

		String leavePeriod = (String)attributes.get("leavePeriod");

		if (leavePeriod != null) {
			setLeavePeriod(leavePeriod);
		}

		String approvalStatus = (String)attributes.get("approvalStatus");

		if (approvalStatus != null) {
			setApprovalStatus(approvalStatus);
		}

		Long leaveId = (Long)attributes.get("leaveId");

		if (leaveId != null) {
			setLeaveId(leaveId);
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
	* Returns the primary key of this leaves applied.
	*
	* @return the primary key of this leaves applied
	*/
	@Override
	public long getPrimaryKey() {
		return _leavesApplied.getPrimaryKey();
	}

	/**
	* Sets the primary key of this leaves applied.
	*
	* @param primaryKey the primary key of this leaves applied
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_leavesApplied.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the applied leave ID of this leaves applied.
	*
	* @return the applied leave ID of this leaves applied
	*/
	@Override
	public long getAppliedLeaveId() {
		return _leavesApplied.getAppliedLeaveId();
	}

	/**
	* Sets the applied leave ID of this leaves applied.
	*
	* @param appliedLeaveId the applied leave ID of this leaves applied
	*/
	@Override
	public void setAppliedLeaveId(long appliedLeaveId) {
		_leavesApplied.setAppliedLeaveId(appliedLeaveId);
	}

	/**
	* Returns the user ID of this leaves applied.
	*
	* @return the user ID of this leaves applied
	*/
	@Override
	public long getUserId() {
		return _leavesApplied.getUserId();
	}

	/**
	* Sets the user ID of this leaves applied.
	*
	* @param userId the user ID of this leaves applied
	*/
	@Override
	public void setUserId(long userId) {
		_leavesApplied.setUserId(userId);
	}

	/**
	* Returns the user uuid of this leaves applied.
	*
	* @return the user uuid of this leaves applied
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _leavesApplied.getUserUuid();
	}

	/**
	* Sets the user uuid of this leaves applied.
	*
	* @param userUuid the user uuid of this leaves applied
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_leavesApplied.setUserUuid(userUuid);
	}

	/**
	* Returns the group ID of this leaves applied.
	*
	* @return the group ID of this leaves applied
	*/
	@Override
	public long getGroupId() {
		return _leavesApplied.getGroupId();
	}

	/**
	* Sets the group ID of this leaves applied.
	*
	* @param groupId the group ID of this leaves applied
	*/
	@Override
	public void setGroupId(long groupId) {
		_leavesApplied.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this leaves applied.
	*
	* @return the company ID of this leaves applied
	*/
	@Override
	public long getCompanyId() {
		return _leavesApplied.getCompanyId();
	}

	/**
	* Sets the company ID of this leaves applied.
	*
	* @param companyId the company ID of this leaves applied
	*/
	@Override
	public void setCompanyId(long companyId) {
		_leavesApplied.setCompanyId(companyId);
	}

	/**
	* Returns the employee name of this leaves applied.
	*
	* @return the employee name of this leaves applied
	*/
	@Override
	public java.lang.String getEmployeeName() {
		return _leavesApplied.getEmployeeName();
	}

	/**
	* Sets the employee name of this leaves applied.
	*
	* @param employeeName the employee name of this leaves applied
	*/
	@Override
	public void setEmployeeName(java.lang.String employeeName) {
		_leavesApplied.setEmployeeName(employeeName);
	}

	/**
	* Returns the leave name of this leaves applied.
	*
	* @return the leave name of this leaves applied
	*/
	@Override
	public java.lang.String getLeaveName() {
		return _leavesApplied.getLeaveName();
	}

	/**
	* Sets the leave name of this leaves applied.
	*
	* @param leaveName the leave name of this leaves applied
	*/
	@Override
	public void setLeaveName(java.lang.String leaveName) {
		_leavesApplied.setLeaveName(leaveName);
	}

	/**
	* Returns the entitlement of this leaves applied.
	*
	* @return the entitlement of this leaves applied
	*/
	@Override
	public java.lang.String getEntitlement() {
		return _leavesApplied.getEntitlement();
	}

	/**
	* Sets the entitlement of this leaves applied.
	*
	* @param entitlement the entitlement of this leaves applied
	*/
	@Override
	public void setEntitlement(java.lang.String entitlement) {
		_leavesApplied.setEntitlement(entitlement);
	}

	/**
	* Returns the leave duration of this leaves applied.
	*
	* @return the leave duration of this leaves applied
	*/
	@Override
	public java.lang.String getLeaveDuration() {
		return _leavesApplied.getLeaveDuration();
	}

	/**
	* Sets the leave duration of this leaves applied.
	*
	* @param leaveDuration the leave duration of this leaves applied
	*/
	@Override
	public void setLeaveDuration(java.lang.String leaveDuration) {
		_leavesApplied.setLeaveDuration(leaveDuration);
	}

	/**
	* Returns the leave from of this leaves applied.
	*
	* @return the leave from of this leaves applied
	*/
	@Override
	public java.util.Date getLeaveFrom() {
		return _leavesApplied.getLeaveFrom();
	}

	/**
	* Sets the leave from of this leaves applied.
	*
	* @param leaveFrom the leave from of this leaves applied
	*/
	@Override
	public void setLeaveFrom(java.util.Date leaveFrom) {
		_leavesApplied.setLeaveFrom(leaveFrom);
	}

	/**
	* Returns the leave to of this leaves applied.
	*
	* @return the leave to of this leaves applied
	*/
	@Override
	public java.util.Date getLeaveTo() {
		return _leavesApplied.getLeaveTo();
	}

	/**
	* Sets the leave to of this leaves applied.
	*
	* @param leaveTo the leave to of this leaves applied
	*/
	@Override
	public void setLeaveTo(java.util.Date leaveTo) {
		_leavesApplied.setLeaveTo(leaveTo);
	}

	/**
	* Returns the leave date of this leaves applied.
	*
	* @return the leave date of this leaves applied
	*/
	@Override
	public java.util.Date getLeaveDate() {
		return _leavesApplied.getLeaveDate();
	}

	/**
	* Sets the leave date of this leaves applied.
	*
	* @param leaveDate the leave date of this leaves applied
	*/
	@Override
	public void setLeaveDate(java.util.Date leaveDate) {
		_leavesApplied.setLeaveDate(leaveDate);
	}

	/**
	* Returns the leave period of this leaves applied.
	*
	* @return the leave period of this leaves applied
	*/
	@Override
	public java.lang.String getLeavePeriod() {
		return _leavesApplied.getLeavePeriod();
	}

	/**
	* Sets the leave period of this leaves applied.
	*
	* @param leavePeriod the leave period of this leaves applied
	*/
	@Override
	public void setLeavePeriod(java.lang.String leavePeriod) {
		_leavesApplied.setLeavePeriod(leavePeriod);
	}

	/**
	* Returns the approval status of this leaves applied.
	*
	* @return the approval status of this leaves applied
	*/
	@Override
	public java.lang.String getApprovalStatus() {
		return _leavesApplied.getApprovalStatus();
	}

	/**
	* Sets the approval status of this leaves applied.
	*
	* @param approvalStatus the approval status of this leaves applied
	*/
	@Override
	public void setApprovalStatus(java.lang.String approvalStatus) {
		_leavesApplied.setApprovalStatus(approvalStatus);
	}

	/**
	* Returns the leave ID of this leaves applied.
	*
	* @return the leave ID of this leaves applied
	*/
	@Override
	public long getLeaveId() {
		return _leavesApplied.getLeaveId();
	}

	/**
	* Sets the leave ID of this leaves applied.
	*
	* @param leaveId the leave ID of this leaves applied
	*/
	@Override
	public void setLeaveId(long leaveId) {
		_leavesApplied.setLeaveId(leaveId);
	}

	/**
	* Returns the create date of this leaves applied.
	*
	* @return the create date of this leaves applied
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _leavesApplied.getCreateDate();
	}

	/**
	* Sets the create date of this leaves applied.
	*
	* @param createDate the create date of this leaves applied
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_leavesApplied.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this leaves applied.
	*
	* @return the modified date of this leaves applied
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _leavesApplied.getModifiedDate();
	}

	/**
	* Sets the modified date of this leaves applied.
	*
	* @param modifiedDate the modified date of this leaves applied
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_leavesApplied.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the create by of this leaves applied.
	*
	* @return the create by of this leaves applied
	*/
	@Override
	public long getCreateBy() {
		return _leavesApplied.getCreateBy();
	}

	/**
	* Sets the create by of this leaves applied.
	*
	* @param createBy the create by of this leaves applied
	*/
	@Override
	public void setCreateBy(long createBy) {
		_leavesApplied.setCreateBy(createBy);
	}

	/**
	* Returns the modified by of this leaves applied.
	*
	* @return the modified by of this leaves applied
	*/
	@Override
	public long getModifiedBy() {
		return _leavesApplied.getModifiedBy();
	}

	/**
	* Sets the modified by of this leaves applied.
	*
	* @param modifiedBy the modified by of this leaves applied
	*/
	@Override
	public void setModifiedBy(long modifiedBy) {
		_leavesApplied.setModifiedBy(modifiedBy);
	}

	@Override
	public boolean isNew() {
		return _leavesApplied.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_leavesApplied.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _leavesApplied.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_leavesApplied.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _leavesApplied.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _leavesApplied.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_leavesApplied.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _leavesApplied.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_leavesApplied.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_leavesApplied.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_leavesApplied.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new LeavesAppliedWrapper((LeavesApplied)_leavesApplied.clone());
	}

	@Override
	public int compareTo(com.hrms.model.LeavesApplied leavesApplied) {
		return _leavesApplied.compareTo(leavesApplied);
	}

	@Override
	public int hashCode() {
		return _leavesApplied.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.hrms.model.LeavesApplied> toCacheModel() {
		return _leavesApplied.toCacheModel();
	}

	@Override
	public com.hrms.model.LeavesApplied toEscapedModel() {
		return new LeavesAppliedWrapper(_leavesApplied.toEscapedModel());
	}

	@Override
	public com.hrms.model.LeavesApplied toUnescapedModel() {
		return new LeavesAppliedWrapper(_leavesApplied.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _leavesApplied.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _leavesApplied.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_leavesApplied.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof LeavesAppliedWrapper)) {
			return false;
		}

		LeavesAppliedWrapper leavesAppliedWrapper = (LeavesAppliedWrapper)obj;

		if (Validator.equals(_leavesApplied, leavesAppliedWrapper._leavesApplied)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public LeavesApplied getWrappedLeavesApplied() {
		return _leavesApplied;
	}

	@Override
	public LeavesApplied getWrappedModel() {
		return _leavesApplied;
	}

	@Override
	public void resetOriginalValues() {
		_leavesApplied.resetOriginalValues();
	}

	private LeavesApplied _leavesApplied;
}