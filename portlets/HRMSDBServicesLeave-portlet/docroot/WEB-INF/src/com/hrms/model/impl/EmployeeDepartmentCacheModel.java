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

import com.hrms.model.EmployeeDepartment;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing EmployeeDepartment in entity cache.
 *
 * @author yashpalsinh
 * @see EmployeeDepartment
 * @generated
 */
public class EmployeeDepartmentCacheModel implements CacheModel<EmployeeDepartment>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{employeeDepartmentId=");
		sb.append(employeeDepartmentId);
		sb.append(", departmentName=");
		sb.append(departmentName);
		sb.append(", status=");
		sb.append(status);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public EmployeeDepartment toEntityModel() {
		EmployeeDepartmentImpl employeeDepartmentImpl = new EmployeeDepartmentImpl();

		employeeDepartmentImpl.setEmployeeDepartmentId(employeeDepartmentId);

		if (departmentName == null) {
			employeeDepartmentImpl.setDepartmentName(StringPool.BLANK);
		}
		else {
			employeeDepartmentImpl.setDepartmentName(departmentName);
		}

		employeeDepartmentImpl.setStatus(status);

		employeeDepartmentImpl.resetOriginalValues();

		return employeeDepartmentImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		employeeDepartmentId = objectInput.readLong();
		departmentName = objectInput.readUTF();
		status = objectInput.readBoolean();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(employeeDepartmentId);

		if (departmentName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(departmentName);
		}

		objectOutput.writeBoolean(status);
	}

	public long employeeDepartmentId;
	public String departmentName;
	public boolean status;
}