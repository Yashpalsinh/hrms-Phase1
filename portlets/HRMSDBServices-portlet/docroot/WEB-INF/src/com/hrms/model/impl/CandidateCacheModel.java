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

import com.hrms.model.Candidate;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Candidate in entity cache.
 *
 * @author bhavik
 * @see Candidate
 * @generated
 */
public class CandidateCacheModel implements CacheModel<Candidate>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(65);

		sb.append("{candidateId=");
		sb.append(candidateId);
		sb.append(", employeeDepartmentId=");
		sb.append(employeeDepartmentId);
		sb.append(", employeeSubDepartmentId=");
		sb.append(employeeSubDepartmentId);
		sb.append(", employeeDesignationId=");
		sb.append(employeeDesignationId);
		sb.append(", title=");
		sb.append(title);
		sb.append(", firstName=");
		sb.append(firstName);
		sb.append(", middleName=");
		sb.append(middleName);
		sb.append(", lastName=");
		sb.append(lastName);
		sb.append(", dateOfBirth=");
		sb.append(dateOfBirth);
		sb.append(", nationality=");
		sb.append(nationality);
		sb.append(", maritalStatus=");
		sb.append(maritalStatus);
		sb.append(", street1=");
		sb.append(street1);
		sb.append(", street2=");
		sb.append(street2);
		sb.append(", street3=");
		sb.append(street3);
		sb.append(", city=");
		sb.append(city);
		sb.append(", zip=");
		sb.append(zip);
		sb.append(", countryId=");
		sb.append(countryId);
		sb.append(", personalEmail=");
		sb.append(personalEmail);
		sb.append(", currentCtc=");
		sb.append(currentCtc);
		sb.append(", expectedCtc=");
		sb.append(expectedCtc);
		sb.append(", noticePeriod=");
		sb.append(noticePeriod);
		sb.append(", resumeId=");
		sb.append(resumeId);
		sb.append(", resumePath=");
		sb.append(resumePath);
		sb.append(", employeeProofId=");
		sb.append(employeeProofId);
		sb.append(", proofNumber=");
		sb.append(proofNumber);
		sb.append(", gender=");
		sb.append(gender);
		sb.append(", status=");
		sb.append(status);
		sb.append(", shortListed=");
		sb.append(shortListed);
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
	public Candidate toEntityModel() {
		CandidateImpl candidateImpl = new CandidateImpl();

		candidateImpl.setCandidateId(candidateId);
		candidateImpl.setEmployeeDepartmentId(employeeDepartmentId);
		candidateImpl.setEmployeeSubDepartmentId(employeeSubDepartmentId);
		candidateImpl.setEmployeeDesignationId(employeeDesignationId);

		if (title == null) {
			candidateImpl.setTitle(StringPool.BLANK);
		}
		else {
			candidateImpl.setTitle(title);
		}

		if (firstName == null) {
			candidateImpl.setFirstName(StringPool.BLANK);
		}
		else {
			candidateImpl.setFirstName(firstName);
		}

		if (middleName == null) {
			candidateImpl.setMiddleName(StringPool.BLANK);
		}
		else {
			candidateImpl.setMiddleName(middleName);
		}

		if (lastName == null) {
			candidateImpl.setLastName(StringPool.BLANK);
		}
		else {
			candidateImpl.setLastName(lastName);
		}

		if (dateOfBirth == Long.MIN_VALUE) {
			candidateImpl.setDateOfBirth(null);
		}
		else {
			candidateImpl.setDateOfBirth(new Date(dateOfBirth));
		}

		if (nationality == null) {
			candidateImpl.setNationality(StringPool.BLANK);
		}
		else {
			candidateImpl.setNationality(nationality);
		}

		candidateImpl.setMaritalStatus(maritalStatus);

		if (street1 == null) {
			candidateImpl.setStreet1(StringPool.BLANK);
		}
		else {
			candidateImpl.setStreet1(street1);
		}

		if (street2 == null) {
			candidateImpl.setStreet2(StringPool.BLANK);
		}
		else {
			candidateImpl.setStreet2(street2);
		}

		if (street3 == null) {
			candidateImpl.setStreet3(StringPool.BLANK);
		}
		else {
			candidateImpl.setStreet3(street3);
		}

		if (city == null) {
			candidateImpl.setCity(StringPool.BLANK);
		}
		else {
			candidateImpl.setCity(city);
		}

		candidateImpl.setZip(zip);
		candidateImpl.setCountryId(countryId);

		if (personalEmail == null) {
			candidateImpl.setPersonalEmail(StringPool.BLANK);
		}
		else {
			candidateImpl.setPersonalEmail(personalEmail);
		}

		candidateImpl.setCurrentCtc(currentCtc);
		candidateImpl.setExpectedCtc(expectedCtc);

		if (noticePeriod == null) {
			candidateImpl.setNoticePeriod(StringPool.BLANK);
		}
		else {
			candidateImpl.setNoticePeriod(noticePeriod);
		}

		candidateImpl.setResumeId(resumeId);

		if (resumePath == null) {
			candidateImpl.setResumePath(StringPool.BLANK);
		}
		else {
			candidateImpl.setResumePath(resumePath);
		}

		candidateImpl.setEmployeeProofId(employeeProofId);

		if (proofNumber == null) {
			candidateImpl.setProofNumber(StringPool.BLANK);
		}
		else {
			candidateImpl.setProofNumber(proofNumber);
		}

		candidateImpl.setGender(gender);
		candidateImpl.setStatus(status);
		candidateImpl.setShortListed(shortListed);

		if (createDate == Long.MIN_VALUE) {
			candidateImpl.setCreateDate(null);
		}
		else {
			candidateImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			candidateImpl.setModifiedDate(null);
		}
		else {
			candidateImpl.setModifiedDate(new Date(modifiedDate));
		}

		candidateImpl.setCreateBy(createBy);
		candidateImpl.setModifiedBy(modifiedBy);

		candidateImpl.resetOriginalValues();

		return candidateImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		candidateId = objectInput.readLong();
		employeeDepartmentId = objectInput.readLong();
		employeeSubDepartmentId = objectInput.readLong();
		employeeDesignationId = objectInput.readLong();
		title = objectInput.readUTF();
		firstName = objectInput.readUTF();
		middleName = objectInput.readUTF();
		lastName = objectInput.readUTF();
		dateOfBirth = objectInput.readLong();
		nationality = objectInput.readUTF();
		maritalStatus = objectInput.readInt();
		street1 = objectInput.readUTF();
		street2 = objectInput.readUTF();
		street3 = objectInput.readUTF();
		city = objectInput.readUTF();
		zip = objectInput.readLong();
		countryId = objectInput.readLong();
		personalEmail = objectInput.readUTF();
		currentCtc = objectInput.readLong();
		expectedCtc = objectInput.readLong();
		noticePeriod = objectInput.readUTF();
		resumeId = objectInput.readLong();
		resumePath = objectInput.readUTF();
		employeeProofId = objectInput.readLong();
		proofNumber = objectInput.readUTF();
		gender = objectInput.readInt();
		status = objectInput.readBoolean();
		shortListed = objectInput.readBoolean();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		createBy = objectInput.readLong();
		modifiedBy = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(candidateId);
		objectOutput.writeLong(employeeDepartmentId);
		objectOutput.writeLong(employeeSubDepartmentId);
		objectOutput.writeLong(employeeDesignationId);

		if (title == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(title);
		}

		if (firstName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(firstName);
		}

		if (middleName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(middleName);
		}

		if (lastName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(lastName);
		}

		objectOutput.writeLong(dateOfBirth);

		if (nationality == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nationality);
		}

		objectOutput.writeInt(maritalStatus);

		if (street1 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(street1);
		}

		if (street2 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(street2);
		}

		if (street3 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(street3);
		}

		if (city == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(city);
		}

		objectOutput.writeLong(zip);
		objectOutput.writeLong(countryId);

		if (personalEmail == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(personalEmail);
		}

		objectOutput.writeLong(currentCtc);
		objectOutput.writeLong(expectedCtc);

		if (noticePeriod == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(noticePeriod);
		}

		objectOutput.writeLong(resumeId);

		if (resumePath == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(resumePath);
		}

		objectOutput.writeLong(employeeProofId);

		if (proofNumber == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(proofNumber);
		}

		objectOutput.writeInt(gender);
		objectOutput.writeBoolean(status);
		objectOutput.writeBoolean(shortListed);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
		objectOutput.writeLong(createBy);
		objectOutput.writeLong(modifiedBy);
	}

	public long candidateId;
	public long employeeDepartmentId;
	public long employeeSubDepartmentId;
	public long employeeDesignationId;
	public String title;
	public String firstName;
	public String middleName;
	public String lastName;
	public long dateOfBirth;
	public String nationality;
	public int maritalStatus;
	public String street1;
	public String street2;
	public String street3;
	public String city;
	public long zip;
	public long countryId;
	public String personalEmail;
	public long currentCtc;
	public long expectedCtc;
	public String noticePeriod;
	public long resumeId;
	public String resumePath;
	public long employeeProofId;
	public String proofNumber;
	public int gender;
	public boolean status;
	public boolean shortListed;
	public long createDate;
	public long modifiedDate;
	public long createBy;
	public long modifiedBy;
}