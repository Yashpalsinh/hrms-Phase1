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

import com.hrms.model.EmployeeMaster;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the employee master service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author yashpalsinh
 * @see EmployeeMasterPersistenceImpl
 * @see EmployeeMasterUtil
 * @generated
 */
public interface EmployeeMasterPersistence extends BasePersistence<EmployeeMaster> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link EmployeeMasterUtil} to access the employee master persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the employee master where userId = &#63; or throws a {@link com.hrms.NoSuchEmployeeMasterException} if it could not be found.
	*
	* @param userId the user ID
	* @return the matching employee master
	* @throws com.hrms.NoSuchEmployeeMasterException if a matching employee master could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeMaster findByuserId(long userId)
		throws com.hrms.NoSuchEmployeeMasterException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the employee master where userId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param userId the user ID
	* @return the matching employee master, or <code>null</code> if a matching employee master could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeMaster fetchByuserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the employee master where userId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param userId the user ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching employee master, or <code>null</code> if a matching employee master could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeMaster fetchByuserId(long userId,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the employee master where userId = &#63; from the database.
	*
	* @param userId the user ID
	* @return the employee master that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeMaster removeByuserId(long userId)
		throws com.hrms.NoSuchEmployeeMasterException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of employee masters where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching employee masters
	* @throws SystemException if a system exception occurred
	*/
	public int countByuserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the employee masters where createBy = &#63;.
	*
	* @param createBy the create by
	* @return the matching employee masters
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hrms.model.EmployeeMaster> findBycreateBy(
		int createBy)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the employee masters where createBy = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param createBy the create by
	* @param start the lower bound of the range of employee masters
	* @param end the upper bound of the range of employee masters (not inclusive)
	* @return the range of matching employee masters
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hrms.model.EmployeeMaster> findBycreateBy(
		int createBy, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the employee masters where createBy = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param createBy the create by
	* @param start the lower bound of the range of employee masters
	* @param end the upper bound of the range of employee masters (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching employee masters
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hrms.model.EmployeeMaster> findBycreateBy(
		int createBy, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first employee master in the ordered set where createBy = &#63;.
	*
	* @param createBy the create by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching employee master
	* @throws com.hrms.NoSuchEmployeeMasterException if a matching employee master could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeMaster findBycreateBy_First(int createBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hrms.NoSuchEmployeeMasterException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first employee master in the ordered set where createBy = &#63;.
	*
	* @param createBy the create by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching employee master, or <code>null</code> if a matching employee master could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeMaster fetchBycreateBy_First(int createBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last employee master in the ordered set where createBy = &#63;.
	*
	* @param createBy the create by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching employee master
	* @throws com.hrms.NoSuchEmployeeMasterException if a matching employee master could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeMaster findBycreateBy_Last(int createBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hrms.NoSuchEmployeeMasterException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last employee master in the ordered set where createBy = &#63;.
	*
	* @param createBy the create by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching employee master, or <code>null</code> if a matching employee master could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeMaster fetchBycreateBy_Last(int createBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the employee masters before and after the current employee master in the ordered set where createBy = &#63;.
	*
	* @param employeeMasterId the primary key of the current employee master
	* @param createBy the create by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next employee master
	* @throws com.hrms.NoSuchEmployeeMasterException if a employee master with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeMaster[] findBycreateBy_PrevAndNext(
		long employeeMasterId, int createBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hrms.NoSuchEmployeeMasterException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the employee masters where createBy = &#63; from the database.
	*
	* @param createBy the create by
	* @throws SystemException if a system exception occurred
	*/
	public void removeBycreateBy(int createBy)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of employee masters where createBy = &#63;.
	*
	* @param createBy the create by
	* @return the number of matching employee masters
	* @throws SystemException if a system exception occurred
	*/
	public int countBycreateBy(int createBy)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the employee masters where modifiedBy = &#63;.
	*
	* @param modifiedBy the modified by
	* @return the matching employee masters
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hrms.model.EmployeeMaster> findBymodifiedBy(
		int modifiedBy)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the employee masters where modifiedBy = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param modifiedBy the modified by
	* @param start the lower bound of the range of employee masters
	* @param end the upper bound of the range of employee masters (not inclusive)
	* @return the range of matching employee masters
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hrms.model.EmployeeMaster> findBymodifiedBy(
		int modifiedBy, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the employee masters where modifiedBy = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param modifiedBy the modified by
	* @param start the lower bound of the range of employee masters
	* @param end the upper bound of the range of employee masters (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching employee masters
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hrms.model.EmployeeMaster> findBymodifiedBy(
		int modifiedBy, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first employee master in the ordered set where modifiedBy = &#63;.
	*
	* @param modifiedBy the modified by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching employee master
	* @throws com.hrms.NoSuchEmployeeMasterException if a matching employee master could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeMaster findBymodifiedBy_First(
		int modifiedBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hrms.NoSuchEmployeeMasterException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first employee master in the ordered set where modifiedBy = &#63;.
	*
	* @param modifiedBy the modified by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching employee master, or <code>null</code> if a matching employee master could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeMaster fetchBymodifiedBy_First(
		int modifiedBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last employee master in the ordered set where modifiedBy = &#63;.
	*
	* @param modifiedBy the modified by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching employee master
	* @throws com.hrms.NoSuchEmployeeMasterException if a matching employee master could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeMaster findBymodifiedBy_Last(int modifiedBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hrms.NoSuchEmployeeMasterException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last employee master in the ordered set where modifiedBy = &#63;.
	*
	* @param modifiedBy the modified by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching employee master, or <code>null</code> if a matching employee master could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeMaster fetchBymodifiedBy_Last(
		int modifiedBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the employee masters before and after the current employee master in the ordered set where modifiedBy = &#63;.
	*
	* @param employeeMasterId the primary key of the current employee master
	* @param modifiedBy the modified by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next employee master
	* @throws com.hrms.NoSuchEmployeeMasterException if a employee master with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeMaster[] findBymodifiedBy_PrevAndNext(
		long employeeMasterId, int modifiedBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hrms.NoSuchEmployeeMasterException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the employee masters where modifiedBy = &#63; from the database.
	*
	* @param modifiedBy the modified by
	* @throws SystemException if a system exception occurred
	*/
	public void removeBymodifiedBy(int modifiedBy)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of employee masters where modifiedBy = &#63;.
	*
	* @param modifiedBy the modified by
	* @return the number of matching employee masters
	* @throws SystemException if a system exception occurred
	*/
	public int countBymodifiedBy(int modifiedBy)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the employee master in the entity cache if it is enabled.
	*
	* @param employeeMaster the employee master
	*/
	public void cacheResult(com.hrms.model.EmployeeMaster employeeMaster);

	/**
	* Caches the employee masters in the entity cache if it is enabled.
	*
	* @param employeeMasters the employee masters
	*/
	public void cacheResult(
		java.util.List<com.hrms.model.EmployeeMaster> employeeMasters);

	/**
	* Creates a new employee master with the primary key. Does not add the employee master to the database.
	*
	* @param employeeMasterId the primary key for the new employee master
	* @return the new employee master
	*/
	public com.hrms.model.EmployeeMaster create(long employeeMasterId);

	/**
	* Removes the employee master with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param employeeMasterId the primary key of the employee master
	* @return the employee master that was removed
	* @throws com.hrms.NoSuchEmployeeMasterException if a employee master with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeMaster remove(long employeeMasterId)
		throws com.hrms.NoSuchEmployeeMasterException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.hrms.model.EmployeeMaster updateImpl(
		com.hrms.model.EmployeeMaster employeeMaster)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the employee master with the primary key or throws a {@link com.hrms.NoSuchEmployeeMasterException} if it could not be found.
	*
	* @param employeeMasterId the primary key of the employee master
	* @return the employee master
	* @throws com.hrms.NoSuchEmployeeMasterException if a employee master with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeMaster findByPrimaryKey(long employeeMasterId)
		throws com.hrms.NoSuchEmployeeMasterException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the employee master with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param employeeMasterId the primary key of the employee master
	* @return the employee master, or <code>null</code> if a employee master with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeMaster fetchByPrimaryKey(
		long employeeMasterId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the employee masters.
	*
	* @return the employee masters
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hrms.model.EmployeeMaster> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the employee masters.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of employee masters
	* @param end the upper bound of the range of employee masters (not inclusive)
	* @return the range of employee masters
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hrms.model.EmployeeMaster> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the employee masters.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of employee masters
	* @param end the upper bound of the range of employee masters (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of employee masters
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hrms.model.EmployeeMaster> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the employee masters from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of employee masters.
	*
	* @return the number of employee masters
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}