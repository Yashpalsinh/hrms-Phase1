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

package com.hrms.service;

import com.hrms.model.CandidateClp;
import com.hrms.model.CandidateQualificationClp;
import com.hrms.model.EmployeeAchivementClp;
import com.hrms.model.EmployeeAttendanceClp;
import com.hrms.model.EmployeeComplaintClp;
import com.hrms.model.EmployeeDepartmentClp;
import com.hrms.model.EmployeeDesignationClp;
import com.hrms.model.EmployeeLanguageDetailClp;
import com.hrms.model.EmployeeLeaveClp;
import com.hrms.model.EmployeeMasterClp;
import com.hrms.model.EmployeePreviousCompanyClp;
import com.hrms.model.EmployeeProofClp;
import com.hrms.model.EmployeeQualificationClp;
import com.hrms.model.EmployeeSubDepartmentClp;
import com.hrms.model.EmployeeTimesheetClp;
import com.hrms.model.EmployeeTypeClp;
import com.hrms.model.EmployeeWarningClp;
import com.hrms.model.InterviewClp;
import com.hrms.model.JobLibraryClp;
import com.hrms.model.LeaveClp;
import com.hrms.model.LeavesAppliedClp;
import com.hrms.model.OfferClp;
import com.hrms.model.ProofClp;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.io.unsync.UnsyncByteArrayInputStream;
import com.liferay.portal.kernel.io.unsync.UnsyncByteArrayOutputStream;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ClassLoaderObjectInputStream;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.BaseModel;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.lang.reflect.Method;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yashpalsinh
 */
public class ClpSerializer {
	public static String getServletContextName() {
		if (Validator.isNotNull(_servletContextName)) {
			return _servletContextName;
		}

		synchronized (ClpSerializer.class) {
			if (Validator.isNotNull(_servletContextName)) {
				return _servletContextName;
			}

			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Class<?> portletPropsClass = classLoader.loadClass(
						"com.liferay.util.portlet.PortletProps");

				Method getMethod = portletPropsClass.getMethod("get",
						new Class<?>[] { String.class });

				String portletPropsServletContextName = (String)getMethod.invoke(null,
						"HRMSDBServices-portlet-deployment-context");

				if (Validator.isNotNull(portletPropsServletContextName)) {
					_servletContextName = portletPropsServletContextName;
				}
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info(
						"Unable to locate deployment context from portlet properties");
				}
			}

			if (Validator.isNull(_servletContextName)) {
				try {
					String propsUtilServletContextName = PropsUtil.get(
							"HRMSDBServices-portlet-deployment-context");

					if (Validator.isNotNull(propsUtilServletContextName)) {
						_servletContextName = propsUtilServletContextName;
					}
				}
				catch (Throwable t) {
					if (_log.isInfoEnabled()) {
						_log.info(
							"Unable to locate deployment context from portal properties");
					}
				}
			}

			if (Validator.isNull(_servletContextName)) {
				_servletContextName = "HRMSDBServices-portlet";
			}

