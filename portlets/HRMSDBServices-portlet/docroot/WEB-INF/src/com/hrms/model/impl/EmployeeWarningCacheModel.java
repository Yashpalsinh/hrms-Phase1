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

import com.hrms.model.EmployeeWarning;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing EmployeeWarning in entity cache.
 *
 * @author yashpalsinh
 * @see EmployeeWarning
 * @generated
 */
public class EmployeeWarningCacheModel implements CacheModel<EmployeeWarning>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{employeeWarningId=");
		sb.append(employeeWarningId);
		sb.append(", warningTo=");
		sb.append(warningTo);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", warningDate=");
		sb.append(warningDate);
		sb.append(", warningSubject=");
		sb.append(warningSubject);
		sb.append(", status=");
		sb.append(status);
		sb.append(", warningBy=");
		sb.append(warningBy);
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
	public EmployeeWarning toEntityModel() {
		EmployeeWarningImpl employeeWarningImpl = new EmployeeWarningImpl();

		employeeWarningImpl.setEmployeeWarningId(employeeWarningId);
		employeeWarningImpl.setWarningTo(warningTo);
		employeeWarningImpl.setGroupId(groupId);
		employeeWarningImpl.setCompanyId(companyId);

		if (warningDate == Long.MIN_VALUE) {
			employeeWarningImpl.setWarningDate(null);
		}
		else {
			employeeWarningImpl.setWarningDate(new Date(warningDate));
		}

		if (warningSubject == null) {
			employeeWarningImpl.setWarningSubject(StringPool.BLANK);
		}
		else {
			employeeWarningImpl.setWarningSubject(warningSubject);
		}

		employeeWarningImpl.setStatus(status);
		employeeWarningImpl.setWarningBy(warningBy);

		if (modifiedDate == Long.MIN_VALUE) {
			employeeWarningImpl.setModifiedDate(null);
		}
		else {
			employeeWarningImpl.setModifiedDate(new Date(modifiedDate));
		}

		employeeWarningImpl.setCreateBy(createBy);
		employeeWarningImpl.setModifiedBy(modifiedBy);

		employeeWarningImpl.resetOriginalValues();

		return employeeWarningImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		employeeWarningId = objectInput.readLong();
		warningTo = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		warningDate = objectInput.readLong();
		warningSubject = objectInput.readUTF();
		status = objectInput.readBoolean();
		warningBy = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		createBy = objectInput.readLong();
		modifiedBy = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(employeeWarningId);
		objectOutput.writeLong(warningTo);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(warningDate);

		if (warningSubject == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(warningSubject);
		}

		objectOutput.writeBoolean(status);
		objectOutput.writeLong(warningBy);
		objectOutput.writeLong(modifiedDate);
		objectOutput.writeLong(createBy);
		objectOutput.writeLong(modifiedBy);
	}

	public long employeeWarningId;
	public long warningTo;
	public long groupId;
	public long companyId;
	public long warningDate;
	public String warningSubject;
	public boolean status;
	public long warningBy;
	public long modifiedDate;
	public long createBy;
	public long modifiedBy;
}