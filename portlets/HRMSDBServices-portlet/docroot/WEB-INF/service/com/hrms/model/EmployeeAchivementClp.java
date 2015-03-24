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
import com.hrms.service.EmployeeAchivementLocalServiceUtil;

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
public class EmployeeAchivementClp extends BaseModelImpl<EmployeeAchivement>
	implements EmployeeAchivement {
	public EmployeeAchivementClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return EmployeeAchivement.class;
	}

	@Override
	public String getModelClassName() {
		return EmployeeAchivement.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _employeeAchivementId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setEmployeeAchivementId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _employeeAchivementId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("employeeAchivementId", getEmployeeAchivementId());
		attributes.put("achivedBy", getAchivedBy());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("achivementDate", getAchivementDate());
		attributes.put("achivementTitle", getAchivementTitle());
		attributes.put("achivementDiscription", getAchivementDiscription());
		attributes.put("status", getStatus());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("createBy", getCreateBy());
		attributes.put("modifiedBy", getModifiedBy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long employeeAchivementId = (Long)attributes.get("employeeAchivementId");

		if (employeeAchivementId != null) {
			setEmployeeAchivementId(employeeAchivementId);
		}

		Long achivedBy = (Long)attributes.get("achivedBy");

		if (achivedBy != null) {
			setAchivedBy(achivedBy);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Date achivementDate = (Date)attributes.get("achivementDate");

		if (achivementDate != null) {
			setAchivementDate(achivementDate);
		}

		String achivementTitle = (String)attributes.get("achivementTitle");

		if (achivementTitle != null) {
			setAchivementTitle(achivementTitle);
		}

		String achivementDiscription = (String)attributes.get(
				"achivementDiscription");

		if (achivementDiscription != null) {
			setAchivementDiscription(achivementDiscription);
		}

		Boolean status = (Boolean)attributes.get("status");

		if (status != null) {
			setStatus(status);
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
	public long getEmployeeAchivementId() {
		return _employeeAchivementId;
	}

	@Override
	public void setEmployeeAchivementId(long employeeAchivementId) {
		_employeeAchivementId = employeeAchivementId;

		if (_employeeAchivementRemoteModel != null) {
			try {
				Class<?> clazz = _employeeAchivementRemoteModel.getClass();

				Method method = clazz.getMethod("setEmployeeAchivementId",
						long.class);

				method.invoke(_employeeAchivementRemoteModel,
					employeeAchivementId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getAchivedBy() {
		return _achivedBy;
	}

	@Override
	public void setAchivedBy(long achivedBy) {
		_achivedBy = achivedBy;

		if (_employeeAchivementRemoteModel != null) {
			try {
				Class<?> clazz = _employeeAchivementRemoteModel.getClass();

				Method method = clazz.getMethod("setAchivedBy", long.class);

				method.invoke(_employeeAchivementRemoteModel, achivedBy);
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

		if (_employeeAchivementRemoteModel != null) {
			try {
				Class<?> clazz = _employeeAchivementRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_employeeAchivementRemoteModel, groupId);
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

		if (_employeeAchivementRemoteModel != null) {
			try {
				Class<?> clazz = _employeeAchivementRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_employeeAchivementRemoteModel, companyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getAchivementDate() {
		return _achivementDate;
	}

	@Override
	public void setAchivementDate(Date achivementDate) {
		_achivementDate = achivementDate;

		if (_employeeAchivementRemoteModel != null) {
			try {
				Class<?> clazz = _employeeAchivementRemoteModel.getClass();

				Method method = clazz.getMethod("setAchivementDate", Date.class);

				method.invoke(_employeeAchivementRemoteModel, achivementDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAchivementTitle() {
		return _achivementTitle;
	}

	@Override
	public void setAchivementTitle(String achivementTitle) {
		_achivementTitle = achivementTitle;

		if (_employeeAchivementRemoteModel != null) {
			try {
				Class<?> clazz = _employeeAchivementRemoteModel.getClass();

				Method method = clazz.getMethod("setAchivementTitle",
						String.class);

				method.invoke(_employeeAchivementRemoteModel, achivementTitle);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAchivementDiscription() {
		return _achivementDiscription;
	}

	@Override
	public void setAchivementDiscription(String achivementDiscription) {
		_achivementDiscription = achivementDiscription;

		if (_employeeAchivementRemoteModel != null) {
			try {
				Class<?> clazz = _employeeAchivementRemoteModel.getClass();

				Method method = clazz.getMethod("setAchivementDiscription",
						String.class);

				method.invoke(_employeeAchivementRemoteModel,
					achivementDiscription);
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

		if (_employeeAchivementRemoteModel != null) {
			try {
				Class<?> clazz = _employeeAchivementRemoteModel.getClass();

				Method method = clazz.getMethod("setStatus", boolean.class);

				method.invoke(_employeeAchivementRemoteModel, status);
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

		if (_employeeAchivementRemoteModel != null) {
			try {
				Class<?> clazz = _employeeAchivementRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_employeeAchivementRemoteModel, createDate);
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

		if (_employeeAchivementRemoteModel != null) {
			try {
				Class<?> clazz = _employeeAchivementRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_employeeAchivementRemoteModel, modifiedDate);
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

		if (_employeeAchivementRemoteModel != null) {
			try {
				Class<?> clazz = _employeeAchivementRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateBy", long.class);

				method.invoke(_employeeAchivementRemoteModel, createBy);
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

		if (_employeeAchivementRemoteModel != null) {
			try {
				Class<?> clazz = _employeeAchivementRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedBy", long.class);

				method.invoke(_employeeAchivementRemoteModel, modifiedBy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getEmployeeAchivementRemoteModel() {
		return _employeeAchivementRemoteModel;
	}

	public void setEmployeeAchivementRemoteModel(
		BaseModel<?> employeeAchivementRemoteModel) {
		_employeeAchivementRemoteModel = employeeAchivementRemoteModel;
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

		Class<?> remoteModelClass = _employeeAchivementRemoteModel.getClass();

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

		Object returnValue = method.invoke(_employeeAchivementRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			EmployeeAchivementLocalServiceUtil.addEmployeeAchivement(this);
		}
		else {
			EmployeeAchivementLocalServiceUtil.updateEmployeeAchivement(this);
		}
	}

	@Override
	public EmployeeAchivement toEscapedModel() {
		return (EmployeeAchivement)ProxyUtil.newProxyInstance(EmployeeAchivement.class.getClassLoader(),
			new Class[] { EmployeeAchivement.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		EmployeeAchivementClp clone = new EmployeeAchivementClp();

		clone.setEmployeeAchivementId(getEmployeeAchivementId());
		clone.setAchivedBy(getAchivedBy());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setAchivementDate(getAchivementDate());
		clone.setAchivementTitle(getAchivementTitle());
		clone.setAchivementDiscription(getAchivementDiscription());
		clone.setStatus(getStatus());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setCreateBy(getCreateBy());
		clone.setModifiedBy(getModifiedBy());

		return clone;
	}

	@Override
	public int compareTo(EmployeeAchivement employeeAchivement) {
		long primaryKey = employeeAchivement.getPrimaryKey();

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

		if (!(obj instanceof EmployeeAchivementClp)) {
			return false;
		}

		EmployeeAchivementClp employeeAchivement = (EmployeeAchivementClp)obj;

		long primaryKey = employeeAchivement.getPrimaryKey();

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

		sb.append("{employeeAchivementId=");
		sb.append(getEmployeeAchivementId());
		sb.append(", achivedBy=");
		sb.append(getAchivedBy());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", achivementDate=");
		sb.append(getAchivementDate());
		sb.append(", achivementTitle=");
		sb.append(getAchivementTitle());
		sb.append(", achivementDiscription=");
		sb.append(getAchivementDiscription());
		sb.append(", status=");
		sb.append(getStatus());
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
		sb.append("com.hrms.model.EmployeeAchivement");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>employeeAchivementId</column-name><column-value><![CDATA[");
		sb.append(getEmployeeAchivementId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>achivedBy</column-name><column-value><![CDATA[");
		sb.append(getAchivedBy());
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
			"<column><column-name>achivementDate</column-name><column-value><![CDATA[");
		sb.append(getAchivementDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>achivementTitle</column-name><column-value><![CDATA[");
		sb.append(getAchivementTitle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>achivementDiscription</column-name><column-value><![CDATA[");
		sb.append(getAchivementDiscription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
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

	private long _employeeAchivementId;
	private long _achivedBy;
	private long _groupId;
	private long _companyId;
	private Date _achivementDate;
	private String _achivementTitle;
	private String _achivementDiscription;
	private boolean _status;
	private Date _createDate;
	private Date _modifiedDate;
	private long _createBy;
	private long _modifiedBy;
	private BaseModel<?> _employeeAchivementRemoteModel;
}