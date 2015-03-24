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

package com.hrms.model.impl;

import com.hrms.model.EmployeeTimesheet;
import com.hrms.model.EmployeeTimesheetModel;
import com.hrms.model.EmployeeTimesheetSoap;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the EmployeeTimesheet service. Represents a row in the &quot;HRMS_EmployeeTimesheet&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.hrms.model.EmployeeTimesheetModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link EmployeeTimesheetImpl}.
 * </p>
 *
 * @author yashpalsinh
 * @see EmployeeTimesheetImpl
 * @see com.hrms.model.EmployeeTimesheet
 * @see com.hrms.model.EmployeeTimesheetModel
 * @generated
 */
@JSON(strict = true)
public class EmployeeTimesheetModelImpl extends BaseModelImpl<EmployeeTimesheet>
	implements EmployeeTimesheetModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a employee timesheet model instance should use the {@link com.hrms.model.EmployeeTimesheet} interface instead.
	 */
	public static final String TABLE_NAME = "HRMS_EmployeeTimesheet";
	public static final Object[][] TABLE_COLUMNS = {
			{ "timesheetId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "taskTitle", Types.VARCHAR },
			{ "taskDescription", Types.VARCHAR },
			{ "taskStarttime", Types.TIMESTAMP },
			{ "taskEndtime", Types.TIMESTAMP },
			{ "taskDate", Types.TIMESTAMP },
			{ "duration", Types.VARCHAR },
			{ "taskCompleted", Types.BOOLEAN },
			{ "billable", Types.BOOLEAN },
			{ "billed", Types.BOOLEAN },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "createBy", Types.BIGINT },
			{ "modifiedBy", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table HRMS_EmployeeTimesheet (timesheetId LONG not null primary key,userId LONG,groupId LONG,companyId LONG,taskTitle VARCHAR(75) null,taskDescription VARCHAR(75) null,taskStarttime DATE null,taskEndtime DATE null,taskDate DATE null,duration VARCHAR(75) null,taskCompleted BOOLEAN,billable BOOLEAN,billed BOOLEAN,createDate DATE null,modifiedDate DATE null,createBy LONG,modifiedBy LONG)";
	public static final String TABLE_SQL_DROP = "drop table HRMS_EmployeeTimesheet";
	public static final String ORDER_BY_JPQL = " ORDER BY employeeTimesheet.timesheetId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY HRMS_EmployeeTimesheet.timesheetId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.hrms.model.EmployeeTimesheet"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.hrms.model.EmployeeTimesheet"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.hrms.model.EmployeeTimesheet"),
			true);
	public static long CREATEBY_COLUMN_BITMASK = 1L;
	public static long MODIFIEDBY_COLUMN_BITMASK = 2L;
	public static long TIMESHEETID_COLUMN_BITMASK = 4L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static EmployeeTimesheet toModel(EmployeeTimesheetSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		EmployeeTimesheet model = new EmployeeTimesheetImpl();

		model.setTimesheetId(soapModel.getTimesheetId());
		model.setUserId(soapModel.getUserId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setTaskTitle(soapModel.getTaskTitle());
		model.setTaskDescription(soapModel.getTaskDescription());
		model.setTaskStarttime(soapModel.getTaskStarttime());
		model.setTaskEndtime(soapModel.getTaskEndtime());
		model.setTaskDate(soapModel.getTaskDate());
		model.setDuration(soapModel.getDuration());
		model.setTaskCompleted(soapModel.getTaskCompleted());
		model.setBillable(soapModel.getBillable());
		model.setBilled(soapModel.getBilled());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setCreateBy(soapModel.getCreateBy());
		model.setModifiedBy(soapModel.getModifiedBy());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<EmployeeTimesheet> toModels(
		EmployeeTimesheetSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<EmployeeTimesheet> models = new ArrayList<EmployeeTimesheet>(soapModels.length);

		for (EmployeeTimesheetSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.hrms.model.EmployeeTimesheet"));

	public EmployeeTimesheetModelImpl() {
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
	public Class<?> getModelClass() {
		return EmployeeTimesheet.class;
	}

	@Override
	public String getModelClassName() {
		return EmployeeTimesheet.class.getName();
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

		String duration = (String)attributes.get("duration");

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

	@JSON
	@Override
	public long getTimesheetId() {
		return _timesheetId;
	}

	@Override
	public void setTimesheetId(long timesheetId) {
		_timesheetId = timesheetId;
	}

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@JSON
	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	@JSON
	@Override
	public String getTaskTitle() {
		if (_taskTitle == null) {
			return StringPool.BLANK;
		}
		else {
			return _taskTitle;
		}
	}

	@Override
	public void setTaskTitle(String taskTitle) {
		_taskTitle = taskTitle;
	}

	@JSON
	@Override
	public String getTaskDescription() {
		if (_taskDescription == null) {
			return StringPool.BLANK;
		}
		else {
			return _taskDescription;
		}
	}

	@Override
	public void setTaskDescription(String taskDescription) {
		_taskDescription = taskDescription;
	}

	@JSON
	@Override
	public Date getTaskStarttime() {
		return _taskStarttime;
	}

	@Override
	public void setTaskStarttime(Date taskStarttime) {
		_taskStarttime = taskStarttime;
	}

	@JSON
	@Override
	public Date getTaskEndtime() {
		return _taskEndtime;
	}

	@Override
	public void setTaskEndtime(Date taskEndtime) {
		_taskEndtime = taskEndtime;
	}

	@JSON
	@Override
	public Date getTaskDate() {
		return _taskDate;
	}

	@Override
	public void setTaskDate(Date taskDate) {
		_taskDate = taskDate;
	}

	@JSON
	@Override
	public String getDuration() {
		if (_duration == null) {
			return StringPool.BLANK;
		}
		else {
			return _duration;
		}
	}

	@Override
	public void setDuration(String duration) {
		_duration = duration;
	}

	@JSON
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
	}

	@JSON
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
	}

	@JSON
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
	}

	@JSON
	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@JSON
	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	@JSON
	@Override
	public long getCreateBy() {
		return _createBy;
	}

	@Override
	public void setCreateBy(long createBy) {
		_columnBitmask |= CREATEBY_COLUMN_BITMASK;

		if (!_setOriginalCreateBy) {
			_setOriginalCreateBy = true;

			_originalCreateBy = _createBy;
		}

		_createBy = createBy;
	}

	public long getOriginalCreateBy() {
		return _originalCreateBy;
	}

	@JSON
	@Override
	public long getModifiedBy() {
		return _modifiedBy;
	}

	@Override
	public void setModifiedBy(long modifiedBy) {
		_columnBitmask |= MODIFIEDBY_COLUMN_BITMASK;

		if (!_setOriginalModifiedBy) {
			_setOriginalModifiedBy = true;

			_originalModifiedBy = _modifiedBy;
		}

		_modifiedBy = modifiedBy;
	}

	public long getOriginalModifiedBy() {
		return _originalModifiedBy;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			EmployeeTimesheet.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public EmployeeTimesheet toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (EmployeeTimesheet)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		EmployeeTimesheetImpl employeeTimesheetImpl = new EmployeeTimesheetImpl();

		employeeTimesheetImpl.setTimesheetId(getTimesheetId());
		employeeTimesheetImpl.setUserId(getUserId());
		employeeTimesheetImpl.setGroupId(getGroupId());
		employeeTimesheetImpl.setCompanyId(getCompanyId());
		employeeTimesheetImpl.setTaskTitle(getTaskTitle());
		employeeTimesheetImpl.setTaskDescription(getTaskDescription());
		employeeTimesheetImpl.setTaskStarttime(getTaskStarttime());
		employeeTimesheetImpl.setTaskEndtime(getTaskEndtime());
		employeeTimesheetImpl.setTaskDate(getTaskDate());
		employeeTimesheetImpl.setDuration(getDuration());
		employeeTimesheetImpl.setTaskCompleted(getTaskCompleted());
		employeeTimesheetImpl.setBillable(getBillable());
		employeeTimesheetImpl.setBilled(getBilled());
		employeeTimesheetImpl.setCreateDate(getCreateDate());
		employeeTimesheetImpl.setModifiedDate(getModifiedDate());
		employeeTimesheetImpl.setCreateBy(getCreateBy());
		employeeTimesheetImpl.setModifiedBy(getModifiedBy());

		employeeTimesheetImpl.resetOriginalValues();

		return employeeTimesheetImpl;
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

		if (!(obj instanceof EmployeeTimesheet)) {
			return false;
		}

		EmployeeTimesheet employeeTimesheet = (EmployeeTimesheet)obj;

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
	public void resetOriginalValues() {
		EmployeeTimesheetModelImpl employeeTimesheetModelImpl = this;

		employeeTimesheetModelImpl._originalCreateBy = employeeTimesheetModelImpl._createBy;

		employeeTimesheetModelImpl._setOriginalCreateBy = false;

		employeeTimesheetModelImpl._originalModifiedBy = employeeTimesheetModelImpl._modifiedBy;

		employeeTimesheetModelImpl._setOriginalModifiedBy = false;

		employeeTimesheetModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<EmployeeTimesheet> toCacheModel() {
		EmployeeTimesheetCacheModel employeeTimesheetCacheModel = new EmployeeTimesheetCacheModel();

		employeeTimesheetCacheModel.timesheetId = getTimesheetId();

		employeeTimesheetCacheModel.userId = getUserId();

		employeeTimesheetCacheModel.groupId = getGroupId();

		employeeTimesheetCacheModel.companyId = getCompanyId();

		employeeTimesheetCacheModel.taskTitle = getTaskTitle();

		String taskTitle = employeeTimesheetCacheModel.taskTitle;

		if ((taskTitle != null) && (taskTitle.length() == 0)) {
			employeeTimesheetCacheModel.taskTitle = null;
		}

		employeeTimesheetCacheModel.taskDescription = getTaskDescription();

		String taskDescription = employeeTimesheetCacheModel.taskDescription;

		if ((taskDescription != null) && (taskDescription.length() == 0)) {
			employeeTimesheetCacheModel.taskDescription = null;
		}

		Date taskStarttime = getTaskStarttime();

		if (taskStarttime != null) {
			employeeTimesheetCacheModel.taskStarttime = taskStarttime.getTime();
		}
		else {
			employeeTimesheetCacheModel.taskStarttime = Long.MIN_VALUE;
		}

		Date taskEndtime = getTaskEndtime();

		if (taskEndtime != null) {
			employeeTimesheetCacheModel.taskEndtime = taskEndtime.getTime();
		}
		else {
			employeeTimesheetCacheModel.taskEndtime = Long.MIN_VALUE;
		}

		Date taskDate = getTaskDate();

		if (taskDate != null) {
			employeeTimesheetCacheModel.taskDate = taskDate.getTime();
		}
		else {
			employeeTimesheetCacheModel.taskDate = Long.MIN_VALUE;
		}

		employeeTimesheetCacheModel.duration = getDuration();

		String duration = employeeTimesheetCacheModel.duration;

		if ((duration != null) && (duration.length() == 0)) {
			employeeTimesheetCacheModel.duration = null;
		}

		employeeTimesheetCacheModel.taskCompleted = getTaskCompleted();

		employeeTimesheetCacheModel.billable = getBillable();

		employeeTimesheetCacheModel.billed = getBilled();

		Date createDate = getCreateDate();

		if (createDate != null) {
			employeeTimesheetCacheModel.createDate = createDate.getTime();
		}
		else {
			employeeTimesheetCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			employeeTimesheetCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			employeeTimesheetCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		employeeTimesheetCacheModel.createBy = getCreateBy();

		employeeTimesheetCacheModel.modifiedBy = getModifiedBy();

		return employeeTimesheetCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(35);

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
		StringBundler sb = new StringBundler(55);

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

	private static ClassLoader _classLoader = EmployeeTimesheet.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			EmployeeTimesheet.class
		};
	private long _timesheetId;
	private long _userId;
	private String _userUuid;
	private long _groupId;
	private long _companyId;
	private String _taskTitle;
	private String _taskDescription;
	private Date _taskStarttime;
	private Date _taskEndtime;
	private Date _taskDate;
	private String _duration;
	private boolean _taskCompleted;
	private boolean _billable;
	private boolean _billed;
	private Date _createDate;
	private Date _modifiedDate;
	private long _createBy;
	private long _originalCreateBy;
	private boolean _setOriginalCreateBy;
	private long _modifiedBy;
	private long _originalModifiedBy;
	private boolean _setOriginalModifiedBy;
	private long _columnBitmask;
	private EmployeeTimesheet _escapedModel;
}