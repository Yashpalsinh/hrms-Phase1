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

import com.hrms.model.EmployeeTimesheet;
import com.hrms.service.EmployeeTimesheetLocalServiceUtil;
import com.hrms.service.base.EmployeeTimesheetLocalServiceBaseImpl;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Junction;
import com.liferay.portal.kernel.dao.orm.Property;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.Validator;

/**
 * The implementation of the employee timesheet local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.hrms.service.EmployeeTimesheetLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author bhavik
 * @see com.hrms.service.base.EmployeeTimesheetLocalServiceBaseImpl
 * @see com.hrms.service.EmployeeTimesheetLocalServiceUtil
 */
public class EmployeeTimesheetLocalServiceImpl
	extends EmployeeTimesheetLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.hrms.service.EmployeeTimesheetLocalServiceUtil} to access the employee timesheet local service.
	 */
	
	public List getEmployeeTimesheets(String taskTitle, String taskDescription,
			boolean andSearch, int start, int end) throws SystemException {
		DynamicQuery query = buildDynamicQuery(taskTitle, taskDescription,
				andSearch);
		return EmployeeTimesheetLocalServiceUtil
				.dynamicQuery(query, start, end);
	}

	public int getEmployeeTimesheetCount(String taskTitle,
			String taskDescription, boolean andSearch) throws SystemException {
		DynamicQuery query = buildDynamicQuery(taskTitle, taskDescription,
				andSearch);
		return (int) EmployeeTimesheetLocalServiceUtil.dynamicQueryCount(query);
	}

	protected DynamicQuery buildDynamicQuery(String taskTitle,
			String taskDescription, boolean andSearch) {
		Junction junction = null;
		if (andSearch)
			junction = RestrictionsFactoryUtil.conjunction();
		else
			junction = RestrictionsFactoryUtil.disjunction();

		if (Validator.isNotNull(taskTitle)) {
			Property property = PropertyFactoryUtil.forName("taskTitle");
			String value = (new StringBuilder("%")).append(taskTitle)
					.append("%").toString();
			junction.add(property.like(value));
		}
		if (Validator.isNotNull(taskDescription)) {
			Property property = PropertyFactoryUtil.forName("taskDescription");
			String value = (new StringBuilder("%")).append(taskDescription)
					.append("%").toString();
			junction.add(property.like(value));
		}
		DynamicQuery query = DynamicQueryFactoryUtil.forClass(
				EmployeeTimesheet.class, getClassLoader());
		return query.add(junction);
	}
}