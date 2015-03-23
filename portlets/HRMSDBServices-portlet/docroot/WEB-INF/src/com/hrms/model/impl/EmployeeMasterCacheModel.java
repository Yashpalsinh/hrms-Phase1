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

import com.hrms.model.EmployeeMaster;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing EmployeeMaster in entity cache.
 *
 * @author yashpalsinh
 * @see EmployeeMaster
 * @generated
 */
public class EmployeeMasterCacheModel implements CacheModel<EmployeeMaster>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(35);

		sb.append("{employeeMasterId=");
		sb.append(employeeMasterId);
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
		sb.append(", maritalStatus=");
		sb.append(maritalStatus);
		sb.append(", nationality=");
		sb.append(nationality);
		sb.append(", employeeDesignationId=");
		sb.append(employeeDesignationId);
		sb.append(", employeeDepartmentId=");
		sb.append(employeeDepartmentId);
		sb.append(", employeeSubDepartmentId=");
		sb.append(employeeSubDepartmentId);
		sb.append(", employeeTypeId=");
		sb.append(employeeTypeId);
		sb.append(", recruitedOnBasisOf=");
		sb.append(recruitedOnBasisOf);
		sb.append(", recruitedBy=");
		sb.append(recruitedBy);
		sb.append(", createBy=");
		sb.append(createBy);
		sb.append(", modifiedBy=");
		sb.append(modifiedBy);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public EmployeeMaster toEntityModel() {
		EmployeeMasterImpl employeeMasterImpl = new EmployeeMasterImpl();

		employeeMasterImpl.setEmployeeMasterId(employeeMasterId);

		if (employeeId == null) {
			employeeMasterImpl.setEmployeeId(StringPool.BLANK);
		}
		else {
			employeeMasterImpl.setEmployeeId(employeeId);
		}

		employeeMasterImpl.setUserId(userId);
		employeeMasterImpl.setGender(gender);

		if (dateOfBirth == Long.MIN_VALUE) {
			employeeMasterImpl.setDateOfBirth(null);
		}
		else {
			employeeMasterImpl.setDateOfBirth(new Date(dateOfBirth));
		}

		if (joiningDate == Long.MIN_VALUE) {
			employeeMasterImpl.setJoiningDate(null);
		}
		else {
			employeeMasterImpl.setJoiningDate(new Date(joiningDate));
		}

		if (leavingDate == Long.MIN_VALUE) {
			employeeMasterImpl.setLeavingDate(null);
		}
		else {
			employeeMasterImpl.setLeavingDate(new Date(leavingDate));
		}

		employeeMasterImpl.setMaritalStatus(maritalStatus);

		if (nationality == null) {
			employeeMasterImpl.setNationality(StringPool.BLANK);
		}
		else {
			employeeMasterImpl.setNationality(nationality);
		}

		employeeMasterImpl.setEmployeeDesignationId(employeeDesignationId);
		employeeMasterImpl.setEmployeeDepartmentId(employeeDepartmentId);
		employeeMasterImpl.setEmployeeSubDepartmentId(employeeSubDepartmentId);
		employeeMasterImpl.setEmployeeTypeId(employeeTypeId);

		if (recruitedOnBasisOf == null) {
			employeeMasterImpl.setRecruitedOnBasisOf(StringPool.BLANK);
		}
		else {
			employeeMasterImpl.setRecruitedOnBasisOf(recruitedOnBasisOf);
		}

		employeeMasterImpl.setRecruitedBy(recruitedBy);
		employeeMasterImpl.setCreateBy(createBy);
		employeeMasterImpl.setModifiedBy(modifiedBy);

		employeeMasterImpl.resetOriginalValues();

		return employeeMasterImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		employeeMasterId = objectInput.readLong();
		employeeId = objectInput.readUTF();
		userId = objectInput.readLong();
		gender = objectInput.readInt();
		dateOfBirth = objectInput.readLong();
		joiningDate = objectInput.readLong();
		leavingDate = objectInput.readLong();
		maritalStatus = objectInput.readInt();
		nationality = objectInput.readUTF();
		employeeDesignationId = objectInput.readInt();
		employeeDepartmentId = objectInput.readInt();
		employeeSubDepartmentId = objectInput.readInt();
		employeeTypeId = objectInput.readInt();
		recruitedOnBasisOf = objectInput.readUTF();
		recruitedBy = objectInput.readLong();
		createBy = objectInput.readInt();
		modifiedBy = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(employeeMasterId);

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
		objectOutput.writeInt(maritalStatus);

		if (nationality == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nationality);
		}

		objectOutput.writeInt(employeeDesignationId);
		objectOutput.writeInt(employeeDepartmentId);
		objectOutput.writeInt(employeeSubDepartmentId);
		objectOutput.writeInt(employeeTypeId);

		if (recruitedOnBasisOf == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(recruitedOnBasisOf);
		}

		objectOutput.writeLong(recruitedBy);
		objectOutput.writeInt(createBy);
		objectOutput.writeInt(modifiedBy);
	}

	public long employeeMasterId;
	public String employeeId;
	public long userId;
	public int gender;
	public long dateOfBirth;
	public long joiningDate;
	public long leavingDate;
	public int maritalStatus;
	public String nationality;
	public int employeeDesignationId;
	public int employeeDepartmentId;
	public int employeeSubDepartmentId;
	public int employeeTypeId;
	public String recruitedOnBasisOf;
	public long recruitedBy;
	public int createBy;
	public int modifiedBy;
}