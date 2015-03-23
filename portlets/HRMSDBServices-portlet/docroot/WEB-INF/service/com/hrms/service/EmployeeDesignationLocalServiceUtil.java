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
 * Provides the local service utility for EmployeeDesignation. This utility wraps
 * {@link com.hrms.service.impl.EmployeeDesignationLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author yashpalsinh
 * @see EmployeeDesignationLocalService
 * @see com.hrms.service.base.EmployeeDesignationLocalServiceBaseImpl
 * @see com.hrms.service.impl.EmployeeDesignationLocalServiceImpl
 * @generated
 */
public class EmployeeDesignationLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.hrms.service.impl.EmployeeDesignationLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the employee designation to the database. Also notifies the appropriate model listeners.
	*
	* @param employeeDesignation the employee designation
	* @return the employee designation that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeeDesignation addEmployeeDesignation(
		com.hrms.model.EmployeeDesignation employeeDesignation)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addEmployeeDesignation(employeeDesignation);
	}

	/**
	* Creates a new employee designation with the primary key. Does not add the employee designation to the database.
	*
	* @param employeeDesignationId the primary key for the new employee designation
	* @return the new employee designation
	*/
	public static com.hrms.model.EmployeeDesignation createEmployeeDesignation(
		long employeeDesignationId) {
		return getService().createEmployeeDesignation(employeeDesignationId);
	}

	/**
	* Deletes the employee designation with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param employeeDesignationId the primary key of the employee designation
	* @return the employee designation that was removed
	* @throws PortalException if a employee designation with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeeDesignation deleteEmployeeDesignation(
		long employeeDesignationId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteEmployeeDesignation(employeeDesignationId);
	}

	/**
	* Deletes the employee designation from the database. Also notifies the appropriate model listeners.
	*
	* @param employeeDesignation the employee designation
	* @return the employee designation that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeeDesignation deleteEmployeeDesignation(
		com.hrms.model.EmployeeDesignation employeeDesignation)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteEmployeeDesignation(employeeDesignation);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeDesignationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeDesignationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static com.hrms.model.EmployeeDesignation fetchEmployeeDesignation(
		long employeeDesignationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchEmployeeDesignation(employeeDesignationId);
	}

	/**
	* Returns the employee designation with the primary key.
	*
	* @param employeeDesignationId the primary key of the employee designation
	* @return the employee designation
	* @throws PortalException if a employee designation with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeeDesignation getEmployeeDesignation(
		long employeeDesignationId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getEmployeeDesignation(employeeDesignationId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the employee designations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeDesignationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of employee designations
	* @param end the upper bound of the range of employee designations (not inclusive)
	* @return the range of employee designations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hrms.model.EmployeeDesignation> getEmployeeDesignations(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getEmployeeDesignations(start, end);
	}

	/**
	* Returns the number of employee designations.
	*
	* @return the number of employee designations
	* @throws SystemException if a system exception occurred
	*/
	public static int getEmployeeDesignationsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getEmployeeDesignationsCount();
	}

	/**
	* Updates the employee designation in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param employeeDesignation the employee designation
	* @return the employee designation that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeeDesignation updateEmployeeDesignation(
		com.hrms.model.EmployeeDesignation employeeDesignation)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateEmployeeDesignation(employeeDesignation);
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

	public static java.util.List getSerachEmployeeDesignations(
		java.lang.String designationName, java.lang.String status,
		boolean andSearch, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getSerachEmployeeDesignations(designationName, status,
			andSearch, start, end, orderByComparator);
	}

	public static int getSearchEmployeeDesignationsCount(
		java.lang.String designationName, java.lang.String status,
		boolean andSearch)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getSearchEmployeeDesignationsCount(designationName, status,
			andSearch);
	}

	public static java.util.List<com.hrms.model.EmployeeDesignation> findByStatus(
		boolean stat)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByStatus(stat);
	}

	public static void clearService() {
		_service = null;
	}

	public static EmployeeDesignationLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					EmployeeDesignationLocalService.class.getName());

			if (invokableLocalService instanceof EmployeeDesignationLocalService) {
				_service = (EmployeeDesignationLocalService)invokableLocalService;
			}
			else {
				_service = new EmployeeDesignationLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(EmployeeDesignationLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(EmployeeDesignationLocalService service) {
	}

	private static EmployeeDesignationLocalService _service;
}