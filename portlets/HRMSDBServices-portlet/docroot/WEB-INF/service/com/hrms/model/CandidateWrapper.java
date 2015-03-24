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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Candidate}.
 * </p>
 *
 * @author yashpalsinh
 * @see Candidate
 * @generated
 */
public class CandidateWrapper implements Candidate, ModelWrapper<Candidate> {
	public CandidateWrapper(Candidate candidate) {
		_candidate = candidate;
	}

	@Override
	public Class<?> getModelClass() {
		return Candidate.class;
	}

	@Override
	public String getModelClassName() {
		return Candidate.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("candidateId", getCandidateId());
		attributes.put("employeeDepartmentId", getEmployeeDepartmentId());
		attributes.put("employeeSubDepartmentId", getEmployeeSubDepartmentId());
		attributes.put("employeeDesignationId", getEmployeeDesignationId());
		attributes.put("title", getTitle());
		attributes.put("firstName", getFirstName());
		attributes.put("middleName", getMiddleName());
		attributes.put("lastName", getLastName());
		attributes.put("dateOfBirth", getDateOfBirth());
		attributes.put("nationality", getNationality());
		attributes.put("maritalStatus", getMaritalStatus());
		attributes.put("street1", getStreet1());
		attributes.put("street2", getStreet2());
		attributes.put("street3", getStreet3());
		attributes.put("city", getCity());
		attributes.put("zip", getZip());
		attributes.put("countryId", getCountryId());
		attributes.put("personalEmail", getPersonalEmail());
		attributes.put("currentCtc", getCurrentCtc());
		attributes.put("expectedCtc", getExpectedCtc());
		attributes.put("noticePeriod", getNoticePeriod());
		attributes.put("resumeId", getResumeId());
		attributes.put("resumePath", getResumePath());
		attributes.put("employeeProofId", getEmployeeProofId());
		attributes.put("proofNumber", getProofNumber());
		attributes.put("gender", getGender());
		attributes.put("status", getStatus());
		attributes.put("shortListed", getShortListed());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("createBy", getCreateBy());
		attributes.put("modifiedBy", getModifiedBy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long candidateId = (Long)attributes.get("candidateId");

		if (candidateId != null) {
			setCandidateId(candidateId);
		}

		Long employeeDepartmentId = (Long)attributes.get("employeeDepartmentId");

		if (employeeDepartmentId != null) {
			setEmployeeDepartmentId(employeeDepartmentId);
		}

		Long employeeSubDepartmentId = (Long)attributes.get(
				"employeeSubDepartmentId");

		if (employeeSubDepartmentId != null) {
			setEmployeeSubDepartmentId(employeeSubDepartmentId);
		}

		Long employeeDesignationId = (Long)attributes.get(
				"employeeDesignationId");

		if (employeeDesignationId != null) {
			setEmployeeDesignationId(employeeDesignationId);
		}

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		String firstName = (String)attributes.get("firstName");

		if (firstName != null) {
			setFirstName(firstName);
		}

		String middleName = (String)attributes.get("middleName");

		if (middleName != null) {
			setMiddleName(middleName);
		}

		String lastName = (String)attributes.get("lastName");

		if (lastName != null) {
			setLastName(lastName);
		}

		Date dateOfBirth = (Date)attributes.get("dateOfBirth");

		if (dateOfBirth != null) {
			setDateOfBirth(dateOfBirth);
		}

		String nationality = (String)attributes.get("nationality");

		if (nationality != null) {
			setNationality(nationality);
		}

		Integer maritalStatus = (Integer)attributes.get("maritalStatus");

		if (maritalStatus != null) {
			setMaritalStatus(maritalStatus);
		}

		String street1 = (String)attributes.get("street1");

		if (street1 != null) {
			setStreet1(street1);
		}

		String street2 = (String)attributes.get("street2");

		if (street2 != null) {
			setStreet2(street2);
		}

		String street3 = (String)attributes.get("street3");

		if (street3 != null) {
			setStreet3(street3);
		}

		String city = (String)attributes.get("city");

		if (city != null) {
			setCity(city);
		}

		Long zip = (Long)attributes.get("zip");

		if (zip != null) {
			setZip(zip);
		}

		Long countryId = (Long)attributes.get("countryId");

		if (countryId != null) {
			setCountryId(countryId);
		}

		String personalEmail = (String)attributes.get("personalEmail");

		if (personalEmail != null) {
			setPersonalEmail(personalEmail);
		}

		Long currentCtc = (Long)attributes.get("currentCtc");

		if (currentCtc != null) {
			setCurrentCtc(currentCtc);
		}

		Long expectedCtc = (Long)attributes.get("expectedCtc");

		if (expectedCtc != null) {
			setExpectedCtc(expectedCtc);
		}

		String noticePeriod = (String)attributes.get("noticePeriod");

		if (noticePeriod != null) {
			setNoticePeriod(noticePeriod);
		}

		Long resumeId = (Long)attributes.get("resumeId");

		if (resumeId != null) {
			setResumeId(resumeId);
		}

		String resumePath = (String)attributes.get("resumePath");

		if (resumePath != null) {
			setResumePath(resumePath);
		}

		Long employeeProofId = (Long)attributes.get("employeeProofId");

		if (employeeProofId != null) {
			setEmployeeProofId(employeeProofId);
		}

		String proofNumber = (String)attributes.get("proofNumber");

		if (proofNumber != null) {
			setProofNumber(proofNumber);
		}

		Integer gender = (Integer)attributes.get("gender");

		if (gender != null) {
			setGender(gender);
		}

		Boolean status = (Boolean)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Boolean shortListed = (Boolean)attributes.get("shortListed");

		if (shortListed != null) {
			setShortListed(shortListed);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long createBy = (Long)attributes.get("createBy");

		if (createBy != null) {
			setCreateBy(createBy);
		}

		Long modifiedBy = (Long)attributes.get("modifiedBy");

		if (modifiedBy != null) {
			setModifiedBy(modifiedBy);
		}
	}

	/**
	* Returns the primary key of this candidate.
	*
	* @return the primary key of this candidate
	*/
	@Override
	public long getPrimaryKey() {
		return _candidate.getPrimaryKey();
	}

	/**
	* Sets the primary key of this candidate.
	*
	* @param primaryKey the primary key of this candidate
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_candidate.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the candidate ID of this candidate.
	*
	* @return the candidate ID of this candidate
	*/
	@Override
	public long getCandidateId() {
		return _candidate.getCandidateId();
	}

	/**
	* Sets the candidate ID of this candidate.
	*
	* @param candidateId the candidate ID of this candidate
	*/
	@Override
	public void setCandidateId(long candidateId) {
		_candidate.setCandidateId(candidateId);
	}

	/**
	* Returns the employee department ID of this candidate.
	*
	* @return the employee department ID of this candidate
	*/
	@Override
	public long getEmployeeDepartmentId() {
		return _candidate.getEmployeeDepartmentId();
	}

	/**
	* Sets the employee department ID of this candidate.
	*
	* @param employeeDepartmentId the employee department ID of this candidate
	*/
	@Override
	public void setEmployeeDepartmentId(long employeeDepartmentId) {
		_candidate.setEmployeeDepartmentId(employeeDepartmentId);
	}

	/**
	* Returns the employee sub department ID of this candidate.
	*
	* @return the employee sub department ID of this candidate
	*/
	@Override
	public long getEmployeeSubDepartmentId() {
		return _candidate.getEmployeeSubDepartmentId();
	}

	/**
	* Sets the employee sub department ID of this candidate.
	*
	* @param employeeSubDepartmentId the employee sub department ID of this candidate
	*/
	@Override
	public void setEmployeeSubDepartmentId(long employeeSubDepartmentId) {
		_candidate.setEmployeeSubDepartmentId(employeeSubDepartmentId);
	}

	/**
	* Returns the employee designation ID of this candidate.
	*
	* @return the employee designation ID of this candidate
	*/
	@Override
	public long getEmployeeDesignationId() {
		return _candidate.getEmployeeDesignationId();
	}

	/**
	* Sets the employee designation ID of this candidate.
	*
	* @param employeeDesignationId the employee designation ID of this candidate
	*/
	@Override
	public void setEmployeeDesignationId(long employeeDesignationId) {
		_candidate.setEmployeeDesignationId(employeeDesignationId);
	}

	/**
	* Returns the title of this candidate.
	*
	* @return the title of this candidate
	*/
	@Override
	public java.lang.String getTitle() {
		return _candidate.getTitle();
	}

	/**
	* Sets the title of this candidate.
	*
	* @param title the title of this candidate
	*/
	@Override
	public void setTitle(java.lang.String title) {
		_candidate.setTitle(title);
	}

	/**
	* Returns the first name of this candidate.
	*
	* @return the first name of this candidate
	*/
	@Override
	public java.lang.String getFirstName() {
		return _candidate.getFirstName();
	}

	/**
	* Sets the first name of this candidate.
	*
	* @param firstName the first name of this candidate
	*/
	@Override
	public void setFirstName(java.lang.String firstName) {
		_candidate.setFirstName(firstName);
	}

	/**
	* Returns the middle name of this candidate.
	*
	* @return the middle name of this candidate
	*/
	@Override
	public java.lang.String getMiddleName() {
		return _candidate.getMiddleName();
	}

	/**
	* Sets the middle name of this candidate.
	*
	* @param middleName the middle name of this candidate
	*/
	@Override
	public void setMiddleName(java.lang.String middleName) {
		_candidate.setMiddleName(middleName);
	}

	/**
	* Returns the last name of this candidate.
	*
	* @return the last name of this candidate
	*/
	@Override
	public java.lang.String getLastName() {
		return _candidate.getLastName();
	}

	/**
	* Sets the last name of this candidate.
	*
	* @param lastName the last name of this candidate
	*/
	@Override
	public void setLastName(java.lang.String lastName) {
		_candidate.setLastName(lastName);
	}

	/**
	* Returns the date of birth of this candidate.
	*
	* @return the date of birth of this candidate
	*/
	@Override
	public java.util.Date getDateOfBirth() {
		return _candidate.getDateOfBirth();
	}

	/**
	* Sets the date of birth of this candidate.
	*
	* @param dateOfBirth the date of birth of this candidate
	*/
	@Override
	public void setDateOfBirth(java.util.Date dateOfBirth) {
		_candidate.setDateOfBirth(dateOfBirth);
	}

	/**
	* Returns the nationality of this candidate.
	*
	* @return the nationality of this candidate
	*/
	@Override
	public java.lang.String getNationality() {
		return _candidate.getNationality();
	}

	/**
	* Sets the nationality of this candidate.
	*
	* @param nationality the nationality of this candidate
	*/
	@Override
	public void setNationality(java.lang.String nationality) {
		_candidate.setNationality(nationality);
	}

	/**
	* Returns the marital status of this candidate.
	*
	* @return the marital status of this candidate
	*/
	@Override
	public int getMaritalStatus() {
		return _candidate.getMaritalStatus();
	}

	/**
	* Sets the marital status of this candidate.
	*
	* @param maritalStatus the marital status of this candidate
	*/
	@Override
	public void setMaritalStatus(int maritalStatus) {
		_candidate.setMaritalStatus(maritalStatus);
	}

	/**
	* Returns the street1 of this candidate.
	*
	* @return the street1 of this candidate
	*/
	@Override
	public java.lang.String getStreet1() {
		return _candidate.getStreet1();
	}

	/**
	* Sets the street1 of this candidate.
	*
	* @param street1 the street1 of this candidate
	*/
	@Override
	public void setStreet1(java.lang.String street1) {
		_candidate.setStreet1(street1);
	}

	/**
	* Returns the street2 of this candidate.
	*
	* @return the street2 of this candidate
	*/
	@Override
	public java.lang.String getStreet2() {
		return _candidate.getStreet2();
	}

	/**
	* Sets the street2 of this candidate.
	*
	* @param street2 the street2 of this candidate
	*/
	@Override
	public void setStreet2(java.lang.String street2) {
		_candidate.setStreet2(street2);
	}

	/**
	* Returns the street3 of this candidate.
	*
	* @return the street3 of this candidate
	*/
	@Override
	public java.lang.String getStreet3() {
		return _candidate.getStreet3();
	}

	/**
	* Sets the street3 of this candidate.
	*
	* @param street3 the street3 of this candidate
	*/
	@Override
	public void setStreet3(java.lang.String street3) {
		_candidate.setStreet3(street3);
	}

	/**
	* Returns the city of this candidate.
	*
	* @return the city of this candidate
	*/
	@Override
	public java.lang.String getCity() {
		return _candidate.getCity();
	}

	/**
	* Sets the city of this candidate.
	*
	* @param city the city of this candidate
	*/
	@Override
	public void setCity(java.lang.String city) {
		_candidate.setCity(city);
	}

	/**
	* Returns the zip of this candidate.
	*
	* @return the zip of this candidate
	*/
	@Override
	public long getZip() {
		return _candidate.getZip();
	}

	/**
	* Sets the zip of this candidate.
	*
	* @param zip the zip of this candidate
	*/
	@Override
	public void setZip(long zip) {
		_candidate.setZip(zip);
	}

	/**
	* Returns the country ID of this candidate.
	*
	* @return the country ID of this candidate
	*/
	@Override
	public long getCountryId() {
		return _candidate.getCountryId();
	}

	/**
	* Sets the country ID of this candidate.
	*
	* @param countryId the country ID of this candidate
	*/
	@Override
	public void setCountryId(long countryId) {
		_candidate.setCountryId(countryId);
	}

	/**
	* Returns the personal email of this candidate.
	*
	* @return the personal email of this candidate
	*/
	@Override
	public java.lang.String getPersonalEmail() {
		return _candidate.getPersonalEmail();
	}

	/**
	* Sets the personal email of this candidate.
	*
	* @param personalEmail the personal email of this candidate
	*/
	@Override
	public void setPersonalEmail(java.lang.String personalEmail) {
		_candidate.setPersonalEmail(personalEmail);
	}

	/**
	* Returns the current ctc of this candidate.
	*
	* @return the current ctc of this candidate
	*/
	@Override
	public long getCurrentCtc() {
		return _candidate.getCurrentCtc();
	}

	/**
	* Sets the current ctc of this candidate.
	*
	* @param currentCtc the current ctc of this candidate
	*/
	@Override
	public void setCurrentCtc(long currentCtc) {
		_candidate.setCurrentCtc(currentCtc);
	}

	/**
	* Returns the expected ctc of this candidate.
	*
	* @return the expected ctc of this candidate
	*/
	@Override
	public long getExpectedCtc() {
		return _candidate.getExpectedCtc();
	}

	/**
	* Sets the expected ctc of this candidate.
	*
	* @param expectedCtc the expected ctc of this candidate
	*/
	@Override
	public void setExpectedCtc(long expectedCtc) {
		_candidate.setExpectedCtc(expectedCtc);
	}

	/**
	* Returns the notice period of this candidate.
	*
	* @return the notice period of this candidate
	*/
	@Override
	public java.lang.String getNoticePeriod() {
		return _candidate.getNoticePeriod();
	}

	/**
	* Sets the notice period of this candidate.
	*
	* @param noticePeriod the notice period of this candidate
	*/
	@Override
	public void setNoticePeriod(java.lang.String noticePeriod) {
		_candidate.setNoticePeriod(noticePeriod);
	}

	/**
	* Returns the resume ID of this candidate.
	*
	* @return the resume ID of this candidate
	*/
	@Override
	public long getResumeId() {
		return _candidate.getResumeId();
	}

	/**
	* Sets the resume ID of this candidate.
	*
	* @param resumeId the resume ID of this candidate
	*/
	@Override
	public void setResumeId(long resumeId) {
		_candidate.setResumeId(resumeId);
	}

	/**
	* Returns the resume path of this candidate.
	*
	* @return the resume path of this candidate
	*/
	@Override
	public java.lang.String getResumePath() {
		return _candidate.getResumePath();
	}

	/**
	* Sets the resume path of this candidate.
	*
	* @param resumePath the resume path of this candidate
	*/
	@Override
	public void setResumePath(java.lang.String resumePath) {
		_candidate.setResumePath(resumePath);
	}

	/**
	* Returns the employee proof ID of this candidate.
	*
	* @return the employee proof ID of this candidate
	*/
	@Override
	public long getEmployeeProofId() {
		return _candidate.getEmployeeProofId();
	}

	/**
	* Sets the employee proof ID of this candidate.
	*
	* @param employeeProofId the employee proof ID of this candidate
	*/
	@Override
	public void setEmployeeProofId(long employeeProofId) {
		_candidate.setEmployeeProofId(employeeProofId);
	}

	/**
	* Returns the proof number of this candidate.
	*
	* @return the proof number of this candidate
	*/
	@Override
	public java.lang.String getProofNumber() {
		return _candidate.getProofNumber();
	}

	/**
	* Sets the proof number of this candidate.
	*
	* @param proofNumber the proof number of this candidate
	*/
	@Override
	public void setProofNumber(java.lang.String proofNumber) {
		_candidate.setProofNumber(proofNumber);
	}

	/**
	* Returns the gender of this candidate.
	*
	* @return the gender of this candidate
	*/
	@Override
	public int getGender() {
		return _candidate.getGender();
	}

	/**
	* Sets the gender of this candidate.
	*
	* @param gender the gender of this candidate
	*/
	@Override
	public void setGender(int gender) {
		_candidate.setGender(gender);
	}

	/**
	* Returns the status of this candidate.
	*
	* @return the status of this candidate
	*/
	@Override
	public boolean getStatus() {
		return _candidate.getStatus();
	}

	/**
	* Returns <code>true</code> if this candidate is status.
	*
	* @return <code>true</code> if this candidate is status; <code>false</code> otherwise
	*/
	@Override
	public boolean isStatus() {
		return _candidate.isStatus();
	}

	/**
	* Sets whether this candidate is status.
	*
	* @param status the status of this candidate
	*/
	@Override
	public void setStatus(boolean status) {
		_candidate.setStatus(status);
	}

	/**
	* Returns the short listed of this candidate.
	*
	* @return the short listed of this candidate
	*/
	@Override
	public boolean getShortListed() {
		return _candidate.getShortListed();
	}

	/**
	* Returns <code>true</code> if this candidate is short listed.
	*
	* @return <code>true</code> if this candidate is short listed; <code>false</code> otherwise
	*/
	@Override
	public boolean isShortListed() {
		return _candidate.isShortListed();
	}

	/**
	* Sets whether this candidate is short listed.
	*
	* @param shortListed the short listed of this candidate
	*/
	@Override
	public void setShortListed(boolean shortListed) {
		_candidate.setShortListed(shortListed);
	}

	/**
	* Returns the create date of this candidate.
	*
	* @return the create date of this candidate
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _candidate.getCreateDate();
	}

	/**
	* Sets the create date of this candidate.
	*
	* @param createDate the create date of this candidate
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_candidate.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this candidate.
	*
	* @return the modified date of this candidate
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _candidate.getModifiedDate();
	}

	/**
	* Sets the modified date of this candidate.
	*
	* @param modifiedDate the modified date of this candidate
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_candidate.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the create by of this candidate.
	*
	* @return the create by of this candidate
	*/
	@Override
	public long getCreateBy() {
		return _candidate.getCreateBy();
	}

	/**
	* Sets the create by of this candidate.
	*
	* @param createBy the create by of this candidate
	*/
	@Override
	public void setCreateBy(long createBy) {
		_candidate.setCreateBy(createBy);
	}

	/**
	* Returns the modified by of this candidate.
	*
	* @return the modified by of this candidate
	*/
	@Override
	public long getModifiedBy() {
		return _candidate.getModifiedBy();
	}

	/**
	* Sets the modified by of this candidate.
	*
	* @param modifiedBy the modified by of this candidate
	*/
	@Override
	public void setModifiedBy(long modifiedBy) {
		_candidate.setModifiedBy(modifiedBy);
	}

	@Override
	public boolean isNew() {
		return _candidate.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_candidate.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _candidate.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_candidate.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _candidate.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _candidate.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_candidate.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _candidate.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_candidate.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_candidate.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_candidate.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new CandidateWrapper((Candidate)_candidate.clone());
	}

	@Override
	public int compareTo(com.hrms.model.Candidate candidate) {
		return _candidate.compareTo(candidate);
	}

	@Override
	public int hashCode() {
		return _candidate.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.hrms.model.Candidate> toCacheModel() {
		return _candidate.toCacheModel();
	}

	@Override
	public com.hrms.model.Candidate toEscapedModel() {
		return new CandidateWrapper(_candidate.toEscapedModel());
	}

	@Override
	public com.hrms.model.Candidate toUnescapedModel() {
		return new CandidateWrapper(_candidate.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _candidate.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _candidate.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_candidate.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CandidateWrapper)) {
			return false;
		}

		CandidateWrapper candidateWrapper = (CandidateWrapper)obj;

		if (Validator.equals(_candidate, candidateWrapper._candidate)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Candidate getWrappedCandidate() {
		return _candidate;
	}

	@Override
	public Candidate getWrappedModel() {
		return _candidate;
	}

	@Override
	public void resetOriginalValues() {
		_candidate.resetOriginalValues();
	}

	private Candidate _candidate;
}