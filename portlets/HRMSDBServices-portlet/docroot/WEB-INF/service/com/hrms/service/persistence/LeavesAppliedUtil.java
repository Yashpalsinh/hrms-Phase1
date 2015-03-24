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

import com.hrms.model.LeavesApplied;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the leaves applied service. This utility wraps {@link LeavesAppliedPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author bhavik
 * @see LeavesAppliedPersistence
 * @see LeavesAppliedPersistenceImpl
 * @generated
 */
public class LeavesAppliedUtil {
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
	public static void clearCache(LeavesApplied leavesApplied) {
		getPersistence().clearCache(leavesApplied);
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
	public static List<LeavesApplied> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<LeavesApplied> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<LeavesApplied> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static LeavesApplied update(LeavesApplied leavesApplied)
		throws SystemException {
		return getPersistence().update(leavesApplied);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static LeavesApplied update(LeavesApplied leavesApplied,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(leavesApplied, serviceContext);
	}

	/**
	* Caches the leaves applied in the entity cache if it is enabled.
	*
	* @param leavesApplied the leaves applied
	*/
	public static void cacheResult(com.hrms.model.LeavesApplied leavesApplied) {
		getPersistence().cacheResult(leavesApplied);
	}

	/**
	* Caches the leaves applieds in the entity cache if it is enabled.
	*
	* @param leavesApplieds the leaves applieds
	*/
	public static void cacheResult(
		java.util.List<com.hrms.model.LeavesApplied> leavesApplieds) {
		getPersistence().cacheResult(leavesApplieds);
	}

	/**
	* Creates a new leaves applied with the primary key. Does not add the leaves applied to the database.
	*
	* @param appliedLeaveId the primary key for the new leaves applied
	* @return the new leaves applied
	*/
	public static com.hrms.model.LeavesApplied create(long appliedLeaveId) {
		return getPersistence().create(appliedLeaveId);
	}

	/**
	* Removes the leaves applied with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param appliedLeaveId the primary key of the leaves applied
	* @return the leaves applied that was removed
	* @throws com.hrms.NoSuchLeavesAppliedException if a leaves applied with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.LeavesApplied remove(long appliedLeaveId)
		throws com.hrms.NoSuchLeavesAppliedException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(appliedLeaveId);
	}

	public static com.hrms.model.LeavesApplied updateImpl(
		com.hrms.model.LeavesApplied leavesApplied)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(leavesApplied);
	}

	/**
	* Returns the leaves applied with the primary key or throws a {@link com.hrms.NoSuchLeavesAppliedException} if it could not be found.
	*
	* @param appliedLeaveId the primary key of the leaves applied
	* @return the leaves applied
	* @throws com.hrms.NoSuchLeavesAppliedException if a leaves applied with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.LeavesApplied findByPrimaryKey(
		long appliedLeaveId)
		throws com.hrms.NoSuchLeavesAppliedException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(appliedLeaveId);
	}

	/**
	* Returns the leaves applied with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param appliedLeaveId the primary key of the leaves applied
	* @return the leaves applied, or <code>null</code> if a leaves applied with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.LeavesApplied fetchByPrimaryKey(
		long appliedLeaveId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(appliedLeaveId);
	}

	/**
	* Returns all the leaves applieds.
	*
	* @return the leaves applieds
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hrms.model.LeavesApplied> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the leaves applieds.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.LeavesAppliedModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of leaves applieds
	* @param end the upper bound of the range of leaves applieds (not inclusive)
	* @return the range of leaves applieds
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hrms.model.LeavesApplied> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the leaves applieds.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.LeavesAppliedModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of leaves applieds
	* @param end the upper bound of the range of leaves applieds (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of leaves applieds
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hrms.model.LeavesApplied> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the leaves applieds from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of leaves applieds.
	*
	* @return the number of leaves applieds
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static LeavesAppliedPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (LeavesAppliedPersistence)PortletBeanLocatorUtil.locate(com.hrms.service.ClpSerializer.getServletContextName(),
					LeavesAppliedPersistence.class.getName());

			ReferenceRegistry.registerReference(LeavesAppliedUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(LeavesAppliedPersistence persistence) {
	}

	private static LeavesAppliedPersistence _persistence;
}