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
import com.hrms.service.EmployeeDesignationLocalServiceUtil;

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
 * @author bhavik
 */
public class EmployeeDesignationClp extends BaseModelImpl<EmployeeDesignation>
	implements EmployeeDesignation {
	public EmployeeDesignationClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return EmployeeDesignation.class;
	}

	@Override
	public String getModelClassName() {
		return EmployeeDesignation.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _employeeDesignationId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setEmployeeDesignationId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _employeeDesignationId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("employeeDesignationId", getEmployeeDesignationId());
		attributes.put("designationName", getDesignationName());
		attributes.put("status", getStatus());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long employeeDesignationId = (Long)attributes.get(
				"employeeDesignationId");

		if (employeeDesignationId != null) {
			setEmployeeDesignationId(employeeDesignationId);
		}

		String designationName = (String)attributes.get("designationName");

		if (designationName != null) {
			setDesignationName(designationName);
		}

		Boolean status = (Boolean)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}
	}

	@Override
	public long getEmployeeDesignationId() {
		return _employeeDesignationId;
	}

	@Override
	public void setEmployeeDesignationId(long employeeDesignationId) {
		_employeeDesignationId = employeeDesignationId;

		if (_employeeDesignationRemoteModel != null) {
			try {
				Class<?> clazz = _employeeDesignationRemoteModel.getClass();

				Method method = clazz.getMethod("setEmployeeDesignationId",
						long.class);

				method.invoke(_employeeDesignationRemoteModel,
					employeeDesignationId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDesignationName() {
		return _designationName;
	}

	@Override
	public void setDesignationName(String designationName) {
		_designationName = designationName;

		if (_employeeDesignationRemoteModel != null) {
			try {
				Class<?> clazz = _employeeDesignationRemoteModel.getClass();

				Method method = clazz.getMethod("setDesignationName",
						String.class);

				method.invoke(_employeeDesignationRemoteModel, designationName);
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

		if (_employeeDesignationRemoteModel != null) {
			try {
				Class<?> clazz = _employeeDesignationRemoteModel.getClass();

				Method method = clazz.getMethod("setStatus", boolean.class);

				method.invoke(_employeeDesignationRemoteModel, status);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getEmployeeDesignationRemoteModel() {
		return _employeeDesignationRemoteModel;
	}

	public void setEmployeeDesignationRemoteModel(
		BaseModel<?> employeeDesignationRemoteModel) {
		_employeeDesignationRemoteModel = employeeDesignationRemoteModel;
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

		Class<?> remoteModelClass = _employeeDesignationRemoteModel.getClass();

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

		Object returnValue = method.invoke(_employeeDesignationRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			EmployeeDesignationLocalServiceUtil.addEmployeeDesignation(this);
		}
		else {
			EmployeeDesignationLocalServiceUtil.updateEmployeeDesignation(this);
		}
	}

	@Override
	public EmployeeDesignation toEscapedModel() {
		return (EmployeeDesignation)ProxyUtil.newProxyInstance(EmployeeDesignation.class.getClassLoader(),
			new Class[] { EmployeeDesignation.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		EmployeeDesignationClp clone = new EmployeeDesignationClp();

		clone.setEmployeeDesignationId(getEmployeeDesignationId());
		clone.setDesignationName(getDesignationName());
		clone.setStatus(getStatus());

		return clone;
	}

	@Override
	public int compareTo(EmployeeDesignation employeeDesignation) {
		long primaryKey = employeeDesignation.getPrimaryKey();

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

		if (!(obj instanceof EmployeeDesignationClp)) {
			return false;
		}

		EmployeeDesignationClp employeeDesignation = (EmployeeDesignationClp)obj;

		long primaryKey = employeeDesignation.getPrimaryKey();

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

		sb.append("{employeeDesignationId=");
		sb.append(getEmployeeDesignationId());
		sb.append(", designationName=");
		sb.append(getDesignationName());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("com.hrms.model.EmployeeDesignation");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>employeeDesignationId</column-name><column-value><![CDATA[");
		sb.append(getEmployeeDesignationId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>designationName</column-name><column-value><![CDATA[");
		sb.append(getDesignationName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _employeeDesignationId;
	private String _designationName;
	private boolean _status;
	private BaseModel<?> _employeeDesignationRemoteModel;
}