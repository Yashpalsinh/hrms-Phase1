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

import com.hrms.model.EmployeeQualification;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing EmployeeQualification in entity cache.
 *
 * @author yashpalsinh
 * @see EmployeeQualification
 * @generated
 */
public class EmployeeQualificationCacheModel implements CacheModel<EmployeeQualification>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{employeeQualificationId=");
		sb.append(employeeQualificationId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", degreeName=");
		sb.append(degreeName);
		sb.append(", specialization=");
		sb.append(specialization);
		sb.append(", university=");
		sb.append(university);
		sb.append(", score=");
		sb.append(score);
		sb.append(", startDate=");
		sb.append(startDate);
		sb.append(", endDate=");
		sb.append(endDate);
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
	public EmployeeQualification toEntityModel() {
		EmployeeQualificationImpl employeeQualificationImpl = new EmployeeQualificationImpl();

		employeeQualificationImpl.setEmployeeQualificationId(employeeQualificationId);
		employeeQualificationImpl.setUserId(userId);
		employeeQualificationImpl.setGroupId(groupId);
		employeeQualificationImpl.setCompanyId(companyId);

		if (degreeName == null) {
			employeeQualificationImpl.setDegreeName(StringPool.BLANK);
		}
		else {
			employeeQualificationImpl.setDegreeName(degreeName);
		}

		if (specialization == null) {
			employeeQualificationImpl.setSpecialization(StringPool.BLANK);
		}
		else {
			employeeQualificationImpl.setSpecialization(specialization);
		}

		if (university == null) {
			employeeQualificationImpl.setUniversity(StringPool.BLANK);
		}
		else {
			employeeQualificationImpl.setUniversity(university);
		}

		if (score == null) {
			employeeQualificationImpl.setScore(StringPool.BLANK);
		}
		else {
			employeeQualificationImpl.setScore(score);
		}

		if (startDate == Long.MIN_VALUE) {
			employeeQualificationImpl.setStartDate(null);
		}
		else {
			employeeQualificationImpl.setStartDate(new Date(startDate));
		}

		if (endDate == Long.MIN_VALUE) {
			employeeQualificationImpl.setEndDate(null);
		}
		else {
			employeeQualificationImpl.setEndDate(new Date(endDate));
		}

		if (createDate == Long.MIN_VALUE) {
			employeeQualificationImpl.setCreateDate(null);
		}
		else {
			employeeQualificationImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			employeeQualificationImpl.setModifiedDate(null);
		}
		else {
			employeeQualificationImpl.setModifiedDate(new Date(modifiedDate));
		}

		employeeQualificationImpl.setCreateBy(createBy);
		employeeQualificationImpl.setModifiedBy(modifiedBy);

		employeeQualificationImpl.resetOriginalValues();

		return employeeQualificationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		employeeQualificationId = objectInput.readLong();
		userId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		degreeName = objectInput.readUTF();
		specialization = objectInput.readUTF();
		university = objectInput.readUTF();
		score = objectInput.readUTF();
		startDate = objectInput.readLong();
		endDate = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		createBy = objectInput.readLong();
		modifiedBy = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(employeeQualificationId);
		objectOutput.writeLong(userId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(companyId);

		if (degreeName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(degreeName);
		}

		if (specialization == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(specialization);
		}

		if (university == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(university);
		}

		if (score == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(score);
		}

		objectOutput.writeLong(startDate);
		objectOutput.writeLong(endDate);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
		objectOutput.writeLong(createBy);
		objectOutput.writeLong(modifiedBy);
	}

	public long employeeQualificationId;
	public long userId;
	public long groupId;
	public long companyId;
	public String degreeName;
	public String specialization;
	public String university;
	public String score;
	public long startDate;
	public long endDate;
	public long createDate;
	public long modifiedDate;
	public long createBy;
	public long modifiedBy;
}