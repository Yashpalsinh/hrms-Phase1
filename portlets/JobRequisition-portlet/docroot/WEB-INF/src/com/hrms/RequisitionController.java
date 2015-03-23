package com.hrms;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.swing.JOptionPane;

import org.omg.PortableServer.Current;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;
import org.springframework.web.portlet.bind.annotation.ActionMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

import com.hrms.model.JobDetail;
import com.hrms.model.JobLibrary;
import com.hrms.model.impl.JobLibraryImpl;
import com.hrms.service.JobLibraryLocalServiceUtil;
import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.util.PortalUtil;

@Controller
@RequestMapping("VIEW")
public class RequisitionController {
	private static final Log LOG = LogFactoryUtil
			.getLog(JobLibrary.class);


	
	@RenderMapping
	public ModelAndView handleRenderRequest(RenderRequest request,
			RenderResponse response ) throws SystemException {
		System.out.println("handleRenderRequest");
		ModelAndView model = new ModelAndView("jobrequisitionview");
		List<JobLibrary> jobLibraryList = new ArrayList<JobLibrary>();
		jobLibraryList = JobLibraryLocalServiceUtil.getJobLibraries(0,JobLibraryLocalServiceUtil.getJobLibrariesCount() -1);
		model.addObject("jobLibraryList", jobLibraryList);
		return model;
	}
 
	@RenderMapping(params = "render=createJobRequisition")
	public String createJobRequisition(RenderRequest renderRequest,
			RenderResponse renderResponse, Model model) {
		System.out.println("createJobRequisition");

		return "createJobRequisition";
	}

	@ModelAttribute("reg")
	public JobLibrary getJobDetail() {
		System.out.println("JobLibraryImpl call ...");
		return new JobLibraryImpl();
	}

	@ActionMapping(params = "action=addRequisition")
	public void addRequisition(@ModelAttribute("reg") JobLibrary jobLibraryImpl,
			ActionRequest actionRequest, ActionResponse actionResponse)
			throws SystemException, PortalException {
		
		
		try
		{
			JobLibrary jb= new JobLibraryImpl();
			if(jobLibraryImpl.getJobTitle()!=null){
				jb=JobLibraryLocalServiceUtil.createJobLibrary(CounterLocalServiceUtil.increment(JobLibrary.class.getName()));
				
				jb.setEmployeeDepartmentId(jobLibraryImpl.getEmployeeDepartmentId());
				jb.setJobTitle(jobLibraryImpl.getJobTitle());
				jb.setJobDescription(jobLibraryImpl.getJobDescription());
				jb.setResponsibility(jobLibraryImpl.getResponsibility());
				jb.setQualifications(jobLibraryImpl.getQualifications());
				jb.setNumberOfPosition(jobLibraryImpl.getNumberOfPosition());
				jb.setExperience(jobLibraryImpl.getExperience());
				jb.setSalaryStartRange(jobLibraryImpl.getSalaryStartRange());
				jb.setSalaryEndRange(jobLibraryImpl.getSalaryEndRange());
				jb.setBenefits(jobLibraryImpl.getBenefits());
				jb.setReportsToId(jobLibraryImpl.getReportsToId());
				
			
				 Date date = new Date();
				    System.out.println(date);
				    	jb.setCreateDate(date);
				 
				 ServiceContext serviceContext = null;
				serviceContext = ServiceContextFactory.getInstance(
								JobLibrary.class.getName(), actionRequest);

				jb.setCreateBy(serviceContext.getUserId());
			
				JobLibraryLocalServiceUtil.addJobLibrary(jb);
				System.out.println(jobLibraryImpl.getJobTitle()+"--"+jobLibraryImpl.getJobDescription()+"--"+jb);
				SessionMessages.add(actionRequest.getPortletSession(),
						"jobLibarary-add-success");
				LOG.info("jobLibarary Save");
			}
		}
		catch(Exception e)
		{
			SessionErrors.add(actionRequest.getPortletSession(),
					"jobLibarary-add-error");
			e.printStackTrace();
		}
		
	}
	
