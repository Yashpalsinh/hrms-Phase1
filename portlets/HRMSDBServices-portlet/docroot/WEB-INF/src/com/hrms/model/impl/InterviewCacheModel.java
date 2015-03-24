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

import com.hrms.model.Interview;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Interview in entity cache.
 *
 * @author bhavik
 * @see Interview
 * @generated
 */
public class InterviewCacheModel implements CacheModel<Interview>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{InterviewId=");
		sb.append(InterviewId);
		sb.append(", candidateId=");
		sb.append(candidateId);
		sb.append(", jobLibraryId=");
		sb.append(jobLibraryId);
		sb.append(", roundNumber=");
		sb.append(roundNumber);
		sb.append(", roundType=");
		sb.append(roundType);
		sb.append(", InterviewerId=");
		sb.append(InterviewerId);
		sb.append(", interviewDate=");
		sb.append(interviewDate);
		sb.append(", result=");
		sb.append(result);
		sb.append(", remarks=");
		sb.append(remarks);
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
	public Interview toEntityModel() {
		InterviewImpl interviewImpl = new InterviewImpl();

		interviewImpl.setInterviewId(InterviewId);
		interviewImpl.setCandidateId(candidateId);
		interviewImpl.setJobLibraryId(jobLibraryId);
		interviewImpl.setRoundNumber(roundNumber);

		if (roundType == null) {
			interviewImpl.setRoundType(StringPool.BLANK);
		}
		else {
			interviewImpl.setRoundType(roundType);
		}

		interviewImpl.setInterviewerId(InterviewerId);

		if (interviewDate == Long.MIN_VALUE) {
			interviewImpl.setInterviewDate(null);
		}
		else {
			interviewImpl.setInterviewDate(new Date(interviewDate));
		}

		interviewImpl.setResult(result);

		if (remarks == null) {
			interviewImpl.setRemarks(StringPool.BLANK);
		}
		else {
			interviewImpl.setRemarks(remarks);
		}

		if (createDate == Long.MIN_VALUE) {
			interviewImpl.setCreateDate(null);
		}
		else {
			interviewImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			interviewImpl.setModifiedDate(null);
		}
		else {
			interviewImpl.setModifiedDate(new Date(modifiedDate));
		}

		interviewImpl.setCreateBy(createBy);
		interviewImpl.setModifiedBy(modifiedBy);

		interviewImpl.resetOriginalValues();

		return interviewImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		InterviewId = objectInput.readLong();
		candidateId = objectInput.readLong();
		jobLibraryId = objectInput.readLong();
		roundNumber = objectInput.readLong();
		roundType = objectInput.readUTF();
		InterviewerId = objectInput.readLong();
		interviewDate = objectInput.readLong();
		result = objectInput.readBoolean();
		remarks = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		createBy = objectInput.readLong();
		modifiedBy = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(InterviewId);
		objectOutput.writeLong(candidateId);
		objectOutput.writeLong(jobLibraryId);
		objectOutput.writeLong(roundNumber);

		if (roundType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(roundType);
		}

		objectOutput.writeLong(InterviewerId);
		objectOutput.writeLong(interviewDate);
		objectOutput.writeBoolean(result);

		if (remarks == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(remarks);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
		objectOutput.writeLong(createBy);
		objectOutput.writeLong(modifiedBy);
	}

	public long InterviewId;
	public long candidateId;
	public long jobLibraryId;
	public long roundNumber;
	public String roundType;
	public long InterviewerId;
	public long interviewDate;
	public boolean result;
	public String remarks;
	public long createDate;
	public long modifiedDate;
	public long createBy;
	public long modifiedBy;
}