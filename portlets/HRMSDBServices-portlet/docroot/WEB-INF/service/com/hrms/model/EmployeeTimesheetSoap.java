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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.hrms.service.http.EmployeeTimesheetServiceSoap}.
 *
 * @author yashpalsinh
 * @see com.hrms.service.http.EmployeeTimesheetServiceSoap
 * @generated
 */
public class EmployeeTimesheetSoap implements Serializable {
	public static EmployeeTimesheetSoap toSoapModel(EmployeeTimesheet model) {
		EmployeeTimesheetSoap soapModel = new EmployeeTimesheetSoap();

		soapModel.setTimesheetId(model.getTimesheetId());
		soapModel.setUserId(model.getUserId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setTaskTitle(model.getTaskTitle());
		soapModel.setTaskDescription(model.getTaskDescription());
		soapModel.setTaskFileId(model.getTaskFileId());
		soapModel.setTaskFilePath(model.getTaskFilePath());
		soapModel.setTaskStarttime(model.getTaskStarttime());
		soapModel.setTaskEndtime(model.getTaskEndtime());
		soapModel.setTaskDate(model.getTaskDate());
		soapModel.setDuration(model.getDuration());
		soapModel.setTaskCompleted(model.getTaskCompleted());
		soapModel.setBillable(model.getBillable());
		soapModel.setBilled(model.getBilled());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setCreateBy(model.getCreateBy());
		soapModel.setModifiedBy(model.getModifiedBy());

		return soapModel;
	}

	public static EmployeeTimesheetSoap[] toSoapModels(
		EmployeeTimesheet[] models) {
		EmployeeTimesheetSoap[] soapModels = new EmployeeTimesheetSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static EmployeeTimesheetSoap[][] toSoapModels(
		EmployeeTimesheet[][] models) {
		EmployeeTimesheetSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new EmployeeTimesheetSoap[models.length][models[0].length];
		}
		else {
			soapModels = new EmployeeTimesheetSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static EmployeeTimesheetSoap[] toSoapModels(
		List<EmployeeTimesheet> models) {
		List<EmployeeTimesheetSoap> soapModels = new ArrayList<EmployeeTimesheetSoap>(models.size());

		for (EmployeeTimesheet model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new EmployeeTimesheetSoap[soapModels.size()]);
	}

	public EmployeeTimesheetSoap() {
	}

	public long getPrimaryKey() {
		return _timesheetId;
	}

	public void setPrimaryKey(long pk) {
		setTimesheetId(pk);
	}

	public long getTimesheetId() {
		return _timesheetId;
	}

	public void setTimesheetId(long timesheetId) {
		_timesheetId = timesheetId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public String getTaskTitle() {
		return _taskTitle;
	}

	public void setTaskTitle(String taskTitle) {
		_taskTitle = taskTitle;
	}

	public String getTaskDescription() {
		return _taskDescription;
	}

	public void setTaskDescription(String taskDescription) {
		_taskDescription = taskDescription;
	}

	public long getTaskFileId() {
		return _taskFileId;
	}

	public void setTaskFileId(long taskFileId) {
		_taskFileId = taskFileId;
	}

	public String getTaskFilePath() {
		return _taskFilePath;
	}

	public void setTaskFilePath(String taskFilePath) {
		_taskFilePath = taskFilePath;
	}

	public Date getTaskStarttime() {
		return _taskStarttime;
	}

	public void setTaskStarttime(Date taskStarttime) {
		_taskStarttime = taskStarttime;
	}

	public Date getTaskEndtime() {
		return _taskEndtime;
	}

	public void setTaskEndtime(Date taskEndtime) {
		_taskEndtime = taskEndtime;
	}

	public Date getTaskDate() {
		return _taskDate;
	}

	public void setTaskDate(Date taskDate) {
		_taskDate = taskDate;
	}

	public Date getDuration() {
		return _duration;
	}

	public void setDuration(Date duration) {
		_duration = duration;
	}

	public boolean getTaskCompleted() {
		return _taskCompleted;
	}

	public boolean isTaskCompleted() {
		return _taskCompleted;
	}

	public void setTaskCompleted(boolean taskCompleted) {
		_taskCompleted = taskCompleted;
	}

	public boolean getBillable() {
		return _billable;
	}

	public boolean isBillable() {
		return _billable;
	}

	public void setBillable(boolean billable) {
		_billable = billable;
	}

	public boolean getBilled() {
		return _billed;
	}

	public boolean isBilled() {
		return _billed;
	}

	public void setBilled(boolean billed) {
		_billed = billed;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public long getCreateBy() {
		return _createBy;
	}

	public void setCreateBy(long createBy) {
		_createBy = createBy;
	}

	public long getModifiedBy() {
		return _modifiedBy;
	}

	public void setModifiedBy(long modifiedBy) {
		_modifiedBy = modifiedBy;
	}

	private long _timesheetId;
	private long _userId;
	private long _groupId;
	private long _companyId;
	private String _taskTitle;
	private String _taskDescription;
	private long _taskFileId;
	private String _taskFilePath;
	private Date _taskStarttime;
	private Date _taskEndtime;
	private Date _taskDate;
	private Date _duration;
	private boolean _taskCompleted;
	private boolean _billable;
	private boolean _billed;
	private Date _createDate;
	private Date _modifiedDate;
	private long _createBy;
	private long _modifiedBy;
}