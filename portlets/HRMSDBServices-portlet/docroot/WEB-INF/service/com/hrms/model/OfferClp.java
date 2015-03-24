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
import com.hrms.service.OfferLocalServiceUtil;

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
public class OfferClp extends BaseModelImpl<Offer> implements Offer {
	public OfferClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return Offer.class;
	}

	@Override
	public String getModelClassName() {
		return Offer.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _OfferId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setOfferId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _OfferId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("OfferId", getOfferId());
		attributes.put("candidateId", getCandidateId());
		attributes.put("employeeDepartmentId", getEmployeeDepartmentId());
		attributes.put("employeeSubDepartmentId", getEmployeeSubDepartmentId());
		attributes.put("employeeDesignationId", getEmployeeDesignationId());
		attributes.put("employeeTypeId", getEmployeeTypeId());
		attributes.put("salary", getSalary());
		attributes.put("joiningDate", getJoiningDate());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("createBy", getCreateBy());
		attributes.put("modifiedBy", getModifiedBy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long OfferId = (Long)attributes.get("OfferId");

		if (OfferId != null) {
			setOfferId(OfferId);
		}

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

		Long employeeTypeId = (Long)attributes.get("employeeTypeId");

		if (employeeTypeId != null) {
			setEmployeeTypeId(employeeTypeId);
		}

		Long salary = (Long)attributes.get("salary");

		if (salary != null) {
			setSalary(salary);
		}

		Date joiningDate = (Date)attributes.get("joiningDate");

		if (joiningDate != null) {
			setJoiningDate(joiningDate);
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
	public long getOfferId() {
		return _OfferId;
	}

	@Override
	public void setOfferId(long OfferId) {
		_OfferId = OfferId;

		if (_offerRemoteModel != null) {
			try {
				Class<?> clazz = _offerRemoteModel.getClass();

				Method method = clazz.getMethod("setOfferId", long.class);

				method.invoke(_offerRemoteModel, OfferId);
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

		if (_offerRemoteModel != null) {
			try {
				Class<?> clazz = _offerRemoteModel.getClass();

				Method method = clazz.getMethod("setCandidateId", long.class);

				method.invoke(_offerRemoteModel, candidateId);
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

		if (_offerRemoteModel != null) {
			try {
				Class<?> clazz = _offerRemoteModel.getClass();

				Method method = clazz.getMethod("setEmployeeDepartmentId",
						long.class);

				method.invoke(_offerRemoteModel, employeeDepartmentId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getEmployeeSubDepartmentId() {
		return _employeeSubDepartmentId;
	}

	@Override
	public void setEmployeeSubDepartmentId(long employeeSubDepartmentId) {
		_employeeSubDepartmentId = employeeSubDepartmentId;

		if (_offerRemoteModel != null) {
			try {
				Class<?> clazz = _offerRemoteModel.getClass();

				Method method = clazz.getMethod("setEmployeeSubDepartmentId",
						long.class);

				method.invoke(_offerRemoteModel, employeeSubDepartmentId);
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

		if (_offerRemoteModel != null) {
			try {
				Class<?> clazz = _offerRemoteModel.getClass();

				Method method = clazz.getMethod("setEmployeeDesignationId",
						long.class);

				method.invoke(_offerRemoteModel, employeeDesignationId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getEmployeeTypeId() {
		return _employeeTypeId;
	}

	@Override
	public void setEmployeeTypeId(long employeeTypeId) {
		_employeeTypeId = employeeTypeId;

		if (_offerRemoteModel != null) {
			try {
				Class<?> clazz = _offerRemoteModel.getClass();

				Method method = clazz.getMethod("setEmployeeTypeId", long.class);

				method.invoke(_offerRemoteModel, employeeTypeId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getSalary() {
		return _salary;
	}

	@Override
	public void setSalary(long salary) {
		_salary = salary;

		if (_offerRemoteModel != null) {
			try {
				Class<?> clazz = _offerRemoteModel.getClass();

				Method method = clazz.getMethod("setSalary", long.class);

				method.invoke(_offerRemoteModel, salary);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getJoiningDate() {
		return _joiningDate;
	}

	@Override
	public void setJoiningDate(Date joiningDate) {
		_joiningDate = joiningDate;

		if (_offerRemoteModel != null) {
			try {
				Class<?> clazz = _offerRemoteModel.getClass();

				Method method = clazz.getMethod("setJoiningDate", Date.class);

				method.invoke(_offerRemoteModel, joiningDate);
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

		if (_offerRemoteModel != null) {
			try {
				Class<?> clazz = _offerRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_offerRemoteModel, createDate);
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

		if (_offerRemoteModel != null) {
			try {
				Class<?> clazz = _offerRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_offerRemoteModel, modifiedDate);
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

		if (_offerRemoteModel != null) {
			try {
				Class<?> clazz = _offerRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateBy", long.class);

				method.invoke(_offerRemoteModel, createBy);
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

		if (_offerRemoteModel != null) {
			try {
				Class<?> clazz = _offerRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedBy", long.class);

				method.invoke(_offerRemoteModel, modifiedBy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getOfferRemoteModel() {
		return _offerRemoteModel;
	}

	public void setOfferRemoteModel(BaseModel<?> offerRemoteModel) {
		_offerRemoteModel = offerRemoteModel;
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

		Class<?> remoteModelClass = _offerRemoteModel.getClass();

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

		Object returnValue = method.invoke(_offerRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			OfferLocalServiceUtil.addOffer(this);
		}
		else {
			OfferLocalServiceUtil.updateOffer(this);
		}
	}

	@Override
	public Offer toEscapedModel() {
		return (Offer)ProxyUtil.newProxyInstance(Offer.class.getClassLoader(),
			new Class[] { Offer.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		OfferClp clone = new OfferClp();

		clone.setOfferId(getOfferId());
		clone.setCandidateId(getCandidateId());
		clone.setEmployeeDepartmentId(getEmployeeDepartmentId());
		clone.setEmployeeSubDepartmentId(getEmployeeSubDepartmentId());
		clone.setEmployeeDesignationId(getEmployeeDesignationId());
		clone.setEmployeeTypeId(getEmployeeTypeId());
		clone.setSalary(getSalary());
		clone.setJoiningDate(getJoiningDate());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setCreateBy(getCreateBy());
		clone.setModifiedBy(getModifiedBy());

		return clone;
	}

	@Override
	public int compareTo(Offer offer) {
		long primaryKey = offer.getPrimaryKey();

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

		if (!(obj instanceof OfferClp)) {
			return false;
		}

		OfferClp offer = (OfferClp)obj;

		long primaryKey = offer.getPrimaryKey();

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

		sb.append("{OfferId=");
		sb.append(getOfferId());
		sb.append(", candidateId=");
		sb.append(getCandidateId());
		sb.append(", employeeDepartmentId=");
		sb.append(getEmployeeDepartmentId());
		sb.append(", employeeSubDepartmentId=");
		sb.append(getEmployeeSubDepartmentId());
		sb.append(", employeeDesignationId=");
		sb.append(getEmployeeDesignationId());
		sb.append(", employeeTypeId=");
		sb.append(getEmployeeTypeId());
		sb.append(", salary=");
		sb.append(getSalary());
		sb.append(", joiningDate=");
		sb.append(getJoiningDate());
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
		sb.append("com.hrms.model.Offer");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>OfferId</column-name><column-value><![CDATA[");
		sb.append(getOfferId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>candidateId</column-name><column-value><![CDATA[");
		sb.append(getCandidateId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>employeeDepartmentId</column-name><column-value><![CDATA[");
		sb.append(getEmployeeDepartmentId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>employeeSubDepartmentId</column-name><column-value><![CDATA[");
		sb.append(getEmployeeSubDepartmentId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>employeeDesignationId</column-name><column-value><![CDATA[");
		sb.append(getEmployeeDesignationId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>employeeTypeId</column-name><column-value><![CDATA[");
		sb.append(getEmployeeTypeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>salary</column-name><column-value><![CDATA[");
		sb.append(getSalary());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>joiningDate</column-name><column-value><![CDATA[");
		sb.append(getJoiningDate());
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

	private long _OfferId;
	private long _candidateId;
	private long _employeeDepartmentId;
	private long _employeeSubDepartmentId;
	private long _employeeDesignationId;
	private long _employeeTypeId;
	private long _salary;
	private Date _joiningDate;
	private Date _createDate;
	private Date _modifiedDate;
	private long _createBy;
	private long _modifiedBy;
	private BaseModel<?> _offerRemoteModel;
}