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
 * This class is used by SOAP remote services, specifically {@link com.hrms.service.http.CandidateServiceSoap}.
 *
 * @author yashpalsinh
 * @see com.hrms.service.http.CandidateServiceSoap
 * @generated
 */
public class CandidateSoap implements Serializable {
	public static CandidateSoap toSoapModel(Candidate model) {
		CandidateSoap soapModel = new CandidateSoap();

		soapModel.setCandidateId(model.getCandidateId());
		soapModel.setEmployeeDepartmentId(model.getEmployeeDepartmentId());
		soapModel.setEmployeeSubDepartmentId(model.getEmployeeSubDepartmentId());
		soapModel.setEmployeeDesignationId(model.getEmployeeDesignationId());
		soapModel.setTitle(model.getTitle());
		soapModel.setFirstName(model.getFirstName());
		soapModel.setMiddleName(model.getMiddleName());
		soapModel.setLastName(model.getLastName());
		soapModel.setDateOfBirth(model.getDateOfBirth());
		soapModel.setNationality(model.getNationality());
		soapModel.setMaritalStatus(model.getMaritalStatus());
		soapModel.setStreet1(model.getStreet1());
		soapModel.setStreet2(model.getStreet2());
		soapModel.setStreet3(model.getStreet3());
		soapModel.setCity(model.getCity());
		soapModel.setZip(model.getZip());
		soapModel.setCountryId(model.getCountryId());
		soapModel.setPersonalEmail(model.getPersonalEmail());
		soapModel.setCurrentCtc(model.getCurrentCtc());
		soapModel.setExpectedCtc(model.getExpectedCtc());
		soapModel.setNoticePeriod(model.getNoticePeriod());
		soapModel.setResumeId(model.getResumeId());
		soapModel.setResumePath(model.getResumePath());
		soapModel.setEmployeeProofId(model.getEmployeeProofId());
		soapModel.setProofNumber(model.getProofNumber());
		soapModel.setGender(model.getGender());
		soapModel.setStatus(model.getStatus());
		soapModel.setShortListed(model.getShortListed());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setCreateBy(model.getCreateBy());
		soapModel.setModifiedBy(model.getModifiedBy());

		return soapModel;
	}

