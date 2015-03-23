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
import com.hrms.service.EmployeeSubDepartmentLocalServiceUtil;

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
public class EmployeeSubDepartmentClp extends BaseModelImpl<EmployeeSubDepartment>
	implements EmployeeSubDepartment {
	public EmployeeSubDepartmentClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return EmployeeSubDepartment.class;
	}

	@Override
	public String getModelClassName() {
		return EmployeeSubDepartment.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _employeeSubDepartmentId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setEmployeeSubDepartmentId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _employeeSubDepartmentId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("employeeSubDepartmentId", getEmployeeSubDepartmentId());
		attributes.put("subDepartmentName", getSubDepartmentName());
		attributes.put("employeeDepartmentId", getEmployeeDepartmentId());
		attributes.put("status", getStatus());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long employeeSubDepartmentId = (Long)attributes.get(
				"employeeSubDepartmentId");

		if (employeeSubDepartmentId != null) {
			setEmployeeSubDepartmentId(employeeSubDepartmentId);
		}

		String subDepartmentName = (String)attributes.get("subDepartmentName");

		if (subDepartmentName != null) {
			setSubDepartmentName(subDepartmentName);
		}

		Long employeeDepartmentId = (Long)attributes.get("employeeDepartmentId");

		if (employeeDepartmentId != null) {
			setEmployeeDepartmentId(employeeDepartmentId);
		}

		Boolean status = (Boolean)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}
	}

	@Override
	public long getEmployeeSubDepartmentId() {
		return _employeeSubDepartmentId;
	}

	@Override
	public void setEmployeeSubDepartmentId(long employeeSubDepartmentId) {
		_employeeSubDepartmentId = employeeSubDepartmentId;

		if (_employeeSubDepartmentRemoteModel != null) {
			try {
				Class<?> clazz = _employeeSubDepartmentRemoteModel.getClass();

				Method method = clazz.getMethod("setEmployeeSubDepartmentId",
						long.class);

				method.invoke(_employeeSubDepartmentRemoteModel,
					employeeSubDepartmentId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSubDepartmentName() {
		return _subDepartmentName;
	}

	@Override
	public void setSubDepartmentName(String subDepartmentName) {
		_subDepartmentName = subDepartmentName;

		if (_employeeSubDepartmentRemoteModel != null) {
			try {
				Class<?> clazz = _employeeSubDepartmentRemoteModel.getClass();

				Method method = clazz.getMethod("setSubDepartmentName",
						String.class);

				method.invoke(_employeeSubDepartmentRemoteModel,
					subDepartmentName);
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

		if (_employeeSubDepartmentRemoteModel != null) {
			try {
				Class<?> clazz = _employeeSubDepartmentRemoteModel.getClass();

				Method method = clazz.getMethod("setEmployeeDepartmentId",
						long.class);

				method.invoke(_employeeSubDepartmentRemoteModel,
					employeeDepartmentId);
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

		if (_employeeSubDepartmentRemoteModel != null) {
			try {
				Class<?> clazz = _employeeSubDepartmentRemoteModel.getClass();

				Method method = clazz.getMethod("setStatus", boolean.class);

				method.invoke(_employeeSubDepartmentRemoteModel, status);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getEmployeeSubDepartmentRemoteModel() {
		return _employeeSubDepartmentRemoteModel;
	}

	public void setEmployeeSubDepartmentRemoteModel(
		BaseModel<?> employeeSubDepartmentRemoteModel) {
		_employeeSubDepartmentRemoteModel = employeeSubDepartmentRemoteModel;
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

		Class<?> remoteModelClass = _employeeSubDepartmentRemoteModel.getClass();

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

		Object returnValue = method.invoke(_employeeSubDepartmentRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			EmployeeSubDepartmentLocalServiceUtil.addEmployeeSubDepartment(this);
		}
		else {
			EmployeeSubDepartmentLocalServiceUtil.updateEmployeeSubDepartment(this);
		}
	}

	@Override
	public EmployeeSubDepartment toEscapedModel() {
		return (EmployeeSubDepartment)ProxyUtil.newProxyInstance(EmployeeSubDepartment.class.getClassLoader(),
			new Class[] { EmployeeSubDepartment.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		EmployeeSubDepartmentClp clone = new EmployeeSubDepartmentClp();

		clone.setEmployeeSubDepartmentId(getEmployeeSubDepartmentId());
		clone.setSubDepartmentName(getSubDepartmentName());
		clone.setEmployeeDepartmentId(getEmployeeDepartmentId());
		clone.setStatus(getStatus());

		return clone;
	}

	@Override
	public int compareTo(EmployeeSubDepartment employeeSubDepartment) {
		long primaryKey = employeeSubDepartment.getPrimaryKey();

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

		if (!(obj instanceof EmployeeSubDepartmentClp)) {
			return false;
		}

		EmployeeSubDepartmentClp employeeSubDepartment = (EmployeeSubDepartmentClp)obj;

		long primaryKey = employeeSubDepartment.getPrimaryKey();

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

		sb.append("{employeeSubDepartmentId=");
		sb.append(getEmployeeSubDepartmentId());
		sb.append(", subDepartmentName=");
		sb.append(getSubDepartmentName());
		sb.append(", employeeDepartmentId=");
		sb.append(getEmployeeDepartmentId());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("com.hrms.model.EmployeeSubDepartment");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>employeeSubDepartmentId</column-name><column-value><![CDATA[");
		sb.append(getEmployeeSubDepartmentId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>subDepartmentName</column-name><column-value><![CDATA[");
		sb.append(getSubDepartmentName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>employeeDepartmentId</column-name><column-value><![CDATA[");
		sb.append(getEmployeeDepartmentId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _employeeSubDepartmentId;
	private String _subDepartmentName;
	private long _employeeDepartmentId;
	private boolean _status;
	private BaseModel<?> _employeeSubDepartmentRemoteModel;
}