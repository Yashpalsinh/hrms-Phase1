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

import com.hrms.model.EmployeeQualification;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the employee qualification service. This utility wraps {@link EmployeeQualificationPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author yashpalsinh
 * @see EmployeeQualificationPersistence
 * @see EmployeeQualificationPersistenceImpl
 * @generated
 */
public class EmployeeQualificationUtil {
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
	public static void clearCache(EmployeeQualification employeeQualification) {
		getPersistence().clearCache(employeeQualification);
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
	public static List<EmployeeQualification> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<EmployeeQualification> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<EmployeeQualification> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static EmployeeQualification update(
		EmployeeQualification employeeQualification) throws SystemException {
		return getPersistence().update(employeeQualification);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static EmployeeQualification update(
		EmployeeQualification employeeQualification,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(employeeQualification, serviceContext);
	}

	/**
	* Caches the employee qualification in the entity cache if it is enabled.
	*
	* @param employeeQualification the employee qualification
	*/
	public static void cacheResult(
		com.hrms.model.EmployeeQualification employeeQualification) {
		getPersistence().cacheResult(employeeQualification);
	}

	/**
	* Caches the employee qualifications in the entity cache if it is enabled.
	*
	* @param employeeQualifications the employee qualifications
	*/
	public static void cacheResult(
		java.util.List<com.hrms.model.EmployeeQualification> employeeQualifications) {
		getPersistence().cacheResult(employeeQualifications);
	}

	/**
	* Creates a new employee qualification with the primary key. Does not add the employee qualification to the database.
	*
	* @param employeeQualificationId the primary key for the new employee qualification
	* @return the new employee qualification
	*/
	public static com.hrms.model.EmployeeQualification create(
		long employeeQualificationId) {
		return getPersistence().create(employeeQualificationId);
	}

	/**
	* Removes the employee qualification with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param employeeQualificationId the primary key of the employee qualification
	* @return the employee qualification that was removed
	* @throws com.hrms.NoSuchEmployeeQualificationException if a employee qualification with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeeQualification remove(
		long employeeQualificationId)
		throws com.hrms.NoSuchEmployeeQualificationException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(employeeQualificationId);
	}

	public static com.hrms.model.EmployeeQualification updateImpl(
		com.hrms.model.EmployeeQualification employeeQualification)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(employeeQualification);
	}

	/**
	* Returns the employee qualification with the primary key or throws a {@link com.hrms.NoSuchEmployeeQualificationException} if it could not be found.
	*
	* @param employeeQualificationId the primary key of the employee qualification
	* @return the employee qualification
	* @throws com.hrms.NoSuchEmployeeQualificationException if a employee qualification with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeeQualification findByPrimaryKey(
		long employeeQualificationId)
		throws com.hrms.NoSuchEmployeeQualificationException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(employeeQualificationId);
	}

	/**
	* Returns the employee qualification with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param employeeQualificationId the primary key of the employee qualification
	* @return the employee qualification, or <code>null</code> if a employee qualification with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeeQualification fetchByPrimaryKey(
		long employeeQualificationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(employeeQualificationId);
	}

	/**
	* Returns all the employee qualifications.
	*
	* @return the employee qualifications
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hrms.model.EmployeeQualification> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the employee qualifications.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeQualificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of employee qualifications
	* @param end the upper bound of the range of employee qualifications (not inclusive)
	* @return the range of employee qualifications
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hrms.model.EmployeeQualification> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the employee qualifications.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeQualificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of employee qualifications
	* @param end the upper bound of the range of employee qualifications (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of employee qualifications
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hrms.model.EmployeeQualification> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the employee qualifications from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of employee qualifications.
	*
	* @return the number of employee qualifications
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static EmployeeQualificationPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (EmployeeQualificationPersistence)PortletBeanLocatorUtil.locate(com.hrms.service.ClpSerializer.getServletContextName(),
					EmployeeQualificationPersistence.class.getName());

			ReferenceRegistry.registerReference(EmployeeQualificationUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(EmployeeQualificationPersistence persistence) {
	}

	private static EmployeeQualificationPersistence _persistence;
}