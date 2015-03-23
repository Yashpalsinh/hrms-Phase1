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
import com.hrms.service.EmployeeProofLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author yashpalsinh
 */
public class EmployeeProofClp extends BaseModelImpl<EmployeeProof>
	implements EmployeeProof {
	public EmployeeProofClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return EmployeeProof.class;
	}

	@Override
	public String getModelClassName() {
		return EmployeeProof.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _employeeproofNo;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setEmployeeproofNo(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _employeeproofNo;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("employeeproofNo", getEmployeeproofNo());
		attributes.put("proofId", getProofId());
		attributes.put("userId", getUserId());
		attributes.put("expirationDate", getExpirationDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long employeeproofNo = (Long)attributes.get("employeeproofNo");

		if (employeeproofNo != null) {
			setEmployeeproofNo(employeeproofNo);
		}

		Long proofId = (Long)attributes.get("proofId");

		if (proofId != null) {
			setProofId(proofId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Date expirationDate = (Date)attributes.get("expirationDate");

		if (expirationDate != null) {
			setExpirationDate(expirationDate);
		}
	}

	@Override
	public long getEmployeeproofNo() {
		return _employeeproofNo;
	}

	@Override
	public void setEmployeeproofNo(long employeeproofNo) {
		_employeeproofNo = employeeproofNo;

		if (_employeeProofRemoteModel != null) {
			try {
				Class<?> clazz = _employeeProofRemoteModel.getClass();

				Method method = clazz.getMethod("setEmployeeproofNo", long.class);

				method.invoke(_employeeProofRemoteModel, employeeproofNo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getProofId() {
		return _proofId;
	}

	@Override
	public void setProofId(long proofId) {
		_proofId = proofId;

		if (_employeeProofRemoteModel != null) {
			try {
				Class<?> clazz = _employeeProofRemoteModel.getClass();

				Method method = clazz.getMethod("setProofId", long.class);

				method.invoke(_employeeProofRemoteModel, proofId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;

		if (_employeeProofRemoteModel != null) {
			try {
				Class<?> clazz = _employeeProofRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_employeeProofRemoteModel, userId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@Override
	public Date getExpirationDate() {
		return _expirationDate;
	}

	@Override
	public void setExpirationDate(Date expirationDate) {
		_expirationDate = expirationDate;

		if (_employeeProofRemoteModel != null) {
			try {
				Class<?> clazz = _employeeProofRemoteModel.getClass();

				Method method = clazz.getMethod("setExpirationDate", Date.class);

				method.invoke(_employeeProofRemoteModel, expirationDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getEmployeeProofRemoteModel() {
		return _employeeProofRemoteModel;
	}

	public void setEmployeeProofRemoteModel(
		BaseModel<?> employeeProofRemoteModel) {
		_employeeProofRemoteModel = employeeProofRemoteModel;
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

		Class<?> remoteModelClass = _employeeProofRemoteModel.getClass();

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

		Object returnValue = method.invoke(_employeeProofRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			EmployeeProofLocalServiceUtil.addEmployeeProof(this);
		}
		else {
			EmployeeProofLocalServiceUtil.updateEmployeeProof(this);
		}
	}

	@Override
	public EmployeeProof toEscapedModel() {
		return (EmployeeProof)ProxyUtil.newProxyInstance(EmployeeProof.class.getClassLoader(),
			new Class[] { EmployeeProof.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		EmployeeProofClp clone = new EmployeeProofClp();

		clone.setEmployeeproofNo(getEmployeeproofNo());
		clone.setProofId(getProofId());
		clone.setUserId(getUserId());
		clone.setExpirationDate(getExpirationDate());

		return clone;
	}

	@Override
	public int compareTo(EmployeeProof employeeProof) {
		long primaryKey = employeeProof.getPrimaryKey();

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

		if (!(obj instanceof EmployeeProofClp)) {
			return false;
		}

		EmployeeProofClp employeeProof = (EmployeeProofClp)obj;

		long primaryKey = employeeProof.getPrimaryKey();

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
		StringBundler sb = new StringBundler(9);

		sb.append("{employeeproofNo=");
		sb.append(getEmployeeproofNo());
		sb.append(", proofId=");
		sb.append(getProofId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", expirationDate=");
		sb.append(getExpirationDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("com.hrms.model.EmployeeProof");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>employeeproofNo</column-name><column-value><![CDATA[");
		sb.append(getEmployeeproofNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>proofId</column-name><column-value><![CDATA[");
		sb.append(getProofId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>expirationDate</column-name><column-value><![CDATA[");
		sb.append(getExpirationDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _employeeproofNo;
	private long _proofId;
	private long _userId;
	private String _userUuid;
	private Date _expirationDate;
	private BaseModel<?> _employeeProofRemoteModel;
}