package com.hrms;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.PortletSession;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.ActionMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;
import com.hrms.model.EmployeeSubDepartment;
import com.hrms.service.EmployeeDepartmentLocalServiceUtil;
import com.hrms.service.EmployeeSubDepartmentLocalServiceUtil;
import com.hrms.model.EmployeeDepartment;
import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;


@Controller
@RequestMapping("VIEW")
public class EmployeeSubDepartmentCont {
 
	private static final Log LOG = LogFactoryUtil
			.getLog(EmployeeSubDepartmentCont.class);
	
	
	@RenderMapping
	public String defaultRender(RenderRequest request, RenderResponse response,
			Model model) throws SystemException {
		try {
			model.addAttribute("departmentList", EmployeeDepartmentLocalServiceUtil.getEmployeeDepartments(0,EmployeeDepartmentLocalServiceUtil.getEmployeeDepartmentsCount()));
			PortletSession portletSession = request.getPortletSession();
			String obj = (String) portletSession.getAttribute("message");
			
			if(obj!=null){
				
				SessionMessages.add(request.getPortletSession(),obj);
				
			}
		} catch (Exception e) {
		}
		return "view";
	}
	
	
	
	
	@RenderMapping(params="name=add")
	public String addRender(RenderRequest request, RenderResponse response,
			Model model) throws SystemException {
		try {
			model.addAttribute("departmentList", EmployeeDepartmentLocalServiceUtil.getEmployeeDepartments(0,EmployeeDepartmentLocalServiceUtil.getEmployeeDepartmentsCount()));
		
		} catch (Exception e) {
		}
		return "add";
	}
	@RenderMapping(params="name=edit")
	public String editRender(RenderRequest request, RenderResponse response,
			Model model) throws SystemException {
		try {
			model.addAttribute("departmentList", EmployeeDepartmentLocalServiceUtil.getEmployeeDepartments(0,EmployeeDepartmentLocalServiceUtil.getEmployeeDepartmentsCount()));
			long employeeSubDepartmentId = ParamUtil.getLong(request, "employeeSubDepartmentId");
			request.setAttribute("employeeSubDepartmentDetail", EmployeeSubDepartmentLocalServiceUtil.getEmployeeSubDepartment(employeeSubDepartmentId));
		} catch (Exception e) {
		}
		return "edit";
	}

	@ActionMapping(params = "action=addSubDepartment")
	public void addSubDepartment(@ModelAttribute(value ="employeeSubDepartment") EmployeeSubDepartmentCustomModel employeeSubDepartmentModel, ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException, PortletException {
		try {
			
			long employeeSubDepartmentId = ParamUtil.getLong(actionRequest, "employeeSubDepartmentId");
						
			if (employeeSubDepartmentId != 0) {
				EmployeeSubDepartment employeesubdepartment = EmployeeSubDepartmentLocalServiceUtil.getEmployeeSubDepartment(employeeSubDepartmentId);
		        employeesubdepartment.setSubDepartmentName(employeeSubDepartmentModel.getSubDepartmentName());
		        employeesubdepartment.setEmployeeDepartmentId(employeeSubDepartmentModel.getEmployeeDepartmentId());
		        employeesubdepartment.setStatus(Boolean.valueOf(employeeSubDepartmentModel.getStatus()));
		        EmployeeSubDepartmentLocalServiceUtil.updateEmployeeSubDepartment(employeesubdepartment);
				SessionMessages.add(actionRequest.getPortletSession(),"subdepartment-update-success");
				LOG.info("sub department Update");
					
				}
			else {
				employeeSubDepartmentId = CounterLocalServiceUtil.increment(EmployeeSubDepartment.class.getName());
		        EmployeeSubDepartment employeesubdepartment = EmployeeSubDepartmentLocalServiceUtil.createEmployeeSubDepartment(employeeSubDepartmentId);
		        employeesubdepartment.setSubDepartmentName(employeeSubDepartmentModel.getSubDepartmentName());
		        employeesubdepartment.setEmployeeDepartmentId(employeeSubDepartmentModel.getEmployeeDepartmentId());
		        employeesubdepartment.setStatus(Boolean.valueOf(employeeSubDepartmentModel.getStatus()));
				EmployeeSubDepartmentLocalServiceUtil.addEmployeeSubDepartment(employeesubdepartment);
				SessionMessages.add(actionRequest.getPortletSession(),
							"subdepartment-add-success");
					LOG.info("sub department Save");
					
				}
			
		} catch (Exception e) {
			SessionErrors.add(actionRequest.getPortletSession(),
					"subdepartment-add-error");
			e.printStackTrace();
		}
	}
	

	
}