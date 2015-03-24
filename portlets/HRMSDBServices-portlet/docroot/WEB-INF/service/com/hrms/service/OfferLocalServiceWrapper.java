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

package com.hrms.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link OfferLocalService}.
 *
 * @author bhavik
 * @see OfferLocalService
 * @generated
 */
public class OfferLocalServiceWrapper implements OfferLocalService,
	ServiceWrapper<OfferLocalService> {
	public OfferLocalServiceWrapper(OfferLocalService offerLocalService) {
		_offerLocalService = offerLocalService;
	}

	/**
	* Adds the offer to the database. Also notifies the appropriate model listeners.
	*
	* @param offer the offer
	* @return the offer that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hrms.model.Offer addOffer(com.hrms.model.Offer offer)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _offerLocalService.addOffer(offer);
	}

	/**
	* Creates a new offer with the primary key. Does not add the offer to the database.
	*
	* @param OfferId the primary key for the new offer
	* @return the new offer
	*/
	@Override
	public com.hrms.model.Offer createOffer(long OfferId) {
		return _offerLocalService.createOffer(OfferId);
	}

	/**
	* Deletes the offer with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param OfferId the primary key of the offer
	* @return the offer that was removed
	* @throws PortalException if a offer with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hrms.model.Offer deleteOffer(long OfferId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _offerLocalService.deleteOffer(OfferId);
	}

	/**
	* Deletes the offer from the database. Also notifies the appropriate model listeners.
	*
	* @param offer the offer
	* @return the offer that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hrms.model.Offer deleteOffer(com.hrms.model.Offer offer)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _offerLocalService.deleteOffer(offer);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _offerLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _offerLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.OfferModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _offerLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.OfferModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _offerLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _offerLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _offerLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.hrms.model.Offer fetchOffer(long OfferId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _offerLocalService.fetchOffer(OfferId);
	}

	/**
	* Returns the offer with the primary key.
	*
	* @param OfferId the primary key of the offer
	* @return the offer
	* @throws PortalException if a offer with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hrms.model.Offer getOffer(long OfferId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _offerLocalService.getOffer(OfferId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _offerLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public java.util.List<com.hrms.model.Offer> getOffers(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _offerLocalService.getOffers(start, end);
	}

	/**
	* Returns the number of offers.
	*
	* @return the number of offers
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getOffersCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _offerLocalService.getOffersCount();
	}

	/**
	* Updates the offer in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param offer the offer
	* @return the offer that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hrms.model.Offer updateOffer(com.hrms.model.Offer offer)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _offerLocalService.updateOffer(offer);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _offerLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_offerLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _offerLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public OfferLocalService getWrappedOfferLocalService() {
		return _offerLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedOfferLocalService(OfferLocalService offerLocalService) {
		_offerLocalService = offerLocalService;
	}

	@Override
	public OfferLocalService getWrappedService() {
		return _offerLocalService;
	}

	@Override
	public void setWrappedService(OfferLocalService offerLocalService) {
		_offerLocalService = offerLocalService;
	}

	private OfferLocalService _offerLocalService;
}