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

import com.hrms.NoSuchEmployeeComplaintException;

import com.hrms.model.EmployeeComplaint;
import com.hrms.model.impl.EmployeeComplaintImpl;
import com.hrms.model.impl.EmployeeComplaintModelImpl;

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
 * The persistence implementation for the employee complaint service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author yashpalsinh
 * @see EmployeeComplaintPersistence
 * @see EmployeeComplaintUtil
 * @generated
 */
public class EmployeeComplaintPersistenceImpl extends BasePersistenceImpl<EmployeeComplaint>
	implements EmployeeComplaintPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link EmployeeComplaintUtil} to access the employee complaint persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = EmployeeComplaintImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(EmployeeComplaintModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeComplaintModelImpl.FINDER_CACHE_ENABLED,
			EmployeeComplaintImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(EmployeeComplaintModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeComplaintModelImpl.FINDER_CACHE_ENABLED,
			EmployeeComplaintImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(EmployeeComplaintModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeComplaintModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public EmployeeComplaintPersistenceImpl() {
		setModelClass(EmployeeComplaint.class);
	}

	/**
	 * Caches the employee complaint in the entity cache if it is enabled.
	 *
	 * @param employeeComplaint the employee complaint
	 */
	@Override
	public void cacheResult(EmployeeComplaint employeeComplaint) {
		EntityCacheUtil.putResult(EmployeeComplaintModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeComplaintImpl.class, employeeComplaint.getPrimaryKey(),
			employeeComplaint);

		employeeComplaint.resetOriginalValues();
	}

	/**
	 * Caches the employee complaints in the entity cache if it is enabled.
	 *
	 * @param employeeComplaints the employee complaints
	 */
	@Override
	public void cacheResult(List<EmployeeComplaint> employeeComplaints) {
		for (EmployeeComplaint employeeComplaint : employeeComplaints) {
			if (EntityCacheUtil.getResult(
						EmployeeComplaintModelImpl.ENTITY_CACHE_ENABLED,
						EmployeeComplaintImpl.class,
						employeeComplaint.getPrimaryKey()) == null) {
				cacheResult(employeeComplaint);
			}
			else {
				employeeComplaint.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all employee complaints.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(EmployeeComplaintImpl.class.getName());
		}

		EntityCacheUtil.clearCache(EmployeeComplaintImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the employee complaint.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(EmployeeComplaint employeeComplaint) {
		EntityCacheUtil.removeResult(EmployeeComplaintModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeComplaintImpl.class, employeeComplaint.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<EmployeeComplaint> employeeComplaints) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (EmployeeComplaint employeeComplaint : employeeComplaints) {
			EntityCacheUtil.removeResult(EmployeeComplaintModelImpl.ENTITY_CACHE_ENABLED,
				EmployeeComplaintImpl.class, employeeComplaint.getPrimaryKey());
		}
	}

	/**
	 * Creates a new employee complaint with the primary key. Does not add the employee complaint to the database.
	 *
	 * @param employeeComplaintId the primary key for the new employee complaint
	 * @return the new employee complaint
	 */
	@Override
	public EmployeeComplaint create(long employeeComplaintId) {
		EmployeeComplaint employeeComplaint = new EmployeeComplaintImpl();

		employeeComplaint.setNew(true);
		employeeComplaint.setPrimaryKey(employeeComplaintId);

		return employeeComplaint;
	}

	/**
	 * Removes the employee complaint with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param employeeComplaintId the primary key of the employee complaint
	 * @return the employee complaint that was removed
	 * @throws com.hrms.NoSuchEmployeeComplaintException if a employee complaint with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeComplaint remove(long employeeComplaintId)
		throws NoSuchEmployeeComplaintException, SystemException {
		return remove((Serializable)employeeComplaintId);
	}

	/**
	 * Removes the employee complaint with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the employee complaint
	 * @return the employee complaint that was removed
	 * @throws com.hrms.NoSuchEmployeeComplaintException if a employee complaint with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeComplaint remove(Serializable primaryKey)
		throws NoSuchEmployeeComplaintException, SystemException {
		Session session = null;

		try {
			session = openSession();

			EmployeeComplaint employeeComplaint = (EmployeeComplaint)session.get(EmployeeComplaintImpl.class,
					primaryKey);

			if (employeeComplaint == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchEmployeeComplaintException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(employeeComplaint);
		}
		catch (NoSuchEmployeeComplaintException nsee) {
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
	protected EmployeeComplaint removeImpl(EmployeeComplaint employeeComplaint)
		throws SystemException {
		employeeComplaint = toUnwrappedModel(employeeComplaint);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(employeeComplaint)) {
				employeeComplaint = (EmployeeComplaint)session.get(EmployeeComplaintImpl.class,
						employeeComplaint.getPrimaryKeyObj());
			}

			if (employeeComplaint != null) {
				session.delete(employeeComplaint);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (employeeComplaint != null) {
			clearCache(employeeComplaint);
		}

		return employeeComplaint;
	}

	@Override
	public EmployeeComplaint updateImpl(
		com.hrms.model.EmployeeComplaint employeeComplaint)
		throws SystemException {
		employeeComplaint = toUnwrappedModel(employeeComplaint);

		boolean isNew = employeeComplaint.isNew();

		Session session = null;

		try {
			session = openSession();

			if (employeeComplaint.isNew()) {
				session.save(employeeComplaint);

				employeeComplaint.setNew(false);
			}
			else {
				session.merge(employeeComplaint);
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

		EntityCacheUtil.putResult(EmployeeComplaintModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeComplaintImpl.class, employeeComplaint.getPrimaryKey(),
			employeeComplaint);

		return employeeComplaint;
	}

	protected EmployeeComplaint toUnwrappedModel(
		EmployeeComplaint employeeComplaint) {
		if (employeeComplaint instanceof EmployeeComplaintImpl) {
			return employeeComplaint;
		}

		EmployeeComplaintImpl employeeComplaintImpl = new EmployeeComplaintImpl();

		employeeComplaintImpl.setNew(employeeComplaint.isNew());
		employeeComplaintImpl.setPrimaryKey(employeeComplaint.getPrimaryKey());

		employeeComplaintImpl.setEmployeeComplaintId(employeeComplaint.getEmployeeComplaintId());
		employeeComplaintImpl.setUserId(employeeComplaint.getUserId());
		employeeComplaintImpl.setGroupId(employeeComplaint.getGroupId());
		employeeComplaintImpl.setCompanyId(employeeComplaint.getCompanyId());
		employeeComplaintImpl.setComplaintTitle(employeeComplaint.getComplaintTitle());
		employeeComplaintImpl.setComplaintDiscription(employeeComplaint.getComplaintDiscription());
		employeeComplaintImpl.setComplaintFrom(employeeComplaint.getComplaintFrom());
		employeeComplaintImpl.setComplaintDate(employeeComplaint.getComplaintDate());
		employeeComplaintImpl.setStatus(employeeComplaint.isStatus());
		employeeComplaintImpl.setModifiedDate(employeeComplaint.getModifiedDate());
		employeeComplaintImpl.setCreateBy(employeeComplaint.getCreateBy());
		employeeComplaintImpl.setModifiedBy(employeeComplaint.getModifiedBy());

		return employeeComplaintImpl;
	}

	/**
	 * Returns the employee complaint with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the employee complaint
	 * @return the employee complaint
	 * @throws com.hrms.NoSuchEmployeeComplaintException if a employee complaint with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeComplaint findByPrimaryKey(Serializable primaryKey)
		throws NoSuchEmployeeComplaintException, SystemException {
		EmployeeComplaint employeeComplaint = fetchByPrimaryKey(primaryKey);

		if (employeeComplaint == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchEmployeeComplaintException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return employeeComplaint;
	}

	/**
	 * Returns the employee complaint with the primary key or throws a {@link com.hrms.NoSuchEmployeeComplaintException} if it could not be found.
	 *
	 * @param employeeComplaintId the primary key of the employee complaint
	 * @return the employee complaint
	 * @throws com.hrms.NoSuchEmployeeComplaintException if a employee complaint with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeComplaint findByPrimaryKey(long employeeComplaintId)
		throws NoSuchEmployeeComplaintException, SystemException {
		return findByPrimaryKey((Serializable)employeeComplaintId);
	}

	/**
	 * Returns the employee complaint with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the employee complaint
	 * @return the employee complaint, or <code>null</code> if a employee complaint with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeComplaint fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		EmployeeComplaint employeeComplaint = (EmployeeComplaint)EntityCacheUtil.getResult(EmployeeComplaintModelImpl.ENTITY_CACHE_ENABLED,
				EmployeeComplaintImpl.class, primaryKey);

		if (employeeComplaint == _nullEmployeeComplaint) {
			return null;
		}

		if (employeeComplaint == null) {
			Session session = null;

			try {
				session = openSession();

				employeeComplaint = (EmployeeComplaint)session.get(EmployeeComplaintImpl.class,
						primaryKey);

				if (employeeComplaint != null) {
					cacheResult(employeeComplaint);
				}
				else {
					EntityCacheUtil.putResult(EmployeeComplaintModelImpl.ENTITY_CACHE_ENABLED,
						EmployeeComplaintImpl.class, primaryKey,
						_nullEmployeeComplaint);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(EmployeeComplaintModelImpl.ENTITY_CACHE_ENABLED,
					EmployeeComplaintImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return employeeComplaint;
	}

	/**
	 * Returns the employee complaint with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param employeeComplaintId the primary key of the employee complaint
	 * @return the employee complaint, or <code>null</code> if a employee complaint with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeComplaint fetchByPrimaryKey(long employeeComplaintId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)employeeComplaintId);
	}

	/**
	 * Returns all the employee complaints.
	 *
	 * @return the employee complaints
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EmployeeComplaint> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the employee complaints.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeComplaintModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of employee complaints
	 * @param end the upper bound of the range of employee complaints (not inclusive)
	 * @return the range of employee complaints
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EmployeeComplaint> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the employee complaints.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeComplaintModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of employee complaints
	 * @param end the upper bound of the range of employee complaints (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of employee complaints
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EmployeeComplaint> findAll(int start, int end,
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

		List<EmployeeComplaint> list = (List<EmployeeComplaint>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_EMPLOYEECOMPLAINT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_EMPLOYEECOMPLAINT;

				if (pagination) {
					sql = sql.concat(EmployeeComplaintModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<EmployeeComplaint>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<EmployeeComplaint>(list);
				}
				else {
					list = (List<EmployeeComplaint>)QueryUtil.list(q,
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
	 * Removes all the employee complaints from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (EmployeeComplaint employeeComplaint : findAll()) {
			remove(employeeComplaint);
		}
	}

	/**
	 * Returns the number of employee complaints.
	 *
	 * @return the number of employee complaints
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

				Query q = session.createQuery(_SQL_COUNT_EMPLOYEECOMPLAINT);

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
	 * Initializes the employee complaint persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.hrms.model.EmployeeComplaint")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<EmployeeComplaint>> listenersList = new ArrayList<ModelListener<EmployeeComplaint>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<EmployeeComplaint>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(EmployeeComplaintImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_EMPLOYEECOMPLAINT = "SELECT employeeComplaint FROM EmployeeComplaint employeeComplaint";
	private static final String _SQL_COUNT_EMPLOYEECOMPLAINT = "SELECT COUNT(employeeComplaint) FROM EmployeeComplaint employeeComplaint";
	private static final String _ORDER_BY_ENTITY_ALIAS = "employeeComplaint.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No EmployeeComplaint exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(EmployeeComplaintPersistenceImpl.class);
	private static EmployeeComplaint _nullEmployeeComplaint = new EmployeeComplaintImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<EmployeeComplaint> toCacheModel() {
				return _nullEmployeeComplaintCacheModel;
			}
		};

	private static CacheModel<EmployeeComplaint> _nullEmployeeComplaintCacheModel =
		new CacheModel<EmployeeComplaint>() {
			@Override
			public EmployeeComplaint toEntityModel() {
				return _nullEmployeeComplaint;
			}
		};
}