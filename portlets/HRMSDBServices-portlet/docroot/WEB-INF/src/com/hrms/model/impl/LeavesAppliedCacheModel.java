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

import com.hrms.model.LeavesApplied;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing LeavesApplied in entity cache.
 *
 * @author bhavik
 * @see LeavesApplied
 * @generated
 */
public class LeavesAppliedCacheModel implements CacheModel<LeavesApplied>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(37);

		sb.append("{appliedLeaveId=");
		sb.append(appliedLeaveId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", employeeName=");
		sb.append(employeeName);
		sb.append(", leaveName=");
		sb.append(leaveName);
		sb.append(", entitlement=");
		sb.append(entitlement);
		sb.append(", leaveDuration=");
		sb.append(leaveDuration);
		sb.append(", leaveFrom=");
		sb.append(leaveFrom);
		sb.append(", leaveTo=");
		sb.append(leaveTo);
		sb.append(", leaveDate=");
		sb.append(leaveDate);
		sb.append(", leavePeriod=");
		sb.append(leavePeriod);
		sb.append(", approvalStatus=");
		sb.append(approvalStatus);
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
	public LeavesApplied toEntityModel() {
		LeavesAppliedImpl leavesAppliedImpl = new LeavesAppliedImpl();

		leavesAppliedImpl.setAppliedLeaveId(appliedLeaveId);
		leavesAppliedImpl.setUserId(userId);
		leavesAppliedImpl.setGroupId(groupId);
		leavesAppliedImpl.setCompanyId(companyId);

		if (employeeName == null) {
			leavesAppliedImpl.setEmployeeName(StringPool.BLANK);
		}
		else {
			leavesAppliedImpl.setEmployeeName(employeeName);
		}

		if (leaveName == null) {
			leavesAppliedImpl.setLeaveName(StringPool.BLANK);
		}
		else {
			leavesAppliedImpl.setLeaveName(leaveName);
		}

		if (entitlement == null) {
			leavesAppliedImpl.setEntitlement(StringPool.BLANK);
		}
		else {
			leavesAppliedImpl.setEntitlement(entitlement);
		}

		if (leaveDuration == null) {
			leavesAppliedImpl.setLeaveDuration(StringPool.BLANK);
		}
		else {
			leavesAppliedImpl.setLeaveDuration(leaveDuration);
		}

		if (leaveFrom == Long.MIN_VALUE) {
			leavesAppliedImpl.setLeaveFrom(null);
		}
		else {
			leavesAppliedImpl.setLeaveFrom(new Date(leaveFrom));
		}

		if (leaveTo == Long.MIN_VALUE) {
			leavesAppliedImpl.setLeaveTo(null);
		}
		else {
			leavesAppliedImpl.setLeaveTo(new Date(leaveTo));
		}

		if (leaveDate == Long.MIN_VALUE) {
			leavesAppliedImpl.setLeaveDate(null);
		}
		else {
			leavesAppliedImpl.setLeaveDate(new Date(leaveDate));
		}

		if (leavePeriod == null) {
			leavesAppliedImpl.setLeavePeriod(StringPool.BLANK);
		}
		else {
			leavesAppliedImpl.setLeavePeriod(leavePeriod);
		}

		if (approvalStatus == null) {
			leavesAppliedImpl.setApprovalStatus(StringPool.BLANK);
		}
		else {
			leavesAppliedImpl.setApprovalStatus(approvalStatus);
		}

		leavesAppliedImpl.setLeaveId(leaveId);

		if (createDate == Long.MIN_VALUE) {
			leavesAppliedImpl.setCreateDate(null);
		}
		else {
			leavesAppliedImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			leavesAppliedImpl.setModifiedDate(null);
		}
		else {
			leavesAppliedImpl.setModifiedDate(new Date(modifiedDate));
		}

		leavesAppliedImpl.setCreateBy(createBy);
		leavesAppliedImpl.setModifiedBy(modifiedBy);

		leavesAppliedImpl.resetOriginalValues();

		return leavesAppliedImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		appliedLeaveId = objectInput.readLong();
		userId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		employeeName = objectInput.readUTF();
		leaveName = objectInput.readUTF();
		entitlement = objectInput.readUTF();
		leaveDuration = objectInput.readUTF();
		leaveFrom = objectInput.readLong();
		leaveTo = objectInput.readLong();
		leaveDate = objectInput.readLong();
		leavePeriod = objectInput.readUTF();
		approvalStatus = objectInput.readUTF();
		leaveId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		createBy = objectInput.readLong();
		modifiedBy = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(appliedLeaveId);
		objectOutput.writeLong(userId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(companyId);

		if (employeeName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(employeeName);
		}

		if (leaveName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(leaveName);
		}

		if (entitlement == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(entitlement);
		}

		if (leaveDuration == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(leaveDuration);
		}

		objectOutput.writeLong(leaveFrom);
		objectOutput.writeLong(leaveTo);
		objectOutput.writeLong(leaveDate);

		if (leavePeriod == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(leavePeriod);
		}

		if (approvalStatus == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(approvalStatus);
		}

		objectOutput.writeLong(leaveId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
		objectOutput.writeLong(createBy);
		objectOutput.writeLong(modifiedBy);
	}

	public long appliedLeaveId;
	public long userId;
	public long groupId;
	public long companyId;
	public String employeeName;
	public String leaveName;
	public String entitlement;
	public String leaveDuration;
	public long leaveFrom;
	public long leaveTo;
	public long leaveDate;
	public String leavePeriod;
	public String approvalStatus;
	public long leaveId;
	public long createDate;
	public long modifiedDate;
	public long createBy;
	public long modifiedBy;
}