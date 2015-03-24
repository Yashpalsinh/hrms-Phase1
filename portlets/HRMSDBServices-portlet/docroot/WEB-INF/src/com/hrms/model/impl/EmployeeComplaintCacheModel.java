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

import com.hrms.model.EmployeeComplaint;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing EmployeeComplaint in entity cache.
 *
 * @author bhavik
 * @see EmployeeComplaint
 * @generated
 */
public class EmployeeComplaintCacheModel implements CacheModel<EmployeeComplaint>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{employeeComplaintId=");
		sb.append(employeeComplaintId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", complaintTitle=");
		sb.append(complaintTitle);
		sb.append(", complaintDiscription=");
		sb.append(complaintDiscription);
		sb.append(", complaintFrom=");
		sb.append(complaintFrom);
		sb.append(", complaintDate=");
		sb.append(complaintDate);
		sb.append(", status=");
		sb.append(status);
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
	public EmployeeComplaint toEntityModel() {
		EmployeeComplaintImpl employeeComplaintImpl = new EmployeeComplaintImpl();

		employeeComplaintImpl.setEmployeeComplaintId(employeeComplaintId);
		employeeComplaintImpl.setUserId(userId);
		employeeComplaintImpl.setGroupId(groupId);
		employeeComplaintImpl.setCompanyId(companyId);

		if (complaintTitle == null) {
			employeeComplaintImpl.setComplaintTitle(StringPool.BLANK);
		}
		else {
			employeeComplaintImpl.setComplaintTitle(complaintTitle);
		}

		if (complaintDiscription == null) {
			employeeComplaintImpl.setComplaintDiscription(StringPool.BLANK);
		}
		else {
			employeeComplaintImpl.setComplaintDiscription(complaintDiscription);
		}

		employeeComplaintImpl.setComplaintFrom(complaintFrom);

		if (complaintDate == Long.MIN_VALUE) {
			employeeComplaintImpl.setComplaintDate(null);
		}
		else {
			employeeComplaintImpl.setComplaintDate(new Date(complaintDate));
		}

		employeeComplaintImpl.setStatus(status);

		if (modifiedDate == Long.MIN_VALUE) {
			employeeComplaintImpl.setModifiedDate(null);
		}
		else {
			employeeComplaintImpl.setModifiedDate(new Date(modifiedDate));
		}

		employeeComplaintImpl.setCreateBy(createBy);
		employeeComplaintImpl.setModifiedBy(modifiedBy);

		employeeComplaintImpl.resetOriginalValues();

		return employeeComplaintImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		employeeComplaintId = objectInput.readLong();
		userId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		complaintTitle = objectInput.readUTF();
		complaintDiscription = objectInput.readUTF();
		complaintFrom = objectInput.readLong();
		complaintDate = objectInput.readLong();
		status = objectInput.readBoolean();
		modifiedDate = objectInput.readLong();
		createBy = objectInput.readLong();
		modifiedBy = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(employeeComplaintId);
		objectOutput.writeLong(userId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(companyId);

		if (complaintTitle == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(complaintTitle);
		}

		if (complaintDiscription == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(complaintDiscription);
		}

		objectOutput.writeLong(complaintFrom);
		objectOutput.writeLong(complaintDate);
		objectOutput.writeBoolean(status);
		objectOutput.writeLong(modifiedDate);
		objectOutput.writeLong(createBy);
		objectOutput.writeLong(modifiedBy);
	}

	public long employeeComplaintId;
	public long userId;
	public long groupId;
	public long companyId;
	public String complaintTitle;
	public String complaintDiscription;
	public long complaintFrom;
	public long complaintDate;
	public boolean status;
	public long modifiedDate;
	public long createBy;
	public long modifiedBy;
}