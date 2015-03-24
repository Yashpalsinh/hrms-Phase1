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

package com.hrms.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.hrms.service.http.InterviewServiceSoap}.
 *
 * @author bhavik
 * @see com.hrms.service.http.InterviewServiceSoap
 * @generated
 */
public class InterviewSoap implements Serializable {
	public static InterviewSoap toSoapModel(Interview model) {
		InterviewSoap soapModel = new InterviewSoap();

		soapModel.setInterviewId(model.getInterviewId());
		soapModel.setCandidateId(model.getCandidateId());
		soapModel.setJobLibraryId(model.getJobLibraryId());
		soapModel.setRoundNumber(model.getRoundNumber());
		soapModel.setRoundType(model.getRoundType());
		soapModel.setInterviewerId(model.getInterviewerId());
		soapModel.setInterviewDate(model.getInterviewDate());
		soapModel.setResult(model.getResult());
		soapModel.setRemarks(model.getRemarks());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setCreateBy(model.getCreateBy());
		soapModel.setModifiedBy(model.getModifiedBy());

		return soapModel;
	}

	public static InterviewSoap[] toSoapModels(Interview[] models) {
		InterviewSoap[] soapModels = new InterviewSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static InterviewSoap[][] toSoapModels(Interview[][] models) {
		InterviewSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new InterviewSoap[models.length][models[0].length];
		}
		else {
			soapModels = new InterviewSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static InterviewSoap[] toSoapModels(List<Interview> models) {
		List<InterviewSoap> soapModels = new ArrayList<InterviewSoap>(models.size());

		for (Interview model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new InterviewSoap[soapModels.size()]);
	}

	public InterviewSoap() {
	}

	public long getPrimaryKey() {
		return _InterviewId;
	}

	public void setPrimaryKey(long pk) {
		setInterviewId(pk);
	}

	public long getInterviewId() {
		return _InterviewId;
	}

	public void setInterviewId(long InterviewId) {
		_InterviewId = InterviewId;
	}

	public long getCandidateId() {
		return _candidateId;
	}

	public void setCandidateId(long candidateId) {
		_candidateId = candidateId;
	}

	public long getJobLibraryId() {
		return _jobLibraryId;
	}

	public void setJobLibraryId(long jobLibraryId) {
		_jobLibraryId = jobLibraryId;
	}

	public long getRoundNumber() {
		return _roundNumber;
	}

	public void setRoundNumber(long roundNumber) {
		_roundNumber = roundNumber;
	}

	public String getRoundType() {
		return _roundType;
	}

	public void setRoundType(String roundType) {
		_roundType = roundType;
	}

	public long getInterviewerId() {
		return _InterviewerId;
	}

	public void setInterviewerId(long InterviewerId) {
		_InterviewerId = InterviewerId;
	}

	public Date getInterviewDate() {
		return _interviewDate;
	}

	public void setInterviewDate(Date interviewDate) {
		_interviewDate = interviewDate;
	}

	public boolean getResult() {
		return _result;
	}

	public boolean isResult() {
		return _result;
	}

	public void setResult(boolean result) {
		_result = result;
	}

	public String getRemarks() {
		return _remarks;
	}

	public void setRemarks(String remarks) {
		_remarks = remarks;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public long getCreateBy() {
		return _createBy;
	}

	public void setCreateBy(long createBy) {
		_createBy = createBy;
	}

	public long getModifiedBy() {
		return _modifiedBy;
	}

	public void setModifiedBy(long modifiedBy) {
		_modifiedBy = modifiedBy;
	}

	private long _InterviewId;
	private long _candidateId;
	private long _jobLibraryId;
	private long _roundNumber;
	private String _roundType;
	private long _InterviewerId;
	private Date _interviewDate;
	private boolean _result;
	private String _remarks;
	private Date _createDate;
	private Date _modifiedDate;
	private long _createBy;
	private long _modifiedBy;
}