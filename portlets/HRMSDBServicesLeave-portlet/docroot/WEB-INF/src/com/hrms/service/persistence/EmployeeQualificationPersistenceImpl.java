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

import com.hrms.NoSuchEmployeeQualificationException;

import com.hrms.model.EmployeeQualification;
import com.hrms.model.impl.EmployeeQualificationImpl;
import com.hrms.model.impl.EmployeeQualificationModelImpl;

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
 * The persistence implementation for the employee qualification service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author yashpalsinh
 * @see EmployeeQualificationPersistence
 * @see EmployeeQualificationUtil
 * @generated
 */
public class EmployeeQualificationPersistenceImpl extends BasePersistenceImpl<EmployeeQualification>
	implements EmployeeQualificationPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link EmployeeQualificationUtil} to access the employee qualification persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = EmployeeQualificationImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(EmployeeQualificationModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeQualificationModelImpl.FINDER_CACHE_ENABLED,
			EmployeeQualificationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(EmployeeQualificationModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeQualificationModelImpl.FINDER_CACHE_ENABLED,
			EmployeeQualificationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(EmployeeQualificationModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeQualificationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public EmployeeQualificationPersistenceImpl() {
		setModelClass(EmployeeQualification.class);
	}

	/**
	 * Caches the employee qualification in the entity cache if it is enabled.
	 *
	 * @param employeeQualification the employee qualification
	 */
	@Override
	public void cacheResult(EmployeeQualification employeeQualification) {
		EntityCacheUtil.putResult(EmployeeQualificationModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeQualificationImpl.class,
			employeeQualification.getPrimaryKey(), employeeQualification);

		employeeQualification.resetOriginalValues();
	}

	/**
	 * Caches the employee qualifications in the entity cache if it is enabled.
	 *
	 * @param employeeQualifications the employee qualifications
	 */
	@Override
	public void cacheResult(List<EmployeeQualification> employeeQualifications) {
		for (EmployeeQualification employeeQualification : employeeQualifications) {
			if (EntityCacheUtil.getResult(
						EmployeeQualificationModelImpl.ENTITY_CACHE_ENABLED,
						EmployeeQualificationImpl.class,
						employeeQualification.getPrimaryKey()) == null) {
				cacheResult(employeeQualification);
			}
			else {
				employeeQualification.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all employee qualifications.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(EmployeeQualificationImpl.class.getName());
		}

		EntityCacheUtil.clearCache(EmployeeQualificationImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the employee qualification.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(EmployeeQualification employeeQualification) {
		EntityCacheUtil.removeResult(EmployeeQualificationModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeQualificationImpl.class,
			employeeQualification.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<EmployeeQualification> employeeQualifications) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (EmployeeQualification employeeQualification : employeeQualifications) {
			EntityCacheUtil.removeResult(EmployeeQualificationModelImpl.ENTITY_CACHE_ENABLED,
				EmployeeQualificationImpl.class,
				employeeQualification.getPrimaryKey());
		}
	}

	/**
	 * Creates a new employee qualification with the primary key. Does not add the employee qualification to the database.
	 *
	 * @param employeeQualificationId the primary key for the new employee qualification
	 * @return the new employee qualification
	 */
	@Override
	public EmployeeQualification create(long employeeQualificationId) {
		EmployeeQualification employeeQualification = new EmployeeQualificationImpl();

		employeeQualification.setNew(true);
		employeeQualification.setPrimaryKey(employeeQualificationId);

		return employeeQualification;
	}

	/**
	 * Removes the employee qualification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param employeeQualificationId the primary key of the employee qualification
	 * @return the employee qualification that was removed
	 * @throws com.hrms.NoSuchEmployeeQualificationException if a employee qualification with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeQualification remove(long employeeQualificationId)
		throws NoSuchEmployeeQualificationException, SystemException {
		return remove((Serializable)employeeQualificationId);
	}

	/**
	 * Removes the employee qualification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the employee qualification
	 * @return the employee qualification that was removed
	 * @throws com.hrms.NoSuchEmployeeQualificationException if a employee qualification with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeQualification remove(Serializable primaryKey)
		throws NoSuchEmployeeQualificationException, SystemException {
		Session session = null;

		try {
			session = openSession();

			EmployeeQualification employeeQualification = (EmployeeQualification)session.get(EmployeeQualificationImpl.class,
					primaryKey);

			if (employeeQualification == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchEmployeeQualificationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(employeeQualification);
		}
		catch (NoSuchEmployeeQualificationException nsee) {
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
	protected EmployeeQualification removeImpl(
		EmployeeQualification employeeQualification) throws SystemException {
		employeeQualification = toUnwrappedModel(employeeQualification);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(employeeQualification)) {
				employeeQualification = (EmployeeQualification)session.get(EmployeeQualificationImpl.class,
						employeeQualification.getPrimaryKeyObj());
			}

			if (employeeQualification != null) {
				session.delete(employeeQualification);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (employeeQualification != null) {
			clearCache(employeeQualification);
		}

		return employeeQualification;
	}

	@Override
	public EmployeeQualification updateImpl(
		com.hrms.model.EmployeeQualification employeeQualification)
		throws SystemException {
		employeeQualification = toUnwrappedModel(employeeQualification);

		boolean isNew = employeeQualification.isNew();

		Session session = null;

		try {
			session = openSession();

			if (employeeQualification.isNew()) {
				session.save(employeeQualification);

				employeeQualification.setNew(false);
			}
			else {
				session.merge(employeeQualification);
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

		EntityCacheUtil.putResult(EmployeeQualificationModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeQualificationImpl.class,
			employeeQualification.getPrimaryKey(), employeeQualification);

		return employeeQualification;
	}

	protected EmployeeQualification toUnwrappedModel(
		EmployeeQualification employeeQualification) {
		if (employeeQualification instanceof EmployeeQualificationImpl) {
			return employeeQualification;
		}

		EmployeeQualificationImpl employeeQualificationImpl = new EmployeeQualificationImpl();

		employeeQualificationImpl.setNew(employeeQualification.isNew());
		employeeQualificationImpl.setPrimaryKey(employeeQualification.getPrimaryKey());

		employeeQualificationImpl.setEmployeeQualificationId(employeeQualification.getEmployeeQualificationId());
		employeeQualificationImpl.setUserId(employeeQualification.getUserId());
		employeeQualificationImpl.setGroupId(employeeQualification.getGroupId());
		employeeQualificationImpl.setCompanyId(employeeQualification.getCompanyId());
		employeeQualificationImpl.setDegreeName(employeeQualification.getDegreeName());
		employeeQualificationImpl.setMainSubject(employeeQualification.getMainSubject());
		employeeQualificationImpl.setUniversity(employeeQualification.getUniversity());
		employeeQualificationImpl.setScore(employeeQualification.getScore());
		employeeQualificationImpl.setStartDate(employeeQualification.getStartDate());
		employeeQualificationImpl.setEndDate(employeeQualification.getEndDate());
		employeeQualificationImpl.setCreateDate(employeeQualification.getCreateDate());
		employeeQualificationImpl.setModifiedDate(employeeQualification.getModifiedDate());
		employeeQualificationImpl.setCreateBy(employeeQualification.getCreateBy());
		employeeQualificationImpl.setModifiedBy(employeeQualification.getModifiedBy());

		return employeeQualificationImpl;
	}

	/**
	 * Returns the employee qualification with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the employee qualification
	 * @return the employee qualification
	 * @throws com.hrms.NoSuchEmployeeQualificationException if a employee qualification with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeQualification findByPrimaryKey(Serializable primaryKey)
		throws NoSuchEmployeeQualificationException, SystemException {
		EmployeeQualification employeeQualification = fetchByPrimaryKey(primaryKey);

		if (employeeQualification == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchEmployeeQualificationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return employeeQualification;
	}

	/**
	 * Returns the employee qualification with the primary key or throws a {@link com.hrms.NoSuchEmployeeQualificationException} if it could not be found.
	 *
	 * @param employeeQualificationId the primary key of the employee qualification
	 * @return the employee qualification
	 * @throws com.hrms.NoSuchEmployeeQualificationException if a employee qualification with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeQualification findByPrimaryKey(long employeeQualificationId)
		throws NoSuchEmployeeQualificationException, SystemException {
		return findByPrimaryKey((Serializable)employeeQualificationId);
	}

	/**
	 * Returns the employee qualification with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the employee qualification
	 * @return the employee qualification, or <code>null</code> if a employee qualification with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeQualification fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		EmployeeQualification employeeQualification = (EmployeeQualification)EntityCacheUtil.getResult(EmployeeQualificationModelImpl.ENTITY_CACHE_ENABLED,
				EmployeeQualificationImpl.class, primaryKey);

		if (employeeQualification == _nullEmployeeQualification) {
			return null;
		}

		if (employeeQualification == null) {
			Session session = null;

			try {
				session = openSession();

				employeeQualification = (EmployeeQualification)session.get(EmployeeQualificationImpl.class,
						primaryKey);

				if (employeeQualification != null) {
					cacheResult(employeeQualification);
				}
				else {
					EntityCacheUtil.putResult(EmployeeQualificationModelImpl.ENTITY_CACHE_ENABLED,
						EmployeeQualificationImpl.class, primaryKey,
						_nullEmployeeQualification);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(EmployeeQualificationModelImpl.ENTITY_CACHE_ENABLED,
					EmployeeQualificationImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return employeeQualification;
	}

	/**
	 * Returns the employee qualification with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param employeeQualificationId the primary key of the employee qualification
	 * @return the employee qualification, or <code>null</code> if a employee qualification with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeQualification fetchByPrimaryKey(long employeeQualificationId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)employeeQualificationId);
	}

	/**
	 * Returns all the employee qualifications.
	 *
	 * @return the employee qualifications
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EmployeeQualification> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the employee qualifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeQualificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of employee qualifications
	 * @param end the upper bound of the range of employee qualifications (not inclusive)
	 * @return the range of employee qualifications
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EmployeeQualification> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the employee qualifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeQualificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of employee qualifications
	 * @param end the upper bound of the range of employee qualifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of employee qualifications
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EmployeeQualification> findAll(int start, int end,
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

		List<EmployeeQualification> list = (List<EmployeeQualification>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_EMPLOYEEQUALIFICATION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_EMPLOYEEQUALIFICATION;

				if (pagination) {
					sql = sql.concat(EmployeeQualificationModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<EmployeeQualification>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<EmployeeQualification>(list);
				}
				else {
					list = (List<EmployeeQualification>)QueryUtil.list(q,
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
	 * Removes all the employee qualifications from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (EmployeeQualification employeeQualification : findAll()) {
			remove(employeeQualification);
		}
	}

	/**
	 * Returns the number of employee qualifications.
	 *
	 * @return the number of employee qualifications
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

				Query q = session.createQuery(_SQL_COUNT_EMPLOYEEQUALIFICATION);

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
	 * Initializes the employee qualification persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.hrms.model.EmployeeQualification")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<EmployeeQualification>> listenersList = new ArrayList<ModelListener<EmployeeQualification>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<EmployeeQualification>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(EmployeeQualificationImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_EMPLOYEEQUALIFICATION = "SELECT employeeQualification FROM EmployeeQualification employeeQualification";
	private static final String _SQL_COUNT_EMPLOYEEQUALIFICATION = "SELECT COUNT(employeeQualification) FROM EmployeeQualification employeeQualification";
	private static final String _ORDER_BY_ENTITY_ALIAS = "employeeQualification.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No EmployeeQualification exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(EmployeeQualificationPersistenceImpl.class);
	private static EmployeeQualification _nullEmployeeQualification = new EmployeeQualificationImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<EmployeeQualification> toCacheModel() {
				return _nullEmployeeQualificationCacheModel;
			}
		};

	private static CacheModel<EmployeeQualification> _nullEmployeeQualificationCacheModel =
		new CacheModel<EmployeeQualification>() {
			@Override
			public EmployeeQualification toEntityModel() {
				return _nullEmployeeQualification;
			}
		};
}