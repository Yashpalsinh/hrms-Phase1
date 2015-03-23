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
 * This class is a wrapper for {@link EmployeeTimesheet}.
 * </p>
 *
 * @author yashpalsinh
 * @see EmployeeTimesheet
 * @generated
 */
public class EmployeeTimesheetWrapper implements EmployeeTimesheet,
	ModelWrapper<EmployeeTimesheet> {
	public EmployeeTimesheetWrapper(EmployeeTimesheet employeeTimesheet) {
		_employeeTimesheet = employeeTimesheet;
	}

	@Override
	public Class<?> getModelClass() {
		return EmployeeTimesheet.class;
	}

	@Override
	public String getModelClassName() {
		return EmployeeTimesheet.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("timesheetId", getTimesheetId());
		attributes.put("userId", getUserId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("taskTitle", getTaskTitle());
		attributes.put("taskDescription", getTaskDescription());
		attributes.put("taskFileId", getTaskFileId());
		attributes.put("taskFilePath", getTaskFilePath());
		attributes.put("taskStarttime", getTaskStarttime());
		attributes.put("taskEndtime", getTaskEndtime());
		attributes.put("taskDate", getTaskDate());
		attributes.put("duration", getDuration());
		attributes.put("taskCompleted", getTaskCompleted());
		attributes.put("billable", getBillable());
		attributes.put("billed", getBilled());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("createBy", getCreateBy());
		attributes.put("modifiedBy", getModifiedBy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long timesheetId = (Long)attributes.get("timesheetId");

		if (timesheetId != null) {
			setTimesheetId(timesheetId);
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

		String taskTitle = (String)attributes.get("taskTitle");

		if (taskTitle != null) {
			setTaskTitle(taskTitle);
		}

		String taskDescription = (String)attributes.get("taskDescription");

		if (taskDescription != null) {
			setTaskDescription(taskDescription);
		}

		Long taskFileId = (Long)attributes.get("taskFileId");

		if (taskFileId != null) {
			setTaskFileId(taskFileId);
		}

		String taskFilePath = (String)attributes.get("taskFilePath");

		if (taskFilePath != null) {
			setTaskFilePath(taskFilePath);
		}

		Date taskStarttime = (Date)attributes.get("taskStarttime");

		if (taskStarttime != null) {
			setTaskStarttime(taskStarttime);
		}

		Date taskEndtime = (Date)attributes.get("taskEndtime");

		if (taskEndtime != null) {
			setTaskEndtime(taskEndtime);
		}

		Date taskDate = (Date)attributes.get("taskDate");

		if (taskDate != null) {
			setTaskDate(taskDate);
		}

		Date duration = (Date)attributes.get("duration");

		if (duration != null) {
			setDuration(duration);
		}

		Boolean taskCompleted = (Boolean)attributes.get("taskCompleted");

		if (taskCompleted != null) {
			setTaskCompleted(taskCompleted);
		}

		Boolean billable = (Boolean)attributes.get("billable");

		if (billable != null) {
			setBillable(billable);
		}

		Boolean billed = (Boolean)attributes.get("billed");

		if (billed != null) {
			setBilled(billed);
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
	* Returns the primary key of this employee timesheet.
	*
	* @return the primary key of this employee timesheet
	*/
	@Override
	public long getPrimaryKey() {
		return _employeeTimesheet.getPrimaryKey();
	}

	/**
	* Sets the primary key of this employee timesheet.
	*
	* @param primaryKey the primary key of this employee timesheet
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_employeeTimesheet.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the timesheet ID of this employee timesheet.
	*
	* @return the timesheet ID of this employee timesheet
	*/
	@Override
	public long getTimesheetId() {
		return _employeeTimesheet.getTimesheetId();
	}

	/**
	* Sets the timesheet ID of this employee timesheet.
	*
	* @param timesheetId the timesheet ID of this employee timesheet
	*/
	@Override
	public void setTimesheetId(long timesheetId) {
		_employeeTimesheet.setTimesheetId(timesheetId);
	}

	/**
	* Returns the user ID of this employee timesheet.
	*
	* @return the user ID of this employee timesheet
	*/
	@Override
	public long getUserId() {
		return _employeeTimesheet.getUserId();
	}

	/**
	* Sets the user ID of this employee timesheet.
	*
	* @param userId the user ID of this employee timesheet
	*/
	@Override
	public void setUserId(long userId) {
		_employeeTimesheet.setUserId(userId);
	}

	/**
	* Returns the user uuid of this employee timesheet.
	*
	* @return the user uuid of this employee timesheet
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employeeTimesheet.getUserUuid();
	}

	/**
	* Sets the user uuid of this employee timesheet.
	*
	* @param userUuid the user uuid of this employee timesheet
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_employeeTimesheet.setUserUuid(userUuid);
	}

	/**
	* Returns the group ID of this employee timesheet.
	*
	* @return the group ID of this employee timesheet
	*/
	@Override
	public long getGroupId() {
		return _employeeTimesheet.getGroupId();
	}

	/**
	* Sets the group ID of this employee timesheet.
	*
	* @param groupId the group ID of this employee timesheet
	*/
	@Override
	public void setGroupId(long groupId) {
		_employeeTimesheet.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this employee timesheet.
	*
	* @return the company ID of this employee timesheet
	*/
	@Override
	public long getCompanyId() {
		return _employeeTimesheet.getCompanyId();
	}

	/**
	* Sets the company ID of this employee timesheet.
	*
	* @param companyId the company ID of this employee timesheet
	*/
	@Override
	public void setCompanyId(long companyId) {
		_employeeTimesheet.setCompanyId(companyId);
	}

	/**
	* Returns the task title of this employee timesheet.
	*
	* @return the task title of this employee timesheet
	*/
	@Override
	public java.lang.String getTaskTitle() {
		return _employeeTimesheet.getTaskTitle();
	}

	/**
	* Sets the task title of this employee timesheet.
	*
	* @param taskTitle the task title of this employee timesheet
	*/
	@Override
	public void setTaskTitle(java.lang.String taskTitle) {
		_employeeTimesheet.setTaskTitle(taskTitle);
	}

	/**
	* Returns the task description of this employee timesheet.
	*
	* @return the task description of this employee timesheet
	*/
	@Override
	public java.lang.String getTaskDescription() {
		return _employeeTimesheet.getTaskDescription();
	}

	/**
	* Sets the task description of this employee timesheet.
	*
	* @param taskDescription the task description of this employee timesheet
	*/
	@Override
	public void setTaskDescription(java.lang.String taskDescription) {
		_employeeTimesheet.setTaskDescription(taskDescription);
	}

	/**
	* Returns the task file ID of this employee timesheet.
	*
	* @return the task file ID of this employee timesheet
	*/
	@Override
	public long getTaskFileId() {
		return _employeeTimesheet.getTaskFileId();
	}

	/**
	* Sets the task file ID of this employee timesheet.
	*
	* @param taskFileId the task file ID of this employee timesheet
	*/
	@Override
	public void setTaskFileId(long taskFileId) {
		_employeeTimesheet.setTaskFileId(taskFileId);
	}

	/**
	* Returns the task file path of this employee timesheet.
	*
	* @return the task file path of this employee timesheet
	*/
	@Override
	public java.lang.String getTaskFilePath() {
		return _employeeTimesheet.getTaskFilePath();
	}

	/**
	* Sets the task file path of this employee timesheet.
	*
	* @param taskFilePath the task file path of this employee timesheet
	*/
	@Override
	public void setTaskFilePath(java.lang.String taskFilePath) {
		_employeeTimesheet.setTaskFilePath(taskFilePath);
	}

	/**
	* Returns the task starttime of this employee timesheet.
	*
	* @return the task starttime of this employee timesheet
	*/
	@Override
	public java.util.Date getTaskStarttime() {
		return _employeeTimesheet.getTaskStarttime();
	}

	/**
	* Sets the task starttime of this employee timesheet.
	*
	* @param taskStarttime the task starttime of this employee timesheet
	*/
	@Override
	public void setTaskStarttime(java.util.Date taskStarttime) {
		_employeeTimesheet.setTaskStarttime(taskStarttime);
	}

	/**
	* Returns the task endtime of this employee timesheet.
	*
	* @return the task endtime of this employee timesheet
	*/
	@Override
	public java.util.Date getTaskEndtime() {
		return _employeeTimesheet.getTaskEndtime();
	}

	/**
	* Sets the task endtime of this employee timesheet.
	*
	* @param taskEndtime the task endtime of this employee timesheet
	*/
	@Override
	public void setTaskEndtime(java.util.Date taskEndtime) {
		_employeeTimesheet.setTaskEndtime(taskEndtime);
	}

	/**
	* Returns the task date of this employee timesheet.
	*
	* @return the task date of this employee timesheet
	*/
	@Override
	public java.util.Date getTaskDate() {
		return _employeeTimesheet.getTaskDate();
	}

	/**
	* Sets the task date of this employee timesheet.
	*
	* @param taskDate the task date of this employee timesheet
	*/
	@Override
	public void setTaskDate(java.util.Date taskDate) {
		_employeeTimesheet.setTaskDate(taskDate);
	}

	/**
	* Returns the duration of this employee timesheet.
	*
	* @return the duration of this employee timesheet
	*/
	@Override
	public java.util.Date getDuration() {
		return _employeeTimesheet.getDuration();
	}

	/**
	* Sets the duration of this employee timesheet.
	*
	* @param duration the duration of this employee timesheet
	*/
	@Override
	public void setDuration(java.util.Date duration) {
		_employeeTimesheet.setDuration(duration);
	}

	/**
	* Returns the task completed of this employee timesheet.
	*
	* @return the task completed of this employee timesheet
	*/
	@Override
	public boolean getTaskCompleted() {
		return _employeeTimesheet.getTaskCompleted();
	}

	/**
	* Returns <code>true</code> if this employee timesheet is task completed.
	*
	* @return <code>true</code> if this employee timesheet is task completed; <code>false</code> otherwise
	*/
	@Override
	public boolean isTaskCompleted() {
		return _employeeTimesheet.isTaskCompleted();
	}

	/**
	* Sets whether this employee timesheet is task completed.
	*
	* @param taskCompleted the task completed of this employee timesheet
	*/
	@Override
	public void setTaskCompleted(boolean taskCompleted) {
		_employeeTimesheet.setTaskCompleted(taskCompleted);
	}

	/**
	* Returns the billable of this employee timesheet.
	*
	* @return the billable of this employee timesheet
	*/
	@Override
	public boolean getBillable() {
		return _employeeTimesheet.getBillable();
	}

	/**
	* Returns <code>true</code> if this employee timesheet is billable.
	*
	* @return <code>true</code> if this employee timesheet is billable; <code>false</code> otherwise
	*/
	@Override
	public boolean isBillable() {
		return _employeeTimesheet.isBillable();
	}

	/**
	* Sets whether this employee timesheet is billable.
	*
	* @param billable the billable of this employee timesheet
	*/
	@Override
	public void setBillable(boolean billable) {
		_employeeTimesheet.setBillable(billable);
	}

	/**
	* Returns the billed of this employee timesheet.
	*
	* @return the billed of this employee timesheet
	*/
	@Override
	public boolean getBilled() {
		return _employeeTimesheet.getBilled();
	}

	/**
	* Returns <code>true</code> if this employee timesheet is billed.
	*
	* @return <code>true</code> if this employee timesheet is billed; <code>false</code> otherwise
	*/
	@Override
	public boolean isBilled() {
		return _employeeTimesheet.isBilled();
	}

	/**
	* Sets whether this employee timesheet is billed.
	*
	* @param billed the billed of this employee timesheet
	*/
	@Override
	public void setBilled(boolean billed) {
		_employeeTimesheet.setBilled(billed);
	}

	/**
	* Returns the create date of this employee timesheet.
	*
	* @return the create date of this employee timesheet
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _employeeTimesheet.getCreateDate();
	}

	/**
	* Sets the create date of this employee timesheet.
	*
	* @param createDate the create date of this employee timesheet
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_employeeTimesheet.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this employee timesheet.
	*
	* @return the modified date of this employee timesheet
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _employeeTimesheet.getModifiedDate();
	}

	/**
	* Sets the modified date of this employee timesheet.
	*
	* @param modifiedDate the modified date of this employee timesheet
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_employeeTimesheet.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the create by of this employee timesheet.
	*
	* @return the create by of this employee timesheet
	*/
	@Override
	public long getCreateBy() {
		return _employeeTimesheet.getCreateBy();
	}

	/**
	* Sets the create by of this employee timesheet.
	*
	* @param createBy the create by of this employee timesheet
	*/
	@Override
	public void setCreateBy(long createBy) {
		_employeeTimesheet.setCreateBy(createBy);
	}

	/**
	* Returns the modified by of this employee timesheet.
	*
	* @return the modified by of this employee timesheet
	*/
	@Override
	public long getModifiedBy() {
		return _employeeTimesheet.getModifiedBy();
	}

	/**
	* Sets the modified by of this employee timesheet.
	*
	* @param modifiedBy the modified by of this employee timesheet
	*/
	@Override
	public void setModifiedBy(long modifiedBy) {
		_employeeTimesheet.setModifiedBy(modifiedBy);
	}

	@Override
	public boolean isNew() {
		return _employeeTimesheet.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_employeeTimesheet.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _employeeTimesheet.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_employeeTimesheet.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _employeeTimesheet.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _employeeTimesheet.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_employeeTimesheet.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _employeeTimesheet.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_employeeTimesheet.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_employeeTimesheet.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_employeeTimesheet.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new EmployeeTimesheetWrapper((EmployeeTimesheet)_employeeTimesheet.clone());
	}

	@Override
	public int compareTo(com.hrms.model.EmployeeTimesheet employeeTimesheet) {
		return _employeeTimesheet.compareTo(employeeTimesheet);
	}

	@Override
	public int hashCode() {
		return _employeeTimesheet.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.hrms.model.EmployeeTimesheet> toCacheModel() {
		return _employeeTimesheet.toCacheModel();
	}

	@Override
	public com.hrms.model.EmployeeTimesheet toEscapedModel() {
		return new EmployeeTimesheetWrapper(_employeeTimesheet.toEscapedModel());
	}

	@Override
	public com.hrms.model.EmployeeTimesheet toUnescapedModel() {
		return new EmployeeTimesheetWrapper(_employeeTimesheet.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _employeeTimesheet.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _employeeTimesheet.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_employeeTimesheet.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof EmployeeTimesheetWrapper)) {
			return false;
		}

		EmployeeTimesheetWrapper employeeTimesheetWrapper = (EmployeeTimesheetWrapper)obj;

		if (Validator.equals(_employeeTimesheet,
					employeeTimesheetWrapper._employeeTimesheet)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public EmployeeTimesheet getWrappedEmployeeTimesheet() {
		return _employeeTimesheet;
	}

	@Override
	public EmployeeTimesheet getWrappedModel() {
		return _employeeTimesheet;
	}

	@Override
	public void resetOriginalValues() {
		_employeeTimesheet.resetOriginalValues();
	}

	private EmployeeTimesheet _employeeTimesheet;
}