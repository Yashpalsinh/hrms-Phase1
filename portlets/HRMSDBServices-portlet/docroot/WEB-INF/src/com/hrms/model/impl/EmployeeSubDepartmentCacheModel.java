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

import com.hrms.model.EmployeeSubDepartment;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing EmployeeSubDepartment in entity cache.
 *
 * @author yashpalsinh
 * @see EmployeeSubDepartment
 * @generated
 */
public class EmployeeSubDepartmentCacheModel implements CacheModel<EmployeeSubDepartment>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{employeeSubDepartmentId=");
		sb.append(employeeSubDepartmentId);
		sb.append(", subDepartmentName=");
		sb.append(subDepartmentName);
		sb.append(", employeeDepartmentId=");
		sb.append(employeeDepartmentId);
		sb.append(", status=");
		sb.append(status);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public EmployeeSubDepartment toEntityModel() {
		EmployeeSubDepartmentImpl employeeSubDepartmentImpl = new EmployeeSubDepartmentImpl();

		employeeSubDepartmentImpl.setEmployeeSubDepartmentId(employeeSubDepartmentId);

		if (subDepartmentName == null) {
			employeeSubDepartmentImpl.setSubDepartmentName(StringPool.BLANK);
		}
		else {
			employeeSubDepartmentImpl.setSubDepartmentName(subDepartmentName);
		}

		employeeSubDepartmentImpl.setEmployeeDepartmentId(employeeDepartmentId);
		employeeSubDepartmentImpl.setStatus(status);

		employeeSubDepartmentImpl.resetOriginalValues();

		return employeeSubDepartmentImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		employeeSubDepartmentId = objectInput.readLong();
		subDepartmentName = objectInput.readUTF();
		employeeDepartmentId = objectInput.readLong();
		status = objectInput.readBoolean();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(employeeSubDepartmentId);

		if (subDepartmentName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(subDepartmentName);
		}

		objectOutput.writeLong(employeeDepartmentId);
		objectOutput.writeBoolean(status);
	}

	public long employeeSubDepartmentId;
	public String subDepartmentName;
	public long employeeDepartmentId;
	public boolean status;
}