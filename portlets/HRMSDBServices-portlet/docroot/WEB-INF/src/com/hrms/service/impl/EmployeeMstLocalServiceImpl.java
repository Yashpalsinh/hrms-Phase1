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

package com.hrms.service.impl;

import java.util.List;

import com.hrms.service.base.EmployeeMstLocalServiceBaseImpl;
import com.liferay.portal.kernel.dao.orm.Criterion;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.portal.model.User;
import com.liferay.portal.service.UserLocalServiceUtil;

/**
 * The implementation of the employee mst local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.hrms.service.EmployeeMstLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author bhavik
 * @see com.hrms.service.base.EmployeeMstLocalServiceBaseImpl
 * @see com.hrms.service.EmployeeMstLocalServiceUtil
 */
public class EmployeeMstLocalServiceImpl extends
		EmployeeMstLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 * 
	 * Never reference this interface directly. Always use {@link
	 * com.hrms.service.EmployeeMstLocalServiceUtil} to access the employee mst
	 * local service.
	 */

	public List<User> getEmployeesByKeywords(String keywords)
			throws SystemException {

		try {
			DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
					User.class, PortalClassLoaderUtil.getClassLoader());
			Criterion criterion = RestrictionsFactoryUtil.or(
					RestrictionsFactoryUtil.like("firstName", "%" + keywords
							+ "%"),
					RestrictionsFactoryUtil.like("lastName", "%" + keywords
							+ "%"));
			dynamicQuery.add(criterion);

			List<User> userList = UserLocalServiceUtil
					.dynamicQuery(dynamicQuery);
			return userList;
		} catch (Exception e) {
			System.out.println("error");
			e.printStackTrace();
			return null;
		}

	}
}