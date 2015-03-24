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

import com.hrms.model.JobLibrary;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing JobLibrary in entity cache.
 *
 * @author bhavik
 * @see JobLibrary
 * @generated
 */
public class JobLibraryCacheModel implements CacheModel<JobLibrary>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{jobLibraryId=");
		sb.append(jobLibraryId);
		sb.append(", employeeDepartmentId=");
		sb.append(employeeDepartmentId);
		sb.append(", jobTitle=");
		sb.append(jobTitle);
		sb.append(", jobDescription=");
		sb.append(jobDescription);
		sb.append(", responsibility=");
		sb.append(responsibility);
		sb.append(", qualifications=");
		sb.append(qualifications);
		sb.append(", numberOfPosition=");
		sb.append(numberOfPosition);
		sb.append(", experience=");
		sb.append(experience);
		sb.append(", salaryStartRange=");
		sb.append(salaryStartRange);
		sb.append(", salaryEndRange=");
		sb.append(salaryEndRange);
		sb.append(", benefits=");
		sb.append(benefits);
		sb.append(", reportsToId=");
		sb.append(reportsToId);
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
	public JobLibrary toEntityModel() {
		JobLibraryImpl jobLibraryImpl = new JobLibraryImpl();

		jobLibraryImpl.setJobLibraryId(jobLibraryId);
		jobLibraryImpl.setEmployeeDepartmentId(employeeDepartmentId);

		if (jobTitle == null) {
			jobLibraryImpl.setJobTitle(StringPool.BLANK);
		}
		else {
			jobLibraryImpl.setJobTitle(jobTitle);
		}

		if (jobDescription == null) {
			jobLibraryImpl.setJobDescription(StringPool.BLANK);
		}
		else {
			jobLibraryImpl.setJobDescription(jobDescription);
		}

		if (responsibility == null) {
			jobLibraryImpl.setResponsibility(StringPool.BLANK);
		}
		else {
			jobLibraryImpl.setResponsibility(responsibility);
		}

		if (qualifications == null) {
			jobLibraryImpl.setQualifications(StringPool.BLANK);
		}
		else {
			jobLibraryImpl.setQualifications(qualifications);
		}

		jobLibraryImpl.setNumberOfPosition(numberOfPosition);

		if (experience == null) {
			jobLibraryImpl.setExperience(StringPool.BLANK);
		}
		else {
			jobLibraryImpl.setExperience(experience);
		}

		jobLibraryImpl.setSalaryStartRange(salaryStartRange);
		jobLibraryImpl.setSalaryEndRange(salaryEndRange);

		if (benefits == null) {
			jobLibraryImpl.setBenefits(StringPool.BLANK);
		}
		else {
			jobLibraryImpl.setBenefits(benefits);
		}

		jobLibraryImpl.setReportsToId(reportsToId);

		if (createDate == Long.MIN_VALUE) {
			jobLibraryImpl.setCreateDate(null);
		}
		else {
			jobLibraryImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			jobLibraryImpl.setModifiedDate(null);
		}
		else {
			jobLibraryImpl.setModifiedDate(new Date(modifiedDate));
		}

		jobLibraryImpl.setCreateBy(createBy);
		jobLibraryImpl.setModifiedBy(modifiedBy);

		jobLibraryImpl.resetOriginalValues();

		return jobLibraryImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		jobLibraryId = objectInput.readLong();
		employeeDepartmentId = objectInput.readLong();
		jobTitle = objectInput.readUTF();
		jobDescription = objectInput.readUTF();
		responsibility = objectInput.readUTF();
		qualifications = objectInput.readUTF();
		numberOfPosition = objectInput.readInt();
		experience = objectInput.readUTF();
		salaryStartRange = objectInput.readLong();
		salaryEndRange = objectInput.readLong();
		benefits = objectInput.readUTF();
		reportsToId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		createBy = objectInput.readLong();
		modifiedBy = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(jobLibraryId);
		objectOutput.writeLong(employeeDepartmentId);

		if (jobTitle == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(jobTitle);
		}

		if (jobDescription == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(jobDescription);
		}

		if (responsibility == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(responsibility);
		}

		if (qualifications == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(qualifications);
		}

		objectOutput.writeInt(numberOfPosition);

		if (experience == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(experience);
		}

		objectOutput.writeLong(salaryStartRange);
		objectOutput.writeLong(salaryEndRange);

		if (benefits == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(benefits);
		}

		objectOutput.writeLong(reportsToId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
		objectOutput.writeLong(createBy);
		objectOutput.writeLong(modifiedBy);
	}

	public long jobLibraryId;
	public long employeeDepartmentId;
	public String jobTitle;
	public String jobDescription;
	public String responsibility;
	public String qualifications;
	public int numberOfPosition;
	public String experience;
	public long salaryStartRange;
	public long salaryEndRange;
	public String benefits;
	public long reportsToId;
	public long createDate;
	public long modifiedDate;
	public long createBy;
	public long modifiedBy;
}