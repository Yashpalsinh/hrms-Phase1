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
import com.hrms.service.EmployeeMstLocalServiceUtil;

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
public class EmployeeMstClp extends BaseModelImpl<EmployeeMst>
	implements EmployeeMst {
	public EmployeeMstClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return EmployeeMst.class;
	}

	@Override
	public String getModelClassName() {
		return EmployeeMst.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _employeeMstId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setEmployeeMstId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _employeeMstId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("employeeMstId", getEmployeeMstId());
		attributes.put("employeeId", getEmployeeId());
		attributes.put("userId", getUserId());
		attributes.put("gender", getGender());
		attributes.put("dateOfBirth", getDateOfBirth());
		attributes.put("joiningDate", getJoiningDate());
		attributes.put("leavingDate", getLeavingDate());
		attributes.put("maritualStatus", getMaritualStatus());
		attributes.put("nationality", getNationality());
		attributes.put("employeeDesignationId", getEmployeeDesignationId());
		attributes.put("employeeDepartmentId", getEmployeeDepartmentId());
		attributes.put("employeeSubDepartmentId", getEmployeeSubDepartmentId());
		attributes.put("employeeTypeId", getEmployeeTypeId());
		attributes.put("employeeProofId", getEmployeeProofId());
		attributes.put("createBy", getCreateBy());
		attributes.put("modifiedBy", getModifiedBy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long employeeMstId = (Long)attributes.get("employeeMstId");

		if (employeeMstId != null) {
			setEmployeeMstId(employeeMstId);
		}

		String employeeId = (String)attributes.get("employeeId");

		if (employeeId != null) {
			setEmployeeId(employeeId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Long gender = (Long)attributes.get("gender");

		if (gender != null) {
			setGender(gender);
		}

		Date dateOfBirth = (Date)attributes.get("dateOfBirth");

		if (dateOfBirth != null) {
			setDateOfBirth(dateOfBirth);
		}

		Date joiningDate = (Date)attributes.get("joiningDate");

		if (joiningDate != null) {
			setJoiningDate(joiningDate);
		}

		Date leavingDate = (Date)attributes.get("leavingDate");

		if (leavingDate != null) {
			setLeavingDate(leavingDate);
		}

		Integer maritualStatus = (Integer)attributes.get("maritualStatus");

		if (maritualStatus != null) {
			setMaritualStatus(maritualStatus);
		}

		String nationality = (String)attributes.get("nationality");

		if (nationality != null) {
			setNationality(nationality);
		}

		Integer employeeDesignationId = (Integer)attributes.get(
				"employeeDesignationId");

		if (employeeDesignationId != null) {
			setEmployeeDesignationId(employeeDesignationId);
		}

		Integer employeeDepartmentId = (Integer)attributes.get(
				"employeeDepartmentId");

		if (employeeDepartmentId != null) {
			setEmployeeDepartmentId(employeeDepartmentId);
		}

		Integer employeeSubDepartmentId = (Integer)attributes.get(
				"employeeSubDepartmentId");

		if (employeeSubDepartmentId != null) {
			setEmployeeSubDepartmentId(employeeSubDepartmentId);
		}

		Integer employeeTypeId = (Integer)attributes.get("employeeTypeId");

		if (employeeTypeId != null) {
			setEmployeeTypeId(employeeTypeId);
		}

		Integer employeeProofId = (Integer)attributes.get("employeeProofId");

		if (employeeProofId != null) {
			setEmployeeProofId(employeeProofId);
		}

		Integer createBy = (Integer)attributes.get("createBy");

		if (createBy != null) {
			setCreateBy(createBy);
		}

		Integer modifiedBy = (Integer)attributes.get("modifiedBy");

		if (modifiedBy != null) {
			setModifiedBy(modifiedBy);
		}
	}

	@Override
	public long getEmployeeMstId() {
		return _employeeMstId;
	}

	@Override
	public void setEmployeeMstId(long employeeMstId) {
		_employeeMstId = employeeMstId;

		if (_employeeMstRemoteModel != null) {
			try {
				Class<?> clazz = _employeeMstRemoteModel.getClass();

				Method method = clazz.getMethod("setEmployeeMstId", long.class);

				method.invoke(_employeeMstRemoteModel, employeeMstId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEmployeeId() {
		return _employeeId;
	}

	@Override
	public void setEmployeeId(String employeeId) {
		_employeeId = employeeId;

		if (_employeeMstRemoteModel != null) {
			try {
				Class<?> clazz = _employeeMstRemoteModel.getClass();

				Method method = clazz.getMethod("setEmployeeId", String.class);

				method.invoke(_employeeMstRemoteModel, employeeId);
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

		if (_employeeMstRemoteModel != null) {
			try {
				Class<?> clazz = _employeeMstRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_employeeMstRemoteModel, userId);
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
	public long getGender() {
		return _gender;
	}

	@Override
	public void setGender(long gender) {
		_gender = gender;

		if (_employeeMstRemoteModel != null) {
			try {
				Class<?> clazz = _employeeMstRemoteModel.getClass();

				Method method = clazz.getMethod("setGender", long.class);

				method.invoke(_employeeMstRemoteModel, gender);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getDateOfBirth() {
		return _dateOfBirth;
	}

	@Override
	public void setDateOfBirth(Date dateOfBirth) {
		_dateOfBirth = dateOfBirth;

		if (_employeeMstRemoteModel != null) {
			try {
				Class<?> clazz = _employeeMstRemoteModel.getClass();

				Method method = clazz.getMethod("setDateOfBirth", Date.class);

				method.invoke(_employeeMstRemoteModel, dateOfBirth);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getJoiningDate() {
		return _joiningDate;
	}

	@Override
	public void setJoiningDate(Date joiningDate) {
		_joiningDate = joiningDate;

		if (_employeeMstRemoteModel != null) {
			try {
				Class<?> clazz = _employeeMstRemoteModel.getClass();

				Method method = clazz.getMethod("setJoiningDate", Date.class);

				method.invoke(_employeeMstRemoteModel, joiningDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getLeavingDate() {
		return _leavingDate;
	}

	@Override
	public void setLeavingDate(Date leavingDate) {
		_leavingDate = leavingDate;

		if (_employeeMstRemoteModel != null) {
			try {
				Class<?> clazz = _employeeMstRemoteModel.getClass();

				Method method = clazz.getMethod("setLeavingDate", Date.class);

				method.invoke(_employeeMstRemoteModel, leavingDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getMaritualStatus() {
		return _maritualStatus;
	}

	@Override
	public void setMaritualStatus(int maritualStatus) {
		_maritualStatus = maritualStatus;

		if (_employeeMstRemoteModel != null) {
			try {
				Class<?> clazz = _employeeMstRemoteModel.getClass();

				Method method = clazz.getMethod("setMaritualStatus", int.class);

				method.invoke(_employeeMstRemoteModel, maritualStatus);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNationality() {
		return _nationality;
	}

	@Override
	public void setNationality(String nationality) {
		_nationality = nationality;

		if (_employeeMstRemoteModel != null) {
			try {
				Class<?> clazz = _employeeMstRemoteModel.getClass();

				Method method = clazz.getMethod("setNationality", String.class);

				method.invoke(_employeeMstRemoteModel, nationality);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getEmployeeDesignationId() {
		return _employeeDesignationId;
	}

	@Override
	public void setEmployeeDesignationId(int employeeDesignationId) {
		_employeeDesignationId = employeeDesignationId;

		if (_employeeMstRemoteModel != null) {
			try {
				Class<?> clazz = _employeeMstRemoteModel.getClass();

				Method method = clazz.getMethod("setEmployeeDesignationId",
						int.class);

				method.invoke(_employeeMstRemoteModel, employeeDesignationId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getEmployeeDepartmentId() {
		return _employeeDepartmentId;
	}

	@Override
	public void setEmployeeDepartmentId(int employeeDepartmentId) {
		_employeeDepartmentId = employeeDepartmentId;

		if (_employeeMstRemoteModel != null) {
			try {
				Class<?> clazz = _employeeMstRemoteModel.getClass();

				Method method = clazz.getMethod("setEmployeeDepartmentId",
						int.class);

				method.invoke(_employeeMstRemoteModel, employeeDepartmentId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getEmployeeSubDepartmentId() {
		return _employeeSubDepartmentId;
	}

	@Override
	public void setEmployeeSubDepartmentId(int employeeSubDepartmentId) {
		_employeeSubDepartmentId = employeeSubDepartmentId;

		if (_employeeMstRemoteModel != null) {
			try {
				Class<?> clazz = _employeeMstRemoteModel.getClass();

				Method method = clazz.getMethod("setEmployeeSubDepartmentId",
						int.class);

				method.invoke(_employeeMstRemoteModel, employeeSubDepartmentId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getEmployeeTypeId() {
		return _employeeTypeId;
	}

	@Override
	public void setEmployeeTypeId(int employeeTypeId) {
		_employeeTypeId = employeeTypeId;

		if (_employeeMstRemoteModel != null) {
			try {
				Class<?> clazz = _employeeMstRemoteModel.getClass();

				Method method = clazz.getMethod("setEmployeeTypeId", int.class);

				method.invoke(_employeeMstRemoteModel, employeeTypeId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getEmployeeProofId() {
		return _employeeProofId;
	}

	@Override
	public void setEmployeeProofId(int employeeProofId) {
		_employeeProofId = employeeProofId;

		if (_employeeMstRemoteModel != null) {
			try {
				Class<?> clazz = _employeeMstRemoteModel.getClass();

				Method method = clazz.getMethod("setEmployeeProofId", int.class);

				method.invoke(_employeeMstRemoteModel, employeeProofId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getCreateBy() {
		return _createBy;
	}

	@Override
	public void setCreateBy(int createBy) {
		_createBy = createBy;

		if (_employeeMstRemoteModel != null) {
			try {
				Class<?> clazz = _employeeMstRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateBy", int.class);

				method.invoke(_employeeMstRemoteModel, createBy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getModifiedBy() {
		return _modifiedBy;
	}

	@Override
	public void setModifiedBy(int modifiedBy) {
		_modifiedBy = modifiedBy;

		if (_employeeMstRemoteModel != null) {
			try {
				Class<?> clazz = _employeeMstRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedBy", int.class);

				method.invoke(_employeeMstRemoteModel, modifiedBy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getEmployeeMstRemoteModel() {
		return _employeeMstRemoteModel;
	}

	public void setEmployeeMstRemoteModel(BaseModel<?> employeeMstRemoteModel) {
		_employeeMstRemoteModel = employeeMstRemoteModel;
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

		Class<?> remoteModelClass = _employeeMstRemoteModel.getClass();

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

		Object returnValue = method.invoke(_employeeMstRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			EmployeeMstLocalServiceUtil.addEmployeeMst(this);
		}
		else {
			EmployeeMstLocalServiceUtil.updateEmployeeMst(this);
		}
	}

	@Override
	public EmployeeMst toEscapedModel() {
		return (EmployeeMst)ProxyUtil.newProxyInstance(EmployeeMst.class.getClassLoader(),
			new Class[] { EmployeeMst.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		EmployeeMstClp clone = new EmployeeMstClp();

		clone.setEmployeeMstId(getEmployeeMstId());
		clone.setEmployeeId(getEmployeeId());
		clone.setUserId(getUserId());
		clone.setGender(getGender());
		clone.setDateOfBirth(getDateOfBirth());
		clone.setJoiningDate(getJoiningDate());
		clone.setLeavingDate(getLeavingDate());
		clone.setMaritualStatus(getMaritualStatus());
		clone.setNationality(getNationality());
		clone.setEmployeeDesignationId(getEmployeeDesignationId());
		clone.setEmployeeDepartmentId(getEmployeeDepartmentId());
		clone.setEmployeeSubDepartmentId(getEmployeeSubDepartmentId());
		clone.setEmployeeTypeId(getEmployeeTypeId());
		clone.setEmployeeProofId(getEmployeeProofId());
		clone.setCreateBy(getCreateBy());
		clone.setModifiedBy(getModifiedBy());

		return clone;
	}

	@Override
	public int compareTo(EmployeeMst employeeMst) {
		long primaryKey = employeeMst.getPrimaryKey();

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

		if (!(obj instanceof EmployeeMstClp)) {
			return false;
		}

		EmployeeMstClp employeeMst = (EmployeeMstClp)obj;

		long primaryKey = employeeMst.getPrimaryKey();

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
		StringBundler sb = new StringBundler(33);

		sb.append("{employeeMstId=");
		sb.append(getEmployeeMstId());
		sb.append(", employeeId=");
		sb.append(getEmployeeId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", gender=");
		sb.append(getGender());
		sb.append(", dateOfBirth=");
		sb.append(getDateOfBirth());
		sb.append(", joiningDate=");
		sb.append(getJoiningDate());
		sb.append(", leavingDate=");
		sb.append(getLeavingDate());
		sb.append(", maritualStatus=");
		sb.append(getMaritualStatus());
		sb.append(", nationality=");
		sb.append(getNationality());
		sb.append(", employeeDesignationId=");
		sb.append(getEmployeeDesignationId());
		sb.append(", employeeDepartmentId=");
		sb.append(getEmployeeDepartmentId());
		sb.append(", employeeSubDepartmentId=");
		sb.append(getEmployeeSubDepartmentId());
		sb.append(", employeeTypeId=");
		sb.append(getEmployeeTypeId());
		sb.append(", employeeProofId=");
		sb.append(getEmployeeProofId());
		sb.append(", createBy=");
		sb.append(getCreateBy());
		sb.append(", modifiedBy=");
		sb.append(getModifiedBy());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(52);

		sb.append("<model><model-name>");
		sb.append("com.hrms.model.EmployeeMst");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>employeeMstId</column-name><column-value><![CDATA[");
		sb.append(getEmployeeMstId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>employeeId</column-name><column-value><![CDATA[");
		sb.append(getEmployeeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>gender</column-name><column-value><![CDATA[");
		sb.append(getGender());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dateOfBirth</column-name><column-value><![CDATA[");
		sb.append(getDateOfBirth());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>joiningDate</column-name><column-value><![CDATA[");
		sb.append(getJoiningDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>leavingDate</column-name><column-value><![CDATA[");
		sb.append(getLeavingDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maritualStatus</column-name><column-value><![CDATA[");
		sb.append(getMaritualStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nationality</column-name><column-value><![CDATA[");
		sb.append(getNationality());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>employeeDesignationId</column-name><column-value><![CDATA[");
		sb.append(getEmployeeDesignationId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>employeeDepartmentId</column-name><column-value><![CDATA[");
		sb.append(getEmployeeDepartmentId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>employeeSubDepartmentId</column-name><column-value><![CDATA[");
		sb.append(getEmployeeSubDepartmentId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>employeeTypeId</column-name><column-value><![CDATA[");
		sb.append(getEmployeeTypeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>employeeProofId</column-name><column-value><![CDATA[");
		sb.append(getEmployeeProofId());
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

	private long _employeeMstId;
	private String _employeeId;
	private long _userId;
	private String _userUuid;
	private long _gender;
	private Date _dateOfBirth;
	private Date _joiningDate;
	private Date _leavingDate;
	private int _maritualStatus;
	private String _nationality;
	private int _employeeDesignationId;
	private int _employeeDepartmentId;
	private int _employeeSubDepartmentId;
	private int _employeeTypeId;
	private int _employeeProofId;
	private int _createBy;
	private int _modifiedBy;
	private BaseModel<?> _employeeMstRemoteModel;
}