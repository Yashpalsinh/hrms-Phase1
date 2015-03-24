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
import com.hrms.service.EmployeeLanguageDetailLocalServiceUtil;

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
public class EmployeeLanguageDetailClp extends BaseModelImpl<EmployeeLanguageDetail>
	implements EmployeeLanguageDetail {
	public EmployeeLanguageDetailClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return EmployeeLanguageDetail.class;
	}

	@Override
	public String getModelClassName() {
		return EmployeeLanguageDetail.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _employeeLanguageDetailId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setEmployeeLanguageDetailId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _employeeLanguageDetailId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("employeeLanguageDetailId", getEmployeeLanguageDetailId());
		attributes.put("userId", getUserId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("languageName", getLanguageName());
		attributes.put("read", getRead());
		attributes.put("write", getWrite());
		attributes.put("speak", getSpeak());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("createBy", getCreateBy());
		attributes.put("modifiedBy", getModifiedBy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long employeeLanguageDetailId = (Long)attributes.get(
				"employeeLanguageDetailId");

		if (employeeLanguageDetailId != null) {
			setEmployeeLanguageDetailId(employeeLanguageDetailId);
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

		String languageName = (String)attributes.get("languageName");

		if (languageName != null) {
			setLanguageName(languageName);
		}

		Boolean read = (Boolean)attributes.get("read");

		if (read != null) {
			setRead(read);
		}

		Boolean write = (Boolean)attributes.get("write");

		if (write != null) {
			setWrite(write);
		}

		Boolean speak = (Boolean)attributes.get("speak");

		if (speak != null) {
			setSpeak(speak);
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
	public long getEmployeeLanguageDetailId() {
		return _employeeLanguageDetailId;
	}

	@Override
	public void setEmployeeLanguageDetailId(long employeeLanguageDetailId) {
		_employeeLanguageDetailId = employeeLanguageDetailId;

		if (_employeeLanguageDetailRemoteModel != null) {
			try {
				Class<?> clazz = _employeeLanguageDetailRemoteModel.getClass();

				Method method = clazz.getMethod("setEmployeeLanguageDetailId",
						long.class);

				method.invoke(_employeeLanguageDetailRemoteModel,
					employeeLanguageDetailId);
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

		if (_employeeLanguageDetailRemoteModel != null) {
			try {
				Class<?> clazz = _employeeLanguageDetailRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_employeeLanguageDetailRemoteModel, userId);
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

		if (_employeeLanguageDetailRemoteModel != null) {
			try {
				Class<?> clazz = _employeeLanguageDetailRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_employeeLanguageDetailRemoteModel, groupId);
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

		if (_employeeLanguageDetailRemoteModel != null) {
			try {
				Class<?> clazz = _employeeLanguageDetailRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_employeeLanguageDetailRemoteModel, companyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLanguageName() {
		return _languageName;
	}

	@Override
	public void setLanguageName(String languageName) {
		_languageName = languageName;

		if (_employeeLanguageDetailRemoteModel != null) {
			try {
				Class<?> clazz = _employeeLanguageDetailRemoteModel.getClass();

				Method method = clazz.getMethod("setLanguageName", String.class);

				method.invoke(_employeeLanguageDetailRemoteModel, languageName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getRead() {
		return _read;
	}

	@Override
	public boolean isRead() {
		return _read;
	}

	@Override
	public void setRead(boolean read) {
		_read = read;

		if (_employeeLanguageDetailRemoteModel != null) {
			try {
				Class<?> clazz = _employeeLanguageDetailRemoteModel.getClass();

				Method method = clazz.getMethod("setRead", boolean.class);

				method.invoke(_employeeLanguageDetailRemoteModel, read);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getWrite() {
		return _write;
	}

	@Override
	public boolean isWrite() {
		return _write;
	}

	@Override
	public void setWrite(boolean write) {
		_write = write;

		if (_employeeLanguageDetailRemoteModel != null) {
			try {
				Class<?> clazz = _employeeLanguageDetailRemoteModel.getClass();

				Method method = clazz.getMethod("setWrite", boolean.class);

				method.invoke(_employeeLanguageDetailRemoteModel, write);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getSpeak() {
		return _speak;
	}

	@Override
	public boolean isSpeak() {
		return _speak;
	}

	@Override
	public void setSpeak(boolean speak) {
		_speak = speak;

		if (_employeeLanguageDetailRemoteModel != null) {
			try {
				Class<?> clazz = _employeeLanguageDetailRemoteModel.getClass();

				Method method = clazz.getMethod("setSpeak", boolean.class);

				method.invoke(_employeeLanguageDetailRemoteModel, speak);
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

		if (_employeeLanguageDetailRemoteModel != null) {
			try {
				Class<?> clazz = _employeeLanguageDetailRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_employeeLanguageDetailRemoteModel, createDate);
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

		if (_employeeLanguageDetailRemoteModel != null) {
			try {
				Class<?> clazz = _employeeLanguageDetailRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_employeeLanguageDetailRemoteModel, modifiedDate);
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

		if (_employeeLanguageDetailRemoteModel != null) {
			try {
				Class<?> clazz = _employeeLanguageDetailRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateBy", long.class);

				method.invoke(_employeeLanguageDetailRemoteModel, createBy);
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

		if (_employeeLanguageDetailRemoteModel != null) {
			try {
				Class<?> clazz = _employeeLanguageDetailRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedBy", long.class);

				method.invoke(_employeeLanguageDetailRemoteModel, modifiedBy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getEmployeeLanguageDetailRemoteModel() {
		return _employeeLanguageDetailRemoteModel;
	}

	public void setEmployeeLanguageDetailRemoteModel(
		BaseModel<?> employeeLanguageDetailRemoteModel) {
		_employeeLanguageDetailRemoteModel = employeeLanguageDetailRemoteModel;
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

		Class<?> remoteModelClass = _employeeLanguageDetailRemoteModel.getClass();

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

		Object returnValue = method.invoke(_employeeLanguageDetailRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			EmployeeLanguageDetailLocalServiceUtil.addEmployeeLanguageDetail(this);
		}
		else {
			EmployeeLanguageDetailLocalServiceUtil.updateEmployeeLanguageDetail(this);
		}
	}

	@Override
	public EmployeeLanguageDetail toEscapedModel() {
		return (EmployeeLanguageDetail)ProxyUtil.newProxyInstance(EmployeeLanguageDetail.class.getClassLoader(),
			new Class[] { EmployeeLanguageDetail.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		EmployeeLanguageDetailClp clone = new EmployeeLanguageDetailClp();

		clone.setEmployeeLanguageDetailId(getEmployeeLanguageDetailId());
		clone.setUserId(getUserId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setLanguageName(getLanguageName());
		clone.setRead(getRead());
		clone.setWrite(getWrite());
		clone.setSpeak(getSpeak());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setCreateBy(getCreateBy());
		clone.setModifiedBy(getModifiedBy());

		return clone;
	}

	@Override
	public int compareTo(EmployeeLanguageDetail employeeLanguageDetail) {
		long primaryKey = employeeLanguageDetail.getPrimaryKey();

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

		if (!(obj instanceof EmployeeLanguageDetailClp)) {
			return false;
		}

		EmployeeLanguageDetailClp employeeLanguageDetail = (EmployeeLanguageDetailClp)obj;

		long primaryKey = employeeLanguageDetail.getPrimaryKey();

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

		sb.append("{employeeLanguageDetailId=");
		sb.append(getEmployeeLanguageDetailId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", languageName=");
		sb.append(getLanguageName());
		sb.append(", read=");
		sb.append(getRead());
		sb.append(", write=");
		sb.append(getWrite());
		sb.append(", speak=");
		sb.append(getSpeak());
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
		sb.append("com.hrms.model.EmployeeLanguageDetail");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>employeeLanguageDetailId</column-name><column-value><![CDATA[");
		sb.append(getEmployeeLanguageDetailId());
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
			"<column><column-name>languageName</column-name><column-value><![CDATA[");
		sb.append(getLanguageName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>read</column-name><column-value><![CDATA[");
		sb.append(getRead());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>write</column-name><column-value><![CDATA[");
		sb.append(getWrite());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>speak</column-name><column-value><![CDATA[");
		sb.append(getSpeak());
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

	private long _employeeLanguageDetailId;
	private long _userId;
	private String _userUuid;
	private long _groupId;
	private long _companyId;
	private String _languageName;
	private boolean _read;
	private boolean _write;
	private boolean _speak;
	private Date _createDate;
	private Date _modifiedDate;
	private long _createBy;
	private long _modifiedBy;
	private BaseModel<?> _employeeLanguageDetailRemoteModel;
}