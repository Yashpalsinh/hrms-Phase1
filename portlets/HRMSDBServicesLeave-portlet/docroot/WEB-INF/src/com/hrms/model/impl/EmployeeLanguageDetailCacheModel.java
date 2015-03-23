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

import com.hrms.model.EmployeeLanguageDetail;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing EmployeeLanguageDetail in entity cache.
 *
 * @author yashpalsinh
 * @see EmployeeLanguageDetail
 * @generated
 */
public class EmployeeLanguageDetailCacheModel implements CacheModel<EmployeeLanguageDetail>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{employeeLanguageDetailId=");
		sb.append(employeeLanguageDetailId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", languageName=");
		sb.append(languageName);
		sb.append(", read=");
		sb.append(read);
		sb.append(", write=");
		sb.append(write);
		sb.append(", speak=");
		sb.append(speak);
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
	public EmployeeLanguageDetail toEntityModel() {
		EmployeeLanguageDetailImpl employeeLanguageDetailImpl = new EmployeeLanguageDetailImpl();

		employeeLanguageDetailImpl.setEmployeeLanguageDetailId(employeeLanguageDetailId);
		employeeLanguageDetailImpl.setUserId(userId);
		employeeLanguageDetailImpl.setGroupId(groupId);
		employeeLanguageDetailImpl.setCompanyId(companyId);

		if (languageName == null) {
			employeeLanguageDetailImpl.setLanguageName(StringPool.BLANK);
		}
		else {
			employeeLanguageDetailImpl.setLanguageName(languageName);
		}

		employeeLanguageDetailImpl.setRead(read);
		employeeLanguageDetailImpl.setWrite(write);
		employeeLanguageDetailImpl.setSpeak(speak);

		if (createDate == Long.MIN_VALUE) {
			employeeLanguageDetailImpl.setCreateDate(null);
		}
		else {
			employeeLanguageDetailImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			employeeLanguageDetailImpl.setModifiedDate(null);
		}
		else {
			employeeLanguageDetailImpl.setModifiedDate(new Date(modifiedDate));
		}

		employeeLanguageDetailImpl.setCreateBy(createBy);
		employeeLanguageDetailImpl.setModifiedBy(modifiedBy);

		employeeLanguageDetailImpl.resetOriginalValues();

		return employeeLanguageDetailImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		employeeLanguageDetailId = objectInput.readLong();
		userId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		languageName = objectInput.readUTF();
		read = objectInput.readBoolean();
		write = objectInput.readBoolean();
		speak = objectInput.readBoolean();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		createBy = objectInput.readLong();
		modifiedBy = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(employeeLanguageDetailId);
		objectOutput.writeLong(userId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(companyId);

		if (languageName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(languageName);
		}

		objectOutput.writeBoolean(read);
		objectOutput.writeBoolean(write);
		objectOutput.writeBoolean(speak);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
		objectOutput.writeLong(createBy);
		objectOutput.writeLong(modifiedBy);
	}

	public long employeeLanguageDetailId;
	public long userId;
	public long groupId;
	public long companyId;
	public String languageName;
	public boolean read;
	public boolean write;
	public boolean speak;
	public long createDate;
	public long modifiedDate;
	public long createBy;
	public long modifiedBy;
}