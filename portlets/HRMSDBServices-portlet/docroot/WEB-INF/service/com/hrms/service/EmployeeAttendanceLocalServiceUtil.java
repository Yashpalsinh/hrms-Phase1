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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for EmployeeAttendance. This utility wraps
 * {@link com.hrms.service.impl.EmployeeAttendanceLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author bhavik
 * @see EmployeeAttendanceLocalService
 * @see com.hrms.service.base.EmployeeAttendanceLocalServiceBaseImpl
 * @see com.hrms.service.impl.EmployeeAttendanceLocalServiceImpl
 * @generated
 */
public class EmployeeAttendanceLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.hrms.service.impl.EmployeeAttendanceLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the employee attendance to the database. Also notifies the appropriate model listeners.
	*
	* @param employeeAttendance the employee attendance
	* @return the employee attendance that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeeAttendance addEmployeeAttendance(
		com.hrms.model.EmployeeAttendance employeeAttendance)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addEmployeeAttendance(employeeAttendance);
	}

	/**
	* Creates a new employee attendance with the primary key. Does not add the employee attendance to the database.
	*
	* @param attendanceId the primary key for the new employee attendance
	* @return the new employee attendance
	*/
	public static com.hrms.model.EmployeeAttendance createEmployeeAttendance(
		long attendanceId) {
		return getService().createEmployeeAttendance(attendanceId);
	}

	/**
	* Deletes the employee attendance with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param attendanceId the primary key of the employee attendance
	* @return the employee attendance that was removed
	* @throws PortalException if a employee attendance with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeeAttendance deleteEmployeeAttendance(
		long attendanceId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteEmployeeAttendance(attendanceId);
	}

	/**
	* Deletes the employee attendance from the database. Also notifies the appropriate model listeners.
	*
	* @param employeeAttendance the employee attendance
	* @return the employee attendance that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeeAttendance deleteEmployeeAttendance(
		com.hrms.model.EmployeeAttendance employeeAttendance)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteEmployeeAttendance(employeeAttendance);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeAttendanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeAttendanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.hrms.model.EmployeeAttendance fetchEmployeeAttendance(
		long attendanceId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchEmployeeAttendance(attendanceId);
	}

	/**
	* Returns the employee attendance with the primary key.
	*
	* @param attendanceId the primary key of the employee attendance
	* @return the employee attendance
	* @throws PortalException if a employee attendance with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeeAttendance getEmployeeAttendance(
		long attendanceId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getEmployeeAttendance(attendanceId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the employee attendances.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeAttendanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of employee attendances
	* @param end the upper bound of the range of employee attendances (not inclusive)
	* @return the range of employee attendances
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hrms.model.EmployeeAttendance> getEmployeeAttendances(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getEmployeeAttendances(start, end);
	}

	/**
	* Returns the number of employee attendances.
	*
	* @return the number of employee attendances
	* @throws SystemException if a system exception occurred
	*/
	public static int getEmployeeAttendancesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getEmployeeAttendancesCount();
	}

	/**
	* Updates the employee attendance in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param employeeAttendance the employee attendance
	* @return the employee attendance that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeeAttendance updateEmployeeAttendance(
		com.hrms.model.EmployeeAttendance employeeAttendance)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateEmployeeAttendance(employeeAttendance);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static void manageAttendance(
		com.hrms.model.EmployeeTimesheet employeeTimesheet)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().manageAttendance(employeeTimesheet);
	}

	public static java.util.List getEmployeeAttendanceByDate(
		com.hrms.model.EmployeeTimesheet employeeTimesheet)
		throws com.liferay.portal.kernel.exception.SystemException,
			java.text.ParseException {
		return getService().getEmployeeAttendanceByDate(employeeTimesheet);
	}

	public static java.util.List getAttendanceByMonth(
		com.liferay.portal.model.User user, int monthIndex, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException,
			java.text.ParseException {
		return getService().getAttendanceByMonth(user, monthIndex, start, end);
	}

	public static java.util.List getAttendanceByDate(
		com.liferay.portal.model.User user, java.sql.Date selectedDate,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getAttendanceByDate(user, selectedDate, start, end);
	}

	public static java.util.List getAttendanceByQuarter(
		com.liferay.portal.model.User user, int quarterIndex, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException,
			java.text.ParseException {
		return getService()
				   .getAttendanceByQuarter(user, quarterIndex, start, end);
	}

	public static java.util.List getAttendanceByYear(
		com.liferay.portal.model.User user, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getAttendanceByYear(user, start, end);
	}

	public static void clearService() {
		_service = null;
	}

	public static EmployeeAttendanceLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					EmployeeAttendanceLocalService.class.getName());

			if (invokableLocalService instanceof EmployeeAttendanceLocalService) {
				_service = (EmployeeAttendanceLocalService)invokableLocalService;
			}
			else {
				_service = new EmployeeAttendanceLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(EmployeeAttendanceLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(EmployeeAttendanceLocalService service) {
	}

	private static EmployeeAttendanceLocalService _service;
}