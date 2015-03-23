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

import com.hrms.NoSuchEmployeePreviousCompanyException;

import com.hrms.model.EmployeePreviousCompany;
import com.hrms.model.impl.EmployeePreviousCompanyImpl;
import com.hrms.model.impl.EmployeePreviousCompanyModelImpl;

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
 * The persistence implementation for the employee previous company service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author yashpalsinh
 * @see EmployeePreviousCompanyPersistence
 * @see EmployeePreviousCompanyUtil
 * @generated
 */
public class EmployeePreviousCompanyPersistenceImpl extends BasePersistenceImpl<EmployeePreviousCompany>
	implements EmployeePreviousCompanyPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link EmployeePreviousCompanyUtil} to access the employee previous company persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = EmployeePreviousCompanyImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(EmployeePreviousCompanyModelImpl.ENTITY_CACHE_ENABLED,
			EmployeePreviousCompanyModelImpl.FINDER_CACHE_ENABLED,
			EmployeePreviousCompanyImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(EmployeePreviousCompanyModelImpl.ENTITY_CACHE_ENABLED,
			EmployeePreviousCompanyModelImpl.FINDER_CACHE_ENABLED,
			EmployeePreviousCompanyImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(EmployeePreviousCompanyModelImpl.ENTITY_CACHE_ENABLED,
			EmployeePreviousCompanyModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public EmployeePreviousCompanyPersistenceImpl() {
		setModelClass(EmployeePreviousCompany.class);
	}

	/**
	 * Caches the employee previous company in the entity cache if it is enabled.
	 *
	 * @param employeePreviousCompany the employee previous company
	 */
	@Override
	public void cacheResult(EmployeePreviousCompany employeePreviousCompany) {
		EntityCacheUtil.putResult(EmployeePreviousCompanyModelImpl.ENTITY_CACHE_ENABLED,
			EmployeePreviousCompanyImpl.class,
			employeePreviousCompany.getPrimaryKey(), employeePreviousCompany);

		employeePreviousCompany.resetOriginalValues();
	}

	/**
	 * Caches the employee previous companies in the entity cache if it is enabled.
	 *
	 * @param employeePreviousCompanies the employee previous companies
	 */
	@Override
	public void cacheResult(
		List<EmployeePreviousCompany> employeePreviousCompanies) {
		for (EmployeePreviousCompany employeePreviousCompany : employeePreviousCompanies) {
			if (EntityCacheUtil.getResult(
						EmployeePreviousCompanyModelImpl.ENTITY_CACHE_ENABLED,
						EmployeePreviousCompanyImpl.class,
						employeePreviousCompany.getPrimaryKey()) == null) {
				cacheResult(employeePreviousCompany);
			}
			else {
				employeePreviousCompany.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all employee previous companies.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(EmployeePreviousCompanyImpl.class.getName());
		}

		EntityCacheUtil.clearCache(EmployeePreviousCompanyImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the employee previous company.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(EmployeePreviousCompany employeePreviousCompany) {
		EntityCacheUtil.removeResult(EmployeePreviousCompanyModelImpl.ENTITY_CACHE_ENABLED,
			EmployeePreviousCompanyImpl.class,
			employeePreviousCompany.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<EmployeePreviousCompany> employeePreviousCompanies) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (EmployeePreviousCompany employeePreviousCompany : employeePreviousCompanies) {
			EntityCacheUtil.removeResult(EmployeePreviousCompanyModelImpl.ENTITY_CACHE_ENABLED,
				EmployeePreviousCompanyImpl.class,
				employeePreviousCompany.getPrimaryKey());
		}
	}

	/**
	 * Creates a new employee previous company with the primary key. Does not add the employee previous company to the database.
	 *
	 * @param employeePreviousCompanyId the primary key for the new employee previous company
	 * @return the new employee previous company
	 */
	@Override
	public EmployeePreviousCompany create(long employeePreviousCompanyId) {
		EmployeePreviousCompany employeePreviousCompany = new EmployeePreviousCompanyImpl();

		employeePreviousCompany.setNew(true);
		employeePreviousCompany.setPrimaryKey(employeePreviousCompanyId);

		return employeePreviousCompany;
	}

	/**
	 * Removes the employee previous company with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param employeePreviousCompanyId the primary key of the employee previous company
	 * @return the employee previous company that was removed
	 * @throws com.hrms.NoSuchEmployeePreviousCompanyException if a employee previous company with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeePreviousCompany remove(long employeePreviousCompanyId)
		throws NoSuchEmployeePreviousCompanyException, SystemException {
		return remove((Serializable)employeePreviousCompanyId);
	}

	/**
	 * Removes the employee previous company with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the employee previous company
	 * @return the employee previous company that was removed
	 * @throws com.hrms.NoSuchEmployeePreviousCompanyException if a employee previous company with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeePreviousCompany remove(Serializable primaryKey)
		throws NoSuchEmployeePreviousCompanyException, SystemException {
		Session session = null;

		try {
			session = openSession();

			EmployeePreviousCompany employeePreviousCompany = (EmployeePreviousCompany)session.get(EmployeePreviousCompanyImpl.class,
					primaryKey);

			if (employeePreviousCompany == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchEmployeePreviousCompanyException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(employeePreviousCompany);
		}
		catch (NoSuchEmployeePreviousCompanyException nsee) {
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
	protected EmployeePreviousCompany removeImpl(
		EmployeePreviousCompany employeePreviousCompany)
		throws SystemException {
		employeePreviousCompany = toUnwrappedModel(employeePreviousCompany);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(employeePreviousCompany)) {
				employeePreviousCompany = (EmployeePreviousCompany)session.get(EmployeePreviousCompanyImpl.class,
						employeePreviousCompany.getPrimaryKeyObj());
			}

			if (employeePreviousCompany != null) {
				session.delete(employeePreviousCompany);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (employeePreviousCompany != null) {
			clearCache(employeePreviousCompany);
		}

		return employeePreviousCompany;
	}

	@Override
	public EmployeePreviousCompany updateImpl(
		com.hrms.model.EmployeePreviousCompany employeePreviousCompany)
		throws SystemException {
		employeePreviousCompany = toUnwrappedModel(employeePreviousCompany);

		boolean isNew = employeePreviousCompany.isNew();

		Session session = null;

		try {
			session = openSession();

			if (employeePreviousCompany.isNew()) {
				session.save(employeePreviousCompany);

				employeePreviousCompany.setNew(false);
			}
			else {
				session.merge(employeePreviousCompany);
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

		EntityCacheUtil.putResult(EmployeePreviousCompanyModelImpl.ENTITY_CACHE_ENABLED,
			EmployeePreviousCompanyImpl.class,
			employeePreviousCompany.getPrimaryKey(), employeePreviousCompany);

		return employeePreviousCompany;
	}

	protected EmployeePreviousCompany toUnwrappedModel(
		EmployeePreviousCompany employeePreviousCompany) {
		if (employeePreviousCompany instanceof EmployeePreviousCompanyImpl) {
			return employeePreviousCompany;
		}

		EmployeePreviousCompanyImpl employeePreviousCompanyImpl = new EmployeePreviousCompanyImpl();

		employeePreviousCompanyImpl.setNew(employeePreviousCompany.isNew());
		employeePreviousCompanyImpl.setPrimaryKey(employeePreviousCompany.getPrimaryKey());

		employeePreviousCompanyImpl.setEmployeePreviousCompanyId(employeePreviousCompany.getEmployeePreviousCompanyId());
		employeePreviousCompanyImpl.setUserId(employeePreviousCompany.getUserId());
		employeePreviousCompanyImpl.setGroupId(employeePreviousCompany.getGroupId());
		employeePreviousCompanyImpl.setCompanyId(employeePreviousCompany.getCompanyId());
		employeePreviousCompanyImpl.setCompanyName(employeePreviousCompany.getCompanyName());
		employeePreviousCompanyImpl.setJobTitle(employeePreviousCompany.getJobTitle());
		employeePreviousCompanyImpl.setJobDiscription(employeePreviousCompany.getJobDiscription());
		employeePreviousCompanyImpl.setStartDate(employeePreviousCompany.getStartDate());
		employeePreviousCompanyImpl.setEndDate(employeePreviousCompany.getEndDate());
		employeePreviousCompanyImpl.setCreateDate(employeePreviousCompany.getCreateDate());
		employeePreviousCompanyImpl.setModifiedDate(employeePreviousCompany.getModifiedDate());
		employeePreviousCompanyImpl.setCreateBy(employeePreviousCompany.getCreateBy());
		employeePreviousCompanyImpl.setModifiedBy(employeePreviousCompany.getModifiedBy());

		return employeePreviousCompanyImpl;
	}

	/**
	 * Returns the employee previous company with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the employee previous company
	 * @return the employee previous company
	 * @throws com.hrms.NoSuchEmployeePreviousCompanyException if a employee previous company with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeePreviousCompany findByPrimaryKey(Serializable primaryKey)
		throws NoSuchEmployeePreviousCompanyException, SystemException {
		EmployeePreviousCompany employeePreviousCompany = fetchByPrimaryKey(primaryKey);

		if (employeePreviousCompany == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchEmployeePreviousCompanyException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return employeePreviousCompany;
	}

	/**
	 * Returns the employee previous company with the primary key or throws a {@link com.hrms.NoSuchEmployeePreviousCompanyException} if it could not be found.
	 *
	 * @param employeePreviousCompanyId the primary key of the employee previous company
	 * @return the employee previous company
	 * @throws com.hrms.NoSuchEmployeePreviousCompanyException if a employee previous company with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeePreviousCompany findByPrimaryKey(
		long employeePreviousCompanyId)
		throws NoSuchEmployeePreviousCompanyException, SystemException {
		return findByPrimaryKey((Serializable)employeePreviousCompanyId);
	}

	/**
	 * Returns the employee previous company with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the employee previous company
	 * @return the employee previous company, or <code>null</code> if a employee previous company with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeePreviousCompany fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		EmployeePreviousCompany employeePreviousCompany = (EmployeePreviousCompany)EntityCacheUtil.getResult(EmployeePreviousCompanyModelImpl.ENTITY_CACHE_ENABLED,
				EmployeePreviousCompanyImpl.class, primaryKey);

		if (employeePreviousCompany == _nullEmployeePreviousCompany) {
			return null;
		}

		if (employeePreviousCompany == null) {
			Session session = null;

			try {
				session = openSession();

				employeePreviousCompany = (EmployeePreviousCompany)session.get(EmployeePreviousCompanyImpl.class,
						primaryKey);

				if (employeePreviousCompany != null) {
					cacheResult(employeePreviousCompany);
				}
				else {
					EntityCacheUtil.putResult(EmployeePreviousCompanyModelImpl.ENTITY_CACHE_ENABLED,
						EmployeePreviousCompanyImpl.class, primaryKey,
						_nullEmployeePreviousCompany);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(EmployeePreviousCompanyModelImpl.ENTITY_CACHE_ENABLED,
					EmployeePreviousCompanyImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return employeePreviousCompany;
	}

	/**
	 * Returns the employee previous company with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param employeePreviousCompanyId the primary key of the employee previous company
	 * @return the employee previous company, or <code>null</code> if a employee previous company with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeePreviousCompany fetchByPrimaryKey(
		long employeePreviousCompanyId) throws SystemException {
		return fetchByPrimaryKey((Serializable)employeePreviousCompanyId);
	}

	/**
	 * Returns all the employee previous companies.
	 *
	 * @return the employee previous companies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EmployeePreviousCompany> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the employee previous companies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeePreviousCompanyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of employee previous companies
	 * @param end the upper bound of the range of employee previous companies (not inclusive)
	 * @return the range of employee previous companies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EmployeePreviousCompany> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the employee previous companies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeePreviousCompanyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of employee previous companies
	 * @param end the upper bound of the range of employee previous companies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of employee previous companies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EmployeePreviousCompany> findAll(int start, int end,
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

		List<EmployeePreviousCompany> list = (List<EmployeePreviousCompany>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_EMPLOYEEPREVIOUSCOMPANY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_EMPLOYEEPREVIOUSCOMPANY;

				if (pagination) {
					sql = sql.concat(EmployeePreviousCompanyModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<EmployeePreviousCompany>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<EmployeePreviousCompany>(list);
				}
				else {
					list = (List<EmployeePreviousCompany>)QueryUtil.list(q,
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
	 * Removes all the employee previous companies from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (EmployeePreviousCompany employeePreviousCompany : findAll()) {
			remove(employeePreviousCompany);
		}
	}

	/**
	 * Returns the number of employee previous companies.
	 *
	 * @return the number of employee previous companies
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

				Query q = session.createQuery(_SQL_COUNT_EMPLOYEEPREVIOUSCOMPANY);

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
	 * Initializes the employee previous company persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.hrms.model.EmployeePreviousCompany")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<EmployeePreviousCompany>> listenersList = new ArrayList<ModelListener<EmployeePreviousCompany>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<EmployeePreviousCompany>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(EmployeePreviousCompanyImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_EMPLOYEEPREVIOUSCOMPANY = "SELECT employeePreviousCompany FROM EmployeePreviousCompany employeePreviousCompany";
	private static final String _SQL_COUNT_EMPLOYEEPREVIOUSCOMPANY = "SELECT COUNT(employeePreviousCompany) FROM EmployeePreviousCompany employeePreviousCompany";
	private static final String _ORDER_BY_ENTITY_ALIAS = "employeePreviousCompany.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No EmployeePreviousCompany exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(EmployeePreviousCompanyPersistenceImpl.class);
	private static EmployeePreviousCompany _nullEmployeePreviousCompany = new EmployeePreviousCompanyImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<EmployeePreviousCompany> toCacheModel() {
				return _nullEmployeePreviousCompanyCacheModel;
			}
		};

	private static CacheModel<EmployeePreviousCompany> _nullEmployeePreviousCompanyCacheModel =
		new CacheModel<EmployeePreviousCompany>() {
			@Override
			public EmployeePreviousCompany toEntityModel() {
				return _nullEmployeePreviousCompany;
			}
		};
}