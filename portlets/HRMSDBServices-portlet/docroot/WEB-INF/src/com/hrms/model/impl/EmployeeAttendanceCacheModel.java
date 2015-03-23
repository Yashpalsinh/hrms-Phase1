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

import com.hrms.model.EmployeeAttendance;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing EmployeeAttendance in entity cache.
 *
 * @author yashpalsinh
 * @see EmployeeAttendance
 * @generated
 */
public class EmployeeAttendanceCacheModel implements CacheModel<EmployeeAttendance>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{attendanceId=");
		sb.append(attendanceId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", attendanceDate=");
		sb.append(attendanceDate);
		sb.append(", signinTime=");
		sb.append(signinTime);
		sb.append(", signoutTime=");
		sb.append(signoutTime);
		sb.append(", totalTime=");
		sb.append(totalTime);
		sb.append(", approved=");
		sb.append(approved);
		sb.append(", approvedBy=");
		sb.append(approvedBy);
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
	public EmployeeAttendance toEntityModel() {
		EmployeeAttendanceImpl employeeAttendanceImpl = new EmployeeAttendanceImpl();

		employeeAttendanceImpl.setAttendanceId(attendanceId);
		employeeAttendanceImpl.setUserId(userId);
		employeeAttendanceImpl.setGroupId(groupId);
		employeeAttendanceImpl.setCompanyId(companyId);

		if (attendanceDate == Long.MIN_VALUE) {
			employeeAttendanceImpl.setAttendanceDate(null);
		}
		else {
			employeeAttendanceImpl.setAttendanceDate(new Date(attendanceDate));
		}

		if (signinTime == Long.MIN_VALUE) {
			employeeAttendanceImpl.setSigninTime(null);
		}
		else {
			employeeAttendanceImpl.setSigninTime(new Date(signinTime));
		}

		if (signoutTime == Long.MIN_VALUE) {
			employeeAttendanceImpl.setSignoutTime(null);
		}
		else {
			employeeAttendanceImpl.setSignoutTime(new Date(signoutTime));
		}

		if (totalTime == Long.MIN_VALUE) {
			employeeAttendanceImpl.setTotalTime(null);
		}
		else {
			employeeAttendanceImpl.setTotalTime(new Date(totalTime));
		}

		employeeAttendanceImpl.setApproved(approved);
		employeeAttendanceImpl.setApprovedBy(approvedBy);

		if (createDate == Long.MIN_VALUE) {
			employeeAttendanceImpl.setCreateDate(null);
		}
		else {
			employeeAttendanceImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			employeeAttendanceImpl.setModifiedDate(null);
		}
		else {
			employeeAttendanceImpl.setModifiedDate(new Date(modifiedDate));
		}

		employeeAttendanceImpl.setCreateBy(createBy);
		employeeAttendanceImpl.setModifiedBy(modifiedBy);

		employeeAttendanceImpl.resetOriginalValues();

		return employeeAttendanceImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		attendanceId = objectInput.readLong();
		userId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		attendanceDate = objectInput.readLong();
		signinTime = objectInput.readLong();
		signoutTime = objectInput.readLong();
		totalTime = objectInput.readLong();
		approved = objectInput.readBoolean();
		approvedBy = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		createBy = objectInput.readLong();
		modifiedBy = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(attendanceId);
		objectOutput.writeLong(userId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(attendanceDate);
		objectOutput.writeLong(signinTime);
		objectOutput.writeLong(signoutTime);
		objectOutput.writeLong(totalTime);
		objectOutput.writeBoolean(approved);
		objectOutput.writeLong(approvedBy);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
		objectOutput.writeLong(createBy);
		objectOutput.writeLong(modifiedBy);
	}

	public long attendanceId;
	public long userId;
	public long groupId;
	public long companyId;
	public long attendanceDate;
	public long signinTime;
	public long signoutTime;
	public long totalTime;
	public boolean approved;
	public long approvedBy;
	public long createDate;
	public long modifiedDate;
	public long createBy;
	public long modifiedBy;
}