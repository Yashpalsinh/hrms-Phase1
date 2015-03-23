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

import java.io.Serializable;

import java.lang.reflect.Method;

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
		return _employeeProofId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setEmployeeProofId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _employeeProofId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("employeeProofId", getEmployeeProofId());
		attributes.put("proofType", getProofType());
		attributes.put("status", getStatus());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long employeeProofId = (Long)attributes.get("employeeProofId");

		if (employeeProofId != null) {
			setEmployeeProofId(employeeProofId);
		}

		String proofType = (String)attributes.get("proofType");

		if (proofType != null) {
			setProofType(proofType);
		}

		Boolean status = (Boolean)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}
	}

	@Override
	public long getEmployeeProofId() {
		return _employeeProofId;
	}

	@Override
	public void setEmployeeProofId(long employeeProofId) {
		_employeeProofId = employeeProofId;

		if (_employeeProofRemoteModel != null) {
			try {
				Class<?> clazz = _employeeProofRemoteModel.getClass();

				Method method = clazz.getMethod("setEmployeeProofId", long.class);

				method.invoke(_employeeProofRemoteModel, employeeProofId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getProofType() {
		return _proofType;
	}

	@Override
	public void setProofType(String proofType) {
		_proofType = proofType;

		if (_employeeProofRemoteModel != null) {
			try {
				Class<?> clazz = _employeeProofRemoteModel.getClass();

				Method method = clazz.getMethod("setProofType", String.class);

				method.invoke(_employeeProofRemoteModel, proofType);
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

		if (_employeeProofRemoteModel != null) {
			try {
				Class<?> clazz = _employeeProofRemoteModel.getClass();

				Method method = clazz.getMethod("setStatus", boolean.class);

				method.invoke(_employeeProofRemoteModel, status);
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

		clone.setEmployeeProofId(getEmployeeProofId());
		clone.setProofType(getProofType());
		clone.setStatus(getStatus());

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
		StringBundler sb = new StringBundler(7);

		sb.append("{employeeProofId=");
		sb.append(getEmployeeProofId());
		sb.append(", proofType=");
		sb.append(getProofType());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("com.hrms.model.EmployeeProof");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>employeeProofId</column-name><column-value><![CDATA[");
		sb.append(getEmployeeProofId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>proofType</column-name><column-value><![CDATA[");
		sb.append(getProofType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _employeeProofId;
	private String _proofType;
	private boolean _status;
	private BaseModel<?> _employeeProofRemoteModel;
}