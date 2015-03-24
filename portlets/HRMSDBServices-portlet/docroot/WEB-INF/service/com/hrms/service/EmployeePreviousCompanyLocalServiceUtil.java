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
 * Provides the local service utility for EmployeePreviousCompany. This utility wraps
 * {@link com.hrms.service.impl.EmployeePreviousCompanyLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author bhavik
 * @see EmployeePreviousCompanyLocalService
 * @see com.hrms.service.base.EmployeePreviousCompanyLocalServiceBaseImpl
 * @see com.hrms.service.impl.EmployeePreviousCompanyLocalServiceImpl
 * @generated
 */
public class EmployeePreviousCompanyLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.hrms.service.impl.EmployeePreviousCompanyLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the employee previous company to the database. Also notifies the appropriate model listeners.
	*
	* @param employeePreviousCompany the employee previous company
	* @return the employee previous company that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeePreviousCompany addEmployeePreviousCompany(
		com.hrms.model.EmployeePreviousCompany employeePreviousCompany)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addEmployeePreviousCompany(employeePreviousCompany);
	}

	/**
	* Creates a new employee previous company with the primary key. Does not add the employee previous company to the database.
	*
	* @param employeePreviousCompanyId the primary key for the new employee previous company
	* @return the new employee previous company
	*/
	public static com.hrms.model.EmployeePreviousCompany createEmployeePreviousCompany(
		long employeePreviousCompanyId) {
		return getService()
				   .createEmployeePreviousCompany(employeePreviousCompanyId);
	}

	/**
	* Deletes the employee previous company with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param employeePreviousCompanyId the primary key of the employee previous company
	* @return the employee previous company that was removed
	* @throws PortalException if a employee previous company with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeePreviousCompany deleteEmployeePreviousCompany(
		long employeePreviousCompanyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .deleteEmployeePreviousCompany(employeePreviousCompanyId);
	}

	/**
	* Deletes the employee previous company from the database. Also notifies the appropriate model listeners.
	*
	* @param employeePreviousCompany the employee previous company
	* @return the employee previous company that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeePreviousCompany deleteEmployeePreviousCompany(
		com.hrms.model.EmployeePreviousCompany employeePreviousCompany)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .deleteEmployeePreviousCompany(employeePreviousCompany);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeePreviousCompanyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeePreviousCompanyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static com.hrms.model.EmployeePreviousCompany fetchEmployeePreviousCompany(
		long employeePreviousCompanyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .fetchEmployeePreviousCompany(employeePreviousCompanyId);
	}

	/**
	* Returns the employee previous company with the primary key.
	*
	* @param employeePreviousCompanyId the primary key of the employee previous company
	* @return the employee previous company
	* @throws PortalException if a employee previous company with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeePreviousCompany getEmployeePreviousCompany(
		long employeePreviousCompanyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getEmployeePreviousCompany(employeePreviousCompanyId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the employee previous companies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeePreviousCompanyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of employee previous companies
	* @param end the upper bound of the range of employee previous companies (not inclusive)
	* @return the range of employee previous companies
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hrms.model.EmployeePreviousCompany> getEmployeePreviousCompanies(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getEmployeePreviousCompanies(start, end);
	}

	/**
	* Returns the number of employee previous companies.
	*
	* @return the number of employee previous companies
	* @throws SystemException if a system exception occurred
	*/
	public static int getEmployeePreviousCompaniesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getEmployeePreviousCompaniesCount();
	}

	/**
	* Updates the employee previous company in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param employeePreviousCompany the employee previous company
	* @return the employee previous company that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeePreviousCompany updateEmployeePreviousCompany(
		com.hrms.model.EmployeePreviousCompany employeePreviousCompany)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateEmployeePreviousCompany(employeePreviousCompany);
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

	public static EmployeePreviousCompanyLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					EmployeePreviousCompanyLocalService.class.getName());

			if (invokableLocalService instanceof EmployeePreviousCompanyLocalService) {
				_service = (EmployeePreviousCompanyLocalService)invokableLocalService;
			}
			else {
				_service = new EmployeePreviousCompanyLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(EmployeePreviousCompanyLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(EmployeePreviousCompanyLocalService service) {
	}

	private static EmployeePreviousCompanyLocalService _service;
}