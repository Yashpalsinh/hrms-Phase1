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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link EmployeeComplaint}.
 * </p>
 *
 * @author yashpalsinh
 * @see EmployeeComplaint
 * @generated
 */
public class EmployeeComplaintWrapper implements EmployeeComplaint,
	ModelWrapper<EmployeeComplaint> {
	public EmployeeComplaintWrapper(EmployeeComplaint employeeComplaint) {
		_employeeComplaint = employeeComplaint;
	}

	@Override
	public Class<?> getModelClass() {
		return EmployeeComplaint.class;
	}

	@Override
	public String getModelClassName() {
		return EmployeeComplaint.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("employeeComplaintId", getEmployeeComplaintId());
		attributes.put("userId", getUserId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("complaintTitle", getComplaintTitle());
		attributes.put("complaintDiscription", getComplaintDiscription());
		attributes.put("complaintFrom", getComplaintFrom());
		attributes.put("complaintDate", getComplaintDate());
		attributes.put("status", getStatus());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("createBy", getCreateBy());
		attributes.put("modifiedBy", getModifiedBy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long employeeComplaintId = (Long)attributes.get("employeeComplaintId");

		if (employeeComplaintId != null) {
			setEmployeeComplaintId(employeeComplaintId);
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

		String complaintTitle = (String)attributes.get("complaintTitle");

		if (complaintTitle != null) {
			setComplaintTitle(complaintTitle);
		}

		String complaintDiscription = (String)attributes.get(
				"complaintDiscription");

		if (complaintDiscription != null) {
			setComplaintDiscription(complaintDiscription);
		}

		Long complaintFrom = (Long)attributes.get("complaintFrom");

		if (complaintFrom != null) {
			setComplaintFrom(complaintFrom);
		}

		Date complaintDate = (Date)attributes.get("complaintDate");

		if (complaintDate != null) {
			setComplaintDate(complaintDate);
		}

		Boolean status = (Boolean)attributes.get("status");

		if (status != null) {
			setStatus(status);
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

	/**
	* Returns the primary key of this employee complaint.
	*
	* @return the primary key of this employee complaint
	*/
	@Override
	public long getPrimaryKey() {
		return _employeeComplaint.getPrimaryKey();
	}

	/**
	* Sets the primary key of this employee complaint.
	*
	* @param primaryKey the primary key of this employee complaint
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_employeeComplaint.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the employee complaint ID of this employee complaint.
	*
	* @return the employee complaint ID of this employee complaint
	*/
	@Override
	public long getEmployeeComplaintId() {
		return _employeeComplaint.getEmployeeComplaintId();
	}

	/**
	* Sets the employee complaint ID of this employee complaint.
	*
	* @param employeeComplaintId the employee complaint ID of this employee complaint
	*/
	@Override
	public void setEmployeeComplaintId(long employeeComplaintId) {
		_employeeComplaint.setEmployeeComplaintId(employeeComplaintId);
	}

	/**
	* Returns the user ID of this employee complaint.
	*
	* @return the user ID of this employee complaint
	*/
	@Override
	public long getUserId() {
		return _employeeComplaint.getUserId();
	}

	/**
	* Sets the user ID of this employee complaint.
	*
	* @param userId the user ID of this employee complaint
	*/
	@Override
	public void setUserId(long userId) {
		_employeeComplaint.setUserId(userId);
	}

	/**
	* Returns the user uuid of this employee complaint.
	*
	* @return the user uuid of this employee complaint
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employeeComplaint.getUserUuid();
	}

	/**
	* Sets the user uuid of this employee complaint.
	*
	* @param userUuid the user uuid of this employee complaint
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_employeeComplaint.setUserUuid(userUuid);
	}

	/**
	* Returns the group ID of this employee complaint.
	*
	* @return the group ID of this employee complaint
	*/
	@Override
	public long getGroupId() {
		return _employeeComplaint.getGroupId();
	}

	/**
	* Sets the group ID of this employee complaint.
	*
	* @param groupId the group ID of this employee complaint
	*/
	@Override
	public void setGroupId(long groupId) {
		_employeeComplaint.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this employee complaint.
	*
	* @return the company ID of this employee complaint
	*/
	@Override
	public long getCompanyId() {
		return _employeeComplaint.getCompanyId();
	}

	/**
	* Sets the company ID of this employee complaint.
	*
	* @param companyId the company ID of this employee complaint
	*/
	@Override
	public void setCompanyId(long companyId) {
		_employeeComplaint.setCompanyId(companyId);
	}

	/**
	* Returns the complaint title of this employee complaint.
	*
	* @return the complaint title of this employee complaint
	*/
	@Override
	public java.lang.String getComplaintTitle() {
		return _employeeComplaint.getComplaintTitle();
	}

	/**
	* Sets the complaint title of this employee complaint.
	*
	* @param complaintTitle the complaint title of this employee complaint
	*/
	@Override
	public void setComplaintTitle(java.lang.String complaintTitle) {
		_employeeComplaint.setComplaintTitle(complaintTitle);
	}

	/**
	* Returns the complaint discription of this employee complaint.
	*
	* @return the complaint discription of this employee complaint
	*/
	@Override
	public java.lang.String getComplaintDiscription() {
		return _employeeComplaint.getComplaintDiscription();
	}

	/**
	* Sets the complaint discription of this employee complaint.
	*
	* @param complaintDiscription the complaint discription of this employee complaint
	*/
	@Override
	public void setComplaintDiscription(java.lang.String complaintDiscription) {
		_employeeComplaint.setComplaintDiscription(complaintDiscription);
	}

	/**
	* Returns the complaint from of this employee complaint.
	*
	* @return the complaint from of this employee complaint
	*/
	@Override
	public long getComplaintFrom() {
		return _employeeComplaint.getComplaintFrom();
	}

	/**
	* Sets the complaint from of this employee complaint.
	*
	* @param complaintFrom the complaint from of this employee complaint
	*/
	@Override
	public void setComplaintFrom(long complaintFrom) {
		_employeeComplaint.setComplaintFrom(complaintFrom);
	}

	/**
	* Returns the complaint date of this employee complaint.
	*
	* @return the complaint date of this employee complaint
	*/
	@Override
	public java.util.Date getComplaintDate() {
		return _employeeComplaint.getComplaintDate();
	}

	/**
	* Sets the complaint date of this employee complaint.
	*
	* @param complaintDate the complaint date of this employee complaint
	*/
	@Override
	public void setComplaintDate(java.util.Date complaintDate) {
		_employeeComplaint.setComplaintDate(complaintDate);
	}

	/**
	* Returns the status of this employee complaint.
	*
	* @return the status of this employee complaint
	*/
	@Override
	public boolean getStatus() {
		return _employeeComplaint.getStatus();
	}

	/**
	* Returns <code>true</code> if this employee complaint is status.
	*
	* @return <code>true</code> if this employee complaint is status; <code>false</code> otherwise
	*/
	@Override
	public boolean isStatus() {
		return _employeeComplaint.isStatus();
	}

	/**
	* Sets whether this employee complaint is status.
	*
	* @param status the status of this employee complaint
	*/
	@Override
	public void setStatus(boolean status) {
		_employeeComplaint.setStatus(status);
	}

	/**
	* Returns the modified date of this employee complaint.
	*
	* @return the modified date of this employee complaint
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _employeeComplaint.getModifiedDate();
	}

	/**
	* Sets the modified date of this employee complaint.
	*
	* @param modifiedDate the modified date of this employee complaint
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_employeeComplaint.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the create by of this employee complaint.
	*
	* @return the create by of this employee complaint
	*/
	@Override
	public long getCreateBy() {
		return _employeeComplaint.getCreateBy();
	}

	/**
	* Sets the create by of this employee complaint.
	*
	* @param createBy the create by of this employee complaint
	*/
	@Override
	public void setCreateBy(long createBy) {
		_employeeComplaint.setCreateBy(createBy);
	}

	/**
	* Returns the modified by of this employee complaint.
	*
	* @return the modified by of this employee complaint
	*/
	@Override
	public long getModifiedBy() {
		return _employeeComplaint.getModifiedBy();
	}

	/**
	* Sets the modified by of this employee complaint.
	*
	* @param modifiedBy the modified by of this employee complaint
	*/
	@Override
	public void setModifiedBy(long modifiedBy) {
		_employeeComplaint.setModifiedBy(modifiedBy);
	}

	@Override
	public boolean isNew() {
		return _employeeComplaint.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_employeeComplaint.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _employeeComplaint.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_employeeComplaint.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _employeeComplaint.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _employeeComplaint.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_employeeComplaint.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _employeeComplaint.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_employeeComplaint.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_employeeComplaint.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_employeeComplaint.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new EmployeeComplaintWrapper((EmployeeComplaint)_employeeComplaint.clone());
	}

	@Override
	public int compareTo(com.hrms.model.EmployeeComplaint employeeComplaint) {
		return _employeeComplaint.compareTo(employeeComplaint);
	}

	@Override
	public int hashCode() {
		return _employeeComplaint.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.hrms.model.EmployeeComplaint> toCacheModel() {
		return _employeeComplaint.toCacheModel();
	}

	@Override
	public com.hrms.model.EmployeeComplaint toEscapedModel() {
		return new EmployeeComplaintWrapper(_employeeComplaint.toEscapedModel());
	}

	@Override
	public com.hrms.model.EmployeeComplaint toUnescapedModel() {
		return new EmployeeComplaintWrapper(_employeeComplaint.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _employeeComplaint.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _employeeComplaint.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_employeeComplaint.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof EmployeeComplaintWrapper)) {
			return false;
		}

		EmployeeComplaintWrapper employeeComplaintWrapper = (EmployeeComplaintWrapper)obj;

		if (Validator.equals(_employeeComplaint,
					employeeComplaintWrapper._employeeComplaint)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public EmployeeComplaint getWrappedEmployeeComplaint() {
		return _employeeComplaint;
	}

	@Override
	public EmployeeComplaint getWrappedModel() {
		return _employeeComplaint;
	}

	@Override
	public void resetOriginalValues() {
		_employeeComplaint.resetOriginalValues();
	}

	private EmployeeComplaint _employeeComplaint;
}