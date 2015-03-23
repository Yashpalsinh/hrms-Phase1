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

import com.hrms.NoSuchLeaveException;

import com.hrms.model.Leave;
import com.hrms.model.impl.LeaveImpl;
import com.hrms.model.impl.LeaveModelImpl;

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
 * The persistence implementation for the leave service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author yashpalsinh
 * @see LeavePersistence
 * @see LeaveUtil
 * @generated
 */
public class LeavePersistenceImpl extends BasePersistenceImpl<Leave>
	implements LeavePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link LeaveUtil} to access the leave persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = LeaveImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(LeaveModelImpl.ENTITY_CACHE_ENABLED,
			LeaveModelImpl.FINDER_CACHE_ENABLED, LeaveImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(LeaveModelImpl.ENTITY_CACHE_ENABLED,
			LeaveModelImpl.FINDER_CACHE_ENABLED, LeaveImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(LeaveModelImpl.ENTITY_CACHE_ENABLED,
			LeaveModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public LeavePersistenceImpl() {
		setModelClass(Leave.class);
	}

	/**
	 * Caches the leave in the entity cache if it is enabled.
	 *
	 * @param leave the leave
	 */
	@Override
	public void cacheResult(Leave leave) {
		EntityCacheUtil.putResult(LeaveModelImpl.ENTITY_CACHE_ENABLED,
			LeaveImpl.class, leave.getPrimaryKey(), leave);

		leave.resetOriginalValues();
	}

	/**
	 * Caches the leaves in the entity cache if it is enabled.
	 *
	 * @param leaves the leaves
	 */
	@Override
	public void cacheResult(List<Leave> leaves) {
		for (Leave leave : leaves) {
			if (EntityCacheUtil.getResult(LeaveModelImpl.ENTITY_CACHE_ENABLED,
						LeaveImpl.class, leave.getPrimaryKey()) == null) {
				cacheResult(leave);
			}
			else {
				leave.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all leaves.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(LeaveImpl.class.getName());
		}

		EntityCacheUtil.clearCache(LeaveImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the leave.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Leave leave) {
		EntityCacheUtil.removeResult(LeaveModelImpl.ENTITY_CACHE_ENABLED,
			LeaveImpl.class, leave.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Leave> leaves) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Leave leave : leaves) {
			EntityCacheUtil.removeResult(LeaveModelImpl.ENTITY_CACHE_ENABLED,
				LeaveImpl.class, leave.getPrimaryKey());
		}
	}

	/**
	 * Creates a new leave with the primary key. Does not add the leave to the database.
	 *
	 * @param leaveId the primary key for the new leave
	 * @return the new leave
	 */
	@Override
	public Leave create(long leaveId) {
		Leave leave = new LeaveImpl();

		leave.setNew(true);
		leave.setPrimaryKey(leaveId);

		return leave;
	}

	/**
	 * Removes the leave with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param leaveId the primary key of the leave
	 * @return the leave that was removed
	 * @throws com.hrms.NoSuchLeaveException if a leave with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Leave remove(long leaveId)
		throws NoSuchLeaveException, SystemException {
		return remove((Serializable)leaveId);
	}

	/**
	 * Removes the leave with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the leave
	 * @return the leave that was removed
	 * @throws com.hrms.NoSuchLeaveException if a leave with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Leave remove(Serializable primaryKey)
		throws NoSuchLeaveException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Leave leave = (Leave)session.get(LeaveImpl.class, primaryKey);

			if (leave == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchLeaveException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(leave);
		}
		catch (NoSuchLeaveException nsee) {
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
	protected Leave removeImpl(Leave leave) throws SystemException {
		leave = toUnwrappedModel(leave);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(leave)) {
				leave = (Leave)session.get(LeaveImpl.class,
						leave.getPrimaryKeyObj());
			}

			if (leave != null) {
				session.delete(leave);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (leave != null) {
			clearCache(leave);
		}

		return leave;
	}

	@Override
	public Leave updateImpl(com.hrms.model.Leave leave)
		throws SystemException {
		leave = toUnwrappedModel(leave);

		boolean isNew = leave.isNew();

		Session session = null;

		try {
			session = openSession();

			if (leave.isNew()) {
				session.save(leave);

				leave.setNew(false);
			}
			else {
				session.merge(leave);
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

		EntityCacheUtil.putResult(LeaveModelImpl.ENTITY_CACHE_ENABLED,
			LeaveImpl.class, leave.getPrimaryKey(), leave);

		return leave;
	}

	protected Leave toUnwrappedModel(Leave leave) {
		if (leave instanceof LeaveImpl) {
			return leave;
		}

		LeaveImpl leaveImpl = new LeaveImpl();

		leaveImpl.setNew(leave.isNew());
		leaveImpl.setPrimaryKey(leave.getPrimaryKey());

		leaveImpl.setLeaveId(leave.getLeaveId());
		leaveImpl.setGroupId(leave.getGroupId());
		leaveImpl.setCompanyId(leave.getCompanyId());
		leaveImpl.setLeaveName(leave.getLeaveName());
		leaveImpl.setLeaveType(leave.getLeaveType());
		leaveImpl.setLeavesAllowedPerYear(leave.getLeavesAllowedPerYear());
		leaveImpl.setCarryOver(leave.isCarryOver());
		leaveImpl.setEncachement(leave.isEncachement());
		leaveImpl.setStatus(leave.isStatus());
		leaveImpl.setCreateDate(leave.getCreateDate());
		leaveImpl.setModifiedDate(leave.getModifiedDate());
		leaveImpl.setCreateBy(leave.getCreateBy());
		leaveImpl.setModifiedBy(leave.getModifiedBy());

		return leaveImpl;
	}

	/**
	 * Returns the leave with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the leave
	 * @return the leave
	 * @throws com.hrms.NoSuchLeaveException if a leave with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Leave findByPrimaryKey(Serializable primaryKey)
		throws NoSuchLeaveException, SystemException {
		Leave leave = fetchByPrimaryKey(primaryKey);

		if (leave == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchLeaveException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return leave;
	}

	/**
	 * Returns the leave with the primary key or throws a {@link com.hrms.NoSuchLeaveException} if it could not be found.
	 *
	 * @param leaveId the primary key of the leave
	 * @return the leave
	 * @throws com.hrms.NoSuchLeaveException if a leave with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Leave findByPrimaryKey(long leaveId)
		throws NoSuchLeaveException, SystemException {
		return findByPrimaryKey((Serializable)leaveId);
	}

	/**
	 * Returns the leave with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the leave
	 * @return the leave, or <code>null</code> if a leave with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Leave fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Leave leave = (Leave)EntityCacheUtil.getResult(LeaveModelImpl.ENTITY_CACHE_ENABLED,
				LeaveImpl.class, primaryKey);

		if (leave == _nullLeave) {
			return null;
		}

		if (leave == null) {
			Session session = null;

			try {
				session = openSession();

				leave = (Leave)session.get(LeaveImpl.class, primaryKey);

				if (leave != null) {
					cacheResult(leave);
				}
				else {
					EntityCacheUtil.putResult(LeaveModelImpl.ENTITY_CACHE_ENABLED,
						LeaveImpl.class, primaryKey, _nullLeave);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(LeaveModelImpl.ENTITY_CACHE_ENABLED,
					LeaveImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return leave;
	}

	/**
	 * Returns the leave with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param leaveId the primary key of the leave
	 * @return the leave, or <code>null</code> if a leave with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Leave fetchByPrimaryKey(long leaveId) throws SystemException {
		return fetchByPrimaryKey((Serializable)leaveId);
	}

	/**
	 * Returns all the leaves.
	 *
	 * @return the leaves
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Leave> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the leaves.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.LeaveModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of leaves
	 * @param end the upper bound of the range of leaves (not inclusive)
	 * @return the range of leaves
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Leave> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the leaves.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.LeaveModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of leaves
	 * @param end the upper bound of the range of leaves (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of leaves
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Leave> findAll(int start, int end,
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

		List<Leave> list = (List<Leave>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_LEAVE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_LEAVE;

				if (pagination) {
					sql = sql.concat(LeaveModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Leave>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Leave>(list);
				}
				else {
					list = (List<Leave>)QueryUtil.list(q, getDialect(), start,
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
	 * Removes all the leaves from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Leave leave : findAll()) {
			remove(leave);
		}
	}

	/**
	 * Returns the number of leaves.
	 *
	 * @return the number of leaves
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

				Query q = session.createQuery(_SQL_COUNT_LEAVE);

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
	 * Initializes the leave persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.hrms.model.Leave")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Leave>> listenersList = new ArrayList<ModelListener<Leave>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Leave>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(LeaveImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_LEAVE = "SELECT leave FROM Leave leave";
	private static final String _SQL_COUNT_LEAVE = "SELECT COUNT(leave) FROM Leave leave";
	private static final String _ORDER_BY_ENTITY_ALIAS = "leave.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Leave exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(LeavePersistenceImpl.class);
	private static Leave _nullLeave = new LeaveImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Leave> toCacheModel() {
				return _nullLeaveCacheModel;
			}
		};

	private static CacheModel<Leave> _nullLeaveCacheModel = new CacheModel<Leave>() {
			@Override
			public Leave toEntityModel() {
				return _nullLeave;
			}
		};
}