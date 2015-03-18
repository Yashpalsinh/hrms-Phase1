package com.hrms;

import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.ActionMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

import com.hrms.model.Leave;
import com.hrms.model.impl.LeaveImpl;
import com.hrms.service.LeaveLocalServiceUtil;
import com.hrms.service.LeaveServiceUtil;
import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.Http.Response;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portal.util.PortalUtil;

@Controller("LeaveManage")
@RequestMapping("VIEW")
public class LeaveManage{
	
	private static final Log LOG = LogFactoryUtil
			.getLog(Leave.class);
	
	@RequestMapping
	public String displayPage(RenderRequest request,RenderResponse response,Model model){
		try{
			System.out.println(" ren");
		}
		catch(Exception e){
			}
		return "display";
		
	}
	@RenderMapping(params="action=add")
	public String addLeave(RenderRequest request,RenderResponse response,Model model){
		try{
			System.out.println(" add ren");
		}
		catch(Exception e){
		}
		return "add";
		
	}
	@RenderMapping(params="action=displayURL")
	public String displayURL(RenderRequest request,RenderResponse response,Model model){
		try{
			System.out.println(" dis");
		}
		catch(Exception e){
			}
		return "display";
		
	}
	@RenderMapping(params="action=editleaveURL")
	public String editLeave(RenderRequest request,RenderResponse response,Model model){
		try{
			
		}
		catch(Exception e){
			
		}
		return "edit";
		
	}
	@RenderMapping(params="action=deleteleaveURL")
	public String deleteLeave(RenderRequest request,RenderResponse response,Model model){
		try{
			System.out.println(" del");
		}
		catch(Exception  e){
			
		}
		return "display";
		
	}
	@ModelAttribute("leave")
	public Leave getLeaveObject(){
		try{
			System.out.println("ModelAttribute" );
		}
		catch(Exception e){
			
		}
		return new LeaveImpl();
	}
	@ActionMapping(params="action=addURL")
	public void addURL(@ModelAttribute("leave") Leave leaveImpl,ActionRequest request,ActionResponse response) throws SystemException,PortletException, PortalException{
		//long leaveId=ParamUtil.getLong(request, "leaveId");
//		System.out.println("leaveName of leave is"+leaveImpl.getLeaveName());
		

		Leave l=new LeaveImpl();
		try{
			if(leaveImpl.getLeaveName()!=null)
			{
				long leaveId=CounterLocalServiceUtil.increment(LeaveImpl.class.getName());			
				l=LeaveLocalServiceUtil.createLeave(CounterLocalServiceUtil.increment(LeaveImpl.class.getName()));
				l.setLeaveName(leaveImpl.getLeaveName());
				l.setLeavesAllowedPerYear(leaveImpl.getLeavesAllowedPerYear());
				l.setLeaveType(leaveImpl.getLeaveType());
				l.setCarryOver(leaveImpl.getCarryOver());
				l.setEncachement(leaveImpl.getEncachement());
				l.setStatus(leaveImpl.getStatus());
				Date date = new Date();
				System.out.println(date);
				l.setCreateDate(date);
				ServiceContext serviceContext = null;
				serviceContext = ServiceContextFactory.getInstance(
				Leave.class.getName(),request);
				l.setCreateBy(serviceContext.getUserId());
		    	long createByuserId=l.getCreateBy();
		    	System.out.println(UserLocalServiceUtil.getUserById(createByuserId));
		    	LeaveLocalServiceUtil.addLeave(l);
		    	SessionMessages.add(request.getPortletSession(), "leave-added-successfully");
		    	LOG.info("add-leave");
			}
		}
		catch(Exception e){
			SessionMessages.add(request.getPortletSession(), "leave-add-error");
			e.printStackTrace();
		}
		response.setRenderParameter("action", "displayURL");
	}

	@ActionMapping(params="action=editURL")
	public void editURL(@ModelAttribute("leave") Leave leaveImpl,ActionRequest request,ActionResponse response) throws PortalException, SystemException{
//		System.out.println("edit");
				long ID=Long.parseLong(ParamUtil.getString(request, "ID"));
				//System.out.println("ID is--"+ID);
				long id=leaveImpl.getLeaveId();
				Leave l=LeaveLocalServiceUtil.getLeave(ID);
				System.out.println(" edit act");
			try{
				if(leaveImpl.getLeaveName()!=null)
				{
					System.out.println("ID is--"+ID);
						l.setLeaveName(leaveImpl.getLeaveName());
						l.setLeavesAllowedPerYear(leaveImpl.getLeavesAllowedPerYear());
						l.setLeaveType(leaveImpl.getLeaveType());
						l.setCarryOver(leaveImpl.getCarryOver());
						l.setEncachement(leaveImpl.getEncachement());
						l.setStatus(leaveImpl.getStatus());
						Date date = new Date();
						System.out.println(date);
						l.setModifiedDate(date);
						ServiceContext serviceContext = null;
						serviceContext = ServiceContextFactory.getInstance(
						Leave.class.getName(), request);

						l.setModifiedBy(serviceContext.getUserId());
						long modifiedByUserId=l.getModifiedBy();
						System.out.println(UserLocalServiceUtil.getUserById(modifiedByUserId));
						LeaveLocalServiceUtil.updateLeave(l);
						SessionMessages.add(request.getPortletSession(), "leave-update-successfully");
						LOG.info("leave-update");
				}
			}
			catch(Exception e){
				SessionMessages.add(request.getPortletSession(), "leave-update-error");
				e.printStackTrace();
			}
		response.setRenderParameter("action", "displayURL");
	}
	
	@ActionMapping(params="action=deleteleaveURL")
	public void deleteURL(@ModelAttribute("leave") Leave leaveImpl,ActionRequest request,ActionResponse response) throws SystemException, PortalException{
				long ID=Long.parseLong(ParamUtil.getString(request, "ID"));
				Leave l=LeaveLocalServiceUtil.getLeave(ID);
			try{
					if(leaveImpl.getLeaveName()!=null)
					{
						LeaveLocalServiceUtil.deleteLeave(l);
						SessionMessages.add(request.getPortletSession(), "leave-delete-successfully");
						LOG.info("delete-leave");
					}
				}
				catch(Exception e){
					SessionMessages.add(request.getPortletSession(), "leave-delete-error");
					e.printStackTrace();
				}
			response.setRenderParameter("action", "displayURL");
	}

}