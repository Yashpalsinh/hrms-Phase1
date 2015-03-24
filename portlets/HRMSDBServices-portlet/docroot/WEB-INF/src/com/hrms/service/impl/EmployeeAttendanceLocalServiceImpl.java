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

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import com.hrms.model.EmployeeAttendance;
import com.hrms.model.EmployeeTimesheet;
import com.hrms.service.base.EmployeeAttendanceLocalServiceBaseImpl;
import com.liferay.portal.kernel.dao.orm.Criterion;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.User;

/**
 * The implementation of the employee attendance local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.hrms.service.EmployeeAttendanceLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author bhavik
 * @see com.hrms.service.base.EmployeeAttendanceLocalServiceBaseImpl
 * @see com.hrms.service.EmployeeAttendanceLocalServiceUtil
 */
public class EmployeeAttendanceLocalServiceImpl extends
		EmployeeAttendanceLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 * 
	 * Never reference this interface directly. Always use {@link
	 * com.hrms.service.EmployeeAttendanceLocalServiceUtil} to access the
	 * employee attendance local service.
	 */

	public void manageAttendance(EmployeeTimesheet employeeTimesheet)
			throws SystemException {
		List<EmployeeAttendance> employeeAttendanceList = null;
		try {
			employeeAttendanceList = getEmployeeAttendanceByDate(employeeTimesheet);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		EmployeeAttendance employeeAttendance = null;
		if (employeeAttendanceList.size() > 0) {
			employeeAttendance = employeeAttendanceList.get(0);
			employeeAttendance.setModifiedDate(new Date());
			employeeAttendance.setModifiedBy(employeeTimesheet.getUserId());

		} else {
			employeeAttendance = employeeAttendanceLocalService
					.createEmployeeAttendance(counterLocalService
							.increment(EmployeeAttendance.class.getName()));
			employeeAttendance.setAttendanceDate(employeeTimesheet
					.getTaskDate());
			employeeAttendance.setCompanyId(employeeTimesheet.getCompanyId());
			employeeAttendance.setGroupId(employeeTimesheet.getGroupId());
			employeeAttendance.setUserId(employeeTimesheet.getUserId());
			employeeAttendance.setSigninTime(employeeTimesheet
					.getTaskStarttime());
			employeeAttendance.setCreateBy(employeeTimesheet.getCreateBy());
			employeeAttendance.setCreateDate(employeeTimesheet.getCreateDate());
		}

		Date startTime = employeeAttendance.getSigninTime();
		Date endTime = employeeTimesheet.getTaskEndtime();
		employeeAttendance.setSignoutTime(endTime);
		double timeDifference = ((double) (endTime.getTime() - startTime
				.getTime()) / (1000 * 60 * 60));
		DecimalFormat decimalFormat = new DecimalFormat("#####.##");
		employeeAttendance.setTotalTime(Double.valueOf(decimalFormat
				.format(timeDifference)));

		if (employeeAttendanceList.size() > 0)
			employeeAttendanceLocalService
					.updateEmployeeAttendance(employeeAttendance);
		else
			employeeAttendanceLocalService
					.addEmployeeAttendance(employeeAttendance);
	}

	public List getEmployeeAttendanceByDate(EmployeeTimesheet employeeTimesheet)
			throws SystemException, ParseException {

		Date taskDate = employeeTimesheet.getTaskDate();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd",
				Locale.ENGLISH);
		DynamicQuery query = DynamicQueryFactoryUtil
				.forClass(EmployeeAttendance.class);
		Criterion criteria = RestrictionsFactoryUtil.eq("attendanceDate",
				formatter.parse(formatter.format(taskDate)));
		query.add(criteria);
		List<EmployeeAttendance> employeeAttendanceList = dynamicQuery(query);
		return employeeAttendanceList;
	}

	public List getAttendanceByMonth(User user, int monthIndex, int start,
			int end) throws ParseException, SystemException {
		DynamicQuery query = DynamicQueryFactoryUtil
				.forClass(EmployeeAttendance.class);
		Criterion criteriaOfUser = RestrictionsFactoryUtil.eq("userId",
				user.getUserId());
		SimpleDateFormat simpleDtForm = new SimpleDateFormat("dd/MM/yyyy");
		Calendar now = Calendar.getInstance();
		now.set(Calendar.MONTH, monthIndex);
		Date startDate = simpleDtForm.parse("01/" + (monthIndex + 1) + "/"
				+ now.get(Calendar.YEAR));
		Date endDate = simpleDtForm.parse(now
				.getActualMaximum(Calendar.DAY_OF_MONTH)
				+ "/"
				+ (monthIndex + 1) + "/" + now.get(Calendar.YEAR));

		// System.out.println(startDate + " " + endDate);
		Criterion criteriaOfDateRange = RestrictionsFactoryUtil.between(
				"attendanceDate", startDate, endDate);
		Criterion combinedCriteria = RestrictionsFactoryUtil.and(
				criteriaOfUser, criteriaOfDateRange);
		query.add(combinedCriteria);

		return dynamicQuery(query, start, end);
	}

	public List getAttendanceByDate(User user, java.sql.Date selectedDate,
			int start, int end) throws SystemException {
		DynamicQuery query = DynamicQueryFactoryUtil
				.forClass(EmployeeAttendance.class);
		Criterion criteriaOfUser = RestrictionsFactoryUtil.eq("userId",
				user.getUserId());
		Criterion criteriaOfDate = RestrictionsFactoryUtil.eq("attendanceDate",
				selectedDate);
		Criterion combinedCritera = RestrictionsFactoryUtil.and(criteriaOfUser,
				criteriaOfDate);
		query.add(combinedCritera);
		return dynamicQuery(query, start, end);
	}

	public List getAttendanceByQuarter(User user, int quarterIndex, int start,
			int end) throws ParseException, SystemException {
		DynamicQuery query = DynamicQueryFactoryUtil
				.forClass(EmployeeAttendance.class);
		Criterion criteriaOfUser = RestrictionsFactoryUtil.eq("userId",
				user.getUserId());
		SimpleDateFormat simpleDtForm = new SimpleDateFormat("dd/MM/yyyy");
		Calendar now = Calendar.getInstance();
		// now.set(Calendar.MONTH, monthIndex);
		Date startDate = null, endDate = null;
		switch (quarterIndex) {
		case 1:
			startDate = simpleDtForm.parse("01/" + "01" + "/"
					+ now.get(Calendar.YEAR));
			now.set(Calendar.MONTH, 2);
			endDate = simpleDtForm.parse(now
					.getActualMaximum(Calendar.DAY_OF_MONTH)
					+ "/"
					+ "03"
					+ "/"
					+ now.get(Calendar.YEAR));
			break;
		case 2:
			startDate = simpleDtForm.parse("01/" + "04" + "/"
					+ now.get(Calendar.YEAR));
			now.set(Calendar.MONTH, 5);
			endDate = simpleDtForm.parse(now
					.getActualMaximum(Calendar.DAY_OF_MONTH)
					+ "/"
					+ "06"
					+ "/"
					+ now.get(Calendar.YEAR));
			break;
		case 3:
			startDate = simpleDtForm.parse("01/" + "07" + "/"
					+ now.get(Calendar.YEAR));
			now.set(Calendar.MONTH, 8);
			endDate = simpleDtForm.parse(now
					.getActualMaximum(Calendar.DAY_OF_MONTH)
					+ "/"
					+ "09"
					+ "/"
					+ now.get(Calendar.YEAR));
			break;
		case 4:
			startDate = simpleDtForm.parse("01/" + "10" + "/"
					+ now.get(Calendar.YEAR));
			now.set(Calendar.MONTH, 11);
			endDate = simpleDtForm.parse(now
					.getActualMaximum(Calendar.DAY_OF_MONTH)
					+ "/"
					+ "12"
					+ "/"
					+ now.get(Calendar.YEAR));
			break;
		}

		Criterion criteriaOfQuarter = RestrictionsFactoryUtil.between(
				"attendanceDate", startDate, endDate);
		Criterion combinedCriteria = RestrictionsFactoryUtil.and(
				criteriaOfUser, criteriaOfQuarter);
		query.add(combinedCriteria);
		return dynamicQuery(query);
	}

	public List getAttendanceByYear(User user, int start, int end)
			throws SystemException {
		DynamicQuery query = DynamicQueryFactoryUtil
				.forClass(EmployeeAttendance.class);
		 SimpleDateFormat simpleDtForm = new SimpleDateFormat("yyyy-MM-dd");
		Calendar now = Calendar.getInstance();

		Criterion criteriaOfUser = RestrictionsFactoryUtil.eq("userId",
				user.getUserId());
		Date startDate = null, endDate = null;
		try {
			System.out.println("Inside TRY in dates manipulation");
//			startDate = simpleDtForm.parse(now.get(Calendar.YEAR) + "-01-01");
//			endDate = simpleDtForm.parse(now.get(Calendar.YEAR) + "-12-31");
//			System.out.println("StartDate : " + startDate + "\n EndDate : "
//					+ endDate);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Criterion criteriaOfYear = RestrictionsFactoryUtil.between(
				"attendanceDate", startDate, endDate);
		Criterion combinedCritera = RestrictionsFactoryUtil.and(criteriaOfUser,
				criteriaOfYear);
		query.add(combinedCritera);
		return null; //dynamicQuery(query, start, end);
	}
}