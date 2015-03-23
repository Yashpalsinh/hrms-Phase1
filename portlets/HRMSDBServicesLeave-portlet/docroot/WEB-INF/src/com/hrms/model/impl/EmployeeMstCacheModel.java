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

import com.hrms.model.EmployeeMst;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing EmployeeMst in entity cache.
 *
 * @author yashpalsinh
 * @see EmployeeMst
 * @generated
 */
public class EmployeeMstCacheModel implements CacheModel<EmployeeMst>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{employeeMstId=");
		sb.append(employeeMstId);
		sb.append(", employeeId=");
		sb.append(employeeId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", gender=");
		sb.append(gender);
		sb.append(", dateOfBirth=");
		sb.append(dateOfBirth);
		sb.append(", joiningDate=");
		sb.append(joiningDate);
		sb.append(", leavingDate=");
		sb.append(leavingDate);
		sb.append(", maritualStatus=");
		sb.append(maritualStatus);
		sb.append(", nationality=");
		sb.append(nationality);
		sb.append(", employeeDesignationId=");
		sb.append(employeeDesignationId);
		sb.append(", employeeDepartmentId=");
		sb.append(employeeDepartmentId);
		sb.append(", employeeTypeId=");
		sb.append(employeeTypeId);
		sb.append(", employeeProofId=");
		sb.append(employeeProofId);
		sb.append(", proofNumber=");
		sb.append(proofNumber);
		sb.append(", createBy=");
		sb.append(createBy);
		sb.append(", modifiedBy=");
		sb.append(modifiedBy);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public EmployeeMst toEntityModel() {
		EmployeeMstImpl employeeMstImpl = new EmployeeMstImpl();

		employeeMstImpl.setEmployeeMstId(employeeMstId);

		if (employeeId == null) {
			employeeMstImpl.setEmployeeId(StringPool.BLANK);
		}
		else {
			employeeMstImpl.setEmployeeId(employeeId);
		}

		employeeMstImpl.setUserId(userId);
		employeeMstImpl.setGender(gender);

		if (dateOfBirth == Long.MIN_VALUE) {
			employeeMstImpl.setDateOfBirth(null);
		}
		else {
			employeeMstImpl.setDateOfBirth(new Date(dateOfBirth));
		}

		if (joiningDate == Long.MIN_VALUE) {
			employeeMstImpl.setJoiningDate(null);
		}
		else {
			employeeMstImpl.setJoiningDate(new Date(joiningDate));
		}

		if (leavingDate == Long.MIN_VALUE) {
			employeeMstImpl.setLeavingDate(null);
		}
		else {
			employeeMstImpl.setLeavingDate(new Date(leavingDate));
		}

		employeeMstImpl.setMaritualStatus(maritualStatus);

		if (nationality == null) {
			employeeMstImpl.setNationality(StringPool.BLANK);
		}
		else {
			employeeMstImpl.setNationality(nationality);
		}

		employeeMstImpl.setEmployeeDesignationId(employeeDesignationId);
		employeeMstImpl.setEmployeeDepartmentId(employeeDepartmentId);
		employeeMstImpl.setEmployeeTypeId(employeeTypeId);
		employeeMstImpl.setEmployeeProofId(employeeProofId);

		if (proofNumber == null) {
			employeeMstImpl.setProofNumber(StringPool.BLANK);
		}
		else {
			employeeMstImpl.setProofNumber(proofNumber);
		}

		employeeMstImpl.setCreateBy(createBy);
		employeeMstImpl.setModifiedBy(modifiedBy);

		employeeMstImpl.resetOriginalValues();

		return employeeMstImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		employeeMstId = objectInput.readLong();
		employeeId = objectInput.readUTF();
		userId = objectInput.readLong();
		gender = objectInput.readInt();
		dateOfBirth = objectInput.readLong();
		joiningDate = objectInput.readLong();
		leavingDate = objectInput.readLong();
		maritualStatus = objectInput.readInt();
		nationality = objectInput.readUTF();
		employeeDesignationId = objectInput.readInt();
		employeeDepartmentId = objectInput.readInt();
		employeeTypeId = objectInput.readInt();
		employeeProofId = objectInput.readInt();
		proofNumber = objectInput.readUTF();
		createBy = objectInput.readInt();
		modifiedBy = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(employeeMstId);

		if (employeeId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(employeeId);
		}

		objectOutput.writeLong(userId);
		objectOutput.writeInt(gender);
		objectOutput.writeLong(dateOfBirth);
		objectOutput.writeLong(joiningDate);
		objectOutput.writeLong(leavingDate);
		objectOutput.writeInt(maritualStatus);

		if (nationality == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nationality);
		}

		objectOutput.writeInt(employeeDesignationId);
		objectOutput.writeInt(employeeDepartmentId);
		objectOutput.writeInt(employeeTypeId);
		objectOutput.writeInt(employeeProofId);

		if (proofNumber == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(proofNumber);
		}

		objectOutput.writeInt(createBy);
		objectOutput.writeInt(modifiedBy);
	}

	public long employeeMstId;
	public String employeeId;
	public long userId;
	public int gender;
	public long dateOfBirth;
	public long joiningDate;
	public long leavingDate;
	public int maritualStatus;
	public String nationality;
	public int employeeDesignationId;
	public int employeeDepartmentId;
	public int employeeTypeId;
	public int employeeProofId;
	public String proofNumber;
	public int createBy;
	public int modifiedBy;
}