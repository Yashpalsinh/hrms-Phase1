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

import com.hrms.model.EmployeeAchivement;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the employee achivement service. This utility wraps {@link EmployeeAchivementPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author yashpalsinh
 * @see EmployeeAchivementPersistence
 * @see EmployeeAchivementPersistenceImpl
 * @generated
 */
public class EmployeeAchivementUtil {
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
	public static void clearCache(EmployeeAchivement employeeAchivement) {
		getPersistence().clearCache(employeeAchivement);
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
	public static List<EmployeeAchivement> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<EmployeeAchivement> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<EmployeeAchivement> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static EmployeeAchivement update(
		EmployeeAchivement employeeAchivement) throws SystemException {
		return getPersistence().update(employeeAchivement);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static EmployeeAchivement update(
		EmployeeAchivement employeeAchivement, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(employeeAchivement, serviceContext);
	}

	/**
	* Returns all the employee achivements where createBy = &#63;.
	*
	* @param createBy the create by
	* @return the matching employee achivements
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hrms.model.EmployeeAchivement> findBycreateBy(
		long createBy)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBycreateBy(createBy);
	}

	/**
	* Returns a range of all the employee achivements where createBy = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeAchivementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param createBy the create by
	* @param start the lower bound of the range of employee achivements
	* @param end the upper bound of the range of employee achivements (not inclusive)
	* @return the range of matching employee achivements
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hrms.model.EmployeeAchivement> findBycreateBy(
		long createBy, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBycreateBy(createBy, start, end);
	}

	/**
	* Returns an ordered range of all the employee achivements where createBy = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeAchivementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param createBy the create by
	* @param start the lower bound of the range of employee achivements
	* @param end the upper bound of the range of employee achivements (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching employee achivements
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hrms.model.EmployeeAchivement> findBycreateBy(
		long createBy, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBycreateBy(createBy, start, end, orderByComparator);
	}

	/**
	* Returns the first employee achivement in the ordered set where createBy = &#63;.
	*
	* @param createBy the create by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching employee achivement
	* @throws com.hrms.NoSuchEmployeeAchivementException if a matching employee achivement could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeeAchivement findBycreateBy_First(
		long createBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hrms.NoSuchEmployeeAchivementException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBycreateBy_First(createBy, orderByComparator);
	}

	/**
	* Returns the first employee achivement in the ordered set where createBy = &#63;.
	*
	* @param createBy the create by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching employee achivement, or <code>null</code> if a matching employee achivement could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeeAchivement fetchBycreateBy_First(
		long createBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBycreateBy_First(createBy, orderByComparator);
	}

	/**
	* Returns the last employee achivement in the ordered set where createBy = &#63;.
	*
	* @param createBy the create by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching employee achivement
	* @throws com.hrms.NoSuchEmployeeAchivementException if a matching employee achivement could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeeAchivement findBycreateBy_Last(
		long createBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hrms.NoSuchEmployeeAchivementException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBycreateBy_Last(createBy, orderByComparator);
	}

	/**
	* Returns the last employee achivement in the ordered set where createBy = &#63;.
	*
	* @param createBy the create by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching employee achivement, or <code>null</code> if a matching employee achivement could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeeAchivement fetchBycreateBy_Last(
		long createBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchBycreateBy_Last(createBy, orderByComparator);
	}

	/**
	* Returns the employee achivements before and after the current employee achivement in the ordered set where createBy = &#63;.
	*
	* @param employeeAchivementId the primary key of the current employee achivement
	* @param createBy the create by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next employee achivement
	* @throws com.hrms.NoSuchEmployeeAchivementException if a employee achivement with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeeAchivement[] findBycreateBy_PrevAndNext(
		long employeeAchivementId, long createBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hrms.NoSuchEmployeeAchivementException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBycreateBy_PrevAndNext(employeeAchivementId, createBy,
			orderByComparator);
	}

	/**
	* Removes all the employee achivements where createBy = &#63; from the database.
	*
	* @param createBy the create by
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBycreateBy(long createBy)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBycreateBy(createBy);
	}

	/**
	* Returns the number of employee achivements where createBy = &#63;.
	*
	* @param createBy the create by
	* @return the number of matching employee achivements
	* @throws SystemException if a system exception occurred
	*/
	public static int countBycreateBy(long createBy)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBycreateBy(createBy);
	}

	/**
	* Returns all the employee achivements where modifiedBy = &#63;.
	*
	* @param modifiedBy the modified by
	* @return the matching employee achivements
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hrms.model.EmployeeAchivement> findBymodifiedBy(
		long modifiedBy)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBymodifiedBy(modifiedBy);
	}

	/**
	* Returns a range of all the employee achivements where modifiedBy = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeAchivementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param modifiedBy the modified by
	* @param start the lower bound of the range of employee achivements
	* @param end the upper bound of the range of employee achivements (not inclusive)
	* @return the range of matching employee achivements
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hrms.model.EmployeeAchivement> findBymodifiedBy(
		long modifiedBy, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBymodifiedBy(modifiedBy, start, end);
	}

	/**
	* Returns an ordered range of all the employee achivements where modifiedBy = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeAchivementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param modifiedBy the modified by
	* @param start the lower bound of the range of employee achivements
	* @param end the upper bound of the range of employee achivements (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching employee achivements
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hrms.model.EmployeeAchivement> findBymodifiedBy(
		long modifiedBy, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBymodifiedBy(modifiedBy, start, end, orderByComparator);
	}

	/**
	* Returns the first employee achivement in the ordered set where modifiedBy = &#63;.
	*
	* @param modifiedBy the modified by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching employee achivement
	* @throws com.hrms.NoSuchEmployeeAchivementException if a matching employee achivement could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeeAchivement findBymodifiedBy_First(
		long modifiedBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hrms.NoSuchEmployeeAchivementException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBymodifiedBy_First(modifiedBy, orderByComparator);
	}

	/**
	* Returns the first employee achivement in the ordered set where modifiedBy = &#63;.
	*
	* @param modifiedBy the modified by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching employee achivement, or <code>null</code> if a matching employee achivement could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeeAchivement fetchBymodifiedBy_First(
		long modifiedBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBymodifiedBy_First(modifiedBy, orderByComparator);
	}

	/**
	* Returns the last employee achivement in the ordered set where modifiedBy = &#63;.
	*
	* @param modifiedBy the modified by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching employee achivement
	* @throws com.hrms.NoSuchEmployeeAchivementException if a matching employee achivement could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeeAchivement findBymodifiedBy_Last(
		long modifiedBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hrms.NoSuchEmployeeAchivementException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBymodifiedBy_Last(modifiedBy, orderByComparator);
	}

	/**
	* Returns the last employee achivement in the ordered set where modifiedBy = &#63;.
	*
	* @param modifiedBy the modified by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching employee achivement, or <code>null</code> if a matching employee achivement could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeeAchivement fetchBymodifiedBy_Last(
		long modifiedBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBymodifiedBy_Last(modifiedBy, orderByComparator);
	}

	/**
	* Returns the employee achivements before and after the current employee achivement in the ordered set where modifiedBy = &#63;.
	*
	* @param employeeAchivementId the primary key of the current employee achivement
	* @param modifiedBy the modified by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next employee achivement
	* @throws com.hrms.NoSuchEmployeeAchivementException if a employee achivement with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeeAchivement[] findBymodifiedBy_PrevAndNext(
		long employeeAchivementId, long modifiedBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hrms.NoSuchEmployeeAchivementException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBymodifiedBy_PrevAndNext(employeeAchivementId,
			modifiedBy, orderByComparator);
	}

	/**
	* Removes all the employee achivements where modifiedBy = &#63; from the database.
	*
	* @param modifiedBy the modified by
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBymodifiedBy(long modifiedBy)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBymodifiedBy(modifiedBy);
	}

	/**
	* Returns the number of employee achivements where modifiedBy = &#63;.
	*
	* @param modifiedBy the modified by
	* @return the number of matching employee achivements
	* @throws SystemException if a system exception occurred
	*/
	public static int countBymodifiedBy(long modifiedBy)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBymodifiedBy(modifiedBy);
	}

	/**
	* Caches the employee achivement in the entity cache if it is enabled.
	*
	* @param employeeAchivement the employee achivement
	*/
	public static void cacheResult(
		com.hrms.model.EmployeeAchivement employeeAchivement) {
		getPersistence().cacheResult(employeeAchivement);
	}

	/**
	* Caches the employee achivements in the entity cache if it is enabled.
	*
	* @param employeeAchivements the employee achivements
	*/
	public static void cacheResult(
		java.util.List<com.hrms.model.EmployeeAchivement> employeeAchivements) {
		getPersistence().cacheResult(employeeAchivements);
	}

	/**
	* Creates a new employee achivement with the primary key. Does not add the employee achivement to the database.
	*
	* @param employeeAchivementId the primary key for the new employee achivement
	* @return the new employee achivement
	*/
	public static com.hrms.model.EmployeeAchivement create(
		long employeeAchivementId) {
		return getPersistence().create(employeeAchivementId);
	}

	/**
	* Removes the employee achivement with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param employeeAchivementId the primary key of the employee achivement
	* @return the employee achivement that was removed
	* @throws com.hrms.NoSuchEmployeeAchivementException if a employee achivement with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeeAchivement remove(
		long employeeAchivementId)
		throws com.hrms.NoSuchEmployeeAchivementException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(employeeAchivementId);
	}

	public static com.hrms.model.EmployeeAchivement updateImpl(
		com.hrms.model.EmployeeAchivement employeeAchivement)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(employeeAchivement);
	}

	/**
	* Returns the employee achivement with the primary key or throws a {@link com.hrms.NoSuchEmployeeAchivementException} if it could not be found.
	*
	* @param employeeAchivementId the primary key of the employee achivement
	* @return the employee achivement
	* @throws com.hrms.NoSuchEmployeeAchivementException if a employee achivement with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeeAchivement findByPrimaryKey(
		long employeeAchivementId)
		throws com.hrms.NoSuchEmployeeAchivementException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(employeeAchivementId);
	}

	/**
	* Returns the employee achivement with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param employeeAchivementId the primary key of the employee achivement
	* @return the employee achivement, or <code>null</code> if a employee achivement with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.EmployeeAchivement fetchByPrimaryKey(
		long employeeAchivementId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(employeeAchivementId);
	}

	/**
	* Returns all the employee achivements.
	*
	* @return the employee achivements
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hrms.model.EmployeeAchivement> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the employee achivements.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeAchivementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of employee achivements
	* @param end the upper bound of the range of employee achivements (not inclusive)
	* @return the range of employee achivements
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hrms.model.EmployeeAchivement> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the employee achivements.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeAchivementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of employee achivements
	* @param end the upper bound of the range of employee achivements (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of employee achivements
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hrms.model.EmployeeAchivement> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the employee achivements from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of employee achivements.
	*
	* @return the number of employee achivements
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static EmployeeAchivementPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (EmployeeAchivementPersistence)PortletBeanLocatorUtil.locate(com.hrms.service.ClpSerializer.getServletContextName(),
					EmployeeAchivementPersistence.class.getName());

			ReferenceRegistry.registerReference(EmployeeAchivementUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(EmployeeAchivementPersistence persistence) {
	}

	private static EmployeeAchivementPersistence _persistence;
}