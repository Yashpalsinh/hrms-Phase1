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

import com.hrms.service.LeaveLocalServiceUtil;
import com.hrms.service.base.LeaveLocalServiceBaseImpl;
import com.hrms.model.Leave;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Junction;
import com.liferay.portal.kernel.dao.orm.Property;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.Validator;


/**
 * The implementation of the leave local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.hrms.service.LeaveLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author yashpalsinh
 * @see com.hrms.service.base.LeaveLocalServiceBaseImpl
 * @see com.hrms.service.LeaveLocalServiceUtil
 */
public class LeaveLocalServiceImpl extends LeaveLocalServiceBaseImpl {
	
	public List<Leave> getSearchLeaves(String leaveName,String leaveType,int leavesAllowedPerYear, boolean carryOver,
										boolean encachement,boolean Status,boolean andSearch,int start,int end) throws SystemException{
		DynamicQuery dynamic=buildLeaveDynamicQuery(leaveName,leaveType,leavesAllowedPerYear,carryOver,encachement,Status,andSearch);
		return LeaveLocalServiceUtil.dynamicQuery(dynamic, start, end);
	
	
	}
	
	public int getSearchLeavesCount(String leaveName,String leaveType,int leavesAllowedPerYear,boolean carryOver,
			boolean encachement,boolean Status,boolean andSearch,int start,int end) throws SystemException{
DynamicQuery dynamic=buildLeaveDynamicQuery(leaveName,leaveType,leavesAllowedPerYear,carryOver,encachement,Status,andSearch);
return (int)LeaveLocalServiceUtil.dynamicQueryCount(dynamic);


}

	private DynamicQuery buildLeaveDynamicQuery(String leaveName,
			String leaveType, int leavesAllowedPerYear,boolean carryOver,
			boolean encachement, boolean status, boolean andSearch) {
		// TODO Auto-generated method stub
		
		Junction junction=null;
		if(andSearch)
			junction=RestrictionsFactoryUtil.conjunction();
		else
			junction=RestrictionsFactoryUtil.disjunction();
		
		if(Validator.isName(leaveName))
		{
			Property property=PropertyFactoryUtil.forName("leaveName");
			String value=(new StringBuilder("%").append(leaveName).append("%").toString());
			junction.add(property.like(value));
		}
		if(Validator.isNotNull(leaveType))
		{
			Property property=PropertyFactoryUtil.forName("leaveType");
			String value=(new StringBuilder("%").append(leaveType).append("%").toString());
			junction.add(property.like(value));
		}
		if(leavesAllowedPerYear>0)
		{
			Property property=PropertyFactoryUtil.forName("leavesAllowedPerYear");
			//String value=(new StringBuilder("%").append(leavesAllowedPerYear).append("%").toString());
			junction.add(property.eq(Integer.valueOf(leavesAllowedPerYear)));
		}
		if(carryOver)
		{
			Property property=PropertyFactoryUtil.forName("carryOver");
			//String value=(new StringBuilder("%").append(carryOver).append("%").toString());
			junction.add(property.eq(Boolean.valueOf(carryOver)));
		}
		if(encachement)
		{
			Property property=PropertyFactoryUtil.forName("encachement");
			//String value=(new StringBuilder("%").append(encachement).append("%").toString());
			junction.add(property.eq(Boolean.valueOf(encachement)));
		}
		
		if(status)
		{
			Property property=PropertyFactoryUtil.forName("status");
			//String value=(new StringBuilder("%").append(status).append("%").toString());
			junction.add(property.eq(Boolean.valueOf(status)));
		}
		
		
		DynamicQuery dynamicQuery=DynamicQueryFactoryUtil.forClass(Leave.class, getClassLoader());
		return dynamicQuery.add(junction);
		
		

	}

}