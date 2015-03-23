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
import com.hrms.service.EmployeeTypeLocalServiceUtil;

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
public class EmployeeTypeClp extends BaseModelImpl<EmployeeType>
	implements EmployeeType {
	public EmployeeTypeClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return EmployeeType.class;
	}

	@Override
	public String getModelClassName() {
		return EmployeeType.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _employeeTypeId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setEmployeeTypeId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _employeeTypeId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("employeeTypeId", getEmployeeTypeId());
		attributes.put("employeeTypeName", getEmployeeTypeName());
		attributes.put("status", getStatus());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long employeeTypeId = (Long)attributes.get("employeeTypeId");

		if (employeeTypeId != null) {
			setEmployeeTypeId(employeeTypeId);
		}

		String employeeTypeName = (String)attributes.get("employeeTypeName");

		if (employeeTypeName != null) {
			setEmployeeTypeName(employeeTypeName);
		}

		Boolean status = (Boolean)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}
	}

	@Override
	public long getEmployeeTypeId() {
		return _employeeTypeId;
	}

	@Override
	public void setEmployeeTypeId(long employeeTypeId) {
		_employeeTypeId = employeeTypeId;

		if (_employeeTypeRemoteModel != null) {
			try {
				Class<?> clazz = _employeeTypeRemoteModel.getClass();

				Method method = clazz.getMethod("setEmployeeTypeId", long.class);

				method.invoke(_employeeTypeRemoteModel, employeeTypeId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEmployeeTypeName() {
		return _employeeTypeName;
	}

	@Override
	public void setEmployeeTypeName(String employeeTypeName) {
		_employeeTypeName = employeeTypeName;

		if (_employeeTypeRemoteModel != null) {
			try {
				Class<?> clazz = _employeeTypeRemoteModel.getClass();

				Method method = clazz.getMethod("setEmployeeTypeName",
						String.class);

				method.invoke(_employeeTypeRemoteModel, employeeTypeName);
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

		if (_employeeTypeRemoteModel != null) {
			try {
				Class<?> clazz = _employeeTypeRemoteModel.getClass();

				Method method = clazz.getMethod("setStatus", boolean.class);

				method.invoke(_employeeTypeRemoteModel, status);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getEmployeeTypeRemoteModel() {
		return _employeeTypeRemoteModel;
	}

	public void setEmployeeTypeRemoteModel(BaseModel<?> employeeTypeRemoteModel) {
		_employeeTypeRemoteModel = employeeTypeRemoteModel;
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

		Class<?> remoteModelClass = _employeeTypeRemoteModel.getClass();

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

		Object returnValue = method.invoke(_employeeTypeRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			EmployeeTypeLocalServiceUtil.addEmployeeType(this);
		}
		else {
			EmployeeTypeLocalServiceUtil.updateEmployeeType(this);
		}
	}

	@Override
	public EmployeeType toEscapedModel() {
		return (EmployeeType)ProxyUtil.newProxyInstance(EmployeeType.class.getClassLoader(),
			new Class[] { EmployeeType.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		EmployeeTypeClp clone = new EmployeeTypeClp();

		clone.setEmployeeTypeId(getEmployeeTypeId());
		clone.setEmployeeTypeName(getEmployeeTypeName());
		clone.setStatus(getStatus());

		return clone;
	}

	@Override
	public int compareTo(EmployeeType employeeType) {
		long primaryKey = employeeType.getPrimaryKey();

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

		if (!(obj instanceof EmployeeTypeClp)) {
			return false;
		}

		EmployeeTypeClp employeeType = (EmployeeTypeClp)obj;

		long primaryKey = employeeType.getPrimaryKey();

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

		sb.append("{employeeTypeId=");
		sb.append(getEmployeeTypeId());
		sb.append(", employeeTypeName=");
		sb.append(getEmployeeTypeName());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("com.hrms.model.EmployeeType");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>employeeTypeId</column-name><column-value><![CDATA[");
		sb.append(getEmployeeTypeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>employeeTypeName</column-name><column-value><![CDATA[");
		sb.append(getEmployeeTypeName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _employeeTypeId;
	private String _employeeTypeName;
	private boolean _status;
	private BaseModel<?> _employeeTypeRemoteModel;
}