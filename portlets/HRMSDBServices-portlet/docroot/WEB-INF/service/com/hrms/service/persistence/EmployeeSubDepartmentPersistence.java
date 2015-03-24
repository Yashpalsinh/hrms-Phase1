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

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the employee sub department service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author yashpalsinh
 * @see EmployeeSubDepartmentPersistenceImpl
 * @see EmployeeSubDepartmentUtil
 * @generated
 */
public interface EmployeeSubDepartmentPersistence extends BasePersistence<EmployeeSubDepartment> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link EmployeeSubDepartmentUtil} to access the employee sub department persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the employee sub department where employeeDepartmentId = &#63; or throws a {@link com.hrms.NoSuchEmployeeSubDepartmentException} if it could not be found.
	*
	* @param employeeDepartmentId the employee department ID
	* @return the matching employee sub department
	* @throws com.hrms.NoSuchEmployeeSubDepartmentException if a matching employee sub department could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeSubDepartment findByemployeeDepartmentId(
		long employeeDepartmentId)
		throws com.hrms.NoSuchEmployeeSubDepartmentException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the employee sub department where employeeDepartmentId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param employeeDepartmentId the employee department ID
	* @return the matching employee sub department, or <code>null</code> if a matching employee sub department could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeSubDepartment fetchByemployeeDepartmentId(
		long employeeDepartmentId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the employee sub department where employeeDepartmentId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param employeeDepartmentId the employee department ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching employee sub department, or <code>null</code> if a matching employee sub department could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeSubDepartment fetchByemployeeDepartmentId(
		long employeeDepartmentId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the employee sub department where employeeDepartmentId = &#63; from the database.
	*
	* @param employeeDepartmentId the employee department ID
	* @return the employee sub department that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeSubDepartment removeByemployeeDepartmentId(
		long employeeDepartmentId)
		throws com.hrms.NoSuchEmployeeSubDepartmentException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of employee sub departments where employeeDepartmentId = &#63;.
	*
	* @param employeeDepartmentId the employee department ID
	* @return the number of matching employee sub departments
	* @throws SystemException if a system exception occurred
	*/
	public int countByemployeeDepartmentId(long employeeDepartmentId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the employee sub department where status = &#63; or throws a {@link com.hrms.NoSuchEmployeeSubDepartmentException} if it could not be found.
	*
	* @param status the status
	* @return the matching employee sub department
	* @throws com.hrms.NoSuchEmployeeSubDepartmentException if a matching employee sub department could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeSubDepartment findBystatus(boolean status)
		throws com.hrms.NoSuchEmployeeSubDepartmentException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the employee sub department where status = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param status the status
	* @return the matching employee sub department, or <code>null</code> if a matching employee sub department could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeSubDepartment fetchBystatus(boolean status)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the employee sub department where status = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param status the status
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching employee sub department, or <code>null</code> if a matching employee sub department could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeSubDepartment fetchBystatus(boolean status,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the employee sub department where status = &#63; from the database.
	*
	* @param status the status
	* @return the employee sub department that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeSubDepartment removeBystatus(boolean status)
		throws com.hrms.NoSuchEmployeeSubDepartmentException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of employee sub departments where status = &#63;.
	*
	* @param status the status
	* @return the number of matching employee sub departments
	* @throws SystemException if a system exception occurred
	*/
	public int countBystatus(boolean status)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the employee sub departments where employeeDepartmentId = &#63; and status = &#63;.
	*
	* @param employeeDepartmentId the employee department ID
	* @param status the status
	* @return the matching employee sub departments
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hrms.model.EmployeeSubDepartment> findByDeptAndStatus(
		long employeeDepartmentId, boolean status)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.hrms.model.EmployeeSubDepartment> findByDeptAndStatus(
		long employeeDepartmentId, boolean status, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.hrms.model.EmployeeSubDepartment> findByDeptAndStatus(
		long employeeDepartmentId, boolean status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.hrms.model.EmployeeSubDepartment findByDeptAndStatus_First(
		long employeeDepartmentId, boolean status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hrms.NoSuchEmployeeSubDepartmentException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first employee sub department in the ordered set where employeeDepartmentId = &#63; and status = &#63;.
	*
	* @param employeeDepartmentId the employee department ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching employee sub department, or <code>null</code> if a matching employee sub department could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeSubDepartment fetchByDeptAndStatus_First(
		long employeeDepartmentId, boolean status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.hrms.model.EmployeeSubDepartment findByDeptAndStatus_Last(
		long employeeDepartmentId, boolean status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hrms.NoSuchEmployeeSubDepartmentException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last employee sub department in the ordered set where employeeDepartmentId = &#63; and status = &#63;.
	*
	* @param employeeDepartmentId the employee department ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching employee sub department, or <code>null</code> if a matching employee sub department could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeSubDepartment fetchByDeptAndStatus_Last(
		long employeeDepartmentId, boolean status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.hrms.model.EmployeeSubDepartment[] findByDeptAndStatus_PrevAndNext(
		long employeeSubDepartmentId, long employeeDepartmentId,
		boolean status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hrms.NoSuchEmployeeSubDepartmentException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the employee sub departments where employeeDepartmentId = &#63; and status = &#63; from the database.
	*
	* @param employeeDepartmentId the employee department ID
	* @param status the status
	* @throws SystemException if a system exception occurred
	*/
	public void removeByDeptAndStatus(long employeeDepartmentId, boolean status)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of employee sub departments where employeeDepartmentId = &#63; and status = &#63;.
	*
	* @param employeeDepartmentId the employee department ID
	* @param status the status
	* @return the number of matching employee sub departments
	* @throws SystemException if a system exception occurred
	*/
	public int countByDeptAndStatus(long employeeDepartmentId, boolean status)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the employee sub department in the entity cache if it is enabled.
	*
	* @param employeeSubDepartment the employee sub department
	*/
	public void cacheResult(
		com.hrms.model.EmployeeSubDepartment employeeSubDepartment);

	/**
	* Caches the employee sub departments in the entity cache if it is enabled.
	*
	* @param employeeSubDepartments the employee sub departments
	*/
	public void cacheResult(
		java.util.List<com.hrms.model.EmployeeSubDepartment> employeeSubDepartments);

	/**
	* Creates a new employee sub department with the primary key. Does not add the employee sub department to the database.
	*
	* @param employeeSubDepartmentId the primary key for the new employee sub department
	* @return the new employee sub department
	*/
	public com.hrms.model.EmployeeSubDepartment create(
		long employeeSubDepartmentId);

	/**
	* Removes the employee sub department with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param employeeSubDepartmentId the primary key of the employee sub department
	* @return the employee sub department that was removed
	* @throws com.hrms.NoSuchEmployeeSubDepartmentException if a employee sub department with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeSubDepartment remove(
		long employeeSubDepartmentId)
		throws com.hrms.NoSuchEmployeeSubDepartmentException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.hrms.model.EmployeeSubDepartment updateImpl(
		com.hrms.model.EmployeeSubDepartment employeeSubDepartment)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the employee sub department with the primary key or throws a {@link com.hrms.NoSuchEmployeeSubDepartmentException} if it could not be found.
	*
	* @param employeeSubDepartmentId the primary key of the employee sub department
	* @return the employee sub department
	* @throws com.hrms.NoSuchEmployeeSubDepartmentException if a employee sub department with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeSubDepartment findByPrimaryKey(
		long employeeSubDepartmentId)
		throws com.hrms.NoSuchEmployeeSubDepartmentException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the employee sub department with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param employeeSubDepartmentId the primary key of the employee sub department
	* @return the employee sub department, or <code>null</code> if a employee sub department with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeSubDepartment fetchByPrimaryKey(
		long employeeSubDepartmentId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the employee sub departments.
	*
	* @return the employee sub departments
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hrms.model.EmployeeSubDepartment> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.hrms.model.EmployeeSubDepartment> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.hrms.model.EmployeeSubDepartment> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the employee sub departments from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of employee sub departments.
	*
	* @return the number of employee sub departments
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}