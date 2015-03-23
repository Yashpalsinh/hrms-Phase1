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

import com.hrms.model.EmployeeProof;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing EmployeeProof in entity cache.
 *
 * @author yashpalsinh
 * @see EmployeeProof
 * @generated
 */
public class EmployeeProofCacheModel implements CacheModel<EmployeeProof>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{employeeproofNo=");
		sb.append(employeeproofNo);
		sb.append(", proofId=");
		sb.append(proofId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", expirationDate=");
		sb.append(expirationDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public EmployeeProof toEntityModel() {
		EmployeeProofImpl employeeProofImpl = new EmployeeProofImpl();

		employeeProofImpl.setEmployeeproofNo(employeeproofNo);
		employeeProofImpl.setProofId(proofId);
		employeeProofImpl.setUserId(userId);

		if (expirationDate == Long.MIN_VALUE) {
			employeeProofImpl.setExpirationDate(null);
		}
		else {
			employeeProofImpl.setExpirationDate(new Date(expirationDate));
		}

		employeeProofImpl.resetOriginalValues();

		return employeeProofImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		employeeproofNo = objectInput.readLong();
		proofId = objectInput.readLong();
		userId = objectInput.readLong();
		expirationDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(employeeproofNo);
		objectOutput.writeLong(proofId);
		objectOutput.writeLong(userId);
		objectOutput.writeLong(expirationDate);
	}

	public long employeeproofNo;
	public long proofId;
	public long userId;
	public long expirationDate;
}