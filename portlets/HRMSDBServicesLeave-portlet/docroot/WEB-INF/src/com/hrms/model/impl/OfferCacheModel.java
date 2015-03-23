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

import com.hrms.model.Offer;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Offer in entity cache.
 *
 * @author yashpalsinh
 * @see Offer
 * @generated
 */
public class OfferCacheModel implements CacheModel<Offer>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{OferrId=");
		sb.append(OferrId);
		sb.append(", candidateId=");
		sb.append(candidateId);
		sb.append(", employeeDepartmentId=");
		sb.append(employeeDepartmentId);
		sb.append(", employeeDesignationId=");
		sb.append(employeeDesignationId);
		sb.append(", employeeTypeId=");
		sb.append(employeeTypeId);
		sb.append(", salary=");
		sb.append(salary);
		sb.append(", joiningDate=");
		sb.append(joiningDate);
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
	public Offer toEntityModel() {
		OfferImpl offerImpl = new OfferImpl();

		offerImpl.setOferrId(OferrId);
		offerImpl.setCandidateId(candidateId);
		offerImpl.setEmployeeDepartmentId(employeeDepartmentId);
		offerImpl.setEmployeeDesignationId(employeeDesignationId);
		offerImpl.setEmployeeTypeId(employeeTypeId);
		offerImpl.setSalary(salary);

		if (joiningDate == Long.MIN_VALUE) {
			offerImpl.setJoiningDate(null);
		}
		else {
			offerImpl.setJoiningDate(new Date(joiningDate));
		}

		if (createDate == Long.MIN_VALUE) {
			offerImpl.setCreateDate(null);
		}
		else {
			offerImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			offerImpl.setModifiedDate(null);
		}
		else {
			offerImpl.setModifiedDate(new Date(modifiedDate));
		}

		offerImpl.setCreateBy(createBy);
		offerImpl.setModifiedBy(modifiedBy);

		offerImpl.resetOriginalValues();

		return offerImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		OferrId = objectInput.readLong();
		candidateId = objectInput.readLong();
		employeeDepartmentId = objectInput.readLong();
		employeeDesignationId = objectInput.readLong();
		employeeTypeId = objectInput.readLong();
		salary = objectInput.readLong();
		joiningDate = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		createBy = objectInput.readLong();
		modifiedBy = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(OferrId);
		objectOutput.writeLong(candidateId);
		objectOutput.writeLong(employeeDepartmentId);
		objectOutput.writeLong(employeeDesignationId);
		objectOutput.writeLong(employeeTypeId);
		objectOutput.writeLong(salary);
		objectOutput.writeLong(joiningDate);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
		objectOutput.writeLong(createBy);
		objectOutput.writeLong(modifiedBy);
	}

	public long OferrId;
	public long candidateId;
	public long employeeDepartmentId;
	public long employeeDesignationId;
	public long employeeTypeId;
	public long salary;
	public long joiningDate;
	public long createDate;
	public long modifiedDate;
	public long createBy;
	public long modifiedBy;
}