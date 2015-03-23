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

import com.hrms.NoSuchEmployeeWarningException;

import com.hrms.model.EmployeeWarning;
import com.hrms.model.impl.EmployeeWarningImpl;
import com.hrms.model.impl.EmployeeWarningModelImpl;

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
 * The persistence implementation for the employee warning service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author yashpalsinh
 * @see EmployeeWarningPersistence
 * @see EmployeeWarningUtil
 * @generated
 */
public class EmployeeWarningPersistenceImpl extends BasePersistenceImpl<EmployeeWarning>
	implements EmployeeWarningPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link EmployeeWarningUtil} to access the employee warning persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = EmployeeWarningImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(EmployeeWarningModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeWarningModelImpl.FINDER_CACHE_ENABLED,
			EmployeeWarningImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(EmployeeWarningModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeWarningModelImpl.FINDER_CACHE_ENABLED,
			EmployeeWarningImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(EmployeeWarningModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeWarningModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public EmployeeWarningPersistenceImpl() {
		setModelClass(EmployeeWarning.class);
	}

	/**
	 * Caches the employee warning in the entity cache if it is enabled.
	 *
	 * @param employeeWarning the employee warning
	 */
	@Override
	public void cacheResult(EmployeeWarning employeeWarning) {
		EntityCacheUtil.putResult(EmployeeWarningModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeWarningImpl.class, employeeWarning.getPrimaryKey(),
			employeeWarning);

		employeeWarning.resetOriginalValues();
	}

	/**
	 * Caches the employee warnings in the entity cache if it is enabled.
	 *
	 * @param employeeWarnings the employee warnings
	 */
	@Override
	public void cacheResult(List<EmployeeWarning> employeeWarnings) {
		for (EmployeeWarning employeeWarning : employeeWarnings) {
			if (EntityCacheUtil.getResult(
						EmployeeWarningModelImpl.ENTITY_CACHE_ENABLED,
						EmployeeWarningImpl.class,
						employeeWarning.getPrimaryKey()) == null) {
				cacheResult(employeeWarning);
			}
			else {
				employeeWarning.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all employee warnings.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(EmployeeWarningImpl.class.getName());
		}

		EntityCacheUtil.clearCache(EmployeeWarningImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the employee warning.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(EmployeeWarning employeeWarning) {
		EntityCacheUtil.removeResult(EmployeeWarningModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeWarningImpl.class, employeeWarning.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<EmployeeWarning> employeeWarnings) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (EmployeeWarning employeeWarning : employeeWarnings) {
			EntityCacheUtil.removeResult(EmployeeWarningModelImpl.ENTITY_CACHE_ENABLED,
				EmployeeWarningImpl.class, employeeWarning.getPrimaryKey());
		}
	}

	/**
	 * Creates a new employee warning with the primary key. Does not add the employee warning to the database.
	 *
	 * @param employeeWarningId the primary key for the new employee warning
	 * @return the new employee warning
	 */
	@Override
	public EmployeeWarning create(long employeeWarningId) {
		EmployeeWarning employeeWarning = new EmployeeWarningImpl();

		employeeWarning.setNew(true);
		employeeWarning.setPrimaryKey(employeeWarningId);

		return employeeWarning;
	}

	/**
	 * Removes the employee warning with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param employeeWarningId the primary key of the employee warning
	 * @return the employee warning that was removed
	 * @throws com.hrms.NoSuchEmployeeWarningException if a employee warning with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeWarning remove(long employeeWarningId)
		throws NoSuchEmployeeWarningException, SystemException {
		return remove((Serializable)employeeWarningId);
	}

	/**
	 * Removes the employee warning with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the employee warning
	 * @return the employee warning that was removed
	 * @throws com.hrms.NoSuchEmployeeWarningException if a employee warning with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeWarning remove(Serializable primaryKey)
		throws NoSuchEmployeeWarningException, SystemException {
		Session session = null;

		try {
			session = openSession();

			EmployeeWarning employeeWarning = (EmployeeWarning)session.get(EmployeeWarningImpl.class,
					primaryKey);

			if (employeeWarning == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchEmployeeWarningException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(employeeWarning);
		}
		catch (NoSuchEmployeeWarningException nsee) {
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
	protected EmployeeWarning removeImpl(EmployeeWarning employeeWarning)
		throws SystemException {
		employeeWarning = toUnwrappedModel(employeeWarning);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(employeeWarning)) {
				employeeWarning = (EmployeeWarning)session.get(EmployeeWarningImpl.class,
						employeeWarning.getPrimaryKeyObj());
			}

			if (employeeWarning != null) {
				session.delete(employeeWarning);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (employeeWarning != null) {
			clearCache(employeeWarning);
		}

		return employeeWarning;
	}

	@Override
	public EmployeeWarning updateImpl(
		com.hrms.model.EmployeeWarning employeeWarning)
		throws SystemException {
		employeeWarning = toUnwrappedModel(employeeWarning);

		boolean isNew = employeeWarning.isNew();

		Session session = null;

		try {
			session = openSession();

			if (employeeWarning.isNew()) {
				session.save(employeeWarning);

				employeeWarning.setNew(false);
			}
			else {
				session.merge(employeeWarning);
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

		EntityCacheUtil.putResult(EmployeeWarningModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeWarningImpl.class, employeeWarning.getPrimaryKey(),
			employeeWarning);

		return employeeWarning;
	}

	protected EmployeeWarning toUnwrappedModel(EmployeeWarning employeeWarning) {
		if (employeeWarning instanceof EmployeeWarningImpl) {
			return employeeWarning;
		}

		EmployeeWarningImpl employeeWarningImpl = new EmployeeWarningImpl();

		employeeWarningImpl.setNew(employeeWarning.isNew());
		employeeWarningImpl.setPrimaryKey(employeeWarning.getPrimaryKey());

		employeeWarningImpl.setEmployeeWarningId(employeeWarning.getEmployeeWarningId());
		employeeWarningImpl.setWarningTo(employeeWarning.getWarningTo());
		employeeWarningImpl.setGroupId(employeeWarning.getGroupId());
		employeeWarningImpl.setCompanyId(employeeWarning.getCompanyId());
		employeeWarningImpl.setWarningDate(employeeWarning.getWarningDate());
		employeeWarningImpl.setWarningSubject(employeeWarning.getWarningSubject());
		employeeWarningImpl.setStatus(employeeWarning.isStatus());
		employeeWarningImpl.setWarningBy(employeeWarning.getWarningBy());
		employeeWarningImpl.setModifiedDate(employeeWarning.getModifiedDate());
		employeeWarningImpl.setCreateBy(employeeWarning.getCreateBy());
		employeeWarningImpl.setModifiedBy(employeeWarning.getModifiedBy());

		return employeeWarningImpl;
	}

	/**
	 * Returns the employee warning with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the employee warning
	 * @return the employee warning
	 * @throws com.hrms.NoSuchEmployeeWarningException if a employee warning with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeWarning findByPrimaryKey(Serializable primaryKey)
		throws NoSuchEmployeeWarningException, SystemException {
		EmployeeWarning employeeWarning = fetchByPrimaryKey(primaryKey);

		if (employeeWarning == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchEmployeeWarningException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return employeeWarning;
	}

	/**
	 * Returns the employee warning with the primary key or throws a {@link com.hrms.NoSuchEmployeeWarningException} if it could not be found.
	 *
	 * @param employeeWarningId the primary key of the employee warning
	 * @return the employee warning
	 * @throws com.hrms.NoSuchEmployeeWarningException if a employee warning with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeWarning findByPrimaryKey(long employeeWarningId)
		throws NoSuchEmployeeWarningException, SystemException {
		return findByPrimaryKey((Serializable)employeeWarningId);
	}

	/**
	 * Returns the employee warning with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the employee warning
	 * @return the employee warning, or <code>null</code> if a employee warning with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeWarning fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		EmployeeWarning employeeWarning = (EmployeeWarning)EntityCacheUtil.getResult(EmployeeWarningModelImpl.ENTITY_CACHE_ENABLED,
				EmployeeWarningImpl.class, primaryKey);

		if (employeeWarning == _nullEmployeeWarning) {
			return null;
		}

		if (employeeWarning == null) {
			Session session = null;

			try {
				session = openSession();

				employeeWarning = (EmployeeWarning)session.get(EmployeeWarningImpl.class,
						primaryKey);

				if (employeeWarning != null) {
					cacheResult(employeeWarning);
				}
				else {
					EntityCacheUtil.putResult(EmployeeWarningModelImpl.ENTITY_CACHE_ENABLED,
						EmployeeWarningImpl.class, primaryKey,
						_nullEmployeeWarning);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(EmployeeWarningModelImpl.ENTITY_CACHE_ENABLED,
					EmployeeWarningImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return employeeWarning;
	}

	/**
	 * Returns the employee warning with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param employeeWarningId the primary key of the employee warning
	 * @return the employee warning, or <code>null</code> if a employee warning with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeWarning fetchByPrimaryKey(long employeeWarningId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)employeeWarningId);
	}

	/**
	 * Returns all the employee warnings.
	 *
	 * @return the employee warnings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EmployeeWarning> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the employee warnings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeWarningModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of employee warnings
	 * @param end the upper bound of the range of employee warnings (not inclusive)
	 * @return the range of employee warnings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EmployeeWarning> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the employee warnings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeWarningModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of employee warnings
	 * @param end the upper bound of the range of employee warnings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of employee warnings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EmployeeWarning> findAll(int start, int end,
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

		List<EmployeeWarning> list = (List<EmployeeWarning>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_EMPLOYEEWARNING);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_EMPLOYEEWARNING;

				if (pagination) {
					sql = sql.concat(EmployeeWarningModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<EmployeeWarning>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<EmployeeWarning>(list);
				}
				else {
					list = (List<EmployeeWarning>)QueryUtil.list(q,
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
	 * Removes all the employee warnings from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (EmployeeWarning employeeWarning : findAll()) {
			remove(employeeWarning);
		}
	}

	/**
	 * Returns the number of employee warnings.
	 *
	 * @return the number of employee warnings
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

				Query q = session.createQuery(_SQL_COUNT_EMPLOYEEWARNING);

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
	 * Initializes the employee warning persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.hrms.model.EmployeeWarning")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<EmployeeWarning>> listenersList = new ArrayList<ModelListener<EmployeeWarning>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<EmployeeWarning>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(EmployeeWarningImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_EMPLOYEEWARNING = "SELECT employeeWarning FROM EmployeeWarning employeeWarning";
	private static final String _SQL_COUNT_EMPLOYEEWARNING = "SELECT COUNT(employeeWarning) FROM EmployeeWarning employeeWarning";
	private static final String _ORDER_BY_ENTITY_ALIAS = "employeeWarning.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No EmployeeWarning exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(EmployeeWarningPersistenceImpl.class);
	private static EmployeeWarning _nullEmployeeWarning = new EmployeeWarningImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<EmployeeWarning> toCacheModel() {
				return _nullEmployeeWarningCacheModel;
			}
		};

	private static CacheModel<EmployeeWarning> _nullEmployeeWarningCacheModel = new CacheModel<EmployeeWarning>() {
			@Override
			public EmployeeWarning toEntityModel() {
				return _nullEmployeeWarning;
			}
		};
}