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

import com.hrms.model.EmployeeType;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing EmployeeType in entity cache.
 *
 * @author yashpalsinh
 * @see EmployeeType
 * @generated
 */
public class EmployeeTypeCacheModel implements CacheModel<EmployeeType>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{employeeTypeId=");
		sb.append(employeeTypeId);
		sb.append(", employeeTypeName=");
		sb.append(employeeTypeName);
		sb.append(", status=");
		sb.append(status);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public EmployeeType toEntityModel() {
		EmployeeTypeImpl employeeTypeImpl = new EmployeeTypeImpl();

		employeeTypeImpl.setEmployeeTypeId(employeeTypeId);

		if (employeeTypeName == null) {
			employeeTypeImpl.setEmployeeTypeName(StringPool.BLANK);
		}
		else {
			employeeTypeImpl.setEmployeeTypeName(employeeTypeName);
		}

		employeeTypeImpl.setStatus(status);

		employeeTypeImpl.resetOriginalValues();

		return employeeTypeImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		employeeTypeId = objectInput.readLong();
		employeeTypeName = objectInput.readUTF();
		status = objectInput.readBoolean();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(employeeTypeId);

		if (employeeTypeName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(employeeTypeName);
		}

		objectOutput.writeBoolean(status);
	}

	public long employeeTypeId;
	public String employeeTypeName;
	public boolean status;
}