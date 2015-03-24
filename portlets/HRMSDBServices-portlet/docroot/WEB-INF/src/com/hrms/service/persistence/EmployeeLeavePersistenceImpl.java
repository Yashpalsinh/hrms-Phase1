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

import com.hrms.NoSuchEmployeeLeaveException;

import com.hrms.model.EmployeeLeave;
import com.hrms.model.impl.EmployeeLeaveImpl;
import com.hrms.model.impl.EmployeeLeaveModelImpl;

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
 * The persistence implementation for the employee leave service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author bhavik
 * @see EmployeeLeavePersistence
 * @see EmployeeLeaveUtil
 * @generated
 */
public class EmployeeLeavePersistenceImpl extends BasePersistenceImpl<EmployeeLeave>
	implements EmployeeLeavePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link EmployeeLeaveUtil} to access the employee leave persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = EmployeeLeaveImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(EmployeeLeaveModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeLeaveModelImpl.FINDER_CACHE_ENABLED,
			EmployeeLeaveImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(EmployeeLeaveModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeLeaveModelImpl.FINDER_CACHE_ENABLED,
			EmployeeLeaveImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(EmployeeLeaveModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeLeaveModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public EmployeeLeavePersistenceImpl() {
		setModelClass(EmployeeLeave.class);
	}

	/**
	 * Caches the employee leave in the entity cache if it is enabled.
	 *
	 * @param employeeLeave the employee leave
	 */
	@Override
	public void cacheResult(EmployeeLeave employeeLeave) {
		EntityCacheUtil.putResult(EmployeeLeaveModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeLeaveImpl.class, employeeLeave.getPrimaryKey(),
			employeeLeave);

		employeeLeave.resetOriginalValues();
	}

	/**
	 * Caches the employee leaves in the entity cache if it is enabled.
	 *
	 * @param employeeLeaves the employee leaves
	 */
	@Override
	public void cacheResult(List<EmployeeLeave> employeeLeaves) {
		for (EmployeeLeave employeeLeave : employeeLeaves) {
			if (EntityCacheUtil.getResult(
						EmployeeLeaveModelImpl.ENTITY_CACHE_ENABLED,
						EmployeeLeaveImpl.class, employeeLeave.getPrimaryKey()) == null) {
				cacheResult(employeeLeave);
			}
			else {
				employeeLeave.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all employee leaves.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(EmployeeLeaveImpl.class.getName());
		}

		EntityCacheUtil.clearCache(EmployeeLeaveImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the employee leave.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(EmployeeLeave employeeLeave) {
		EntityCacheUtil.removeResult(EmployeeLeaveModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeLeaveImpl.class, employeeLeave.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<EmployeeLeave> employeeLeaves) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (EmployeeLeave employeeLeave : employeeLeaves) {
			EntityCacheUtil.removeResult(EmployeeLeaveModelImpl.ENTITY_CACHE_ENABLED,
				EmployeeLeaveImpl.class, employeeLeave.getPrimaryKey());
		}
	}

	/**
	 * Creates a new employee leave with the primary key. Does not add the employee leave to the database.
	 *
	 * @param employeeLeaveId the primary key for the new employee leave
	 * @return the new employee leave
	 */
	@Override
	public EmployeeLeave create(long employeeLeaveId) {
		EmployeeLeave employeeLeave = new EmployeeLeaveImpl();

		employeeLeave.setNew(true);
		employeeLeave.setPrimaryKey(employeeLeaveId);

		return employeeLeave;
	}

	/**
	 * Removes the employee leave with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param employeeLeaveId the primary key of the employee leave
	 * @return the employee leave that was removed
	 * @throws com.hrms.NoSuchEmployeeLeaveException if a employee leave with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeLeave remove(long employeeLeaveId)
		throws NoSuchEmployeeLeaveException, SystemException {
		return remove((Serializable)employeeLeaveId);
	}

	/**
	 * Removes the employee leave with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the employee leave
	 * @return the employee leave that was removed
	 * @throws com.hrms.NoSuchEmployeeLeaveException if a employee leave with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeLeave remove(Serializable primaryKey)
		throws NoSuchEmployeeLeaveException, SystemException {
		Session session = null;

		try {
			session = openSession();

			EmployeeLeave employeeLeave = (EmployeeLeave)session.get(EmployeeLeaveImpl.class,
					primaryKey);

			if (employeeLeave == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchEmployeeLeaveException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(employeeLeave);
		}
		catch (NoSuchEmployeeLeaveException nsee) {
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
	protected EmployeeLeave removeImpl(EmployeeLeave employeeLeave)
		throws SystemException {
		employeeLeave = toUnwrappedModel(employeeLeave);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(employeeLeave)) {
				employeeLeave = (EmployeeLeave)session.get(EmployeeLeaveImpl.class,
						employeeLeave.getPrimaryKeyObj());
			}

			if (employeeLeave != null) {
				session.delete(employeeLeave);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (employeeLeave != null) {
			clearCache(employeeLeave);
		}

		return employeeLeave;
	}

	@Override
	public EmployeeLeave updateImpl(com.hrms.model.EmployeeLeave employeeLeave)
		throws SystemException {
		employeeLeave = toUnwrappedModel(employeeLeave);

		boolean isNew = employeeLeave.isNew();

		Session session = null;

		try {
			session = openSession();

			if (employeeLeave.isNew()) {
				session.save(employeeLeave);

				employeeLeave.setNew(false);
			}
			else {
				session.merge(employeeLeave);
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

		EntityCacheUtil.putResult(EmployeeLeaveModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeLeaveImpl.class, employeeLeave.getPrimaryKey(),
			employeeLeave);

		return employeeLeave;
	}

	protected EmployeeLeave toUnwrappedModel(EmployeeLeave employeeLeave) {
		if (employeeLeave instanceof EmployeeLeaveImpl) {
			return employeeLeave;
		}

		EmployeeLeaveImpl employeeLeaveImpl = new EmployeeLeaveImpl();

		employeeLeaveImpl.setNew(employeeLeave.isNew());
		employeeLeaveImpl.setPrimaryKey(employeeLeave.getPrimaryKey());

		employeeLeaveImpl.setEmployeeLeaveId(employeeLeave.getEmployeeLeaveId());
		employeeLeaveImpl.setUserId(employeeLeave.getUserId());
		employeeLeaveImpl.setGroupId(employeeLeave.getGroupId());
		employeeLeaveImpl.setCompanyId(employeeLeave.getCompanyId());
		employeeLeaveImpl.setYear(employeeLeave.getYear());
		employeeLeaveImpl.setLeavesCarriedOver(employeeLeave.getLeavesCarriedOver());
		employeeLeaveImpl.setLeavesTakenThisYear(employeeLeave.getLeavesTakenThisYear());
		employeeLeaveImpl.setRemainingLeaves(employeeLeave.getRemainingLeaves());
		employeeLeaveImpl.setLeaveId(employeeLeave.getLeaveId());
		employeeLeaveImpl.setCreateDate(employeeLeave.getCreateDate());
		employeeLeaveImpl.setModifiedDate(employeeLeave.getModifiedDate());
		employeeLeaveImpl.setCreateBy(employeeLeave.getCreateBy());
		employeeLeaveImpl.setModifiedBy(employeeLeave.getModifiedBy());

		return employeeLeaveImpl;
	}

	/**
	 * Returns the employee leave with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the employee leave
	 * @return the employee leave
	 * @throws com.hrms.NoSuchEmployeeLeaveException if a employee leave with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeLeave findByPrimaryKey(Serializable primaryKey)
		throws NoSuchEmployeeLeaveException, SystemException {
		EmployeeLeave employeeLeave = fetchByPrimaryKey(primaryKey);

		if (employeeLeave == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchEmployeeLeaveException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return employeeLeave;
	}

	/**
	 * Returns the employee leave with the primary key or throws a {@link com.hrms.NoSuchEmployeeLeaveException} if it could not be found.
	 *
	 * @param employeeLeaveId the primary key of the employee leave
	 * @return the employee leave
	 * @throws com.hrms.NoSuchEmployeeLeaveException if a employee leave with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeLeave findByPrimaryKey(long employeeLeaveId)
		throws NoSuchEmployeeLeaveException, SystemException {
		return findByPrimaryKey((Serializable)employeeLeaveId);
	}

	/**
	 * Returns the employee leave with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the employee leave
	 * @return the employee leave, or <code>null</code> if a employee leave with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeLeave fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		EmployeeLeave employeeLeave = (EmployeeLeave)EntityCacheUtil.getResult(EmployeeLeaveModelImpl.ENTITY_CACHE_ENABLED,
				EmployeeLeaveImpl.class, primaryKey);

		if (employeeLeave == _nullEmployeeLeave) {
			return null;
		}

		if (employeeLeave == null) {
			Session session = null;

			try {
				session = openSession();

				employeeLeave = (EmployeeLeave)session.get(EmployeeLeaveImpl.class,
						primaryKey);

				if (employeeLeave != null) {
					cacheResult(employeeLeave);
				}
				else {
					EntityCacheUtil.putResult(EmployeeLeaveModelImpl.ENTITY_CACHE_ENABLED,
						EmployeeLeaveImpl.class, primaryKey, _nullEmployeeLeave);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(EmployeeLeaveModelImpl.ENTITY_CACHE_ENABLED,
					EmployeeLeaveImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return employeeLeave;
	}

	/**
	 * Returns the employee leave with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param employeeLeaveId the primary key of the employee leave
	 * @return the employee leave, or <code>null</code> if a employee leave with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeLeave fetchByPrimaryKey(long employeeLeaveId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)employeeLeaveId);
	}

	/**
	 * Returns all the employee leaves.
	 *
	 * @return the employee leaves
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EmployeeLeave> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the employee leaves.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeLeaveModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of employee leaves
	 * @param end the upper bound of the range of employee leaves (not inclusive)
	 * @return the range of employee leaves
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EmployeeLeave> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the employee leaves.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeLeaveModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of employee leaves
	 * @param end the upper bound of the range of employee leaves (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of employee leaves
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EmployeeLeave> findAll(int start, int end,
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

		List<EmployeeLeave> list = (List<EmployeeLeave>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_EMPLOYEELEAVE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_EMPLOYEELEAVE;

				if (pagination) {
					sql = sql.concat(EmployeeLeaveModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<EmployeeLeave>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<EmployeeLeave>(list);
				}
				else {
					list = (List<EmployeeLeave>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the employee leaves from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (EmployeeLeave employeeLeave : findAll()) {
			remove(employeeLeave);
		}
	}

	/**
	 * Returns the number of employee leaves.
	 *
	 * @return the number of employee leaves
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

				Query q = session.createQuery(_SQL_COUNT_EMPLOYEELEAVE);

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
	 * Initializes the employee leave persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.hrms.model.EmployeeLeave")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<EmployeeLeave>> listenersList = new ArrayList<ModelListener<EmployeeLeave>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<EmployeeLeave>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(EmployeeLeaveImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_EMPLOYEELEAVE = "SELECT employeeLeave FROM EmployeeLeave employeeLeave";
	private static final String _SQL_COUNT_EMPLOYEELEAVE = "SELECT COUNT(employeeLeave) FROM EmployeeLeave employeeLeave";
	private static final String _ORDER_BY_ENTITY_ALIAS = "employeeLeave.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No EmployeeLeave exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(EmployeeLeavePersistenceImpl.class);
	private static EmployeeLeave _nullEmployeeLeave = new EmployeeLeaveImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<EmployeeLeave> toCacheModel() {
				return _nullEmployeeLeaveCacheModel;
			}
		};

	private static CacheModel<EmployeeLeave> _nullEmployeeLeaveCacheModel = new CacheModel<EmployeeLeave>() {
			@Override
			public EmployeeLeave toEntityModel() {
				return _nullEmployeeLeave;
			}
		};
}