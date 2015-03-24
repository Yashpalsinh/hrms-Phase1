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
import com.hrms.service.EmployeeWarningLocalServiceUtil;

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
public class EmployeeWarningClp extends BaseModelImpl<EmployeeWarning>
	implements EmployeeWarning {
	public EmployeeWarningClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return EmployeeWarning.class;
	}

	@Override
	public String getModelClassName() {
		return EmployeeWarning.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _employeeWarningId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setEmployeeWarningId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _employeeWarningId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("employeeWarningId", getEmployeeWarningId());
		attributes.put("warningTo", getWarningTo());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("warningDate", getWarningDate());
		attributes.put("warningSubject", getWarningSubject());
		attributes.put("status", getStatus());
		attributes.put("warningBy", getWarningBy());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("createBy", getCreateBy());
		attributes.put("modifiedBy", getModifiedBy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long employeeWarningId = (Long)attributes.get("employeeWarningId");

		if (employeeWarningId != null) {
			setEmployeeWarningId(employeeWarningId);
		}

		Long warningTo = (Long)attributes.get("warningTo");

		if (warningTo != null) {
			setWarningTo(warningTo);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Date warningDate = (Date)attributes.get("warningDate");

		if (warningDate != null) {
			setWarningDate(warningDate);
		}

		String warningSubject = (String)attributes.get("warningSubject");

		if (warningSubject != null) {
			setWarningSubject(warningSubject);
		}

		Boolean status = (Boolean)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Long warningBy = (Long)attributes.get("warningBy");

		if (warningBy != null) {
			setWarningBy(warningBy);
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
	public long getEmployeeWarningId() {
		return _employeeWarningId;
	}

	@Override
	public void setEmployeeWarningId(long employeeWarningId) {
		_employeeWarningId = employeeWarningId;

		if (_employeeWarningRemoteModel != null) {
			try {
				Class<?> clazz = _employeeWarningRemoteModel.getClass();

				Method method = clazz.getMethod("setEmployeeWarningId",
						long.class);

				method.invoke(_employeeWarningRemoteModel, employeeWarningId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getWarningTo() {
		return _warningTo;
	}

	@Override
	public void setWarningTo(long warningTo) {
		_warningTo = warningTo;

		if (_employeeWarningRemoteModel != null) {
			try {
				Class<?> clazz = _employeeWarningRemoteModel.getClass();

				Method method = clazz.getMethod("setWarningTo", long.class);

				method.invoke(_employeeWarningRemoteModel, warningTo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;

		if (_employeeWarningRemoteModel != null) {
			try {
				Class<?> clazz = _employeeWarningRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_employeeWarningRemoteModel, groupId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;

		if (_employeeWarningRemoteModel != null) {
			try {
				Class<?> clazz = _employeeWarningRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_employeeWarningRemoteModel, companyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getWarningDate() {
		return _warningDate;
	}

	@Override
	public void setWarningDate(Date warningDate) {
		_warningDate = warningDate;

		if (_employeeWarningRemoteModel != null) {
			try {
				Class<?> clazz = _employeeWarningRemoteModel.getClass();

				Method method = clazz.getMethod("setWarningDate", Date.class);

				method.invoke(_employeeWarningRemoteModel, warningDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getWarningSubject() {
		return _warningSubject;
	}

	@Override
	public void setWarningSubject(String warningSubject) {
		_warningSubject = warningSubject;

		if (_employeeWarningRemoteModel != null) {
			try {
				Class<?> clazz = _employeeWarningRemoteModel.getClass();

				Method method = clazz.getMethod("setWarningSubject",
						String.class);

				method.invoke(_employeeWarningRemoteModel, warningSubject);
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

		if (_employeeWarningRemoteModel != null) {
			try {
				Class<?> clazz = _employeeWarningRemoteModel.getClass();

				Method method = clazz.getMethod("setStatus", boolean.class);

				method.invoke(_employeeWarningRemoteModel, status);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getWarningBy() {
		return _warningBy;
	}

	@Override
	public void setWarningBy(long warningBy) {
		_warningBy = warningBy;

		if (_employeeWarningRemoteModel != null) {
			try {
				Class<?> clazz = _employeeWarningRemoteModel.getClass();

				Method method = clazz.getMethod("setWarningBy", long.class);

				method.invoke(_employeeWarningRemoteModel, warningBy);
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

		if (_employeeWarningRemoteModel != null) {
			try {
				Class<?> clazz = _employeeWarningRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_employeeWarningRemoteModel, modifiedDate);
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

		if (_employeeWarningRemoteModel != null) {
			try {
				Class<?> clazz = _employeeWarningRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateBy", long.class);

				method.invoke(_employeeWarningRemoteModel, createBy);
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

		if (_employeeWarningRemoteModel != null) {
			try {
				Class<?> clazz = _employeeWarningRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedBy", long.class);

				method.invoke(_employeeWarningRemoteModel, modifiedBy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getEmployeeWarningRemoteModel() {
		return _employeeWarningRemoteModel;
	}

	public void setEmployeeWarningRemoteModel(
		BaseModel<?> employeeWarningRemoteModel) {
		_employeeWarningRemoteModel = employeeWarningRemoteModel;
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

		Class<?> remoteModelClass = _employeeWarningRemoteModel.getClass();

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

		Object returnValue = method.invoke(_employeeWarningRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			EmployeeWarningLocalServiceUtil.addEmployeeWarning(this);
		}
		else {
			EmployeeWarningLocalServiceUtil.updateEmployeeWarning(this);
		}
	}

	@Override
	public EmployeeWarning toEscapedModel() {
		return (EmployeeWarning)ProxyUtil.newProxyInstance(EmployeeWarning.class.getClassLoader(),
			new Class[] { EmployeeWarning.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		EmployeeWarningClp clone = new EmployeeWarningClp();

		clone.setEmployeeWarningId(getEmployeeWarningId());
		clone.setWarningTo(getWarningTo());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setWarningDate(getWarningDate());
		clone.setWarningSubject(getWarningSubject());
		clone.setStatus(getStatus());
		clone.setWarningBy(getWarningBy());
		clone.setModifiedDate(getModifiedDate());
		clone.setCreateBy(getCreateBy());
		clone.setModifiedBy(getModifiedBy());

		return clone;
	}

	@Override
	public int compareTo(EmployeeWarning employeeWarning) {
		long primaryKey = employeeWarning.getPrimaryKey();

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

		if (!(obj instanceof EmployeeWarningClp)) {
			return false;
		}

		EmployeeWarningClp employeeWarning = (EmployeeWarningClp)obj;

		long primaryKey = employeeWarning.getPrimaryKey();

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
		StringBundler sb = new StringBundler(23);

		sb.append("{employeeWarningId=");
		sb.append(getEmployeeWarningId());
		sb.append(", warningTo=");
		sb.append(getWarningTo());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", warningDate=");
		sb.append(getWarningDate());
		sb.append(", warningSubject=");
		sb.append(getWarningSubject());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append(", warningBy=");
		sb.append(getWarningBy());
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
		StringBundler sb = new StringBundler(37);

		sb.append("<model><model-name>");
		sb.append("com.hrms.model.EmployeeWarning");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>employeeWarningId</column-name><column-value><![CDATA[");
		sb.append(getEmployeeWarningId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>warningTo</column-name><column-value><![CDATA[");
		sb.append(getWarningTo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>warningDate</column-name><column-value><![CDATA[");
		sb.append(getWarningDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>warningSubject</column-name><column-value><![CDATA[");
		sb.append(getWarningSubject());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>warningBy</column-name><column-value><![CDATA[");
		sb.append(getWarningBy());
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

	private long _employeeWarningId;
	private long _warningTo;
	private long _groupId;
	private long _companyId;
	private Date _warningDate;
	private String _warningSubject;
	private boolean _status;
	private long _warningBy;
	private Date _modifiedDate;
	private long _createBy;
	private long _modifiedBy;
	private BaseModel<?> _employeeWarningRemoteModel;
}