			return _servletContextName;
		}
	}

	public static Object translateInput(BaseModel<?> oldModel) {
		Class<?> oldModelClass = oldModel.getClass();

		String oldModelClassName = oldModelClass.getName();

		if (oldModelClassName.equals(CandidateClp.class.getName())) {
			return translateInputCandidate(oldModel);
		}

		if (oldModelClassName.equals(CandidateQualificationClp.class.getName())) {
			return translateInputCandidateQualification(oldModel);
		}

		if (oldModelClassName.equals(EmployeeAchivementClp.class.getName())) {
			return translateInputEmployeeAchivement(oldModel);
		}

		if (oldModelClassName.equals(EmployeeAttendanceClp.class.getName())) {
			return translateInputEmployeeAttendance(oldModel);
		}

		if (oldModelClassName.equals(EmployeeComplaintClp.class.getName())) {
			return translateInputEmployeeComplaint(oldModel);
		}

		if (oldModelClassName.equals(EmployeeDepartmentClp.class.getName())) {
			return translateInputEmployeeDepartment(oldModel);
		}

		if (oldModelClassName.equals(EmployeeDesignationClp.class.getName())) {
			return translateInputEmployeeDesignation(oldModel);
		}

		if (oldModelClassName.equals(EmployeeLanguageDetailClp.class.getName())) {
			return translateInputEmployeeLanguageDetail(oldModel);
		}

		if (oldModelClassName.equals(EmployeeLeaveClp.class.getName())) {
			return translateInputEmployeeLeave(oldModel);
		}

		if (oldModelClassName.equals(EmployeeMasterClp.class.getName())) {
			return translateInputEmployeeMaster(oldModel);
		}

		if (oldModelClassName.equals(EmployeePreviousCompanyClp.class.getName())) {
			return translateInputEmployeePreviousCompany(oldModel);
		}

		if (oldModelClassName.equals(EmployeeProofClp.class.getName())) {
			return translateInputEmployeeProof(oldModel);
		}

		if (oldModelClassName.equals(EmployeeQualificationClp.class.getName())) {
			return translateInputEmployeeQualification(oldModel);
		}

		if (oldModelClassName.equals(EmployeeSubDepartmentClp.class.getName())) {
			return translateInputEmployeeSubDepartment(oldModel);
		}

		if (oldModelClassName.equals(EmployeeTimesheetClp.class.getName())) {
			return translateInputEmployeeTimesheet(oldModel);
		}

		if (oldModelClassName.equals(EmployeeTypeClp.class.getName())) {
			return translateInputEmployeeType(oldModel);
		}

		if (oldModelClassName.equals(EmployeeWarningClp.class.getName())) {
			return translateInputEmployeeWarning(oldModel);
		}

		if (oldModelClassName.equals(InterviewClp.class.getName())) {
			return translateInputInterview(oldModel);
		}

		if (oldModelClassName.equals(JobLibraryClp.class.getName())) {
			return translateInputJobLibrary(oldModel);
		}

		if (oldModelClassName.equals(LeaveClp.class.getName())) {
			return translateInputLeave(oldModel);
		}

		if (oldModelClassName.equals(LeavesAppliedClp.class.getName())) {
			return translateInputLeavesApplied(oldModel);
		}

		if (oldModelClassName.equals(OfferClp.class.getName())) {
			return translateInputOffer(oldModel);
		}

		if (oldModelClassName.equals(ProofClp.class.getName())) {
			return translateInputProof(oldModel);
		}

		return oldModel;
	}

	public static Object translateInput(List<Object> oldList) {
		List<Object> newList = new ArrayList<Object>(oldList.size());

		for (int i = 0; i < oldList.size(); i++) {
			Object curObj = oldList.get(i);

			newList.add(translateInput(curObj));
		}

		return newList;
	}

	public static Object translateInputCandidate(BaseModel<?> oldModel) {
		CandidateClp oldClpModel = (CandidateClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getCandidateRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputCandidateQualification(
		BaseModel<?> oldModel) {
		CandidateQualificationClp oldClpModel = (CandidateQualificationClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getCandidateQualificationRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputEmployeeAchivement(BaseModel<?> oldModel) {
		EmployeeAchivementClp oldClpModel = (EmployeeAchivementClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getEmployeeAchivementRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputEmployeeAttendance(BaseModel<?> oldModel) {
		EmployeeAttendanceClp oldClpModel = (EmployeeAttendanceClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getEmployeeAttendanceRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputEmployeeComplaint(BaseModel<?> oldModel) {
		EmployeeComplaintClp oldClpModel = (EmployeeComplaintClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getEmployeeComplaintRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputEmployeeDepartment(BaseModel<?> oldModel) {
		EmployeeDepartmentClp oldClpModel = (EmployeeDepartmentClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getEmployeeDepartmentRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputEmployeeDesignation(
		BaseModel<?> oldModel) {
		EmployeeDesignationClp oldClpModel = (EmployeeDesignationClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getEmployeeDesignationRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputEmployeeLanguageDetail(
		BaseModel<?> oldModel) {
		EmployeeLanguageDetailClp oldClpModel = (EmployeeLanguageDetailClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getEmployeeLanguageDetailRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputEmployeeLeave(BaseModel<?> oldModel) {
		EmployeeLeaveClp oldClpModel = (EmployeeLeaveClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getEmployeeLeaveRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputEmployeeMaster(BaseModel<?> oldModel) {
		EmployeeMasterClp oldClpModel = (EmployeeMasterClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getEmployeeMasterRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputEmployeePreviousCompany(
		BaseModel<?> oldModel) {
		EmployeePreviousCompanyClp oldClpModel = (EmployeePreviousCompanyClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getEmployeePreviousCompanyRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputEmployeeProof(BaseModel<?> oldModel) {
		EmployeeProofClp oldClpModel = (EmployeeProofClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getEmployeeProofRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputEmployeeQualification(
		BaseModel<?> oldModel) {
		EmployeeQualificationClp oldClpModel = (EmployeeQualificationClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getEmployeeQualificationRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputEmployeeSubDepartment(
		BaseModel<?> oldModel) {
		EmployeeSubDepartmentClp oldClpModel = (EmployeeSubDepartmentClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getEmployeeSubDepartmentRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputEmployeeTimesheet(BaseModel<?> oldModel) {
		EmployeeTimesheetClp oldClpModel = (EmployeeTimesheetClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getEmployeeTimesheetRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputEmployeeType(BaseModel<?> oldModel) {
		EmployeeTypeClp oldClpModel = (EmployeeTypeClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getEmployeeTypeRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputEmployeeWarning(BaseModel<?> oldModel) {
		EmployeeWarningClp oldClpModel = (EmployeeWarningClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getEmployeeWarningRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputInterview(BaseModel<?> oldModel) {
		InterviewClp oldClpModel = (InterviewClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getInterviewRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputJobLibrary(BaseModel<?> oldModel) {
		JobLibraryClp oldClpModel = (JobLibraryClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getJobLibraryRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputLeave(BaseModel<?> oldModel) {
		LeaveClp oldClpModel = (LeaveClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getLeaveRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputLeavesApplied(BaseModel<?> oldModel) {
		LeavesAppliedClp oldClpModel = (LeavesAppliedClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getLeavesAppliedRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputOffer(BaseModel<?> oldModel) {
		OfferClp oldClpModel = (OfferClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getOfferRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputProof(BaseModel<?> oldModel) {
		ProofClp oldClpModel = (ProofClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getProofRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInput(Object obj) {
		if (obj instanceof BaseModel<?>) {
			return translateInput((BaseModel<?>)obj);
		}
		else if (obj instanceof List<?>) {
			return translateInput((List<Object>)obj);
		}
		else {
			return obj;
		}
	}

	public static Object translateOutput(BaseModel<?> oldModel) {
		Class<?> oldModelClass = oldModel.getClass();

		String oldModelClassName = oldModelClass.getName();

		if (oldModelClassName.equals("com.hrms.model.impl.CandidateImpl")) {
			return translateOutputCandidate(oldModel);
		}

		if (oldModelClassName.equals(
					"com.hrms.model.impl.CandidateQualificationImpl")) {
			return translateOutputCandidateQualification(oldModel);
		}

		if (oldModelClassName.equals(
					"com.hrms.model.impl.EmployeeAchivementImpl")) {
			return translateOutputEmployeeAchivement(oldModel);
		}

		if (oldModelClassName.equals(
					"com.hrms.model.impl.EmployeeAttendanceImpl")) {
			return translateOutputEmployeeAttendance(oldModel);
		}

		if (oldModelClassName.equals(
					"com.hrms.model.impl.EmployeeComplaintImpl")) {
			return translateOutputEmployeeComplaint(oldModel);
		}

		if (oldModelClassName.equals(
					"com.hrms.model.impl.EmployeeDepartmentImpl")) {
			return translateOutputEmployeeDepartment(oldModel);
		}

		if (oldModelClassName.equals(
					"com.hrms.model.impl.EmployeeDesignationImpl")) {
			return translateOutputEmployeeDesignation(oldModel);
		}

		if (oldModelClassName.equals(
					"com.hrms.model.impl.EmployeeLanguageDetailImpl")) {
			return translateOutputEmployeeLanguageDetail(oldModel);
		}

		if (oldModelClassName.equals("com.hrms.model.impl.EmployeeLeaveImpl")) {
			return translateOutputEmployeeLeave(oldModel);
		}

		if (oldModelClassName.equals("com.hrms.model.impl.EmployeeMasterImpl")) {
			return translateOutputEmployeeMaster(oldModel);
		}

		if (oldModelClassName.equals(
					"com.hrms.model.impl.EmployeePreviousCompanyImpl")) {
			return translateOutputEmployeePreviousCompany(oldModel);
		}

		if (oldModelClassName.equals("com.hrms.model.impl.EmployeeProofImpl")) {
			return translateOutputEmployeeProof(oldModel);
		}

		if (oldModelClassName.equals(
					"com.hrms.model.impl.EmployeeQualificationImpl")) {
			return translateOutputEmployeeQualification(oldModel);
		}

		if (oldModelClassName.equals(
					"com.hrms.model.impl.EmployeeSubDepartmentImpl")) {
			return translateOutputEmployeeSubDepartment(oldModel);
		}

		if (oldModelClassName.equals(
					"com.hrms.model.impl.EmployeeTimesheetImpl")) {
			return translateOutputEmployeeTimesheet(oldModel);
		}

		if (oldModelClassName.equals("com.hrms.model.impl.EmployeeTypeImpl")) {
			return translateOutputEmployeeType(oldModel);
		}

		if (oldModelClassName.equals("com.hrms.model.impl.EmployeeWarningImpl")) {
			return translateOutputEmployeeWarning(oldModel);
		}

		if (oldModelClassName.equals("com.hrms.model.impl.InterviewImpl")) {
			return translateOutputInterview(oldModel);
		}

		if (oldModelClassName.equals("com.hrms.model.impl.JobLibraryImpl")) {
			return translateOutputJobLibrary(oldModel);
		}

		if (oldModelClassName.equals("com.hrms.model.impl.LeaveImpl")) {
			return translateOutputLeave(oldModel);
		}

		if (oldModelClassName.equals("com.hrms.model.impl.LeavesAppliedImpl")) {
			return translateOutputLeavesApplied(oldModel);
		}

		if (oldModelClassName.equals("com.hrms.model.impl.OfferImpl")) {
			return translateOutputOffer(oldModel);
		}

		if (oldModelClassName.equals("com.hrms.model.impl.ProofImpl")) {
			return translateOutputProof(oldModel);
		}

		return oldModel;
	}

	public static Object translateOutput(List<Object> oldList) {
		List<Object> newList = new ArrayList<Object>(oldList.size());

		for (int i = 0; i < oldList.size(); i++) {
			Object curObj = oldList.get(i);

			newList.add(translateOutput(curObj));
		}

		return newList;
	}

	public static Object translateOutput(Object obj) {
		if (obj instanceof BaseModel<?>) {
			return translateOutput((BaseModel<?>)obj);
		}
		else if (obj instanceof List<?>) {
			return translateOutput((List<Object>)obj);
		}
		else {
			return obj;
		}
	}

	public static Throwable translateThrowable(Throwable throwable) {
		if (_useReflectionToTranslateThrowable) {
			try {
				UnsyncByteArrayOutputStream unsyncByteArrayOutputStream = new UnsyncByteArrayOutputStream();
				ObjectOutputStream objectOutputStream = new ObjectOutputStream(unsyncByteArrayOutputStream);

				objectOutputStream.writeObject(throwable);

				objectOutputStream.flush();
				objectOutputStream.close();

				UnsyncByteArrayInputStream unsyncByteArrayInputStream = new UnsyncByteArrayInputStream(unsyncByteArrayOutputStream.unsafeGetByteArray(),
						0, unsyncByteArrayOutputStream.size());

				Thread currentThread = Thread.currentThread();

				ClassLoader contextClassLoader = currentThread.getContextClassLoader();

				ObjectInputStream objectInputStream = new ClassLoaderObjectInputStream(unsyncByteArrayInputStream,
						contextClassLoader);

				throwable = (Throwable)objectInputStream.readObject();

				objectInputStream.close();

				return throwable;
			}
			catch (SecurityException se) {
				if (_log.isInfoEnabled()) {
					_log.info("Do not use reflection to translate throwable");
				}

				_useReflectionToTranslateThrowable = false;
			}
			catch (Throwable throwable2) {
				_log.error(throwable2, throwable2);

				return throwable2;
			}
		}

		Class<?> clazz = throwable.getClass();

		String className = clazz.getName();

		if (className.equals(PortalException.class.getName())) {
			return new PortalException();
		}

		if (className.equals(SystemException.class.getName())) {
			return new SystemException();
		}

		if (className.equals("com.hrms.NoSuchCandidateException")) {
			return new com.hrms.NoSuchCandidateException();
		}

		if (className.equals("com.hrms.NoSuchCandidateQualificationException")) {
			return new com.hrms.NoSuchCandidateQualificationException();
		}

		if (className.equals("com.hrms.NoSuchEmployeeAchivementException")) {
			return new com.hrms.NoSuchEmployeeAchivementException();
		}

		if (className.equals("com.hrms.NoSuchEmployeeAttendanceException")) {
			return new com.hrms.NoSuchEmployeeAttendanceException();
		}

		if (className.equals("com.hrms.NoSuchEmployeeComplaintException")) {
			return new com.hrms.NoSuchEmployeeComplaintException();
		}

		if (className.equals("com.hrms.NoSuchEmployeeDepartmentException")) {
			return new com.hrms.NoSuchEmployeeDepartmentException();
		}

		if (className.equals("com.hrms.NoSuchEmployeeDesignationException")) {
			return new com.hrms.NoSuchEmployeeDesignationException();
		}

		if (className.equals("com.hrms.NoSuchEmployeeLanguageDetailException")) {
			return new com.hrms.NoSuchEmployeeLanguageDetailException();
		}

		if (className.equals("com.hrms.NoSuchEmployeeLeaveException")) {
			return new com.hrms.NoSuchEmployeeLeaveException();
		}

		if (className.equals("com.hrms.NoSuchEmployeeMasterException")) {
			return new com.hrms.NoSuchEmployeeMasterException();
		}

		if (className.equals("com.hrms.NoSuchEmployeePreviousCompanyException")) {
			return new com.hrms.NoSuchEmployeePreviousCompanyException();
		}

		if (className.equals("com.hrms.NoSuchEmployeeProofException")) {
			return new com.hrms.NoSuchEmployeeProofException();
		}

		if (className.equals("com.hrms.NoSuchEmployeeQualificationException")) {
			return new com.hrms.NoSuchEmployeeQualificationException();
		}

		if (className.equals("com.hrms.NoSuchEmployeeSubDepartmentException")) {
			return new com.hrms.NoSuchEmployeeSubDepartmentException();
		}

		if (className.equals("com.hrms.NoSuchEmployeeTimesheetException")) {
			return new com.hrms.NoSuchEmployeeTimesheetException();
		}

		if (className.equals("com.hrms.NoSuchEmployeeTypeException")) {
			return new com.hrms.NoSuchEmployeeTypeException();
		}

		if (className.equals("com.hrms.NoSuchEmployeeWarningException")) {
			return new com.hrms.NoSuchEmployeeWarningException();
		}

		if (className.equals("com.hrms.NoSuchInterviewException")) {
			return new com.hrms.NoSuchInterviewException();
		}

		if (className.equals("com.hrms.NoSuchJobLibraryException")) {
			return new com.hrms.NoSuchJobLibraryException();
		}

		if (className.equals("com.hrms.NoSuchLeaveException")) {
			return new com.hrms.NoSuchLeaveException();
		}

		if (className.equals("com.hrms.NoSuchLeavesAppliedException")) {
			return new com.hrms.NoSuchLeavesAppliedException();
		}

		if (className.equals("com.hrms.NoSuchOfferException")) {
			return new com.hrms.NoSuchOfferException();
		}

		if (className.equals("com.hrms.NoSuchProofException")) {
			return new com.hrms.NoSuchProofException();
		}

		return throwable;
	}

	public static Object translateOutputCandidate(BaseModel<?> oldModel) {
		CandidateClp newModel = new CandidateClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setCandidateRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputCandidateQualification(
		BaseModel<?> oldModel) {
		CandidateQualificationClp newModel = new CandidateQualificationClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setCandidateQualificationRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputEmployeeAchivement(
		BaseModel<?> oldModel) {
		EmployeeAchivementClp newModel = new EmployeeAchivementClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setEmployeeAchivementRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputEmployeeAttendance(
		BaseModel<?> oldModel) {
		EmployeeAttendanceClp newModel = new EmployeeAttendanceClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setEmployeeAttendanceRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputEmployeeComplaint(BaseModel<?> oldModel) {
		EmployeeComplaintClp newModel = new EmployeeComplaintClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setEmployeeComplaintRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputEmployeeDepartment(
		BaseModel<?> oldModel) {
		EmployeeDepartmentClp newModel = new EmployeeDepartmentClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setEmployeeDepartmentRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputEmployeeDesignation(
		BaseModel<?> oldModel) {
		EmployeeDesignationClp newModel = new EmployeeDesignationClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setEmployeeDesignationRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputEmployeeLanguageDetail(
		BaseModel<?> oldModel) {
		EmployeeLanguageDetailClp newModel = new EmployeeLanguageDetailClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setEmployeeLanguageDetailRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputEmployeeLeave(BaseModel<?> oldModel) {
		EmployeeLeaveClp newModel = new EmployeeLeaveClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setEmployeeLeaveRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputEmployeeMaster(BaseModel<?> oldModel) {
		EmployeeMasterClp newModel = new EmployeeMasterClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setEmployeeMasterRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputEmployeePreviousCompany(
		BaseModel<?> oldModel) {
		EmployeePreviousCompanyClp newModel = new EmployeePreviousCompanyClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setEmployeePreviousCompanyRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputEmployeeProof(BaseModel<?> oldModel) {
		EmployeeProofClp newModel = new EmployeeProofClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setEmployeeProofRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputEmployeeQualification(
		BaseModel<?> oldModel) {
		EmployeeQualificationClp newModel = new EmployeeQualificationClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setEmployeeQualificationRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputEmployeeSubDepartment(
		BaseModel<?> oldModel) {
		EmployeeSubDepartmentClp newModel = new EmployeeSubDepartmentClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setEmployeeSubDepartmentRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputEmployeeTimesheet(BaseModel<?> oldModel) {
		EmployeeTimesheetClp newModel = new EmployeeTimesheetClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setEmployeeTimesheetRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputEmployeeType(BaseModel<?> oldModel) {
		EmployeeTypeClp newModel = new EmployeeTypeClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setEmployeeTypeRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputEmployeeWarning(BaseModel<?> oldModel) {
		EmployeeWarningClp newModel = new EmployeeWarningClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setEmployeeWarningRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputInterview(BaseModel<?> oldModel) {
		InterviewClp newModel = new InterviewClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setInterviewRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputJobLibrary(BaseModel<?> oldModel) {
		JobLibraryClp newModel = new JobLibraryClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setJobLibraryRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputLeave(BaseModel<?> oldModel) {
		LeaveClp newModel = new LeaveClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setLeaveRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputLeavesApplied(BaseModel<?> oldModel) {
		LeavesAppliedClp newModel = new LeavesAppliedClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setLeavesAppliedRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputOffer(BaseModel<?> oldModel) {
		OfferClp newModel = new OfferClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setOfferRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputProof(BaseModel<?> oldModel) {
		ProofClp newModel = new ProofClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setProofRemoteModel(oldModel);

		return newModel;
	}

	private static Log _log = LogFactoryUtil.getLog(ClpSerializer.class);
	private static String _servletContextName;
	private static boolean _useReflectionToTranslateThrowable = true;
}