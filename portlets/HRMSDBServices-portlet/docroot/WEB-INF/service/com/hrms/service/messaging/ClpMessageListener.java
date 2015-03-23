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

package com.hrms.service.messaging;

import com.hrms.service.CandidateLocalServiceUtil;
import com.hrms.service.CandidateQualificationLocalServiceUtil;
import com.hrms.service.CandidateQualificationServiceUtil;
import com.hrms.service.CandidateServiceUtil;
import com.hrms.service.ClpSerializer;
import com.hrms.service.EmployeeAchivementLocalServiceUtil;
import com.hrms.service.EmployeeAchivementServiceUtil;
import com.hrms.service.EmployeeAttendanceLocalServiceUtil;
import com.hrms.service.EmployeeAttendanceServiceUtil;
import com.hrms.service.EmployeeComplaintLocalServiceUtil;
import com.hrms.service.EmployeeComplaintServiceUtil;
import com.hrms.service.EmployeeDepartmentLocalServiceUtil;
import com.hrms.service.EmployeeDepartmentServiceUtil;
import com.hrms.service.EmployeeDesignationLocalServiceUtil;
import com.hrms.service.EmployeeDesignationServiceUtil;
import com.hrms.service.EmployeeLanguageDetailLocalServiceUtil;
import com.hrms.service.EmployeeLanguageDetailServiceUtil;
import com.hrms.service.EmployeeLeaveLocalServiceUtil;
import com.hrms.service.EmployeeLeaveServiceUtil;
import com.hrms.service.EmployeeMasterLocalServiceUtil;
import com.hrms.service.EmployeeMasterServiceUtil;
import com.hrms.service.EmployeePreviousCompanyLocalServiceUtil;
import com.hrms.service.EmployeePreviousCompanyServiceUtil;
import com.hrms.service.EmployeeProofLocalServiceUtil;
import com.hrms.service.EmployeeProofServiceUtil;
import com.hrms.service.EmployeeQualificationLocalServiceUtil;
import com.hrms.service.EmployeeQualificationServiceUtil;
import com.hrms.service.EmployeeSubDepartmentLocalServiceUtil;
import com.hrms.service.EmployeeSubDepartmentServiceUtil;
import com.hrms.service.EmployeeTimesheetLocalServiceUtil;
import com.hrms.service.EmployeeTimesheetServiceUtil;
import com.hrms.service.EmployeeTypeLocalServiceUtil;
import com.hrms.service.EmployeeTypeServiceUtil;
import com.hrms.service.EmployeeWarningLocalServiceUtil;
import com.hrms.service.EmployeeWarningServiceUtil;
import com.hrms.service.InterviewLocalServiceUtil;
import com.hrms.service.InterviewServiceUtil;
import com.hrms.service.JobLibraryLocalServiceUtil;
import com.hrms.service.JobLibraryServiceUtil;
import com.hrms.service.LeaveLocalServiceUtil;
import com.hrms.service.LeaveServiceUtil;
import com.hrms.service.LeavesAppliedLocalServiceUtil;
import com.hrms.service.LeavesAppliedServiceUtil;
import com.hrms.service.OfferLocalServiceUtil;
import com.hrms.service.OfferServiceUtil;
import com.hrms.service.ProofLocalServiceUtil;
import com.hrms.service.ProofServiceUtil;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

/**
 * @author yashpalsinh
 */
public class ClpMessageListener extends BaseMessageListener {
	public static String getServletContextName() {
		return ClpSerializer.getServletContextName();
	}

	@Override
	protected void doReceive(Message message) throws Exception {
		String command = message.getString("command");
		String servletContextName = message.getString("servletContextName");

		if (command.equals("undeploy") &&
				servletContextName.equals(getServletContextName())) {
			CandidateLocalServiceUtil.clearService();

			CandidateServiceUtil.clearService();
			CandidateQualificationLocalServiceUtil.clearService();

			CandidateQualificationServiceUtil.clearService();
			EmployeeAchivementLocalServiceUtil.clearService();

			EmployeeAchivementServiceUtil.clearService();
			EmployeeAttendanceLocalServiceUtil.clearService();

			EmployeeAttendanceServiceUtil.clearService();
			EmployeeComplaintLocalServiceUtil.clearService();

			EmployeeComplaintServiceUtil.clearService();
			EmployeeDepartmentLocalServiceUtil.clearService();

			EmployeeDepartmentServiceUtil.clearService();
			EmployeeDesignationLocalServiceUtil.clearService();

			EmployeeDesignationServiceUtil.clearService();
			EmployeeLanguageDetailLocalServiceUtil.clearService();

			EmployeeLanguageDetailServiceUtil.clearService();
			EmployeeLeaveLocalServiceUtil.clearService();

			EmployeeLeaveServiceUtil.clearService();
			EmployeeMasterLocalServiceUtil.clearService();

			EmployeeMasterServiceUtil.clearService();
			EmployeePreviousCompanyLocalServiceUtil.clearService();

			EmployeePreviousCompanyServiceUtil.clearService();
			EmployeeProofLocalServiceUtil.clearService();

			EmployeeProofServiceUtil.clearService();
			EmployeeQualificationLocalServiceUtil.clearService();

			EmployeeQualificationServiceUtil.clearService();
			EmployeeSubDepartmentLocalServiceUtil.clearService();

			EmployeeSubDepartmentServiceUtil.clearService();
			EmployeeTimesheetLocalServiceUtil.clearService();

			EmployeeTimesheetServiceUtil.clearService();
			EmployeeTypeLocalServiceUtil.clearService();

			EmployeeTypeServiceUtil.clearService();
			EmployeeWarningLocalServiceUtil.clearService();

			EmployeeWarningServiceUtil.clearService();
			InterviewLocalServiceUtil.clearService();

			InterviewServiceUtil.clearService();
			JobLibraryLocalServiceUtil.clearService();

			JobLibraryServiceUtil.clearService();
			LeaveLocalServiceUtil.clearService();

			LeaveServiceUtil.clearService();
			LeavesAppliedLocalServiceUtil.clearService();

			LeavesAppliedServiceUtil.clearService();
			OfferLocalServiceUtil.clearService();

			OfferServiceUtil.clearService();
			ProofLocalServiceUtil.clearService();

			ProofServiceUtil.clearService();
		}
	}
}