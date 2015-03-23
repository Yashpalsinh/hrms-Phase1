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

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the employee department service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author yashpalsinh
 * @see EmployeeDepartmentPersistenceImpl
 * @see EmployeeDepartmentUtil
 * @generated
 */
public interface EmployeeDepartmentPersistence extends BasePersistence<EmployeeDepartment> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link EmployeeDepartmentUtil} to access the employee department persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the employee department where employeeDepartmentId = &#63; or throws a {@link com.hrms.NoSuchEmployeeDepartmentException} if it could not be found.
	*
	* @param employeeDepartmentId the employee department ID
	* @return the matching employee department
	* @throws com.hrms.NoSuchEmployeeDepartmentException if a matching employee department could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeDepartment findByemployeeDepartmentId(
		long employeeDepartmentId)
		throws com.hrms.NoSuchEmployeeDepartmentException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the employee department where employeeDepartmentId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param employeeDepartmentId the employee department ID
	* @return the matching employee department, or <code>null</code> if a matching employee department could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeDepartment fetchByemployeeDepartmentId(
		long employeeDepartmentId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the employee department where employeeDepartmentId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param employeeDepartmentId the employee department ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching employee department, or <code>null</code> if a matching employee department could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeDepartment fetchByemployeeDepartmentId(
		long employeeDepartmentId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the employee department where employeeDepartmentId = &#63; from the database.
	*
	* @param employeeDepartmentId the employee department ID
	* @return the employee department that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeDepartment removeByemployeeDepartmentId(
		long employeeDepartmentId)
		throws com.hrms.NoSuchEmployeeDepartmentException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of employee departments where employeeDepartmentId = &#63;.
	*
	* @param employeeDepartmentId the employee department ID
	* @return the number of matching employee departments
	* @throws SystemException if a system exception occurred
	*/
	public int countByemployeeDepartmentId(long employeeDepartmentId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the employee departments where status = &#63;.
	*
	* @param status the status
	* @return the matching employee departments
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hrms.model.EmployeeDepartment> findBystatus(
		boolean status)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.hrms.model.EmployeeDepartment> findBystatus(
		boolean status, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.hrms.model.EmployeeDepartment> findBystatus(
		boolean status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first employee department in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching employee department
	* @throws com.hrms.NoSuchEmployeeDepartmentException if a matching employee department could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeDepartment findBystatus_First(
		boolean status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hrms.NoSuchEmployeeDepartmentException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first employee department in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching employee department, or <code>null</code> if a matching employee department could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeDepartment fetchBystatus_First(
		boolean status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last employee department in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching employee department
	* @throws com.hrms.NoSuchEmployeeDepartmentException if a matching employee department could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeDepartment findBystatus_Last(boolean status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hrms.NoSuchEmployeeDepartmentException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last employee department in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching employee department, or <code>null</code> if a matching employee department could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeDepartment fetchBystatus_Last(
		boolean status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.hrms.model.EmployeeDepartment[] findBystatus_PrevAndNext(
		long employeeDepartmentId, boolean status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hrms.NoSuchEmployeeDepartmentException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the employee departments where status = &#63; from the database.
	*
	* @param status the status
	* @throws SystemException if a system exception occurred
	*/
	public void removeBystatus(boolean status)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of employee departments where status = &#63;.
	*
	* @param status the status
	* @return the number of matching employee departments
	* @throws SystemException if a system exception occurred
	*/
	public int countBystatus(boolean status)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the employee department in the entity cache if it is enabled.
	*
	* @param employeeDepartment the employee department
	*/
	public void cacheResult(
		com.hrms.model.EmployeeDepartment employeeDepartment);

	/**
	* Caches the employee departments in the entity cache if it is enabled.
	*
	* @param employeeDepartments the employee departments
	*/
	public void cacheResult(
		java.util.List<com.hrms.model.EmployeeDepartment> employeeDepartments);

	/**
	* Creates a new employee department with the primary key. Does not add the employee department to the database.
	*
	* @param employeeDepartmentId the primary key for the new employee department
	* @return the new employee department
	*/
	public com.hrms.model.EmployeeDepartment create(long employeeDepartmentId);

	/**
	* Removes the employee department with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param employeeDepartmentId the primary key of the employee department
	* @return the employee department that was removed
	* @throws com.hrms.NoSuchEmployeeDepartmentException if a employee department with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeDepartment remove(long employeeDepartmentId)
		throws com.hrms.NoSuchEmployeeDepartmentException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.hrms.model.EmployeeDepartment updateImpl(
		com.hrms.model.EmployeeDepartment employeeDepartment)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the employee department with the primary key or throws a {@link com.hrms.NoSuchEmployeeDepartmentException} if it could not be found.
	*
	* @param employeeDepartmentId the primary key of the employee department
	* @return the employee department
	* @throws com.hrms.NoSuchEmployeeDepartmentException if a employee department with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeDepartment findByPrimaryKey(
		long employeeDepartmentId)
		throws com.hrms.NoSuchEmployeeDepartmentException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the employee department with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param employeeDepartmentId the primary key of the employee department
	* @return the employee department, or <code>null</code> if a employee department with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeDepartment fetchByPrimaryKey(
		long employeeDepartmentId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the employee departments.
	*
	* @return the employee departments
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hrms.model.EmployeeDepartment> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.hrms.model.EmployeeDepartment> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.hrms.model.EmployeeDepartment> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the employee departments from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of employee departments.
	*
	* @return the number of employee departments
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}