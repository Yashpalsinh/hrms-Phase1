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
 * This class is a wrapper for {@link EmployeeLanguageDetail}.
 * </p>
 *
 * @author yashpalsinh
 * @see EmployeeLanguageDetail
 * @generated
 */
public class EmployeeLanguageDetailWrapper implements EmployeeLanguageDetail,
	ModelWrapper<EmployeeLanguageDetail> {
	public EmployeeLanguageDetailWrapper(
		EmployeeLanguageDetail employeeLanguageDetail) {
		_employeeLanguageDetail = employeeLanguageDetail;
	}

	@Override
	public Class<?> getModelClass() {
		return EmployeeLanguageDetail.class;
	}

	@Override
	public String getModelClassName() {
		return EmployeeLanguageDetail.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("employeeLanguageDetailId", getEmployeeLanguageDetailId());
		attributes.put("userId", getUserId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("languageName", getLanguageName());
		attributes.put("read", getRead());
		attributes.put("write", getWrite());
		attributes.put("speak", getSpeak());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("createBy", getCreateBy());
		attributes.put("modifiedBy", getModifiedBy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long employeeLanguageDetailId = (Long)attributes.get(
				"employeeLanguageDetailId");

		if (employeeLanguageDetailId != null) {
			setEmployeeLanguageDetailId(employeeLanguageDetailId);
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

		String languageName = (String)attributes.get("languageName");

		if (languageName != null) {
			setLanguageName(languageName);
		}

		Boolean read = (Boolean)attributes.get("read");

		if (read != null) {
			setRead(read);
		}

		Boolean write = (Boolean)attributes.get("write");

		if (write != null) {
			setWrite(write);
		}

		Boolean speak = (Boolean)attributes.get("speak");

		if (speak != null) {
			setSpeak(speak);
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

	/**
	* Returns the primary key of this employee language detail.
	*
	* @return the primary key of this employee language detail
	*/
	@Override
	public long getPrimaryKey() {
		return _employeeLanguageDetail.getPrimaryKey();
	}

	/**
	* Sets the primary key of this employee language detail.
	*
	* @param primaryKey the primary key of this employee language detail
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_employeeLanguageDetail.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the employee language detail ID of this employee language detail.
	*
	* @return the employee language detail ID of this employee language detail
	*/
	@Override
	public long getEmployeeLanguageDetailId() {
		return _employeeLanguageDetail.getEmployeeLanguageDetailId();
	}

	/**
	* Sets the employee language detail ID of this employee language detail.
	*
	* @param employeeLanguageDetailId the employee language detail ID of this employee language detail
	*/
	@Override
	public void setEmployeeLanguageDetailId(long employeeLanguageDetailId) {
		_employeeLanguageDetail.setEmployeeLanguageDetailId(employeeLanguageDetailId);
	}

	/**
	* Returns the user ID of this employee language detail.
	*
	* @return the user ID of this employee language detail
	*/
	@Override
	public long getUserId() {
		return _employeeLanguageDetail.getUserId();
	}

	/**
	* Sets the user ID of this employee language detail.
	*
	* @param userId the user ID of this employee language detail
	*/
	@Override
	public void setUserId(long userId) {
		_employeeLanguageDetail.setUserId(userId);
	}

	/**
	* Returns the user uuid of this employee language detail.
	*
	* @return the user uuid of this employee language detail
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employeeLanguageDetail.getUserUuid();
	}

	/**
	* Sets the user uuid of this employee language detail.
	*
	* @param userUuid the user uuid of this employee language detail
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_employeeLanguageDetail.setUserUuid(userUuid);
	}

	/**
	* Returns the group ID of this employee language detail.
	*
	* @return the group ID of this employee language detail
	*/
	@Override
	public long getGroupId() {
		return _employeeLanguageDetail.getGroupId();
	}

	/**
	* Sets the group ID of this employee language detail.
	*
	* @param groupId the group ID of this employee language detail
	*/
	@Override
	public void setGroupId(long groupId) {
		_employeeLanguageDetail.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this employee language detail.
	*
	* @return the company ID of this employee language detail
	*/
	@Override
	public long getCompanyId() {
		return _employeeLanguageDetail.getCompanyId();
	}

	/**
	* Sets the company ID of this employee language detail.
	*
	* @param companyId the company ID of this employee language detail
	*/
	@Override
	public void setCompanyId(long companyId) {
		_employeeLanguageDetail.setCompanyId(companyId);
	}

	/**
	* Returns the language name of this employee language detail.
	*
	* @return the language name of this employee language detail
	*/
	@Override
	public java.lang.String getLanguageName() {
		return _employeeLanguageDetail.getLanguageName();
	}

	/**
	* Sets the language name of this employee language detail.
	*
	* @param languageName the language name of this employee language detail
	*/
	@Override
	public void setLanguageName(java.lang.String languageName) {
		_employeeLanguageDetail.setLanguageName(languageName);
	}

	/**
	* Returns the read of this employee language detail.
	*
	* @return the read of this employee language detail
	*/
	@Override
	public boolean getRead() {
		return _employeeLanguageDetail.getRead();
	}

	/**
	* Returns <code>true</code> if this employee language detail is read.
	*
	* @return <code>true</code> if this employee language detail is read; <code>false</code> otherwise
	*/
	@Override
	public boolean isRead() {
		return _employeeLanguageDetail.isRead();
	}

	/**
	* Sets whether this employee language detail is read.
	*
	* @param read the read of this employee language detail
	*/
	@Override
	public void setRead(boolean read) {
		_employeeLanguageDetail.setRead(read);
	}

	/**
	* Returns the write of this employee language detail.
	*
	* @return the write of this employee language detail
	*/
	@Override
	public boolean getWrite() {
		return _employeeLanguageDetail.getWrite();
	}

	/**
	* Returns <code>true</code> if this employee language detail is write.
	*
	* @return <code>true</code> if this employee language detail is write; <code>false</code> otherwise
	*/
	@Override
	public boolean isWrite() {
		return _employeeLanguageDetail.isWrite();
	}

	/**
	* Sets whether this employee language detail is write.
	*
	* @param write the write of this employee language detail
	*/
	@Override
	public void setWrite(boolean write) {
		_employeeLanguageDetail.setWrite(write);
	}

	/**
	* Returns the speak of this employee language detail.
	*
	* @return the speak of this employee language detail
	*/
	@Override
	public boolean getSpeak() {
		return _employeeLanguageDetail.getSpeak();
	}

	/**
	* Returns <code>true</code> if this employee language detail is speak.
	*
	* @return <code>true</code> if this employee language detail is speak; <code>false</code> otherwise
	*/
	@Override
	public boolean isSpeak() {
		return _employeeLanguageDetail.isSpeak();
	}

	/**
	* Sets whether this employee language detail is speak.
	*
	* @param speak the speak of this employee language detail
	*/
	@Override
	public void setSpeak(boolean speak) {
		_employeeLanguageDetail.setSpeak(speak);
	}

	/**
	* Returns the create date of this employee language detail.
	*
	* @return the create date of this employee language detail
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _employeeLanguageDetail.getCreateDate();
	}

	/**
	* Sets the create date of this employee language detail.
	*
	* @param createDate the create date of this employee language detail
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_employeeLanguageDetail.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this employee language detail.
	*
	* @return the modified date of this employee language detail
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _employeeLanguageDetail.getModifiedDate();
	}

	/**
	* Sets the modified date of this employee language detail.
	*
	* @param modifiedDate the modified date of this employee language detail
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_employeeLanguageDetail.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the create by of this employee language detail.
	*
	* @return the create by of this employee language detail
	*/
	@Override
	public long getCreateBy() {
		return _employeeLanguageDetail.getCreateBy();
	}

	/**
	* Sets the create by of this employee language detail.
	*
	* @param createBy the create by of this employee language detail
	*/
	@Override
	public void setCreateBy(long createBy) {
		_employeeLanguageDetail.setCreateBy(createBy);
	}

	/**
	* Returns the modified by of this employee language detail.
	*
	* @return the modified by of this employee language detail
	*/
	@Override
	public long getModifiedBy() {
		return _employeeLanguageDetail.getModifiedBy();
	}

	/**
	* Sets the modified by of this employee language detail.
	*
	* @param modifiedBy the modified by of this employee language detail
	*/
	@Override
	public void setModifiedBy(long modifiedBy) {
		_employeeLanguageDetail.setModifiedBy(modifiedBy);
	}

	@Override
	public boolean isNew() {
		return _employeeLanguageDetail.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_employeeLanguageDetail.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _employeeLanguageDetail.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_employeeLanguageDetail.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _employeeLanguageDetail.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _employeeLanguageDetail.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_employeeLanguageDetail.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _employeeLanguageDetail.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_employeeLanguageDetail.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_employeeLanguageDetail.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_employeeLanguageDetail.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new EmployeeLanguageDetailWrapper((EmployeeLanguageDetail)_employeeLanguageDetail.clone());
	}

	@Override
	public int compareTo(
		com.hrms.model.EmployeeLanguageDetail employeeLanguageDetail) {
		return _employeeLanguageDetail.compareTo(employeeLanguageDetail);
	}

	@Override
	public int hashCode() {
		return _employeeLanguageDetail.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.hrms.model.EmployeeLanguageDetail> toCacheModel() {
		return _employeeLanguageDetail.toCacheModel();
	}

	@Override
	public com.hrms.model.EmployeeLanguageDetail toEscapedModel() {
		return new EmployeeLanguageDetailWrapper(_employeeLanguageDetail.toEscapedModel());
	}

	@Override
	public com.hrms.model.EmployeeLanguageDetail toUnescapedModel() {
		return new EmployeeLanguageDetailWrapper(_employeeLanguageDetail.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _employeeLanguageDetail.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _employeeLanguageDetail.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_employeeLanguageDetail.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof EmployeeLanguageDetailWrapper)) {
			return false;
		}

		EmployeeLanguageDetailWrapper employeeLanguageDetailWrapper = (EmployeeLanguageDetailWrapper)obj;

		if (Validator.equals(_employeeLanguageDetail,
					employeeLanguageDetailWrapper._employeeLanguageDetail)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public EmployeeLanguageDetail getWrappedEmployeeLanguageDetail() {
		return _employeeLanguageDetail;
	}

	@Override
	public EmployeeLanguageDetail getWrappedModel() {
		return _employeeLanguageDetail;
	}

	@Override
	public void resetOriginalValues() {
		_employeeLanguageDetail.resetOriginalValues();
	}

	private EmployeeLanguageDetail _employeeLanguageDetail;
}