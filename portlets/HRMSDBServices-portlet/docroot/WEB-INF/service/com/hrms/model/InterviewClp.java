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

import com.hrms.service.ClpSerializer;
import com.hrms.service.InterviewLocalServiceUtil;

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
 * @author bhavik
 */
public class InterviewClp extends BaseModelImpl<Interview> implements Interview {
	public InterviewClp() {
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
	public long getPrimaryKey() {
		return _InterviewId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setInterviewId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _InterviewId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public long getInterviewId() {
		return _InterviewId;
	}

	@Override
	public void setInterviewId(long InterviewId) {
		_InterviewId = InterviewId;

		if (_interviewRemoteModel != null) {
			try {
				Class<?> clazz = _interviewRemoteModel.getClass();

				Method method = clazz.getMethod("setInterviewId", long.class);

				method.invoke(_interviewRemoteModel, InterviewId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCandidateId() {
		return _candidateId;
	}

	@Override
	public void setCandidateId(long candidateId) {
		_candidateId = candidateId;

		if (_interviewRemoteModel != null) {
			try {
				Class<?> clazz = _interviewRemoteModel.getClass();

				Method method = clazz.getMethod("setCandidateId", long.class);

				method.invoke(_interviewRemoteModel, candidateId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getJobLibraryId() {
		return _jobLibraryId;
	}

	@Override
	public void setJobLibraryId(long jobLibraryId) {
		_jobLibraryId = jobLibraryId;

		if (_interviewRemoteModel != null) {
			try {
				Class<?> clazz = _interviewRemoteModel.getClass();

				Method method = clazz.getMethod("setJobLibraryId", long.class);

				method.invoke(_interviewRemoteModel, jobLibraryId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getRoundNumber() {
		return _roundNumber;
	}

	@Override
	public void setRoundNumber(long roundNumber) {
		_roundNumber = roundNumber;

		if (_interviewRemoteModel != null) {
			try {
				Class<?> clazz = _interviewRemoteModel.getClass();

				Method method = clazz.getMethod("setRoundNumber", long.class);

				method.invoke(_interviewRemoteModel, roundNumber);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRoundType() {
		return _roundType;
	}

	@Override
	public void setRoundType(String roundType) {
		_roundType = roundType;

		if (_interviewRemoteModel != null) {
			try {
				Class<?> clazz = _interviewRemoteModel.getClass();

				Method method = clazz.getMethod("setRoundType", String.class);

				method.invoke(_interviewRemoteModel, roundType);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getInterviewerId() {
		return _InterviewerId;
	}

	@Override
	public void setInterviewerId(long InterviewerId) {
		_InterviewerId = InterviewerId;

		if (_interviewRemoteModel != null) {
			try {
				Class<?> clazz = _interviewRemoteModel.getClass();

				Method method = clazz.getMethod("setInterviewerId", long.class);

				method.invoke(_interviewRemoteModel, InterviewerId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getInterviewDate() {
		return _interviewDate;
	}

	@Override
	public void setInterviewDate(Date interviewDate) {
		_interviewDate = interviewDate;

		if (_interviewRemoteModel != null) {
			try {
				Class<?> clazz = _interviewRemoteModel.getClass();

				Method method = clazz.getMethod("setInterviewDate", Date.class);

				method.invoke(_interviewRemoteModel, interviewDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getResult() {
		return _result;
	}

	@Override
	public boolean isResult() {
		return _result;
	}

	@Override
	public void setResult(boolean result) {
		_result = result;

		if (_interviewRemoteModel != null) {
			try {
				Class<?> clazz = _interviewRemoteModel.getClass();

				Method method = clazz.getMethod("setResult", boolean.class);

				method.invoke(_interviewRemoteModel, result);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRemarks() {
		return _remarks;
	}

	@Override
	public void setRemarks(String remarks) {
		_remarks = remarks;

		if (_interviewRemoteModel != null) {
			try {
				Class<?> clazz = _interviewRemoteModel.getClass();

				Method method = clazz.getMethod("setRemarks", String.class);

				method.invoke(_interviewRemoteModel, remarks);
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

		if (_interviewRemoteModel != null) {
			try {
				Class<?> clazz = _interviewRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_interviewRemoteModel, createDate);
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

		if (_interviewRemoteModel != null) {
			try {
				Class<?> clazz = _interviewRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_interviewRemoteModel, modifiedDate);
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

		if (_interviewRemoteModel != null) {
			try {
				Class<?> clazz = _interviewRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateBy", long.class);

				method.invoke(_interviewRemoteModel, createBy);
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

		if (_interviewRemoteModel != null) {
			try {
				Class<?> clazz = _interviewRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedBy", long.class);

				method.invoke(_interviewRemoteModel, modifiedBy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getInterviewRemoteModel() {
		return _interviewRemoteModel;
	}

	public void setInterviewRemoteModel(BaseModel<?> interviewRemoteModel) {
		_interviewRemoteModel = interviewRemoteModel;
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

		Class<?> remoteModelClass = _interviewRemoteModel.getClass();

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

		Object returnValue = method.invoke(_interviewRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			InterviewLocalServiceUtil.addInterview(this);
		}
		else {
			InterviewLocalServiceUtil.updateInterview(this);
		}
	}

	@Override
	public Interview toEscapedModel() {
		return (Interview)ProxyUtil.newProxyInstance(Interview.class.getClassLoader(),
			new Class[] { Interview.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		InterviewClp clone = new InterviewClp();

		clone.setInterviewId(getInterviewId());
		clone.setCandidateId(getCandidateId());
		clone.setJobLibraryId(getJobLibraryId());
		clone.setRoundNumber(getRoundNumber());
		clone.setRoundType(getRoundType());
		clone.setInterviewerId(getInterviewerId());
		clone.setInterviewDate(getInterviewDate());
		clone.setResult(getResult());
		clone.setRemarks(getRemarks());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setCreateBy(getCreateBy());
		clone.setModifiedBy(getModifiedBy());

		return clone;
	}

	@Override
	public int compareTo(Interview interview) {
		long primaryKey = interview.getPrimaryKey();

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

		if (!(obj instanceof InterviewClp)) {
			return false;
		}

		InterviewClp interview = (InterviewClp)obj;

		long primaryKey = interview.getPrimaryKey();

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
		StringBundler sb = new StringBundler(27);

		sb.append("{InterviewId=");
		sb.append(getInterviewId());
		sb.append(", candidateId=");
		sb.append(getCandidateId());
		sb.append(", jobLibraryId=");
		sb.append(getJobLibraryId());
		sb.append(", roundNumber=");
		sb.append(getRoundNumber());
		sb.append(", roundType=");
		sb.append(getRoundType());
		sb.append(", InterviewerId=");
		sb.append(getInterviewerId());
		sb.append(", interviewDate=");
		sb.append(getInterviewDate());
		sb.append(", result=");
		sb.append(getResult());
		sb.append(", remarks=");
		sb.append(getRemarks());
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
		StringBundler sb = new StringBundler(43);

		sb.append("<model><model-name>");
		sb.append("com.hrms.model.Interview");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>InterviewId</column-name><column-value><![CDATA[");
		sb.append(getInterviewId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>candidateId</column-name><column-value><![CDATA[");
		sb.append(getCandidateId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>jobLibraryId</column-name><column-value><![CDATA[");
		sb.append(getJobLibraryId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>roundNumber</column-name><column-value><![CDATA[");
		sb.append(getRoundNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>roundType</column-name><column-value><![CDATA[");
		sb.append(getRoundType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>InterviewerId</column-name><column-value><![CDATA[");
		sb.append(getInterviewerId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>interviewDate</column-name><column-value><![CDATA[");
		sb.append(getInterviewDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>result</column-name><column-value><![CDATA[");
		sb.append(getResult());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>remarks</column-name><column-value><![CDATA[");
		sb.append(getRemarks());
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
	private BaseModel<?> _interviewRemoteModel;
}