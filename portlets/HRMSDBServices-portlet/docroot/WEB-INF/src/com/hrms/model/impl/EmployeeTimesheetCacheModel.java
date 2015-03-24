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

package com.hrms.model.impl;

import com.hrms.model.EmployeeTimesheet;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing EmployeeTimesheet in entity cache.
 *
 * @author bhavik
 * @see EmployeeTimesheet
 * @generated
 */
public class EmployeeTimesheetCacheModel implements CacheModel<EmployeeTimesheet>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(35);

		sb.append("{timesheetId=");
		sb.append(timesheetId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", taskTitle=");
		sb.append(taskTitle);
		sb.append(", taskDescription=");
		sb.append(taskDescription);
		sb.append(", taskStarttime=");
		sb.append(taskStarttime);
		sb.append(", taskEndtime=");
		sb.append(taskEndtime);
		sb.append(", taskDate=");
		sb.append(taskDate);
		sb.append(", duration=");
		sb.append(duration);
		sb.append(", taskCompleted=");
		sb.append(taskCompleted);
		sb.append(", billable=");
		sb.append(billable);
		sb.append(", billed=");
		sb.append(billed);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", createBy=");
		sb.append(createBy);
		sb.append(", modifiedBy=");
		sb.append(modifiedBy);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public EmployeeTimesheet toEntityModel() {
		EmployeeTimesheetImpl employeeTimesheetImpl = new EmployeeTimesheetImpl();

		employeeTimesheetImpl.setTimesheetId(timesheetId);
		employeeTimesheetImpl.setUserId(userId);
		employeeTimesheetImpl.setGroupId(groupId);
		employeeTimesheetImpl.setCompanyId(companyId);

		if (taskTitle == null) {
			employeeTimesheetImpl.setTaskTitle(StringPool.BLANK);
		}
		else {
			employeeTimesheetImpl.setTaskTitle(taskTitle);
		}

		if (taskDescription == null) {
			employeeTimesheetImpl.setTaskDescription(StringPool.BLANK);
		}
		else {
			employeeTimesheetImpl.setTaskDescription(taskDescription);
		}

		if (taskStarttime == Long.MIN_VALUE) {
			employeeTimesheetImpl.setTaskStarttime(null);
		}
		else {
			employeeTimesheetImpl.setTaskStarttime(new Date(taskStarttime));
		}

		if (taskEndtime == Long.MIN_VALUE) {
			employeeTimesheetImpl.setTaskEndtime(null);
		}
		else {
			employeeTimesheetImpl.setTaskEndtime(new Date(taskEndtime));
		}

		if (taskDate == Long.MIN_VALUE) {
			employeeTimesheetImpl.setTaskDate(null);
		}
		else {
			employeeTimesheetImpl.setTaskDate(new Date(taskDate));
		}

		if (duration == null) {
			employeeTimesheetImpl.setDuration(StringPool.BLANK);
		}
		else {
			employeeTimesheetImpl.setDuration(duration);
		}

		employeeTimesheetImpl.setTaskCompleted(taskCompleted);
		employeeTimesheetImpl.setBillable(billable);
		employeeTimesheetImpl.setBilled(billed);

		if (createDate == Long.MIN_VALUE) {
			employeeTimesheetImpl.setCreateDate(null);
		}
		else {
			employeeTimesheetImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			employeeTimesheetImpl.setModifiedDate(null);
		}
		else {
			employeeTimesheetImpl.setModifiedDate(new Date(modifiedDate));
		}

		employeeTimesheetImpl.setCreateBy(createBy);
		employeeTimesheetImpl.setModifiedBy(modifiedBy);

		employeeTimesheetImpl.resetOriginalValues();

		return employeeTimesheetImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		timesheetId = objectInput.readLong();
		userId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		taskTitle = objectInput.readUTF();
		taskDescription = objectInput.readUTF();
		taskStarttime = objectInput.readLong();
		taskEndtime = objectInput.readLong();
		taskDate = objectInput.readLong();
		duration = objectInput.readUTF();
		taskCompleted = objectInput.readBoolean();
		billable = objectInput.readBoolean();
		billed = objectInput.readBoolean();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		createBy = objectInput.readLong();
		modifiedBy = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(timesheetId);
		objectOutput.writeLong(userId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(companyId);

		if (taskTitle == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(taskTitle);
		}

		if (taskDescription == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(taskDescription);
		}

		objectOutput.writeLong(taskStarttime);
		objectOutput.writeLong(taskEndtime);
		objectOutput.writeLong(taskDate);

		if (duration == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(duration);
		}

		objectOutput.writeBoolean(taskCompleted);
		objectOutput.writeBoolean(billable);
		objectOutput.writeBoolean(billed);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
		objectOutput.writeLong(createBy);
		objectOutput.writeLong(modifiedBy);
	}

	public long timesheetId;
	public long userId;
	public long groupId;
	public long companyId;
	public String taskTitle;
	public String taskDescription;
	public long taskStarttime;
	public long taskEndtime;
	public long taskDate;
	public String duration;
	public boolean taskCompleted;
	public boolean billable;
	public boolean billed;
	public long createDate;
	public long modifiedDate;
	public long createBy;
	public long modifiedBy;
}