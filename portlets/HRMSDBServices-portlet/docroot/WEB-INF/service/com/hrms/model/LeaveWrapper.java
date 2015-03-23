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
 * This class is a wrapper for {@link Leave}.
 * </p>
 *
 * @author yashpalsinh
 * @see Leave
 * @generated
 */
public class LeaveWrapper implements Leave, ModelWrapper<Leave> {
	public LeaveWrapper(Leave leave) {
		_leave = leave;
	}

	@Override
	public Class<?> getModelClass() {
		return Leave.class;
	}

	@Override
	public String getModelClassName() {
		return Leave.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("leaveId", getLeaveId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("leaveName", getLeaveName());
		attributes.put("leaveType", getLeaveType());
		attributes.put("leavesAllowedPerYear", getLeavesAllowedPerYear());
		attributes.put("carryOver", getCarryOver());
		attributes.put("encachement", getEncachement());
		attributes.put("Status", getStatus());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("createBy", getCreateBy());
		attributes.put("modifiedBy", getModifiedBy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long leaveId = (Long)attributes.get("leaveId");

		if (leaveId != null) {
			setLeaveId(leaveId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		String leaveName = (String)attributes.get("leaveName");

		if (leaveName != null) {
			setLeaveName(leaveName);
		}

		String leaveType = (String)attributes.get("leaveType");

		if (leaveType != null) {
			setLeaveType(leaveType);
		}

		Integer leavesAllowedPerYear = (Integer)attributes.get(
				"leavesAllowedPerYear");

		if (leavesAllowedPerYear != null) {
			setLeavesAllowedPerYear(leavesAllowedPerYear);
		}

		Boolean carryOver = (Boolean)attributes.get("carryOver");

		if (carryOver != null) {
			setCarryOver(carryOver);
		}

		Boolean encachement = (Boolean)attributes.get("encachement");

		if (encachement != null) {
			setEncachement(encachement);
		}

		Boolean Status = (Boolean)attributes.get("Status");

		if (Status != null) {
			setStatus(Status);
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
	* Returns the primary key of this leave.
	*
	* @return the primary key of this leave
	*/
	@Override
	public long getPrimaryKey() {
		return _leave.getPrimaryKey();
	}

	/**
	* Sets the primary key of this leave.
	*
	* @param primaryKey the primary key of this leave
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_leave.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the leave ID of this leave.
	*
	* @return the leave ID of this leave
	*/
	@Override
	public long getLeaveId() {
		return _leave.getLeaveId();
	}

	/**
	* Sets the leave ID of this leave.
	*
	* @param leaveId the leave ID of this leave
	*/
	@Override
	public void setLeaveId(long leaveId) {
		_leave.setLeaveId(leaveId);
	}

	/**
	* Returns the group ID of this leave.
	*
	* @return the group ID of this leave
	*/
	@Override
	public long getGroupId() {
		return _leave.getGroupId();
	}

	/**
	* Sets the group ID of this leave.
	*
	* @param groupId the group ID of this leave
	*/
	@Override
	public void setGroupId(long groupId) {
		_leave.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this leave.
	*
	* @return the company ID of this leave
	*/
	@Override
	public long getCompanyId() {
		return _leave.getCompanyId();
	}

	/**
	* Sets the company ID of this leave.
	*
	* @param companyId the company ID of this leave
	*/
	@Override
	public void setCompanyId(long companyId) {
		_leave.setCompanyId(companyId);
	}

	/**
	* Returns the leave name of this leave.
	*
	* @return the leave name of this leave
	*/
	@Override
	public java.lang.String getLeaveName() {
		return _leave.getLeaveName();
	}

	/**
	* Sets the leave name of this leave.
	*
	* @param leaveName the leave name of this leave
	*/
	@Override
	public void setLeaveName(java.lang.String leaveName) {
		_leave.setLeaveName(leaveName);
	}

	/**
	* Returns the leave type of this leave.
	*
	* @return the leave type of this leave
	*/
	@Override
	public java.lang.String getLeaveType() {
		return _leave.getLeaveType();
	}

	/**
	* Sets the leave type of this leave.
	*
	* @param leaveType the leave type of this leave
	*/
	@Override
	public void setLeaveType(java.lang.String leaveType) {
		_leave.setLeaveType(leaveType);
	}

	/**
	* Returns the leaves allowed per year of this leave.
	*
	* @return the leaves allowed per year of this leave
	*/
	@Override
	public int getLeavesAllowedPerYear() {
		return _leave.getLeavesAllowedPerYear();
	}

	/**
	* Sets the leaves allowed per year of this leave.
	*
	* @param leavesAllowedPerYear the leaves allowed per year of this leave
	*/
	@Override
	public void setLeavesAllowedPerYear(int leavesAllowedPerYear) {
		_leave.setLeavesAllowedPerYear(leavesAllowedPerYear);
	}

	/**
	* Returns the carry over of this leave.
	*
	* @return the carry over of this leave
	*/
	@Override
	public boolean getCarryOver() {
		return _leave.getCarryOver();
	}

	/**
	* Returns <code>true</code> if this leave is carry over.
	*
	* @return <code>true</code> if this leave is carry over; <code>false</code> otherwise
	*/
	@Override
	public boolean isCarryOver() {
		return _leave.isCarryOver();
	}

	/**
	* Sets whether this leave is carry over.
	*
	* @param carryOver the carry over of this leave
	*/
	@Override
	public void setCarryOver(boolean carryOver) {
		_leave.setCarryOver(carryOver);
	}

	/**
	* Returns the encachement of this leave.
	*
	* @return the encachement of this leave
	*/
	@Override
	public boolean getEncachement() {
		return _leave.getEncachement();
	}

	/**
	* Returns <code>true</code> if this leave is encachement.
	*
	* @return <code>true</code> if this leave is encachement; <code>false</code> otherwise
	*/
	@Override
	public boolean isEncachement() {
		return _leave.isEncachement();
	}

	/**
	* Sets whether this leave is encachement.
	*
	* @param encachement the encachement of this leave
	*/
	@Override
	public void setEncachement(boolean encachement) {
		_leave.setEncachement(encachement);
	}

	/**
	* Returns the status of this leave.
	*
	* @return the status of this leave
	*/
	@Override
	public boolean getStatus() {
		return _leave.getStatus();
	}

	/**
	* Returns <code>true</code> if this leave is status.
	*
	* @return <code>true</code> if this leave is status; <code>false</code> otherwise
	*/
	@Override
	public boolean isStatus() {
		return _leave.isStatus();
	}

	/**
	* Sets whether this leave is status.
	*
	* @param Status the status of this leave
	*/
	@Override
	public void setStatus(boolean Status) {
		_leave.setStatus(Status);
	}

	/**
	* Returns the create date of this leave.
	*
	* @return the create date of this leave
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _leave.getCreateDate();
	}

	/**
	* Sets the create date of this leave.
	*
	* @param createDate the create date of this leave
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_leave.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this leave.
	*
	* @return the modified date of this leave
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _leave.getModifiedDate();
	}

	/**
	* Sets the modified date of this leave.
	*
	* @param modifiedDate the modified date of this leave
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_leave.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the create by of this leave.
	*
	* @return the create by of this leave
	*/
	@Override
	public long getCreateBy() {
		return _leave.getCreateBy();
	}

	/**
	* Sets the create by of this leave.
	*
	* @param createBy the create by of this leave
	*/
	@Override
	public void setCreateBy(long createBy) {
		_leave.setCreateBy(createBy);
	}

	/**
	* Returns the modified by of this leave.
	*
	* @return the modified by of this leave
	*/
	@Override
	public long getModifiedBy() {
		return _leave.getModifiedBy();
	}

	/**
	* Sets the modified by of this leave.
	*
	* @param modifiedBy the modified by of this leave
	*/
	@Override
	public void setModifiedBy(long modifiedBy) {
		_leave.setModifiedBy(modifiedBy);
	}

	@Override
	public boolean isNew() {
		return _leave.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_leave.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _leave.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_leave.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _leave.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _leave.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_leave.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _leave.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_leave.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_leave.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_leave.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new LeaveWrapper((Leave)_leave.clone());
	}

	@Override
	public int compareTo(com.hrms.model.Leave leave) {
		return _leave.compareTo(leave);
	}

	@Override
	public int hashCode() {
		return _leave.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.hrms.model.Leave> toCacheModel() {
		return _leave.toCacheModel();
	}

	@Override
	public com.hrms.model.Leave toEscapedModel() {
		return new LeaveWrapper(_leave.toEscapedModel());
	}

	@Override
	public com.hrms.model.Leave toUnescapedModel() {
		return new LeaveWrapper(_leave.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _leave.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _leave.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_leave.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof LeaveWrapper)) {
			return false;
		}

		LeaveWrapper leaveWrapper = (LeaveWrapper)obj;

		if (Validator.equals(_leave, leaveWrapper._leave)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Leave getWrappedLeave() {
		return _leave;
	}

	@Override
	public Leave getWrappedModel() {
		return _leave;
	}

	@Override
	public void resetOriginalValues() {
		_leave.resetOriginalValues();
	}

	private Leave _leave;
}