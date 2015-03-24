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
 * This class is a wrapper for {@link Interview}.
 * </p>
 *
 * @author bhavik
 * @see Interview
 * @generated
 */
public class InterviewWrapper implements Interview, ModelWrapper<Interview> {
	public InterviewWrapper(Interview interview) {
		_interview = interview;
	}

	@Override
	public Class<?> getModelClass() {
		return Interview.class;
	}

	@Override
	public String getModelClassName() {
		return Interview.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("InterviewId", getInterviewId());
		attributes.put("candidateId", getCandidateId());
		attributes.put("jobLibraryId", getJobLibraryId());
		attributes.put("roundNumber", getRoundNumber());
		attributes.put("roundType", getRoundType());
		attributes.put("InterviewerId", getInterviewerId());
		attributes.put("interviewDate", getInterviewDate());
		attributes.put("result", getResult());
		attributes.put("remarks", getRemarks());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("createBy", getCreateBy());
		attributes.put("modifiedBy", getModifiedBy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long InterviewId = (Long)attributes.get("InterviewId");

		if (InterviewId != null) {
			setInterviewId(InterviewId);
		}

		Long candidateId = (Long)attributes.get("candidateId");

		if (candidateId != null) {
			setCandidateId(candidateId);
		}

		Long jobLibraryId = (Long)attributes.get("jobLibraryId");

		if (jobLibraryId != null) {
			setJobLibraryId(jobLibraryId);
		}

		Long roundNumber = (Long)attributes.get("roundNumber");

		if (roundNumber != null) {
			setRoundNumber(roundNumber);
		}

		String roundType = (String)attributes.get("roundType");

		if (roundType != null) {
			setRoundType(roundType);
		}

		Long InterviewerId = (Long)attributes.get("InterviewerId");

		if (InterviewerId != null) {
			setInterviewerId(InterviewerId);
		}

		Date interviewDate = (Date)attributes.get("interviewDate");

		if (interviewDate != null) {
			setInterviewDate(interviewDate);
		}

		Boolean result = (Boolean)attributes.get("result");

		if (result != null) {
			setResult(result);
		}

		String remarks = (String)attributes.get("remarks");

		if (remarks != null) {
			setRemarks(remarks);
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
	* Returns the primary key of this interview.
	*
	* @return the primary key of this interview
	*/
	@Override
	public long getPrimaryKey() {
		return _interview.getPrimaryKey();
	}

	/**
	* Sets the primary key of this interview.
	*
	* @param primaryKey the primary key of this interview
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_interview.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the interview ID of this interview.
	*
	* @return the interview ID of this interview
	*/
	@Override
	public long getInterviewId() {
		return _interview.getInterviewId();
	}

	/**
	* Sets the interview ID of this interview.
	*
	* @param InterviewId the interview ID of this interview
	*/
	@Override
	public void setInterviewId(long InterviewId) {
		_interview.setInterviewId(InterviewId);
	}

	/**
	* Returns the candidate ID of this interview.
	*
	* @return the candidate ID of this interview
	*/
	@Override
	public long getCandidateId() {
		return _interview.getCandidateId();
	}

	/**
	* Sets the candidate ID of this interview.
	*
	* @param candidateId the candidate ID of this interview
	*/
	@Override
	public void setCandidateId(long candidateId) {
		_interview.setCandidateId(candidateId);
	}

	/**
	* Returns the job library ID of this interview.
	*
	* @return the job library ID of this interview
	*/
	@Override
	public long getJobLibraryId() {
		return _interview.getJobLibraryId();
	}

	/**
	* Sets the job library ID of this interview.
	*
	* @param jobLibraryId the job library ID of this interview
	*/
	@Override
	public void setJobLibraryId(long jobLibraryId) {
		_interview.setJobLibraryId(jobLibraryId);
	}

	/**
	* Returns the round number of this interview.
	*
	* @return the round number of this interview
	*/
	@Override
	public long getRoundNumber() {
		return _interview.getRoundNumber();
	}

	/**
	* Sets the round number of this interview.
	*
	* @param roundNumber the round number of this interview
	*/
	@Override
	public void setRoundNumber(long roundNumber) {
		_interview.setRoundNumber(roundNumber);
	}

	/**
	* Returns the round type of this interview.
	*
	* @return the round type of this interview
	*/
	@Override
	public java.lang.String getRoundType() {
		return _interview.getRoundType();
	}

	/**
	* Sets the round type of this interview.
	*
	* @param roundType the round type of this interview
	*/
	@Override
	public void setRoundType(java.lang.String roundType) {
		_interview.setRoundType(roundType);
	}

	/**
	* Returns the interviewer ID of this interview.
	*
	* @return the interviewer ID of this interview
	*/
	@Override
	public long getInterviewerId() {
		return _interview.getInterviewerId();
	}

	/**
	* Sets the interviewer ID of this interview.
	*
	* @param InterviewerId the interviewer ID of this interview
	*/
	@Override
	public void setInterviewerId(long InterviewerId) {
		_interview.setInterviewerId(InterviewerId);
	}

	/**
	* Returns the interview date of this interview.
	*
	* @return the interview date of this interview
	*/
	@Override
	public java.util.Date getInterviewDate() {
		return _interview.getInterviewDate();
	}

	/**
	* Sets the interview date of this interview.
	*
	* @param interviewDate the interview date of this interview
	*/
	@Override
	public void setInterviewDate(java.util.Date interviewDate) {
		_interview.setInterviewDate(interviewDate);
	}

	/**
	* Returns the result of this interview.
	*
	* @return the result of this interview
	*/
	@Override
	public boolean getResult() {
		return _interview.getResult();
	}

	/**
	* Returns <code>true</code> if this interview is result.
	*
	* @return <code>true</code> if this interview is result; <code>false</code> otherwise
	*/
	@Override
	public boolean isResult() {
		return _interview.isResult();
	}

	/**
	* Sets whether this interview is result.
	*
	* @param result the result of this interview
	*/
	@Override
	public void setResult(boolean result) {
		_interview.setResult(result);
	}

	/**
	* Returns the remarks of this interview.
	*
	* @return the remarks of this interview
	*/
	@Override
	public java.lang.String getRemarks() {
		return _interview.getRemarks();
	}

	/**
	* Sets the remarks of this interview.
	*
	* @param remarks the remarks of this interview
	*/
	@Override
	public void setRemarks(java.lang.String remarks) {
		_interview.setRemarks(remarks);
	}

	/**
	* Returns the create date of this interview.
	*
	* @return the create date of this interview
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _interview.getCreateDate();
	}

	/**
	* Sets the create date of this interview.
	*
	* @param createDate the create date of this interview
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_interview.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this interview.
	*
	* @return the modified date of this interview
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _interview.getModifiedDate();
	}

	/**
	* Sets the modified date of this interview.
	*
	* @param modifiedDate the modified date of this interview
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_interview.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the create by of this interview.
	*
	* @return the create by of this interview
	*/
	@Override
	public long getCreateBy() {
		return _interview.getCreateBy();
	}

	/**
	* Sets the create by of this interview.
	*
	* @param createBy the create by of this interview
	*/
	@Override
	public void setCreateBy(long createBy) {
		_interview.setCreateBy(createBy);
	}

	/**
	* Returns the modified by of this interview.
	*
	* @return the modified by of this interview
	*/
	@Override
	public long getModifiedBy() {
		return _interview.getModifiedBy();
	}

	/**
	* Sets the modified by of this interview.
	*
	* @param modifiedBy the modified by of this interview
	*/
	@Override
	public void setModifiedBy(long modifiedBy) {
		_interview.setModifiedBy(modifiedBy);
	}

	@Override
	public boolean isNew() {
		return _interview.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_interview.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _interview.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_interview.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _interview.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _interview.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_interview.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _interview.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_interview.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_interview.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_interview.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new InterviewWrapper((Interview)_interview.clone());
	}

	@Override
	public int compareTo(com.hrms.model.Interview interview) {
		return _interview.compareTo(interview);
	}

	@Override
	public int hashCode() {
		return _interview.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.hrms.model.Interview> toCacheModel() {
		return _interview.toCacheModel();
	}

	@Override
	public com.hrms.model.Interview toEscapedModel() {
		return new InterviewWrapper(_interview.toEscapedModel());
	}

	@Override
	public com.hrms.model.Interview toUnescapedModel() {
		return new InterviewWrapper(_interview.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _interview.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _interview.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_interview.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof InterviewWrapper)) {
			return false;
		}

		InterviewWrapper interviewWrapper = (InterviewWrapper)obj;

		if (Validator.equals(_interview, interviewWrapper._interview)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Interview getWrappedInterview() {
		return _interview;
	}

	@Override
	public Interview getWrappedModel() {
		return _interview;
	}

	@Override
	public void resetOriginalValues() {
		_interview.resetOriginalValues();
	}

	private Interview _interview;
}