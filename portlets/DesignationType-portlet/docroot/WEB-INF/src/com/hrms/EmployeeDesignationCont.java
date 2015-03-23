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
import com.hrms.model.EmployeeDesignation;
import com.hrms.service.EmployeeDesignationLocalServiceUtil;



@Controller
@RequestMapping("VIEW")
public class EmployeeDesignationCont {
 
	private static final Log LOG = LogFactoryUtil
			.getLog(EmployeeDesignationCont.class);
	
	
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
			long employeeDesignationId = ParamUtil.getLong(request, "employeeDesignationId");
			request.setAttribute("employeeDesignationDetail", EmployeeDesignationLocalServiceUtil.getEmployeeDesignation(employeeDesignationId));
		} catch (Exception e) {
		}
		return "edit";
	}

	@ActionMapping(params = "action=addDesignation")
	public void addDesignation(@ModelAttribute(value ="employeeDesignation") EmployeeDesignationModel employeeDesignationModel, ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException, PortletException {
		try {
			
			long employeeDesignationId = ParamUtil.getLong(actionRequest, "employeeDesignationId");
			long status = ParamUtil.getLong(actionRequest, "status");
			
			if (employeeDesignationId != 0) {
				EmployeeDesignation employeedesignation = EmployeeDesignationLocalServiceUtil.getEmployeeDesignation(employeeDesignationId);
		        employeedesignation.setDesignationName(employeeDesignationModel.getDesignationName());
		        employeedesignation.setStatus(Boolean.valueOf(employeeDesignationModel.getStatus()));
				EmployeeDesignationLocalServiceUtil.updateEmployeeDesignation(employeedesignation);
				SessionMessages.add(actionRequest.getPortletSession(),"designation-update-success");
				LOG.info("designation Update");
					
						
					
				}
			else {
				employeeDesignationId = CounterLocalServiceUtil.increment(EmployeeDesignation.class.getName());
		        EmployeeDesignation employeedesignation = EmployeeDesignationLocalServiceUtil.createEmployeeDesignation(employeeDesignationId);
		        employeedesignation.setDesignationName(employeeDesignationModel.getDesignationName());
		        employeedesignation.setStatus(Boolean.valueOf(employeeDesignationModel.getStatus()));
		       
				EmployeeDesignationLocalServiceUtil.addEmployeeDesignation(employeedesignation);
				SessionMessages.add(actionRequest.getPortletSession(),
							"designation-add-success");
					LOG.info("designation Save");
					
				}
			
		} catch (Exception e) {
			SessionErrors.add(actionRequest.getPortletSession(),
					"designation-add-error");
			e.printStackTrace();
		}
	}
	
	
/*	@ActionMapping(params = "action=editDesignation")
	public void editDesignation(ActionRequest actionRequest,
			ActionResponse actionResponse, Model model) throws IOException,
			PortletException {
		
		try {
			
			long employeeDesignationId = ParamUtil.getLong(actionRequest, "editemployeeDesignationId");
			
			model.addAttribute("designationDetail",EmployeeDesignationLocalServiceUtil.getEmployeeDesignation(employeeDesignationId));
		} catch (Exception e) {
			SessionErrors.add(actionRequest.getPortletSession(),
					"designation-edit-error");
			e.printStackTrace();
		}
	}	

	*/
	
	
}