	public static CandidateSoap[] toSoapModels(Candidate[] models) {
		CandidateSoap[] soapModels = new CandidateSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CandidateSoap[][] toSoapModels(Candidate[][] models) {
		CandidateSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CandidateSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CandidateSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CandidateSoap[] toSoapModels(List<Candidate> models) {
		List<CandidateSoap> soapModels = new ArrayList<CandidateSoap>(models.size());

		for (Candidate model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CandidateSoap[soapModels.size()]);
	}

	public CandidateSoap() {
	}

	public long getPrimaryKey() {
		return _candidateId;
	}

	public void setPrimaryKey(long pk) {
		setCandidateId(pk);
	}

	public long getCandidateId() {
		return _candidateId;
	}

	public void setCandidateId(long candidateId) {
		_candidateId = candidateId;
	}

	public long getEmployeeDepartmentId() {
		return _employeeDepartmentId;
	}

	public void setEmployeeDepartmentId(long employeeDepartmentId) {
		_employeeDepartmentId = employeeDepartmentId;
	}

	public long getEmployeeSubDepartmentId() {
		return _employeeSubDepartmentId;
	}

	public void setEmployeeSubDepartmentId(long employeeSubDepartmentId) {
		_employeeSubDepartmentId = employeeSubDepartmentId;
	}

	public long getEmployeeDesignationId() {
		return _employeeDesignationId;
	}

	public void setEmployeeDesignationId(long employeeDesignationId) {
		_employeeDesignationId = employeeDesignationId;
	}

	public String getTitle() {
		return _title;
	}

	public void setTitle(String title) {
		_title = title;
	}

	public String getFirstName() {
		return _firstName;
	}

	public void setFirstName(String firstName) {
		_firstName = firstName;
	}

	public String getMiddleName() {
		return _middleName;
	}

	public void setMiddleName(String middleName) {
		_middleName = middleName;
	}

	public String getLastName() {
		return _lastName;
	}

	public void setLastName(String lastName) {
		_lastName = lastName;
	}

	public Date getDateOfBirth() {
		return _dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		_dateOfBirth = dateOfBirth;
	}

	public String getNationality() {
		return _nationality;
	}

	public void setNationality(String nationality) {
		_nationality = nationality;
	}

	public int getMaritalStatus() {
		return _maritalStatus;
	}

	public void setMaritalStatus(int maritalStatus) {
		_maritalStatus = maritalStatus;
	}

	public String getStreet1() {
		return _street1;
	}

	public void setStreet1(String street1) {
		_street1 = street1;
	}

	public String getStreet2() {
		return _street2;
	}

	public void setStreet2(String street2) {
		_street2 = street2;
	}

	public String getStreet3() {
		return _street3;
	}

	public void setStreet3(String street3) {
		_street3 = street3;
	}

	public String getCity() {
		return _city;
	}

	public void setCity(String city) {
		_city = city;
	}

	public long getZip() {
		return _zip;
	}

	public void setZip(long zip) {
		_zip = zip;
	}

	public long getCountryId() {
		return _countryId;
	}

	public void setCountryId(long countryId) {
		_countryId = countryId;
	}

	public String getPersonalEmail() {
		return _personalEmail;
	}

	public void setPersonalEmail(String personalEmail) {
		_personalEmail = personalEmail;
	}

	public long getCurrentCtc() {
		return _currentCtc;
	}

	public void setCurrentCtc(long currentCtc) {
		_currentCtc = currentCtc;
	}

	public long getExpectedCtc() {
		return _expectedCtc;
	}

	public void setExpectedCtc(long expectedCtc) {
		_expectedCtc = expectedCtc;
	}

	public String getNoticePeriod() {
		return _noticePeriod;
	}

	public void setNoticePeriod(String noticePeriod) {
		_noticePeriod = noticePeriod;
	}

	public long getResumeId() {
		return _resumeId;
	}

	public void setResumeId(long resumeId) {
		_resumeId = resumeId;
	}

	public String getResumePath() {
		return _resumePath;
	}

	public void setResumePath(String resumePath) {
		_resumePath = resumePath;
	}

	public long getEmployeeProofId() {
		return _employeeProofId;
	}

	public void setEmployeeProofId(long employeeProofId) {
		_employeeProofId = employeeProofId;
	}

	public String getProofNumber() {
		return _proofNumber;
	}

	public void setProofNumber(String proofNumber) {
		_proofNumber = proofNumber;
	}

	public int getGender() {
		return _gender;
	}

	public void setGender(int gender) {
		_gender = gender;
	}

	public boolean getStatus() {
		return _status;
	}

	public boolean isStatus() {
		return _status;
	}

	public void setStatus(boolean status) {
		_status = status;
	}

	public boolean getShortListed() {
		return _shortListed;
	}

	public boolean isShortListed() {
		return _shortListed;
	}

	public void setShortListed(boolean shortListed) {
		_shortListed = shortListed;
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

	private long _candidateId;
	private long _employeeDepartmentId;
	private long _employeeSubDepartmentId;
	private long _employeeDesignationId;
	private String _title;
	private String _firstName;
	private String _middleName;
	private String _lastName;
	private Date _dateOfBirth;
	private String _nationality;
	private int _maritalStatus;
	private String _street1;
	private String _street2;
	private String _street3;
	private String _city;
	private long _zip;
	private long _countryId;
	private String _personalEmail;
	private long _currentCtc;
	private long _expectedCtc;
	private String _noticePeriod;
	private long _resumeId;
	private String _resumePath;
	private long _employeeProofId;
	private String _proofNumber;
	private int _gender;
	private boolean _status;
	private boolean _shortListed;
	private Date _createDate;
	private Date _modifiedDate;
	private long _createBy;
	private long _modifiedBy;
}