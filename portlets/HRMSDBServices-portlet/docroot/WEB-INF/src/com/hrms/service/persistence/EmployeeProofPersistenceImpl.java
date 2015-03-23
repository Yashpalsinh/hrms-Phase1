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

import com.hrms.NoSuchEmployeeProofException;

import com.hrms.model.EmployeeProof;
import com.hrms.model.impl.EmployeeProofImpl;
import com.hrms.model.impl.EmployeeProofModelImpl;

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
 * The persistence implementation for the employee proof service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author yashpalsinh
 * @see EmployeeProofPersistence
 * @see EmployeeProofUtil
 * @generated
 */
public class EmployeeProofPersistenceImpl extends BasePersistenceImpl<EmployeeProof>
	implements EmployeeProofPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link EmployeeProofUtil} to access the employee proof persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = EmployeeProofImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(EmployeeProofModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeProofModelImpl.FINDER_CACHE_ENABLED,
			EmployeeProofImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(EmployeeProofModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeProofModelImpl.FINDER_CACHE_ENABLED,
			EmployeeProofImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(EmployeeProofModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeProofModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public EmployeeProofPersistenceImpl() {
		setModelClass(EmployeeProof.class);
	}

	/**
	 * Caches the employee proof in the entity cache if it is enabled.
	 *
	 * @param employeeProof the employee proof
	 */
	@Override
	public void cacheResult(EmployeeProof employeeProof) {
		EntityCacheUtil.putResult(EmployeeProofModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeProofImpl.class, employeeProof.getPrimaryKey(),
			employeeProof);

		employeeProof.resetOriginalValues();
	}

	/**
	 * Caches the employee proofs in the entity cache if it is enabled.
	 *
	 * @param employeeProofs the employee proofs
	 */
	@Override
	public void cacheResult(List<EmployeeProof> employeeProofs) {
		for (EmployeeProof employeeProof : employeeProofs) {
			if (EntityCacheUtil.getResult(
						EmployeeProofModelImpl.ENTITY_CACHE_ENABLED,
						EmployeeProofImpl.class, employeeProof.getPrimaryKey()) == null) {
				cacheResult(employeeProof);
			}
			else {
				employeeProof.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all employee proofs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(EmployeeProofImpl.class.getName());
		}

		EntityCacheUtil.clearCache(EmployeeProofImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the employee proof.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(EmployeeProof employeeProof) {
		EntityCacheUtil.removeResult(EmployeeProofModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeProofImpl.class, employeeProof.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<EmployeeProof> employeeProofs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (EmployeeProof employeeProof : employeeProofs) {
			EntityCacheUtil.removeResult(EmployeeProofModelImpl.ENTITY_CACHE_ENABLED,
				EmployeeProofImpl.class, employeeProof.getPrimaryKey());
		}
	}

	/**
	 * Creates a new employee proof with the primary key. Does not add the employee proof to the database.
	 *
	 * @param employeeproofNo the primary key for the new employee proof
	 * @return the new employee proof
	 */
	@Override
	public EmployeeProof create(long employeeproofNo) {
		EmployeeProof employeeProof = new EmployeeProofImpl();

		employeeProof.setNew(true);
		employeeProof.setPrimaryKey(employeeproofNo);

		return employeeProof;
	}

	/**
	 * Removes the employee proof with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param employeeproofNo the primary key of the employee proof
	 * @return the employee proof that was removed
	 * @throws com.hrms.NoSuchEmployeeProofException if a employee proof with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeProof remove(long employeeproofNo)
		throws NoSuchEmployeeProofException, SystemException {
		return remove((Serializable)employeeproofNo);
	}

	/**
	 * Removes the employee proof with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the employee proof
	 * @return the employee proof that was removed
	 * @throws com.hrms.NoSuchEmployeeProofException if a employee proof with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeProof remove(Serializable primaryKey)
		throws NoSuchEmployeeProofException, SystemException {
		Session session = null;

		try {
			session = openSession();

			EmployeeProof employeeProof = (EmployeeProof)session.get(EmployeeProofImpl.class,
					primaryKey);

			if (employeeProof == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchEmployeeProofException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(employeeProof);
		}
		catch (NoSuchEmployeeProofException nsee) {
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
	protected EmployeeProof removeImpl(EmployeeProof employeeProof)
		throws SystemException {
		employeeProof = toUnwrappedModel(employeeProof);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(employeeProof)) {
				employeeProof = (EmployeeProof)session.get(EmployeeProofImpl.class,
						employeeProof.getPrimaryKeyObj());
			}

			if (employeeProof != null) {
				session.delete(employeeProof);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (employeeProof != null) {
			clearCache(employeeProof);
		}

		return employeeProof;
	}

	@Override
	public EmployeeProof updateImpl(com.hrms.model.EmployeeProof employeeProof)
		throws SystemException {
		employeeProof = toUnwrappedModel(employeeProof);

		boolean isNew = employeeProof.isNew();

		Session session = null;

		try {
			session = openSession();

			if (employeeProof.isNew()) {
				session.save(employeeProof);

				employeeProof.setNew(false);
			}
			else {
				session.merge(employeeProof);
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

		EntityCacheUtil.putResult(EmployeeProofModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeProofImpl.class, employeeProof.getPrimaryKey(),
			employeeProof);

		return employeeProof;
	}

	protected EmployeeProof toUnwrappedModel(EmployeeProof employeeProof) {
		if (employeeProof instanceof EmployeeProofImpl) {
			return employeeProof;
		}

		EmployeeProofImpl employeeProofImpl = new EmployeeProofImpl();

		employeeProofImpl.setNew(employeeProof.isNew());
		employeeProofImpl.setPrimaryKey(employeeProof.getPrimaryKey());

		employeeProofImpl.setEmployeeproofNo(employeeProof.getEmployeeproofNo());
		employeeProofImpl.setProofId(employeeProof.getProofId());
		employeeProofImpl.setUserId(employeeProof.getUserId());
		employeeProofImpl.setExpirationDate(employeeProof.getExpirationDate());

		return employeeProofImpl;
	}

	/**
	 * Returns the employee proof with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the employee proof
	 * @return the employee proof
	 * @throws com.hrms.NoSuchEmployeeProofException if a employee proof with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeProof findByPrimaryKey(Serializable primaryKey)
		throws NoSuchEmployeeProofException, SystemException {
		EmployeeProof employeeProof = fetchByPrimaryKey(primaryKey);

		if (employeeProof == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchEmployeeProofException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return employeeProof;
	}

	/**
	 * Returns the employee proof with the primary key or throws a {@link com.hrms.NoSuchEmployeeProofException} if it could not be found.
	 *
	 * @param employeeproofNo the primary key of the employee proof
	 * @return the employee proof
	 * @throws com.hrms.NoSuchEmployeeProofException if a employee proof with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeProof findByPrimaryKey(long employeeproofNo)
		throws NoSuchEmployeeProofException, SystemException {
		return findByPrimaryKey((Serializable)employeeproofNo);
	}

	/**
	 * Returns the employee proof with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the employee proof
	 * @return the employee proof, or <code>null</code> if a employee proof with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeProof fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		EmployeeProof employeeProof = (EmployeeProof)EntityCacheUtil.getResult(EmployeeProofModelImpl.ENTITY_CACHE_ENABLED,
				EmployeeProofImpl.class, primaryKey);

		if (employeeProof == _nullEmployeeProof) {
			return null;
		}

		if (employeeProof == null) {
			Session session = null;

			try {
				session = openSession();

				employeeProof = (EmployeeProof)session.get(EmployeeProofImpl.class,
						primaryKey);

				if (employeeProof != null) {
					cacheResult(employeeProof);
				}
				else {
					EntityCacheUtil.putResult(EmployeeProofModelImpl.ENTITY_CACHE_ENABLED,
						EmployeeProofImpl.class, primaryKey, _nullEmployeeProof);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(EmployeeProofModelImpl.ENTITY_CACHE_ENABLED,
					EmployeeProofImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return employeeProof;
	}

	/**
	 * Returns the employee proof with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param employeeproofNo the primary key of the employee proof
	 * @return the employee proof, or <code>null</code> if a employee proof with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeProof fetchByPrimaryKey(long employeeproofNo)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)employeeproofNo);
	}

	/**
	 * Returns all the employee proofs.
	 *
	 * @return the employee proofs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EmployeeProof> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the employee proofs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeProofModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of employee proofs
	 * @param end the upper bound of the range of employee proofs (not inclusive)
	 * @return the range of employee proofs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EmployeeProof> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the employee proofs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeProofModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of employee proofs
	 * @param end the upper bound of the range of employee proofs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of employee proofs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EmployeeProof> findAll(int start, int end,
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

		List<EmployeeProof> list = (List<EmployeeProof>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_EMPLOYEEPROOF);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_EMPLOYEEPROOF;

				if (pagination) {
					sql = sql.concat(EmployeeProofModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<EmployeeProof>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<EmployeeProof>(list);
				}
				else {
					list = (List<EmployeeProof>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the employee proofs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (EmployeeProof employeeProof : findAll()) {
			remove(employeeProof);
		}
	}

	/**
	 * Returns the number of employee proofs.
	 *
	 * @return the number of employee proofs
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

				Query q = session.createQuery(_SQL_COUNT_EMPLOYEEPROOF);

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
	 * Initializes the employee proof persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.hrms.model.EmployeeProof")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<EmployeeProof>> listenersList = new ArrayList<ModelListener<EmployeeProof>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<EmployeeProof>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(EmployeeProofImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_EMPLOYEEPROOF = "SELECT employeeProof FROM EmployeeProof employeeProof";
	private static final String _SQL_COUNT_EMPLOYEEPROOF = "SELECT COUNT(employeeProof) FROM EmployeeProof employeeProof";
	private static final String _ORDER_BY_ENTITY_ALIAS = "employeeProof.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No EmployeeProof exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(EmployeeProofPersistenceImpl.class);
	private static EmployeeProof _nullEmployeeProof = new EmployeeProofImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<EmployeeProof> toCacheModel() {
				return _nullEmployeeProofCacheModel;
			}
		};

	private static CacheModel<EmployeeProof> _nullEmployeeProofCacheModel = new CacheModel<EmployeeProof>() {
			@Override
			public EmployeeProof toEntityModel() {
				return _nullEmployeeProof;
			}
		};
}