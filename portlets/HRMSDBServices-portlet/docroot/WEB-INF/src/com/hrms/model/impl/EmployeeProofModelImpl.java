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

import com.hrms.model.EmployeeProof;
import com.hrms.model.EmployeeProofModel;
import com.hrms.model.EmployeeProofSoap;

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
 * The base model implementation for the EmployeeProof service. Represents a row in the &quot;HRMS_EmployeeProof&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.hrms.model.EmployeeProofModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link EmployeeProofImpl}.
 * </p>
 *
 * @author yashpalsinh
 * @see EmployeeProofImpl
 * @see com.hrms.model.EmployeeProof
 * @see com.hrms.model.EmployeeProofModel
 * @generated
 */
@JSON(strict = true)
public class EmployeeProofModelImpl extends BaseModelImpl<EmployeeProof>
	implements EmployeeProofModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a employee proof model instance should use the {@link com.hrms.model.EmployeeProof} interface instead.
	 */
	public static final String TABLE_NAME = "HRMS_EmployeeProof";
	public static final Object[][] TABLE_COLUMNS = {
			{ "employeeproofNo", Types.BIGINT },
			{ "proofId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "expirationDate", Types.TIMESTAMP }
		};
	public static final String TABLE_SQL_CREATE = "create table HRMS_EmployeeProof (employeeproofNo LONG not null primary key,proofId LONG,userId LONG,expirationDate DATE null)";
	public static final String TABLE_SQL_DROP = "drop table HRMS_EmployeeProof";
	public static final String ORDER_BY_JPQL = " ORDER BY employeeProof.employeeproofNo ASC";
	public static final String ORDER_BY_SQL = " ORDER BY HRMS_EmployeeProof.employeeproofNo ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.hrms.model.EmployeeProof"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.hrms.model.EmployeeProof"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static EmployeeProof toModel(EmployeeProofSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		EmployeeProof model = new EmployeeProofImpl();

		model.setEmployeeproofNo(soapModel.getEmployeeproofNo());
		model.setProofId(soapModel.getProofId());
		model.setUserId(soapModel.getUserId());
		model.setExpirationDate(soapModel.getExpirationDate());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<EmployeeProof> toModels(EmployeeProofSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<EmployeeProof> models = new ArrayList<EmployeeProof>(soapModels.length);

		for (EmployeeProofSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.hrms.model.EmployeeProof"));

	public EmployeeProofModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _employeeproofNo;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setEmployeeproofNo(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _employeeproofNo;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return EmployeeProof.class;
	}

	@Override
	public String getModelClassName() {
		return EmployeeProof.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("employeeproofNo", getEmployeeproofNo());
		attributes.put("proofId", getProofId());
		attributes.put("userId", getUserId());
		attributes.put("expirationDate", getExpirationDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long employeeproofNo = (Long)attributes.get("employeeproofNo");

		if (employeeproofNo != null) {
			setEmployeeproofNo(employeeproofNo);
		}

		Long proofId = (Long)attributes.get("proofId");

		if (proofId != null) {
			setProofId(proofId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Date expirationDate = (Date)attributes.get("expirationDate");

		if (expirationDate != null) {
			setExpirationDate(expirationDate);
		}
	}

	@JSON
	@Override
	public long getEmployeeproofNo() {
		return _employeeproofNo;
	}

	@Override
	public void setEmployeeproofNo(long employeeproofNo) {
		_employeeproofNo = employeeproofNo;
	}

	@JSON
	@Override
	public long getProofId() {
		return _proofId;
	}

	@Override
	public void setProofId(long proofId) {
		_proofId = proofId;
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
	public Date getExpirationDate() {
		return _expirationDate;
	}

	@Override
	public void setExpirationDate(Date expirationDate) {
		_expirationDate = expirationDate;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			EmployeeProof.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public EmployeeProof toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (EmployeeProof)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		EmployeeProofImpl employeeProofImpl = new EmployeeProofImpl();

		employeeProofImpl.setEmployeeproofNo(getEmployeeproofNo());
		employeeProofImpl.setProofId(getProofId());
		employeeProofImpl.setUserId(getUserId());
		employeeProofImpl.setExpirationDate(getExpirationDate());

		employeeProofImpl.resetOriginalValues();

		return employeeProofImpl;
	}

	@Override
	public int compareTo(EmployeeProof employeeProof) {
		long primaryKey = employeeProof.getPrimaryKey();

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

		if (!(obj instanceof EmployeeProof)) {
			return false;
		}

		EmployeeProof employeeProof = (EmployeeProof)obj;

		long primaryKey = employeeProof.getPrimaryKey();

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
	}

	@Override
	public CacheModel<EmployeeProof> toCacheModel() {
		EmployeeProofCacheModel employeeProofCacheModel = new EmployeeProofCacheModel();

		employeeProofCacheModel.employeeproofNo = getEmployeeproofNo();

		employeeProofCacheModel.proofId = getProofId();

		employeeProofCacheModel.userId = getUserId();

		Date expirationDate = getExpirationDate();

		if (expirationDate != null) {
			employeeProofCacheModel.expirationDate = expirationDate.getTime();
		}
		else {
			employeeProofCacheModel.expirationDate = Long.MIN_VALUE;
		}

		return employeeProofCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{employeeproofNo=");
		sb.append(getEmployeeproofNo());
		sb.append(", proofId=");
		sb.append(getProofId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", expirationDate=");
		sb.append(getExpirationDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("com.hrms.model.EmployeeProof");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>employeeproofNo</column-name><column-value><![CDATA[");
		sb.append(getEmployeeproofNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>proofId</column-name><column-value><![CDATA[");
		sb.append(getProofId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>expirationDate</column-name><column-value><![CDATA[");
		sb.append(getExpirationDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = EmployeeProof.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			EmployeeProof.class
		};
	private long _employeeproofNo;
	private long _proofId;
	private long _userId;
	private String _userUuid;
	private Date _expirationDate;
	private EmployeeProof _escapedModel;
}