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

package com.hrms.service.persistence;

import com.hrms.model.LeavesApplied;

import com.hrms.service.LeavesAppliedLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author bhavik
 * @generated
 */
public abstract class LeavesAppliedActionableDynamicQuery
	extends BaseActionableDynamicQuery {
	public LeavesAppliedActionableDynamicQuery() throws SystemException {
		setBaseLocalService(LeavesAppliedLocalServiceUtil.getService());
		setClass(LeavesApplied.class);

		setClassLoader(com.hrms.service.ClpSerializer.class.getClassLoader());

		setPrimaryKeyPropertyName("appliedLeaveId");
	}
}