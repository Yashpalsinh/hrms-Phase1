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

import com.hrms.NoSuchCandidateException;

import com.hrms.model.Candidate;
import com.hrms.model.impl.CandidateImpl;
import com.hrms.model.impl.CandidateModelImpl;

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
 * The persistence implementation for the candidate service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author yashpalsinh
 * @see CandidatePersistence
 * @see CandidateUtil
 * @generated
 */
public class CandidatePersistenceImpl extends BasePersistenceImpl<Candidate>
	implements CandidatePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CandidateUtil} to access the candidate persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CandidateImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CandidateModelImpl.ENTITY_CACHE_ENABLED,
			CandidateModelImpl.FINDER_CACHE_ENABLED, CandidateImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CandidateModelImpl.ENTITY_CACHE_ENABLED,
			CandidateModelImpl.FINDER_CACHE_ENABLED, CandidateImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CandidateModelImpl.ENTITY_CACHE_ENABLED,
			CandidateModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public CandidatePersistenceImpl() {
		setModelClass(Candidate.class);
	}

	/**
	 * Caches the candidate in the entity cache if it is enabled.
	 *
	 * @param candidate the candidate
	 */
	@Override
	public void cacheResult(Candidate candidate) {
		EntityCacheUtil.putResult(CandidateModelImpl.ENTITY_CACHE_ENABLED,
			CandidateImpl.class, candidate.getPrimaryKey(), candidate);

		candidate.resetOriginalValues();
	}

	/**
	 * Caches the candidates in the entity cache if it is enabled.
	 *
	 * @param candidates the candidates
	 */
	@Override
	public void cacheResult(List<Candidate> candidates) {
		for (Candidate candidate : candidates) {
			if (EntityCacheUtil.getResult(
						CandidateModelImpl.ENTITY_CACHE_ENABLED,
						CandidateImpl.class, candidate.getPrimaryKey()) == null) {
				cacheResult(candidate);
			}
			else {
				candidate.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all candidates.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(CandidateImpl.class.getName());
		}

		EntityCacheUtil.clearCache(CandidateImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the candidate.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Candidate candidate) {
		EntityCacheUtil.removeResult(CandidateModelImpl.ENTITY_CACHE_ENABLED,
			CandidateImpl.class, candidate.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Candidate> candidates) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Candidate candidate : candidates) {
			EntityCacheUtil.removeResult(CandidateModelImpl.ENTITY_CACHE_ENABLED,
				CandidateImpl.class, candidate.getPrimaryKey());
		}
	}

	/**
	 * Creates a new candidate with the primary key. Does not add the candidate to the database.
	 *
	 * @param candidateId the primary key for the new candidate
	 * @return the new candidate
	 */
	@Override
	public Candidate create(long candidateId) {
		Candidate candidate = new CandidateImpl();

		candidate.setNew(true);
		candidate.setPrimaryKey(candidateId);

		return candidate;
	}

	/**
	 * Removes the candidate with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param candidateId the primary key of the candidate
	 * @return the candidate that was removed
	 * @throws com.hrms.NoSuchCandidateException if a candidate with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Candidate remove(long candidateId)
		throws NoSuchCandidateException, SystemException {
		return remove((Serializable)candidateId);
	}

	/**
	 * Removes the candidate with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the candidate
	 * @return the candidate that was removed
	 * @throws com.hrms.NoSuchCandidateException if a candidate with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Candidate remove(Serializable primaryKey)
		throws NoSuchCandidateException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Candidate candidate = (Candidate)session.get(CandidateImpl.class,
					primaryKey);

			if (candidate == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCandidateException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(candidate);
		}
		catch (NoSuchCandidateException nsee) {
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
	protected Candidate removeImpl(Candidate candidate)
		throws SystemException {
		candidate = toUnwrappedModel(candidate);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(candidate)) {
				candidate = (Candidate)session.get(CandidateImpl.class,
						candidate.getPrimaryKeyObj());
			}

			if (candidate != null) {
				session.delete(candidate);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (candidate != null) {
			clearCache(candidate);
		}

		return candidate;
	}

	@Override
	public Candidate updateImpl(com.hrms.model.Candidate candidate)
		throws SystemException {
		candidate = toUnwrappedModel(candidate);

		boolean isNew = candidate.isNew();

		Session session = null;

		try {
			session = openSession();

			if (candidate.isNew()) {
				session.save(candidate);

				candidate.setNew(false);
			}
			else {
				session.merge(candidate);
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

		EntityCacheUtil.putResult(CandidateModelImpl.ENTITY_CACHE_ENABLED,
			CandidateImpl.class, candidate.getPrimaryKey(), candidate);

		return candidate;
	}

	protected Candidate toUnwrappedModel(Candidate candidate) {
		if (candidate instanceof CandidateImpl) {
			return candidate;
		}

		CandidateImpl candidateImpl = new CandidateImpl();

		candidateImpl.setNew(candidate.isNew());
		candidateImpl.setPrimaryKey(candidate.getPrimaryKey());

		candidateImpl.setCandidateId(candidate.getCandidateId());
		candidateImpl.setEmployeeDepartmentId(candidate.getEmployeeDepartmentId());
		candidateImpl.setEmployeeDesignationId(candidate.getEmployeeDesignationId());
		candidateImpl.setTitle(candidate.getTitle());
		candidateImpl.setFirstName(candidate.getFirstName());
		candidateImpl.setMiddleName(candidate.getMiddleName());
		candidateImpl.setLastName(candidate.getLastName());
		candidateImpl.setDateOfBirth(candidate.getDateOfBirth());
		candidateImpl.setNationality(candidate.getNationality());
		candidateImpl.setMaritalStatus(candidate.getMaritalStatus());
		candidateImpl.setStreet1(candidate.getStreet1());
		candidateImpl.setStreet2(candidate.getStreet2());
		candidateImpl.setStreet3(candidate.getStreet3());
		candidateImpl.setCity(candidate.getCity());
		candidateImpl.setZip(candidate.getZip());
		candidateImpl.setCountryId(candidate.getCountryId());
		candidateImpl.setPersonalEmail(candidate.getPersonalEmail());
		candidateImpl.setCurrentCtc(candidate.getCurrentCtc());
		candidateImpl.setExpectedCtc(candidate.getExpectedCtc());
		candidateImpl.setNoticePeriod(candidate.getNoticePeriod());
		candidateImpl.setResumeId(candidate.getResumeId());
		candidateImpl.setResumePath(candidate.getResumePath());
		candidateImpl.setEmployeeProofId(candidate.getEmployeeProofId());
		candidateImpl.setProofNumber(candidate.getProofNumber());
		candidateImpl.setGender(candidate.getGender());
		candidateImpl.setStatus(candidate.isStatus());
		candidateImpl.setShortListed(candidate.isShortListed());
		candidateImpl.setCreateDate(candidate.getCreateDate());
		candidateImpl.setModifiedDate(candidate.getModifiedDate());
		candidateImpl.setCreateBy(candidate.getCreateBy());
		candidateImpl.setModifiedBy(candidate.getModifiedBy());

		return candidateImpl;
	}

	/**
	 * Returns the candidate with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the candidate
	 * @return the candidate
	 * @throws com.hrms.NoSuchCandidateException if a candidate with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Candidate findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCandidateException, SystemException {
		Candidate candidate = fetchByPrimaryKey(primaryKey);

		if (candidate == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCandidateException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return candidate;
	}

	/**
	 * Returns the candidate with the primary key or throws a {@link com.hrms.NoSuchCandidateException} if it could not be found.
	 *
	 * @param candidateId the primary key of the candidate
	 * @return the candidate
	 * @throws com.hrms.NoSuchCandidateException if a candidate with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Candidate findByPrimaryKey(long candidateId)
		throws NoSuchCandidateException, SystemException {
		return findByPrimaryKey((Serializable)candidateId);
	}

	/**
	 * Returns the candidate with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the candidate
	 * @return the candidate, or <code>null</code> if a candidate with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Candidate fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Candidate candidate = (Candidate)EntityCacheUtil.getResult(CandidateModelImpl.ENTITY_CACHE_ENABLED,
				CandidateImpl.class, primaryKey);

		if (candidate == _nullCandidate) {
			return null;
		}

		if (candidate == null) {
			Session session = null;

			try {
				session = openSession();

				candidate = (Candidate)session.get(CandidateImpl.class,
						primaryKey);

				if (candidate != null) {
					cacheResult(candidate);
				}
				else {
					EntityCacheUtil.putResult(CandidateModelImpl.ENTITY_CACHE_ENABLED,
						CandidateImpl.class, primaryKey, _nullCandidate);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(CandidateModelImpl.ENTITY_CACHE_ENABLED,
					CandidateImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return candidate;
	}

	/**
	 * Returns the candidate with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param candidateId the primary key of the candidate
	 * @return the candidate, or <code>null</code> if a candidate with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Candidate fetchByPrimaryKey(long candidateId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)candidateId);
	}

	/**
	 * Returns all the candidates.
	 *
	 * @return the candidates
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Candidate> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the candidates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.CandidateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of candidates
	 * @param end the upper bound of the range of candidates (not inclusive)
	 * @return the range of candidates
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Candidate> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the candidates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.CandidateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of candidates
	 * @param end the upper bound of the range of candidates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of candidates
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Candidate> findAll(int start, int end,
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

		List<Candidate> list = (List<Candidate>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_CANDIDATE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CANDIDATE;

				if (pagination) {
					sql = sql.concat(CandidateModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Candidate>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Candidate>(list);
				}
				else {
					list = (List<Candidate>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Removes all the candidates from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Candidate candidate : findAll()) {
			remove(candidate);
		}
	}

	/**
	 * Returns the number of candidates.
	 *
	 * @return the number of candidates
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

				Query q = session.createQuery(_SQL_COUNT_CANDIDATE);

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
	 * Initializes the candidate persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.hrms.model.Candidate")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Candidate>> listenersList = new ArrayList<ModelListener<Candidate>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Candidate>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(CandidateImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_CANDIDATE = "SELECT candidate FROM Candidate candidate";
	private static final String _SQL_COUNT_CANDIDATE = "SELECT COUNT(candidate) FROM Candidate candidate";
	private static final String _ORDER_BY_ENTITY_ALIAS = "candidate.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Candidate exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(CandidatePersistenceImpl.class);
	private static Candidate _nullCandidate = new CandidateImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Candidate> toCacheModel() {
				return _nullCandidateCacheModel;
			}
		};

	private static CacheModel<Candidate> _nullCandidateCacheModel = new CacheModel<Candidate>() {
			@Override
			public Candidate toEntityModel() {
				return _nullCandidate;
			}
		};
}