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

import com.hrms.model.JobLibrary;
import com.hrms.service.base.JobLibraryLocalServiceBaseImpl;
import com.hrms.service.persistence.JobLibraryPersistence;
import com.hrms.service.JobLibraryLocalServiceUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Junction;
import com.liferay.portal.kernel.dao.orm.Property;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portlet.asset.model.AssetEntry;
import com.liferay.portlet.asset.service.AssetEntryLocalService;

/**
 * The implementation of the job library local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.hrms.service.JobLibraryLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author yashpalsinh
 * @see com.hrms.service.base.JobLibraryLocalServiceBaseImpl
 * @see com.hrms.service.JobLibraryLocalServiceUtil
 */
public class JobLibraryLocalServiceImpl extends JobLibraryLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.hrms.service.JobLibraryLocalServiceUtil} to access the job library local service.
	 */
	
	

	public List getSearchJoblibrary(String jobTitle,
			 boolean andSearch, int start, int end)
			throws SystemException {
		DynamicQuery dynamicQuery = buildjobLibraryDynamicQuery(jobTitle, andSearch);
		return JobLibraryLocalServiceUtil
				.dynamicQuery(dynamicQuery,start,end);
	}

	public int getSearchJobLibraryCount(String jobTitle,
			 boolean andSearch) throws SystemException {
		DynamicQuery dynamicQuery = buildjobLibraryDynamicQuery(jobTitle, andSearch);
		return (int)JobLibraryLocalServiceUtil.dynamicQueryCount(dynamicQuery);
	}

	protected DynamicQuery buildjobLibraryDynamicQuery(String jobTitle,boolean andSearch) {
		Junction junction = null;
		if (andSearch)
			junction = RestrictionsFactoryUtil.conjunction();
		else
			junction = RestrictionsFactoryUtil.disjunction();

		
		 if(Validator.isNotNull(jobTitle))
		 {
		 Property property = PropertyFactoryUtil.forName("jobTitle");
		 String value = (new StringBuilder("%")).append(jobTitle).append("%").toString();
		 junction.add(property.like(value));
		 }
		
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
				JobLibrary.class, getClassLoader());
		return dynamicQuery.add(junction);
	}
	
	
}