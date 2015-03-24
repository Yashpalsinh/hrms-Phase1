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
 * This class is a wrapper for {@link EmployeeLeave}.
 * </p>
 *
 * @author bhavik
 * @see EmployeeLeave
 * @generated
 */
public class EmployeeLeaveWrapper implements EmployeeLeave,
	ModelWrapper<EmployeeLeave> {
	public EmployeeLeaveWrapper(EmployeeLeave employeeLeave) {
		_employeeLeave = employeeLeave;
	}

	@Override
	public Class<?> getModelClass() {
		return EmployeeLeave.class;
	}

	@Override
	public String getModelClassName() {
		return EmployeeLeave.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("employeeLeaveId", getEmployeeLeaveId());
		attributes.put("userId", getUserId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("year", getYear());
		attributes.put("leavesCarriedOver", getLeavesCarriedOver());
		attributes.put("leavesTakenThisYear", getLeavesTakenThisYear());
		attributes.put("remainingLeaves", getRemainingLeaves());
		attributes.put("leaveId", getLeaveId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("createBy", getCreateBy());
		attributes.put("modifiedBy", getModifiedBy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long employeeLeaveId = (Long)attributes.get("employeeLeaveId");

		if (employeeLeaveId != null) {
			setEmployeeLeaveId(employeeLeaveId);
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

		Integer year = (Integer)attributes.get("year");

		if (year != null) {
			setYear(year);
		}

		Integer leavesCarriedOver = (Integer)attributes.get("leavesCarriedOver");

		if (leavesCarriedOver != null) {
			setLeavesCarriedOver(leavesCarriedOver);
		}

		Integer leavesTakenThisYear = (Integer)attributes.get(
				"leavesTakenThisYear");

		if (leavesTakenThisYear != null) {
			setLeavesTakenThisYear(leavesTakenThisYear);
		}

		Integer remainingLeaves = (Integer)attributes.get("remainingLeaves");

		if (remainingLeaves != null) {
			setRemainingLeaves(remainingLeaves);
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
	* Returns the primary key of this employee leave.
	*
	* @return the primary key of this employee leave
	*/
	@Override
	public long getPrimaryKey() {
		return _employeeLeave.getPrimaryKey();
	}

	/**
	* Sets the primary key of this employee leave.
	*
	* @param primaryKey the primary key of this employee leave
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_employeeLeave.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the employee leave ID of this employee leave.
	*
	* @return the employee leave ID of this employee leave
	*/
	@Override
	public long getEmployeeLeaveId() {
		return _employeeLeave.getEmployeeLeaveId();
	}

	/**
	* Sets the employee leave ID of this employee leave.
	*
	* @param employeeLeaveId the employee leave ID of this employee leave
	*/
	@Override
	public void setEmployeeLeaveId(long employeeLeaveId) {
		_employeeLeave.setEmployeeLeaveId(employeeLeaveId);
	}

	/**
	* Returns the user ID of this employee leave.
	*
	* @return the user ID of this employee leave
	*/
	@Override
	public long getUserId() {
		return _employeeLeave.getUserId();
	}

	/**
	* Sets the user ID of this employee leave.
	*
	* @param userId the user ID of this employee leave
	*/
	@Override
	public void setUserId(long userId) {
		_employeeLeave.setUserId(userId);
	}

	/**
	* Returns the user uuid of this employee leave.
	*
	* @return the user uuid of this employee leave
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employeeLeave.getUserUuid();
	}

	/**
	* Sets the user uuid of this employee leave.
	*
	* @param userUuid the user uuid of this employee leave
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_employeeLeave.setUserUuid(userUuid);
	}

	/**
	* Returns the group ID of this employee leave.
	*
	* @return the group ID of this employee leave
	*/
	@Override
	public long getGroupId() {
		return _employeeLeave.getGroupId();
	}

	/**
	* Sets the group ID of this employee leave.
	*
	* @param groupId the group ID of this employee leave
	*/
	@Override
	public void setGroupId(long groupId) {
		_employeeLeave.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this employee leave.
	*
	* @return the company ID of this employee leave
	*/
	@Override
	public long getCompanyId() {
		return _employeeLeave.getCompanyId();
	}

	/**
	* Sets the company ID of this employee leave.
	*
	* @param companyId the company ID of this employee leave
	*/
	@Override
	public void setCompanyId(long companyId) {
		_employeeLeave.setCompanyId(companyId);
	}

	/**
	* Returns the year of this employee leave.
	*
	* @return the year of this employee leave
	*/
	@Override
	public int getYear() {
		return _employeeLeave.getYear();
	}

	/**
	* Sets the year of this employee leave.
	*
	* @param year the year of this employee leave
	*/
	@Override
	public void setYear(int year) {
		_employeeLeave.setYear(year);
	}

	/**
	* Returns the leaves carried over of this employee leave.
	*
	* @return the leaves carried over of this employee leave
	*/
	@Override
	public int getLeavesCarriedOver() {
		return _employeeLeave.getLeavesCarriedOver();
	}

	/**
	* Sets the leaves carried over of this employee leave.
	*
	* @param leavesCarriedOver the leaves carried over of this employee leave
	*/
	@Override
	public void setLeavesCarriedOver(int leavesCarriedOver) {
		_employeeLeave.setLeavesCarriedOver(leavesCarriedOver);
	}

	/**
	* Returns the leaves taken this year of this employee leave.
	*
	* @return the leaves taken this year of this employee leave
	*/
	@Override
	public int getLeavesTakenThisYear() {
		return _employeeLeave.getLeavesTakenThisYear();
	}

	/**
	* Sets the leaves taken this year of this employee leave.
	*
	* @param leavesTakenThisYear the leaves taken this year of this employee leave
	*/
	@Override
	public void setLeavesTakenThisYear(int leavesTakenThisYear) {
		_employeeLeave.setLeavesTakenThisYear(leavesTakenThisYear);
	}

	/**
	* Returns the remaining leaves of this employee leave.
	*
	* @return the remaining leaves of this employee leave
	*/
	@Override
	public int getRemainingLeaves() {
		return _employeeLeave.getRemainingLeaves();
	}

	/**
	* Sets the remaining leaves of this employee leave.
	*
	* @param remainingLeaves the remaining leaves of this employee leave
	*/
	@Override
	public void setRemainingLeaves(int remainingLeaves) {
		_employeeLeave.setRemainingLeaves(remainingLeaves);
	}

	/**
	* Returns the leave ID of this employee leave.
	*
	* @return the leave ID of this employee leave
	*/
	@Override
	public long getLeaveId() {
		return _employeeLeave.getLeaveId();
	}

	/**
	* Sets the leave ID of this employee leave.
	*
	* @param leaveId the leave ID of this employee leave
	*/
	@Override
	public void setLeaveId(long leaveId) {
		_employeeLeave.setLeaveId(leaveId);
	}

	/**
	* Returns the create date of this employee leave.
	*
	* @return the create date of this employee leave
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _employeeLeave.getCreateDate();
	}

	/**
	* Sets the create date of this employee leave.
	*
	* @param createDate the create date of this employee leave
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_employeeLeave.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this employee leave.
	*
	* @return the modified date of this employee leave
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _employeeLeave.getModifiedDate();
	}

	/**
	* Sets the modified date of this employee leave.
	*
	* @param modifiedDate the modified date of this employee leave
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_employeeLeave.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the create by of this employee leave.
	*
	* @return the create by of this employee leave
	*/
	@Override
	public long getCreateBy() {
		return _employeeLeave.getCreateBy();
	}

	/**
	* Sets the create by of this employee leave.
	*
	* @param createBy the create by of this employee leave
	*/
	@Override
	public void setCreateBy(long createBy) {
		_employeeLeave.setCreateBy(createBy);
	}

	/**
	* Returns the modified by of this employee leave.
	*
	* @return the modified by of this employee leave
	*/
	@Override
	public long getModifiedBy() {
		return _employeeLeave.getModifiedBy();
	}

	/**
	* Sets the modified by of this employee leave.
	*
	* @param modifiedBy the modified by of this employee leave
	*/
	@Override
	public void setModifiedBy(long modifiedBy) {
		_employeeLeave.setModifiedBy(modifiedBy);
	}

	@Override
	public boolean isNew() {
		return _employeeLeave.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_employeeLeave.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _employeeLeave.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_employeeLeave.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _employeeLeave.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _employeeLeave.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_employeeLeave.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _employeeLeave.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_employeeLeave.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_employeeLeave.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_employeeLeave.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new EmployeeLeaveWrapper((EmployeeLeave)_employeeLeave.clone());
	}

	@Override
	public int compareTo(com.hrms.model.EmployeeLeave employeeLeave) {
		return _employeeLeave.compareTo(employeeLeave);
	}

	@Override
	public int hashCode() {
		return _employeeLeave.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.hrms.model.EmployeeLeave> toCacheModel() {
		return _employeeLeave.toCacheModel();
	}

	@Override
	public com.hrms.model.EmployeeLeave toEscapedModel() {
		return new EmployeeLeaveWrapper(_employeeLeave.toEscapedModel());
	}

	@Override
	public com.hrms.model.EmployeeLeave toUnescapedModel() {
		return new EmployeeLeaveWrapper(_employeeLeave.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _employeeLeave.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _employeeLeave.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_employeeLeave.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof EmployeeLeaveWrapper)) {
			return false;
		}

		EmployeeLeaveWrapper employeeLeaveWrapper = (EmployeeLeaveWrapper)obj;

		if (Validator.equals(_employeeLeave, employeeLeaveWrapper._employeeLeave)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public EmployeeLeave getWrappedEmployeeLeave() {
		return _employeeLeave;
	}

	@Override
	public EmployeeLeave getWrappedModel() {
		return _employeeLeave;
	}

	@Override
	public void resetOriginalValues() {
		_employeeLeave.resetOriginalValues();
	}

	private EmployeeLeave _employeeLeave;
}