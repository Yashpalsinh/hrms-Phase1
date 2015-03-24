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
 * Provides a wrapper for {@link EmployeeLeaveLocalService}.
 *
 * @author bhavik
 * @see EmployeeLeaveLocalService
 * @generated
 */
public class EmployeeLeaveLocalServiceWrapper
	implements EmployeeLeaveLocalService,
		ServiceWrapper<EmployeeLeaveLocalService> {
	public EmployeeLeaveLocalServiceWrapper(
		EmployeeLeaveLocalService employeeLeaveLocalService) {
		_employeeLeaveLocalService = employeeLeaveLocalService;
	}

	/**
	* Adds the employee leave to the database. Also notifies the appropriate model listeners.
	*
	* @param employeeLeave the employee leave
	* @return the employee leave that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hrms.model.EmployeeLeave addEmployeeLeave(
		com.hrms.model.EmployeeLeave employeeLeave)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employeeLeaveLocalService.addEmployeeLeave(employeeLeave);
	}

	/**
	* Creates a new employee leave with the primary key. Does not add the employee leave to the database.
	*
	* @param employeeLeaveId the primary key for the new employee leave
	* @return the new employee leave
	*/
	@Override
	public com.hrms.model.EmployeeLeave createEmployeeLeave(
		long employeeLeaveId) {
		return _employeeLeaveLocalService.createEmployeeLeave(employeeLeaveId);
	}

	/**
	* Deletes the employee leave with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param employeeLeaveId the primary key of the employee leave
	* @return the employee leave that was removed
	* @throws PortalException if a employee leave with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hrms.model.EmployeeLeave deleteEmployeeLeave(
		long employeeLeaveId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _employeeLeaveLocalService.deleteEmployeeLeave(employeeLeaveId);
	}

	/**
	* Deletes the employee leave from the database. Also notifies the appropriate model listeners.
	*
	* @param employeeLeave the employee leave
	* @return the employee leave that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hrms.model.EmployeeLeave deleteEmployeeLeave(
		com.hrms.model.EmployeeLeave employeeLeave)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employeeLeaveLocalService.deleteEmployeeLeave(employeeLeave);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _employeeLeaveLocalService.dynamicQuery();
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
		return _employeeLeaveLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeLeaveModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _employeeLeaveLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeLeaveModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _employeeLeaveLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
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
		return _employeeLeaveLocalService.dynamicQueryCount(dynamicQuery);
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
		return _employeeLeaveLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.hrms.model.EmployeeLeave fetchEmployeeLeave(long employeeLeaveId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employeeLeaveLocalService.fetchEmployeeLeave(employeeLeaveId);
	}

	/**
	* Returns the employee leave with the primary key.
	*
	* @param employeeLeaveId the primary key of the employee leave
	* @return the employee leave
	* @throws PortalException if a employee leave with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hrms.model.EmployeeLeave getEmployeeLeave(long employeeLeaveId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _employeeLeaveLocalService.getEmployeeLeave(employeeLeaveId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _employeeLeaveLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the employee leaves.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeLeaveModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of employee leaves
	* @param end the upper bound of the range of employee leaves (not inclusive)
	* @return the range of employee leaves
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.hrms.model.EmployeeLeave> getEmployeeLeaves(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employeeLeaveLocalService.getEmployeeLeaves(start, end);
	}

	/**
	* Returns the number of employee leaves.
	*
	* @return the number of employee leaves
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getEmployeeLeavesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employeeLeaveLocalService.getEmployeeLeavesCount();
	}

	/**
	* Updates the employee leave in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param employeeLeave the employee leave
	* @return the employee leave that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hrms.model.EmployeeLeave updateEmployeeLeave(
		com.hrms.model.EmployeeLeave employeeLeave)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employeeLeaveLocalService.updateEmployeeLeave(employeeLeave);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _employeeLeaveLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_employeeLeaveLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _employeeLeaveLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public EmployeeLeaveLocalService getWrappedEmployeeLeaveLocalService() {
		return _employeeLeaveLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedEmployeeLeaveLocalService(
		EmployeeLeaveLocalService employeeLeaveLocalService) {
		_employeeLeaveLocalService = employeeLeaveLocalService;
	}

	@Override
	public EmployeeLeaveLocalService getWrappedService() {
		return _employeeLeaveLocalService;
	}

	@Override
	public void setWrappedService(
		EmployeeLeaveLocalService employeeLeaveLocalService) {
		_employeeLeaveLocalService = employeeLeaveLocalService;
	}

	private EmployeeLeaveLocalService _employeeLeaveLocalService;
}