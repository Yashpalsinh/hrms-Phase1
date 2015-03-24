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

import com.hrms.NoSuchProofException;

import com.hrms.model.Proof;
import com.hrms.model.impl.ProofImpl;
import com.hrms.model.impl.ProofModelImpl;

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
 * The persistence implementation for the proof service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author bhavik
 * @see ProofPersistence
 * @see ProofUtil
 * @generated
 */
public class ProofPersistenceImpl extends BasePersistenceImpl<Proof>
	implements ProofPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ProofUtil} to access the proof persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ProofImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ProofModelImpl.ENTITY_CACHE_ENABLED,
			ProofModelImpl.FINDER_CACHE_ENABLED, ProofImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ProofModelImpl.ENTITY_CACHE_ENABLED,
			ProofModelImpl.FINDER_CACHE_ENABLED, ProofImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ProofModelImpl.ENTITY_CACHE_ENABLED,
			ProofModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public ProofPersistenceImpl() {
		setModelClass(Proof.class);
	}

	/**
	 * Caches the proof in the entity cache if it is enabled.
	 *
	 * @param proof the proof
	 */
	@Override
	public void cacheResult(Proof proof) {
		EntityCacheUtil.putResult(ProofModelImpl.ENTITY_CACHE_ENABLED,
			ProofImpl.class, proof.getPrimaryKey(), proof);

		proof.resetOriginalValues();
	}

	/**
	 * Caches the proofs in the entity cache if it is enabled.
	 *
	 * @param proofs the proofs
	 */
	@Override
	public void cacheResult(List<Proof> proofs) {
		for (Proof proof : proofs) {
			if (EntityCacheUtil.getResult(ProofModelImpl.ENTITY_CACHE_ENABLED,
						ProofImpl.class, proof.getPrimaryKey()) == null) {
				cacheResult(proof);
			}
			else {
				proof.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all proofs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ProofImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ProofImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the proof.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Proof proof) {
		EntityCacheUtil.removeResult(ProofModelImpl.ENTITY_CACHE_ENABLED,
			ProofImpl.class, proof.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Proof> proofs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Proof proof : proofs) {
			EntityCacheUtil.removeResult(ProofModelImpl.ENTITY_CACHE_ENABLED,
				ProofImpl.class, proof.getPrimaryKey());
		}
	}

	/**
	 * Creates a new proof with the primary key. Does not add the proof to the database.
	 *
	 * @param proofId the primary key for the new proof
	 * @return the new proof
	 */
	@Override
	public Proof create(long proofId) {
		Proof proof = new ProofImpl();

		proof.setNew(true);
		proof.setPrimaryKey(proofId);

		return proof;
	}

	/**
	 * Removes the proof with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param proofId the primary key of the proof
	 * @return the proof that was removed
	 * @throws com.hrms.NoSuchProofException if a proof with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Proof remove(long proofId)
		throws NoSuchProofException, SystemException {
		return remove((Serializable)proofId);
	}

	/**
	 * Removes the proof with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the proof
	 * @return the proof that was removed
	 * @throws com.hrms.NoSuchProofException if a proof with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Proof remove(Serializable primaryKey)
		throws NoSuchProofException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Proof proof = (Proof)session.get(ProofImpl.class, primaryKey);

			if (proof == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchProofException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(proof);
		}
		catch (NoSuchProofException nsee) {
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
	protected Proof removeImpl(Proof proof) throws SystemException {
		proof = toUnwrappedModel(proof);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(proof)) {
				proof = (Proof)session.get(ProofImpl.class,
						proof.getPrimaryKeyObj());
			}

			if (proof != null) {
				session.delete(proof);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (proof != null) {
			clearCache(proof);
		}

		return proof;
	}

	@Override
	public Proof updateImpl(com.hrms.model.Proof proof)
		throws SystemException {
		proof = toUnwrappedModel(proof);

		boolean isNew = proof.isNew();

		Session session = null;

		try {
			session = openSession();

			if (proof.isNew()) {
				session.save(proof);

				proof.setNew(false);
			}
			else {
				session.merge(proof);
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

		EntityCacheUtil.putResult(ProofModelImpl.ENTITY_CACHE_ENABLED,
			ProofImpl.class, proof.getPrimaryKey(), proof);

		return proof;
	}

	protected Proof toUnwrappedModel(Proof proof) {
		if (proof instanceof ProofImpl) {
			return proof;
		}

		ProofImpl proofImpl = new ProofImpl();

		proofImpl.setNew(proof.isNew());
		proofImpl.setPrimaryKey(proof.getPrimaryKey());

		proofImpl.setProofId(proof.getProofId());
		proofImpl.setProofType(proof.getProofType());
		proofImpl.setStatus(proof.isStatus());

		return proofImpl;
	}

	/**
	 * Returns the proof with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the proof
	 * @return the proof
	 * @throws com.hrms.NoSuchProofException if a proof with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Proof findByPrimaryKey(Serializable primaryKey)
		throws NoSuchProofException, SystemException {
		Proof proof = fetchByPrimaryKey(primaryKey);

		if (proof == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchProofException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return proof;
	}

	/**
	 * Returns the proof with the primary key or throws a {@link com.hrms.NoSuchProofException} if it could not be found.
	 *
	 * @param proofId the primary key of the proof
	 * @return the proof
	 * @throws com.hrms.NoSuchProofException if a proof with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Proof findByPrimaryKey(long proofId)
		throws NoSuchProofException, SystemException {
		return findByPrimaryKey((Serializable)proofId);
	}

	/**
	 * Returns the proof with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the proof
	 * @return the proof, or <code>null</code> if a proof with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Proof fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Proof proof = (Proof)EntityCacheUtil.getResult(ProofModelImpl.ENTITY_CACHE_ENABLED,
				ProofImpl.class, primaryKey);

		if (proof == _nullProof) {
			return null;
		}

		if (proof == null) {
			Session session = null;

			try {
				session = openSession();

				proof = (Proof)session.get(ProofImpl.class, primaryKey);

				if (proof != null) {
					cacheResult(proof);
				}
				else {
					EntityCacheUtil.putResult(ProofModelImpl.ENTITY_CACHE_ENABLED,
						ProofImpl.class, primaryKey, _nullProof);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(ProofModelImpl.ENTITY_CACHE_ENABLED,
					ProofImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return proof;
	}

	/**
	 * Returns the proof with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param proofId the primary key of the proof
	 * @return the proof, or <code>null</code> if a proof with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Proof fetchByPrimaryKey(long proofId) throws SystemException {
		return fetchByPrimaryKey((Serializable)proofId);
	}

	/**
	 * Returns all the proofs.
	 *
	 * @return the proofs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Proof> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the proofs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.ProofModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of proofs
	 * @param end the upper bound of the range of proofs (not inclusive)
	 * @return the range of proofs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Proof> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the proofs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.ProofModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of proofs
	 * @param end the upper bound of the range of proofs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of proofs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Proof> findAll(int start, int end,
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

		List<Proof> list = (List<Proof>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_PROOF);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PROOF;

				if (pagination) {
					sql = sql.concat(ProofModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Proof>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Proof>(list);
				}
				else {
					list = (List<Proof>)QueryUtil.list(q, getDialect(), start,
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
	 * Removes all the proofs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Proof proof : findAll()) {
			remove(proof);
		}
	}

	/**
	 * Returns the number of proofs.
	 *
	 * @return the number of proofs
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

				Query q = session.createQuery(_SQL_COUNT_PROOF);

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
	 * Initializes the proof persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.hrms.model.Proof")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Proof>> listenersList = new ArrayList<ModelListener<Proof>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Proof>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(ProofImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_PROOF = "SELECT proof FROM Proof proof";
	private static final String _SQL_COUNT_PROOF = "SELECT COUNT(proof) FROM Proof proof";
	private static final String _ORDER_BY_ENTITY_ALIAS = "proof.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Proof exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(ProofPersistenceImpl.class);
	private static Proof _nullProof = new ProofImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Proof> toCacheModel() {
				return _nullProofCacheModel;
			}
		};

	private static CacheModel<Proof> _nullProofCacheModel = new CacheModel<Proof>() {
			@Override
			public Proof toEntityModel() {
				return _nullProof;
			}
		};
}