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
 * Provides the local service utility for EmployeeTimesheet. This utility wraps
 * {@link com.hrms.service.impl.EmployeeTimesheetLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author bhavik
 * @see EmployeeTimesheetLocalService
 * @see com.hrms.service.base.EmployeeTimesheetLocalServiceBaseImpl
 * @see com.hrms.service.impl.EmployeeTimesheetLocalServiceImpl
 * @generated
 */
public class EmployeeTimesheetLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.hrms.service.impl.EmployeeTimesheetLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the employee timesheet to the database. Also notifies the appropriate model listeners.
	*
	* @param employeeTimesheet the employee timesheet
	* @return the employee timesheet that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeeTimesheet addEmployeeTimesheet(
		com.hrms.model.EmployeeTimesheet employeeTimesheet)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addEmployeeTimesheet(employeeTimesheet);
	}

	/**
	* Creates a new employee timesheet with the primary key. Does not add the employee timesheet to the database.
	*
	* @param timesheetId the primary key for the new employee timesheet
	* @return the new employee timesheet
	*/
	public static com.hrms.model.EmployeeTimesheet createEmployeeTimesheet(
		long timesheetId) {
		return getService().createEmployeeTimesheet(timesheetId);
	}

	/**
	* Deletes the employee timesheet with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param timesheetId the primary key of the employee timesheet
	* @return the employee timesheet that was removed
	* @throws PortalException if a employee timesheet with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeeTimesheet deleteEmployeeTimesheet(
		long timesheetId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteEmployeeTimesheet(timesheetId);
	}

	/**
	* Deletes the employee timesheet from the database. Also notifies the appropriate model listeners.
	*
	* @param employeeTimesheet the employee timesheet
	* @return the employee timesheet that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeeTimesheet deleteEmployeeTimesheet(
		com.hrms.model.EmployeeTimesheet employeeTimesheet)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteEmployeeTimesheet(employeeTimesheet);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeTimesheetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeTimesheetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static com.hrms.model.EmployeeTimesheet fetchEmployeeTimesheet(
		long timesheetId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchEmployeeTimesheet(timesheetId);
	}

	/**
	* Returns the employee timesheet with the primary key.
	*
	* @param timesheetId the primary key of the employee timesheet
	* @return the employee timesheet
	* @throws PortalException if a employee timesheet with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeeTimesheet getEmployeeTimesheet(
		long timesheetId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getEmployeeTimesheet(timesheetId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the employee timesheets.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeTimesheetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of employee timesheets
	* @param end the upper bound of the range of employee timesheets (not inclusive)
	* @return the range of employee timesheets
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hrms.model.EmployeeTimesheet> getEmployeeTimesheets(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getEmployeeTimesheets(start, end);
	}

	/**
	* Returns the number of employee timesheets.
	*
	* @return the number of employee timesheets
	* @throws SystemException if a system exception occurred
	*/
	public static int getEmployeeTimesheetsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getEmployeeTimesheetsCount();
	}

	/**
	* Updates the employee timesheet in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param employeeTimesheet the employee timesheet
	* @return the employee timesheet that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeeTimesheet updateEmployeeTimesheet(
		com.hrms.model.EmployeeTimesheet employeeTimesheet)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateEmployeeTimesheet(employeeTimesheet);
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

	public static java.util.List getEmployeeTimesheets(
		java.lang.String taskTitle, java.lang.String taskDescription,
		boolean andSearch, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getEmployeeTimesheets(taskTitle, taskDescription,
			andSearch, start, end);
	}

	public static int getEmployeeTimesheetCount(java.lang.String taskTitle,
		java.lang.String taskDescription, boolean andSearch)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getEmployeeTimesheetCount(taskTitle, taskDescription,
			andSearch);
	}

	public static void clearService() {
		_service = null;
	}

	public static EmployeeTimesheetLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					EmployeeTimesheetLocalService.class.getName());

			if (invokableLocalService instanceof EmployeeTimesheetLocalService) {
				_service = (EmployeeTimesheetLocalService)invokableLocalService;
			}
			else {
				_service = new EmployeeTimesheetLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(EmployeeTimesheetLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(EmployeeTimesheetLocalService service) {
	}

	private static EmployeeTimesheetLocalService _service;
}