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

import com.hrms.model.EmployeeLeave;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing EmployeeLeave in entity cache.
 *
 * @author bhavik
 * @see EmployeeLeave
 * @generated
 */
public class EmployeeLeaveCacheModel implements CacheModel<EmployeeLeave>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{employeeLeaveId=");
		sb.append(employeeLeaveId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", year=");
		sb.append(year);
		sb.append(", leavesCarriedOver=");
		sb.append(leavesCarriedOver);
		sb.append(", leavesTakenThisYear=");
		sb.append(leavesTakenThisYear);
		sb.append(", remainingLeaves=");
		sb.append(remainingLeaves);
		sb.append(", leaveId=");
		sb.append(leaveId);
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
	public EmployeeLeave toEntityModel() {
		EmployeeLeaveImpl employeeLeaveImpl = new EmployeeLeaveImpl();

		employeeLeaveImpl.setEmployeeLeaveId(employeeLeaveId);
		employeeLeaveImpl.setUserId(userId);
		employeeLeaveImpl.setGroupId(groupId);
		employeeLeaveImpl.setCompanyId(companyId);
		employeeLeaveImpl.setYear(year);
		employeeLeaveImpl.setLeavesCarriedOver(leavesCarriedOver);
		employeeLeaveImpl.setLeavesTakenThisYear(leavesTakenThisYear);
		employeeLeaveImpl.setRemainingLeaves(remainingLeaves);
		employeeLeaveImpl.setLeaveId(leaveId);

		if (createDate == Long.MIN_VALUE) {
			employeeLeaveImpl.setCreateDate(null);
		}
		else {
			employeeLeaveImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			employeeLeaveImpl.setModifiedDate(null);
		}
		else {
			employeeLeaveImpl.setModifiedDate(new Date(modifiedDate));
		}

		employeeLeaveImpl.setCreateBy(createBy);
		employeeLeaveImpl.setModifiedBy(modifiedBy);

		employeeLeaveImpl.resetOriginalValues();

		return employeeLeaveImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		employeeLeaveId = objectInput.readLong();
		userId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		year = objectInput.readInt();
		leavesCarriedOver = objectInput.readInt();
		leavesTakenThisYear = objectInput.readInt();
		remainingLeaves = objectInput.readInt();
		leaveId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		createBy = objectInput.readLong();
		modifiedBy = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(employeeLeaveId);
		objectOutput.writeLong(userId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(companyId);
		objectOutput.writeInt(year);
		objectOutput.writeInt(leavesCarriedOver);
		objectOutput.writeInt(leavesTakenThisYear);
		objectOutput.writeInt(remainingLeaves);
		objectOutput.writeLong(leaveId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
		objectOutput.writeLong(createBy);
		objectOutput.writeLong(modifiedBy);
	}

	public long employeeLeaveId;
	public long userId;
	public long groupId;
	public long companyId;
	public int year;
	public int leavesCarriedOver;
	public int leavesTakenThisYear;
	public int remainingLeaves;
	public long leaveId;
	public long createDate;
	public long modifiedDate;
	public long createBy;
	public long modifiedBy;
}