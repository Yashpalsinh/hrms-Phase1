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

import com.hrms.model.EmployeeAchivement;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing EmployeeAchivement in entity cache.
 *
 * @author bhavik
 * @see EmployeeAchivement
 * @generated
 */
public class EmployeeAchivementCacheModel implements CacheModel<EmployeeAchivement>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{employeeAchivementId=");
		sb.append(employeeAchivementId);
		sb.append(", achivedBy=");
		sb.append(achivedBy);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", achivementDate=");
		sb.append(achivementDate);
		sb.append(", achivementTitle=");
		sb.append(achivementTitle);
		sb.append(", achivementDiscription=");
		sb.append(achivementDiscription);
		sb.append(", status=");
		sb.append(status);
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
	public EmployeeAchivement toEntityModel() {
		EmployeeAchivementImpl employeeAchivementImpl = new EmployeeAchivementImpl();

		employeeAchivementImpl.setEmployeeAchivementId(employeeAchivementId);
		employeeAchivementImpl.setAchivedBy(achivedBy);
		employeeAchivementImpl.setGroupId(groupId);
		employeeAchivementImpl.setCompanyId(companyId);

		if (achivementDate == Long.MIN_VALUE) {
			employeeAchivementImpl.setAchivementDate(null);
		}
		else {
			employeeAchivementImpl.setAchivementDate(new Date(achivementDate));
		}

		if (achivementTitle == null) {
			employeeAchivementImpl.setAchivementTitle(StringPool.BLANK);
		}
		else {
			employeeAchivementImpl.setAchivementTitle(achivementTitle);
		}

		if (achivementDiscription == null) {
			employeeAchivementImpl.setAchivementDiscription(StringPool.BLANK);
		}
		else {
			employeeAchivementImpl.setAchivementDiscription(achivementDiscription);
		}

		employeeAchivementImpl.setStatus(status);

		if (createDate == Long.MIN_VALUE) {
			employeeAchivementImpl.setCreateDate(null);
		}
		else {
			employeeAchivementImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			employeeAchivementImpl.setModifiedDate(null);
		}
		else {
			employeeAchivementImpl.setModifiedDate(new Date(modifiedDate));
		}

		employeeAchivementImpl.setCreateBy(createBy);
		employeeAchivementImpl.setModifiedBy(modifiedBy);

		employeeAchivementImpl.resetOriginalValues();

		return employeeAchivementImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		employeeAchivementId = objectInput.readLong();
		achivedBy = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		achivementDate = objectInput.readLong();
		achivementTitle = objectInput.readUTF();
		achivementDiscription = objectInput.readUTF();
		status = objectInput.readBoolean();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		createBy = objectInput.readLong();
		modifiedBy = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(employeeAchivementId);
		objectOutput.writeLong(achivedBy);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(achivementDate);

		if (achivementTitle == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(achivementTitle);
		}

		if (achivementDiscription == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(achivementDiscription);
		}

		objectOutput.writeBoolean(status);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
		objectOutput.writeLong(createBy);
		objectOutput.writeLong(modifiedBy);
	}

	public long employeeAchivementId;
	public long achivedBy;
	public long groupId;
	public long companyId;
	public long achivementDate;
	public String achivementTitle;
	public String achivementDiscription;
	public boolean status;
	public long createDate;
	public long modifiedDate;
	public long createBy;
	public long modifiedBy;
}