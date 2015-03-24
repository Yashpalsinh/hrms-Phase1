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

import com.hrms.model.EmployeeMst;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the employee mst service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author yashpalsinh
 * @see EmployeeMstPersistenceImpl
 * @see EmployeeMstUtil
 * @generated
 */
public interface EmployeeMstPersistence extends BasePersistence<EmployeeMst> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link EmployeeMstUtil} to access the employee mst persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the employee mst where userId = &#63; or throws a {@link com.hrms.NoSuchEmployeeMstException} if it could not be found.
	*
	* @param userId the user ID
	* @return the matching employee mst
	* @throws com.hrms.NoSuchEmployeeMstException if a matching employee mst could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeMst findByuserId(long userId)
		throws com.hrms.NoSuchEmployeeMstException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the employee mst where userId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param userId the user ID
	* @return the matching employee mst, or <code>null</code> if a matching employee mst could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeMst fetchByuserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the employee mst where userId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param userId the user ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching employee mst, or <code>null</code> if a matching employee mst could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeMst fetchByuserId(long userId,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the employee mst where userId = &#63; from the database.
	*
	* @param userId the user ID
	* @return the employee mst that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeMst removeByuserId(long userId)
		throws com.hrms.NoSuchEmployeeMstException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of employee msts where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching employee msts
	* @throws SystemException if a system exception occurred
	*/
	public int countByuserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the employee msts where createBy = &#63;.
	*
	* @param createBy the create by
	* @return the matching employee msts
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hrms.model.EmployeeMst> findBycreateBy(
		long createBy)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the employee msts where createBy = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeMstModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param createBy the create by
	* @param start the lower bound of the range of employee msts
	* @param end the upper bound of the range of employee msts (not inclusive)
	* @return the range of matching employee msts
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hrms.model.EmployeeMst> findBycreateBy(
		long createBy, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the employee msts where createBy = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeMstModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param createBy the create by
	* @param start the lower bound of the range of employee msts
	* @param end the upper bound of the range of employee msts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching employee msts
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hrms.model.EmployeeMst> findBycreateBy(
		long createBy, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first employee mst in the ordered set where createBy = &#63;.
	*
	* @param createBy the create by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching employee mst
	* @throws com.hrms.NoSuchEmployeeMstException if a matching employee mst could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeMst findBycreateBy_First(long createBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hrms.NoSuchEmployeeMstException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first employee mst in the ordered set where createBy = &#63;.
	*
	* @param createBy the create by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching employee mst, or <code>null</code> if a matching employee mst could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeMst fetchBycreateBy_First(long createBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last employee mst in the ordered set where createBy = &#63;.
	*
	* @param createBy the create by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching employee mst
	* @throws com.hrms.NoSuchEmployeeMstException if a matching employee mst could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeMst findBycreateBy_Last(long createBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hrms.NoSuchEmployeeMstException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last employee mst in the ordered set where createBy = &#63;.
	*
	* @param createBy the create by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching employee mst, or <code>null</code> if a matching employee mst could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeMst fetchBycreateBy_Last(long createBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the employee msts before and after the current employee mst in the ordered set where createBy = &#63;.
	*
	* @param employeeMstId the primary key of the current employee mst
	* @param createBy the create by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next employee mst
	* @throws com.hrms.NoSuchEmployeeMstException if a employee mst with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeMst[] findBycreateBy_PrevAndNext(
		long employeeMstId, long createBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hrms.NoSuchEmployeeMstException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the employee msts where createBy = &#63; from the database.
	*
	* @param createBy the create by
	* @throws SystemException if a system exception occurred
	*/
	public void removeBycreateBy(long createBy)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of employee msts where createBy = &#63;.
	*
	* @param createBy the create by
	* @return the number of matching employee msts
	* @throws SystemException if a system exception occurred
	*/
	public int countBycreateBy(long createBy)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the employee msts where modifiedBy = &#63;.
	*
	* @param modifiedBy the modified by
	* @return the matching employee msts
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hrms.model.EmployeeMst> findBymodifiedBy(
		long modifiedBy)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the employee msts where modifiedBy = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeMstModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param modifiedBy the modified by
	* @param start the lower bound of the range of employee msts
	* @param end the upper bound of the range of employee msts (not inclusive)
	* @return the range of matching employee msts
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hrms.model.EmployeeMst> findBymodifiedBy(
		long modifiedBy, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the employee msts where modifiedBy = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeMstModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param modifiedBy the modified by
	* @param start the lower bound of the range of employee msts
	* @param end the upper bound of the range of employee msts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching employee msts
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hrms.model.EmployeeMst> findBymodifiedBy(
		long modifiedBy, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first employee mst in the ordered set where modifiedBy = &#63;.
	*
	* @param modifiedBy the modified by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching employee mst
	* @throws com.hrms.NoSuchEmployeeMstException if a matching employee mst could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeMst findBymodifiedBy_First(long modifiedBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hrms.NoSuchEmployeeMstException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first employee mst in the ordered set where modifiedBy = &#63;.
	*
	* @param modifiedBy the modified by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching employee mst, or <code>null</code> if a matching employee mst could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeMst fetchBymodifiedBy_First(long modifiedBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last employee mst in the ordered set where modifiedBy = &#63;.
	*
	* @param modifiedBy the modified by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching employee mst
	* @throws com.hrms.NoSuchEmployeeMstException if a matching employee mst could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeMst findBymodifiedBy_Last(long modifiedBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hrms.NoSuchEmployeeMstException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last employee mst in the ordered set where modifiedBy = &#63;.
	*
	* @param modifiedBy the modified by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching employee mst, or <code>null</code> if a matching employee mst could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeMst fetchBymodifiedBy_Last(long modifiedBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the employee msts before and after the current employee mst in the ordered set where modifiedBy = &#63;.
	*
	* @param employeeMstId the primary key of the current employee mst
	* @param modifiedBy the modified by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next employee mst
	* @throws com.hrms.NoSuchEmployeeMstException if a employee mst with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeMst[] findBymodifiedBy_PrevAndNext(
		long employeeMstId, long modifiedBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hrms.NoSuchEmployeeMstException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the employee msts where modifiedBy = &#63; from the database.
	*
	* @param modifiedBy the modified by
	* @throws SystemException if a system exception occurred
	*/
	public void removeBymodifiedBy(long modifiedBy)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of employee msts where modifiedBy = &#63;.
	*
	* @param modifiedBy the modified by
	* @return the number of matching employee msts
	* @throws SystemException if a system exception occurred
	*/
	public int countBymodifiedBy(long modifiedBy)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the employee mst in the entity cache if it is enabled.
	*
	* @param employeeMst the employee mst
	*/
	public void cacheResult(com.hrms.model.EmployeeMst employeeMst);

	/**
	* Caches the employee msts in the entity cache if it is enabled.
	*
	* @param employeeMsts the employee msts
	*/
	public void cacheResult(
		java.util.List<com.hrms.model.EmployeeMst> employeeMsts);

	/**
	* Creates a new employee mst with the primary key. Does not add the employee mst to the database.
	*
	* @param employeeMstId the primary key for the new employee mst
	* @return the new employee mst
	*/
	public com.hrms.model.EmployeeMst create(long employeeMstId);

	/**
	* Removes the employee mst with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param employeeMstId the primary key of the employee mst
	* @return the employee mst that was removed
	* @throws com.hrms.NoSuchEmployeeMstException if a employee mst with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeMst remove(long employeeMstId)
		throws com.hrms.NoSuchEmployeeMstException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.hrms.model.EmployeeMst updateImpl(
		com.hrms.model.EmployeeMst employeeMst)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the employee mst with the primary key or throws a {@link com.hrms.NoSuchEmployeeMstException} if it could not be found.
	*
	* @param employeeMstId the primary key of the employee mst
	* @return the employee mst
	* @throws com.hrms.NoSuchEmployeeMstException if a employee mst with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeMst findByPrimaryKey(long employeeMstId)
		throws com.hrms.NoSuchEmployeeMstException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the employee mst with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param employeeMstId the primary key of the employee mst
	* @return the employee mst, or <code>null</code> if a employee mst with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeMst fetchByPrimaryKey(long employeeMstId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the employee msts.
	*
	* @return the employee msts
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hrms.model.EmployeeMst> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the employee msts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeMstModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of employee msts
	* @param end the upper bound of the range of employee msts (not inclusive)
	* @return the range of employee msts
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hrms.model.EmployeeMst> findAll(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the employee msts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeMstModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of employee msts
	* @param end the upper bound of the range of employee msts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of employee msts
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hrms.model.EmployeeMst> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the employee msts from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of employee msts.
	*
	* @return the number of employee msts
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}