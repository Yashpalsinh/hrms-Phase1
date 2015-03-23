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

import com.hrms.NoSuchEmployeeLanguageDetailException;

import com.hrms.model.EmployeeLanguageDetail;
import com.hrms.model.impl.EmployeeLanguageDetailImpl;
import com.hrms.model.impl.EmployeeLanguageDetailModelImpl;

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
import com.liferay.portal.kernel.util.SetUtil;
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
import java.util.Set;

/**
 * The persistence implementation for the employee language detail service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author yashpalsinh
 * @see EmployeeLanguageDetailPersistence
 * @see EmployeeLanguageDetailUtil
 * @generated
 */
public class EmployeeLanguageDetailPersistenceImpl extends BasePersistenceImpl<EmployeeLanguageDetail>
	implements EmployeeLanguageDetailPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link EmployeeLanguageDetailUtil} to access the employee language detail persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = EmployeeLanguageDetailImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(EmployeeLanguageDetailModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeLanguageDetailModelImpl.FINDER_CACHE_ENABLED,
			EmployeeLanguageDetailImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(EmployeeLanguageDetailModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeLanguageDetailModelImpl.FINDER_CACHE_ENABLED,
			EmployeeLanguageDetailImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(EmployeeLanguageDetailModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeLanguageDetailModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public EmployeeLanguageDetailPersistenceImpl() {
		setModelClass(EmployeeLanguageDetail.class);
	}

	/**
	 * Caches the employee language detail in the entity cache if it is enabled.
	 *
	 * @param employeeLanguageDetail the employee language detail
	 */
	@Override
	public void cacheResult(EmployeeLanguageDetail employeeLanguageDetail) {
		EntityCacheUtil.putResult(EmployeeLanguageDetailModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeLanguageDetailImpl.class,
			employeeLanguageDetail.getPrimaryKey(), employeeLanguageDetail);

		employeeLanguageDetail.resetOriginalValues();
	}

	/**
	 * Caches the employee language details in the entity cache if it is enabled.
	 *
	 * @param employeeLanguageDetails the employee language details
	 */
	@Override
	public void cacheResult(
		List<EmployeeLanguageDetail> employeeLanguageDetails) {
		for (EmployeeLanguageDetail employeeLanguageDetail : employeeLanguageDetails) {
			if (EntityCacheUtil.getResult(
						EmployeeLanguageDetailModelImpl.ENTITY_CACHE_ENABLED,
						EmployeeLanguageDetailImpl.class,
						employeeLanguageDetail.getPrimaryKey()) == null) {
				cacheResult(employeeLanguageDetail);
			}
			else {
				employeeLanguageDetail.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all employee language details.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(EmployeeLanguageDetailImpl.class.getName());
		}

		EntityCacheUtil.clearCache(EmployeeLanguageDetailImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the employee language detail.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(EmployeeLanguageDetail employeeLanguageDetail) {
		EntityCacheUtil.removeResult(EmployeeLanguageDetailModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeLanguageDetailImpl.class,
			employeeLanguageDetail.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<EmployeeLanguageDetail> employeeLanguageDetails) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (EmployeeLanguageDetail employeeLanguageDetail : employeeLanguageDetails) {
			EntityCacheUtil.removeResult(EmployeeLanguageDetailModelImpl.ENTITY_CACHE_ENABLED,
				EmployeeLanguageDetailImpl.class,
				employeeLanguageDetail.getPrimaryKey());
		}
	}

	/**
	 * Creates a new employee language detail with the primary key. Does not add the employee language detail to the database.
	 *
	 * @param employeeLanguageDetailId the primary key for the new employee language detail
	 * @return the new employee language detail
	 */
	@Override
	public EmployeeLanguageDetail create(long employeeLanguageDetailId) {
		EmployeeLanguageDetail employeeLanguageDetail = new EmployeeLanguageDetailImpl();

		employeeLanguageDetail.setNew(true);
		employeeLanguageDetail.setPrimaryKey(employeeLanguageDetailId);

		return employeeLanguageDetail;
	}

	/**
	 * Removes the employee language detail with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param employeeLanguageDetailId the primary key of the employee language detail
	 * @return the employee language detail that was removed
	 * @throws com.hrms.NoSuchEmployeeLanguageDetailException if a employee language detail with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeLanguageDetail remove(long employeeLanguageDetailId)
		throws NoSuchEmployeeLanguageDetailException, SystemException {
		return remove((Serializable)employeeLanguageDetailId);
	}

	/**
	 * Removes the employee language detail with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the employee language detail
	 * @return the employee language detail that was removed
	 * @throws com.hrms.NoSuchEmployeeLanguageDetailException if a employee language detail with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeLanguageDetail remove(Serializable primaryKey)
		throws NoSuchEmployeeLanguageDetailException, SystemException {
		Session session = null;

		try {
			session = openSession();

			EmployeeLanguageDetail employeeLanguageDetail = (EmployeeLanguageDetail)session.get(EmployeeLanguageDetailImpl.class,
					primaryKey);

			if (employeeLanguageDetail == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchEmployeeLanguageDetailException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(employeeLanguageDetail);
		}
		catch (NoSuchEmployeeLanguageDetailException nsee) {
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
	protected EmployeeLanguageDetail removeImpl(
		EmployeeLanguageDetail employeeLanguageDetail)
		throws SystemException {
		employeeLanguageDetail = toUnwrappedModel(employeeLanguageDetail);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(employeeLanguageDetail)) {
				employeeLanguageDetail = (EmployeeLanguageDetail)session.get(EmployeeLanguageDetailImpl.class,
						employeeLanguageDetail.getPrimaryKeyObj());
			}

			if (employeeLanguageDetail != null) {
				session.delete(employeeLanguageDetail);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (employeeLanguageDetail != null) {
			clearCache(employeeLanguageDetail);
		}

		return employeeLanguageDetail;
	}

	@Override
	public EmployeeLanguageDetail updateImpl(
		com.hrms.model.EmployeeLanguageDetail employeeLanguageDetail)
		throws SystemException {
		employeeLanguageDetail = toUnwrappedModel(employeeLanguageDetail);

		boolean isNew = employeeLanguageDetail.isNew();

		Session session = null;

		try {
			session = openSession();

			if (employeeLanguageDetail.isNew()) {
				session.save(employeeLanguageDetail);

				employeeLanguageDetail.setNew(false);
			}
			else {
				session.merge(employeeLanguageDetail);
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

		EntityCacheUtil.putResult(EmployeeLanguageDetailModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeLanguageDetailImpl.class,
			employeeLanguageDetail.getPrimaryKey(), employeeLanguageDetail);

		return employeeLanguageDetail;
	}

	protected EmployeeLanguageDetail toUnwrappedModel(
		EmployeeLanguageDetail employeeLanguageDetail) {
		if (employeeLanguageDetail instanceof EmployeeLanguageDetailImpl) {
			return employeeLanguageDetail;
		}

		EmployeeLanguageDetailImpl employeeLanguageDetailImpl = new EmployeeLanguageDetailImpl();

		employeeLanguageDetailImpl.setNew(employeeLanguageDetail.isNew());
		employeeLanguageDetailImpl.setPrimaryKey(employeeLanguageDetail.getPrimaryKey());

		employeeLanguageDetailImpl.setEmployeeLanguageDetailId(employeeLanguageDetail.getEmployeeLanguageDetailId());
		employeeLanguageDetailImpl.setUserId(employeeLanguageDetail.getUserId());
		employeeLanguageDetailImpl.setGroupId(employeeLanguageDetail.getGroupId());
		employeeLanguageDetailImpl.setCompanyId(employeeLanguageDetail.getCompanyId());
		employeeLanguageDetailImpl.setLanguageName(employeeLanguageDetail.getLanguageName());
		employeeLanguageDetailImpl.setRead(employeeLanguageDetail.isRead());
		employeeLanguageDetailImpl.setWrite(employeeLanguageDetail.isWrite());
		employeeLanguageDetailImpl.setSpeak(employeeLanguageDetail.isSpeak());
		employeeLanguageDetailImpl.setCreateDate(employeeLanguageDetail.getCreateDate());
		employeeLanguageDetailImpl.setModifiedDate(employeeLanguageDetail.getModifiedDate());
		employeeLanguageDetailImpl.setCreateBy(employeeLanguageDetail.getCreateBy());
		employeeLanguageDetailImpl.setModifiedBy(employeeLanguageDetail.getModifiedBy());

		return employeeLanguageDetailImpl;
	}

	/**
	 * Returns the employee language detail with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the employee language detail
	 * @return the employee language detail
	 * @throws com.hrms.NoSuchEmployeeLanguageDetailException if a employee language detail with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeLanguageDetail findByPrimaryKey(Serializable primaryKey)
		throws NoSuchEmployeeLanguageDetailException, SystemException {
		EmployeeLanguageDetail employeeLanguageDetail = fetchByPrimaryKey(primaryKey);

		if (employeeLanguageDetail == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchEmployeeLanguageDetailException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return employeeLanguageDetail;
	}

	/**
	 * Returns the employee language detail with the primary key or throws a {@link com.hrms.NoSuchEmployeeLanguageDetailException} if it could not be found.
	 *
	 * @param employeeLanguageDetailId the primary key of the employee language detail
	 * @return the employee language detail
	 * @throws com.hrms.NoSuchEmployeeLanguageDetailException if a employee language detail with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeLanguageDetail findByPrimaryKey(
		long employeeLanguageDetailId)
		throws NoSuchEmployeeLanguageDetailException, SystemException {
		return findByPrimaryKey((Serializable)employeeLanguageDetailId);
	}

	/**
	 * Returns the employee language detail with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the employee language detail
	 * @return the employee language detail, or <code>null</code> if a employee language detail with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeLanguageDetail fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		EmployeeLanguageDetail employeeLanguageDetail = (EmployeeLanguageDetail)EntityCacheUtil.getResult(EmployeeLanguageDetailModelImpl.ENTITY_CACHE_ENABLED,
				EmployeeLanguageDetailImpl.class, primaryKey);

		if (employeeLanguageDetail == _nullEmployeeLanguageDetail) {
			return null;
		}

		if (employeeLanguageDetail == null) {
			Session session = null;

			try {
				session = openSession();

				employeeLanguageDetail = (EmployeeLanguageDetail)session.get(EmployeeLanguageDetailImpl.class,
						primaryKey);

				if (employeeLanguageDetail != null) {
					cacheResult(employeeLanguageDetail);
				}
				else {
					EntityCacheUtil.putResult(EmployeeLanguageDetailModelImpl.ENTITY_CACHE_ENABLED,
						EmployeeLanguageDetailImpl.class, primaryKey,
						_nullEmployeeLanguageDetail);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(EmployeeLanguageDetailModelImpl.ENTITY_CACHE_ENABLED,
					EmployeeLanguageDetailImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return employeeLanguageDetail;
	}

	/**
	 * Returns the employee language detail with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param employeeLanguageDetailId the primary key of the employee language detail
	 * @return the employee language detail, or <code>null</code> if a employee language detail with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeLanguageDetail fetchByPrimaryKey(
		long employeeLanguageDetailId) throws SystemException {
		return fetchByPrimaryKey((Serializable)employeeLanguageDetailId);
	}

	/**
	 * Returns all the employee language details.
	 *
	 * @return the employee language details
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EmployeeLanguageDetail> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the employee language details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeLanguageDetailModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of employee language details
	 * @param end the upper bound of the range of employee language details (not inclusive)
	 * @return the range of employee language details
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EmployeeLanguageDetail> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the employee language details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeLanguageDetailModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of employee language details
	 * @param end the upper bound of the range of employee language details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of employee language details
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EmployeeLanguageDetail> findAll(int start, int end,
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

		List<EmployeeLanguageDetail> list = (List<EmployeeLanguageDetail>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_EMPLOYEELANGUAGEDETAIL);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_EMPLOYEELANGUAGEDETAIL;

				if (pagination) {
					sql = sql.concat(EmployeeLanguageDetailModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<EmployeeLanguageDetail>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<EmployeeLanguageDetail>(list);
				}
				else {
					list = (List<EmployeeLanguageDetail>)QueryUtil.list(q,
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
	 * Removes all the employee language details from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (EmployeeLanguageDetail employeeLanguageDetail : findAll()) {
			remove(employeeLanguageDetail);
		}
	}

	/**
	 * Returns the number of employee language details.
	 *
	 * @return the number of employee language details
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

				Query q = session.createQuery(_SQL_COUNT_EMPLOYEELANGUAGEDETAIL);

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

	@Override
	protected Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	/**
	 * Initializes the employee language detail persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.hrms.model.EmployeeLanguageDetail")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<EmployeeLanguageDetail>> listenersList = new ArrayList<ModelListener<EmployeeLanguageDetail>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<EmployeeLanguageDetail>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(EmployeeLanguageDetailImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_EMPLOYEELANGUAGEDETAIL = "SELECT employeeLanguageDetail FROM EmployeeLanguageDetail employeeLanguageDetail";
	private static final String _SQL_COUNT_EMPLOYEELANGUAGEDETAIL = "SELECT COUNT(employeeLanguageDetail) FROM EmployeeLanguageDetail employeeLanguageDetail";
	private static final String _ORDER_BY_ENTITY_ALIAS = "employeeLanguageDetail.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No EmployeeLanguageDetail exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(EmployeeLanguageDetailPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"read", "write"
			});
	private static EmployeeLanguageDetail _nullEmployeeLanguageDetail = new EmployeeLanguageDetailImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<EmployeeLanguageDetail> toCacheModel() {
				return _nullEmployeeLanguageDetailCacheModel;
			}
		};

	private static CacheModel<EmployeeLanguageDetail> _nullEmployeeLanguageDetailCacheModel =
		new CacheModel<EmployeeLanguageDetail>() {
			@Override
			public EmployeeLanguageDetail toEntityModel() {
				return _nullEmployeeLanguageDetail;
			}
		};
}