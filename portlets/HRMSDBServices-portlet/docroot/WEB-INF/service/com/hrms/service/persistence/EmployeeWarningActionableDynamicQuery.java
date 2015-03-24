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

import com.hrms.model.EmployeeWarning;

import com.hrms.service.EmployeeWarningLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author yashpalsinh
 * @generated
 */
public abstract class EmployeeWarningActionableDynamicQuery
	extends BaseActionableDynamicQuery {
	public EmployeeWarningActionableDynamicQuery() throws SystemException {
		setBaseLocalService(EmployeeWarningLocalServiceUtil.getService());
		setClass(EmployeeWarning.class);

		setClassLoader(com.hrms.service.ClpSerializer.class.getClassLoader());

		setPrimaryKeyPropertyName("employeeWarningId");
	}
}