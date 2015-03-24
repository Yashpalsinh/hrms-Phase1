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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the employee mst service. This utility wraps {@link EmployeeMstPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author yashpalsinh
 * @see EmployeeMstPersistence
 * @see EmployeeMstPersistenceImpl
 * @generated
 */
public class EmployeeMstUtil {
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
	public static void clearCache(EmployeeMst employeeMst) {
		getPersistence().clearCache(employeeMst);
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
	public static List<EmployeeMst> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<EmployeeMst> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<EmployeeMst> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static EmployeeMst update(EmployeeMst employeeMst)
		throws SystemException {
		return getPersistence().update(employeeMst);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static EmployeeMst update(EmployeeMst employeeMst,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(employeeMst, serviceContext);
	}

	/**
	* Returns the employee mst where userId = &#63; or throws a {@link com.hrms.NoSuchEmployeeMstException} if it could not be found.
	*
	* @param userId the user ID
	* @return the matching employee mst
	* @throws com.hrms.NoSuchEmployeeMstException if a matching employee mst could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeeMst findByuserId(long userId)
		throws com.hrms.NoSuchEmployeeMstException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByuserId(userId);
	}

	/**
	* Returns the employee mst where userId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param userId the user ID
	* @return the matching employee mst, or <code>null</code> if a matching employee mst could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeeMst fetchByuserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByuserId(userId);
	}

	/**
	* Returns the employee mst where userId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param userId the user ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching employee mst, or <code>null</code> if a matching employee mst could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeeMst fetchByuserId(long userId,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByuserId(userId, retrieveFromCache);
	}

	/**
	* Removes the employee mst where userId = &#63; from the database.
	*
	* @param userId the user ID
	* @return the employee mst that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeeMst removeByuserId(long userId)
		throws com.hrms.NoSuchEmployeeMstException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().removeByuserId(userId);
	}

	/**
	* Returns the number of employee msts where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching employee msts
	* @throws SystemException if a system exception occurred
	*/
	public static int countByuserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByuserId(userId);
	}

	/**
	* Returns all the employee msts where createBy = &#63;.
	*
	* @param createBy the create by
	* @return the matching employee msts
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hrms.model.EmployeeMst> findBycreateBy(
		long createBy)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBycreateBy(createBy);
	}

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
	public static java.util.List<com.hrms.model.EmployeeMst> findBycreateBy(
		long createBy, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBycreateBy(createBy, start, end);
	}

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
	public static java.util.List<com.hrms.model.EmployeeMst> findBycreateBy(
		long createBy, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBycreateBy(createBy, start, end, orderByComparator);
	}

	/**
	* Returns the first employee mst in the ordered set where createBy = &#63;.
	*
	* @param createBy the create by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching employee mst
	* @throws com.hrms.NoSuchEmployeeMstException if a matching employee mst could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeeMst findBycreateBy_First(
		long createBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hrms.NoSuchEmployeeMstException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBycreateBy_First(createBy, orderByComparator);
	}

	/**
	* Returns the first employee mst in the ordered set where createBy = &#63;.
	*
	* @param createBy the create by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching employee mst, or <code>null</code> if a matching employee mst could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeeMst fetchBycreateBy_First(
		long createBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBycreateBy_First(createBy, orderByComparator);
	}

	/**
	* Returns the last employee mst in the ordered set where createBy = &#63;.
	*
	* @param createBy the create by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching employee mst
	* @throws com.hrms.NoSuchEmployeeMstException if a matching employee mst could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeeMst findBycreateBy_Last(
		long createBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hrms.NoSuchEmployeeMstException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBycreateBy_Last(createBy, orderByComparator);
	}

	/**
	* Returns the last employee mst in the ordered set where createBy = &#63;.
	*
	* @param createBy the create by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching employee mst, or <code>null</code> if a matching employee mst could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeeMst fetchBycreateBy_Last(
		long createBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchBycreateBy_Last(createBy, orderByComparator);
	}

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
	public static com.hrms.model.EmployeeMst[] findBycreateBy_PrevAndNext(
		long employeeMstId, long createBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hrms.NoSuchEmployeeMstException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBycreateBy_PrevAndNext(employeeMstId, createBy,
			orderByComparator);
	}

	/**
	* Removes all the employee msts where createBy = &#63; from the database.
	*
	* @param createBy the create by
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBycreateBy(long createBy)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBycreateBy(createBy);
	}

	/**
	* Returns the number of employee msts where createBy = &#63;.
	*
	* @param createBy the create by
	* @return the number of matching employee msts
	* @throws SystemException if a system exception occurred
	*/
	public static int countBycreateBy(long createBy)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBycreateBy(createBy);
	}

	/**
	* Returns all the employee msts where modifiedBy = &#63;.
	*
	* @param modifiedBy the modified by
	* @return the matching employee msts
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hrms.model.EmployeeMst> findBymodifiedBy(
		long modifiedBy)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBymodifiedBy(modifiedBy);
	}

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
	public static java.util.List<com.hrms.model.EmployeeMst> findBymodifiedBy(
		long modifiedBy, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBymodifiedBy(modifiedBy, start, end);
	}

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
	public static java.util.List<com.hrms.model.EmployeeMst> findBymodifiedBy(
		long modifiedBy, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBymodifiedBy(modifiedBy, start, end, orderByComparator);
	}

	/**
	* Returns the first employee mst in the ordered set where modifiedBy = &#63;.
	*
	* @param modifiedBy the modified by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching employee mst
	* @throws com.hrms.NoSuchEmployeeMstException if a matching employee mst could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeeMst findBymodifiedBy_First(
		long modifiedBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hrms.NoSuchEmployeeMstException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBymodifiedBy_First(modifiedBy, orderByComparator);
	}

	/**
	* Returns the first employee mst in the ordered set where modifiedBy = &#63;.
	*
	* @param modifiedBy the modified by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching employee mst, or <code>null</code> if a matching employee mst could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeeMst fetchBymodifiedBy_First(
		long modifiedBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBymodifiedBy_First(modifiedBy, orderByComparator);
	}

	/**
	* Returns the last employee mst in the ordered set where modifiedBy = &#63;.
	*
	* @param modifiedBy the modified by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching employee mst
	* @throws com.hrms.NoSuchEmployeeMstException if a matching employee mst could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeeMst findBymodifiedBy_Last(
		long modifiedBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hrms.NoSuchEmployeeMstException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBymodifiedBy_Last(modifiedBy, orderByComparator);
	}

	/**
	* Returns the last employee mst in the ordered set where modifiedBy = &#63;.
	*
	* @param modifiedBy the modified by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching employee mst, or <code>null</code> if a matching employee mst could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeeMst fetchBymodifiedBy_Last(
		long modifiedBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBymodifiedBy_Last(modifiedBy, orderByComparator);
	}

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
	public static com.hrms.model.EmployeeMst[] findBymodifiedBy_PrevAndNext(
		long employeeMstId, long modifiedBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hrms.NoSuchEmployeeMstException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBymodifiedBy_PrevAndNext(employeeMstId, modifiedBy,
			orderByComparator);
	}

	/**
	* Removes all the employee msts where modifiedBy = &#63; from the database.
	*
	* @param modifiedBy the modified by
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBymodifiedBy(long modifiedBy)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBymodifiedBy(modifiedBy);
	}

	/**
	* Returns the number of employee msts where modifiedBy = &#63;.
	*
	* @param modifiedBy the modified by
	* @return the number of matching employee msts
	* @throws SystemException if a system exception occurred
	*/
	public static int countBymodifiedBy(long modifiedBy)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBymodifiedBy(modifiedBy);
	}

	/**
	* Caches the employee mst in the entity cache if it is enabled.
	*
	* @param employeeMst the employee mst
	*/
	public static void cacheResult(com.hrms.model.EmployeeMst employeeMst) {
		getPersistence().cacheResult(employeeMst);
	}

	/**
	* Caches the employee msts in the entity cache if it is enabled.
	*
	* @param employeeMsts the employee msts
	*/
	public static void cacheResult(
		java.util.List<com.hrms.model.EmployeeMst> employeeMsts) {
		getPersistence().cacheResult(employeeMsts);
	}

	/**
	* Creates a new employee mst with the primary key. Does not add the employee mst to the database.
	*
	* @param employeeMstId the primary key for the new employee mst
	* @return the new employee mst
	*/
	public static com.hrms.model.EmployeeMst create(long employeeMstId) {
		return getPersistence().create(employeeMstId);
	}

	/**
	* Removes the employee mst with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param employeeMstId the primary key of the employee mst
	* @return the employee mst that was removed
	* @throws com.hrms.NoSuchEmployeeMstException if a employee mst with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeeMst remove(long employeeMstId)
		throws com.hrms.NoSuchEmployeeMstException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(employeeMstId);
	}

	public static com.hrms.model.EmployeeMst updateImpl(
		com.hrms.model.EmployeeMst employeeMst)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(employeeMst);
	}

	/**
	* Returns the employee mst with the primary key or throws a {@link com.hrms.NoSuchEmployeeMstException} if it could not be found.
	*
	* @param employeeMstId the primary key of the employee mst
	* @return the employee mst
	* @throws com.hrms.NoSuchEmployeeMstException if a employee mst with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeeMst findByPrimaryKey(
		long employeeMstId)
		throws com.hrms.NoSuchEmployeeMstException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(employeeMstId);
	}

	/**
	* Returns the employee mst with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param employeeMstId the primary key of the employee mst
	* @return the employee mst, or <code>null</code> if a employee mst with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeeMst fetchByPrimaryKey(
		long employeeMstId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(employeeMstId);
	}

	/**
	* Returns all the employee msts.
	*
	* @return the employee msts
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hrms.model.EmployeeMst> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<com.hrms.model.EmployeeMst> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<com.hrms.model.EmployeeMst> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the employee msts from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of employee msts.
	*
	* @return the number of employee msts
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static EmployeeMstPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (EmployeeMstPersistence)PortletBeanLocatorUtil.locate(com.hrms.service.ClpSerializer.getServletContextName(),
					EmployeeMstPersistence.class.getName());

			ReferenceRegistry.registerReference(EmployeeMstUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(EmployeeMstPersistence persistence) {
	}

	private static EmployeeMstPersistence _persistence;
}