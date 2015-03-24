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
import com.hrms.service.EmployeeLeaveLocalServiceUtil;

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
public class EmployeeLeaveClp extends BaseModelImpl<EmployeeLeave>
	implements EmployeeLeave {
	public EmployeeLeaveClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return EmployeeLeave.class;
	}

	@Override
	public String getModelClassName() {
		return EmployeeLeave.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _employeeLeaveId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setEmployeeLeaveId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _employeeLeaveId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("employeeLeaveId", getEmployeeLeaveId());
		attributes.put("userId", getUserId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("year", getYear());
		attributes.put("leavesCarriedOver", getLeavesCarriedOver());
		attributes.put("leavesTakenThisYear", getLeavesTakenThisYear());
		attributes.put("remainingLeaves", getRemainingLeaves());
		attributes.put("leaveId", getLeaveId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("createBy", getCreateBy());
		attributes.put("modifiedBy", getModifiedBy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long employeeLeaveId = (Long)attributes.get("employeeLeaveId");

		if (employeeLeaveId != null) {
			setEmployeeLeaveId(employeeLeaveId);
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

		Integer year = (Integer)attributes.get("year");

		if (year != null) {
			setYear(year);
		}

		Integer leavesCarriedOver = (Integer)attributes.get("leavesCarriedOver");

		if (leavesCarriedOver != null) {
			setLeavesCarriedOver(leavesCarriedOver);
		}

		Integer leavesTakenThisYear = (Integer)attributes.get(
				"leavesTakenThisYear");

		if (leavesTakenThisYear != null) {
			setLeavesTakenThisYear(leavesTakenThisYear);
		}

		Integer remainingLeaves = (Integer)attributes.get("remainingLeaves");

		if (remainingLeaves != null) {
			setRemainingLeaves(remainingLeaves);
		}

		Long leaveId = (Long)attributes.get("leaveId");

		if (leaveId != null) {
			setLeaveId(leaveId);
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
	public long getEmployeeLeaveId() {
		return _employeeLeaveId;
	}

	@Override
	public void setEmployeeLeaveId(long employeeLeaveId) {
		_employeeLeaveId = employeeLeaveId;

		if (_employeeLeaveRemoteModel != null) {
			try {
				Class<?> clazz = _employeeLeaveRemoteModel.getClass();

				Method method = clazz.getMethod("setEmployeeLeaveId", long.class);

				method.invoke(_employeeLeaveRemoteModel, employeeLeaveId);
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

		if (_employeeLeaveRemoteModel != null) {
			try {
				Class<?> clazz = _employeeLeaveRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_employeeLeaveRemoteModel, userId);
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

		if (_employeeLeaveRemoteModel != null) {
			try {
				Class<?> clazz = _employeeLeaveRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_employeeLeaveRemoteModel, groupId);
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

		if (_employeeLeaveRemoteModel != null) {
			try {
				Class<?> clazz = _employeeLeaveRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_employeeLeaveRemoteModel, companyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getYear() {
		return _year;
	}

	@Override
	public void setYear(int year) {
		_year = year;

		if (_employeeLeaveRemoteModel != null) {
			try {
				Class<?> clazz = _employeeLeaveRemoteModel.getClass();

				Method method = clazz.getMethod("setYear", int.class);

				method.invoke(_employeeLeaveRemoteModel, year);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getLeavesCarriedOver() {
		return _leavesCarriedOver;
	}

	@Override
	public void setLeavesCarriedOver(int leavesCarriedOver) {
		_leavesCarriedOver = leavesCarriedOver;

		if (_employeeLeaveRemoteModel != null) {
			try {
				Class<?> clazz = _employeeLeaveRemoteModel.getClass();

				Method method = clazz.getMethod("setLeavesCarriedOver",
						int.class);

				method.invoke(_employeeLeaveRemoteModel, leavesCarriedOver);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getLeavesTakenThisYear() {
		return _leavesTakenThisYear;
	}

	@Override
	public void setLeavesTakenThisYear(int leavesTakenThisYear) {
		_leavesTakenThisYear = leavesTakenThisYear;

		if (_employeeLeaveRemoteModel != null) {
			try {
				Class<?> clazz = _employeeLeaveRemoteModel.getClass();

				Method method = clazz.getMethod("setLeavesTakenThisYear",
						int.class);

				method.invoke(_employeeLeaveRemoteModel, leavesTakenThisYear);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getRemainingLeaves() {
		return _remainingLeaves;
	}

	@Override
	public void setRemainingLeaves(int remainingLeaves) {
		_remainingLeaves = remainingLeaves;

		if (_employeeLeaveRemoteModel != null) {
			try {
				Class<?> clazz = _employeeLeaveRemoteModel.getClass();

				Method method = clazz.getMethod("setRemainingLeaves", int.class);

				method.invoke(_employeeLeaveRemoteModel, remainingLeaves);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getLeaveId() {
		return _leaveId;
	}

	@Override
	public void setLeaveId(long leaveId) {
		_leaveId = leaveId;

		if (_employeeLeaveRemoteModel != null) {
			try {
				Class<?> clazz = _employeeLeaveRemoteModel.getClass();

				Method method = clazz.getMethod("setLeaveId", long.class);

				method.invoke(_employeeLeaveRemoteModel, leaveId);
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

		if (_employeeLeaveRemoteModel != null) {
			try {
				Class<?> clazz = _employeeLeaveRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_employeeLeaveRemoteModel, createDate);
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

		if (_employeeLeaveRemoteModel != null) {
			try {
				Class<?> clazz = _employeeLeaveRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_employeeLeaveRemoteModel, modifiedDate);
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

		if (_employeeLeaveRemoteModel != null) {
			try {
				Class<?> clazz = _employeeLeaveRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateBy", long.class);

				method.invoke(_employeeLeaveRemoteModel, createBy);
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

		if (_employeeLeaveRemoteModel != null) {
			try {
				Class<?> clazz = _employeeLeaveRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedBy", long.class);

				method.invoke(_employeeLeaveRemoteModel, modifiedBy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getEmployeeLeaveRemoteModel() {
		return _employeeLeaveRemoteModel;
	}

	public void setEmployeeLeaveRemoteModel(
		BaseModel<?> employeeLeaveRemoteModel) {
		_employeeLeaveRemoteModel = employeeLeaveRemoteModel;
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

		Class<?> remoteModelClass = _employeeLeaveRemoteModel.getClass();

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

		Object returnValue = method.invoke(_employeeLeaveRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			EmployeeLeaveLocalServiceUtil.addEmployeeLeave(this);
		}
		else {
			EmployeeLeaveLocalServiceUtil.updateEmployeeLeave(this);
		}
	}

	@Override
	public EmployeeLeave toEscapedModel() {
		return (EmployeeLeave)ProxyUtil.newProxyInstance(EmployeeLeave.class.getClassLoader(),
			new Class[] { EmployeeLeave.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		EmployeeLeaveClp clone = new EmployeeLeaveClp();

		clone.setEmployeeLeaveId(getEmployeeLeaveId());
		clone.setUserId(getUserId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setYear(getYear());
		clone.setLeavesCarriedOver(getLeavesCarriedOver());
		clone.setLeavesTakenThisYear(getLeavesTakenThisYear());
		clone.setRemainingLeaves(getRemainingLeaves());
		clone.setLeaveId(getLeaveId());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setCreateBy(getCreateBy());
		clone.setModifiedBy(getModifiedBy());

		return clone;
	}

	@Override
	public int compareTo(EmployeeLeave employeeLeave) {
		long primaryKey = employeeLeave.getPrimaryKey();

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

		if (!(obj instanceof EmployeeLeaveClp)) {
			return false;
		}

		EmployeeLeaveClp employeeLeave = (EmployeeLeaveClp)obj;

		long primaryKey = employeeLeave.getPrimaryKey();

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
		StringBundler sb = new StringBundler(27);

		sb.append("{employeeLeaveId=");
		sb.append(getEmployeeLeaveId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", year=");
		sb.append(getYear());
		sb.append(", leavesCarriedOver=");
		sb.append(getLeavesCarriedOver());
		sb.append(", leavesTakenThisYear=");
		sb.append(getLeavesTakenThisYear());
		sb.append(", remainingLeaves=");
		sb.append(getRemainingLeaves());
		sb.append(", leaveId=");
		sb.append(getLeaveId());
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
		StringBundler sb = new StringBundler(43);

		sb.append("<model><model-name>");
		sb.append("com.hrms.model.EmployeeLeave");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>employeeLeaveId</column-name><column-value><![CDATA[");
		sb.append(getEmployeeLeaveId());
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
			"<column><column-name>year</column-name><column-value><![CDATA[");
		sb.append(getYear());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>leavesCarriedOver</column-name><column-value><![CDATA[");
		sb.append(getLeavesCarriedOver());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>leavesTakenThisYear</column-name><column-value><![CDATA[");
		sb.append(getLeavesTakenThisYear());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>remainingLeaves</column-name><column-value><![CDATA[");
		sb.append(getRemainingLeaves());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>leaveId</column-name><column-value><![CDATA[");
		sb.append(getLeaveId());
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

	private long _employeeLeaveId;
	private long _userId;
	private String _userUuid;
	private long _groupId;
	private long _companyId;
	private int _year;
	private int _leavesCarriedOver;
	private int _leavesTakenThisYear;
	private int _remainingLeaves;
	private long _leaveId;
	private Date _createDate;
	private Date _modifiedDate;
	private long _createBy;
	private long _modifiedBy;
	private BaseModel<?> _employeeLeaveRemoteModel;
}