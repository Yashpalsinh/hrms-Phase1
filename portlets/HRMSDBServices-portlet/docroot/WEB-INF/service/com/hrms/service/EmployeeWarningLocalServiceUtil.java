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
 * Provides the local service utility for EmployeeWarning. This utility wraps
 * {@link com.hrms.service.impl.EmployeeWarningLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author bhavik
 * @see EmployeeWarningLocalService
 * @see com.hrms.service.base.EmployeeWarningLocalServiceBaseImpl
 * @see com.hrms.service.impl.EmployeeWarningLocalServiceImpl
 * @generated
 */
public class EmployeeWarningLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.hrms.service.impl.EmployeeWarningLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the employee warning to the database. Also notifies the appropriate model listeners.
	*
	* @param employeeWarning the employee warning
	* @return the employee warning that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeeWarning addEmployeeWarning(
		com.hrms.model.EmployeeWarning employeeWarning)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addEmployeeWarning(employeeWarning);
	}

	/**
	* Creates a new employee warning with the primary key. Does not add the employee warning to the database.
	*
	* @param employeeWarningId the primary key for the new employee warning
	* @return the new employee warning
	*/
	public static com.hrms.model.EmployeeWarning createEmployeeWarning(
		long employeeWarningId) {
		return getService().createEmployeeWarning(employeeWarningId);
	}

	/**
	* Deletes the employee warning with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param employeeWarningId the primary key of the employee warning
	* @return the employee warning that was removed
	* @throws PortalException if a employee warning with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeeWarning deleteEmployeeWarning(
		long employeeWarningId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteEmployeeWarning(employeeWarningId);
	}

	/**
	* Deletes the employee warning from the database. Also notifies the appropriate model listeners.
	*
	* @param employeeWarning the employee warning
	* @return the employee warning that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeeWarning deleteEmployeeWarning(
		com.hrms.model.EmployeeWarning employeeWarning)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteEmployeeWarning(employeeWarning);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeWarningModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeWarningModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static com.hrms.model.EmployeeWarning fetchEmployeeWarning(
		long employeeWarningId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchEmployeeWarning(employeeWarningId);
	}

	/**
	* Returns the employee warning with the primary key.
	*
	* @param employeeWarningId the primary key of the employee warning
	* @return the employee warning
	* @throws PortalException if a employee warning with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeeWarning getEmployeeWarning(
		long employeeWarningId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getEmployeeWarning(employeeWarningId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the employee warnings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeWarningModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of employee warnings
	* @param end the upper bound of the range of employee warnings (not inclusive)
	* @return the range of employee warnings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hrms.model.EmployeeWarning> getEmployeeWarnings(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getEmployeeWarnings(start, end);
	}

	/**
	* Returns the number of employee warnings.
	*
	* @return the number of employee warnings
	* @throws SystemException if a system exception occurred
	*/
	public static int getEmployeeWarningsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getEmployeeWarningsCount();
	}

	/**
	* Updates the employee warning in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param employeeWarning the employee warning
	* @return the employee warning that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeeWarning updateEmployeeWarning(
		com.hrms.model.EmployeeWarning employeeWarning)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateEmployeeWarning(employeeWarning);
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

	public static void clearService() {
		_service = null;
	}

	public static EmployeeWarningLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					EmployeeWarningLocalService.class.getName());

			if (invokableLocalService instanceof EmployeeWarningLocalService) {
				_service = (EmployeeWarningLocalService)invokableLocalService;
			}
			else {
				_service = new EmployeeWarningLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(EmployeeWarningLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(EmployeeWarningLocalService service) {
	}

	private static EmployeeWarningLocalService _service;
}