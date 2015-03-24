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
 * Provides the local service utility for EmployeeDepartment. This utility wraps
 * {@link com.hrms.service.impl.EmployeeDepartmentLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author yashpalsinh
 * @see EmployeeDepartmentLocalService
 * @see com.hrms.service.base.EmployeeDepartmentLocalServiceBaseImpl
 * @see com.hrms.service.impl.EmployeeDepartmentLocalServiceImpl
 * @generated
 */
public class EmployeeDepartmentLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.hrms.service.impl.EmployeeDepartmentLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the employee department to the database. Also notifies the appropriate model listeners.
	*
	* @param employeeDepartment the employee department
	* @return the employee department that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeeDepartment addEmployeeDepartment(
		com.hrms.model.EmployeeDepartment employeeDepartment)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addEmployeeDepartment(employeeDepartment);
	}

	/**
	* Creates a new employee department with the primary key. Does not add the employee department to the database.
	*
	* @param employeeDepartmentId the primary key for the new employee department
	* @return the new employee department
	*/
	public static com.hrms.model.EmployeeDepartment createEmployeeDepartment(
		long employeeDepartmentId) {
		return getService().createEmployeeDepartment(employeeDepartmentId);
	}

	/**
	* Deletes the employee department with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param employeeDepartmentId the primary key of the employee department
	* @return the employee department that was removed
	* @throws PortalException if a employee department with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeeDepartment deleteEmployeeDepartment(
		long employeeDepartmentId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteEmployeeDepartment(employeeDepartmentId);
	}

	/**
	* Deletes the employee department from the database. Also notifies the appropriate model listeners.
	*
	* @param employeeDepartment the employee department
	* @return the employee department that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeeDepartment deleteEmployeeDepartment(
		com.hrms.model.EmployeeDepartment employeeDepartment)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteEmployeeDepartment(employeeDepartment);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeDepartmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeDepartmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static com.hrms.model.EmployeeDepartment fetchEmployeeDepartment(
		long employeeDepartmentId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchEmployeeDepartment(employeeDepartmentId);
	}

	/**
	* Returns the employee department with the primary key.
	*
	* @param employeeDepartmentId the primary key of the employee department
	* @return the employee department
	* @throws PortalException if a employee department with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeeDepartment getEmployeeDepartment(
		long employeeDepartmentId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getEmployeeDepartment(employeeDepartmentId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the employee departments.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeDepartmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of employee departments
	* @param end the upper bound of the range of employee departments (not inclusive)
	* @return the range of employee departments
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hrms.model.EmployeeDepartment> getEmployeeDepartments(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getEmployeeDepartments(start, end);
	}

	/**
	* Returns the number of employee departments.
	*
	* @return the number of employee departments
	* @throws SystemException if a system exception occurred
	*/
	public static int getEmployeeDepartmentsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getEmployeeDepartmentsCount();
	}

	/**
	* Updates the employee department in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param employeeDepartment the employee department
	* @return the employee department that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeeDepartment updateEmployeeDepartment(
		com.hrms.model.EmployeeDepartment employeeDepartment)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateEmployeeDepartment(employeeDepartment);
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

	public static java.util.List getSerachEmployeeDepartments(
		java.lang.String departmentName, java.lang.String status,
		boolean andSearch, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getSerachEmployeeDepartments(departmentName, status,
			andSearch, start, end, orderByComparator);
	}

	public static int getSearchEmployeeDepartmentsCount(
		java.lang.String departmentName, java.lang.String status,
		boolean andSearch)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getSearchEmployeeDepartmentsCount(departmentName, status,
			andSearch);
	}

	public static com.hrms.model.EmployeeDepartment findByemployeeDepartmentId(
		long employeeDepartmentId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByemployeeDepartmentId(employeeDepartmentId);
	}

	public static java.util.List<com.hrms.model.EmployeeDepartment> findByStatus(
		boolean stat)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByStatus(stat);
	}

	public static void clearService() {
		_service = null;
	}

	public static EmployeeDepartmentLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					EmployeeDepartmentLocalService.class.getName());

			if (invokableLocalService instanceof EmployeeDepartmentLocalService) {
				_service = (EmployeeDepartmentLocalService)invokableLocalService;
			}
			else {
				_service = new EmployeeDepartmentLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(EmployeeDepartmentLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(EmployeeDepartmentLocalService service) {
	}

	private static EmployeeDepartmentLocalService _service;
}