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

import com.hrms.service.CandidateQualificationLocalServiceUtil;
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
public class CandidateQualificationClp extends BaseModelImpl<CandidateQualification>
	implements CandidateQualification {
	public CandidateQualificationClp() {
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
	public long getPrimaryKey() {
		return _candidateQualificationId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setCandidateQualificationId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _candidateQualificationId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public long getCandidateQualificationId() {
		return _candidateQualificationId;
	}

	@Override
	public void setCandidateQualificationId(long candidateQualificationId) {
		_candidateQualificationId = candidateQualificationId;

		if (_candidateQualificationRemoteModel != null) {
			try {
				Class<?> clazz = _candidateQualificationRemoteModel.getClass();

				Method method = clazz.getMethod("setCandidateQualificationId",
						long.class);

				method.invoke(_candidateQualificationRemoteModel,
					candidateQualificationId);
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

		if (_candidateQualificationRemoteModel != null) {
			try {
				Class<?> clazz = _candidateQualificationRemoteModel.getClass();

				Method method = clazz.getMethod("setCandidateId", long.class);

				method.invoke(_candidateQualificationRemoteModel, candidateId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDegreeName() {
		return _degreeName;
	}

	@Override
	public void setDegreeName(String degreeName) {
		_degreeName = degreeName;

		if (_candidateQualificationRemoteModel != null) {
			try {
				Class<?> clazz = _candidateQualificationRemoteModel.getClass();

				Method method = clazz.getMethod("setDegreeName", String.class);

				method.invoke(_candidateQualificationRemoteModel, degreeName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMainSubject() {
		return _mainSubject;
	}

	@Override
	public void setMainSubject(String mainSubject) {
		_mainSubject = mainSubject;

		if (_candidateQualificationRemoteModel != null) {
			try {
				Class<?> clazz = _candidateQualificationRemoteModel.getClass();

				Method method = clazz.getMethod("setMainSubject", String.class);

				method.invoke(_candidateQualificationRemoteModel, mainSubject);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUniversity() {
		return _university;
	}

	@Override
	public void setUniversity(String university) {
		_university = university;

		if (_candidateQualificationRemoteModel != null) {
			try {
				Class<?> clazz = _candidateQualificationRemoteModel.getClass();

				Method method = clazz.getMethod("setUniversity", String.class);

				method.invoke(_candidateQualificationRemoteModel, university);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getScore() {
		return _score;
	}

	@Override
	public void setScore(String score) {
		_score = score;

		if (_candidateQualificationRemoteModel != null) {
			try {
				Class<?> clazz = _candidateQualificationRemoteModel.getClass();

				Method method = clazz.getMethod("setScore", String.class);

				method.invoke(_candidateQualificationRemoteModel, score);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getStartDate() {
		return _startDate;
	}

	@Override
	public void setStartDate(Date startDate) {
		_startDate = startDate;

		if (_candidateQualificationRemoteModel != null) {
			try {
				Class<?> clazz = _candidateQualificationRemoteModel.getClass();

				Method method = clazz.getMethod("setStartDate", Date.class);

				method.invoke(_candidateQualificationRemoteModel, startDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getEndDate() {
		return _endDate;
	}

	@Override
	public void setEndDate(Date endDate) {
		_endDate = endDate;

		if (_candidateQualificationRemoteModel != null) {
			try {
				Class<?> clazz = _candidateQualificationRemoteModel.getClass();

				Method method = clazz.getMethod("setEndDate", Date.class);

				method.invoke(_candidateQualificationRemoteModel, endDate);
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

		if (_candidateQualificationRemoteModel != null) {
			try {
				Class<?> clazz = _candidateQualificationRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_candidateQualificationRemoteModel, createDate);
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

		if (_candidateQualificationRemoteModel != null) {
			try {
				Class<?> clazz = _candidateQualificationRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_candidateQualificationRemoteModel, modifiedDate);
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

		if (_candidateQualificationRemoteModel != null) {
			try {
				Class<?> clazz = _candidateQualificationRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateBy", long.class);

				method.invoke(_candidateQualificationRemoteModel, createBy);
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

		if (_candidateQualificationRemoteModel != null) {
			try {
				Class<?> clazz = _candidateQualificationRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedBy", long.class);

				method.invoke(_candidateQualificationRemoteModel, modifiedBy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getCandidateQualificationRemoteModel() {
		return _candidateQualificationRemoteModel;
	}

	public void setCandidateQualificationRemoteModel(
		BaseModel<?> candidateQualificationRemoteModel) {
		_candidateQualificationRemoteModel = candidateQualificationRemoteModel;
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

		Class<?> remoteModelClass = _candidateQualificationRemoteModel.getClass();

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

		Object returnValue = method.invoke(_candidateQualificationRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			CandidateQualificationLocalServiceUtil.addCandidateQualification(this);
		}
		else {
			CandidateQualificationLocalServiceUtil.updateCandidateQualification(this);
		}
	}

	@Override
	public CandidateQualification toEscapedModel() {
		return (CandidateQualification)ProxyUtil.newProxyInstance(CandidateQualification.class.getClassLoader(),
			new Class[] { CandidateQualification.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		CandidateQualificationClp clone = new CandidateQualificationClp();

		clone.setCandidateQualificationId(getCandidateQualificationId());
		clone.setCandidateId(getCandidateId());
		clone.setDegreeName(getDegreeName());
		clone.setMainSubject(getMainSubject());
		clone.setUniversity(getUniversity());
		clone.setScore(getScore());
		clone.setStartDate(getStartDate());
		clone.setEndDate(getEndDate());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setCreateBy(getCreateBy());
		clone.setModifiedBy(getModifiedBy());

		return clone;
	}

	@Override
	public int compareTo(CandidateQualification candidateQualification) {
		long primaryKey = candidateQualification.getPrimaryKey();

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

		if (!(obj instanceof CandidateQualificationClp)) {
			return false;
		}

		CandidateQualificationClp candidateQualification = (CandidateQualificationClp)obj;

		long primaryKey = candidateQualification.getPrimaryKey();

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
		StringBundler sb = new StringBundler(25);

		sb.append("{candidateQualificationId=");
		sb.append(getCandidateQualificationId());
		sb.append(", candidateId=");
		sb.append(getCandidateId());
		sb.append(", degreeName=");
		sb.append(getDegreeName());
		sb.append(", mainSubject=");
		sb.append(getMainSubject());
		sb.append(", university=");
		sb.append(getUniversity());
		sb.append(", score=");
		sb.append(getScore());
		sb.append(", startDate=");
		sb.append(getStartDate());
		sb.append(", endDate=");
		sb.append(getEndDate());
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
		StringBundler sb = new StringBundler(40);

		sb.append("<model><model-name>");
		sb.append("com.hrms.model.CandidateQualification");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>candidateQualificationId</column-name><column-value><![CDATA[");
		sb.append(getCandidateQualificationId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>candidateId</column-name><column-value><![CDATA[");
		sb.append(getCandidateId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>degreeName</column-name><column-value><![CDATA[");
		sb.append(getDegreeName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>mainSubject</column-name><column-value><![CDATA[");
		sb.append(getMainSubject());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>university</column-name><column-value><![CDATA[");
		sb.append(getUniversity());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>score</column-name><column-value><![CDATA[");
		sb.append(getScore());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>startDate</column-name><column-value><![CDATA[");
		sb.append(getStartDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>endDate</column-name><column-value><![CDATA[");
		sb.append(getEndDate());
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
	private BaseModel<?> _candidateQualificationRemoteModel;
}