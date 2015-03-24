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

import com.hrms.model.EmployeeDesignation;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the employee designation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author yashpalsinh
 * @see EmployeeDesignationPersistenceImpl
 * @see EmployeeDesignationUtil
 * @generated
 */
public interface EmployeeDesignationPersistence extends BasePersistence<EmployeeDesignation> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link EmployeeDesignationUtil} to access the employee designation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the employee designations where status = &#63;.
	*
	* @param status the status
	* @return the matching employee designations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hrms.model.EmployeeDesignation> findBystatus(
		boolean status)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the employee designations where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeDesignationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param status the status
	* @param start the lower bound of the range of employee designations
	* @param end the upper bound of the range of employee designations (not inclusive)
	* @return the range of matching employee designations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hrms.model.EmployeeDesignation> findBystatus(
		boolean status, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the employee designations where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeDesignationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param status the status
	* @param start the lower bound of the range of employee designations
	* @param end the upper bound of the range of employee designations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching employee designations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hrms.model.EmployeeDesignation> findBystatus(
		boolean status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first employee designation in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching employee designation
	* @throws com.hrms.NoSuchEmployeeDesignationException if a matching employee designation could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeDesignation findBystatus_First(
		boolean status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hrms.NoSuchEmployeeDesignationException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first employee designation in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching employee designation, or <code>null</code> if a matching employee designation could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeDesignation fetchBystatus_First(
		boolean status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last employee designation in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching employee designation
	* @throws com.hrms.NoSuchEmployeeDesignationException if a matching employee designation could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeDesignation findBystatus_Last(
		boolean status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hrms.NoSuchEmployeeDesignationException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last employee designation in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching employee designation, or <code>null</code> if a matching employee designation could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeDesignation fetchBystatus_Last(
		boolean status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the employee designations before and after the current employee designation in the ordered set where status = &#63;.
	*
	* @param employeeDesignationId the primary key of the current employee designation
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next employee designation
	* @throws com.hrms.NoSuchEmployeeDesignationException if a employee designation with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeDesignation[] findBystatus_PrevAndNext(
		long employeeDesignationId, boolean status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hrms.NoSuchEmployeeDesignationException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the employee designations where status = &#63; from the database.
	*
	* @param status the status
	* @throws SystemException if a system exception occurred
	*/
	public void removeBystatus(boolean status)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of employee designations where status = &#63;.
	*
	* @param status the status
	* @return the number of matching employee designations
	* @throws SystemException if a system exception occurred
	*/
	public int countBystatus(boolean status)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the employee designation in the entity cache if it is enabled.
	*
	* @param employeeDesignation the employee designation
	*/
	public void cacheResult(
		com.hrms.model.EmployeeDesignation employeeDesignation);

	/**
	* Caches the employee designations in the entity cache if it is enabled.
	*
	* @param employeeDesignations the employee designations
	*/
	public void cacheResult(
		java.util.List<com.hrms.model.EmployeeDesignation> employeeDesignations);

	/**
	* Creates a new employee designation with the primary key. Does not add the employee designation to the database.
	*
	* @param employeeDesignationId the primary key for the new employee designation
	* @return the new employee designation
	*/
	public com.hrms.model.EmployeeDesignation create(long employeeDesignationId);

	/**
	* Removes the employee designation with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param employeeDesignationId the primary key of the employee designation
	* @return the employee designation that was removed
	* @throws com.hrms.NoSuchEmployeeDesignationException if a employee designation with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeDesignation remove(long employeeDesignationId)
		throws com.hrms.NoSuchEmployeeDesignationException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.hrms.model.EmployeeDesignation updateImpl(
		com.hrms.model.EmployeeDesignation employeeDesignation)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the employee designation with the primary key or throws a {@link com.hrms.NoSuchEmployeeDesignationException} if it could not be found.
	*
	* @param employeeDesignationId the primary key of the employee designation
	* @return the employee designation
	* @throws com.hrms.NoSuchEmployeeDesignationException if a employee designation with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeDesignation findByPrimaryKey(
		long employeeDesignationId)
		throws com.hrms.NoSuchEmployeeDesignationException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the employee designation with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param employeeDesignationId the primary key of the employee designation
	* @return the employee designation, or <code>null</code> if a employee designation with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeDesignation fetchByPrimaryKey(
		long employeeDesignationId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the employee designations.
	*
	* @return the employee designations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hrms.model.EmployeeDesignation> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.hrms.model.EmployeeDesignation> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the employee designations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeDesignationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of employee designations
	* @param end the upper bound of the range of employee designations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of employee designations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hrms.model.EmployeeDesignation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the employee designations from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of employee designations.
	*
	* @return the number of employee designations
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}