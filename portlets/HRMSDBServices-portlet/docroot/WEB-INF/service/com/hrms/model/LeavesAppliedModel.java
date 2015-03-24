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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the LeavesApplied service. Represents a row in the &quot;HRMS_LeavesApplied&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.hrms.model.impl.LeavesAppliedModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.hrms.model.impl.LeavesAppliedImpl}.
 * </p>
 *
 * @author yashpalsinh
 * @see LeavesApplied
 * @see com.hrms.model.impl.LeavesAppliedImpl
 * @see com.hrms.model.impl.LeavesAppliedModelImpl
 * @generated
 */
public interface LeavesAppliedModel extends BaseModel<LeavesApplied> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a leaves applied model instance should use the {@link LeavesApplied} interface instead.
	 */

	/**
	 * Returns the primary key of this leaves applied.
	 *
	 * @return the primary key of this leaves applied
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this leaves applied.
	 *
	 * @param primaryKey the primary key of this leaves applied
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the applied leave ID of this leaves applied.
	 *
	 * @return the applied leave ID of this leaves applied
	 */
	public long getAppliedLeaveId();

	/**
	 * Sets the applied leave ID of this leaves applied.
	 *
	 * @param appliedLeaveId the applied leave ID of this leaves applied
	 */
	public void setAppliedLeaveId(long appliedLeaveId);

	/**
	 * Returns the user ID of this leaves applied.
	 *
	 * @return the user ID of this leaves applied
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this leaves applied.
	 *
	 * @param userId the user ID of this leaves applied
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this leaves applied.
	 *
	 * @return the user uuid of this leaves applied
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this leaves applied.
	 *
	 * @param userUuid the user uuid of this leaves applied
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the group ID of this leaves applied.
	 *
	 * @return the group ID of this leaves applied
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this leaves applied.
	 *
	 * @param groupId the group ID of this leaves applied
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this leaves applied.
	 *
	 * @return the company ID of this leaves applied
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this leaves applied.
	 *
	 * @param companyId the company ID of this leaves applied
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the employee name of this leaves applied.
	 *
	 * @return the employee name of this leaves applied
	 */
	@AutoEscape
	public String getEmployeeName();

	/**
	 * Sets the employee name of this leaves applied.
	 *
	 * @param employeeName the employee name of this leaves applied
	 */
	public void setEmployeeName(String employeeName);

	/**
	 * Returns the leave name of this leaves applied.
	 *
	 * @return the leave name of this leaves applied
	 */
	@AutoEscape
	public String getLeaveName();

	/**
	 * Sets the leave name of this leaves applied.
	 *
	 * @param leaveName the leave name of this leaves applied
	 */
	public void setLeaveName(String leaveName);

	/**
	 * Returns the entitlement of this leaves applied.
	 *
	 * @return the entitlement of this leaves applied
	 */
	@AutoEscape
	public String getEntitlement();

	/**
	 * Sets the entitlement of this leaves applied.
	 *
	 * @param entitlement the entitlement of this leaves applied
	 */
	public void setEntitlement(String entitlement);

	/**
	 * Returns the leave duration of this leaves applied.
	 *
	 * @return the leave duration of this leaves applied
	 */
	@AutoEscape
	public String getLeaveDuration();

	/**
	 * Sets the leave duration of this leaves applied.
	 *
	 * @param leaveDuration the leave duration of this leaves applied
	 */
	public void setLeaveDuration(String leaveDuration);

	/**
	 * Returns the leave from of this leaves applied.
	 *
	 * @return the leave from of this leaves applied
	 */
	public Date getLeaveFrom();

	/**
	 * Sets the leave from of this leaves applied.
	 *
	 * @param leaveFrom the leave from of this leaves applied
	 */
	public void setLeaveFrom(Date leaveFrom);

	/**
	 * Returns the leave to of this leaves applied.
	 *
	 * @return the leave to of this leaves applied
	 */
	public Date getLeaveTo();

	/**
	 * Sets the leave to of this leaves applied.
	 *
	 * @param leaveTo the leave to of this leaves applied
	 */
	public void setLeaveTo(Date leaveTo);

	/**
	 * Returns the leave date of this leaves applied.
	 *
	 * @return the leave date of this leaves applied
	 */
	public Date getLeaveDate();

	/**
	 * Sets the leave date of this leaves applied.
	 *
	 * @param leaveDate the leave date of this leaves applied
	 */
	public void setLeaveDate(Date leaveDate);

	/**
	 * Returns the leave period of this leaves applied.
	 *
	 * @return the leave period of this leaves applied
	 */
	@AutoEscape
	public String getLeavePeriod();

	/**
	 * Sets the leave period of this leaves applied.
	 *
	 * @param leavePeriod the leave period of this leaves applied
	 */
	public void setLeavePeriod(String leavePeriod);

	/**
	 * Returns the approval status of this leaves applied.
	 *
	 * @return the approval status of this leaves applied
	 */
	@AutoEscape
	public String getApprovalStatus();

	/**
	 * Sets the approval status of this leaves applied.
	 *
	 * @param approvalStatus the approval status of this leaves applied
	 */
	public void setApprovalStatus(String approvalStatus);

	/**
	 * Returns the leave ID of this leaves applied.
	 *
	 * @return the leave ID of this leaves applied
	 */
	public long getLeaveId();

	/**
	 * Sets the leave ID of this leaves applied.
	 *
	 * @param leaveId the leave ID of this leaves applied
	 */
	public void setLeaveId(long leaveId);

	/**
	 * Returns the create date of this leaves applied.
	 *
	 * @return the create date of this leaves applied
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this leaves applied.
	 *
	 * @param createDate the create date of this leaves applied
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this leaves applied.
	 *
	 * @return the modified date of this leaves applied
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this leaves applied.
	 *
	 * @param modifiedDate the modified date of this leaves applied
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the create by of this leaves applied.
	 *
	 * @return the create by of this leaves applied
	 */
	public long getCreateBy();

	/**
	 * Sets the create by of this leaves applied.
	 *
	 * @param createBy the create by of this leaves applied
	 */
	public void setCreateBy(long createBy);

	/**
	 * Returns the modified by of this leaves applied.
	 *
	 * @return the modified by of this leaves applied
	 */
	public long getModifiedBy();

	/**
	 * Sets the modified by of this leaves applied.
	 *
	 * @param modifiedBy the modified by of this leaves applied
	 */
	public void setModifiedBy(long modifiedBy);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(LeavesApplied leavesApplied);

	@Override
	public int hashCode();

	@Override
	public CacheModel<LeavesApplied> toCacheModel();

	@Override
	public LeavesApplied toEscapedModel();

	@Override
	public LeavesApplied toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}