package com.hrms;

import com.hrms.model.EmployeeDepartment;
import com.hrms.model.EmployeeMaster;
import com.hrms.model.EmployeeSubDepartment;
import com.hrms.service.EmployeeDepartmentLocalServiceUtil;
import com.hrms.service.EmployeeDesignationLocalServiceUtil;
import com.hrms.service.EmployeeSubDepartmentLocalServiceUtil;
import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.Company;
import com.liferay.portal.model.Group;
import com.liferay.portal.model.Role;
import com.liferay.portal.model.User;
import com.liferay.portal.model.UserGroup;
import com.liferay.portal.service.CompanyLocalServiceUtil;
import com.liferay.portal.service.CountryServiceUtil;
import com.liferay.portal.service.GroupLocalServiceUtil;
import com.liferay.portal.service.RoleLocalServiceUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.service.UserGroupLocalServiceUtil;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portal.service.UserServiceUtil;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.ActionMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;
import org.springframework.web.portlet.bind.annotation.ResourceMapping;

@Controller
@RequestMapping("VIEW")
public class EmployeeRegistrationCont {

	private static final Log LOG = LogFactoryUtil
			.getLog(EmployeeRegistrationCont.class);

	@RenderMapping
	public String defaultRender(RenderRequest request, RenderResponse response,
			Model model) throws SystemException {
		try {

		} catch (Exception e) {
		}
		return "view";
	}

	@RenderMapping(params = "name=add")
	public String addRender(RenderRequest request, RenderResponse response,
			Model model) throws SystemException {
		try {
			boolean dept = true;
			model.addAttribute("departmentList",
					EmployeeDepartmentLocalServiceUtil.findByStatus(dept));
			model.addAttribute("designationList",
					EmployeeDesignationLocalServiceUtil.findByStatus(dept));
			List<Company> companies = CompanyLocalServiceUtil.getCompanies();
			for (Company company : companies) {
				List<Role> roles = RoleLocalServiceUtil.getRoles(company
						.getCompanyId());
				for (Role role : roles) {
					if (role.getName().equals("HR")) {
						model.addAttribute("recruitedByList",
								UserLocalServiceUtil.getRoleUsers(role
										.getRoleId()));
					}
				}
			}

		} catch (Exception e) {
		}
		return "add";
	}

	@ResourceMapping(value = "rendershowsubdep")
	public void getMyInformation(ResourceRequest request,
			ResourceResponse response) throws IOException {

		try {
			HttpServletRequest httpServletRequest = PortalUtil
					.getOriginalServletRequest(PortalUtil
							.getHttpServletRequest(request));
			boolean dept = true;
			long employeeSubDepartmentId = ParamUtil.getLong(request,
					"employeeSubDepartmentId");
			response.setCharacterEncoding("UTF-8");
			List<EmployeeSubDepartment> findByDeptAndStatus = EmployeeSubDepartmentLocalServiceUtil
					.findByDeptAndStatus(employeeSubDepartmentId, dept);
			JSONObject responseDetailsJson = JSONFactoryUtil.createJSONObject();
			JSONArray jsonArray = JSONFactoryUtil.createJSONArray();
			for (EmployeeSubDepartment r : findByDeptAndStatus) {
				JSONObject formDetailsJson = JSONFactoryUtil.createJSONObject();
				formDetailsJson.put("subDepId", r.getEmployeeSubDepartmentId());
				formDetailsJson.put("subDepName", r.getSubDepartmentName());
				jsonArray.put(formDetailsJson);
			}
			responseDetailsJson.put("data", jsonArray);
			response.getWriter().write(responseDetailsJson.toString());

		} catch (Exception e) {
		}

	}

	@ActionMapping(params = "action=addEmployee")
	public void addEmployee(@ModelAttribute(value ="employeeRegistration") EmployeeRegistrationModel employeeRegistrationModel, ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException, PortletException {
		try {

			long userId = ParamUtil.getLong(actionRequest, "userId");
			HttpServletRequest request = PortalUtil.getHttpServletRequest(
					actionRequest);
			HttpSession session = request.getSession();
			long fbId=0;
			long[] groupIds = null;
			long[] organizationIds = null;
			long[] roleIds = null;
			long[] userGroupIds = null;
			ThemeDisplay themeDisplay = (ThemeDisplay)actionRequest.getAttribute(
					WebKeys.THEME_DISPLAY);

			ServiceContext serviceContext = ServiceContextFactory.getInstance(
					User.class.getName(), actionRequest);
			Company company = (Company) themeDisplay.getCompany();

			EmployeeMaster em;
			if (userId != 0) {
				/*User user = UserLocalServiceUtil.getUser(userId);
					user.setDepartmentName(employeeDepartmentModel.getDepartmentName());
			        employeedepartment.setStatus(Boolean.valueOf(employeeDepartmentModel.getStatus()));
					EmployeeDepartmentLocalServiceUtil.updateEmployeeDepartment(employeedepartment);
					SessionMessages.add(actionRequest.getPortletSession(),"department-update-success");*/
				LOG.info("department Update");



			}
			else {	System.out.println(employeeRegistrationModel.getPassword1()+" "+employeeRegistrationModel.getScreenName());
				User user = UserServiceUtil.addUserWithWorkflow(
						company.getCompanyId(), false, employeeRegistrationModel.getPassword1(),employeeRegistrationModel.getPassword2(),
						false, employeeRegistrationModel.getScreenName(),employeeRegistrationModel.getEmailAddress(), fbId,"",
						(Locale) themeDisplay.getLocale(), employeeRegistrationModel.getFirstName(),employeeRegistrationModel.getMiddleName(), employeeRegistrationModel.getLastName(), 0,
						0,employeeRegistrationModel.isGender(), employeeRegistrationModel.getBirthdayMonth(),employeeRegistrationModel.getBirthdayDay(),employeeRegistrationModel.getBirthdayYear(), "",
						groupIds, organizationIds, roleIds, userGroupIds, false,
						serviceContext);
				SessionMessages.add(actionRequest.getPortletSession(),
						"department-add-success");
				LOG.info("department Save"+employeeRegistrationModel.isGender());

			}

		} catch (Exception e) {
			SessionErrors.add(actionRequest.getPortletSession(),
					"department-add-error");
			e.printStackTrace();
		}
	}
}
