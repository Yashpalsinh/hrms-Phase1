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
 * This class is used by SOAP remote services, specifically {@link com.hrms.service.http.CandidateQualificationServiceSoap}.
 *
 * @author yashpalsinh
 * @see com.hrms.service.http.CandidateQualificationServiceSoap
 * @generated
 */
public class CandidateQualificationSoap implements Serializable {
	public static CandidateQualificationSoap toSoapModel(
		CandidateQualification model) {
		CandidateQualificationSoap soapModel = new CandidateQualificationSoap();

		soapModel.setCandidateQualificationId(model.getCandidateQualificationId());
		soapModel.setCandidateId(model.getCandidateId());
		soapModel.setDegreeName(model.getDegreeName());
		soapModel.setMainSubject(model.getMainSubject());
		soapModel.setUniversity(model.getUniversity());
		soapModel.setScore(model.getScore());
		soapModel.setStartDate(model.getStartDate());
		soapModel.setEndDate(model.getEndDate());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setCreateBy(model.getCreateBy());
		soapModel.setModifiedBy(model.getModifiedBy());

		return soapModel;
	}

	public static CandidateQualificationSoap[] toSoapModels(
		CandidateQualification[] models) {
		CandidateQualificationSoap[] soapModels = new CandidateQualificationSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CandidateQualificationSoap[][] toSoapModels(
		CandidateQualification[][] models) {
		CandidateQualificationSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CandidateQualificationSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CandidateQualificationSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CandidateQualificationSoap[] toSoapModels(
		List<CandidateQualification> models) {
		List<CandidateQualificationSoap> soapModels = new ArrayList<CandidateQualificationSoap>(models.size());

		for (CandidateQualification model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CandidateQualificationSoap[soapModels.size()]);
	}

	public CandidateQualificationSoap() {
	}

	public long getPrimaryKey() {
		return _candidateQualificationId;
	}

	public void setPrimaryKey(long pk) {
		setCandidateQualificationId(pk);
	}

	public long getCandidateQualificationId() {
		return _candidateQualificationId;
	}

	public void setCandidateQualificationId(long candidateQualificationId) {
		_candidateQualificationId = candidateQualificationId;
	}

	public long getCandidateId() {
		return _candidateId;
	}

	public void setCandidateId(long candidateId) {
		_candidateId = candidateId;
	}

	public String getDegreeName() {
		return _degreeName;
	}

	public void setDegreeName(String degreeName) {
		_degreeName = degreeName;
	}

	public String getMainSubject() {
		return _mainSubject;
	}

	public void setMainSubject(String mainSubject) {
		_mainSubject = mainSubject;
	}

	public String getUniversity() {
		return _university;
	}

	public void setUniversity(String university) {
		_university = university;
	}

	public String getScore() {
		return _score;
	}

	public void setScore(String score) {
		_score = score;
	}

	public Date getStartDate() {
		return _startDate;
	}

	public void setStartDate(Date startDate) {
		_startDate = startDate;
	}

	public Date getEndDate() {
		return _endDate;
	}

	public void setEndDate(Date endDate) {
		_endDate = endDate;
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

	private long _candidateQualificationId;
	private long _candidateId;
	private String _degreeName;
	private String _mainSubject;
	private String _university;
	private String _score;
	private Date _startDate;
	private Date _endDate;
	private Date _createDate;
	private Date _modifiedDate;
	private long _createBy;
	private long _modifiedBy;
}