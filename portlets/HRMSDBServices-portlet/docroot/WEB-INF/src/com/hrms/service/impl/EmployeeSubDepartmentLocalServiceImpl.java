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


import com.hrms.model.EmployeeDepartment;
import com.hrms.model.EmployeeSubDepartment;
import com.hrms.custom.EmployeeSubDepartmentCustomModel;
import com.hrms.service.EmployeeDepartmentLocalServiceUtil;
import com.hrms.service.EmployeeSubDepartmentLocalServiceUtil;
import com.hrms.service.base.EmployeeSubDepartmentLocalServiceBaseImpl;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Junction;
import com.liferay.portal.kernel.dao.orm.Property;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.Validator;

import java.util.ArrayList;
import java.util.List;


public class EmployeeSubDepartmentLocalServiceImpl
	extends EmployeeSubDepartmentLocalServiceBaseImpl {
	//method to retrive data according to search parameter from view.jsp
			public List getSerachEmployeeSubDepartments(String subDepartmentName,String status,long departmentId,boolean andSearch, int start, int end, OrderByComparator orderByComparator)
			        throws SystemException
			        
			    {
				
				 if(Validator.isNotNull(status))
			        {
					 boolean status1=Boolean.parseBoolean(status);
					 DynamicQuery dynamicQuery = buildDynamicQuery(subDepartmentName,status1,departmentId,andSearch);
				     return EmployeeSubDepartmentLocalServiceUtil.dynamicQuery(dynamicQuery, start, end, orderByComparator);
			        }
				
				 else{
			        DynamicQuery dynamicQuery = buildDynamicQuery(subDepartmentName,departmentId,andSearch);
			        return EmployeeSubDepartmentLocalServiceUtil.dynamicQuery(dynamicQuery, start, end, orderByComparator);
				 }
				 }
			//get total numbers of entry to set total in search container
			    public int getSearchEmployeeSubDepartmentsCount(String subDepartmentName,String status,long departmentId,boolean andSearch)
			            throws SystemException
			    {
			    	
					 if(Validator.isNotNull(status))
				        {
						 boolean status1=Boolean.parseBoolean(status);
						 DynamicQuery dynamicQuery = buildDynamicQuery(subDepartmentName,status1,departmentId,andSearch);
					     return (int)EmployeeSubDepartmentLocalServiceUtil.dynamicQueryCount(dynamicQuery);
				        }
					
					 else{
						 DynamicQuery dynamicQuery = buildDynamicQuery(subDepartmentName,departmentId,andSearch);
					     return (int)EmployeeSubDepartmentLocalServiceUtil.dynamicQueryCount(dynamicQuery);
					 }
					
			    	
			    }

			    protected DynamicQuery buildDynamicQuery(String subDepartmentName,Boolean status,long departmentId,boolean andSearch)
			    {	Junction junction = null;
			        if(andSearch)
			            junction = RestrictionsFactoryUtil.conjunction();
			        else
			            junction = RestrictionsFactoryUtil.disjunction();
			       
			        if(Validator.isNotNull(subDepartmentName))
			        {
			            Property property = PropertyFactoryUtil.forName("subDepartmentName");
			            String value = (new StringBuilder("%")).append(subDepartmentName).append("%").toString();
			            junction.add(property.like(value));
			        }
			        if(Validator.isNotNull(departmentId))
			        {
			            Property property = PropertyFactoryUtil.forName("employeeDepartmentId");
			            junction.add(property.eq(Long.valueOf(departmentId)));
			        }
			        if(Validator.isNotNull(status))
			        {
			            Property property = PropertyFactoryUtil.forName("status");
			            junction.add(property.eq(Boolean.valueOf(status)));
			        }
			         
			        DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(EmployeeSubDepartment.class, getClassLoader());
			        return dynamicQuery.add(junction);
			    }
			    protected DynamicQuery buildDynamicQuery(String subDepartmentName,long departmentId,boolean andSearch)
			    {	Junction junction = null;
			        if(andSearch)
			            junction = RestrictionsFactoryUtil.conjunction();
			        else
			            junction = RestrictionsFactoryUtil.disjunction();
			       
			        if(Validator.isNotNull(subDepartmentName))
			        {
			            Property property = PropertyFactoryUtil.forName("subDepartmentName");
			            String value = (new StringBuilder("%")).append(subDepartmentName).append("%").toString();
			            junction.add(property.like(value));
			        }
			        if(Validator.isNotNull(departmentId))
			        {
			            Property property = PropertyFactoryUtil.forName("employeeDepartmentId");
			            junction.add(property.eq(Long.valueOf(departmentId)));
			        }
			        DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(EmployeeSubDepartment.class, getClassLoader());
			        return dynamicQuery.add(junction);
			    }
			    
			    
			    public java.util.List<EmployeeSubDepartment>
			    findByDeptAndStatus(long deptId, boolean stat)
			    throws com.liferay.portal.kernel.exception.SystemException {
			    return getEmployeeSubDepartmentPersistence().findByDeptAndStatus(deptId,stat);
			    }
			    
			    
			   /* public List getSubDepartmentValue(int start, int end)
				        throws SystemException
				    {

					List<EmployeeSubDepartment> mstList = new ArrayList<EmployeeSubDepartment>();
					List<EmployeeSubDepartmentCustomModel> allList = new ArrayList<EmployeeSubDepartmentCustomModel>();
					EmployeeSubDepartmentCustomModel employeeSubDepartmentCustomModel = null;
					
				
					try {
					
						mstList = EmployeeSubDepartmentLocalServiceUtil.getEmployeeSubDepartments(start, end);
						long i=start+1;
						
						for (EmployeeSubDepartment employeeSubDepartmentList : mstList) {

							employeeSubDepartmentCustomModel = new EmployeeSubDepartmentCustomModel(); 
							
							EmployeeSubDepartment employeeSubDepartment = EmployeeSubDepartmentLocalServiceUtil.getEmployeeSubDepartment(employeeSubDepartmentList.getEmployeeSubDepartmentId());
							
							employeeSubDepartmentCustomModel.setEmployeeSubDepartmentId(employeeSubDepartment.getEmployeeSubDepartmentId());
							employeeSubDepartmentCustomModel.setSubDepartmentName(employeeSubDepartment.getSubDepartmentName());
							employeeSubDepartmentCustomModel.setSrno(i);
							EmployeeDepartment employeeDepartment = EmployeeDepartmentLocalServiceUtil.findByemployeeDepartmentId(employeeSubDepartment.getEmployeeDepartmentId());
							employeeSubDepartmentCustomModel.setDepartmentName(employeeDepartment.getDepartmentName());
							i++;
							allList.add(employeeSubDepartmentCustomModel);System.out.println(employeeSubDepartmentCustomModel+" list2");
							
							
						}

					} catch (SystemException e) {
						e.printStackTrace();
					} catch (PortalException e) {
						
						e.printStackTrace();
					}
					return allList;
					
				    }
				*/
	}