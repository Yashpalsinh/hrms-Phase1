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

import com.hrms.NoSuchEmployeeDepartmentException;
import com.hrms.model.EmployeeDepartment;
import com.hrms.service.EmployeeDepartmentLocalServiceUtil;
import com.hrms.service.base.EmployeeDepartmentLocalServiceBaseImpl;
import com.hrms.service.persistence.EmployeeDepartmentUtil;
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


public class EmployeeDepartmentLocalServiceImpl
	extends EmployeeDepartmentLocalServiceBaseImpl {
	//method to retrive data according to search parameter from view.jsp
		public List getSerachEmployeeDepartments(String departmentName,String status,boolean andSearch, int start, int end, OrderByComparator orderByComparator)
		        throws SystemException
		        
		    {	
			 if(Validator.isNotNull(status))
		        {
				 boolean status1=Boolean.parseBoolean(status);
				 DynamicQuery dynamicQuery = buildDynamicQuery(departmentName,status1,andSearch);
			     return EmployeeDepartmentLocalServiceUtil.dynamicQuery(dynamicQuery, start, end, orderByComparator);
		        }
			
			 else{
		        DynamicQuery dynamicQuery = buildDynamicQuery(departmentName,andSearch);
		        return EmployeeDepartmentLocalServiceUtil.dynamicQuery(dynamicQuery, start, end, orderByComparator);
			 }
			 }
		//get total numbers of entry to set total in search container
		    public int getSearchEmployeeDepartmentsCount(String departmentName,String status,boolean andSearch)
		            throws SystemException
		    {
		    	
				 if(Validator.isNotNull(status))
			        {
					 boolean status1=Boolean.parseBoolean(status);
					 DynamicQuery dynamicQuery = buildDynamicQuery(departmentName,status1,andSearch);
				     return (int)EmployeeDepartmentLocalServiceUtil.dynamicQueryCount(dynamicQuery);
			        }
				
				 else{
					 DynamicQuery dynamicQuery = buildDynamicQuery(departmentName,andSearch);
				     return (int)EmployeeDepartmentLocalServiceUtil.dynamicQueryCount(dynamicQuery);
				 }
				
		    	
		    }

		    protected DynamicQuery buildDynamicQuery(String departmentName,Boolean status,boolean andSearch)
		    {	Junction junction = null;
		        if(andSearch)
		            junction = RestrictionsFactoryUtil.conjunction();
		        else
		            junction = RestrictionsFactoryUtil.disjunction();
		       
		        if(Validator.isNotNull(departmentName))
		        {
		            Property property = PropertyFactoryUtil.forName("departmentName");
		            String value = (new StringBuilder("%")).append(departmentName).append("%").toString();
		            junction.add(property.like(value));
		        }
		        if(Validator.isNotNull(status))
		        {
		            Property property = PropertyFactoryUtil.forName("status");
		            junction.add(property.eq(Boolean.valueOf(status)));
		        }
		         
		        DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(EmployeeDepartment.class, getClassLoader());
		        return dynamicQuery.add(junction);
		    }
		    protected DynamicQuery buildDynamicQuery(String departmentName,boolean andSearch)
		    {	Junction junction = null;
		        if(andSearch)
		            junction = RestrictionsFactoryUtil.conjunction();
		        else
		            junction = RestrictionsFactoryUtil.disjunction();
		       
		        if(Validator.isNotNull(departmentName))
		        {
		            Property property = PropertyFactoryUtil.forName("departmentName");
		            String value = (new StringBuilder("%")).append(departmentName).append("%").toString();
		            junction.add(property.like(value));
		        }
		       
		        DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(EmployeeDepartment.class, getClassLoader());
		        return dynamicQuery.add(junction);
		    }
		    
		    
		    public EmployeeDepartment findByemployeeDepartmentId(long employeeDepartmentId)
					throws com.liferay.portal.kernel.exception.SystemException {
		    		EmployeeDepartment employeeDepartment = null;
					try {
						employeeDepartment = EmployeeDepartmentUtil.findByemployeeDepartmentId(employeeDepartmentId);
						
					} catch (NoSuchEmployeeDepartmentException e) {
						
						e.printStackTrace();
					}
					return employeeDepartment ;
				}
		    
		    public java.util.List<EmployeeDepartment> findByStatus(boolean stat)
		    		throws com.liferay.portal.kernel.exception.SystemException {
		    		return getEmployeeDepartmentPersistence().findBystatus(stat);
		    		}
}