	@ActionMapping(params = "action=updateRequisition")
	public void updateRequisition(@ModelAttribute("reg") JobLibrary jobLibraryImpl,ActionRequest actionRequest,
			ActionResponse actionResponse) throws PortalException,
			SystemException {
		try
		{
			JobLibrary jb= new JobLibraryImpl();
			
			long jobLibraryId = Long.parseLong(actionRequest
					.getParameter("jobLibraryId"));
			
			jb=JobLibraryLocalServiceUtil.getJobLibrary(jobLibraryId);
			jb.setEmployeeDepartmentId(jobLibraryImpl.getEmployeeDepartmentId());
			jb.setJobTitle(jobLibraryImpl.getJobTitle());
			jb.setJobDescription(jobLibraryImpl.getJobDescription());
			jb.setResponsibility(jobLibraryImpl.getResponsibility());
			jb.setQualifications(jobLibraryImpl.getQualifications());
			jb.setNumberOfPosition(jobLibraryImpl.getNumberOfPosition());
			jb.setExperience(jobLibraryImpl.getExperience());
			jb.setSalaryStartRange(jobLibraryImpl.getSalaryStartRange());
			jb.setSalaryEndRange(jobLibraryImpl.getSalaryEndRange());
			jb.setBenefits(jobLibraryImpl.getBenefits());
			jb.setReportsToId(jobLibraryImpl.getReportsToId());
			Date date = new Date();
		    System.out.println(date);
		    	jb.setModifiedDate(date);
		 
		 ServiceContext serviceContext = null;
		serviceContext = ServiceContextFactory.getInstance(
						JobLibrary.class.getName(), actionRequest);

		jb.setModifiedBy(serviceContext.getUserId());
			
			JobLibraryLocalServiceUtil.updateJobLibrary(jb);
			System.out.println(jobLibraryImpl.getJobTitle()+"--"+jobLibraryImpl.getJobDescription()+"--"+jb);
			SessionMessages.add(actionRequest.getPortletSession(),"jobLibrary-update-success");
			LOG.info("Update");
		}
		catch(Exception e)
		{
			SessionErrors.add(actionRequest.getPortletSession(),
					"jobLibrary-edit-error");
			e.printStackTrace();
		}
		
	}
	
	@RenderMapping(params = "render=editJobLibraryDisplay")
	public ModelAndView editRequisition(RenderRequest renderRequest,
			RenderResponse renderResponse) throws PortalException,
			SystemException {
		ModelAndView modelAndView = new ModelAndView("createJobRequisition");
		try
		{
			
			long jobLibraryId = ParamUtil.getLong(renderRequest, "jobLibraryId");
			JobLibrary joblibrary = JobLibraryLocalServiceUtil.getJobLibrary(jobLibraryId);
			System.out.println(joblibrary);
			modelAndView.addObject("joblibrary", joblibrary);
			
		}
		catch(Exception e)
		{}
		return modelAndView;
		
	}
	
	@RenderMapping(params = "render=viewJobLibrary")
	public ModelAndView viewJobLibrary(RenderRequest renderRequest,
			RenderResponse renderResponse) throws PortalException,
			SystemException {
		ModelAndView modelAndView = new ModelAndView("viewRequisition");
		try
		{
		long jobLibraryId = ParamUtil.getLong(renderRequest, "jobLibraryId");
		JobLibrary joblibrary = JobLibraryLocalServiceUtil.getJobLibrary(jobLibraryId);
		System.out.println(joblibrary);
		modelAndView.addObject("joblibrary", joblibrary);
		}
		catch(Exception e)
		{
			
		}
		return modelAndView;
	}
	
	@ActionMapping(params = "action=deleteJobLibrary")
	public void deleteJobLibrary(ActionRequest actionRequest,
			ActionResponse actionResponse) throws PortalException,
			SystemException {
		try
		{
		long jobLibraryId = ParamUtil.getLong(actionRequest, "jobLibraryId");
		System.out.println(jobLibraryId);
		JobLibraryLocalServiceUtil.deleteJobLibrary(jobLibraryId);
		System.out.println("deleted");
		SessionMessages.add(actionRequest.getPortletSession(),"jobLibrary-delete-success");
		LOG.info("Delete");
		}
		catch(Exception e)
		{
			SessionErrors.add(actionRequest.getPortletSession(),
					"jobLibrary-delete-error");
			e.printStackTrace();
		}
	}
	
}
