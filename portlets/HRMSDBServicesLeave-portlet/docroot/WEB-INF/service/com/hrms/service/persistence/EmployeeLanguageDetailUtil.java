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

package com.hrms.service.persistence;

import com.hrms.model.EmployeeLanguageDetail;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the employee language detail service. This utility wraps {@link EmployeeLanguageDetailPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author yashpalsinh
 * @see EmployeeLanguageDetailPersistence
 * @see EmployeeLanguageDetailPersistenceImpl
 * @generated
 */
public class EmployeeLanguageDetailUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(EmployeeLanguageDetail employeeLanguageDetail) {
		getPersistence().clearCache(employeeLanguageDetail);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<EmployeeLanguageDetail> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<EmployeeLanguageDetail> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<EmployeeLanguageDetail> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static EmployeeLanguageDetail update(
		EmployeeLanguageDetail employeeLanguageDetail)
		throws SystemException {
		return getPersistence().update(employeeLanguageDetail);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static EmployeeLanguageDetail update(
		EmployeeLanguageDetail employeeLanguageDetail,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(employeeLanguageDetail, serviceContext);
	}

	/**
	* Caches the employee language detail in the entity cache if it is enabled.
	*
	* @param employeeLanguageDetail the employee language detail
	*/
	public static void cacheResult(
		com.hrms.model.EmployeeLanguageDetail employeeLanguageDetail) {
		getPersistence().cacheResult(employeeLanguageDetail);
	}

	/**
	* Caches the employee language details in the entity cache if it is enabled.
	*
	* @param employeeLanguageDetails the employee language details
	*/
	public static void cacheResult(
		java.util.List<com.hrms.model.EmployeeLanguageDetail> employeeLanguageDetails) {
		getPersistence().cacheResult(employeeLanguageDetails);
	}

	/**
	* Creates a new employee language detail with the primary key. Does not add the employee language detail to the database.
	*
	* @param employeeLanguageDetailId the primary key for the new employee language detail
	* @return the new employee language detail
	*/
	public static com.hrms.model.EmployeeLanguageDetail create(
		long employeeLanguageDetailId) {
		return getPersistence().create(employeeLanguageDetailId);
	}

	/**
	* Removes the employee language detail with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param employeeLanguageDetailId the primary key of the employee language detail
	* @return the employee language detail that was removed
	* @throws com.hrms.NoSuchEmployeeLanguageDetailException if a employee language detail with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeeLanguageDetail remove(
		long employeeLanguageDetailId)
		throws com.hrms.NoSuchEmployeeLanguageDetailException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(employeeLanguageDetailId);
	}

	public static com.hrms.model.EmployeeLanguageDetail updateImpl(
		com.hrms.model.EmployeeLanguageDetail employeeLanguageDetail)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(employeeLanguageDetail);
	}

	/**
	* Returns the employee language detail with the primary key or throws a {@link com.hrms.NoSuchEmployeeLanguageDetailException} if it could not be found.
	*
	* @param employeeLanguageDetailId the primary key of the employee language detail
	* @return the employee language detail
	* @throws com.hrms.NoSuchEmployeeLanguageDetailException if a employee language detail with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeeLanguageDetail findByPrimaryKey(
		long employeeLanguageDetailId)
		throws com.hrms.NoSuchEmployeeLanguageDetailException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(employeeLanguageDetailId);
	}

	/**
	* Returns the employee language detail with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param employeeLanguageDetailId the primary key of the employee language detail
	* @return the employee language detail, or <code>null</code> if a employee language detail with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeeLanguageDetail fetchByPrimaryKey(
		long employeeLanguageDetailId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(employeeLanguageDetailId);
	}

	/**
	* Returns all the employee language details.
	*
	* @return the employee language details
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hrms.model.EmployeeLanguageDetail> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<com.hrms.model.EmployeeLanguageDetail> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the employee language details.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeLanguageDetailModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of employee language details
	* @param end the upper bound of the range of employee language details (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of employee language details
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hrms.model.EmployeeLanguageDetail> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the employee language details from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of employee language details.
	*
	* @return the number of employee language details
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static EmployeeLanguageDetailPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (EmployeeLanguageDetailPersistence)PortletBeanLocatorUtil.locate(com.hrms.service.ClpSerializer.getServletContextName(),
					EmployeeLanguageDetailPersistence.class.getName());

			ReferenceRegistry.registerReference(EmployeeLanguageDetailUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(EmployeeLanguageDetailPersistence persistence) {
	}

	private static EmployeeLanguageDetailPersistence _persistence;
}