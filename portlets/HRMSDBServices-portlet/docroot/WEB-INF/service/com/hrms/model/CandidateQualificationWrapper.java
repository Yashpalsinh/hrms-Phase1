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
 * This class is a wrapper for {@link CandidateQualification}.
 * </p>
 *
 * @author bhavik
 * @see CandidateQualification
 * @generated
 */
public class CandidateQualificationWrapper implements CandidateQualification,
	ModelWrapper<CandidateQualification> {
	public CandidateQualificationWrapper(
		CandidateQualification candidateQualification) {
		_candidateQualification = candidateQualification;
	}

	@Override
	public Class<?> getModelClass() {
		return CandidateQualification.class;
	}

	@Override
	public String getModelClassName() {
		return CandidateQualification.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("candidateQualificationId", getCandidateQualificationId());
		attributes.put("candidateId", getCandidateId());
		attributes.put("degreeName", getDegreeName());
		attributes.put("mainSubject", getMainSubject());
		attributes.put("university", getUniversity());
		attributes.put("score", getScore());
		attributes.put("startDate", getStartDate());
		attributes.put("endDate", getEndDate());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("createBy", getCreateBy());
		attributes.put("modifiedBy", getModifiedBy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long candidateQualificationId = (Long)attributes.get(
				"candidateQualificationId");

		if (candidateQualificationId != null) {
			setCandidateQualificationId(candidateQualificationId);
		}

		Long candidateId = (Long)attributes.get("candidateId");

		if (candidateId != null) {
			setCandidateId(candidateId);
		}

		String degreeName = (String)attributes.get("degreeName");

		if (degreeName != null) {
			setDegreeName(degreeName);
		}

		String mainSubject = (String)attributes.get("mainSubject");

		if (mainSubject != null) {
			setMainSubject(mainSubject);
		}

		String university = (String)attributes.get("university");

		if (university != null) {
			setUniversity(university);
		}

		String score = (String)attributes.get("score");

		if (score != null) {
			setScore(score);
		}

		Date startDate = (Date)attributes.get("startDate");

		if (startDate != null) {
			setStartDate(startDate);
		}

		Date endDate = (Date)attributes.get("endDate");

		if (endDate != null) {
			setEndDate(endDate);
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
	* Returns the primary key of this candidate qualification.
	*
	* @return the primary key of this candidate qualification
	*/
	@Override
	public long getPrimaryKey() {
		return _candidateQualification.getPrimaryKey();
	}

	/**
	* Sets the primary key of this candidate qualification.
	*
	* @param primaryKey the primary key of this candidate qualification
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_candidateQualification.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the candidate qualification ID of this candidate qualification.
	*
	* @return the candidate qualification ID of this candidate qualification
	*/
	@Override
	public long getCandidateQualificationId() {
		return _candidateQualification.getCandidateQualificationId();
	}

	/**
	* Sets the candidate qualification ID of this candidate qualification.
	*
	* @param candidateQualificationId the candidate qualification ID of this candidate qualification
	*/
	@Override
	public void setCandidateQualificationId(long candidateQualificationId) {
		_candidateQualification.setCandidateQualificationId(candidateQualificationId);
	}

	/**
	* Returns the candidate ID of this candidate qualification.
	*
	* @return the candidate ID of this candidate qualification
	*/
	@Override
	public long getCandidateId() {
		return _candidateQualification.getCandidateId();
	}

	/**
	* Sets the candidate ID of this candidate qualification.
	*
	* @param candidateId the candidate ID of this candidate qualification
	*/
	@Override
	public void setCandidateId(long candidateId) {
		_candidateQualification.setCandidateId(candidateId);
	}

	/**
	* Returns the degree name of this candidate qualification.
	*
	* @return the degree name of this candidate qualification
	*/
	@Override
	public java.lang.String getDegreeName() {
		return _candidateQualification.getDegreeName();
	}

	/**
	* Sets the degree name of this candidate qualification.
	*
	* @param degreeName the degree name of this candidate qualification
	*/
	@Override
	public void setDegreeName(java.lang.String degreeName) {
		_candidateQualification.setDegreeName(degreeName);
	}

	/**
	* Returns the main subject of this candidate qualification.
	*
	* @return the main subject of this candidate qualification
	*/
	@Override
	public java.lang.String getMainSubject() {
		return _candidateQualification.getMainSubject();
	}

	/**
	* Sets the main subject of this candidate qualification.
	*
	* @param mainSubject the main subject of this candidate qualification
	*/
	@Override
	public void setMainSubject(java.lang.String mainSubject) {
		_candidateQualification.setMainSubject(mainSubject);
	}

	/**
	* Returns the university of this candidate qualification.
	*
	* @return the university of this candidate qualification
	*/
	@Override
	public java.lang.String getUniversity() {
		return _candidateQualification.getUniversity();
	}

	/**
	* Sets the university of this candidate qualification.
	*
	* @param university the university of this candidate qualification
	*/
	@Override
	public void setUniversity(java.lang.String university) {
		_candidateQualification.setUniversity(university);
	}

	/**
	* Returns the score of this candidate qualification.
	*
	* @return the score of this candidate qualification
	*/
	@Override
	public java.lang.String getScore() {
		return _candidateQualification.getScore();
	}

	/**
	* Sets the score of this candidate qualification.
	*
	* @param score the score of this candidate qualification
	*/
	@Override
	public void setScore(java.lang.String score) {
		_candidateQualification.setScore(score);
	}

	/**
	* Returns the start date of this candidate qualification.
	*
	* @return the start date of this candidate qualification
	*/
	@Override
	public java.util.Date getStartDate() {
		return _candidateQualification.getStartDate();
	}

	/**
	* Sets the start date of this candidate qualification.
	*
	* @param startDate the start date of this candidate qualification
	*/
	@Override
	public void setStartDate(java.util.Date startDate) {
		_candidateQualification.setStartDate(startDate);
	}

	/**
	* Returns the end date of this candidate qualification.
	*
	* @return the end date of this candidate qualification
	*/
	@Override
	public java.util.Date getEndDate() {
		return _candidateQualification.getEndDate();
	}

	/**
	* Sets the end date of this candidate qualification.
	*
	* @param endDate the end date of this candidate qualification
	*/
	@Override
	public void setEndDate(java.util.Date endDate) {
		_candidateQualification.setEndDate(endDate);
	}

	/**
	* Returns the create date of this candidate qualification.
	*
	* @return the create date of this candidate qualification
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _candidateQualification.getCreateDate();
	}

	/**
	* Sets the create date of this candidate qualification.
	*
	* @param createDate the create date of this candidate qualification
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_candidateQualification.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this candidate qualification.
	*
	* @return the modified date of this candidate qualification
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _candidateQualification.getModifiedDate();
	}

	/**
	* Sets the modified date of this candidate qualification.
	*
	* @param modifiedDate the modified date of this candidate qualification
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_candidateQualification.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the create by of this candidate qualification.
	*
	* @return the create by of this candidate qualification
	*/
	@Override
	public long getCreateBy() {
		return _candidateQualification.getCreateBy();
	}

	/**
	* Sets the create by of this candidate qualification.
	*
	* @param createBy the create by of this candidate qualification
	*/
	@Override
	public void setCreateBy(long createBy) {
		_candidateQualification.setCreateBy(createBy);
	}

	/**
	* Returns the modified by of this candidate qualification.
	*
	* @return the modified by of this candidate qualification
	*/
	@Override
	public long getModifiedBy() {
		return _candidateQualification.getModifiedBy();
	}

	/**
	* Sets the modified by of this candidate qualification.
	*
	* @param modifiedBy the modified by of this candidate qualification
	*/
	@Override
	public void setModifiedBy(long modifiedBy) {
		_candidateQualification.setModifiedBy(modifiedBy);
	}

	@Override
	public boolean isNew() {
		return _candidateQualification.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_candidateQualification.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _candidateQualification.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_candidateQualification.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _candidateQualification.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _candidateQualification.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_candidateQualification.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _candidateQualification.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_candidateQualification.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_candidateQualification.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_candidateQualification.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new CandidateQualificationWrapper((CandidateQualification)_candidateQualification.clone());
	}

	@Override
	public int compareTo(
		com.hrms.model.CandidateQualification candidateQualification) {
		return _candidateQualification.compareTo(candidateQualification);
	}

	@Override
	public int hashCode() {
		return _candidateQualification.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.hrms.model.CandidateQualification> toCacheModel() {
		return _candidateQualification.toCacheModel();
	}

	@Override
	public com.hrms.model.CandidateQualification toEscapedModel() {
		return new CandidateQualificationWrapper(_candidateQualification.toEscapedModel());
	}

	@Override
	public com.hrms.model.CandidateQualification toUnescapedModel() {
		return new CandidateQualificationWrapper(_candidateQualification.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _candidateQualification.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _candidateQualification.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_candidateQualification.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CandidateQualificationWrapper)) {
			return false;
		}

		CandidateQualificationWrapper candidateQualificationWrapper = (CandidateQualificationWrapper)obj;

		if (Validator.equals(_candidateQualification,
					candidateQualificationWrapper._candidateQualification)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public CandidateQualification getWrappedCandidateQualification() {
		return _candidateQualification;
	}

	@Override
	public CandidateQualification getWrappedModel() {
		return _candidateQualification;
	}

	@Override
	public void resetOriginalValues() {
		_candidateQualification.resetOriginalValues();
	}

	private CandidateQualification _candidateQualification;
}