package com.hrms;


import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.PortletSession;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.ActionMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.util.PortalUtil;
import com.hrms.model.EmployeeDepartment;
import com.hrms.service.EmployeeDepartmentLocalServiceUtil;



@Controller
@RequestMapping("VIEW")
public class EmployeeDepartmentCont {
 
	private static final Log LOG = LogFactoryUtil
			.getLog(EmployeeDepartmentCont.class);
	
	
	@RenderMapping
	public String defaultRender(RenderRequest request, RenderResponse response,
			Model model) throws SystemException {
		try {
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
	
		} catch (Exception e) {
		}
		return "add";
	}
	@RenderMapping(params="name=edit")
	public String editRender(RenderRequest request, RenderResponse response,
			Model model) throws SystemException {
		try {
			long employeeDepartmentId = ParamUtil.getLong(request, "employeeDepartmentId");
			request.setAttribute("employeeDepartmentDetail", EmployeeDepartmentLocalServiceUtil.getEmployeeDepartment(employeeDepartmentId));
		} catch (Exception e) {
		}
		return "edit";
	}

	@ActionMapping(params = "action=addDepartment")
	public void addDepartment(@ModelAttribute(value ="employeeDepartment") EmployeeDepartmentModel employeeDepartmentModel, ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException, PortletException {
		try {
			
			long employeeDepartmentId = ParamUtil.getLong(actionRequest, "employeeDepartmentId");
			long status = ParamUtil.getLong(actionRequest, "status");
			
			if (employeeDepartmentId != 0) {
				EmployeeDepartment employeedepartment = EmployeeDepartmentLocalServiceUtil.getEmployeeDepartment(employeeDepartmentId);
		        employeedepartment.setDepartmentName(employeeDepartmentModel.getDepartmentName());
		        employeedepartment.setStatus(Boolean.valueOf(employeeDepartmentModel.getStatus()));
				EmployeeDepartmentLocalServiceUtil.updateEmployeeDepartment(employeedepartment);
				SessionMessages.add(actionRequest.getPortletSession(),"department-update-success");
				LOG.info("department Update");
					
						
					
				}
			else {
				employeeDepartmentId = CounterLocalServiceUtil.increment(EmployeeDepartment.class.getName());
		        EmployeeDepartment employeedepartment = EmployeeDepartmentLocalServiceUtil.createEmployeeDepartment(employeeDepartmentId);
		        employeedepartment.setDepartmentName(employeeDepartmentModel.getDepartmentName());
		        employeedepartment.setStatus(Boolean.valueOf(employeeDepartmentModel.getStatus()));
		       
				EmployeeDepartmentLocalServiceUtil.addEmployeeDepartment(employeedepartment);
				SessionMessages.add(actionRequest.getPortletSession(),
							"department-add-success");
					LOG.info("department Save");
					
				}
			
		} catch (Exception e) {
			SessionErrors.add(actionRequest.getPortletSession(),
					"department-add-error");
			e.printStackTrace();
		}
	}
	
	
	@ActionMapping(params = "action=editDepartment")
	public void editDepartment(ActionRequest actionRequest,
			ActionResponse actionResponse, Model model) throws IOException,
			PortletException {
		
		try {
			
			long employeeDepartmentId = ParamUtil.getLong(actionRequest, "editemployeeDepartmentId");
			
			model.addAttribute("departmentDetail",EmployeeDepartmentLocalServiceUtil.getEmployeeDepartment(employeeDepartmentId));
		} catch (Exception e) {
			SessionErrors.add(actionRequest.getPortletSession(),
					"department-edit-error");
			e.printStackTrace();
		}
	}	

	
	
	
}