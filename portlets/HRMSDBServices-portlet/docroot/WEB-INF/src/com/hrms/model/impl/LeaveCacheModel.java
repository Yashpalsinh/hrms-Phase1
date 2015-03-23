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

import com.hrms.model.Leave;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Leave in entity cache.
 *
 * @author yashpalsinh
 * @see Leave
 * @generated
 */
public class LeaveCacheModel implements CacheModel<Leave>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{leaveId=");
		sb.append(leaveId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", leaveName=");
		sb.append(leaveName);
		sb.append(", leaveType=");
		sb.append(leaveType);
		sb.append(", leavesAllowedPerYear=");
		sb.append(leavesAllowedPerYear);
		sb.append(", carryOver=");
		sb.append(carryOver);
		sb.append(", encachement=");
		sb.append(encachement);
		sb.append(", Status=");
		sb.append(Status);
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
	public Leave toEntityModel() {
		LeaveImpl leaveImpl = new LeaveImpl();

		leaveImpl.setLeaveId(leaveId);
		leaveImpl.setGroupId(groupId);
		leaveImpl.setCompanyId(companyId);

		if (leaveName == null) {
			leaveImpl.setLeaveName(StringPool.BLANK);
		}
		else {
			leaveImpl.setLeaveName(leaveName);
		}

		if (leaveType == null) {
			leaveImpl.setLeaveType(StringPool.BLANK);
		}
		else {
			leaveImpl.setLeaveType(leaveType);
		}

		leaveImpl.setLeavesAllowedPerYear(leavesAllowedPerYear);
		leaveImpl.setCarryOver(carryOver);
		leaveImpl.setEncachement(encachement);
		leaveImpl.setStatus(Status);

		if (createDate == Long.MIN_VALUE) {
			leaveImpl.setCreateDate(null);
		}
		else {
			leaveImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			leaveImpl.setModifiedDate(null);
		}
		else {
			leaveImpl.setModifiedDate(new Date(modifiedDate));
		}

		leaveImpl.setCreateBy(createBy);
		leaveImpl.setModifiedBy(modifiedBy);

		leaveImpl.resetOriginalValues();

		return leaveImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		leaveId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		leaveName = objectInput.readUTF();
		leaveType = objectInput.readUTF();
		leavesAllowedPerYear = objectInput.readInt();
		carryOver = objectInput.readBoolean();
		encachement = objectInput.readBoolean();
		Status = objectInput.readBoolean();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		createBy = objectInput.readLong();
		modifiedBy = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(leaveId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(companyId);

		if (leaveName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(leaveName);
		}

		if (leaveType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(leaveType);
		}

		objectOutput.writeInt(leavesAllowedPerYear);
		objectOutput.writeBoolean(carryOver);
		objectOutput.writeBoolean(encachement);
		objectOutput.writeBoolean(Status);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
		objectOutput.writeLong(createBy);
		objectOutput.writeLong(modifiedBy);
	}

	public long leaveId;
	public long groupId;
	public long companyId;
	public String leaveName;
	public String leaveType;
	public int leavesAllowedPerYear;
	public boolean carryOver;
	public boolean encachement;
	public boolean Status;
	public long createDate;
	public long modifiedDate;
	public long createBy;
	public long modifiedBy;
}