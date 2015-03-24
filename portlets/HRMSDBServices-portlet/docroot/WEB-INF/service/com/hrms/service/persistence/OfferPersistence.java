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

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the offer service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author yashpalsinh
 * @see OfferPersistenceImpl
 * @see OfferUtil
 * @generated
 */
public interface OfferPersistence extends BasePersistence<Offer> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link OfferUtil} to access the offer persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the offer in the entity cache if it is enabled.
	*
	* @param offer the offer
	*/
	public void cacheResult(com.hrms.model.Offer offer);

	/**
	* Caches the offers in the entity cache if it is enabled.
	*
	* @param offers the offers
	*/
	public void cacheResult(java.util.List<com.hrms.model.Offer> offers);

	/**
	* Creates a new offer with the primary key. Does not add the offer to the database.
	*
	* @param OfferId the primary key for the new offer
	* @return the new offer
	*/
	public com.hrms.model.Offer create(long OfferId);

	/**
	* Removes the offer with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param OfferId the primary key of the offer
	* @return the offer that was removed
	* @throws com.hrms.NoSuchOfferException if a offer with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.Offer remove(long OfferId)
		throws com.hrms.NoSuchOfferException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.hrms.model.Offer updateImpl(com.hrms.model.Offer offer)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the offer with the primary key or throws a {@link com.hrms.NoSuchOfferException} if it could not be found.
	*
	* @param OfferId the primary key of the offer
	* @return the offer
	* @throws com.hrms.NoSuchOfferException if a offer with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.Offer findByPrimaryKey(long OfferId)
		throws com.hrms.NoSuchOfferException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the offer with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param OfferId the primary key of the offer
	* @return the offer, or <code>null</code> if a offer with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.Offer fetchByPrimaryKey(long OfferId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the offers.
	*
	* @return the offers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hrms.model.Offer> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.hrms.model.Offer> findAll(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.hrms.model.Offer> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the offers from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of offers.
	*
	* @return the number of offers
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}