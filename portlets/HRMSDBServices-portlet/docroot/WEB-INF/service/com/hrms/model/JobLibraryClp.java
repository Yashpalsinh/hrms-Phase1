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
import com.hrms.service.JobLibraryLocalServiceUtil;

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
public class JobLibraryClp extends BaseModelImpl<JobLibrary>
	implements JobLibrary {
	public JobLibraryClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return JobLibrary.class;
	}

	@Override
	public String getModelClassName() {
		return JobLibrary.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _jobLibraryId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setJobLibraryId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _jobLibraryId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("jobLibraryId", getJobLibraryId());
		attributes.put("employeeDepartmentId", getEmployeeDepartmentId());
		attributes.put("jobTitle", getJobTitle());
		attributes.put("jobDescription", getJobDescription());
		attributes.put("responsibility", getResponsibility());
		attributes.put("qualifications", getQualifications());
		attributes.put("numberOfPosition", getNumberOfPosition());
		attributes.put("experience", getExperience());
		attributes.put("salaryStartRange", getSalaryStartRange());
		attributes.put("salaryEndRange", getSalaryEndRange());
		attributes.put("benefits", getBenefits());
		attributes.put("reportsToId", getReportsToId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("createBy", getCreateBy());
		attributes.put("modifiedBy", getModifiedBy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long jobLibraryId = (Long)attributes.get("jobLibraryId");

		if (jobLibraryId != null) {
			setJobLibraryId(jobLibraryId);
		}

		Long employeeDepartmentId = (Long)attributes.get("employeeDepartmentId");

		if (employeeDepartmentId != null) {
			setEmployeeDepartmentId(employeeDepartmentId);
		}

		String jobTitle = (String)attributes.get("jobTitle");

		if (jobTitle != null) {
			setJobTitle(jobTitle);
		}

		String jobDescription = (String)attributes.get("jobDescription");

		if (jobDescription != null) {
			setJobDescription(jobDescription);
		}

		String responsibility = (String)attributes.get("responsibility");

		if (responsibility != null) {
			setResponsibility(responsibility);
		}

		String qualifications = (String)attributes.get("qualifications");

		if (qualifications != null) {
			setQualifications(qualifications);
		}

		Integer numberOfPosition = (Integer)attributes.get("numberOfPosition");

		if (numberOfPosition != null) {
			setNumberOfPosition(numberOfPosition);
		}

		String experience = (String)attributes.get("experience");

		if (experience != null) {
			setExperience(experience);
		}

		Long salaryStartRange = (Long)attributes.get("salaryStartRange");

		if (salaryStartRange != null) {
			setSalaryStartRange(salaryStartRange);
		}

		Long salaryEndRange = (Long)attributes.get("salaryEndRange");

		if (salaryEndRange != null) {
			setSalaryEndRange(salaryEndRange);
		}

		String benefits = (String)attributes.get("benefits");

		if (benefits != null) {
			setBenefits(benefits);
		}

		Long reportsToId = (Long)attributes.get("reportsToId");

		if (reportsToId != null) {
			setReportsToId(reportsToId);
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
	public long getJobLibraryId() {
		return _jobLibraryId;
	}

	@Override
	public void setJobLibraryId(long jobLibraryId) {
		_jobLibraryId = jobLibraryId;

		if (_jobLibraryRemoteModel != null) {
			try {
				Class<?> clazz = _jobLibraryRemoteModel.getClass();

				Method method = clazz.getMethod("setJobLibraryId", long.class);

				method.invoke(_jobLibraryRemoteModel, jobLibraryId);
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

		if (_jobLibraryRemoteModel != null) {
			try {
				Class<?> clazz = _jobLibraryRemoteModel.getClass();

				Method method = clazz.getMethod("setEmployeeDepartmentId",
						long.class);

				method.invoke(_jobLibraryRemoteModel, employeeDepartmentId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getJobTitle() {
		return _jobTitle;
	}

	@Override
	public void setJobTitle(String jobTitle) {
		_jobTitle = jobTitle;

		if (_jobLibraryRemoteModel != null) {
			try {
				Class<?> clazz = _jobLibraryRemoteModel.getClass();

				Method method = clazz.getMethod("setJobTitle", String.class);

				method.invoke(_jobLibraryRemoteModel, jobTitle);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getJobDescription() {
		return _jobDescription;
	}

	@Override
	public void setJobDescription(String jobDescription) {
		_jobDescription = jobDescription;

		if (_jobLibraryRemoteModel != null) {
			try {
				Class<?> clazz = _jobLibraryRemoteModel.getClass();

				Method method = clazz.getMethod("setJobDescription",
						String.class);

				method.invoke(_jobLibraryRemoteModel, jobDescription);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getResponsibility() {
		return _responsibility;
	}

	@Override
	public void setResponsibility(String responsibility) {
		_responsibility = responsibility;

		if (_jobLibraryRemoteModel != null) {
			try {
				Class<?> clazz = _jobLibraryRemoteModel.getClass();

				Method method = clazz.getMethod("setResponsibility",
						String.class);

				method.invoke(_jobLibraryRemoteModel, responsibility);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getQualifications() {
		return _qualifications;
	}

	@Override
	public void setQualifications(String qualifications) {
		_qualifications = qualifications;

		if (_jobLibraryRemoteModel != null) {
			try {
				Class<?> clazz = _jobLibraryRemoteModel.getClass();

				Method method = clazz.getMethod("setQualifications",
						String.class);

				method.invoke(_jobLibraryRemoteModel, qualifications);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getNumberOfPosition() {
		return _numberOfPosition;
	}

	@Override
	public void setNumberOfPosition(int numberOfPosition) {
		_numberOfPosition = numberOfPosition;

		if (_jobLibraryRemoteModel != null) {
			try {
				Class<?> clazz = _jobLibraryRemoteModel.getClass();

				Method method = clazz.getMethod("setNumberOfPosition", int.class);

				method.invoke(_jobLibraryRemoteModel, numberOfPosition);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getExperience() {
		return _experience;
	}

	@Override
	public void setExperience(String experience) {
		_experience = experience;

		if (_jobLibraryRemoteModel != null) {
			try {
				Class<?> clazz = _jobLibraryRemoteModel.getClass();

				Method method = clazz.getMethod("setExperience", String.class);

				method.invoke(_jobLibraryRemoteModel, experience);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getSalaryStartRange() {
		return _salaryStartRange;
	}

	@Override
	public void setSalaryStartRange(long salaryStartRange) {
		_salaryStartRange = salaryStartRange;

		if (_jobLibraryRemoteModel != null) {
			try {
				Class<?> clazz = _jobLibraryRemoteModel.getClass();

				Method method = clazz.getMethod("setSalaryStartRange",
						long.class);

				method.invoke(_jobLibraryRemoteModel, salaryStartRange);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getSalaryEndRange() {
		return _salaryEndRange;
	}

	@Override
	public void setSalaryEndRange(long salaryEndRange) {
		_salaryEndRange = salaryEndRange;

		if (_jobLibraryRemoteModel != null) {
			try {
				Class<?> clazz = _jobLibraryRemoteModel.getClass();

				Method method = clazz.getMethod("setSalaryEndRange", long.class);

				method.invoke(_jobLibraryRemoteModel, salaryEndRange);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getBenefits() {
		return _benefits;
	}

	@Override
	public void setBenefits(String benefits) {
		_benefits = benefits;

		if (_jobLibraryRemoteModel != null) {
			try {
				Class<?> clazz = _jobLibraryRemoteModel.getClass();

				Method method = clazz.getMethod("setBenefits", String.class);

				method.invoke(_jobLibraryRemoteModel, benefits);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getReportsToId() {
		return _reportsToId;
	}

	@Override
	public void setReportsToId(long reportsToId) {
		_reportsToId = reportsToId;

		if (_jobLibraryRemoteModel != null) {
			try {
				Class<?> clazz = _jobLibraryRemoteModel.getClass();

				Method method = clazz.getMethod("setReportsToId", long.class);

				method.invoke(_jobLibraryRemoteModel, reportsToId);
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

		if (_jobLibraryRemoteModel != null) {
			try {
				Class<?> clazz = _jobLibraryRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_jobLibraryRemoteModel, createDate);
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

		if (_jobLibraryRemoteModel != null) {
			try {
				Class<?> clazz = _jobLibraryRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_jobLibraryRemoteModel, modifiedDate);
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

		if (_jobLibraryRemoteModel != null) {
			try {
				Class<?> clazz = _jobLibraryRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateBy", long.class);

				method.invoke(_jobLibraryRemoteModel, createBy);
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

		if (_jobLibraryRemoteModel != null) {
			try {
				Class<?> clazz = _jobLibraryRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedBy", long.class);

				method.invoke(_jobLibraryRemoteModel, modifiedBy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getJobLibraryRemoteModel() {
		return _jobLibraryRemoteModel;
	}

	public void setJobLibraryRemoteModel(BaseModel<?> jobLibraryRemoteModel) {
		_jobLibraryRemoteModel = jobLibraryRemoteModel;
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

		Class<?> remoteModelClass = _jobLibraryRemoteModel.getClass();

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

		Object returnValue = method.invoke(_jobLibraryRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			JobLibraryLocalServiceUtil.addJobLibrary(this);
		}
		else {
			JobLibraryLocalServiceUtil.updateJobLibrary(this);
		}
	}

	@Override
	public JobLibrary toEscapedModel() {
		return (JobLibrary)ProxyUtil.newProxyInstance(JobLibrary.class.getClassLoader(),
			new Class[] { JobLibrary.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		JobLibraryClp clone = new JobLibraryClp();

		clone.setJobLibraryId(getJobLibraryId());
		clone.setEmployeeDepartmentId(getEmployeeDepartmentId());
		clone.setJobTitle(getJobTitle());
		clone.setJobDescription(getJobDescription());
		clone.setResponsibility(getResponsibility());
		clone.setQualifications(getQualifications());
		clone.setNumberOfPosition(getNumberOfPosition());
		clone.setExperience(getExperience());
		clone.setSalaryStartRange(getSalaryStartRange());
		clone.setSalaryEndRange(getSalaryEndRange());
		clone.setBenefits(getBenefits());
		clone.setReportsToId(getReportsToId());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setCreateBy(getCreateBy());
		clone.setModifiedBy(getModifiedBy());

		return clone;
	}

	@Override
	public int compareTo(JobLibrary jobLibrary) {
		long primaryKey = jobLibrary.getPrimaryKey();

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

		if (!(obj instanceof JobLibraryClp)) {
			return false;
		}

		JobLibraryClp jobLibrary = (JobLibraryClp)obj;

		long primaryKey = jobLibrary.getPrimaryKey();

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
		StringBundler sb = new StringBundler(33);

		sb.append("{jobLibraryId=");
		sb.append(getJobLibraryId());
		sb.append(", employeeDepartmentId=");
		sb.append(getEmployeeDepartmentId());
		sb.append(", jobTitle=");
		sb.append(getJobTitle());
		sb.append(", jobDescription=");
		sb.append(getJobDescription());
		sb.append(", responsibility=");
		sb.append(getResponsibility());
		sb.append(", qualifications=");
		sb.append(getQualifications());
		sb.append(", numberOfPosition=");
		sb.append(getNumberOfPosition());
		sb.append(", experience=");
		sb.append(getExperience());
		sb.append(", salaryStartRange=");
		sb.append(getSalaryStartRange());
		sb.append(", salaryEndRange=");
		sb.append(getSalaryEndRange());
		sb.append(", benefits=");
		sb.append(getBenefits());
		sb.append(", reportsToId=");
		sb.append(getReportsToId());
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
		StringBundler sb = new StringBundler(52);

		sb.append("<model><model-name>");
		sb.append("com.hrms.model.JobLibrary");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>jobLibraryId</column-name><column-value><![CDATA[");
		sb.append(getJobLibraryId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>employeeDepartmentId</column-name><column-value><![CDATA[");
		sb.append(getEmployeeDepartmentId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>jobTitle</column-name><column-value><![CDATA[");
		sb.append(getJobTitle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>jobDescription</column-name><column-value><![CDATA[");
		sb.append(getJobDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>responsibility</column-name><column-value><![CDATA[");
		sb.append(getResponsibility());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>qualifications</column-name><column-value><![CDATA[");
		sb.append(getQualifications());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>numberOfPosition</column-name><column-value><![CDATA[");
		sb.append(getNumberOfPosition());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>experience</column-name><column-value><![CDATA[");
		sb.append(getExperience());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>salaryStartRange</column-name><column-value><![CDATA[");
		sb.append(getSalaryStartRange());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>salaryEndRange</column-name><column-value><![CDATA[");
		sb.append(getSalaryEndRange());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>benefits</column-name><column-value><![CDATA[");
		sb.append(getBenefits());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>reportsToId</column-name><column-value><![CDATA[");
		sb.append(getReportsToId());
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

	private long _jobLibraryId;
	private long _employeeDepartmentId;
	private String _jobTitle;
	private String _jobDescription;
	private String _responsibility;
	private String _qualifications;
	private int _numberOfPosition;
	private String _experience;
	private long _salaryStartRange;
	private long _salaryEndRange;
	private String _benefits;
	private long _reportsToId;
	private Date _createDate;
	private Date _modifiedDate;
	private long _createBy;
	private long _modifiedBy;
	private BaseModel<?> _jobLibraryRemoteModel;
}