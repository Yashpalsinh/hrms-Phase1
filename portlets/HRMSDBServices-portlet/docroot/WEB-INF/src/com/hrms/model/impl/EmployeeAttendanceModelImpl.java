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

import com.hrms.model.EmployeeAttendance;
import com.hrms.model.EmployeeAttendanceModel;
import com.hrms.model.EmployeeAttendanceSoap;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
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
 * The base model implementation for the EmployeeAttendance service. Represents a row in the &quot;HRMS_EmployeeAttendance&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.hrms.model.EmployeeAttendanceModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link EmployeeAttendanceImpl}.
 * </p>
 *
 * @author yashpalsinh
 * @see EmployeeAttendanceImpl
 * @see com.hrms.model.EmployeeAttendance
 * @see com.hrms.model.EmployeeAttendanceModel
 * @generated
 */
@JSON(strict = true)
public class EmployeeAttendanceModelImpl extends BaseModelImpl<EmployeeAttendance>
	implements EmployeeAttendanceModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a employee attendance model instance should use the {@link com.hrms.model.EmployeeAttendance} interface instead.
	 */
	public static final String TABLE_NAME = "HRMS_EmployeeAttendance";
	public static final Object[][] TABLE_COLUMNS = {
			{ "attendanceId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "attendanceDate", Types.TIMESTAMP },
			{ "signinTime", Types.TIMESTAMP },
			{ "signoutTime", Types.TIMESTAMP },
			{ "totalTime", Types.DOUBLE },
			{ "approved", Types.BOOLEAN },
			{ "approvedBy", Types.BIGINT },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "createBy", Types.BIGINT },
			{ "modifiedBy", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table HRMS_EmployeeAttendance (attendanceId LONG not null primary key,userId LONG,groupId LONG,companyId LONG,attendanceDate DATE null,signinTime DATE null,signoutTime DATE null,totalTime DOUBLE,approved BOOLEAN,approvedBy LONG,createDate DATE null,modifiedDate DATE null,createBy LONG,modifiedBy LONG)";
	public static final String TABLE_SQL_DROP = "drop table HRMS_EmployeeAttendance";
	public static final String ORDER_BY_JPQL = " ORDER BY employeeAttendance.attendanceId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY HRMS_EmployeeAttendance.attendanceId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.hrms.model.EmployeeAttendance"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.hrms.model.EmployeeAttendance"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.hrms.model.EmployeeAttendance"),
			true);
	public static long CREATEBY_COLUMN_BITMASK = 1L;
	public static long MODIFIEDBY_COLUMN_BITMASK = 2L;
	public static long ATTENDANCEID_COLUMN_BITMASK = 4L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static EmployeeAttendance toModel(EmployeeAttendanceSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		EmployeeAttendance model = new EmployeeAttendanceImpl();

		model.setAttendanceId(soapModel.getAttendanceId());
		model.setUserId(soapModel.getUserId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setAttendanceDate(soapModel.getAttendanceDate());
		model.setSigninTime(soapModel.getSigninTime());
		model.setSignoutTime(soapModel.getSignoutTime());
		model.setTotalTime(soapModel.getTotalTime());
		model.setApproved(soapModel.getApproved());
		model.setApprovedBy(soapModel.getApprovedBy());
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
	public static List<EmployeeAttendance> toModels(
		EmployeeAttendanceSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<EmployeeAttendance> models = new ArrayList<EmployeeAttendance>(soapModels.length);

		for (EmployeeAttendanceSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.hrms.model.EmployeeAttendance"));

	public EmployeeAttendanceModelImpl() {
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
	public Class<?> getModelClass() {
		return EmployeeAttendance.class;
	}

	@Override
	public String getModelClassName() {
		return EmployeeAttendance.class.getName();
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

	@JSON
	@Override
	public long getAttendanceId() {
		return _attendanceId;
	}

	@Override
	public void setAttendanceId(long attendanceId) {
		_attendanceId = attendanceId;
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
	public Date getAttendanceDate() {
		return _attendanceDate;
	}

	@Override
	public void setAttendanceDate(Date attendanceDate) {
		_attendanceDate = attendanceDate;
	}

	@JSON
	@Override
	public Date getSigninTime() {
		return _signinTime;
	}

	@Override
	public void setSigninTime(Date signinTime) {
		_signinTime = signinTime;
	}

	@JSON
	@Override
	public Date getSignoutTime() {
		return _signoutTime;
	}

	@Override
	public void setSignoutTime(Date signoutTime) {
		_signoutTime = signoutTime;
	}

	@JSON
	@Override
	public double getTotalTime() {
		return _totalTime;
	}

	@Override
	public void setTotalTime(double totalTime) {
		_totalTime = totalTime;
	}

	@JSON
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
	}

	@JSON
	@Override
	public long getApprovedBy() {
		return _approvedBy;
	}

	@Override
	public void setApprovedBy(long approvedBy) {
		_approvedBy = approvedBy;
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
			EmployeeAttendance.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public EmployeeAttendance toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (EmployeeAttendance)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		EmployeeAttendanceImpl employeeAttendanceImpl = new EmployeeAttendanceImpl();

		employeeAttendanceImpl.setAttendanceId(getAttendanceId());
		employeeAttendanceImpl.setUserId(getUserId());
		employeeAttendanceImpl.setGroupId(getGroupId());
		employeeAttendanceImpl.setCompanyId(getCompanyId());
		employeeAttendanceImpl.setAttendanceDate(getAttendanceDate());
		employeeAttendanceImpl.setSigninTime(getSigninTime());
		employeeAttendanceImpl.setSignoutTime(getSignoutTime());
		employeeAttendanceImpl.setTotalTime(getTotalTime());
		employeeAttendanceImpl.setApproved(getApproved());
		employeeAttendanceImpl.setApprovedBy(getApprovedBy());
		employeeAttendanceImpl.setCreateDate(getCreateDate());
		employeeAttendanceImpl.setModifiedDate(getModifiedDate());
		employeeAttendanceImpl.setCreateBy(getCreateBy());
		employeeAttendanceImpl.setModifiedBy(getModifiedBy());

		employeeAttendanceImpl.resetOriginalValues();

		return employeeAttendanceImpl;
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

		if (!(obj instanceof EmployeeAttendance)) {
			return false;
		}

		EmployeeAttendance employeeAttendance = (EmployeeAttendance)obj;

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
	public void resetOriginalValues() {
		EmployeeAttendanceModelImpl employeeAttendanceModelImpl = this;

		employeeAttendanceModelImpl._originalCreateBy = employeeAttendanceModelImpl._createBy;

		employeeAttendanceModelImpl._setOriginalCreateBy = false;

		employeeAttendanceModelImpl._originalModifiedBy = employeeAttendanceModelImpl._modifiedBy;

		employeeAttendanceModelImpl._setOriginalModifiedBy = false;

		employeeAttendanceModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<EmployeeAttendance> toCacheModel() {
		EmployeeAttendanceCacheModel employeeAttendanceCacheModel = new EmployeeAttendanceCacheModel();

		employeeAttendanceCacheModel.attendanceId = getAttendanceId();

		employeeAttendanceCacheModel.userId = getUserId();

		employeeAttendanceCacheModel.groupId = getGroupId();

		employeeAttendanceCacheModel.companyId = getCompanyId();

		Date attendanceDate = getAttendanceDate();

		if (attendanceDate != null) {
			employeeAttendanceCacheModel.attendanceDate = attendanceDate.getTime();
		}
		else {
			employeeAttendanceCacheModel.attendanceDate = Long.MIN_VALUE;
		}

		Date signinTime = getSigninTime();

		if (signinTime != null) {
			employeeAttendanceCacheModel.signinTime = signinTime.getTime();
		}
		else {
			employeeAttendanceCacheModel.signinTime = Long.MIN_VALUE;
		}

		Date signoutTime = getSignoutTime();

		if (signoutTime != null) {
			employeeAttendanceCacheModel.signoutTime = signoutTime.getTime();
		}
		else {
			employeeAttendanceCacheModel.signoutTime = Long.MIN_VALUE;
		}

		employeeAttendanceCacheModel.totalTime = getTotalTime();

		employeeAttendanceCacheModel.approved = getApproved();

		employeeAttendanceCacheModel.approvedBy = getApprovedBy();

		Date createDate = getCreateDate();

		if (createDate != null) {
			employeeAttendanceCacheModel.createDate = createDate.getTime();
		}
		else {
			employeeAttendanceCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			employeeAttendanceCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			employeeAttendanceCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		employeeAttendanceCacheModel.createBy = getCreateBy();

		employeeAttendanceCacheModel.modifiedBy = getModifiedBy();

		return employeeAttendanceCacheModel;
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

	private static ClassLoader _classLoader = EmployeeAttendance.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			EmployeeAttendance.class
		};
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
	private long _originalCreateBy;
	private boolean _setOriginalCreateBy;
	private long _modifiedBy;
	private long _originalModifiedBy;
	private boolean _setOriginalModifiedBy;
	private long _columnBitmask;
	private EmployeeAttendance _escapedModel;
}