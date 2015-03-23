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

import com.hrms.model.EmployeePreviousCompany;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing EmployeePreviousCompany in entity cache.
 *
 * @author yashpalsinh
 * @see EmployeePreviousCompany
 * @generated
 */
public class EmployeePreviousCompanyCacheModel implements CacheModel<EmployeePreviousCompany>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{employeePreviousCompanyId=");
		sb.append(employeePreviousCompanyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", companyName=");
		sb.append(companyName);
		sb.append(", jobTitle=");
		sb.append(jobTitle);
		sb.append(", jobDiscription=");
		sb.append(jobDiscription);
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
	public EmployeePreviousCompany toEntityModel() {
		EmployeePreviousCompanyImpl employeePreviousCompanyImpl = new EmployeePreviousCompanyImpl();

		employeePreviousCompanyImpl.setEmployeePreviousCompanyId(employeePreviousCompanyId);
		employeePreviousCompanyImpl.setUserId(userId);
		employeePreviousCompanyImpl.setGroupId(groupId);
		employeePreviousCompanyImpl.setCompanyId(companyId);

		if (companyName == null) {
			employeePreviousCompanyImpl.setCompanyName(StringPool.BLANK);
		}
		else {
			employeePreviousCompanyImpl.setCompanyName(companyName);
		}

		if (jobTitle == null) {
			employeePreviousCompanyImpl.setJobTitle(StringPool.BLANK);
		}
		else {
			employeePreviousCompanyImpl.setJobTitle(jobTitle);
		}

		if (jobDiscription == null) {
			employeePreviousCompanyImpl.setJobDiscription(StringPool.BLANK);
		}
		else {
			employeePreviousCompanyImpl.setJobDiscription(jobDiscription);
		}

		if (startDate == Long.MIN_VALUE) {
			employeePreviousCompanyImpl.setStartDate(null);
		}
		else {
			employeePreviousCompanyImpl.setStartDate(new Date(startDate));
		}

		if (endDate == Long.MIN_VALUE) {
			employeePreviousCompanyImpl.setEndDate(null);
		}
		else {
			employeePreviousCompanyImpl.setEndDate(new Date(endDate));
		}

		if (createDate == Long.MIN_VALUE) {
			employeePreviousCompanyImpl.setCreateDate(null);
		}
		else {
			employeePreviousCompanyImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			employeePreviousCompanyImpl.setModifiedDate(null);
		}
		else {
			employeePreviousCompanyImpl.setModifiedDate(new Date(modifiedDate));
		}

		employeePreviousCompanyImpl.setCreateBy(createBy);
		employeePreviousCompanyImpl.setModifiedBy(modifiedBy);

		employeePreviousCompanyImpl.resetOriginalValues();

		return employeePreviousCompanyImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		employeePreviousCompanyId = objectInput.readLong();
		userId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		companyName = objectInput.readUTF();
		jobTitle = objectInput.readUTF();
		jobDiscription = objectInput.readUTF();
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
		objectOutput.writeLong(employeePreviousCompanyId);
		objectOutput.writeLong(userId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(companyId);

		if (companyName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(companyName);
		}

		if (jobTitle == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(jobTitle);
		}

		if (jobDiscription == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(jobDiscription);
		}

		objectOutput.writeLong(startDate);
		objectOutput.writeLong(endDate);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
		objectOutput.writeLong(createBy);
		objectOutput.writeLong(modifiedBy);
	}

	public long employeePreviousCompanyId;
	public long userId;
	public long groupId;
	public long companyId;
	public String companyName;
	public String jobTitle;
	public String jobDiscription;
	public long startDate;
	public long endDate;
	public long createDate;
	public long modifiedDate;
	public long createBy;
	public long modifiedBy;
}