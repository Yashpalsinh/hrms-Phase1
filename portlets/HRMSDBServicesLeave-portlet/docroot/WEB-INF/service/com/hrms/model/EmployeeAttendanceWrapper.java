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
 * This class is a wrapper for {@link EmployeeAttendance}.
 * </p>
 *
 * @author yashpalsinh
 * @see EmployeeAttendance
 * @generated
 */
public class EmployeeAttendanceWrapper implements EmployeeAttendance,
	ModelWrapper<EmployeeAttendance> {
	public EmployeeAttendanceWrapper(EmployeeAttendance employeeAttendance) {
		_employeeAttendance = employeeAttendance;
	}

	@Override
	public Class<?> getModelClass() {
		return EmployeeAttendance.class;
	}

	@Override
	public String getModelClassName() {
		return EmployeeAttendance.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("attendanceId", getAttendanceId());
		attributes.put("userId", getUserId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("attendanceDate", getAttendanceDate());
		attributes.put("signinTime", getSigninTime());
		attributes.put("signoutTime", getSignoutTime());
		attributes.put("totalTime", getTotalTime());
		attributes.put("approved", getApproved());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("createBy", getCreateBy());
		attributes.put("modifiedBy", getModifiedBy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long attendanceId = (Long)attributes.get("attendanceId");

		if (attendanceId != null) {
			setAttendanceId(attendanceId);
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

		Date attendanceDate = (Date)attributes.get("attendanceDate");

		if (attendanceDate != null) {
			setAttendanceDate(attendanceDate);
		}

		Date signinTime = (Date)attributes.get("signinTime");

		if (signinTime != null) {
			setSigninTime(signinTime);
		}

		Date signoutTime = (Date)attributes.get("signoutTime");

		if (signoutTime != null) {
			setSignoutTime(signoutTime);
		}

		Date totalTime = (Date)attributes.get("totalTime");

		if (totalTime != null) {
			setTotalTime(totalTime);
		}

		Boolean approved = (Boolean)attributes.get("approved");

		if (approved != null) {
			setApproved(approved);
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
	* Returns the primary key of this employee attendance.
	*
	* @return the primary key of this employee attendance
	*/
	@Override
	public long getPrimaryKey() {
		return _employeeAttendance.getPrimaryKey();
	}

	/**
	* Sets the primary key of this employee attendance.
	*
	* @param primaryKey the primary key of this employee attendance
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_employeeAttendance.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the attendance ID of this employee attendance.
	*
	* @return the attendance ID of this employee attendance
	*/
	@Override
	public long getAttendanceId() {
		return _employeeAttendance.getAttendanceId();
	}

	/**
	* Sets the attendance ID of this employee attendance.
	*
	* @param attendanceId the attendance ID of this employee attendance
	*/
	@Override
	public void setAttendanceId(long attendanceId) {
		_employeeAttendance.setAttendanceId(attendanceId);
	}

	/**
	* Returns the user ID of this employee attendance.
	*
	* @return the user ID of this employee attendance
	*/
	@Override
	public long getUserId() {
		return _employeeAttendance.getUserId();
	}

	/**
	* Sets the user ID of this employee attendance.
	*
	* @param userId the user ID of this employee attendance
	*/
	@Override
	public void setUserId(long userId) {
		_employeeAttendance.setUserId(userId);
	}

	/**
	* Returns the user uuid of this employee attendance.
	*
	* @return the user uuid of this employee attendance
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employeeAttendance.getUserUuid();
	}

	/**
	* Sets the user uuid of this employee attendance.
	*
	* @param userUuid the user uuid of this employee attendance
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_employeeAttendance.setUserUuid(userUuid);
	}

	/**
	* Returns the group ID of this employee attendance.
	*
	* @return the group ID of this employee attendance
	*/
	@Override
	public long getGroupId() {
		return _employeeAttendance.getGroupId();
	}

	/**
	* Sets the group ID of this employee attendance.
	*
	* @param groupId the group ID of this employee attendance
	*/
	@Override
	public void setGroupId(long groupId) {
		_employeeAttendance.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this employee attendance.
	*
	* @return the company ID of this employee attendance
	*/
	@Override
	public long getCompanyId() {
		return _employeeAttendance.getCompanyId();
	}

	/**
	* Sets the company ID of this employee attendance.
	*
	* @param companyId the company ID of this employee attendance
	*/
	@Override
	public void setCompanyId(long companyId) {
		_employeeAttendance.setCompanyId(companyId);
	}

	/**
	* Returns the attendance date of this employee attendance.
	*
	* @return the attendance date of this employee attendance
	*/
	@Override
	public java.util.Date getAttendanceDate() {
		return _employeeAttendance.getAttendanceDate();
	}

	/**
	* Sets the attendance date of this employee attendance.
	*
	* @param attendanceDate the attendance date of this employee attendance
	*/
	@Override
	public void setAttendanceDate(java.util.Date attendanceDate) {
		_employeeAttendance.setAttendanceDate(attendanceDate);
	}

	/**
	* Returns the signin time of this employee attendance.
	*
	* @return the signin time of this employee attendance
	*/
	@Override
	public java.util.Date getSigninTime() {
		return _employeeAttendance.getSigninTime();
	}

	/**
	* Sets the signin time of this employee attendance.
	*
	* @param signinTime the signin time of this employee attendance
	*/
	@Override
	public void setSigninTime(java.util.Date signinTime) {
		_employeeAttendance.setSigninTime(signinTime);
	}

	/**
	* Returns the signout time of this employee attendance.
	*
	* @return the signout time of this employee attendance
	*/
	@Override
	public java.util.Date getSignoutTime() {
		return _employeeAttendance.getSignoutTime();
	}

	/**
	* Sets the signout time of this employee attendance.
	*
	* @param signoutTime the signout time of this employee attendance
	*/
	@Override
	public void setSignoutTime(java.util.Date signoutTime) {
		_employeeAttendance.setSignoutTime(signoutTime);
	}

	/**
	* Returns the total time of this employee attendance.
	*
	* @return the total time of this employee attendance
	*/
	@Override
	public java.util.Date getTotalTime() {
		return _employeeAttendance.getTotalTime();
	}

	/**
	* Sets the total time of this employee attendance.
	*
	* @param totalTime the total time of this employee attendance
	*/
	@Override
	public void setTotalTime(java.util.Date totalTime) {
		_employeeAttendance.setTotalTime(totalTime);
	}

	/**
	* Returns the approved of this employee attendance.
	*
	* @return the approved of this employee attendance
	*/
	@Override
	public boolean getApproved() {
		return _employeeAttendance.getApproved();
	}

	/**
	* Returns <code>true</code> if this employee attendance is approved.
	*
	* @return <code>true</code> if this employee attendance is approved; <code>false</code> otherwise
	*/
	@Override
	public boolean isApproved() {
		return _employeeAttendance.isApproved();
	}

	/**
	* Sets whether this employee attendance is approved.
	*
	* @param approved the approved of this employee attendance
	*/
	@Override
	public void setApproved(boolean approved) {
		_employeeAttendance.setApproved(approved);
	}

	/**
	* Returns the create date of this employee attendance.
	*
	* @return the create date of this employee attendance
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _employeeAttendance.getCreateDate();
	}

	/**
	* Sets the create date of this employee attendance.
	*
	* @param createDate the create date of this employee attendance
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_employeeAttendance.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this employee attendance.
	*
	* @return the modified date of this employee attendance
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _employeeAttendance.getModifiedDate();
	}

	/**
	* Sets the modified date of this employee attendance.
	*
	* @param modifiedDate the modified date of this employee attendance
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_employeeAttendance.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the create by of this employee attendance.
	*
	* @return the create by of this employee attendance
	*/
	@Override
	public long getCreateBy() {
		return _employeeAttendance.getCreateBy();
	}

	/**
	* Sets the create by of this employee attendance.
	*
	* @param createBy the create by of this employee attendance
	*/
	@Override
	public void setCreateBy(long createBy) {
		_employeeAttendance.setCreateBy(createBy);
	}

	/**
	* Returns the modified by of this employee attendance.
	*
	* @return the modified by of this employee attendance
	*/
	@Override
	public long getModifiedBy() {
		return _employeeAttendance.getModifiedBy();
	}

	/**
	* Sets the modified by of this employee attendance.
	*
	* @param modifiedBy the modified by of this employee attendance
	*/
	@Override
	public void setModifiedBy(long modifiedBy) {
		_employeeAttendance.setModifiedBy(modifiedBy);
	}

	@Override
	public boolean isNew() {
		return _employeeAttendance.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_employeeAttendance.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _employeeAttendance.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_employeeAttendance.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _employeeAttendance.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _employeeAttendance.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_employeeAttendance.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _employeeAttendance.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_employeeAttendance.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_employeeAttendance.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_employeeAttendance.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new EmployeeAttendanceWrapper((EmployeeAttendance)_employeeAttendance.clone());
	}

	@Override
	public int compareTo(com.hrms.model.EmployeeAttendance employeeAttendance) {
		return _employeeAttendance.compareTo(employeeAttendance);
	}

	@Override
	public int hashCode() {
		return _employeeAttendance.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.hrms.model.EmployeeAttendance> toCacheModel() {
		return _employeeAttendance.toCacheModel();
	}

	@Override
	public com.hrms.model.EmployeeAttendance toEscapedModel() {
		return new EmployeeAttendanceWrapper(_employeeAttendance.toEscapedModel());
	}

	@Override
	public com.hrms.model.EmployeeAttendance toUnescapedModel() {
		return new EmployeeAttendanceWrapper(_employeeAttendance.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _employeeAttendance.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _employeeAttendance.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_employeeAttendance.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof EmployeeAttendanceWrapper)) {
			return false;
		}

		EmployeeAttendanceWrapper employeeAttendanceWrapper = (EmployeeAttendanceWrapper)obj;

		if (Validator.equals(_employeeAttendance,
					employeeAttendanceWrapper._employeeAttendance)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public EmployeeAttendance getWrappedEmployeeAttendance() {
		return _employeeAttendance;
	}

	@Override
	public EmployeeAttendance getWrappedModel() {
		return _employeeAttendance;
	}

	@Override
	public void resetOriginalValues() {
		_employeeAttendance.resetOriginalValues();
	}

	private EmployeeAttendance _employeeAttendance;
}