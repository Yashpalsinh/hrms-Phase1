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
 * Provides the local service utility for EmployeeLanguageDetail. This utility wraps
 * {@link com.hrms.service.impl.EmployeeLanguageDetailLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author bhavik
 * @see EmployeeLanguageDetailLocalService
 * @see com.hrms.service.base.EmployeeLanguageDetailLocalServiceBaseImpl
 * @see com.hrms.service.impl.EmployeeLanguageDetailLocalServiceImpl
 * @generated
 */
public class EmployeeLanguageDetailLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.hrms.service.impl.EmployeeLanguageDetailLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the employee language detail to the database. Also notifies the appropriate model listeners.
	*
	* @param employeeLanguageDetail the employee language detail
	* @return the employee language detail that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeeLanguageDetail addEmployeeLanguageDetail(
		com.hrms.model.EmployeeLanguageDetail employeeLanguageDetail)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addEmployeeLanguageDetail(employeeLanguageDetail);
	}

	/**
	* Creates a new employee language detail with the primary key. Does not add the employee language detail to the database.
	*
	* @param employeeLanguageDetailId the primary key for the new employee language detail
	* @return the new employee language detail
	*/
	public static com.hrms.model.EmployeeLanguageDetail createEmployeeLanguageDetail(
		long employeeLanguageDetailId) {
		return getService()
				   .createEmployeeLanguageDetail(employeeLanguageDetailId);
	}

	/**
	* Deletes the employee language detail with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param employeeLanguageDetailId the primary key of the employee language detail
	* @return the employee language detail that was removed
	* @throws PortalException if a employee language detail with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeeLanguageDetail deleteEmployeeLanguageDetail(
		long employeeLanguageDetailId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .deleteEmployeeLanguageDetail(employeeLanguageDetailId);
	}

	/**
	* Deletes the employee language detail from the database. Also notifies the appropriate model listeners.
	*
	* @param employeeLanguageDetail the employee language detail
	* @return the employee language detail that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeeLanguageDetail deleteEmployeeLanguageDetail(
		com.hrms.model.EmployeeLanguageDetail employeeLanguageDetail)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteEmployeeLanguageDetail(employeeLanguageDetail);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeLanguageDetailModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeLanguageDetailModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static com.hrms.model.EmployeeLanguageDetail fetchEmployeeLanguageDetail(
		long employeeLanguageDetailId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchEmployeeLanguageDetail(employeeLanguageDetailId);
	}

	/**
	* Returns the employee language detail with the primary key.
	*
	* @param employeeLanguageDetailId the primary key of the employee language detail
	* @return the employee language detail
	* @throws PortalException if a employee language detail with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeeLanguageDetail getEmployeeLanguageDetail(
		long employeeLanguageDetailId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getEmployeeLanguageDetail(employeeLanguageDetailId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the employee language details.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeLanguageDetailModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of employee language details
	* @param end the upper bound of the range of employee language details (not inclusive)
	* @return the range of employee language details
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hrms.model.EmployeeLanguageDetail> getEmployeeLanguageDetails(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getEmployeeLanguageDetails(start, end);
	}

	/**
	* Returns the number of employee language details.
	*
	* @return the number of employee language details
	* @throws SystemException if a system exception occurred
	*/
	public static int getEmployeeLanguageDetailsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getEmployeeLanguageDetailsCount();
	}

	/**
	* Updates the employee language detail in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param employeeLanguageDetail the employee language detail
	* @return the employee language detail that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeeLanguageDetail updateEmployeeLanguageDetail(
		com.hrms.model.EmployeeLanguageDetail employeeLanguageDetail)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateEmployeeLanguageDetail(employeeLanguageDetail);
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

	public static EmployeeLanguageDetailLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					EmployeeLanguageDetailLocalService.class.getName());

			if (invokableLocalService instanceof EmployeeLanguageDetailLocalService) {
				_service = (EmployeeLanguageDetailLocalService)invokableLocalService;
			}
			else {
				_service = new EmployeeLanguageDetailLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(EmployeeLanguageDetailLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(EmployeeLanguageDetailLocalService service) {
	}

	private static EmployeeLanguageDetailLocalService _service;
}