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

import com.hrms.NoSuchEmployeeDesignationException;
import com.hrms.model.EmployeeDepartment;
import com.hrms.model.EmployeeDesignation;
import com.hrms.service.EmployeeDesignationLocalServiceUtil;
import com.hrms.service.base.EmployeeDesignationLocalServiceBaseImpl;
import com.hrms.service.persistence.EmployeeDesignationUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Junction;
import com.liferay.portal.kernel.dao.orm.Property;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.Validator;

import java.util.List;

/**
 * The implementation of the employee designation local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.hrms.service.EmployeeDesignationLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author yashpalsinh
 * @see com.hrms.service.base.EmployeeDesignationLocalServiceBaseImpl
 * @see com.hrms.service.EmployeeDesignationLocalServiceUtil
 */
public class EmployeeDesignationLocalServiceImpl
	extends EmployeeDesignationLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.hrms.service.EmployeeDesignationLocalServiceUtil} to access the employee designation local service.
	 */
	public List getSerachEmployeeDesignations(String designationName,String status,boolean andSearch, int start, int end, OrderByComparator orderByComparator)
	        throws SystemException
	        
	    {	
		 if(Validator.isNotNull(status))
	        {
			 boolean status1=Boolean.parseBoolean(status);
			 DynamicQuery dynamicQuery = buildDynamicQuery(designationName,status1,andSearch);
		     return EmployeeDesignationLocalServiceUtil.dynamicQuery(dynamicQuery, start, end, orderByComparator);
	        }
		
		 else{
	        DynamicQuery dynamicQuery = buildDynamicQuery(designationName,andSearch);
	        return EmployeeDesignationLocalServiceUtil.dynamicQuery(dynamicQuery, start, end, orderByComparator);
		 }
		 }
	//get total numbers of entry to set total in search container
	    public int getSearchEmployeeDesignationsCount(String designationName,String status,boolean andSearch)
	            throws SystemException
	    {
	    	
			 if(Validator.isNotNull(status))
		        {
				 boolean status1=Boolean.parseBoolean(status);
				 DynamicQuery dynamicQuery = buildDynamicQuery(designationName,status1,andSearch);
			     return (int)EmployeeDesignationLocalServiceUtil.dynamicQueryCount(dynamicQuery);
		        }
			
			 else{
				 DynamicQuery dynamicQuery = buildDynamicQuery(designationName,andSearch);
			     return (int)EmployeeDesignationLocalServiceUtil.dynamicQueryCount(dynamicQuery);
			 }
			
	    	
	    }

	    protected DynamicQuery buildDynamicQuery(String designationName,Boolean status,boolean andSearch)
	    {	Junction junction = null;
	        if(andSearch)
	            junction = RestrictionsFactoryUtil.conjunction();
	        else
	            junction = RestrictionsFactoryUtil.disjunction();
	       
	        if(Validator.isNotNull(designationName))
	        {
	            Property property = PropertyFactoryUtil.forName("designationName");
	            String value = (new StringBuilder("%")).append(designationName).append("%").toString();
	            junction.add(property.like(value));
	        }
	        if(Validator.isNotNull(status))
	        {
	            Property property = PropertyFactoryUtil.forName("status");
	            junction.add(property.eq(Boolean.valueOf(status)));
	        }
	         
	        DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(EmployeeDesignation.class, getClassLoader());
	        return dynamicQuery.add(junction);
	    }
	    protected DynamicQuery buildDynamicQuery(String designationName,boolean andSearch)
	    {	Junction junction = null;
	        if(andSearch)
	            junction = RestrictionsFactoryUtil.conjunction();
	        else
	            junction = RestrictionsFactoryUtil.disjunction();
	       
	        if(Validator.isNotNull(designationName))
	        {
	            Property property = PropertyFactoryUtil.forName("designationName");
	            String value = (new StringBuilder("%")).append(designationName).append("%").toString();
	            junction.add(property.like(value));
	        }
	       
	        DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(EmployeeDesignation.class, getClassLoader());
	        return dynamicQuery.add(junction);
	    }
	    
	    
	    public java.util.List<EmployeeDesignation> findByStatus(boolean stat)
	    		throws com.liferay.portal.kernel.exception.SystemException {
	    		return getEmployeeDesignationPersistence().findBystatus(stat);
	    }
	   
}