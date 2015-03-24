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

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EmployeeSubDepartmentLocalService}.
 *
 * @author bhavik
 * @see EmployeeSubDepartmentLocalService
 * @generated
 */
public class EmployeeSubDepartmentLocalServiceWrapper
	implements EmployeeSubDepartmentLocalService,
		ServiceWrapper<EmployeeSubDepartmentLocalService> {
	public EmployeeSubDepartmentLocalServiceWrapper(
		EmployeeSubDepartmentLocalService employeeSubDepartmentLocalService) {
		_employeeSubDepartmentLocalService = employeeSubDepartmentLocalService;
	}

	/**
	* Adds the employee sub department to the database. Also notifies the appropriate model listeners.
	*
	* @param employeeSubDepartment the employee sub department
	* @return the employee sub department that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hrms.model.EmployeeSubDepartment addEmployeeSubDepartment(
		com.hrms.model.EmployeeSubDepartment employeeSubDepartment)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employeeSubDepartmentLocalService.addEmployeeSubDepartment(employeeSubDepartment);
	}

	/**
	* Creates a new employee sub department with the primary key. Does not add the employee sub department to the database.
	*
	* @param employeeSubDepartmentId the primary key for the new employee sub department
	* @return the new employee sub department
	*/
	@Override
	public com.hrms.model.EmployeeSubDepartment createEmployeeSubDepartment(
		long employeeSubDepartmentId) {
		return _employeeSubDepartmentLocalService.createEmployeeSubDepartment(employeeSubDepartmentId);
	}

	/**
	* Deletes the employee sub department with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param employeeSubDepartmentId the primary key of the employee sub department
	* @return the employee sub department that was removed
	* @throws PortalException if a employee sub department with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hrms.model.EmployeeSubDepartment deleteEmployeeSubDepartment(
		long employeeSubDepartmentId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _employeeSubDepartmentLocalService.deleteEmployeeSubDepartment(employeeSubDepartmentId);
	}

	/**
	* Deletes the employee sub department from the database. Also notifies the appropriate model listeners.
	*
	* @param employeeSubDepartment the employee sub department
	* @return the employee sub department that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hrms.model.EmployeeSubDepartment deleteEmployeeSubDepartment(
		com.hrms.model.EmployeeSubDepartment employeeSubDepartment)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employeeSubDepartmentLocalService.deleteEmployeeSubDepartment(employeeSubDepartment);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _employeeSubDepartmentLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employeeSubDepartmentLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _employeeSubDepartmentLocalService.dynamicQuery(dynamicQuery,
			start, end);
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
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employeeSubDepartmentLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employeeSubDepartmentLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employeeSubDepartmentLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.hrms.model.EmployeeSubDepartment fetchEmployeeSubDepartment(
		long employeeSubDepartmentId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employeeSubDepartmentLocalService.fetchEmployeeSubDepartment(employeeSubDepartmentId);
	}

	/**
	* Returns the employee sub department with the primary key.
	*
	* @param employeeSubDepartmentId the primary key of the employee sub department
	* @return the employee sub department
	* @throws PortalException if a employee sub department with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hrms.model.EmployeeSubDepartment getEmployeeSubDepartment(
		long employeeSubDepartmentId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _employeeSubDepartmentLocalService.getEmployeeSubDepartment(employeeSubDepartmentId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _employeeSubDepartmentLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public java.util.List<com.hrms.model.EmployeeSubDepartment> getEmployeeSubDepartments(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employeeSubDepartmentLocalService.getEmployeeSubDepartments(start,
			end);
	}

	/**
	* Returns the number of employee sub departments.
	*
	* @return the number of employee sub departments
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getEmployeeSubDepartmentsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employeeSubDepartmentLocalService.getEmployeeSubDepartmentsCount();
	}

	/**
	* Updates the employee sub department in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param employeeSubDepartment the employee sub department
	* @return the employee sub department that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hrms.model.EmployeeSubDepartment updateEmployeeSubDepartment(
		com.hrms.model.EmployeeSubDepartment employeeSubDepartment)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employeeSubDepartmentLocalService.updateEmployeeSubDepartment(employeeSubDepartment);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _employeeSubDepartmentLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_employeeSubDepartmentLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _employeeSubDepartmentLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public EmployeeSubDepartmentLocalService getWrappedEmployeeSubDepartmentLocalService() {
		return _employeeSubDepartmentLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedEmployeeSubDepartmentLocalService(
		EmployeeSubDepartmentLocalService employeeSubDepartmentLocalService) {
		_employeeSubDepartmentLocalService = employeeSubDepartmentLocalService;
	}

	@Override
	public EmployeeSubDepartmentLocalService getWrappedService() {
		return _employeeSubDepartmentLocalService;
	}

	@Override
	public void setWrappedService(
		EmployeeSubDepartmentLocalService employeeSubDepartmentLocalService) {
		_employeeSubDepartmentLocalService = employeeSubDepartmentLocalService;
	}

	private EmployeeSubDepartmentLocalService _employeeSubDepartmentLocalService;
}