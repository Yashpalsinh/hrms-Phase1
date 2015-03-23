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

import com.hrms.NoSuchEmployeeTimesheetException;

import com.hrms.model.EmployeeTimesheet;
import com.hrms.model.impl.EmployeeTimesheetImpl;
import com.hrms.model.impl.EmployeeTimesheetModelImpl;

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
 * The persistence implementation for the employee timesheet service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author yashpalsinh
 * @see EmployeeTimesheetPersistence
 * @see EmployeeTimesheetUtil
 * @generated
 */
public class EmployeeTimesheetPersistenceImpl extends BasePersistenceImpl<EmployeeTimesheet>
	implements EmployeeTimesheetPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link EmployeeTimesheetUtil} to access the employee timesheet persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = EmployeeTimesheetImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(EmployeeTimesheetModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeTimesheetModelImpl.FINDER_CACHE_ENABLED,
			EmployeeTimesheetImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(EmployeeTimesheetModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeTimesheetModelImpl.FINDER_CACHE_ENABLED,
			EmployeeTimesheetImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(EmployeeTimesheetModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeTimesheetModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public EmployeeTimesheetPersistenceImpl() {
		setModelClass(EmployeeTimesheet.class);
	}

	/**
	 * Caches the employee timesheet in the entity cache if it is enabled.
	 *
	 * @param employeeTimesheet the employee timesheet
	 */
	@Override
	public void cacheResult(EmployeeTimesheet employeeTimesheet) {
		EntityCacheUtil.putResult(EmployeeTimesheetModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeTimesheetImpl.class, employeeTimesheet.getPrimaryKey(),
			employeeTimesheet);

		employeeTimesheet.resetOriginalValues();
	}

	/**
	 * Caches the employee timesheets in the entity cache if it is enabled.
	 *
	 * @param employeeTimesheets the employee timesheets
	 */
	@Override
	public void cacheResult(List<EmployeeTimesheet> employeeTimesheets) {
		for (EmployeeTimesheet employeeTimesheet : employeeTimesheets) {
			if (EntityCacheUtil.getResult(
						EmployeeTimesheetModelImpl.ENTITY_CACHE_ENABLED,
						EmployeeTimesheetImpl.class,
						employeeTimesheet.getPrimaryKey()) == null) {
				cacheResult(employeeTimesheet);
			}
			else {
				employeeTimesheet.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all employee timesheets.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(EmployeeTimesheetImpl.class.getName());
		}

		EntityCacheUtil.clearCache(EmployeeTimesheetImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the employee timesheet.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(EmployeeTimesheet employeeTimesheet) {
		EntityCacheUtil.removeResult(EmployeeTimesheetModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeTimesheetImpl.class, employeeTimesheet.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<EmployeeTimesheet> employeeTimesheets) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (EmployeeTimesheet employeeTimesheet : employeeTimesheets) {
			EntityCacheUtil.removeResult(EmployeeTimesheetModelImpl.ENTITY_CACHE_ENABLED,
				EmployeeTimesheetImpl.class, employeeTimesheet.getPrimaryKey());
		}
	}

	/**
	 * Creates a new employee timesheet with the primary key. Does not add the employee timesheet to the database.
	 *
	 * @param timesheetId the primary key for the new employee timesheet
	 * @return the new employee timesheet
	 */
	@Override
	public EmployeeTimesheet create(long timesheetId) {
		EmployeeTimesheet employeeTimesheet = new EmployeeTimesheetImpl();

		employeeTimesheet.setNew(true);
		employeeTimesheet.setPrimaryKey(timesheetId);

		return employeeTimesheet;
	}

	/**
	 * Removes the employee timesheet with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param timesheetId the primary key of the employee timesheet
	 * @return the employee timesheet that was removed
	 * @throws com.hrms.NoSuchEmployeeTimesheetException if a employee timesheet with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeTimesheet remove(long timesheetId)
		throws NoSuchEmployeeTimesheetException, SystemException {
		return remove((Serializable)timesheetId);
	}

	/**
	 * Removes the employee timesheet with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the employee timesheet
	 * @return the employee timesheet that was removed
	 * @throws com.hrms.NoSuchEmployeeTimesheetException if a employee timesheet with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeTimesheet remove(Serializable primaryKey)
		throws NoSuchEmployeeTimesheetException, SystemException {
		Session session = null;

		try {
			session = openSession();

			EmployeeTimesheet employeeTimesheet = (EmployeeTimesheet)session.get(EmployeeTimesheetImpl.class,
					primaryKey);

			if (employeeTimesheet == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchEmployeeTimesheetException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(employeeTimesheet);
		}
		catch (NoSuchEmployeeTimesheetException nsee) {
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
	protected EmployeeTimesheet removeImpl(EmployeeTimesheet employeeTimesheet)
		throws SystemException {
		employeeTimesheet = toUnwrappedModel(employeeTimesheet);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(employeeTimesheet)) {
				employeeTimesheet = (EmployeeTimesheet)session.get(EmployeeTimesheetImpl.class,
						employeeTimesheet.getPrimaryKeyObj());
			}

			if (employeeTimesheet != null) {
				session.delete(employeeTimesheet);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (employeeTimesheet != null) {
			clearCache(employeeTimesheet);
		}

		return employeeTimesheet;
	}

	@Override
	public EmployeeTimesheet updateImpl(
		com.hrms.model.EmployeeTimesheet employeeTimesheet)
		throws SystemException {
		employeeTimesheet = toUnwrappedModel(employeeTimesheet);

		boolean isNew = employeeTimesheet.isNew();

		Session session = null;

		try {
			session = openSession();

			if (employeeTimesheet.isNew()) {
				session.save(employeeTimesheet);

				employeeTimesheet.setNew(false);
			}
			else {
				session.merge(employeeTimesheet);
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

		EntityCacheUtil.putResult(EmployeeTimesheetModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeTimesheetImpl.class, employeeTimesheet.getPrimaryKey(),
			employeeTimesheet);

		return employeeTimesheet;
	}

	protected EmployeeTimesheet toUnwrappedModel(
		EmployeeTimesheet employeeTimesheet) {
		if (employeeTimesheet instanceof EmployeeTimesheetImpl) {
			return employeeTimesheet;
		}

		EmployeeTimesheetImpl employeeTimesheetImpl = new EmployeeTimesheetImpl();

		employeeTimesheetImpl.setNew(employeeTimesheet.isNew());
		employeeTimesheetImpl.setPrimaryKey(employeeTimesheet.getPrimaryKey());

		employeeTimesheetImpl.setTimesheetId(employeeTimesheet.getTimesheetId());
		employeeTimesheetImpl.setUserId(employeeTimesheet.getUserId());
		employeeTimesheetImpl.setGroupId(employeeTimesheet.getGroupId());
		employeeTimesheetImpl.setCompanyId(employeeTimesheet.getCompanyId());
		employeeTimesheetImpl.setTaskTitle(employeeTimesheet.getTaskTitle());
		employeeTimesheetImpl.setTaskDescription(employeeTimesheet.getTaskDescription());
		employeeTimesheetImpl.setTaskFileId(employeeTimesheet.getTaskFileId());
		employeeTimesheetImpl.setTaskFilePath(employeeTimesheet.getTaskFilePath());
		employeeTimesheetImpl.setTaskStarttime(employeeTimesheet.getTaskStarttime());
		employeeTimesheetImpl.setTaskEndtime(employeeTimesheet.getTaskEndtime());
		employeeTimesheetImpl.setTaskDate(employeeTimesheet.getTaskDate());
		employeeTimesheetImpl.setDuration(employeeTimesheet.getDuration());
		employeeTimesheetImpl.setTaskCompleted(employeeTimesheet.isTaskCompleted());
		employeeTimesheetImpl.setBillable(employeeTimesheet.isBillable());
		employeeTimesheetImpl.setBilled(employeeTimesheet.isBilled());
		employeeTimesheetImpl.setCreateDate(employeeTimesheet.getCreateDate());
		employeeTimesheetImpl.setModifiedDate(employeeTimesheet.getModifiedDate());
		employeeTimesheetImpl.setCreateBy(employeeTimesheet.getCreateBy());
		employeeTimesheetImpl.setModifiedBy(employeeTimesheet.getModifiedBy());

		return employeeTimesheetImpl;
	}

	/**
	 * Returns the employee timesheet with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the employee timesheet
	 * @return the employee timesheet
	 * @throws com.hrms.NoSuchEmployeeTimesheetException if a employee timesheet with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeTimesheet findByPrimaryKey(Serializable primaryKey)
		throws NoSuchEmployeeTimesheetException, SystemException {
		EmployeeTimesheet employeeTimesheet = fetchByPrimaryKey(primaryKey);

		if (employeeTimesheet == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchEmployeeTimesheetException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return employeeTimesheet;
	}

	/**
	 * Returns the employee timesheet with the primary key or throws a {@link com.hrms.NoSuchEmployeeTimesheetException} if it could not be found.
	 *
	 * @param timesheetId the primary key of the employee timesheet
	 * @return the employee timesheet
	 * @throws com.hrms.NoSuchEmployeeTimesheetException if a employee timesheet with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeTimesheet findByPrimaryKey(long timesheetId)
		throws NoSuchEmployeeTimesheetException, SystemException {
		return findByPrimaryKey((Serializable)timesheetId);
	}

	/**
	 * Returns the employee timesheet with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the employee timesheet
	 * @return the employee timesheet, or <code>null</code> if a employee timesheet with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeTimesheet fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		EmployeeTimesheet employeeTimesheet = (EmployeeTimesheet)EntityCacheUtil.getResult(EmployeeTimesheetModelImpl.ENTITY_CACHE_ENABLED,
				EmployeeTimesheetImpl.class, primaryKey);

		if (employeeTimesheet == _nullEmployeeTimesheet) {
			return null;
		}

		if (employeeTimesheet == null) {
			Session session = null;

			try {
				session = openSession();

				employeeTimesheet = (EmployeeTimesheet)session.get(EmployeeTimesheetImpl.class,
						primaryKey);

				if (employeeTimesheet != null) {
					cacheResult(employeeTimesheet);
				}
				else {
					EntityCacheUtil.putResult(EmployeeTimesheetModelImpl.ENTITY_CACHE_ENABLED,
						EmployeeTimesheetImpl.class, primaryKey,
						_nullEmployeeTimesheet);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(EmployeeTimesheetModelImpl.ENTITY_CACHE_ENABLED,
					EmployeeTimesheetImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return employeeTimesheet;
	}

	/**
	 * Returns the employee timesheet with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param timesheetId the primary key of the employee timesheet
	 * @return the employee timesheet, or <code>null</code> if a employee timesheet with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeTimesheet fetchByPrimaryKey(long timesheetId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)timesheetId);
	}

	/**
	 * Returns all the employee timesheets.
	 *
	 * @return the employee timesheets
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EmployeeTimesheet> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the employee timesheets.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeTimesheetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of employee timesheets
	 * @param end the upper bound of the range of employee timesheets (not inclusive)
	 * @return the range of employee timesheets
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EmployeeTimesheet> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the employee timesheets.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeTimesheetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of employee timesheets
	 * @param end the upper bound of the range of employee timesheets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of employee timesheets
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EmployeeTimesheet> findAll(int start, int end,
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

		List<EmployeeTimesheet> list = (List<EmployeeTimesheet>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_EMPLOYEETIMESHEET);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_EMPLOYEETIMESHEET;

				if (pagination) {
					sql = sql.concat(EmployeeTimesheetModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<EmployeeTimesheet>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<EmployeeTimesheet>(list);
				}
				else {
					list = (List<EmployeeTimesheet>)QueryUtil.list(q,
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
	 * Removes all the employee timesheets from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (EmployeeTimesheet employeeTimesheet : findAll()) {
			remove(employeeTimesheet);
		}
	}

	/**
	 * Returns the number of employee timesheets.
	 *
	 * @return the number of employee timesheets
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

				Query q = session.createQuery(_SQL_COUNT_EMPLOYEETIMESHEET);

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
	 * Initializes the employee timesheet persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.hrms.model.EmployeeTimesheet")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<EmployeeTimesheet>> listenersList = new ArrayList<ModelListener<EmployeeTimesheet>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<EmployeeTimesheet>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(EmployeeTimesheetImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_EMPLOYEETIMESHEET = "SELECT employeeTimesheet FROM EmployeeTimesheet employeeTimesheet";
	private static final String _SQL_COUNT_EMPLOYEETIMESHEET = "SELECT COUNT(employeeTimesheet) FROM EmployeeTimesheet employeeTimesheet";
	private static final String _ORDER_BY_ENTITY_ALIAS = "employeeTimesheet.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No EmployeeTimesheet exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(EmployeeTimesheetPersistenceImpl.class);
	private static EmployeeTimesheet _nullEmployeeTimesheet = new EmployeeTimesheetImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<EmployeeTimesheet> toCacheModel() {
				return _nullEmployeeTimesheetCacheModel;
			}
		};

	private static CacheModel<EmployeeTimesheet> _nullEmployeeTimesheetCacheModel =
		new CacheModel<EmployeeTimesheet>() {
			@Override
			public EmployeeTimesheet toEntityModel() {
				return _nullEmployeeTimesheet;
			}
		};
}