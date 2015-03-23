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
 * Provides a wrapper for {@link EmployeeDepartmentLocalService}.
 *
 * @author yashpalsinh
 * @see EmployeeDepartmentLocalService
 * @generated
 */
public class EmployeeDepartmentLocalServiceWrapper
	implements EmployeeDepartmentLocalService,
		ServiceWrapper<EmployeeDepartmentLocalService> {
	public EmployeeDepartmentLocalServiceWrapper(
		EmployeeDepartmentLocalService employeeDepartmentLocalService) {
		_employeeDepartmentLocalService = employeeDepartmentLocalService;
	}

	/**
	* Adds the employee department to the database. Also notifies the appropriate model listeners.
	*
	* @param employeeDepartment the employee department
	* @return the employee department that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hrms.model.EmployeeDepartment addEmployeeDepartment(
		com.hrms.model.EmployeeDepartment employeeDepartment)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employeeDepartmentLocalService.addEmployeeDepartment(employeeDepartment);
	}

	/**
	* Creates a new employee department with the primary key. Does not add the employee department to the database.
	*
	* @param employeeDepartmentId the primary key for the new employee department
	* @return the new employee department
	*/
	@Override
	public com.hrms.model.EmployeeDepartment createEmployeeDepartment(
		long employeeDepartmentId) {
		return _employeeDepartmentLocalService.createEmployeeDepartment(employeeDepartmentId);
	}

	/**
	* Deletes the employee department with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param employeeDepartmentId the primary key of the employee department
	* @return the employee department that was removed
	* @throws PortalException if a employee department with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hrms.model.EmployeeDepartment deleteEmployeeDepartment(
		long employeeDepartmentId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _employeeDepartmentLocalService.deleteEmployeeDepartment(employeeDepartmentId);
	}

	/**
	* Deletes the employee department from the database. Also notifies the appropriate model listeners.
	*
	* @param employeeDepartment the employee department
	* @return the employee department that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hrms.model.EmployeeDepartment deleteEmployeeDepartment(
		com.hrms.model.EmployeeDepartment employeeDepartment)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employeeDepartmentLocalService.deleteEmployeeDepartment(employeeDepartment);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _employeeDepartmentLocalService.dynamicQuery();
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
		return _employeeDepartmentLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _employeeDepartmentLocalService.dynamicQuery(dynamicQuery,
			start, end);
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
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employeeDepartmentLocalService.dynamicQuery(dynamicQuery,
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
		return _employeeDepartmentLocalService.dynamicQueryCount(dynamicQuery);
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
		return _employeeDepartmentLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.hrms.model.EmployeeDepartment fetchEmployeeDepartment(
		long employeeDepartmentId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employeeDepartmentLocalService.fetchEmployeeDepartment(employeeDepartmentId);
	}

	/**
	* Returns the employee department with the primary key.
	*
	* @param employeeDepartmentId the primary key of the employee department
	* @return the employee department
	* @throws PortalException if a employee department with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hrms.model.EmployeeDepartment getEmployeeDepartment(
		long employeeDepartmentId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _employeeDepartmentLocalService.getEmployeeDepartment(employeeDepartmentId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _employeeDepartmentLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public java.util.List<com.hrms.model.EmployeeDepartment> getEmployeeDepartments(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employeeDepartmentLocalService.getEmployeeDepartments(start, end);
	}

	/**
	* Returns the number of employee departments.
	*
	* @return the number of employee departments
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getEmployeeDepartmentsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employeeDepartmentLocalService.getEmployeeDepartmentsCount();
	}

	/**
	* Updates the employee department in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param employeeDepartment the employee department
	* @return the employee department that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hrms.model.EmployeeDepartment updateEmployeeDepartment(
		com.hrms.model.EmployeeDepartment employeeDepartment)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employeeDepartmentLocalService.updateEmployeeDepartment(employeeDepartment);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _employeeDepartmentLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_employeeDepartmentLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _employeeDepartmentLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	@Override
	public java.util.List getSerachEmployeeDepartments(
		java.lang.String departmentName, java.lang.String status,
		boolean andSearch, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employeeDepartmentLocalService.getSerachEmployeeDepartments(departmentName,
			status, andSearch, start, end, orderByComparator);
	}

	@Override
	public int getSearchEmployeeDepartmentsCount(
		java.lang.String departmentName, java.lang.String status,
		boolean andSearch)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employeeDepartmentLocalService.getSearchEmployeeDepartmentsCount(departmentName,
			status, andSearch);
	}

	@Override
	public com.hrms.model.EmployeeDepartment findByemployeeDepartmentId(
		long employeeDepartmentId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employeeDepartmentLocalService.findByemployeeDepartmentId(employeeDepartmentId);
	}

	@Override
	public java.util.List<com.hrms.model.EmployeeDepartment> findByStatus(
		boolean stat)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employeeDepartmentLocalService.findByStatus(stat);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public EmployeeDepartmentLocalService getWrappedEmployeeDepartmentLocalService() {
		return _employeeDepartmentLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedEmployeeDepartmentLocalService(
		EmployeeDepartmentLocalService employeeDepartmentLocalService) {
		_employeeDepartmentLocalService = employeeDepartmentLocalService;
	}

	@Override
	public EmployeeDepartmentLocalService getWrappedService() {
		return _employeeDepartmentLocalService;
	}

	@Override
	public void setWrappedService(
		EmployeeDepartmentLocalService employeeDepartmentLocalService) {
		_employeeDepartmentLocalService = employeeDepartmentLocalService;
	}

	private EmployeeDepartmentLocalService _employeeDepartmentLocalService;
}