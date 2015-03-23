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

import com.hrms.NoSuchLeavesAppliedException;

import com.hrms.model.LeavesApplied;
import com.hrms.model.impl.LeavesAppliedImpl;
import com.hrms.model.impl.LeavesAppliedModelImpl;

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
 * The persistence implementation for the leaves applied service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author yashpalsinh
 * @see LeavesAppliedPersistence
 * @see LeavesAppliedUtil
 * @generated
 */
public class LeavesAppliedPersistenceImpl extends BasePersistenceImpl<LeavesApplied>
	implements LeavesAppliedPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link LeavesAppliedUtil} to access the leaves applied persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = LeavesAppliedImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(LeavesAppliedModelImpl.ENTITY_CACHE_ENABLED,
			LeavesAppliedModelImpl.FINDER_CACHE_ENABLED,
			LeavesAppliedImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(LeavesAppliedModelImpl.ENTITY_CACHE_ENABLED,
			LeavesAppliedModelImpl.FINDER_CACHE_ENABLED,
			LeavesAppliedImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(LeavesAppliedModelImpl.ENTITY_CACHE_ENABLED,
			LeavesAppliedModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public LeavesAppliedPersistenceImpl() {
		setModelClass(LeavesApplied.class);
	}

	/**
	 * Caches the leaves applied in the entity cache if it is enabled.
	 *
	 * @param leavesApplied the leaves applied
	 */
	@Override
	public void cacheResult(LeavesApplied leavesApplied) {
		EntityCacheUtil.putResult(LeavesAppliedModelImpl.ENTITY_CACHE_ENABLED,
			LeavesAppliedImpl.class, leavesApplied.getPrimaryKey(),
			leavesApplied);

		leavesApplied.resetOriginalValues();
	}

	/**
	 * Caches the leaves applieds in the entity cache if it is enabled.
	 *
	 * @param leavesApplieds the leaves applieds
	 */
	@Override
	public void cacheResult(List<LeavesApplied> leavesApplieds) {
		for (LeavesApplied leavesApplied : leavesApplieds) {
			if (EntityCacheUtil.getResult(
						LeavesAppliedModelImpl.ENTITY_CACHE_ENABLED,
						LeavesAppliedImpl.class, leavesApplied.getPrimaryKey()) == null) {
				cacheResult(leavesApplied);
			}
			else {
				leavesApplied.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all leaves applieds.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(LeavesAppliedImpl.class.getName());
		}

		EntityCacheUtil.clearCache(LeavesAppliedImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the leaves applied.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(LeavesApplied leavesApplied) {
		EntityCacheUtil.removeResult(LeavesAppliedModelImpl.ENTITY_CACHE_ENABLED,
			LeavesAppliedImpl.class, leavesApplied.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<LeavesApplied> leavesApplieds) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (LeavesApplied leavesApplied : leavesApplieds) {
			EntityCacheUtil.removeResult(LeavesAppliedModelImpl.ENTITY_CACHE_ENABLED,
				LeavesAppliedImpl.class, leavesApplied.getPrimaryKey());
		}
	}

	/**
	 * Creates a new leaves applied with the primary key. Does not add the leaves applied to the database.
	 *
	 * @param appliedLeaveId the primary key for the new leaves applied
	 * @return the new leaves applied
	 */
	@Override
	public LeavesApplied create(long appliedLeaveId) {
		LeavesApplied leavesApplied = new LeavesAppliedImpl();

		leavesApplied.setNew(true);
		leavesApplied.setPrimaryKey(appliedLeaveId);

		return leavesApplied;
	}

	/**
	 * Removes the leaves applied with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param appliedLeaveId the primary key of the leaves applied
	 * @return the leaves applied that was removed
	 * @throws com.hrms.NoSuchLeavesAppliedException if a leaves applied with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LeavesApplied remove(long appliedLeaveId)
		throws NoSuchLeavesAppliedException, SystemException {
		return remove((Serializable)appliedLeaveId);
	}

	/**
	 * Removes the leaves applied with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the leaves applied
	 * @return the leaves applied that was removed
	 * @throws com.hrms.NoSuchLeavesAppliedException if a leaves applied with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LeavesApplied remove(Serializable primaryKey)
		throws NoSuchLeavesAppliedException, SystemException {
		Session session = null;

		try {
			session = openSession();

			LeavesApplied leavesApplied = (LeavesApplied)session.get(LeavesAppliedImpl.class,
					primaryKey);

			if (leavesApplied == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchLeavesAppliedException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(leavesApplied);
		}
		catch (NoSuchLeavesAppliedException nsee) {
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
	protected LeavesApplied removeImpl(LeavesApplied leavesApplied)
		throws SystemException {
		leavesApplied = toUnwrappedModel(leavesApplied);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(leavesApplied)) {
				leavesApplied = (LeavesApplied)session.get(LeavesAppliedImpl.class,
						leavesApplied.getPrimaryKeyObj());
			}

			if (leavesApplied != null) {
				session.delete(leavesApplied);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (leavesApplied != null) {
			clearCache(leavesApplied);
		}

		return leavesApplied;
	}

	@Override
	public LeavesApplied updateImpl(com.hrms.model.LeavesApplied leavesApplied)
		throws SystemException {
		leavesApplied = toUnwrappedModel(leavesApplied);

		boolean isNew = leavesApplied.isNew();

		Session session = null;

		try {
			session = openSession();

			if (leavesApplied.isNew()) {
				session.save(leavesApplied);

				leavesApplied.setNew(false);
			}
			else {
				session.merge(leavesApplied);
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

		EntityCacheUtil.putResult(LeavesAppliedModelImpl.ENTITY_CACHE_ENABLED,
			LeavesAppliedImpl.class, leavesApplied.getPrimaryKey(),
			leavesApplied);

		return leavesApplied;
	}

	protected LeavesApplied toUnwrappedModel(LeavesApplied leavesApplied) {
		if (leavesApplied instanceof LeavesAppliedImpl) {
			return leavesApplied;
		}

		LeavesAppliedImpl leavesAppliedImpl = new LeavesAppliedImpl();

		leavesAppliedImpl.setNew(leavesApplied.isNew());
		leavesAppliedImpl.setPrimaryKey(leavesApplied.getPrimaryKey());

		leavesAppliedImpl.setAppliedLeaveId(leavesApplied.getAppliedLeaveId());
		leavesAppliedImpl.setUserId(leavesApplied.getUserId());
		leavesAppliedImpl.setGroupId(leavesApplied.getGroupId());
		leavesAppliedImpl.setCompanyId(leavesApplied.getCompanyId());
		leavesAppliedImpl.setEntitlement(leavesApplied.getEntitlement());
		leavesAppliedImpl.setLeaveFrom(leavesApplied.getLeaveFrom());
		leavesAppliedImpl.setLeaveTo(leavesApplied.getLeaveTo());
		leavesAppliedImpl.setApprovalStatus(leavesApplied.getApprovalStatus());
		leavesAppliedImpl.setLeaveId(leavesApplied.getLeaveId());
		leavesAppliedImpl.setCreateDate(leavesApplied.getCreateDate());
		leavesAppliedImpl.setModifiedDate(leavesApplied.getModifiedDate());
		leavesAppliedImpl.setCreateBy(leavesApplied.getCreateBy());
		leavesAppliedImpl.setModifiedBy(leavesApplied.getModifiedBy());

		return leavesAppliedImpl;
	}

	/**
	 * Returns the leaves applied with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the leaves applied
	 * @return the leaves applied
	 * @throws com.hrms.NoSuchLeavesAppliedException if a leaves applied with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LeavesApplied findByPrimaryKey(Serializable primaryKey)
		throws NoSuchLeavesAppliedException, SystemException {
		LeavesApplied leavesApplied = fetchByPrimaryKey(primaryKey);

		if (leavesApplied == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchLeavesAppliedException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return leavesApplied;
	}

	/**
	 * Returns the leaves applied with the primary key or throws a {@link com.hrms.NoSuchLeavesAppliedException} if it could not be found.
	 *
	 * @param appliedLeaveId the primary key of the leaves applied
	 * @return the leaves applied
	 * @throws com.hrms.NoSuchLeavesAppliedException if a leaves applied with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LeavesApplied findByPrimaryKey(long appliedLeaveId)
		throws NoSuchLeavesAppliedException, SystemException {
		return findByPrimaryKey((Serializable)appliedLeaveId);
	}

	/**
	 * Returns the leaves applied with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the leaves applied
	 * @return the leaves applied, or <code>null</code> if a leaves applied with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LeavesApplied fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		LeavesApplied leavesApplied = (LeavesApplied)EntityCacheUtil.getResult(LeavesAppliedModelImpl.ENTITY_CACHE_ENABLED,
				LeavesAppliedImpl.class, primaryKey);

		if (leavesApplied == _nullLeavesApplied) {
			return null;
		}

		if (leavesApplied == null) {
			Session session = null;

			try {
				session = openSession();

				leavesApplied = (LeavesApplied)session.get(LeavesAppliedImpl.class,
						primaryKey);

				if (leavesApplied != null) {
					cacheResult(leavesApplied);
				}
				else {
					EntityCacheUtil.putResult(LeavesAppliedModelImpl.ENTITY_CACHE_ENABLED,
						LeavesAppliedImpl.class, primaryKey, _nullLeavesApplied);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(LeavesAppliedModelImpl.ENTITY_CACHE_ENABLED,
					LeavesAppliedImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return leavesApplied;
	}

	/**
	 * Returns the leaves applied with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param appliedLeaveId the primary key of the leaves applied
	 * @return the leaves applied, or <code>null</code> if a leaves applied with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LeavesApplied fetchByPrimaryKey(long appliedLeaveId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)appliedLeaveId);
	}

	/**
	 * Returns all the leaves applieds.
	 *
	 * @return the leaves applieds
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LeavesApplied> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<LeavesApplied> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
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
	@Override
	public List<LeavesApplied> findAll(int start, int end,
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

		List<LeavesApplied> list = (List<LeavesApplied>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_LEAVESAPPLIED);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_LEAVESAPPLIED;

				if (pagination) {
					sql = sql.concat(LeavesAppliedModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<LeavesApplied>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<LeavesApplied>(list);
				}
				else {
					list = (List<LeavesApplied>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the leaves applieds from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (LeavesApplied leavesApplied : findAll()) {
			remove(leavesApplied);
		}
	}

	/**
	 * Returns the number of leaves applieds.
	 *
	 * @return the number of leaves applieds
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

				Query q = session.createQuery(_SQL_COUNT_LEAVESAPPLIED);

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
	 * Initializes the leaves applied persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.hrms.model.LeavesApplied")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<LeavesApplied>> listenersList = new ArrayList<ModelListener<LeavesApplied>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<LeavesApplied>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(LeavesAppliedImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_LEAVESAPPLIED = "SELECT leavesApplied FROM LeavesApplied leavesApplied";
	private static final String _SQL_COUNT_LEAVESAPPLIED = "SELECT COUNT(leavesApplied) FROM LeavesApplied leavesApplied";
	private static final String _ORDER_BY_ENTITY_ALIAS = "leavesApplied.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No LeavesApplied exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(LeavesAppliedPersistenceImpl.class);
	private static LeavesApplied _nullLeavesApplied = new LeavesAppliedImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<LeavesApplied> toCacheModel() {
				return _nullLeavesAppliedCacheModel;
			}
		};

	private static CacheModel<LeavesApplied> _nullLeavesAppliedCacheModel = new CacheModel<LeavesApplied>() {
			@Override
			public LeavesApplied toEntityModel() {
				return _nullLeavesApplied;
			}
		};
}