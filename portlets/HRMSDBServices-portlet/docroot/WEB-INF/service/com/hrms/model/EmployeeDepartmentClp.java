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
import com.hrms.service.EmployeeDepartmentLocalServiceUtil;

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
public class EmployeeDepartmentClp extends BaseModelImpl<EmployeeDepartment>
	implements EmployeeDepartment {
	public EmployeeDepartmentClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return EmployeeDepartment.class;
	}

	@Override
	public String getModelClassName() {
		return EmployeeDepartment.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _employeeDepartmentId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setEmployeeDepartmentId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _employeeDepartmentId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("employeeDepartmentId", getEmployeeDepartmentId());
		attributes.put("departmentName", getDepartmentName());
		attributes.put("status", getStatus());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long employeeDepartmentId = (Long)attributes.get("employeeDepartmentId");

		if (employeeDepartmentId != null) {
			setEmployeeDepartmentId(employeeDepartmentId);
		}

		String departmentName = (String)attributes.get("departmentName");

		if (departmentName != null) {
			setDepartmentName(departmentName);
		}

		Boolean status = (Boolean)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}
	}

	@Override
	public long getEmployeeDepartmentId() {
		return _employeeDepartmentId;
	}

	@Override
	public void setEmployeeDepartmentId(long employeeDepartmentId) {
		_employeeDepartmentId = employeeDepartmentId;

		if (_employeeDepartmentRemoteModel != null) {
			try {
				Class<?> clazz = _employeeDepartmentRemoteModel.getClass();

				Method method = clazz.getMethod("setEmployeeDepartmentId",
						long.class);

				method.invoke(_employeeDepartmentRemoteModel,
					employeeDepartmentId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDepartmentName() {
		return _departmentName;
	}

	@Override
	public void setDepartmentName(String departmentName) {
		_departmentName = departmentName;

		if (_employeeDepartmentRemoteModel != null) {
			try {
				Class<?> clazz = _employeeDepartmentRemoteModel.getClass();

				Method method = clazz.getMethod("setDepartmentName",
						String.class);

				method.invoke(_employeeDepartmentRemoteModel, departmentName);
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

		if (_employeeDepartmentRemoteModel != null) {
			try {
				Class<?> clazz = _employeeDepartmentRemoteModel.getClass();

				Method method = clazz.getMethod("setStatus", boolean.class);

				method.invoke(_employeeDepartmentRemoteModel, status);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getEmployeeDepartmentRemoteModel() {
		return _employeeDepartmentRemoteModel;
	}

	public void setEmployeeDepartmentRemoteModel(
		BaseModel<?> employeeDepartmentRemoteModel) {
		_employeeDepartmentRemoteModel = employeeDepartmentRemoteModel;
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

		Class<?> remoteModelClass = _employeeDepartmentRemoteModel.getClass();

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

		Object returnValue = method.invoke(_employeeDepartmentRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			EmployeeDepartmentLocalServiceUtil.addEmployeeDepartment(this);
		}
		else {
			EmployeeDepartmentLocalServiceUtil.updateEmployeeDepartment(this);
		}
	}

	@Override
	public EmployeeDepartment toEscapedModel() {
		return (EmployeeDepartment)ProxyUtil.newProxyInstance(EmployeeDepartment.class.getClassLoader(),
			new Class[] { EmployeeDepartment.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		EmployeeDepartmentClp clone = new EmployeeDepartmentClp();

		clone.setEmployeeDepartmentId(getEmployeeDepartmentId());
		clone.setDepartmentName(getDepartmentName());
		clone.setStatus(getStatus());

		return clone;
	}

	@Override
	public int compareTo(EmployeeDepartment employeeDepartment) {
		long primaryKey = employeeDepartment.getPrimaryKey();

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

		if (!(obj instanceof EmployeeDepartmentClp)) {
			return false;
		}

		EmployeeDepartmentClp employeeDepartment = (EmployeeDepartmentClp)obj;

		long primaryKey = employeeDepartment.getPrimaryKey();

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

		sb.append("{employeeDepartmentId=");
		sb.append(getEmployeeDepartmentId());
		sb.append(", departmentName=");
		sb.append(getDepartmentName());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("com.hrms.model.EmployeeDepartment");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>employeeDepartmentId</column-name><column-value><![CDATA[");
		sb.append(getEmployeeDepartmentId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>departmentName</column-name><column-value><![CDATA[");
		sb.append(getDepartmentName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _employeeDepartmentId;
	private String _departmentName;
	private boolean _status;
	private BaseModel<?> _employeeDepartmentRemoteModel;
}