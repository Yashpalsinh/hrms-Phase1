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

import com.hrms.model.Offer;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the offer service. This utility wraps {@link OfferPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author yashpalsinh
 * @see OfferPersistence
 * @see OfferPersistenceImpl
 * @generated
 */
public class OfferUtil {
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
	public static void clearCache(Offer offer) {
		getPersistence().clearCache(offer);
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
	public static List<Offer> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Offer> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Offer> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Offer update(Offer offer) throws SystemException {
		return getPersistence().update(offer);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Offer update(Offer offer, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(offer, serviceContext);
	}

	/**
	* Caches the offer in the entity cache if it is enabled.
	*
	* @param offer the offer
	*/
	public static void cacheResult(com.hrms.model.Offer offer) {
		getPersistence().cacheResult(offer);
	}

	/**
	* Caches the offers in the entity cache if it is enabled.
	*
	* @param offers the offers
	*/
	public static void cacheResult(java.util.List<com.hrms.model.Offer> offers) {
		getPersistence().cacheResult(offers);
	}

	/**
	* Creates a new offer with the primary key. Does not add the offer to the database.
	*
	* @param OferrId the primary key for the new offer
	* @return the new offer
	*/
	public static com.hrms.model.Offer create(long OferrId) {
		return getPersistence().create(OferrId);
	}

	/**
	* Removes the offer with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param OferrId the primary key of the offer
	* @return the offer that was removed
	* @throws com.hrms.NoSuchOfferException if a offer with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.Offer remove(long OferrId)
		throws com.hrms.NoSuchOfferException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(OferrId);
	}

	public static com.hrms.model.Offer updateImpl(com.hrms.model.Offer offer)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(offer);
	}

	/**
	* Returns the offer with the primary key or throws a {@link com.hrms.NoSuchOfferException} if it could not be found.
	*
	* @param OferrId the primary key of the offer
	* @return the offer
	* @throws com.hrms.NoSuchOfferException if a offer with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.Offer findByPrimaryKey(long OferrId)
		throws com.hrms.NoSuchOfferException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(OferrId);
	}

	/**
	* Returns the offer with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param OferrId the primary key of the offer
	* @return the offer, or <code>null</code> if a offer with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.Offer fetchByPrimaryKey(long OferrId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(OferrId);
	}

	/**
	* Returns all the offers.
	*
	* @return the offers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hrms.model.Offer> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the offers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.OfferModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of offers
	* @param end the upper bound of the range of offers (not inclusive)
	* @return the range of offers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hrms.model.Offer> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the offers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.OfferModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of offers
	* @param end the upper bound of the range of offers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of offers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hrms.model.Offer> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the offers from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of offers.
	*
	* @return the number of offers
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static OfferPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (OfferPersistence)PortletBeanLocatorUtil.locate(com.hrms.service.ClpSerializer.getServletContextName(),
					OfferPersistence.class.getName());

			ReferenceRegistry.registerReference(OfferUtil.class, "_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(OfferPersistence persistence) {
	}

	private static OfferPersistence _persistence;
}