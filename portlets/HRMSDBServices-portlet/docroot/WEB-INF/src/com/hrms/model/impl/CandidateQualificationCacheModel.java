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

import com.hrms.model.CandidateQualification;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CandidateQualification in entity cache.
 *
 * @author bhavik
 * @see CandidateQualification
 * @generated
 */
public class CandidateQualificationCacheModel implements CacheModel<CandidateQualification>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{candidateQualificationId=");
		sb.append(candidateQualificationId);
		sb.append(", candidateId=");
		sb.append(candidateId);
		sb.append(", degreeName=");
		sb.append(degreeName);
		sb.append(", mainSubject=");
		sb.append(mainSubject);
		sb.append(", university=");
		sb.append(university);
		sb.append(", score=");
		sb.append(score);
		sb.append(", startDate=");
		sb.append(startDate);
		sb.append(", endDate=");
		sb.append(endDate);
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
	public CandidateQualification toEntityModel() {
		CandidateQualificationImpl candidateQualificationImpl = new CandidateQualificationImpl();

		candidateQualificationImpl.setCandidateQualificationId(candidateQualificationId);
		candidateQualificationImpl.setCandidateId(candidateId);

		if (degreeName == null) {
			candidateQualificationImpl.setDegreeName(StringPool.BLANK);
		}
		else {
			candidateQualificationImpl.setDegreeName(degreeName);
		}

		if (mainSubject == null) {
			candidateQualificationImpl.setMainSubject(StringPool.BLANK);
		}
		else {
			candidateQualificationImpl.setMainSubject(mainSubject);
		}

		if (university == null) {
			candidateQualificationImpl.setUniversity(StringPool.BLANK);
		}
		else {
			candidateQualificationImpl.setUniversity(university);
		}

		if (score == null) {
			candidateQualificationImpl.setScore(StringPool.BLANK);
		}
		else {
			candidateQualificationImpl.setScore(score);
		}

		if (startDate == Long.MIN_VALUE) {
			candidateQualificationImpl.setStartDate(null);
		}
		else {
			candidateQualificationImpl.setStartDate(new Date(startDate));
		}

		if (endDate == Long.MIN_VALUE) {
			candidateQualificationImpl.setEndDate(null);
		}
		else {
			candidateQualificationImpl.setEndDate(new Date(endDate));
		}

		if (createDate == Long.MIN_VALUE) {
			candidateQualificationImpl.setCreateDate(null);
		}
		else {
			candidateQualificationImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			candidateQualificationImpl.setModifiedDate(null);
		}
		else {
			candidateQualificationImpl.setModifiedDate(new Date(modifiedDate));
		}

		candidateQualificationImpl.setCreateBy(createBy);
		candidateQualificationImpl.setModifiedBy(modifiedBy);

		candidateQualificationImpl.resetOriginalValues();

		return candidateQualificationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		candidateQualificationId = objectInput.readLong();
		candidateId = objectInput.readLong();
		degreeName = objectInput.readUTF();
		mainSubject = objectInput.readUTF();
		university = objectInput.readUTF();
		score = objectInput.readUTF();
		startDate = objectInput.readLong();
		endDate = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		createBy = objectInput.readLong();
		modifiedBy = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(candidateQualificationId);
		objectOutput.writeLong(candidateId);

		if (degreeName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(degreeName);
		}

		if (mainSubject == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(mainSubject);
		}

		if (university == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(university);
		}

		if (score == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(score);
		}

		objectOutput.writeLong(startDate);
		objectOutput.writeLong(endDate);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
		objectOutput.writeLong(createBy);
		objectOutput.writeLong(modifiedBy);
	}

	public long candidateQualificationId;
	public long candidateId;
	public String degreeName;
	public String mainSubject;
	public String university;
	public String score;
	public long startDate;
	public long endDate;
	public long createDate;
	public long modifiedDate;
	public long createBy;
	public long modifiedBy;
}