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
import com.hrms.service.EmployeeComplaintLocalServiceUtil;

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
 * @author bhavik
 */
public class EmployeeComplaintClp extends BaseModelImpl<EmployeeComplaint>
	implements EmployeeComplaint {
	public EmployeeComplaintClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return EmployeeComplaint.class;
	}

	@Override
	public String getModelClassName() {
		return EmployeeComplaint.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _employeeComplaintId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setEmployeeComplaintId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _employeeComplaintId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("employeeComplaintId", getEmployeeComplaintId());
		attributes.put("userId", getUserId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("complaintTitle", getComplaintTitle());
		attributes.put("complaintDiscription", getComplaintDiscription());
		attributes.put("complaintFrom", getComplaintFrom());
		attributes.put("complaintDate", getComplaintDate());
		attributes.put("status", getStatus());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("createBy", getCreateBy());
		attributes.put("modifiedBy", getModifiedBy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long employeeComplaintId = (Long)attributes.get("employeeComplaintId");

		if (employeeComplaintId != null) {
			setEmployeeComplaintId(employeeComplaintId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		String complaintTitle = (String)attributes.get("complaintTitle");

		if (complaintTitle != null) {
			setComplaintTitle(complaintTitle);
		}

		String complaintDiscription = (String)attributes.get(
				"complaintDiscription");

		if (complaintDiscription != null) {
			setComplaintDiscription(complaintDiscription);
		}

		Long complaintFrom = (Long)attributes.get("complaintFrom");

		if (complaintFrom != null) {
			setComplaintFrom(complaintFrom);
		}

		Date complaintDate = (Date)attributes.get("complaintDate");

		if (complaintDate != null) {
			setComplaintDate(complaintDate);
		}

		Boolean status = (Boolean)attributes.get("status");

		if (status != null) {
			setStatus(status);
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
	public long getEmployeeComplaintId() {
		return _employeeComplaintId;
	}

	@Override
	public void setEmployeeComplaintId(long employeeComplaintId) {
		_employeeComplaintId = employeeComplaintId;

		if (_employeeComplaintRemoteModel != null) {
			try {
				Class<?> clazz = _employeeComplaintRemoteModel.getClass();

				Method method = clazz.getMethod("setEmployeeComplaintId",
						long.class);

				method.invoke(_employeeComplaintRemoteModel, employeeComplaintId);
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

		if (_employeeComplaintRemoteModel != null) {
			try {
				Class<?> clazz = _employeeComplaintRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_employeeComplaintRemoteModel, userId);
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
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;

		if (_employeeComplaintRemoteModel != null) {
			try {
				Class<?> clazz = _employeeComplaintRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_employeeComplaintRemoteModel, groupId);
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

		if (_employeeComplaintRemoteModel != null) {
			try {
				Class<?> clazz = _employeeComplaintRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_employeeComplaintRemoteModel, companyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getComplaintTitle() {
		return _complaintTitle;
	}

	@Override
	public void setComplaintTitle(String complaintTitle) {
		_complaintTitle = complaintTitle;

		if (_employeeComplaintRemoteModel != null) {
			try {
				Class<?> clazz = _employeeComplaintRemoteModel.getClass();

				Method method = clazz.getMethod("setComplaintTitle",
						String.class);

				method.invoke(_employeeComplaintRemoteModel, complaintTitle);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getComplaintDiscription() {
		return _complaintDiscription;
	}

	@Override
	public void setComplaintDiscription(String complaintDiscription) {
		_complaintDiscription = complaintDiscription;

		if (_employeeComplaintRemoteModel != null) {
			try {
				Class<?> clazz = _employeeComplaintRemoteModel.getClass();

				Method method = clazz.getMethod("setComplaintDiscription",
						String.class);

				method.invoke(_employeeComplaintRemoteModel,
					complaintDiscription);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getComplaintFrom() {
		return _complaintFrom;
	}

	@Override
	public void setComplaintFrom(long complaintFrom) {
		_complaintFrom = complaintFrom;

		if (_employeeComplaintRemoteModel != null) {
			try {
				Class<?> clazz = _employeeComplaintRemoteModel.getClass();

				Method method = clazz.getMethod("setComplaintFrom", long.class);

				method.invoke(_employeeComplaintRemoteModel, complaintFrom);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getComplaintDate() {
		return _complaintDate;
	}

	@Override
	public void setComplaintDate(Date complaintDate) {
		_complaintDate = complaintDate;

		if (_employeeComplaintRemoteModel != null) {
			try {
				Class<?> clazz = _employeeComplaintRemoteModel.getClass();

				Method method = clazz.getMethod("setComplaintDate", Date.class);

				method.invoke(_employeeComplaintRemoteModel, complaintDate);
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

		if (_employeeComplaintRemoteModel != null) {
			try {
				Class<?> clazz = _employeeComplaintRemoteModel.getClass();

				Method method = clazz.getMethod("setStatus", boolean.class);

				method.invoke(_employeeComplaintRemoteModel, status);
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

		if (_employeeComplaintRemoteModel != null) {
			try {
				Class<?> clazz = _employeeComplaintRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_employeeComplaintRemoteModel, modifiedDate);
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

		if (_employeeComplaintRemoteModel != null) {
			try {
				Class<?> clazz = _employeeComplaintRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateBy", long.class);

				method.invoke(_employeeComplaintRemoteModel, createBy);
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

		if (_employeeComplaintRemoteModel != null) {
			try {
				Class<?> clazz = _employeeComplaintRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedBy", long.class);

				method.invoke(_employeeComplaintRemoteModel, modifiedBy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getEmployeeComplaintRemoteModel() {
		return _employeeComplaintRemoteModel;
	}

	public void setEmployeeComplaintRemoteModel(
		BaseModel<?> employeeComplaintRemoteModel) {
		_employeeComplaintRemoteModel = employeeComplaintRemoteModel;
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

		Class<?> remoteModelClass = _employeeComplaintRemoteModel.getClass();

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

		Object returnValue = method.invoke(_employeeComplaintRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			EmployeeComplaintLocalServiceUtil.addEmployeeComplaint(this);
		}
		else {
			EmployeeComplaintLocalServiceUtil.updateEmployeeComplaint(this);
		}
	}

	@Override
	public EmployeeComplaint toEscapedModel() {
		return (EmployeeComplaint)ProxyUtil.newProxyInstance(EmployeeComplaint.class.getClassLoader(),
			new Class[] { EmployeeComplaint.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		EmployeeComplaintClp clone = new EmployeeComplaintClp();

		clone.setEmployeeComplaintId(getEmployeeComplaintId());
		clone.setUserId(getUserId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setComplaintTitle(getComplaintTitle());
		clone.setComplaintDiscription(getComplaintDiscription());
		clone.setComplaintFrom(getComplaintFrom());
		clone.setComplaintDate(getComplaintDate());
		clone.setStatus(getStatus());
		clone.setModifiedDate(getModifiedDate());
		clone.setCreateBy(getCreateBy());
		clone.setModifiedBy(getModifiedBy());

		return clone;
	}

	@Override
	public int compareTo(EmployeeComplaint employeeComplaint) {
		long primaryKey = employeeComplaint.getPrimaryKey();

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

		if (!(obj instanceof EmployeeComplaintClp)) {
			return false;
		}

		EmployeeComplaintClp employeeComplaint = (EmployeeComplaintClp)obj;

		long primaryKey = employeeComplaint.getPrimaryKey();

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

		sb.append("{employeeComplaintId=");
		sb.append(getEmployeeComplaintId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", complaintTitle=");
		sb.append(getComplaintTitle());
		sb.append(", complaintDiscription=");
		sb.append(getComplaintDiscription());
		sb.append(", complaintFrom=");
		sb.append(getComplaintFrom());
		sb.append(", complaintDate=");
		sb.append(getComplaintDate());
		sb.append(", status=");
		sb.append(getStatus());
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
		sb.append("com.hrms.model.EmployeeComplaint");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>employeeComplaintId</column-name><column-value><![CDATA[");
		sb.append(getEmployeeComplaintId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
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
			"<column><column-name>complaintTitle</column-name><column-value><![CDATA[");
		sb.append(getComplaintTitle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>complaintDiscription</column-name><column-value><![CDATA[");
		sb.append(getComplaintDiscription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>complaintFrom</column-name><column-value><![CDATA[");
		sb.append(getComplaintFrom());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>complaintDate</column-name><column-value><![CDATA[");
		sb.append(getComplaintDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
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

	private long _employeeComplaintId;
	private long _userId;
	private String _userUuid;
	private long _groupId;
	private long _companyId;
	private String _complaintTitle;
	private String _complaintDiscription;
	private long _complaintFrom;
	private Date _complaintDate;
	private boolean _status;
	private Date _modifiedDate;
	private long _createBy;
	private long _modifiedBy;
	private BaseModel<?> _employeeComplaintRemoteModel;
}