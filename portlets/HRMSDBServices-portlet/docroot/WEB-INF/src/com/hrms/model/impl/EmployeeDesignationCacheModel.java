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

import com.hrms.model.EmployeeDesignation;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing EmployeeDesignation in entity cache.
 *
 * @author bhavik
 * @see EmployeeDesignation
 * @generated
 */
public class EmployeeDesignationCacheModel implements CacheModel<EmployeeDesignation>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{employeeDesignationId=");
		sb.append(employeeDesignationId);
		sb.append(", designationName=");
		sb.append(designationName);
		sb.append(", status=");
		sb.append(status);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public EmployeeDesignation toEntityModel() {
		EmployeeDesignationImpl employeeDesignationImpl = new EmployeeDesignationImpl();

		employeeDesignationImpl.setEmployeeDesignationId(employeeDesignationId);

		if (designationName == null) {
			employeeDesignationImpl.setDesignationName(StringPool.BLANK);
		}
		else {
			employeeDesignationImpl.setDesignationName(designationName);
		}

		employeeDesignationImpl.setStatus(status);

		employeeDesignationImpl.resetOriginalValues();

		return employeeDesignationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		employeeDesignationId = objectInput.readLong();
		designationName = objectInput.readUTF();
		status = objectInput.readBoolean();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(employeeDesignationId);

		if (designationName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(designationName);
		}

		objectOutput.writeBoolean(status);
	}

	public long employeeDesignationId;
	public String designationName;
	public boolean status;
}