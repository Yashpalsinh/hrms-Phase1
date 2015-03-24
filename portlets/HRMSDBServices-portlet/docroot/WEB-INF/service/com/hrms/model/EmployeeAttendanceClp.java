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
import com.hrms.service.EmployeeAttendanceLocalServiceUtil;

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
public class EmployeeAttendanceClp extends BaseModelImpl<EmployeeAttendance>
	implements EmployeeAttendance {
	public EmployeeAttendanceClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return EmployeeAttendance.class;
	}

	@Override
	public String getModelClassName() {
		return EmployeeAttendance.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _attendanceId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setAttendanceId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _attendanceId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("attendanceId", getAttendanceId());
		attributes.put("userId", getUserId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("attendanceDate", getAttendanceDate());
		attributes.put("signinTime", getSigninTime());
		attributes.put("signoutTime", getSignoutTime());
		attributes.put("totalTime", getTotalTime());
		attributes.put("approved", getApproved());
		attributes.put("approvedBy", getApprovedBy());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("createBy", getCreateBy());
		attributes.put("modifiedBy", getModifiedBy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long attendanceId = (Long)attributes.get("attendanceId");

		if (attendanceId != null) {
			setAttendanceId(attendanceId);
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

		Date attendanceDate = (Date)attributes.get("attendanceDate");

		if (attendanceDate != null) {
			setAttendanceDate(attendanceDate);
		}

		Date signinTime = (Date)attributes.get("signinTime");

		if (signinTime != null) {
			setSigninTime(signinTime);
		}

		Date signoutTime = (Date)attributes.get("signoutTime");

		if (signoutTime != null) {
			setSignoutTime(signoutTime);
		}

		Double totalTime = (Double)attributes.get("totalTime");

		if (totalTime != null) {
			setTotalTime(totalTime);
		}

		Boolean approved = (Boolean)attributes.get("approved");

		if (approved != null) {
			setApproved(approved);
		}

		Long approvedBy = (Long)attributes.get("approvedBy");

		if (approvedBy != null) {
			setApprovedBy(approvedBy);
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
	public long getAttendanceId() {
		return _attendanceId;
	}

	@Override
	public void setAttendanceId(long attendanceId) {
		_attendanceId = attendanceId;

		if (_employeeAttendanceRemoteModel != null) {
			try {
				Class<?> clazz = _employeeAttendanceRemoteModel.getClass();

				Method method = clazz.getMethod("setAttendanceId", long.class);

				method.invoke(_employeeAttendanceRemoteModel, attendanceId);
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

		if (_employeeAttendanceRemoteModel != null) {
			try {
				Class<?> clazz = _employeeAttendanceRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_employeeAttendanceRemoteModel, userId);
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

		if (_employeeAttendanceRemoteModel != null) {
			try {
				Class<?> clazz = _employeeAttendanceRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_employeeAttendanceRemoteModel, groupId);
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

		if (_employeeAttendanceRemoteModel != null) {
			try {
				Class<?> clazz = _employeeAttendanceRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_employeeAttendanceRemoteModel, companyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getAttendanceDate() {
		return _attendanceDate;
	}

	@Override
	public void setAttendanceDate(Date attendanceDate) {
		_attendanceDate = attendanceDate;

		if (_employeeAttendanceRemoteModel != null) {
			try {
				Class<?> clazz = _employeeAttendanceRemoteModel.getClass();

				Method method = clazz.getMethod("setAttendanceDate", Date.class);

				method.invoke(_employeeAttendanceRemoteModel, attendanceDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getSigninTime() {
		return _signinTime;
	}

	@Override
	public void setSigninTime(Date signinTime) {
		_signinTime = signinTime;

		if (_employeeAttendanceRemoteModel != null) {
			try {
				Class<?> clazz = _employeeAttendanceRemoteModel.getClass();

				Method method = clazz.getMethod("setSigninTime", Date.class);

				method.invoke(_employeeAttendanceRemoteModel, signinTime);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getSignoutTime() {
		return _signoutTime;
	}

	@Override
	public void setSignoutTime(Date signoutTime) {
		_signoutTime = signoutTime;

		if (_employeeAttendanceRemoteModel != null) {
			try {
				Class<?> clazz = _employeeAttendanceRemoteModel.getClass();

				Method method = clazz.getMethod("setSignoutTime", Date.class);

				method.invoke(_employeeAttendanceRemoteModel, signoutTime);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getTotalTime() {
		return _totalTime;
	}

	@Override
	public void setTotalTime(double totalTime) {
		_totalTime = totalTime;

		if (_employeeAttendanceRemoteModel != null) {
			try {
				Class<?> clazz = _employeeAttendanceRemoteModel.getClass();

				Method method = clazz.getMethod("setTotalTime", double.class);

				method.invoke(_employeeAttendanceRemoteModel, totalTime);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getApproved() {
		return _approved;
	}

	@Override
	public boolean isApproved() {
		return _approved;
	}

	@Override
	public void setApproved(boolean approved) {
		_approved = approved;

		if (_employeeAttendanceRemoteModel != null) {
			try {
				Class<?> clazz = _employeeAttendanceRemoteModel.getClass();

				Method method = clazz.getMethod("setApproved", boolean.class);

				method.invoke(_employeeAttendanceRemoteModel, approved);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getApprovedBy() {
		return _approvedBy;
	}

	@Override
	public void setApprovedBy(long approvedBy) {
		_approvedBy = approvedBy;

		if (_employeeAttendanceRemoteModel != null) {
			try {
				Class<?> clazz = _employeeAttendanceRemoteModel.getClass();

				Method method = clazz.getMethod("setApprovedBy", long.class);

				method.invoke(_employeeAttendanceRemoteModel, approvedBy);
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

		if (_employeeAttendanceRemoteModel != null) {
			try {
				Class<?> clazz = _employeeAttendanceRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_employeeAttendanceRemoteModel, createDate);
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

		if (_employeeAttendanceRemoteModel != null) {
			try {
				Class<?> clazz = _employeeAttendanceRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_employeeAttendanceRemoteModel, modifiedDate);
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

		if (_employeeAttendanceRemoteModel != null) {
			try {
				Class<?> clazz = _employeeAttendanceRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateBy", long.class);

				method.invoke(_employeeAttendanceRemoteModel, createBy);
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

		if (_employeeAttendanceRemoteModel != null) {
			try {
				Class<?> clazz = _employeeAttendanceRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedBy", long.class);

				method.invoke(_employeeAttendanceRemoteModel, modifiedBy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getEmployeeAttendanceRemoteModel() {
		return _employeeAttendanceRemoteModel;
	}

	public void setEmployeeAttendanceRemoteModel(
		BaseModel<?> employeeAttendanceRemoteModel) {
		_employeeAttendanceRemoteModel = employeeAttendanceRemoteModel;
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

		Class<?> remoteModelClass = _employeeAttendanceRemoteModel.getClass();

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

		Object returnValue = method.invoke(_employeeAttendanceRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			EmployeeAttendanceLocalServiceUtil.addEmployeeAttendance(this);
		}
		else {
			EmployeeAttendanceLocalServiceUtil.updateEmployeeAttendance(this);
		}
	}

	@Override
	public EmployeeAttendance toEscapedModel() {
		return (EmployeeAttendance)ProxyUtil.newProxyInstance(EmployeeAttendance.class.getClassLoader(),
			new Class[] { EmployeeAttendance.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		EmployeeAttendanceClp clone = new EmployeeAttendanceClp();

		clone.setAttendanceId(getAttendanceId());
		clone.setUserId(getUserId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setAttendanceDate(getAttendanceDate());
		clone.setSigninTime(getSigninTime());
		clone.setSignoutTime(getSignoutTime());
		clone.setTotalTime(getTotalTime());
		clone.setApproved(getApproved());
		clone.setApprovedBy(getApprovedBy());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setCreateBy(getCreateBy());
		clone.setModifiedBy(getModifiedBy());

		return clone;
	}

	@Override
	public int compareTo(EmployeeAttendance employeeAttendance) {
		long primaryKey = employeeAttendance.getPrimaryKey();

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

		if (!(obj instanceof EmployeeAttendanceClp)) {
			return false;
		}

		EmployeeAttendanceClp employeeAttendance = (EmployeeAttendanceClp)obj;

		long primaryKey = employeeAttendance.getPrimaryKey();

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
		StringBundler sb = new StringBundler(29);

		sb.append("{attendanceId=");
		sb.append(getAttendanceId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", attendanceDate=");
		sb.append(getAttendanceDate());
		sb.append(", signinTime=");
		sb.append(getSigninTime());
		sb.append(", signoutTime=");
		sb.append(getSignoutTime());
		sb.append(", totalTime=");
		sb.append(getTotalTime());
		sb.append(", approved=");
		sb.append(getApproved());
		sb.append(", approvedBy=");
		sb.append(getApprovedBy());
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
		StringBundler sb = new StringBundler(46);

		sb.append("<model><model-name>");
		sb.append("com.hrms.model.EmployeeAttendance");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>attendanceId</column-name><column-value><![CDATA[");
		sb.append(getAttendanceId());
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
			"<column><column-name>attendanceDate</column-name><column-value><![CDATA[");
		sb.append(getAttendanceDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>signinTime</column-name><column-value><![CDATA[");
		sb.append(getSigninTime());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>signoutTime</column-name><column-value><![CDATA[");
		sb.append(getSignoutTime());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>totalTime</column-name><column-value><![CDATA[");
		sb.append(getTotalTime());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>approved</column-name><column-value><![CDATA[");
		sb.append(getApproved());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>approvedBy</column-name><column-value><![CDATA[");
		sb.append(getApprovedBy());
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

	private long _attendanceId;
	private long _userId;
	private String _userUuid;
	private long _groupId;
	private long _companyId;
	private Date _attendanceDate;
	private Date _signinTime;
	private Date _signoutTime;
	private double _totalTime;
	private boolean _approved;
	private long _approvedBy;
	private Date _createDate;
	private Date _modifiedDate;
	private long _createBy;
	private long _modifiedBy;
	private BaseModel<?> _employeeAttendanceRemoteModel;
}