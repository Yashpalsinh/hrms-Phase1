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

import com.hrms.NoSuchOfferException;

import com.hrms.model.Offer;
import com.hrms.model.impl.OfferImpl;
import com.hrms.model.impl.OfferModelImpl;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the offer service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author bhavik
 * @see OfferPersistence
 * @see OfferUtil
 * @generated
 */
public class OfferPersistenceImpl extends BasePersistenceImpl<Offer>
	implements OfferPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link OfferUtil} to access the offer persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = OfferImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(OfferModelImpl.ENTITY_CACHE_ENABLED,
			OfferModelImpl.FINDER_CACHE_ENABLED, OfferImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(OfferModelImpl.ENTITY_CACHE_ENABLED,
			OfferModelImpl.FINDER_CACHE_ENABLED, OfferImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(OfferModelImpl.ENTITY_CACHE_ENABLED,
			OfferModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public OfferPersistenceImpl() {
		setModelClass(Offer.class);
	}

	/**
	 * Caches the offer in the entity cache if it is enabled.
	 *
	 * @param offer the offer
	 */
	@Override
	public void cacheResult(Offer offer) {
		EntityCacheUtil.putResult(OfferModelImpl.ENTITY_CACHE_ENABLED,
			OfferImpl.class, offer.getPrimaryKey(), offer);

		offer.resetOriginalValues();
	}

	/**
	 * Caches the offers in the entity cache if it is enabled.
	 *
	 * @param offers the offers
	 */
	@Override
	public void cacheResult(List<Offer> offers) {
		for (Offer offer : offers) {
			if (EntityCacheUtil.getResult(OfferModelImpl.ENTITY_CACHE_ENABLED,
						OfferImpl.class, offer.getPrimaryKey()) == null) {
				cacheResult(offer);
			}
			else {
				offer.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all offers.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(OfferImpl.class.getName());
		}

		EntityCacheUtil.clearCache(OfferImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the offer.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Offer offer) {
		EntityCacheUtil.removeResult(OfferModelImpl.ENTITY_CACHE_ENABLED,
			OfferImpl.class, offer.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Offer> offers) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Offer offer : offers) {
			EntityCacheUtil.removeResult(OfferModelImpl.ENTITY_CACHE_ENABLED,
				OfferImpl.class, offer.getPrimaryKey());
		}
	}

	/**
	 * Creates a new offer with the primary key. Does not add the offer to the database.
	 *
	 * @param OfferId the primary key for the new offer
	 * @return the new offer
	 */
	@Override
	public Offer create(long OfferId) {
		Offer offer = new OfferImpl();

		offer.setNew(true);
		offer.setPrimaryKey(OfferId);

		return offer;
	}

	/**
	 * Removes the offer with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param OfferId the primary key of the offer
	 * @return the offer that was removed
	 * @throws com.hrms.NoSuchOfferException if a offer with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Offer remove(long OfferId)
		throws NoSuchOfferException, SystemException {
		return remove((Serializable)OfferId);
	}

	/**
	 * Removes the offer with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the offer
	 * @return the offer that was removed
	 * @throws com.hrms.NoSuchOfferException if a offer with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Offer remove(Serializable primaryKey)
		throws NoSuchOfferException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Offer offer = (Offer)session.get(OfferImpl.class, primaryKey);

			if (offer == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchOfferException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(offer);
		}
		catch (NoSuchOfferException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Offer removeImpl(Offer offer) throws SystemException {
		offer = toUnwrappedModel(offer);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(offer)) {
				offer = (Offer)session.get(OfferImpl.class,
						offer.getPrimaryKeyObj());
			}

			if (offer != null) {
				session.delete(offer);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (offer != null) {
			clearCache(offer);
		}

		return offer;
	}

	@Override
	public Offer updateImpl(com.hrms.model.Offer offer)
		throws SystemException {
		offer = toUnwrappedModel(offer);

		boolean isNew = offer.isNew();

		Session session = null;

		try {
			session = openSession();

			if (offer.isNew()) {
				session.save(offer);

				offer.setNew(false);
			}
			else {
				session.merge(offer);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(OfferModelImpl.ENTITY_CACHE_ENABLED,
			OfferImpl.class, offer.getPrimaryKey(), offer);

		return offer;
	}

	protected Offer toUnwrappedModel(Offer offer) {
		if (offer instanceof OfferImpl) {
			return offer;
		}

		OfferImpl offerImpl = new OfferImpl();

		offerImpl.setNew(offer.isNew());
		offerImpl.setPrimaryKey(offer.getPrimaryKey());

		offerImpl.setOfferId(offer.getOfferId());
		offerImpl.setCandidateId(offer.getCandidateId());
		offerImpl.setEmployeeDepartmentId(offer.getEmployeeDepartmentId());
		offerImpl.setEmployeeSubDepartmentId(offer.getEmployeeSubDepartmentId());
		offerImpl.setEmployeeDesignationId(offer.getEmployeeDesignationId());
		offerImpl.setEmployeeTypeId(offer.getEmployeeTypeId());
		offerImpl.setSalary(offer.getSalary());
		offerImpl.setJoiningDate(offer.getJoiningDate());
		offerImpl.setCreateDate(offer.getCreateDate());
		offerImpl.setModifiedDate(offer.getModifiedDate());
		offerImpl.setCreateBy(offer.getCreateBy());
		offerImpl.setModifiedBy(offer.getModifiedBy());

		return offerImpl;
	}

	/**
	 * Returns the offer with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the offer
	 * @return the offer
	 * @throws com.hrms.NoSuchOfferException if a offer with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Offer findByPrimaryKey(Serializable primaryKey)
		throws NoSuchOfferException, SystemException {
		Offer offer = fetchByPrimaryKey(primaryKey);

		if (offer == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchOfferException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return offer;
	}

	/**
	 * Returns the offer with the primary key or throws a {@link com.hrms.NoSuchOfferException} if it could not be found.
	 *
	 * @param OfferId the primary key of the offer
	 * @return the offer
	 * @throws com.hrms.NoSuchOfferException if a offer with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Offer findByPrimaryKey(long OfferId)
		throws NoSuchOfferException, SystemException {
		return findByPrimaryKey((Serializable)OfferId);
	}

	/**
	 * Returns the offer with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the offer
	 * @return the offer, or <code>null</code> if a offer with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Offer fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Offer offer = (Offer)EntityCacheUtil.getResult(OfferModelImpl.ENTITY_CACHE_ENABLED,
				OfferImpl.class, primaryKey);

		if (offer == _nullOffer) {
			return null;
		}

		if (offer == null) {
			Session session = null;

			try {
				session = openSession();

				offer = (Offer)session.get(OfferImpl.class, primaryKey);

				if (offer != null) {
					cacheResult(offer);
				}
				else {
					EntityCacheUtil.putResult(OfferModelImpl.ENTITY_CACHE_ENABLED,
						OfferImpl.class, primaryKey, _nullOffer);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(OfferModelImpl.ENTITY_CACHE_ENABLED,
					OfferImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return offer;
	}

	/**
	 * Returns the offer with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param OfferId the primary key of the offer
	 * @return the offer, or <code>null</code> if a offer with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Offer fetchByPrimaryKey(long OfferId) throws SystemException {
		return fetchByPrimaryKey((Serializable)OfferId);
	}

	/**
	 * Returns all the offers.
	 *
	 * @return the offers
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Offer> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<Offer> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
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
	@Override
	public List<Offer> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<Offer> list = (List<Offer>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_OFFER);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_OFFER;

				if (pagination) {
					sql = sql.concat(OfferModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Offer>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Offer>(list);
				}
				else {
					list = (List<Offer>)QueryUtil.list(q, getDialect(), start,
							end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the offers from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Offer offer : findAll()) {
			remove(offer);
		}
	}

	/**
	 * Returns the number of offers.
	 *
	 * @return the number of offers
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_OFFER);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the offer persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.hrms.model.Offer")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Offer>> listenersList = new ArrayList<ModelListener<Offer>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Offer>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(OfferImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_OFFER = "SELECT offer FROM Offer offer";
	private static final String _SQL_COUNT_OFFER = "SELECT COUNT(offer) FROM Offer offer";
	private static final String _ORDER_BY_ENTITY_ALIAS = "offer.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Offer exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(OfferPersistenceImpl.class);
	private static Offer _nullOffer = new OfferImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Offer> toCacheModel() {
				return _nullOfferCacheModel;
			}
		};

	private static CacheModel<Offer> _nullOfferCacheModel = new CacheModel<Offer>() {
			@Override
			public Offer toEntityModel() {
				return _nullOffer;
			}
		};
}