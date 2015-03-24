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
 * This class is a wrapper for {@link EmployeeMaster}.
 * </p>
 *
 * @author yashpalsinh
 * @see EmployeeMaster
 * @generated
 */
public class EmployeeMasterWrapper implements EmployeeMaster,
	ModelWrapper<EmployeeMaster> {
	public EmployeeMasterWrapper(EmployeeMaster employeeMaster) {
		_employeeMaster = employeeMaster;
	}

	@Override
	public Class<?> getModelClass() {
		return EmployeeMaster.class;
	}

	@Override
	public String getModelClassName() {
		return EmployeeMaster.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("employeeMasterId", getEmployeeMasterId());
		attributes.put("employeeId", getEmployeeId());
		attributes.put("userId", getUserId());
		attributes.put("gender", getGender());
		attributes.put("dateOfBirth", getDateOfBirth());
		attributes.put("joiningDate", getJoiningDate());
		attributes.put("leavingDate", getLeavingDate());
		attributes.put("maritalStatus", getMaritalStatus());
		attributes.put("nationality", getNationality());
		attributes.put("employeeDesignationId", getEmployeeDesignationId());
		attributes.put("employeeDepartmentId", getEmployeeDepartmentId());
		attributes.put("employeeSubDepartmentId", getEmployeeSubDepartmentId());
		attributes.put("employeeTypeId", getEmployeeTypeId());
		attributes.put("recruitedOnBasisOf", getRecruitedOnBasisOf());
		attributes.put("recruitedBy", getRecruitedBy());
		attributes.put("createBy", getCreateBy());
		attributes.put("modifiedBy", getModifiedBy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long employeeMasterId = (Long)attributes.get("employeeMasterId");

		if (employeeMasterId != null) {
			setEmployeeMasterId(employeeMasterId);
		}

		String employeeId = (String)attributes.get("employeeId");

		if (employeeId != null) {
			setEmployeeId(employeeId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Integer gender = (Integer)attributes.get("gender");

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

		Integer maritalStatus = (Integer)attributes.get("maritalStatus");

		if (maritalStatus != null) {
			setMaritalStatus(maritalStatus);
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

		String recruitedOnBasisOf = (String)attributes.get("recruitedOnBasisOf");

		if (recruitedOnBasisOf != null) {
			setRecruitedOnBasisOf(recruitedOnBasisOf);
		}

		Long recruitedBy = (Long)attributes.get("recruitedBy");

		if (recruitedBy != null) {
			setRecruitedBy(recruitedBy);
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

	/**
	* Returns the primary key of this employee master.
	*
	* @return the primary key of this employee master
	*/
	@Override
	public long getPrimaryKey() {
		return _employeeMaster.getPrimaryKey();
	}

	/**
	* Sets the primary key of this employee master.
	*
	* @param primaryKey the primary key of this employee master
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_employeeMaster.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the employee master ID of this employee master.
	*
	* @return the employee master ID of this employee master
	*/
	@Override
	public long getEmployeeMasterId() {
		return _employeeMaster.getEmployeeMasterId();
	}

	/**
	* Sets the employee master ID of this employee master.
	*
	* @param employeeMasterId the employee master ID of this employee master
	*/
	@Override
	public void setEmployeeMasterId(long employeeMasterId) {
		_employeeMaster.setEmployeeMasterId(employeeMasterId);
	}

	/**
	* Returns the employee ID of this employee master.
	*
	* @return the employee ID of this employee master
	*/
	@Override
	public java.lang.String getEmployeeId() {
		return _employeeMaster.getEmployeeId();
	}

	/**
	* Sets the employee ID of this employee master.
	*
	* @param employeeId the employee ID of this employee master
	*/
	@Override
	public void setEmployeeId(java.lang.String employeeId) {
		_employeeMaster.setEmployeeId(employeeId);
	}

	/**
	* Returns the user ID of this employee master.
	*
	* @return the user ID of this employee master
	*/
	@Override
	public long getUserId() {
		return _employeeMaster.getUserId();
	}

	/**
	* Sets the user ID of this employee master.
	*
	* @param userId the user ID of this employee master
	*/
	@Override
	public void setUserId(long userId) {
		_employeeMaster.setUserId(userId);
	}

	/**
	* Returns the user uuid of this employee master.
	*
	* @return the user uuid of this employee master
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employeeMaster.getUserUuid();
	}

	/**
	* Sets the user uuid of this employee master.
	*
	* @param userUuid the user uuid of this employee master
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_employeeMaster.setUserUuid(userUuid);
	}

	/**
	* Returns the gender of this employee master.
	*
	* @return the gender of this employee master
	*/
	@Override
	public int getGender() {
		return _employeeMaster.getGender();
	}

	/**
	* Sets the gender of this employee master.
	*
	* @param gender the gender of this employee master
	*/
	@Override
	public void setGender(int gender) {
		_employeeMaster.setGender(gender);
	}

	/**
	* Returns the date of birth of this employee master.
	*
	* @return the date of birth of this employee master
	*/
	@Override
	public java.util.Date getDateOfBirth() {
		return _employeeMaster.getDateOfBirth();
	}

	/**
	* Sets the date of birth of this employee master.
	*
	* @param dateOfBirth the date of birth of this employee master
	*/
	@Override
	public void setDateOfBirth(java.util.Date dateOfBirth) {
		_employeeMaster.setDateOfBirth(dateOfBirth);
	}

	/**
	* Returns the joining date of this employee master.
	*
	* @return the joining date of this employee master
	*/
	@Override
	public java.util.Date getJoiningDate() {
		return _employeeMaster.getJoiningDate();
	}

	/**
	* Sets the joining date of this employee master.
	*
	* @param joiningDate the joining date of this employee master
	*/
	@Override
	public void setJoiningDate(java.util.Date joiningDate) {
		_employeeMaster.setJoiningDate(joiningDate);
	}

	/**
	* Returns the leaving date of this employee master.
	*
	* @return the leaving date of this employee master
	*/
	@Override
	public java.util.Date getLeavingDate() {
		return _employeeMaster.getLeavingDate();
	}

	/**
	* Sets the leaving date of this employee master.
	*
	* @param leavingDate the leaving date of this employee master
	*/
	@Override
	public void setLeavingDate(java.util.Date leavingDate) {
		_employeeMaster.setLeavingDate(leavingDate);
	}

	/**
	* Returns the marital status of this employee master.
	*
	* @return the marital status of this employee master
	*/
	@Override
	public int getMaritalStatus() {
		return _employeeMaster.getMaritalStatus();
	}

	/**
	* Sets the marital status of this employee master.
	*
	* @param maritalStatus the marital status of this employee master
	*/
	@Override
	public void setMaritalStatus(int maritalStatus) {
		_employeeMaster.setMaritalStatus(maritalStatus);
	}

	/**
	* Returns the nationality of this employee master.
	*
	* @return the nationality of this employee master
	*/
	@Override
	public java.lang.String getNationality() {
		return _employeeMaster.getNationality();
	}

	/**
	* Sets the nationality of this employee master.
	*
	* @param nationality the nationality of this employee master
	*/
	@Override
	public void setNationality(java.lang.String nationality) {
		_employeeMaster.setNationality(nationality);
	}

	/**
	* Returns the employee designation ID of this employee master.
	*
	* @return the employee designation ID of this employee master
	*/
	@Override
	public int getEmployeeDesignationId() {
		return _employeeMaster.getEmployeeDesignationId();
	}

	/**
	* Sets the employee designation ID of this employee master.
	*
	* @param employeeDesignationId the employee designation ID of this employee master
	*/
	@Override
	public void setEmployeeDesignationId(int employeeDesignationId) {
		_employeeMaster.setEmployeeDesignationId(employeeDesignationId);
	}

	/**
	* Returns the employee department ID of this employee master.
	*
	* @return the employee department ID of this employee master
	*/
	@Override
	public int getEmployeeDepartmentId() {
		return _employeeMaster.getEmployeeDepartmentId();
	}

	/**
	* Sets the employee department ID of this employee master.
	*
	* @param employeeDepartmentId the employee department ID of this employee master
	*/
	@Override
	public void setEmployeeDepartmentId(int employeeDepartmentId) {
		_employeeMaster.setEmployeeDepartmentId(employeeDepartmentId);
	}

	/**
	* Returns the employee sub department ID of this employee master.
	*
	* @return the employee sub department ID of this employee master
	*/
	@Override
	public int getEmployeeSubDepartmentId() {
		return _employeeMaster.getEmployeeSubDepartmentId();
	}

	/**
	* Sets the employee sub department ID of this employee master.
	*
	* @param employeeSubDepartmentId the employee sub department ID of this employee master
	*/
	@Override
	public void setEmployeeSubDepartmentId(int employeeSubDepartmentId) {
		_employeeMaster.setEmployeeSubDepartmentId(employeeSubDepartmentId);
	}

	/**
	* Returns the employee type ID of this employee master.
	*
	* @return the employee type ID of this employee master
	*/
	@Override
	public int getEmployeeTypeId() {
		return _employeeMaster.getEmployeeTypeId();
	}

	/**
	* Sets the employee type ID of this employee master.
	*
	* @param employeeTypeId the employee type ID of this employee master
	*/
	@Override
	public void setEmployeeTypeId(int employeeTypeId) {
		_employeeMaster.setEmployeeTypeId(employeeTypeId);
	}

	/**
	* Returns the recruited on basis of of this employee master.
	*
	* @return the recruited on basis of of this employee master
	*/
	@Override
	public java.lang.String getRecruitedOnBasisOf() {
		return _employeeMaster.getRecruitedOnBasisOf();
	}

	/**
	* Sets the recruited on basis of of this employee master.
	*
	* @param recruitedOnBasisOf the recruited on basis of of this employee master
	*/
	@Override
	public void setRecruitedOnBasisOf(java.lang.String recruitedOnBasisOf) {
		_employeeMaster.setRecruitedOnBasisOf(recruitedOnBasisOf);
	}

	/**
	* Returns the recruited by of this employee master.
	*
	* @return the recruited by of this employee master
	*/
	@Override
	public long getRecruitedBy() {
		return _employeeMaster.getRecruitedBy();
	}

	/**
	* Sets the recruited by of this employee master.
	*
	* @param recruitedBy the recruited by of this employee master
	*/
	@Override
	public void setRecruitedBy(long recruitedBy) {
		_employeeMaster.setRecruitedBy(recruitedBy);
	}

	/**
	* Returns the create by of this employee master.
	*
	* @return the create by of this employee master
	*/
	@Override
	public int getCreateBy() {
		return _employeeMaster.getCreateBy();
	}

	/**
	* Sets the create by of this employee master.
	*
	* @param createBy the create by of this employee master
	*/
	@Override
	public void setCreateBy(int createBy) {
		_employeeMaster.setCreateBy(createBy);
	}

	/**
	* Returns the modified by of this employee master.
	*
	* @return the modified by of this employee master
	*/
	@Override
	public int getModifiedBy() {
		return _employeeMaster.getModifiedBy();
	}

	/**
	* Sets the modified by of this employee master.
	*
	* @param modifiedBy the modified by of this employee master
	*/
	@Override
	public void setModifiedBy(int modifiedBy) {
		_employeeMaster.setModifiedBy(modifiedBy);
	}

	@Override
	public boolean isNew() {
		return _employeeMaster.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_employeeMaster.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _employeeMaster.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_employeeMaster.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _employeeMaster.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _employeeMaster.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_employeeMaster.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _employeeMaster.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_employeeMaster.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_employeeMaster.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_employeeMaster.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new EmployeeMasterWrapper((EmployeeMaster)_employeeMaster.clone());
	}

	@Override
	public int compareTo(com.hrms.model.EmployeeMaster employeeMaster) {
		return _employeeMaster.compareTo(employeeMaster);
	}

	@Override
	public int hashCode() {
		return _employeeMaster.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.hrms.model.EmployeeMaster> toCacheModel() {
		return _employeeMaster.toCacheModel();
	}

	@Override
	public com.hrms.model.EmployeeMaster toEscapedModel() {
		return new EmployeeMasterWrapper(_employeeMaster.toEscapedModel());
	}

	@Override
	public com.hrms.model.EmployeeMaster toUnescapedModel() {
		return new EmployeeMasterWrapper(_employeeMaster.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _employeeMaster.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _employeeMaster.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_employeeMaster.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof EmployeeMasterWrapper)) {
			return false;
		}

		EmployeeMasterWrapper employeeMasterWrapper = (EmployeeMasterWrapper)obj;

		if (Validator.equals(_employeeMaster,
					employeeMasterWrapper._employeeMaster)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public EmployeeMaster getWrappedEmployeeMaster() {
		return _employeeMaster;
	}

	@Override
	public EmployeeMaster getWrappedModel() {
		return _employeeMaster;
	}

	@Override
	public void resetOriginalValues() {
		_employeeMaster.resetOriginalValues();
	}

	private EmployeeMaster _employeeMaster;
}