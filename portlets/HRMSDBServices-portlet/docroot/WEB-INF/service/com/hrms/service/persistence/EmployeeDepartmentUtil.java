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

import com.hrms.model.EmployeeDepartment;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the employee department service. This utility wraps {@link EmployeeDepartmentPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author yashpalsinh
 * @see EmployeeDepartmentPersistence
 * @see EmployeeDepartmentPersistenceImpl
 * @generated
 */
public class EmployeeDepartmentUtil {
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
	public static void clearCache(EmployeeDepartment employeeDepartment) {
		getPersistence().clearCache(employeeDepartment);
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
	public static List<EmployeeDepartment> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<EmployeeDepartment> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<EmployeeDepartment> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static EmployeeDepartment update(
		EmployeeDepartment employeeDepartment) throws SystemException {
		return getPersistence().update(employeeDepartment);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static EmployeeDepartment update(
		EmployeeDepartment employeeDepartment, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(employeeDepartment, serviceContext);
	}

	/**
	* Returns the employee department where employeeDepartmentId = &#63; or throws a {@link com.hrms.NoSuchEmployeeDepartmentException} if it could not be found.
	*
	* @param employeeDepartmentId the employee department ID
	* @return the matching employee department
	* @throws com.hrms.NoSuchEmployeeDepartmentException if a matching employee department could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeeDepartment findByemployeeDepartmentId(
		long employeeDepartmentId)
		throws com.hrms.NoSuchEmployeeDepartmentException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByemployeeDepartmentId(employeeDepartmentId);
	}

	/**
	* Returns the employee department where employeeDepartmentId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param employeeDepartmentId the employee department ID
	* @return the matching employee department, or <code>null</code> if a matching employee department could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeeDepartment fetchByemployeeDepartmentId(
		long employeeDepartmentId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByemployeeDepartmentId(employeeDepartmentId);
	}

	/**
	* Returns the employee department where employeeDepartmentId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param employeeDepartmentId the employee department ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching employee department, or <code>null</code> if a matching employee department could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeeDepartment fetchByemployeeDepartmentId(
		long employeeDepartmentId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByemployeeDepartmentId(employeeDepartmentId,
			retrieveFromCache);
	}

	/**
	* Removes the employee department where employeeDepartmentId = &#63; from the database.
	*
	* @param employeeDepartmentId the employee department ID
	* @return the employee department that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeeDepartment removeByemployeeDepartmentId(
		long employeeDepartmentId)
		throws com.hrms.NoSuchEmployeeDepartmentException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .removeByemployeeDepartmentId(employeeDepartmentId);
	}

	/**
	* Returns the number of employee departments where employeeDepartmentId = &#63;.
	*
	* @param employeeDepartmentId the employee department ID
	* @return the number of matching employee departments
	* @throws SystemException if a system exception occurred
	*/
	public static int countByemployeeDepartmentId(long employeeDepartmentId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByemployeeDepartmentId(employeeDepartmentId);
	}

	/**
	* Returns all the employee departments where status = &#63;.
	*
	* @param status the status
	* @return the matching employee departments
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hrms.model.EmployeeDepartment> findBystatus(
		boolean status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBystatus(status);
	}

	/**
	* Returns a range of all the employee departments where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeDepartmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param status the status
	* @param start the lower bound of the range of employee departments
	* @param end the upper bound of the range of employee departments (not inclusive)
	* @return the range of matching employee departments
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hrms.model.EmployeeDepartment> findBystatus(
		boolean status, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBystatus(status, start, end);
	}

	/**
	* Returns an ordered range of all the employee departments where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeDepartmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param status the status
	* @param start the lower bound of the range of employee departments
	* @param end the upper bound of the range of employee departments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching employee departments
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hrms.model.EmployeeDepartment> findBystatus(
		boolean status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBystatus(status, start, end, orderByComparator);
	}

	/**
	* Returns the first employee department in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching employee department
	* @throws com.hrms.NoSuchEmployeeDepartmentException if a matching employee department could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeeDepartment findBystatus_First(
		boolean status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hrms.NoSuchEmployeeDepartmentException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBystatus_First(status, orderByComparator);
	}

	/**
	* Returns the first employee department in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching employee department, or <code>null</code> if a matching employee department could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeeDepartment fetchBystatus_First(
		boolean status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchBystatus_First(status, orderByComparator);
	}

	/**
	* Returns the last employee department in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching employee department
	* @throws com.hrms.NoSuchEmployeeDepartmentException if a matching employee department could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeeDepartment findBystatus_Last(
		boolean status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hrms.NoSuchEmployeeDepartmentException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBystatus_Last(status, orderByComparator);
	}

	/**
	* Returns the last employee department in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching employee department, or <code>null</code> if a matching employee department could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeeDepartment fetchBystatus_Last(
		boolean status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchBystatus_Last(status, orderByComparator);
	}

	/**
	* Returns the employee departments before and after the current employee department in the ordered set where status = &#63;.
	*
	* @param employeeDepartmentId the primary key of the current employee department
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next employee department
	* @throws com.hrms.NoSuchEmployeeDepartmentException if a employee department with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeeDepartment[] findBystatus_PrevAndNext(
		long employeeDepartmentId, boolean status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hrms.NoSuchEmployeeDepartmentException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBystatus_PrevAndNext(employeeDepartmentId, status,
			orderByComparator);
	}

	/**
	* Removes all the employee departments where status = &#63; from the database.
	*
	* @param status the status
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBystatus(boolean status)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBystatus(status);
	}

	/**
	* Returns the number of employee departments where status = &#63;.
	*
	* @param status the status
	* @return the number of matching employee departments
	* @throws SystemException if a system exception occurred
	*/
	public static int countBystatus(boolean status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBystatus(status);
	}

	/**
	* Caches the employee department in the entity cache if it is enabled.
	*
	* @param employeeDepartment the employee department
	*/
	public static void cacheResult(
		com.hrms.model.EmployeeDepartment employeeDepartment) {
		getPersistence().cacheResult(employeeDepartment);
	}

	/**
	* Caches the employee departments in the entity cache if it is enabled.
	*
	* @param employeeDepartments the employee departments
	*/
	public static void cacheResult(
		java.util.List<com.hrms.model.EmployeeDepartment> employeeDepartments) {
		getPersistence().cacheResult(employeeDepartments);
	}

	/**
	* Creates a new employee department with the primary key. Does not add the employee department to the database.
	*
	* @param employeeDepartmentId the primary key for the new employee department
	* @return the new employee department
	*/
	public static com.hrms.model.EmployeeDepartment create(
		long employeeDepartmentId) {
		return getPersistence().create(employeeDepartmentId);
	}

	/**
	* Removes the employee department with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param employeeDepartmentId the primary key of the employee department
	* @return the employee department that was removed
	* @throws com.hrms.NoSuchEmployeeDepartmentException if a employee department with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeeDepartment remove(
		long employeeDepartmentId)
		throws com.hrms.NoSuchEmployeeDepartmentException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(employeeDepartmentId);
	}

	public static com.hrms.model.EmployeeDepartment updateImpl(
		com.hrms.model.EmployeeDepartment employeeDepartment)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(employeeDepartment);
	}

	/**
	* Returns the employee department with the primary key or throws a {@link com.hrms.NoSuchEmployeeDepartmentException} if it could not be found.
	*
	* @param employeeDepartmentId the primary key of the employee department
	* @return the employee department
	* @throws com.hrms.NoSuchEmployeeDepartmentException if a employee department with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeeDepartment findByPrimaryKey(
		long employeeDepartmentId)
		throws com.hrms.NoSuchEmployeeDepartmentException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(employeeDepartmentId);
	}

	/**
	* Returns the employee department with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param employeeDepartmentId the primary key of the employee department
	* @return the employee department, or <code>null</code> if a employee department with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeeDepartment fetchByPrimaryKey(
		long employeeDepartmentId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(employeeDepartmentId);
	}

	/**
	* Returns all the employee departments.
	*
	* @return the employee departments
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hrms.model.EmployeeDepartment> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<com.hrms.model.EmployeeDepartment> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the employee departments.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeDepartmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of employee departments
	* @param end the upper bound of the range of employee departments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of employee departments
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hrms.model.EmployeeDepartment> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the employee departments from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of employee departments.
	*
	* @return the number of employee departments
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static EmployeeDepartmentPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (EmployeeDepartmentPersistence)PortletBeanLocatorUtil.locate(com.hrms.service.ClpSerializer.getServletContextName(),
					EmployeeDepartmentPersistence.class.getName());

			ReferenceRegistry.registerReference(EmployeeDepartmentUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(EmployeeDepartmentPersistence persistence) {
	}

	private static EmployeeDepartmentPersistence _persistence;
}