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
import com.hrms.service.LeaveLocalServiceUtil;

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
 * @author yashpalsinh
 */
public class LeaveClp extends BaseModelImpl<Leave> implements Leave {
	public LeaveClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return Leave.class;
	}

	@Override
	public String getModelClassName() {
		return Leave.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _leaveId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setLeaveId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _leaveId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("leaveId", getLeaveId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("leaveName", getLeaveName());
		attributes.put("leaveType", getLeaveType());
		attributes.put("leavesAllowedPerYear", getLeavesAllowedPerYear());
		attributes.put("carryOver", getCarryOver());
		attributes.put("encachement", getEncachement());
		attributes.put("Status", getStatus());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("createBy", getCreateBy());
		attributes.put("modifiedBy", getModifiedBy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long leaveId = (Long)attributes.get("leaveId");

		if (leaveId != null) {
			setLeaveId(leaveId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		String leaveName = (String)attributes.get("leaveName");

		if (leaveName != null) {
			setLeaveName(leaveName);
		}

		String leaveType = (String)attributes.get("leaveType");

		if (leaveType != null) {
			setLeaveType(leaveType);
		}

		Integer leavesAllowedPerYear = (Integer)attributes.get(
				"leavesAllowedPerYear");

		if (leavesAllowedPerYear != null) {
			setLeavesAllowedPerYear(leavesAllowedPerYear);
		}

		Boolean carryOver = (Boolean)attributes.get("carryOver");

		if (carryOver != null) {
			setCarryOver(carryOver);
		}

		Boolean encachement = (Boolean)attributes.get("encachement");

		if (encachement != null) {
			setEncachement(encachement);
		}

		Boolean Status = (Boolean)attributes.get("Status");

		if (Status != null) {
			setStatus(Status);
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
	public long getLeaveId() {
		return _leaveId;
	}

	@Override
	public void setLeaveId(long leaveId) {
		_leaveId = leaveId;

		if (_leaveRemoteModel != null) {
			try {
				Class<?> clazz = _leaveRemoteModel.getClass();

				Method method = clazz.getMethod("setLeaveId", long.class);

				method.invoke(_leaveRemoteModel, leaveId);
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

		if (_leaveRemoteModel != null) {
			try {
				Class<?> clazz = _leaveRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_leaveRemoteModel, groupId);
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

		if (_leaveRemoteModel != null) {
			try {
				Class<?> clazz = _leaveRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_leaveRemoteModel, companyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLeaveName() {
		return _leaveName;
	}

	@Override
	public void setLeaveName(String leaveName) {
		_leaveName = leaveName;

		if (_leaveRemoteModel != null) {
			try {
				Class<?> clazz = _leaveRemoteModel.getClass();

				Method method = clazz.getMethod("setLeaveName", String.class);

				method.invoke(_leaveRemoteModel, leaveName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLeaveType() {
		return _leaveType;
	}

	@Override
	public void setLeaveType(String leaveType) {
		_leaveType = leaveType;

		if (_leaveRemoteModel != null) {
			try {
				Class<?> clazz = _leaveRemoteModel.getClass();

				Method method = clazz.getMethod("setLeaveType", String.class);

				method.invoke(_leaveRemoteModel, leaveType);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getLeavesAllowedPerYear() {
		return _leavesAllowedPerYear;
	}

	@Override
	public void setLeavesAllowedPerYear(int leavesAllowedPerYear) {
		_leavesAllowedPerYear = leavesAllowedPerYear;

		if (_leaveRemoteModel != null) {
			try {
				Class<?> clazz = _leaveRemoteModel.getClass();

				Method method = clazz.getMethod("setLeavesAllowedPerYear",
						int.class);

				method.invoke(_leaveRemoteModel, leavesAllowedPerYear);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getCarryOver() {
		return _carryOver;
	}

	@Override
	public boolean isCarryOver() {
		return _carryOver;
	}

	@Override
	public void setCarryOver(boolean carryOver) {
		_carryOver = carryOver;

		if (_leaveRemoteModel != null) {
			try {
				Class<?> clazz = _leaveRemoteModel.getClass();

				Method method = clazz.getMethod("setCarryOver", boolean.class);

				method.invoke(_leaveRemoteModel, carryOver);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getEncachement() {
		return _encachement;
	}

	@Override
	public boolean isEncachement() {
		return _encachement;
	}

	@Override
	public void setEncachement(boolean encachement) {
		_encachement = encachement;

		if (_leaveRemoteModel != null) {
			try {
				Class<?> clazz = _leaveRemoteModel.getClass();

				Method method = clazz.getMethod("setEncachement", boolean.class);

				method.invoke(_leaveRemoteModel, encachement);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getStatus() {
		return _Status;
	}

	@Override
	public boolean isStatus() {
		return _Status;
	}

	@Override
	public void setStatus(boolean Status) {
		_Status = Status;

		if (_leaveRemoteModel != null) {
			try {
				Class<?> clazz = _leaveRemoteModel.getClass();

				Method method = clazz.getMethod("setStatus", boolean.class);

				method.invoke(_leaveRemoteModel, Status);
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

		if (_leaveRemoteModel != null) {
			try {
				Class<?> clazz = _leaveRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_leaveRemoteModel, createDate);
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

		if (_leaveRemoteModel != null) {
			try {
				Class<?> clazz = _leaveRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_leaveRemoteModel, modifiedDate);
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

		if (_leaveRemoteModel != null) {
			try {
				Class<?> clazz = _leaveRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateBy", long.class);

				method.invoke(_leaveRemoteModel, createBy);
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

		if (_leaveRemoteModel != null) {
			try {
				Class<?> clazz = _leaveRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedBy", long.class);

				method.invoke(_leaveRemoteModel, modifiedBy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getLeaveRemoteModel() {
		return _leaveRemoteModel;
	}

	public void setLeaveRemoteModel(BaseModel<?> leaveRemoteModel) {
		_leaveRemoteModel = leaveRemoteModel;
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

		Class<?> remoteModelClass = _leaveRemoteModel.getClass();

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

		Object returnValue = method.invoke(_leaveRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			LeaveLocalServiceUtil.addLeave(this);
		}
		else {
			LeaveLocalServiceUtil.updateLeave(this);
		}
	}

	@Override
	public Leave toEscapedModel() {
		return (Leave)ProxyUtil.newProxyInstance(Leave.class.getClassLoader(),
			new Class[] { Leave.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		LeaveClp clone = new LeaveClp();

		clone.setLeaveId(getLeaveId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setLeaveName(getLeaveName());
		clone.setLeaveType(getLeaveType());
		clone.setLeavesAllowedPerYear(getLeavesAllowedPerYear());
		clone.setCarryOver(getCarryOver());
		clone.setEncachement(getEncachement());
		clone.setStatus(getStatus());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setCreateBy(getCreateBy());
		clone.setModifiedBy(getModifiedBy());

		return clone;
	}

	@Override
	public int compareTo(Leave leave) {
		long primaryKey = leave.getPrimaryKey();

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

		if (!(obj instanceof LeaveClp)) {
			return false;
		}

		LeaveClp leave = (LeaveClp)obj;

		long primaryKey = leave.getPrimaryKey();

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

		sb.append("{leaveId=");
		sb.append(getLeaveId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", leaveName=");
		sb.append(getLeaveName());
		sb.append(", leaveType=");
		sb.append(getLeaveType());
		sb.append(", leavesAllowedPerYear=");
		sb.append(getLeavesAllowedPerYear());
		sb.append(", carryOver=");
		sb.append(getCarryOver());
		sb.append(", encachement=");
		sb.append(getEncachement());
		sb.append(", Status=");
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
		StringBundler sb = new StringBundler(43);

		sb.append("<model><model-name>");
		sb.append("com.hrms.model.Leave");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>leaveId</column-name><column-value><![CDATA[");
		sb.append(getLeaveId());
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
			"<column><column-name>leaveName</column-name><column-value><![CDATA[");
		sb.append(getLeaveName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>leaveType</column-name><column-value><![CDATA[");
		sb.append(getLeaveType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>leavesAllowedPerYear</column-name><column-value><![CDATA[");
		sb.append(getLeavesAllowedPerYear());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>carryOver</column-name><column-value><![CDATA[");
		sb.append(getCarryOver());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>encachement</column-name><column-value><![CDATA[");
		sb.append(getEncachement());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Status</column-name><column-value><![CDATA[");
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

	private long _leaveId;
	private long _groupId;
	private long _companyId;
	private String _leaveName;
	private String _leaveType;
	private int _leavesAllowedPerYear;
	private boolean _carryOver;
	private boolean _encachement;
	private boolean _Status;
	private Date _createDate;
	private Date _modifiedDate;
	private long _createBy;
	private long _modifiedBy;
	private BaseModel<?> _leaveRemoteModel;
}