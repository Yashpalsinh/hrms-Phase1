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
 * Provides the local service utility for EmployeeSubDepartment. This utility wraps
 * {@link com.hrms.service.impl.EmployeeSubDepartmentLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author yashpalsinh
 * @see EmployeeSubDepartmentLocalService
 * @see com.hrms.service.base.EmployeeSubDepartmentLocalServiceBaseImpl
 * @see com.hrms.service.impl.EmployeeSubDepartmentLocalServiceImpl
 * @generated
 */
public class EmployeeSubDepartmentLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.hrms.service.impl.EmployeeSubDepartmentLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the employee sub department to the database. Also notifies the appropriate model listeners.
	*
	* @param employeeSubDepartment the employee sub department
	* @return the employee sub department that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeeSubDepartment addEmployeeSubDepartment(
		com.hrms.model.EmployeeSubDepartment employeeSubDepartment)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addEmployeeSubDepartment(employeeSubDepartment);
	}

	/**
	* Creates a new employee sub department with the primary key. Does not add the employee sub department to the database.
	*
	* @param employeeSubDepartmentId the primary key for the new employee sub department
	* @return the new employee sub department
	*/
	public static com.hrms.model.EmployeeSubDepartment createEmployeeSubDepartment(
		long employeeSubDepartmentId) {
		return getService().createEmployeeSubDepartment(employeeSubDepartmentId);
	}

	/**
	* Deletes the employee sub department with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param employeeSubDepartmentId the primary key of the employee sub department
	* @return the employee sub department that was removed
	* @throws PortalException if a employee sub department with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeeSubDepartment deleteEmployeeSubDepartment(
		long employeeSubDepartmentId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteEmployeeSubDepartment(employeeSubDepartmentId);
	}

	/**
	* Deletes the employee sub department from the database. Also notifies the appropriate model listeners.
	*
	* @param employeeSubDepartment the employee sub department
	* @return the employee sub department that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeeSubDepartment deleteEmployeeSubDepartment(
		com.hrms.model.EmployeeSubDepartment employeeSubDepartment)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteEmployeeSubDepartment(employeeSubDepartment);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeSubDepartmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeSubDepartmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static com.hrms.model.EmployeeSubDepartment fetchEmployeeSubDepartment(
		long employeeSubDepartmentId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchEmployeeSubDepartment(employeeSubDepartmentId);
	}

	/**
	* Returns the employee sub department with the primary key.
	*
	* @param employeeSubDepartmentId the primary key of the employee sub department
	* @return the employee sub department
	* @throws PortalException if a employee sub department with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeeSubDepartment getEmployeeSubDepartment(
		long employeeSubDepartmentId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getEmployeeSubDepartment(employeeSubDepartmentId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the employee sub departments.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeSubDepartmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of employee sub departments
	* @param end the upper bound of the range of employee sub departments (not inclusive)
	* @return the range of employee sub departments
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hrms.model.EmployeeSubDepartment> getEmployeeSubDepartments(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getEmployeeSubDepartments(start, end);
	}

	/**
	* Returns the number of employee sub departments.
	*
	* @return the number of employee sub departments
	* @throws SystemException if a system exception occurred
	*/
	public static int getEmployeeSubDepartmentsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getEmployeeSubDepartmentsCount();
	}

	/**
	* Updates the employee sub department in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param employeeSubDepartment the employee sub department
	* @return the employee sub department that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeeSubDepartment updateEmployeeSubDepartment(
		com.hrms.model.EmployeeSubDepartment employeeSubDepartment)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateEmployeeSubDepartment(employeeSubDepartment);
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

	public static EmployeeSubDepartmentLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					EmployeeSubDepartmentLocalService.class.getName());

			if (invokableLocalService instanceof EmployeeSubDepartmentLocalService) {
				_service = (EmployeeSubDepartmentLocalService)invokableLocalService;
			}
			else {
				_service = new EmployeeSubDepartmentLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(EmployeeSubDepartmentLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(EmployeeSubDepartmentLocalService service) {
	}

	private static EmployeeSubDepartmentLocalService _service;
}