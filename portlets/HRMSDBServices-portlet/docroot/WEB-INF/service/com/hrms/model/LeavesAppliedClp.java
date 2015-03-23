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
import com.hrms.service.LeavesAppliedLocalServiceUtil;

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
public class LeavesAppliedClp extends BaseModelImpl<LeavesApplied>
	implements LeavesApplied {
	public LeavesAppliedClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return LeavesApplied.class;
	}

	@Override
	public String getModelClassName() {
		return LeavesApplied.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _appliedLeaveId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setAppliedLeaveId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _appliedLeaveId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("appliedLeaveId", getAppliedLeaveId());
		attributes.put("userId", getUserId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("entitlement", getEntitlement());
		attributes.put("leaveFrom", getLeaveFrom());
		attributes.put("leaveTo", getLeaveTo());
		attributes.put("approvalStatus", getApprovalStatus());
		attributes.put("leaveId", getLeaveId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("createBy", getCreateBy());
		attributes.put("modifiedBy", getModifiedBy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long appliedLeaveId = (Long)attributes.get("appliedLeaveId");

		if (appliedLeaveId != null) {
			setAppliedLeaveId(appliedLeaveId);
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

		String entitlement = (String)attributes.get("entitlement");

		if (entitlement != null) {
			setEntitlement(entitlement);
		}

		Date leaveFrom = (Date)attributes.get("leaveFrom");

		if (leaveFrom != null) {
			setLeaveFrom(leaveFrom);
		}

		Date leaveTo = (Date)attributes.get("leaveTo");

		if (leaveTo != null) {
			setLeaveTo(leaveTo);
		}

		String approvalStatus = (String)attributes.get("approvalStatus");

		if (approvalStatus != null) {
			setApprovalStatus(approvalStatus);
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
	public long getAppliedLeaveId() {
		return _appliedLeaveId;
	}

	@Override
	public void setAppliedLeaveId(long appliedLeaveId) {
		_appliedLeaveId = appliedLeaveId;

		if (_leavesAppliedRemoteModel != null) {
			try {
				Class<?> clazz = _leavesAppliedRemoteModel.getClass();

				Method method = clazz.getMethod("setAppliedLeaveId", long.class);

				method.invoke(_leavesAppliedRemoteModel, appliedLeaveId);
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

		if (_leavesAppliedRemoteModel != null) {
			try {
				Class<?> clazz = _leavesAppliedRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_leavesAppliedRemoteModel, userId);
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

		if (_leavesAppliedRemoteModel != null) {
			try {
				Class<?> clazz = _leavesAppliedRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_leavesAppliedRemoteModel, groupId);
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

		if (_leavesAppliedRemoteModel != null) {
			try {
				Class<?> clazz = _leavesAppliedRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_leavesAppliedRemoteModel, companyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEntitlement() {
		return _entitlement;
	}

	@Override
	public void setEntitlement(String entitlement) {
		_entitlement = entitlement;

		if (_leavesAppliedRemoteModel != null) {
			try {
				Class<?> clazz = _leavesAppliedRemoteModel.getClass();

				Method method = clazz.getMethod("setEntitlement", String.class);

				method.invoke(_leavesAppliedRemoteModel, entitlement);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getLeaveFrom() {
		return _leaveFrom;
	}

	@Override
	public void setLeaveFrom(Date leaveFrom) {
		_leaveFrom = leaveFrom;

		if (_leavesAppliedRemoteModel != null) {
			try {
				Class<?> clazz = _leavesAppliedRemoteModel.getClass();

				Method method = clazz.getMethod("setLeaveFrom", Date.class);

				method.invoke(_leavesAppliedRemoteModel, leaveFrom);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getLeaveTo() {
		return _leaveTo;
	}

	@Override
	public void setLeaveTo(Date leaveTo) {
		_leaveTo = leaveTo;

		if (_leavesAppliedRemoteModel != null) {
			try {
				Class<?> clazz = _leavesAppliedRemoteModel.getClass();

				Method method = clazz.getMethod("setLeaveTo", Date.class);

				method.invoke(_leavesAppliedRemoteModel, leaveTo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getApprovalStatus() {
		return _approvalStatus;
	}

	@Override
	public void setApprovalStatus(String approvalStatus) {
		_approvalStatus = approvalStatus;

		if (_leavesAppliedRemoteModel != null) {
			try {
				Class<?> clazz = _leavesAppliedRemoteModel.getClass();

				Method method = clazz.getMethod("setApprovalStatus",
						String.class);

				method.invoke(_leavesAppliedRemoteModel, approvalStatus);
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

		if (_leavesAppliedRemoteModel != null) {
			try {
				Class<?> clazz = _leavesAppliedRemoteModel.getClass();

				Method method = clazz.getMethod("setLeaveId", long.class);

				method.invoke(_leavesAppliedRemoteModel, leaveId);
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

		if (_leavesAppliedRemoteModel != null) {
			try {
				Class<?> clazz = _leavesAppliedRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_leavesAppliedRemoteModel, createDate);
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

		if (_leavesAppliedRemoteModel != null) {
			try {
				Class<?> clazz = _leavesAppliedRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_leavesAppliedRemoteModel, modifiedDate);
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

		if (_leavesAppliedRemoteModel != null) {
			try {
				Class<?> clazz = _leavesAppliedRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateBy", long.class);

				method.invoke(_leavesAppliedRemoteModel, createBy);
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

		if (_leavesAppliedRemoteModel != null) {
			try {
				Class<?> clazz = _leavesAppliedRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedBy", long.class);

				method.invoke(_leavesAppliedRemoteModel, modifiedBy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getLeavesAppliedRemoteModel() {
		return _leavesAppliedRemoteModel;
	}

	public void setLeavesAppliedRemoteModel(
		BaseModel<?> leavesAppliedRemoteModel) {
		_leavesAppliedRemoteModel = leavesAppliedRemoteModel;
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

		Class<?> remoteModelClass = _leavesAppliedRemoteModel.getClass();

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

		Object returnValue = method.invoke(_leavesAppliedRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			LeavesAppliedLocalServiceUtil.addLeavesApplied(this);
		}
		else {
			LeavesAppliedLocalServiceUtil.updateLeavesApplied(this);
		}
	}

	@Override
	public LeavesApplied toEscapedModel() {
		return (LeavesApplied)ProxyUtil.newProxyInstance(LeavesApplied.class.getClassLoader(),
			new Class[] { LeavesApplied.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		LeavesAppliedClp clone = new LeavesAppliedClp();

		clone.setAppliedLeaveId(getAppliedLeaveId());
		clone.setUserId(getUserId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setEntitlement(getEntitlement());
		clone.setLeaveFrom(getLeaveFrom());
		clone.setLeaveTo(getLeaveTo());
		clone.setApprovalStatus(getApprovalStatus());
		clone.setLeaveId(getLeaveId());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setCreateBy(getCreateBy());
		clone.setModifiedBy(getModifiedBy());

		return clone;
	}

	@Override
	public int compareTo(LeavesApplied leavesApplied) {
		long primaryKey = leavesApplied.getPrimaryKey();

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

		if (!(obj instanceof LeavesAppliedClp)) {
			return false;
		}

		LeavesAppliedClp leavesApplied = (LeavesAppliedClp)obj;

		long primaryKey = leavesApplied.getPrimaryKey();

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

		sb.append("{appliedLeaveId=");
		sb.append(getAppliedLeaveId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", entitlement=");
		sb.append(getEntitlement());
		sb.append(", leaveFrom=");
		sb.append(getLeaveFrom());
		sb.append(", leaveTo=");
		sb.append(getLeaveTo());
		sb.append(", approvalStatus=");
		sb.append(getApprovalStatus());
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
		sb.append("com.hrms.model.LeavesApplied");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>appliedLeaveId</column-name><column-value><![CDATA[");
		sb.append(getAppliedLeaveId());
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
			"<column><column-name>entitlement</column-name><column-value><![CDATA[");
		sb.append(getEntitlement());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>leaveFrom</column-name><column-value><![CDATA[");
		sb.append(getLeaveFrom());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>leaveTo</column-name><column-value><![CDATA[");
		sb.append(getLeaveTo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>approvalStatus</column-name><column-value><![CDATA[");
		sb.append(getApprovalStatus());
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

	private long _appliedLeaveId;
	private long _userId;
	private String _userUuid;
	private long _groupId;
	private long _companyId;
	private String _entitlement;
	private Date _leaveFrom;
	private Date _leaveTo;
	private String _approvalStatus;
	private long _leaveId;
	private Date _createDate;
	private Date _modifiedDate;
	private long _createBy;
	private long _modifiedBy;
	private BaseModel<?> _leavesAppliedRemoteModel;
}