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

import com.hrms.model.EmployeeDepartment;
import com.hrms.model.EmployeeDepartmentModel;
import com.hrms.model.EmployeeDepartmentSoap;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the EmployeeDepartment service. Represents a row in the &quot;HRMS_EmployeeDepartment&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.hrms.model.EmployeeDepartmentModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link EmployeeDepartmentImpl}.
 * </p>
 *
 * @author yashpalsinh
 * @see EmployeeDepartmentImpl
 * @see com.hrms.model.EmployeeDepartment
 * @see com.hrms.model.EmployeeDepartmentModel
 * @generated
 */
@JSON(strict = true)
public class EmployeeDepartmentModelImpl extends BaseModelImpl<EmployeeDepartment>
	implements EmployeeDepartmentModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a employee department model instance should use the {@link com.hrms.model.EmployeeDepartment} interface instead.
	 */
	public static final String TABLE_NAME = "HRMS_EmployeeDepartment";
	public static final Object[][] TABLE_COLUMNS = {
			{ "employeeDepartmentId", Types.BIGINT },
			{ "departmentName", Types.VARCHAR },
			{ "status", Types.BOOLEAN }
		};
	public static final String TABLE_SQL_CREATE = "create table HRMS_EmployeeDepartment (employeeDepartmentId LONG not null primary key,departmentName VARCHAR(75) null,status BOOLEAN)";
	public static final String TABLE_SQL_DROP = "drop table HRMS_EmployeeDepartment";
	public static final String ORDER_BY_JPQL = " ORDER BY employeeDepartment.employeeDepartmentId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY HRMS_EmployeeDepartment.employeeDepartmentId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.hrms.model.EmployeeDepartment"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.hrms.model.EmployeeDepartment"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.hrms.model.EmployeeDepartment"),
			true);
	public static long EMPLOYEEDEPARTMENTID_COLUMN_BITMASK = 1L;
	public static long STATUS_COLUMN_BITMASK = 2L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static EmployeeDepartment toModel(EmployeeDepartmentSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		EmployeeDepartment model = new EmployeeDepartmentImpl();

		model.setEmployeeDepartmentId(soapModel.getEmployeeDepartmentId());
		model.setDepartmentName(soapModel.getDepartmentName());
		model.setStatus(soapModel.getStatus());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<EmployeeDepartment> toModels(
		EmployeeDepartmentSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<EmployeeDepartment> models = new ArrayList<EmployeeDepartment>(soapModels.length);

		for (EmployeeDepartmentSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.hrms.model.EmployeeDepartment"));

	public EmployeeDepartmentModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _employeeDepartmentId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setEmployeeDepartmentId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _employeeDepartmentId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return EmployeeDepartment.class;
	}

	@Override
	public String getModelClassName() {
		return EmployeeDepartment.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("employeeDepartmentId", getEmployeeDepartmentId());
		attributes.put("departmentName", getDepartmentName());
		attributes.put("status", getStatus());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long employeeDepartmentId = (Long)attributes.get("employeeDepartmentId");

		if (employeeDepartmentId != null) {
			setEmployeeDepartmentId(employeeDepartmentId);
		}

		String departmentName = (String)attributes.get("departmentName");

		if (departmentName != null) {
			setDepartmentName(departmentName);
		}

		Boolean status = (Boolean)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}
	}

	@JSON
	@Override
	public long getEmployeeDepartmentId() {
		return _employeeDepartmentId;
	}

	@Override
	public void setEmployeeDepartmentId(long employeeDepartmentId) {
		_columnBitmask |= EMPLOYEEDEPARTMENTID_COLUMN_BITMASK;

		if (!_setOriginalEmployeeDepartmentId) {
			_setOriginalEmployeeDepartmentId = true;

			_originalEmployeeDepartmentId = _employeeDepartmentId;
		}

		_employeeDepartmentId = employeeDepartmentId;
	}

	public long getOriginalEmployeeDepartmentId() {
		return _originalEmployeeDepartmentId;
	}

	@JSON
	@Override
	public String getDepartmentName() {
		if (_departmentName == null) {
			return StringPool.BLANK;
		}
		else {
			return _departmentName;
		}
	}

	@Override
	public void setDepartmentName(String departmentName) {
		_departmentName = departmentName;
	}

	@JSON
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
		_columnBitmask |= STATUS_COLUMN_BITMASK;

		if (!_setOriginalStatus) {
			_setOriginalStatus = true;

			_originalStatus = _status;
		}

		_status = status;
	}

	public boolean getOriginalStatus() {
		return _originalStatus;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			EmployeeDepartment.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public EmployeeDepartment toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (EmployeeDepartment)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		EmployeeDepartmentImpl employeeDepartmentImpl = new EmployeeDepartmentImpl();

		employeeDepartmentImpl.setEmployeeDepartmentId(getEmployeeDepartmentId());
		employeeDepartmentImpl.setDepartmentName(getDepartmentName());
		employeeDepartmentImpl.setStatus(getStatus());

		employeeDepartmentImpl.resetOriginalValues();

		return employeeDepartmentImpl;
	}

	@Override
	public int compareTo(EmployeeDepartment employeeDepartment) {
		long primaryKey = employeeDepartment.getPrimaryKey();

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

		if (!(obj instanceof EmployeeDepartment)) {
			return false;
		}

		EmployeeDepartment employeeDepartment = (EmployeeDepartment)obj;

		long primaryKey = employeeDepartment.getPrimaryKey();

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
		EmployeeDepartmentModelImpl employeeDepartmentModelImpl = this;

		employeeDepartmentModelImpl._originalEmployeeDepartmentId = employeeDepartmentModelImpl._employeeDepartmentId;

		employeeDepartmentModelImpl._setOriginalEmployeeDepartmentId = false;

		employeeDepartmentModelImpl._originalStatus = employeeDepartmentModelImpl._status;

		employeeDepartmentModelImpl._setOriginalStatus = false;

		employeeDepartmentModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<EmployeeDepartment> toCacheModel() {
		EmployeeDepartmentCacheModel employeeDepartmentCacheModel = new EmployeeDepartmentCacheModel();

		employeeDepartmentCacheModel.employeeDepartmentId = getEmployeeDepartmentId();

		employeeDepartmentCacheModel.departmentName = getDepartmentName();

		String departmentName = employeeDepartmentCacheModel.departmentName;

		if ((departmentName != null) && (departmentName.length() == 0)) {
			employeeDepartmentCacheModel.departmentName = null;
		}

		employeeDepartmentCacheModel.status = getStatus();

		return employeeDepartmentCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{employeeDepartmentId=");
		sb.append(getEmployeeDepartmentId());
		sb.append(", departmentName=");
		sb.append(getDepartmentName());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("com.hrms.model.EmployeeDepartment");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>employeeDepartmentId</column-name><column-value><![CDATA[");
		sb.append(getEmployeeDepartmentId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>departmentName</column-name><column-value><![CDATA[");
		sb.append(getDepartmentName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = EmployeeDepartment.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			EmployeeDepartment.class
		};
	private long _employeeDepartmentId;
	private long _originalEmployeeDepartmentId;
	private boolean _setOriginalEmployeeDepartmentId;
	private String _departmentName;
	private boolean _status;
	private boolean _originalStatus;
	private boolean _setOriginalStatus;
	private long _columnBitmask;
	private EmployeeDepartment _escapedModel;
}