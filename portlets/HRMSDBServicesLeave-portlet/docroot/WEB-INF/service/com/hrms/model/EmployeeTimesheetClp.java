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
import com.hrms.service.EmployeeTimesheetLocalServiceUtil;

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
public class EmployeeTimesheetClp extends BaseModelImpl<EmployeeTimesheet>
	implements EmployeeTimesheet {
	public EmployeeTimesheetClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return EmployeeTimesheet.class;
	}

	@Override
	public String getModelClassName() {
		return EmployeeTimesheet.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _timesheetId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setTimesheetId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _timesheetId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("timesheetId", getTimesheetId());
		attributes.put("userId", getUserId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("taskTitle", getTaskTitle());
		attributes.put("taskDescription", getTaskDescription());
		attributes.put("taskFileId", getTaskFileId());
		attributes.put("taskFilePath", getTaskFilePath());
		attributes.put("taskStarttime", getTaskStarttime());
		attributes.put("taskEndtime", getTaskEndtime());
		attributes.put("taskDate", getTaskDate());
		attributes.put("duration", getDuration());
		attributes.put("taskCompleted", getTaskCompleted());
		attributes.put("billable", getBillable());
		attributes.put("billed", getBilled());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("createBy", getCreateBy());
		attributes.put("modifiedBy", getModifiedBy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long timesheetId = (Long)attributes.get("timesheetId");

		if (timesheetId != null) {
			setTimesheetId(timesheetId);
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

		String taskTitle = (String)attributes.get("taskTitle");

		if (taskTitle != null) {
			setTaskTitle(taskTitle);
		}

		String taskDescription = (String)attributes.get("taskDescription");

		if (taskDescription != null) {
			setTaskDescription(taskDescription);
		}

		Long taskFileId = (Long)attributes.get("taskFileId");

		if (taskFileId != null) {
			setTaskFileId(taskFileId);
		}

		String taskFilePath = (String)attributes.get("taskFilePath");

		if (taskFilePath != null) {
			setTaskFilePath(taskFilePath);
		}

		Date taskStarttime = (Date)attributes.get("taskStarttime");

		if (taskStarttime != null) {
			setTaskStarttime(taskStarttime);
		}

		Date taskEndtime = (Date)attributes.get("taskEndtime");

		if (taskEndtime != null) {
			setTaskEndtime(taskEndtime);
		}

		Date taskDate = (Date)attributes.get("taskDate");

		if (taskDate != null) {
			setTaskDate(taskDate);
		}

		Date duration = (Date)attributes.get("duration");

		if (duration != null) {
			setDuration(duration);
		}

		Boolean taskCompleted = (Boolean)attributes.get("taskCompleted");

		if (taskCompleted != null) {
			setTaskCompleted(taskCompleted);
		}

		Boolean billable = (Boolean)attributes.get("billable");

		if (billable != null) {
			setBillable(billable);
		}

		Boolean billed = (Boolean)attributes.get("billed");

		if (billed != null) {
			setBilled(billed);
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
	public long getTimesheetId() {
		return _timesheetId;
	}

	@Override
	public void setTimesheetId(long timesheetId) {
		_timesheetId = timesheetId;

		if (_employeeTimesheetRemoteModel != null) {
			try {
				Class<?> clazz = _employeeTimesheetRemoteModel.getClass();

				Method method = clazz.getMethod("setTimesheetId", long.class);

				method.invoke(_employeeTimesheetRemoteModel, timesheetId);
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

		if (_employeeTimesheetRemoteModel != null) {
			try {
				Class<?> clazz = _employeeTimesheetRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_employeeTimesheetRemoteModel, userId);
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

		if (_employeeTimesheetRemoteModel != null) {
			try {
				Class<?> clazz = _employeeTimesheetRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_employeeTimesheetRemoteModel, groupId);
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

		if (_employeeTimesheetRemoteModel != null) {
			try {
				Class<?> clazz = _employeeTimesheetRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_employeeTimesheetRemoteModel, companyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTaskTitle() {
		return _taskTitle;
	}

	@Override
	public void setTaskTitle(String taskTitle) {
		_taskTitle = taskTitle;

		if (_employeeTimesheetRemoteModel != null) {
			try {
				Class<?> clazz = _employeeTimesheetRemoteModel.getClass();

				Method method = clazz.getMethod("setTaskTitle", String.class);

				method.invoke(_employeeTimesheetRemoteModel, taskTitle);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTaskDescription() {
		return _taskDescription;
	}

	@Override
	public void setTaskDescription(String taskDescription) {
		_taskDescription = taskDescription;

		if (_employeeTimesheetRemoteModel != null) {
			try {
				Class<?> clazz = _employeeTimesheetRemoteModel.getClass();

				Method method = clazz.getMethod("setTaskDescription",
						String.class);

				method.invoke(_employeeTimesheetRemoteModel, taskDescription);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getTaskFileId() {
		return _taskFileId;
	}

	@Override
	public void setTaskFileId(long taskFileId) {
		_taskFileId = taskFileId;

		if (_employeeTimesheetRemoteModel != null) {
			try {
				Class<?> clazz = _employeeTimesheetRemoteModel.getClass();

				Method method = clazz.getMethod("setTaskFileId", long.class);

				method.invoke(_employeeTimesheetRemoteModel, taskFileId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTaskFilePath() {
		return _taskFilePath;
	}

	@Override
	public void setTaskFilePath(String taskFilePath) {
		_taskFilePath = taskFilePath;

		if (_employeeTimesheetRemoteModel != null) {
			try {
				Class<?> clazz = _employeeTimesheetRemoteModel.getClass();

				Method method = clazz.getMethod("setTaskFilePath", String.class);

				method.invoke(_employeeTimesheetRemoteModel, taskFilePath);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getTaskStarttime() {
		return _taskStarttime;
	}

	@Override
	public void setTaskStarttime(Date taskStarttime) {
		_taskStarttime = taskStarttime;

		if (_employeeTimesheetRemoteModel != null) {
			try {
				Class<?> clazz = _employeeTimesheetRemoteModel.getClass();

				Method method = clazz.getMethod("setTaskStarttime", Date.class);

				method.invoke(_employeeTimesheetRemoteModel, taskStarttime);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getTaskEndtime() {
		return _taskEndtime;
	}

	@Override
	public void setTaskEndtime(Date taskEndtime) {
		_taskEndtime = taskEndtime;

		if (_employeeTimesheetRemoteModel != null) {
			try {
				Class<?> clazz = _employeeTimesheetRemoteModel.getClass();

				Method method = clazz.getMethod("setTaskEndtime", Date.class);

				method.invoke(_employeeTimesheetRemoteModel, taskEndtime);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getTaskDate() {
		return _taskDate;
	}

	@Override
	public void setTaskDate(Date taskDate) {
		_taskDate = taskDate;

		if (_employeeTimesheetRemoteModel != null) {
			try {
				Class<?> clazz = _employeeTimesheetRemoteModel.getClass();

				Method method = clazz.getMethod("setTaskDate", Date.class);

				method.invoke(_employeeTimesheetRemoteModel, taskDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getDuration() {
		return _duration;
	}

	@Override
	public void setDuration(Date duration) {
		_duration = duration;

		if (_employeeTimesheetRemoteModel != null) {
			try {
				Class<?> clazz = _employeeTimesheetRemoteModel.getClass();

				Method method = clazz.getMethod("setDuration", Date.class);

				method.invoke(_employeeTimesheetRemoteModel, duration);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getTaskCompleted() {
		return _taskCompleted;
	}

	@Override
	public boolean isTaskCompleted() {
		return _taskCompleted;
	}

	@Override
	public void setTaskCompleted(boolean taskCompleted) {
		_taskCompleted = taskCompleted;

		if (_employeeTimesheetRemoteModel != null) {
			try {
				Class<?> clazz = _employeeTimesheetRemoteModel.getClass();

				Method method = clazz.getMethod("setTaskCompleted",
						boolean.class);

				method.invoke(_employeeTimesheetRemoteModel, taskCompleted);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getBillable() {
		return _billable;
	}

	@Override
	public boolean isBillable() {
		return _billable;
	}

	@Override
	public void setBillable(boolean billable) {
		_billable = billable;

		if (_employeeTimesheetRemoteModel != null) {
			try {
				Class<?> clazz = _employeeTimesheetRemoteModel.getClass();

				Method method = clazz.getMethod("setBillable", boolean.class);

				method.invoke(_employeeTimesheetRemoteModel, billable);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getBilled() {
		return _billed;
	}

	@Override
	public boolean isBilled() {
		return _billed;
	}

	@Override
	public void setBilled(boolean billed) {
		_billed = billed;

		if (_employeeTimesheetRemoteModel != null) {
			try {
				Class<?> clazz = _employeeTimesheetRemoteModel.getClass();

				Method method = clazz.getMethod("setBilled", boolean.class);

				method.invoke(_employeeTimesheetRemoteModel, billed);
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

		if (_employeeTimesheetRemoteModel != null) {
			try {
				Class<?> clazz = _employeeTimesheetRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_employeeTimesheetRemoteModel, createDate);
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

		if (_employeeTimesheetRemoteModel != null) {
			try {
				Class<?> clazz = _employeeTimesheetRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_employeeTimesheetRemoteModel, modifiedDate);
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

		if (_employeeTimesheetRemoteModel != null) {
			try {
				Class<?> clazz = _employeeTimesheetRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateBy", long.class);

				method.invoke(_employeeTimesheetRemoteModel, createBy);
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

		if (_employeeTimesheetRemoteModel != null) {
			try {
				Class<?> clazz = _employeeTimesheetRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedBy", long.class);

				method.invoke(_employeeTimesheetRemoteModel, modifiedBy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getEmployeeTimesheetRemoteModel() {
		return _employeeTimesheetRemoteModel;
	}

	public void setEmployeeTimesheetRemoteModel(
		BaseModel<?> employeeTimesheetRemoteModel) {
		_employeeTimesheetRemoteModel = employeeTimesheetRemoteModel;
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

		Class<?> remoteModelClass = _employeeTimesheetRemoteModel.getClass();

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

		Object returnValue = method.invoke(_employeeTimesheetRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			EmployeeTimesheetLocalServiceUtil.addEmployeeTimesheet(this);
		}
		else {
			EmployeeTimesheetLocalServiceUtil.updateEmployeeTimesheet(this);
		}
	}

	@Override
	public EmployeeTimesheet toEscapedModel() {
		return (EmployeeTimesheet)ProxyUtil.newProxyInstance(EmployeeTimesheet.class.getClassLoader(),
			new Class[] { EmployeeTimesheet.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		EmployeeTimesheetClp clone = new EmployeeTimesheetClp();

		clone.setTimesheetId(getTimesheetId());
		clone.setUserId(getUserId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setTaskTitle(getTaskTitle());
		clone.setTaskDescription(getTaskDescription());
		clone.setTaskFileId(getTaskFileId());
		clone.setTaskFilePath(getTaskFilePath());
		clone.setTaskStarttime(getTaskStarttime());
		clone.setTaskEndtime(getTaskEndtime());
		clone.setTaskDate(getTaskDate());
		clone.setDuration(getDuration());
		clone.setTaskCompleted(getTaskCompleted());
		clone.setBillable(getBillable());
		clone.setBilled(getBilled());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setCreateBy(getCreateBy());
		clone.setModifiedBy(getModifiedBy());

		return clone;
	}

	@Override
	public int compareTo(EmployeeTimesheet employeeTimesheet) {
		long primaryKey = employeeTimesheet.getPrimaryKey();

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

		if (!(obj instanceof EmployeeTimesheetClp)) {
			return false;
		}

		EmployeeTimesheetClp employeeTimesheet = (EmployeeTimesheetClp)obj;

		long primaryKey = employeeTimesheet.getPrimaryKey();

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
		StringBundler sb = new StringBundler(39);

		sb.append("{timesheetId=");
		sb.append(getTimesheetId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", taskTitle=");
		sb.append(getTaskTitle());
		sb.append(", taskDescription=");
		sb.append(getTaskDescription());
		sb.append(", taskFileId=");
		sb.append(getTaskFileId());
		sb.append(", taskFilePath=");
		sb.append(getTaskFilePath());
		sb.append(", taskStarttime=");
		sb.append(getTaskStarttime());
		sb.append(", taskEndtime=");
		sb.append(getTaskEndtime());
		sb.append(", taskDate=");
		sb.append(getTaskDate());
		sb.append(", duration=");
		sb.append(getDuration());
		sb.append(", taskCompleted=");
		sb.append(getTaskCompleted());
		sb.append(", billable=");
		sb.append(getBillable());
		sb.append(", billed=");
		sb.append(getBilled());
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
		StringBundler sb = new StringBundler(61);

		sb.append("<model><model-name>");
		sb.append("com.hrms.model.EmployeeTimesheet");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>timesheetId</column-name><column-value><![CDATA[");
		sb.append(getTimesheetId());
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
			"<column><column-name>taskTitle</column-name><column-value><![CDATA[");
		sb.append(getTaskTitle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>taskDescription</column-name><column-value><![CDATA[");
		sb.append(getTaskDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>taskFileId</column-name><column-value><![CDATA[");
		sb.append(getTaskFileId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>taskFilePath</column-name><column-value><![CDATA[");
		sb.append(getTaskFilePath());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>taskStarttime</column-name><column-value><![CDATA[");
		sb.append(getTaskStarttime());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>taskEndtime</column-name><column-value><![CDATA[");
		sb.append(getTaskEndtime());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>taskDate</column-name><column-value><![CDATA[");
		sb.append(getTaskDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>duration</column-name><column-value><![CDATA[");
		sb.append(getDuration());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>taskCompleted</column-name><column-value><![CDATA[");
		sb.append(getTaskCompleted());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>billable</column-name><column-value><![CDATA[");
		sb.append(getBillable());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>billed</column-name><column-value><![CDATA[");
		sb.append(getBilled());
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

	private long _timesheetId;
	private long _userId;
	private String _userUuid;
	private long _groupId;
	private long _companyId;
	private String _taskTitle;
	private String _taskDescription;
	private long _taskFileId;
	private String _taskFilePath;
	private Date _taskStarttime;
	private Date _taskEndtime;
	private Date _taskDate;
	private Date _duration;
	private boolean _taskCompleted;
	private boolean _billable;
	private boolean _billed;
	private Date _createDate;
	private Date _modifiedDate;
	private long _createBy;
	private long _modifiedBy;
	private BaseModel<?> _employeeTimesheetRemoteModel;
}