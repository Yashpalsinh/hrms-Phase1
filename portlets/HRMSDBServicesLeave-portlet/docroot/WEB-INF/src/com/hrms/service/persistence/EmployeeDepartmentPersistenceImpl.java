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

import com.hrms.NoSuchEmployeeDepartmentException;

import com.hrms.model.EmployeeDepartment;
import com.hrms.model.impl.EmployeeDepartmentImpl;
import com.hrms.model.impl.EmployeeDepartmentModelImpl;

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
 * The persistence implementation for the employee department service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author yashpalsinh
 * @see EmployeeDepartmentPersistence
 * @see EmployeeDepartmentUtil
 * @generated
 */
public class EmployeeDepartmentPersistenceImpl extends BasePersistenceImpl<EmployeeDepartment>
	implements EmployeeDepartmentPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link EmployeeDepartmentUtil} to access the employee department persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = EmployeeDepartmentImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(EmployeeDepartmentModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeDepartmentModelImpl.FINDER_CACHE_ENABLED,
			EmployeeDepartmentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(EmployeeDepartmentModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeDepartmentModelImpl.FINDER_CACHE_ENABLED,
			EmployeeDepartmentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(EmployeeDepartmentModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeDepartmentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public EmployeeDepartmentPersistenceImpl() {
		setModelClass(EmployeeDepartment.class);
	}

	/**
	 * Caches the employee department in the entity cache if it is enabled.
	 *
	 * @param employeeDepartment the employee department
	 */
	@Override
	public void cacheResult(EmployeeDepartment employeeDepartment) {
		EntityCacheUtil.putResult(EmployeeDepartmentModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeDepartmentImpl.class, employeeDepartment.getPrimaryKey(),
			employeeDepartment);

		employeeDepartment.resetOriginalValues();
	}

	/**
	 * Caches the employee departments in the entity cache if it is enabled.
	 *
	 * @param employeeDepartments the employee departments
	 */
	@Override
	public void cacheResult(List<EmployeeDepartment> employeeDepartments) {
		for (EmployeeDepartment employeeDepartment : employeeDepartments) {
			if (EntityCacheUtil.getResult(
						EmployeeDepartmentModelImpl.ENTITY_CACHE_ENABLED,
						EmployeeDepartmentImpl.class,
						employeeDepartment.getPrimaryKey()) == null) {
				cacheResult(employeeDepartment);
			}
			else {
				employeeDepartment.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all employee departments.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(EmployeeDepartmentImpl.class.getName());
		}

		EntityCacheUtil.clearCache(EmployeeDepartmentImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the employee department.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(EmployeeDepartment employeeDepartment) {
		EntityCacheUtil.removeResult(EmployeeDepartmentModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeDepartmentImpl.class, employeeDepartment.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<EmployeeDepartment> employeeDepartments) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (EmployeeDepartment employeeDepartment : employeeDepartments) {
			EntityCacheUtil.removeResult(EmployeeDepartmentModelImpl.ENTITY_CACHE_ENABLED,
				EmployeeDepartmentImpl.class, employeeDepartment.getPrimaryKey());
		}
	}

	/**
	 * Creates a new employee department with the primary key. Does not add the employee department to the database.
	 *
	 * @param employeeDepartmentId the primary key for the new employee department
	 * @return the new employee department
	 */
	@Override
	public EmployeeDepartment create(long employeeDepartmentId) {
		EmployeeDepartment employeeDepartment = new EmployeeDepartmentImpl();

		employeeDepartment.setNew(true);
		employeeDepartment.setPrimaryKey(employeeDepartmentId);

		return employeeDepartment;
	}

	/**
	 * Removes the employee department with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param employeeDepartmentId the primary key of the employee department
	 * @return the employee department that was removed
	 * @throws com.hrms.NoSuchEmployeeDepartmentException if a employee department with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeDepartment remove(long employeeDepartmentId)
		throws NoSuchEmployeeDepartmentException, SystemException {
		return remove((Serializable)employeeDepartmentId);
	}

	/**
	 * Removes the employee department with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the employee department
	 * @return the employee department that was removed
	 * @throws com.hrms.NoSuchEmployeeDepartmentException if a employee department with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeDepartment remove(Serializable primaryKey)
		throws NoSuchEmployeeDepartmentException, SystemException {
		Session session = null;

		try {
			session = openSession();

			EmployeeDepartment employeeDepartment = (EmployeeDepartment)session.get(EmployeeDepartmentImpl.class,
					primaryKey);

			if (employeeDepartment == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchEmployeeDepartmentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(employeeDepartment);
		}
		catch (NoSuchEmployeeDepartmentException nsee) {
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
	protected EmployeeDepartment removeImpl(
		EmployeeDepartment employeeDepartment) throws SystemException {
		employeeDepartment = toUnwrappedModel(employeeDepartment);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(employeeDepartment)) {
				employeeDepartment = (EmployeeDepartment)session.get(EmployeeDepartmentImpl.class,
						employeeDepartment.getPrimaryKeyObj());
			}

			if (employeeDepartment != null) {
				session.delete(employeeDepartment);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (employeeDepartment != null) {
			clearCache(employeeDepartment);
		}

		return employeeDepartment;
	}

	@Override
	public EmployeeDepartment updateImpl(
		com.hrms.model.EmployeeDepartment employeeDepartment)
		throws SystemException {
		employeeDepartment = toUnwrappedModel(employeeDepartment);

		boolean isNew = employeeDepartment.isNew();

		Session session = null;

		try {
			session = openSession();

			if (employeeDepartment.isNew()) {
				session.save(employeeDepartment);

				employeeDepartment.setNew(false);
			}
			else {
				session.merge(employeeDepartment);
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

		EntityCacheUtil.putResult(EmployeeDepartmentModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeDepartmentImpl.class, employeeDepartment.getPrimaryKey(),
			employeeDepartment);

		return employeeDepartment;
	}

	protected EmployeeDepartment toUnwrappedModel(
		EmployeeDepartment employeeDepartment) {
		if (employeeDepartment instanceof EmployeeDepartmentImpl) {
			return employeeDepartment;
		}

		EmployeeDepartmentImpl employeeDepartmentImpl = new EmployeeDepartmentImpl();

		employeeDepartmentImpl.setNew(employeeDepartment.isNew());
		employeeDepartmentImpl.setPrimaryKey(employeeDepartment.getPrimaryKey());

		employeeDepartmentImpl.setEmployeeDepartmentId(employeeDepartment.getEmployeeDepartmentId());
		employeeDepartmentImpl.setDepartmentName(employeeDepartment.getDepartmentName());
		employeeDepartmentImpl.setStatus(employeeDepartment.isStatus());

		return employeeDepartmentImpl;
	}

	/**
	 * Returns the employee department with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the employee department
	 * @return the employee department
	 * @throws com.hrms.NoSuchEmployeeDepartmentException if a employee department with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeDepartment findByPrimaryKey(Serializable primaryKey)
		throws NoSuchEmployeeDepartmentException, SystemException {
		EmployeeDepartment employeeDepartment = fetchByPrimaryKey(primaryKey);

		if (employeeDepartment == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchEmployeeDepartmentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return employeeDepartment;
	}

	/**
	 * Returns the employee department with the primary key or throws a {@link com.hrms.NoSuchEmployeeDepartmentException} if it could not be found.
	 *
	 * @param employeeDepartmentId the primary key of the employee department
	 * @return the employee department
	 * @throws com.hrms.NoSuchEmployeeDepartmentException if a employee department with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeDepartment findByPrimaryKey(long employeeDepartmentId)
		throws NoSuchEmployeeDepartmentException, SystemException {
		return findByPrimaryKey((Serializable)employeeDepartmentId);
	}

	/**
	 * Returns the employee department with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the employee department
	 * @return the employee department, or <code>null</code> if a employee department with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeDepartment fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		EmployeeDepartment employeeDepartment = (EmployeeDepartment)EntityCacheUtil.getResult(EmployeeDepartmentModelImpl.ENTITY_CACHE_ENABLED,
				EmployeeDepartmentImpl.class, primaryKey);

		if (employeeDepartment == _nullEmployeeDepartment) {
			return null;
		}

		if (employeeDepartment == null) {
			Session session = null;

			try {
				session = openSession();

				employeeDepartment = (EmployeeDepartment)session.get(EmployeeDepartmentImpl.class,
						primaryKey);

				if (employeeDepartment != null) {
					cacheResult(employeeDepartment);
				}
				else {
					EntityCacheUtil.putResult(EmployeeDepartmentModelImpl.ENTITY_CACHE_ENABLED,
						EmployeeDepartmentImpl.class, primaryKey,
						_nullEmployeeDepartment);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(EmployeeDepartmentModelImpl.ENTITY_CACHE_ENABLED,
					EmployeeDepartmentImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return employeeDepartment;
	}

	/**
	 * Returns the employee department with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param employeeDepartmentId the primary key of the employee department
	 * @return the employee department, or <code>null</code> if a employee department with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeDepartment fetchByPrimaryKey(long employeeDepartmentId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)employeeDepartmentId);
	}

	/**
	 * Returns all the employee departments.
	 *
	 * @return the employee departments
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EmployeeDepartment> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the employee departments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeDepartmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of employee departments
	 * @param end the upper bound of the range of employee departments (not inclusive)
	 * @return the range of employee departments
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EmployeeDepartment> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the employee departments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeDepartmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of employee departments
	 * @param end the upper bound of the range of employee departments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of employee departments
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EmployeeDepartment> findAll(int start, int end,
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

		List<EmployeeDepartment> list = (List<EmployeeDepartment>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_EMPLOYEEDEPARTMENT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_EMPLOYEEDEPARTMENT;

				if (pagination) {
					sql = sql.concat(EmployeeDepartmentModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<EmployeeDepartment>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<EmployeeDepartment>(list);
				}
				else {
					list = (List<EmployeeDepartment>)QueryUtil.list(q,
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
	 * Removes all the employee departments from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (EmployeeDepartment employeeDepartment : findAll()) {
			remove(employeeDepartment);
		}
	}

	/**
	 * Returns the number of employee departments.
	 *
	 * @return the number of employee departments
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

				Query q = session.createQuery(_SQL_COUNT_EMPLOYEEDEPARTMENT);

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
	 * Initializes the employee department persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.hrms.model.EmployeeDepartment")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<EmployeeDepartment>> listenersList = new ArrayList<ModelListener<EmployeeDepartment>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<EmployeeDepartment>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(EmployeeDepartmentImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_EMPLOYEEDEPARTMENT = "SELECT employeeDepartment FROM EmployeeDepartment employeeDepartment";
	private static final String _SQL_COUNT_EMPLOYEEDEPARTMENT = "SELECT COUNT(employeeDepartment) FROM EmployeeDepartment employeeDepartment";
	private static final String _ORDER_BY_ENTITY_ALIAS = "employeeDepartment.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No EmployeeDepartment exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(EmployeeDepartmentPersistenceImpl.class);
	private static EmployeeDepartment _nullEmployeeDepartment = new EmployeeDepartmentImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<EmployeeDepartment> toCacheModel() {
				return _nullEmployeeDepartmentCacheModel;
			}
		};

	private static CacheModel<EmployeeDepartment> _nullEmployeeDepartmentCacheModel =
		new CacheModel<EmployeeDepartment>() {
			@Override
			public EmployeeDepartment toEntityModel() {
				return _nullEmployeeDepartment;
			}
		};
}