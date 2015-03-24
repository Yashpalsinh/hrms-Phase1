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

import com.hrms.NoSuchCandidateQualificationException;

import com.hrms.model.CandidateQualification;
import com.hrms.model.impl.CandidateQualificationImpl;
import com.hrms.model.impl.CandidateQualificationModelImpl;

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
 * The persistence implementation for the candidate qualification service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author bhavik
 * @see CandidateQualificationPersistence
 * @see CandidateQualificationUtil
 * @generated
 */
public class CandidateQualificationPersistenceImpl extends BasePersistenceImpl<CandidateQualification>
	implements CandidateQualificationPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CandidateQualificationUtil} to access the candidate qualification persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CandidateQualificationImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CandidateQualificationModelImpl.ENTITY_CACHE_ENABLED,
			CandidateQualificationModelImpl.FINDER_CACHE_ENABLED,
			CandidateQualificationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CandidateQualificationModelImpl.ENTITY_CACHE_ENABLED,
			CandidateQualificationModelImpl.FINDER_CACHE_ENABLED,
			CandidateQualificationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CandidateQualificationModelImpl.ENTITY_CACHE_ENABLED,
			CandidateQualificationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public CandidateQualificationPersistenceImpl() {
		setModelClass(CandidateQualification.class);
	}

	/**
	 * Caches the candidate qualification in the entity cache if it is enabled.
	 *
	 * @param candidateQualification the candidate qualification
	 */
	@Override
	public void cacheResult(CandidateQualification candidateQualification) {
		EntityCacheUtil.putResult(CandidateQualificationModelImpl.ENTITY_CACHE_ENABLED,
			CandidateQualificationImpl.class,
			candidateQualification.getPrimaryKey(), candidateQualification);

		candidateQualification.resetOriginalValues();
	}

	/**
	 * Caches the candidate qualifications in the entity cache if it is enabled.
	 *
	 * @param candidateQualifications the candidate qualifications
	 */
	@Override
	public void cacheResult(
		List<CandidateQualification> candidateQualifications) {
		for (CandidateQualification candidateQualification : candidateQualifications) {
			if (EntityCacheUtil.getResult(
						CandidateQualificationModelImpl.ENTITY_CACHE_ENABLED,
						CandidateQualificationImpl.class,
						candidateQualification.getPrimaryKey()) == null) {
				cacheResult(candidateQualification);
			}
			else {
				candidateQualification.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all candidate qualifications.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(CandidateQualificationImpl.class.getName());
		}

		EntityCacheUtil.clearCache(CandidateQualificationImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the candidate qualification.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CandidateQualification candidateQualification) {
		EntityCacheUtil.removeResult(CandidateQualificationModelImpl.ENTITY_CACHE_ENABLED,
			CandidateQualificationImpl.class,
			candidateQualification.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<CandidateQualification> candidateQualifications) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (CandidateQualification candidateQualification : candidateQualifications) {
			EntityCacheUtil.removeResult(CandidateQualificationModelImpl.ENTITY_CACHE_ENABLED,
				CandidateQualificationImpl.class,
				candidateQualification.getPrimaryKey());
		}
	}

	/**
	 * Creates a new candidate qualification with the primary key. Does not add the candidate qualification to the database.
	 *
	 * @param candidateQualificationId the primary key for the new candidate qualification
	 * @return the new candidate qualification
	 */
	@Override
	public CandidateQualification create(long candidateQualificationId) {
		CandidateQualification candidateQualification = new CandidateQualificationImpl();

		candidateQualification.setNew(true);
		candidateQualification.setPrimaryKey(candidateQualificationId);

		return candidateQualification;
	}

	/**
	 * Removes the candidate qualification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param candidateQualificationId the primary key of the candidate qualification
	 * @return the candidate qualification that was removed
	 * @throws com.hrms.NoSuchCandidateQualificationException if a candidate qualification with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CandidateQualification remove(long candidateQualificationId)
		throws NoSuchCandidateQualificationException, SystemException {
		return remove((Serializable)candidateQualificationId);
	}

	/**
	 * Removes the candidate qualification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the candidate qualification
	 * @return the candidate qualification that was removed
	 * @throws com.hrms.NoSuchCandidateQualificationException if a candidate qualification with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CandidateQualification remove(Serializable primaryKey)
		throws NoSuchCandidateQualificationException, SystemException {
		Session session = null;

		try {
			session = openSession();

			CandidateQualification candidateQualification = (CandidateQualification)session.get(CandidateQualificationImpl.class,
					primaryKey);

			if (candidateQualification == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCandidateQualificationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(candidateQualification);
		}
		catch (NoSuchCandidateQualificationException nsee) {
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
	protected CandidateQualification removeImpl(
		CandidateQualification candidateQualification)
		throws SystemException {
		candidateQualification = toUnwrappedModel(candidateQualification);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(candidateQualification)) {
				candidateQualification = (CandidateQualification)session.get(CandidateQualificationImpl.class,
						candidateQualification.getPrimaryKeyObj());
			}

			if (candidateQualification != null) {
				session.delete(candidateQualification);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (candidateQualification != null) {
			clearCache(candidateQualification);
		}

		return candidateQualification;
	}

	@Override
	public CandidateQualification updateImpl(
		com.hrms.model.CandidateQualification candidateQualification)
		throws SystemException {
		candidateQualification = toUnwrappedModel(candidateQualification);

		boolean isNew = candidateQualification.isNew();

		Session session = null;

		try {
			session = openSession();

			if (candidateQualification.isNew()) {
				session.save(candidateQualification);

				candidateQualification.setNew(false);
			}
			else {
				session.merge(candidateQualification);
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

		EntityCacheUtil.putResult(CandidateQualificationModelImpl.ENTITY_CACHE_ENABLED,
			CandidateQualificationImpl.class,
			candidateQualification.getPrimaryKey(), candidateQualification);

		return candidateQualification;
	}

	protected CandidateQualification toUnwrappedModel(
		CandidateQualification candidateQualification) {
		if (candidateQualification instanceof CandidateQualificationImpl) {
			return candidateQualification;
		}

		CandidateQualificationImpl candidateQualificationImpl = new CandidateQualificationImpl();

		candidateQualificationImpl.setNew(candidateQualification.isNew());
		candidateQualificationImpl.setPrimaryKey(candidateQualification.getPrimaryKey());

		candidateQualificationImpl.setCandidateQualificationId(candidateQualification.getCandidateQualificationId());
		candidateQualificationImpl.setCandidateId(candidateQualification.getCandidateId());
		candidateQualificationImpl.setDegreeName(candidateQualification.getDegreeName());
		candidateQualificationImpl.setMainSubject(candidateQualification.getMainSubject());
		candidateQualificationImpl.setUniversity(candidateQualification.getUniversity());
		candidateQualificationImpl.setScore(candidateQualification.getScore());
		candidateQualificationImpl.setStartDate(candidateQualification.getStartDate());
		candidateQualificationImpl.setEndDate(candidateQualification.getEndDate());
		candidateQualificationImpl.setCreateDate(candidateQualification.getCreateDate());
		candidateQualificationImpl.setModifiedDate(candidateQualification.getModifiedDate());
		candidateQualificationImpl.setCreateBy(candidateQualification.getCreateBy());
		candidateQualificationImpl.setModifiedBy(candidateQualification.getModifiedBy());

		return candidateQualificationImpl;
	}

	/**
	 * Returns the candidate qualification with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the candidate qualification
	 * @return the candidate qualification
	 * @throws com.hrms.NoSuchCandidateQualificationException if a candidate qualification with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CandidateQualification findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCandidateQualificationException, SystemException {
		CandidateQualification candidateQualification = fetchByPrimaryKey(primaryKey);

		if (candidateQualification == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCandidateQualificationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return candidateQualification;
	}

	/**
	 * Returns the candidate qualification with the primary key or throws a {@link com.hrms.NoSuchCandidateQualificationException} if it could not be found.
	 *
	 * @param candidateQualificationId the primary key of the candidate qualification
	 * @return the candidate qualification
	 * @throws com.hrms.NoSuchCandidateQualificationException if a candidate qualification with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CandidateQualification findByPrimaryKey(
		long candidateQualificationId)
		throws NoSuchCandidateQualificationException, SystemException {
		return findByPrimaryKey((Serializable)candidateQualificationId);
	}

	/**
	 * Returns the candidate qualification with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the candidate qualification
	 * @return the candidate qualification, or <code>null</code> if a candidate qualification with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CandidateQualification fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		CandidateQualification candidateQualification = (CandidateQualification)EntityCacheUtil.getResult(CandidateQualificationModelImpl.ENTITY_CACHE_ENABLED,
				CandidateQualificationImpl.class, primaryKey);

		if (candidateQualification == _nullCandidateQualification) {
			return null;
		}

		if (candidateQualification == null) {
			Session session = null;

			try {
				session = openSession();

				candidateQualification = (CandidateQualification)session.get(CandidateQualificationImpl.class,
						primaryKey);

				if (candidateQualification != null) {
					cacheResult(candidateQualification);
				}
				else {
					EntityCacheUtil.putResult(CandidateQualificationModelImpl.ENTITY_CACHE_ENABLED,
						CandidateQualificationImpl.class, primaryKey,
						_nullCandidateQualification);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(CandidateQualificationModelImpl.ENTITY_CACHE_ENABLED,
					CandidateQualificationImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return candidateQualification;
	}

	/**
	 * Returns the candidate qualification with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param candidateQualificationId the primary key of the candidate qualification
	 * @return the candidate qualification, or <code>null</code> if a candidate qualification with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CandidateQualification fetchByPrimaryKey(
		long candidateQualificationId) throws SystemException {
		return fetchByPrimaryKey((Serializable)candidateQualificationId);
	}

	/**
	 * Returns all the candidate qualifications.
	 *
	 * @return the candidate qualifications
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CandidateQualification> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the candidate qualifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.CandidateQualificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of candidate qualifications
	 * @param end the upper bound of the range of candidate qualifications (not inclusive)
	 * @return the range of candidate qualifications
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CandidateQualification> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the candidate qualifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.CandidateQualificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of candidate qualifications
	 * @param end the upper bound of the range of candidate qualifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of candidate qualifications
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CandidateQualification> findAll(int start, int end,
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

		List<CandidateQualification> list = (List<CandidateQualification>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_CANDIDATEQUALIFICATION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CANDIDATEQUALIFICATION;

				if (pagination) {
					sql = sql.concat(CandidateQualificationModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<CandidateQualification>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CandidateQualification>(list);
				}
				else {
					list = (List<CandidateQualification>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Removes all the candidate qualifications from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (CandidateQualification candidateQualification : findAll()) {
			remove(candidateQualification);
		}
	}

	/**
	 * Returns the number of candidate qualifications.
	 *
	 * @return the number of candidate qualifications
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

				Query q = session.createQuery(_SQL_COUNT_CANDIDATEQUALIFICATION);

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
	 * Initializes the candidate qualification persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.hrms.model.CandidateQualification")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<CandidateQualification>> listenersList = new ArrayList<ModelListener<CandidateQualification>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<CandidateQualification>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(CandidateQualificationImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_CANDIDATEQUALIFICATION = "SELECT candidateQualification FROM CandidateQualification candidateQualification";
	private static final String _SQL_COUNT_CANDIDATEQUALIFICATION = "SELECT COUNT(candidateQualification) FROM CandidateQualification candidateQualification";
	private static final String _ORDER_BY_ENTITY_ALIAS = "candidateQualification.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CandidateQualification exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(CandidateQualificationPersistenceImpl.class);
	private static CandidateQualification _nullCandidateQualification = new CandidateQualificationImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<CandidateQualification> toCacheModel() {
				return _nullCandidateQualificationCacheModel;
			}
		};

	private static CacheModel<CandidateQualification> _nullCandidateQualificationCacheModel =
		new CacheModel<CandidateQualification>() {
			@Override
			public CandidateQualification toEntityModel() {
				return _nullCandidateQualification;
			}
		};
}