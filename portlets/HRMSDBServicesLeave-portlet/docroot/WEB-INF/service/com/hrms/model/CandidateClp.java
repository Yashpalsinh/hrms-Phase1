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

import com.hrms.service.CandidateLocalServiceUtil;
import com.hrms.service.ClpSerializer;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author yashpalsinh
 */
public class CandidateClp extends BaseModelImpl<Candidate> implements Candidate {
	public CandidateClp() {
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
	public long getPrimaryKey() {
		return _candidateId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setCandidateId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _candidateId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("candidateId", getCandidateId());
		attributes.put("employeeDepartmentId", getEmployeeDepartmentId());
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

	@Override
	public long getCandidateId() {
		return _candidateId;
	}

	@Override
	public void setCandidateId(long candidateId) {
		_candidateId = candidateId;

		if (_candidateRemoteModel != null) {
			try {
				Class<?> clazz = _candidateRemoteModel.getClass();

				Method method = clazz.getMethod("setCandidateId", long.class);

				method.invoke(_candidateRemoteModel, candidateId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getEmployeeDepartmentId() {
		return _employeeDepartmentId;
	}

	@Override
	public void setEmployeeDepartmentId(long employeeDepartmentId) {
		_employeeDepartmentId = employeeDepartmentId;

		if (_candidateRemoteModel != null) {
			try {
				Class<?> clazz = _candidateRemoteModel.getClass();

				Method method = clazz.getMethod("setEmployeeDepartmentId",
						long.class);

				method.invoke(_candidateRemoteModel, employeeDepartmentId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getEmployeeDesignationId() {
		return _employeeDesignationId;
	}

	@Override
	public void setEmployeeDesignationId(long employeeDesignationId) {
		_employeeDesignationId = employeeDesignationId;

		if (_candidateRemoteModel != null) {
			try {
				Class<?> clazz = _candidateRemoteModel.getClass();

				Method method = clazz.getMethod("setEmployeeDesignationId",
						long.class);

				method.invoke(_candidateRemoteModel, employeeDesignationId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTitle() {
		return _title;
	}

	@Override
	public void setTitle(String title) {
		_title = title;

		if (_candidateRemoteModel != null) {
			try {
				Class<?> clazz = _candidateRemoteModel.getClass();

				Method method = clazz.getMethod("setTitle", String.class);

				method.invoke(_candidateRemoteModel, title);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFirstName() {
		return _firstName;
	}

	@Override
	public void setFirstName(String firstName) {
		_firstName = firstName;

		if (_candidateRemoteModel != null) {
			try {
				Class<?> clazz = _candidateRemoteModel.getClass();

				Method method = clazz.getMethod("setFirstName", String.class);

				method.invoke(_candidateRemoteModel, firstName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMiddleName() {
		return _middleName;
	}

	@Override
	public void setMiddleName(String middleName) {
		_middleName = middleName;

		if (_candidateRemoteModel != null) {
			try {
				Class<?> clazz = _candidateRemoteModel.getClass();

				Method method = clazz.getMethod("setMiddleName", String.class);

				method.invoke(_candidateRemoteModel, middleName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLastName() {
		return _lastName;
	}

	@Override
	public void setLastName(String lastName) {
		_lastName = lastName;

		if (_candidateRemoteModel != null) {
			try {
				Class<?> clazz = _candidateRemoteModel.getClass();

				Method method = clazz.getMethod("setLastName", String.class);

				method.invoke(_candidateRemoteModel, lastName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getDateOfBirth() {
		return _dateOfBirth;
	}

	@Override
	public void setDateOfBirth(Date dateOfBirth) {
		_dateOfBirth = dateOfBirth;

		if (_candidateRemoteModel != null) {
			try {
				Class<?> clazz = _candidateRemoteModel.getClass();

				Method method = clazz.getMethod("setDateOfBirth", Date.class);

				method.invoke(_candidateRemoteModel, dateOfBirth);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNationality() {
		return _nationality;
	}

	@Override
	public void setNationality(String nationality) {
		_nationality = nationality;

		if (_candidateRemoteModel != null) {
			try {
				Class<?> clazz = _candidateRemoteModel.getClass();

				Method method = clazz.getMethod("setNationality", String.class);

				method.invoke(_candidateRemoteModel, nationality);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getMaritalStatus() {
		return _maritalStatus;
	}

	@Override
	public void setMaritalStatus(int maritalStatus) {
		_maritalStatus = maritalStatus;

		if (_candidateRemoteModel != null) {
			try {
				Class<?> clazz = _candidateRemoteModel.getClass();

				Method method = clazz.getMethod("setMaritalStatus", int.class);

				method.invoke(_candidateRemoteModel, maritalStatus);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getStreet1() {
		return _street1;
	}

	@Override
	public void setStreet1(String street1) {
		_street1 = street1;

		if (_candidateRemoteModel != null) {
			try {
				Class<?> clazz = _candidateRemoteModel.getClass();

				Method method = clazz.getMethod("setStreet1", String.class);

				method.invoke(_candidateRemoteModel, street1);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getStreet2() {
		return _street2;
	}

	@Override
	public void setStreet2(String street2) {
		_street2 = street2;

		if (_candidateRemoteModel != null) {
			try {
				Class<?> clazz = _candidateRemoteModel.getClass();

				Method method = clazz.getMethod("setStreet2", String.class);

				method.invoke(_candidateRemoteModel, street2);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getStreet3() {
		return _street3;
	}

	@Override
	public void setStreet3(String street3) {
		_street3 = street3;

		if (_candidateRemoteModel != null) {
			try {
				Class<?> clazz = _candidateRemoteModel.getClass();

				Method method = clazz.getMethod("setStreet3", String.class);

				method.invoke(_candidateRemoteModel, street3);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCity() {
		return _city;
	}

	@Override
	public void setCity(String city) {
		_city = city;

		if (_candidateRemoteModel != null) {
			try {
				Class<?> clazz = _candidateRemoteModel.getClass();

				Method method = clazz.getMethod("setCity", String.class);

				method.invoke(_candidateRemoteModel, city);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getZip() {
		return _zip;
	}

	@Override
	public void setZip(long zip) {
		_zip = zip;

		if (_candidateRemoteModel != null) {
			try {
				Class<?> clazz = _candidateRemoteModel.getClass();

				Method method = clazz.getMethod("setZip", long.class);

				method.invoke(_candidateRemoteModel, zip);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCountryId() {
		return _countryId;
	}

	@Override
	public void setCountryId(long countryId) {
		_countryId = countryId;

		if (_candidateRemoteModel != null) {
			try {
				Class<?> clazz = _candidateRemoteModel.getClass();

				Method method = clazz.getMethod("setCountryId", long.class);

				method.invoke(_candidateRemoteModel, countryId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPersonalEmail() {
		return _personalEmail;
	}

	@Override
	public void setPersonalEmail(String personalEmail) {
		_personalEmail = personalEmail;

		if (_candidateRemoteModel != null) {
			try {
				Class<?> clazz = _candidateRemoteModel.getClass();

				Method method = clazz.getMethod("setPersonalEmail", String.class);

				method.invoke(_candidateRemoteModel, personalEmail);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCurrentCtc() {
		return _currentCtc;
	}

	@Override
	public void setCurrentCtc(long currentCtc) {
		_currentCtc = currentCtc;

		if (_candidateRemoteModel != null) {
			try {
				Class<?> clazz = _candidateRemoteModel.getClass();

				Method method = clazz.getMethod("setCurrentCtc", long.class);

				method.invoke(_candidateRemoteModel, currentCtc);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getExpectedCtc() {
		return _expectedCtc;
	}

	@Override
	public void setExpectedCtc(long expectedCtc) {
		_expectedCtc = expectedCtc;

		if (_candidateRemoteModel != null) {
			try {
				Class<?> clazz = _candidateRemoteModel.getClass();

				Method method = clazz.getMethod("setExpectedCtc", long.class);

				method.invoke(_candidateRemoteModel, expectedCtc);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNoticePeriod() {
		return _noticePeriod;
	}

	@Override
	public void setNoticePeriod(String noticePeriod) {
		_noticePeriod = noticePeriod;

		if (_candidateRemoteModel != null) {
			try {
				Class<?> clazz = _candidateRemoteModel.getClass();

				Method method = clazz.getMethod("setNoticePeriod", String.class);

				method.invoke(_candidateRemoteModel, noticePeriod);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getResumeId() {
		return _resumeId;
	}

	@Override
	public void setResumeId(long resumeId) {
		_resumeId = resumeId;

		if (_candidateRemoteModel != null) {
			try {
				Class<?> clazz = _candidateRemoteModel.getClass();

				Method method = clazz.getMethod("setResumeId", long.class);

				method.invoke(_candidateRemoteModel, resumeId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getResumePath() {
		return _resumePath;
	}

	@Override
	public void setResumePath(String resumePath) {
		_resumePath = resumePath;

		if (_candidateRemoteModel != null) {
			try {
				Class<?> clazz = _candidateRemoteModel.getClass();

				Method method = clazz.getMethod("setResumePath", String.class);

				method.invoke(_candidateRemoteModel, resumePath);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getEmployeeProofId() {
		return _employeeProofId;
	}

	@Override
	public void setEmployeeProofId(long employeeProofId) {
		_employeeProofId = employeeProofId;

		if (_candidateRemoteModel != null) {
			try {
				Class<?> clazz = _candidateRemoteModel.getClass();

				Method method = clazz.getMethod("setEmployeeProofId", long.class);

				method.invoke(_candidateRemoteModel, employeeProofId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getProofNumber() {
		return _proofNumber;
	}

	@Override
	public void setProofNumber(String proofNumber) {
		_proofNumber = proofNumber;

		if (_candidateRemoteModel != null) {
			try {
				Class<?> clazz = _candidateRemoteModel.getClass();

				Method method = clazz.getMethod("setProofNumber", String.class);

				method.invoke(_candidateRemoteModel, proofNumber);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getGender() {
		return _gender;
	}

	@Override
	public void setGender(int gender) {
		_gender = gender;

		if (_candidateRemoteModel != null) {
			try {
				Class<?> clazz = _candidateRemoteModel.getClass();

				Method method = clazz.getMethod("setGender", int.class);

				method.invoke(_candidateRemoteModel, gender);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getStatus() {
		return _status;
	}

	@Override
	public boolean isStatus() {
		return _status;
	}

	@Override
	public void setStatus(boolean status) {
		_status = status;

		if (_candidateRemoteModel != null) {
			try {
				Class<?> clazz = _candidateRemoteModel.getClass();

				Method method = clazz.getMethod("setStatus", boolean.class);

				method.invoke(_candidateRemoteModel, status);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getShortListed() {
		return _shortListed;
	}

	@Override
	public boolean isShortListed() {
		return _shortListed;
	}

	@Override
	public void setShortListed(boolean shortListed) {
		_shortListed = shortListed;

		if (_candidateRemoteModel != null) {
			try {
				Class<?> clazz = _candidateRemoteModel.getClass();

				Method method = clazz.getMethod("setShortListed", boolean.class);

				method.invoke(_candidateRemoteModel, shortListed);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;

		if (_candidateRemoteModel != null) {
			try {
				Class<?> clazz = _candidateRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_candidateRemoteModel, createDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;

		if (_candidateRemoteModel != null) {
			try {
				Class<?> clazz = _candidateRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_candidateRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCreateBy() {
		return _createBy;
	}

	@Override
	public void setCreateBy(long createBy) {
		_createBy = createBy;

		if (_candidateRemoteModel != null) {
			try {
				Class<?> clazz = _candidateRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateBy", long.class);

				method.invoke(_candidateRemoteModel, createBy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getModifiedBy() {
		return _modifiedBy;
	}

	@Override
	public void setModifiedBy(long modifiedBy) {
		_modifiedBy = modifiedBy;

		if (_candidateRemoteModel != null) {
			try {
				Class<?> clazz = _candidateRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedBy", long.class);

				method.invoke(_candidateRemoteModel, modifiedBy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getCandidateRemoteModel() {
		return _candidateRemoteModel;
	}

	public void setCandidateRemoteModel(BaseModel<?> candidateRemoteModel) {
		_candidateRemoteModel = candidateRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _candidateRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_candidateRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			CandidateLocalServiceUtil.addCandidate(this);
		}
		else {
			CandidateLocalServiceUtil.updateCandidate(this);
		}
	}

	@Override
	public Candidate toEscapedModel() {
		return (Candidate)ProxyUtil.newProxyInstance(Candidate.class.getClassLoader(),
			new Class[] { Candidate.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		CandidateClp clone = new CandidateClp();

		clone.setCandidateId(getCandidateId());
		clone.setEmployeeDepartmentId(getEmployeeDepartmentId());
		clone.setEmployeeDesignationId(getEmployeeDesignationId());
		clone.setTitle(getTitle());
		clone.setFirstName(getFirstName());
		clone.setMiddleName(getMiddleName());
		clone.setLastName(getLastName());
		clone.setDateOfBirth(getDateOfBirth());
		clone.setNationality(getNationality());
		clone.setMaritalStatus(getMaritalStatus());
		clone.setStreet1(getStreet1());
		clone.setStreet2(getStreet2());
		clone.setStreet3(getStreet3());
		clone.setCity(getCity());
		clone.setZip(getZip());
		clone.setCountryId(getCountryId());
		clone.setPersonalEmail(getPersonalEmail());
		clone.setCurrentCtc(getCurrentCtc());
		clone.setExpectedCtc(getExpectedCtc());
		clone.setNoticePeriod(getNoticePeriod());
		clone.setResumeId(getResumeId());
		clone.setResumePath(getResumePath());
		clone.setEmployeeProofId(getEmployeeProofId());
		clone.setProofNumber(getProofNumber());
		clone.setGender(getGender());
		clone.setStatus(getStatus());
		clone.setShortListed(getShortListed());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setCreateBy(getCreateBy());
		clone.setModifiedBy(getModifiedBy());

		return clone;
	}

	@Override
	public int compareTo(Candidate candidate) {
		long primaryKey = candidate.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CandidateClp)) {
			return false;
		}

		CandidateClp candidate = (CandidateClp)obj;

		long primaryKey = candidate.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(63);

		sb.append("{candidateId=");
		sb.append(getCandidateId());
		sb.append(", employeeDepartmentId=");
		sb.append(getEmployeeDepartmentId());
		sb.append(", employeeDesignationId=");
		sb.append(getEmployeeDesignationId());
		sb.append(", title=");
		sb.append(getTitle());
		sb.append(", firstName=");
		sb.append(getFirstName());
		sb.append(", middleName=");
		sb.append(getMiddleName());
		sb.append(", lastName=");
		sb.append(getLastName());
		sb.append(", dateOfBirth=");
		sb.append(getDateOfBirth());
		sb.append(", nationality=");
		sb.append(getNationality());
		sb.append(", maritalStatus=");
		sb.append(getMaritalStatus());
		sb.append(", street1=");
		sb.append(getStreet1());
		sb.append(", street2=");
		sb.append(getStreet2());
		sb.append(", street3=");
		sb.append(getStreet3());
		sb.append(", city=");
		sb.append(getCity());
		sb.append(", zip=");
		sb.append(getZip());
		sb.append(", countryId=");
		sb.append(getCountryId());
		sb.append(", personalEmail=");
		sb.append(getPersonalEmail());
		sb.append(", currentCtc=");
		sb.append(getCurrentCtc());
		sb.append(", expectedCtc=");
		sb.append(getExpectedCtc());
		sb.append(", noticePeriod=");
		sb.append(getNoticePeriod());
		sb.append(", resumeId=");
		sb.append(getResumeId());
		sb.append(", resumePath=");
		sb.append(getResumePath());
		sb.append(", employeeProofId=");
		sb.append(getEmployeeProofId());
		sb.append(", proofNumber=");
		sb.append(getProofNumber());
		sb.append(", gender=");
		sb.append(getGender());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append(", shortListed=");
		sb.append(getShortListed());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", createBy=");
		sb.append(getCreateBy());
		sb.append(", modifiedBy=");
		sb.append(getModifiedBy());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(97);

		sb.append("<model><model-name>");
		sb.append("com.hrms.model.Candidate");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>candidateId</column-name><column-value><![CDATA[");
		sb.append(getCandidateId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>employeeDepartmentId</column-name><column-value><![CDATA[");
		sb.append(getEmployeeDepartmentId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>employeeDesignationId</column-name><column-value><![CDATA[");
		sb.append(getEmployeeDesignationId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>title</column-name><column-value><![CDATA[");
		sb.append(getTitle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>firstName</column-name><column-value><![CDATA[");
		sb.append(getFirstName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>middleName</column-name><column-value><![CDATA[");
		sb.append(getMiddleName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lastName</column-name><column-value><![CDATA[");
		sb.append(getLastName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dateOfBirth</column-name><column-value><![CDATA[");
		sb.append(getDateOfBirth());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nationality</column-name><column-value><![CDATA[");
		sb.append(getNationality());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maritalStatus</column-name><column-value><![CDATA[");
		sb.append(getMaritalStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>street1</column-name><column-value><![CDATA[");
		sb.append(getStreet1());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>street2</column-name><column-value><![CDATA[");
		sb.append(getStreet2());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>street3</column-name><column-value><![CDATA[");
		sb.append(getStreet3());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>city</column-name><column-value><![CDATA[");
		sb.append(getCity());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>zip</column-name><column-value><![CDATA[");
		sb.append(getZip());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>countryId</column-name><column-value><![CDATA[");
		sb.append(getCountryId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>personalEmail</column-name><column-value><![CDATA[");
		sb.append(getPersonalEmail());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>currentCtc</column-name><column-value><![CDATA[");
		sb.append(getCurrentCtc());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>expectedCtc</column-name><column-value><![CDATA[");
		sb.append(getExpectedCtc());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>noticePeriod</column-name><column-value><![CDATA[");
		sb.append(getNoticePeriod());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>resumeId</column-name><column-value><![CDATA[");
		sb.append(getResumeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>resumePath</column-name><column-value><![CDATA[");
		sb.append(getResumePath());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>employeeProofId</column-name><column-value><![CDATA[");
		sb.append(getEmployeeProofId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>proofNumber</column-name><column-value><![CDATA[");
		sb.append(getProofNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>gender</column-name><column-value><![CDATA[");
		sb.append(getGender());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shortListed</column-name><column-value><![CDATA[");
		sb.append(getShortListed());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createBy</column-name><column-value><![CDATA[");
		sb.append(getCreateBy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedBy</column-name><column-value><![CDATA[");
		sb.append(getModifiedBy());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _candidateId;
	private long _employeeDepartmentId;
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
	private BaseModel<?> _candidateRemoteModel;
}