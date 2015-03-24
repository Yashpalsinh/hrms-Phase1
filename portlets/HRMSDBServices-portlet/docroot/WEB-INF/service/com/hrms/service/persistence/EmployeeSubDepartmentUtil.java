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

import com.hrms.model.EmployeeSubDepartment;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the employee sub department service. This utility wraps {@link EmployeeSubDepartmentPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author bhavik
 * @see EmployeeSubDepartmentPersistence
 * @see EmployeeSubDepartmentPersistenceImpl
 * @generated
 */
public class EmployeeSubDepartmentUtil {
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
	public static void clearCache(EmployeeSubDepartment employeeSubDepartment) {
		getPersistence().clearCache(employeeSubDepartment);
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
	public static List<EmployeeSubDepartment> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<EmployeeSubDepartment> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<EmployeeSubDepartment> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static EmployeeSubDepartment update(
		EmployeeSubDepartment employeeSubDepartment) throws SystemException {
		return getPersistence().update(employeeSubDepartment);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static EmployeeSubDepartment update(
		EmployeeSubDepartment employeeSubDepartment,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(employeeSubDepartment, serviceContext);
	}

	/**
	* Returns the employee sub department where employeeDepartmentId = &#63; or throws a {@link com.hrms.NoSuchEmployeeSubDepartmentException} if it could not be found.
	*
	* @param employeeDepartmentId the employee department ID
	* @return the matching employee sub department
	* @throws com.hrms.NoSuchEmployeeSubDepartmentException if a matching employee sub department could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeeSubDepartment findByemployeeDepartmentId(
		long employeeDepartmentId)
		throws com.hrms.NoSuchEmployeeSubDepartmentException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByemployeeDepartmentId(employeeDepartmentId);
	}

	/**
	* Returns the employee sub department where employeeDepartmentId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param employeeDepartmentId the employee department ID
	* @return the matching employee sub department, or <code>null</code> if a matching employee sub department could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeeSubDepartment fetchByemployeeDepartmentId(
		long employeeDepartmentId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByemployeeDepartmentId(employeeDepartmentId);
	}

	/**
	* Returns the employee sub department where employeeDepartmentId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param employeeDepartmentId the employee department ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching employee sub department, or <code>null</code> if a matching employee sub department could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeeSubDepartment fetchByemployeeDepartmentId(
		long employeeDepartmentId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByemployeeDepartmentId(employeeDepartmentId,
			retrieveFromCache);
	}

	/**
	* Removes the employee sub department where employeeDepartmentId = &#63; from the database.
	*
	* @param employeeDepartmentId the employee department ID
	* @return the employee sub department that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeeSubDepartment removeByemployeeDepartmentId(
		long employeeDepartmentId)
		throws com.hrms.NoSuchEmployeeSubDepartmentException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .removeByemployeeDepartmentId(employeeDepartmentId);
	}

	/**
	* Returns the number of employee sub departments where employeeDepartmentId = &#63;.
	*
	* @param employeeDepartmentId the employee department ID
	* @return the number of matching employee sub departments
	* @throws SystemException if a system exception occurred
	*/
	public static int countByemployeeDepartmentId(long employeeDepartmentId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByemployeeDepartmentId(employeeDepartmentId);
	}

	/**
	* Returns the employee sub department where status = &#63; or throws a {@link com.hrms.NoSuchEmployeeSubDepartmentException} if it could not be found.
	*
	* @param status the status
	* @return the matching employee sub department
	* @throws com.hrms.NoSuchEmployeeSubDepartmentException if a matching employee sub department could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeeSubDepartment findBystatus(
		boolean status)
		throws com.hrms.NoSuchEmployeeSubDepartmentException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBystatus(status);
	}

	/**
	* Returns the employee sub department where status = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param status the status
	* @return the matching employee sub department, or <code>null</code> if a matching employee sub department could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeeSubDepartment fetchBystatus(
		boolean status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchBystatus(status);
	}

	/**
	* Returns the employee sub department where status = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param status the status
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching employee sub department, or <code>null</code> if a matching employee sub department could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeeSubDepartment fetchBystatus(
		boolean status, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchBystatus(status, retrieveFromCache);
	}

	/**
	* Removes the employee sub department where status = &#63; from the database.
	*
	* @param status the status
	* @return the employee sub department that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeeSubDepartment removeBystatus(
		boolean status)
		throws com.hrms.NoSuchEmployeeSubDepartmentException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().removeBystatus(status);
	}

	/**
	* Returns the number of employee sub departments where status = &#63;.
	*
	* @param status the status
	* @return the number of matching employee sub departments
	* @throws SystemException if a system exception occurred
	*/
	public static int countBystatus(boolean status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBystatus(status);
	}

	/**
	* Returns all the employee sub departments where employeeDepartmentId = &#63; and status = &#63;.
	*
	* @param employeeDepartmentId the employee department ID
	* @param status the status
	* @return the matching employee sub departments
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hrms.model.EmployeeSubDepartment> findByDeptAndStatus(
		long employeeDepartmentId, boolean status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByDeptAndStatus(employeeDepartmentId, status);
	}

	/**
	* Returns a range of all the employee sub departments where employeeDepartmentId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeSubDepartmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param employeeDepartmentId the employee department ID
	* @param status the status
	* @param start the lower bound of the range of employee sub departments
	* @param end the upper bound of the range of employee sub departments (not inclusive)
	* @return the range of matching employee sub departments
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hrms.model.EmployeeSubDepartment> findByDeptAndStatus(
		long employeeDepartmentId, boolean status, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDeptAndStatus(employeeDepartmentId, status, start, end);
	}

	/**
	* Returns an ordered range of all the employee sub departments where employeeDepartmentId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeSubDepartmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param employeeDepartmentId the employee department ID
	* @param status the status
	* @param start the lower bound of the range of employee sub departments
	* @param end the upper bound of the range of employee sub departments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching employee sub departments
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hrms.model.EmployeeSubDepartment> findByDeptAndStatus(
		long employeeDepartmentId, boolean status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDeptAndStatus(employeeDepartmentId, status, start,
			end, orderByComparator);
	}

	/**
	* Returns the first employee sub department in the ordered set where employeeDepartmentId = &#63; and status = &#63;.
	*
	* @param employeeDepartmentId the employee department ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching employee sub department
	* @throws com.hrms.NoSuchEmployeeSubDepartmentException if a matching employee sub department could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeeSubDepartment findByDeptAndStatus_First(
		long employeeDepartmentId, boolean status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hrms.NoSuchEmployeeSubDepartmentException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDeptAndStatus_First(employeeDepartmentId, status,
			orderByComparator);
	}

	/**
	* Returns the first employee sub department in the ordered set where employeeDepartmentId = &#63; and status = &#63;.
	*
	* @param employeeDepartmentId the employee department ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching employee sub department, or <code>null</code> if a matching employee sub department could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeeSubDepartment fetchByDeptAndStatus_First(
		long employeeDepartmentId, boolean status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDeptAndStatus_First(employeeDepartmentId, status,
			orderByComparator);
	}

	/**
	* Returns the last employee sub department in the ordered set where employeeDepartmentId = &#63; and status = &#63;.
	*
	* @param employeeDepartmentId the employee department ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching employee sub department
	* @throws com.hrms.NoSuchEmployeeSubDepartmentException if a matching employee sub department could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeeSubDepartment findByDeptAndStatus_Last(
		long employeeDepartmentId, boolean status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hrms.NoSuchEmployeeSubDepartmentException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDeptAndStatus_Last(employeeDepartmentId, status,
			orderByComparator);
	}

	/**
	* Returns the last employee sub department in the ordered set where employeeDepartmentId = &#63; and status = &#63;.
	*
	* @param employeeDepartmentId the employee department ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching employee sub department, or <code>null</code> if a matching employee sub department could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeeSubDepartment fetchByDeptAndStatus_Last(
		long employeeDepartmentId, boolean status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDeptAndStatus_Last(employeeDepartmentId, status,
			orderByComparator);
	}

	/**
	* Returns the employee sub departments before and after the current employee sub department in the ordered set where employeeDepartmentId = &#63; and status = &#63;.
	*
	* @param employeeSubDepartmentId the primary key of the current employee sub department
	* @param employeeDepartmentId the employee department ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next employee sub department
	* @throws com.hrms.NoSuchEmployeeSubDepartmentException if a employee sub department with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeeSubDepartment[] findByDeptAndStatus_PrevAndNext(
		long employeeSubDepartmentId, long employeeDepartmentId,
		boolean status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hrms.NoSuchEmployeeSubDepartmentException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDeptAndStatus_PrevAndNext(employeeSubDepartmentId,
			employeeDepartmentId, status, orderByComparator);
	}

	/**
	* Removes all the employee sub departments where employeeDepartmentId = &#63; and status = &#63; from the database.
	*
	* @param employeeDepartmentId the employee department ID
	* @param status the status
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByDeptAndStatus(long employeeDepartmentId,
		boolean status)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByDeptAndStatus(employeeDepartmentId, status);
	}

	/**
	* Returns the number of employee sub departments where employeeDepartmentId = &#63; and status = &#63;.
	*
	* @param employeeDepartmentId the employee department ID
	* @param status the status
	* @return the number of matching employee sub departments
	* @throws SystemException if a system exception occurred
	*/
	public static int countByDeptAndStatus(long employeeDepartmentId,
		boolean status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByDeptAndStatus(employeeDepartmentId, status);
	}

	/**
	* Caches the employee sub department in the entity cache if it is enabled.
	*
	* @param employeeSubDepartment the employee sub department
	*/
	public static void cacheResult(
		com.hrms.model.EmployeeSubDepartment employeeSubDepartment) {
		getPersistence().cacheResult(employeeSubDepartment);
	}

	/**
	* Caches the employee sub departments in the entity cache if it is enabled.
	*
	* @param employeeSubDepartments the employee sub departments
	*/
	public static void cacheResult(
		java.util.List<com.hrms.model.EmployeeSubDepartment> employeeSubDepartments) {
		getPersistence().cacheResult(employeeSubDepartments);
	}

	/**
	* Creates a new employee sub department with the primary key. Does not add the employee sub department to the database.
	*
	* @param employeeSubDepartmentId the primary key for the new employee sub department
	* @return the new employee sub department
	*/
	public static com.hrms.model.EmployeeSubDepartment create(
		long employeeSubDepartmentId) {
		return getPersistence().create(employeeSubDepartmentId);
	}

	/**
	* Removes the employee sub department with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param employeeSubDepartmentId the primary key of the employee sub department
	* @return the employee sub department that was removed
	* @throws com.hrms.NoSuchEmployeeSubDepartmentException if a employee sub department with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeeSubDepartment remove(
		long employeeSubDepartmentId)
		throws com.hrms.NoSuchEmployeeSubDepartmentException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(employeeSubDepartmentId);
	}

	public static com.hrms.model.EmployeeSubDepartment updateImpl(
		com.hrms.model.EmployeeSubDepartment employeeSubDepartment)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(employeeSubDepartment);
	}

	/**
	* Returns the employee sub department with the primary key or throws a {@link com.hrms.NoSuchEmployeeSubDepartmentException} if it could not be found.
	*
	* @param employeeSubDepartmentId the primary key of the employee sub department
	* @return the employee sub department
	* @throws com.hrms.NoSuchEmployeeSubDepartmentException if a employee sub department with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeeSubDepartment findByPrimaryKey(
		long employeeSubDepartmentId)
		throws com.hrms.NoSuchEmployeeSubDepartmentException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(employeeSubDepartmentId);
	}

	/**
	* Returns the employee sub department with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param employeeSubDepartmentId the primary key of the employee sub department
	* @return the employee sub department, or <code>null</code> if a employee sub department with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeeSubDepartment fetchByPrimaryKey(
		long employeeSubDepartmentId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(employeeSubDepartmentId);
	}

	/**
	* Returns all the employee sub departments.
	*
	* @return the employee sub departments
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hrms.model.EmployeeSubDepartment> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<com.hrms.model.EmployeeSubDepartment> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the employee sub departments.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeSubDepartmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of employee sub departments
	* @param end the upper bound of the range of employee sub departments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of employee sub departments
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hrms.model.EmployeeSubDepartment> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the employee sub departments from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of employee sub departments.
	*
	* @return the number of employee sub departments
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static EmployeeSubDepartmentPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (EmployeeSubDepartmentPersistence)PortletBeanLocatorUtil.locate(com.hrms.service.ClpSerializer.getServletContextName(),
					EmployeeSubDepartmentPersistence.class.getName());

			ReferenceRegistry.registerReference(EmployeeSubDepartmentUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(EmployeeSubDepartmentPersistence persistence) {
	}

	private static EmployeeSubDepartmentPersistence _persistence;
}