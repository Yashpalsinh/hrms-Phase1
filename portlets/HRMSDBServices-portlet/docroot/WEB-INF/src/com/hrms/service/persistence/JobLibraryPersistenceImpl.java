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

import com.hrms.NoSuchJobLibraryException;

import com.hrms.model.JobLibrary;
import com.hrms.model.impl.JobLibraryImpl;
import com.hrms.model.impl.JobLibraryModelImpl;

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
 * The persistence implementation for the job library service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author yashpalsinh
 * @see JobLibraryPersistence
 * @see JobLibraryUtil
 * @generated
 */
public class JobLibraryPersistenceImpl extends BasePersistenceImpl<JobLibrary>
	implements JobLibraryPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link JobLibraryUtil} to access the job library persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = JobLibraryImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(JobLibraryModelImpl.ENTITY_CACHE_ENABLED,
			JobLibraryModelImpl.FINDER_CACHE_ENABLED, JobLibraryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(JobLibraryModelImpl.ENTITY_CACHE_ENABLED,
			JobLibraryModelImpl.FINDER_CACHE_ENABLED, JobLibraryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(JobLibraryModelImpl.ENTITY_CACHE_ENABLED,
			JobLibraryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public JobLibraryPersistenceImpl() {
		setModelClass(JobLibrary.class);
	}

	/**
	 * Caches the job library in the entity cache if it is enabled.
	 *
	 * @param jobLibrary the job library
	 */
	@Override
	public void cacheResult(JobLibrary jobLibrary) {
		EntityCacheUtil.putResult(JobLibraryModelImpl.ENTITY_CACHE_ENABLED,
			JobLibraryImpl.class, jobLibrary.getPrimaryKey(), jobLibrary);

		jobLibrary.resetOriginalValues();
	}

	/**
	 * Caches the job libraries in the entity cache if it is enabled.
	 *
	 * @param jobLibraries the job libraries
	 */
	@Override
	public void cacheResult(List<JobLibrary> jobLibraries) {
		for (JobLibrary jobLibrary : jobLibraries) {
			if (EntityCacheUtil.getResult(
						JobLibraryModelImpl.ENTITY_CACHE_ENABLED,
						JobLibraryImpl.class, jobLibrary.getPrimaryKey()) == null) {
				cacheResult(jobLibrary);
			}
			else {
				jobLibrary.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all job libraries.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(JobLibraryImpl.class.getName());
		}

		EntityCacheUtil.clearCache(JobLibraryImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the job library.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(JobLibrary jobLibrary) {
		EntityCacheUtil.removeResult(JobLibraryModelImpl.ENTITY_CACHE_ENABLED,
			JobLibraryImpl.class, jobLibrary.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<JobLibrary> jobLibraries) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (JobLibrary jobLibrary : jobLibraries) {
			EntityCacheUtil.removeResult(JobLibraryModelImpl.ENTITY_CACHE_ENABLED,
				JobLibraryImpl.class, jobLibrary.getPrimaryKey());
		}
	}

	/**
	 * Creates a new job library with the primary key. Does not add the job library to the database.
	 *
	 * @param jobLibraryId the primary key for the new job library
	 * @return the new job library
	 */
	@Override
	public JobLibrary create(long jobLibraryId) {
		JobLibrary jobLibrary = new JobLibraryImpl();

		jobLibrary.setNew(true);
		jobLibrary.setPrimaryKey(jobLibraryId);

		return jobLibrary;
	}

	/**
	 * Removes the job library with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jobLibraryId the primary key of the job library
	 * @return the job library that was removed
	 * @throws com.hrms.NoSuchJobLibraryException if a job library with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public JobLibrary remove(long jobLibraryId)
		throws NoSuchJobLibraryException, SystemException {
		return remove((Serializable)jobLibraryId);
	}

	/**
	 * Removes the job library with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the job library
	 * @return the job library that was removed
	 * @throws com.hrms.NoSuchJobLibraryException if a job library with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public JobLibrary remove(Serializable primaryKey)
		throws NoSuchJobLibraryException, SystemException {
		Session session = null;

		try {
			session = openSession();

			JobLibrary jobLibrary = (JobLibrary)session.get(JobLibraryImpl.class,
					primaryKey);

			if (jobLibrary == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchJobLibraryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(jobLibrary);
		}
		catch (NoSuchJobLibraryException nsee) {
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
	protected JobLibrary removeImpl(JobLibrary jobLibrary)
		throws SystemException {
		jobLibrary = toUnwrappedModel(jobLibrary);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(jobLibrary)) {
				jobLibrary = (JobLibrary)session.get(JobLibraryImpl.class,
						jobLibrary.getPrimaryKeyObj());
			}

			if (jobLibrary != null) {
				session.delete(jobLibrary);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (jobLibrary != null) {
			clearCache(jobLibrary);
		}

		return jobLibrary;
	}

	@Override
	public JobLibrary updateImpl(com.hrms.model.JobLibrary jobLibrary)
		throws SystemException {
		jobLibrary = toUnwrappedModel(jobLibrary);

		boolean isNew = jobLibrary.isNew();

		Session session = null;

		try {
			session = openSession();

			if (jobLibrary.isNew()) {
				session.save(jobLibrary);

				jobLibrary.setNew(false);
			}
			else {
				session.merge(jobLibrary);
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

		EntityCacheUtil.putResult(JobLibraryModelImpl.ENTITY_CACHE_ENABLED,
			JobLibraryImpl.class, jobLibrary.getPrimaryKey(), jobLibrary);

		return jobLibrary;
	}

	protected JobLibrary toUnwrappedModel(JobLibrary jobLibrary) {
		if (jobLibrary instanceof JobLibraryImpl) {
			return jobLibrary;
		}

		JobLibraryImpl jobLibraryImpl = new JobLibraryImpl();

		jobLibraryImpl.setNew(jobLibrary.isNew());
		jobLibraryImpl.setPrimaryKey(jobLibrary.getPrimaryKey());

		jobLibraryImpl.setJobLibraryId(jobLibrary.getJobLibraryId());
		jobLibraryImpl.setEmployeeDepartmentId(jobLibrary.getEmployeeDepartmentId());
		jobLibraryImpl.setJobTitle(jobLibrary.getJobTitle());
		jobLibraryImpl.setJobDescription(jobLibrary.getJobDescription());
		jobLibraryImpl.setResponsibility(jobLibrary.getResponsibility());
		jobLibraryImpl.setQualifications(jobLibrary.getQualifications());
		jobLibraryImpl.setNumberOfPosition(jobLibrary.getNumberOfPosition());
		jobLibraryImpl.setExperience(jobLibrary.getExperience());
		jobLibraryImpl.setSalaryStartRange(jobLibrary.getSalaryStartRange());
		jobLibraryImpl.setSalaryEndRange(jobLibrary.getSalaryEndRange());
		jobLibraryImpl.setBenefits(jobLibrary.getBenefits());
		jobLibraryImpl.setReportsToId(jobLibrary.getReportsToId());
		jobLibraryImpl.setCreateDate(jobLibrary.getCreateDate());
		jobLibraryImpl.setModifiedDate(jobLibrary.getModifiedDate());
		jobLibraryImpl.setCreateBy(jobLibrary.getCreateBy());
		jobLibraryImpl.setModifiedBy(jobLibrary.getModifiedBy());

		return jobLibraryImpl;
	}

	/**
	 * Returns the job library with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the job library
	 * @return the job library
	 * @throws com.hrms.NoSuchJobLibraryException if a job library with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public JobLibrary findByPrimaryKey(Serializable primaryKey)
		throws NoSuchJobLibraryException, SystemException {
		JobLibrary jobLibrary = fetchByPrimaryKey(primaryKey);

		if (jobLibrary == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchJobLibraryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return jobLibrary;
	}

	/**
	 * Returns the job library with the primary key or throws a {@link com.hrms.NoSuchJobLibraryException} if it could not be found.
	 *
	 * @param jobLibraryId the primary key of the job library
	 * @return the job library
	 * @throws com.hrms.NoSuchJobLibraryException if a job library with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public JobLibrary findByPrimaryKey(long jobLibraryId)
		throws NoSuchJobLibraryException, SystemException {
		return findByPrimaryKey((Serializable)jobLibraryId);
	}

	/**
	 * Returns the job library with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the job library
	 * @return the job library, or <code>null</code> if a job library with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public JobLibrary fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		JobLibrary jobLibrary = (JobLibrary)EntityCacheUtil.getResult(JobLibraryModelImpl.ENTITY_CACHE_ENABLED,
				JobLibraryImpl.class, primaryKey);

		if (jobLibrary == _nullJobLibrary) {
			return null;
		}

		if (jobLibrary == null) {
			Session session = null;

			try {
				session = openSession();

				jobLibrary = (JobLibrary)session.get(JobLibraryImpl.class,
						primaryKey);

				if (jobLibrary != null) {
					cacheResult(jobLibrary);
				}
				else {
					EntityCacheUtil.putResult(JobLibraryModelImpl.ENTITY_CACHE_ENABLED,
						JobLibraryImpl.class, primaryKey, _nullJobLibrary);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(JobLibraryModelImpl.ENTITY_CACHE_ENABLED,
					JobLibraryImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return jobLibrary;
	}

	/**
	 * Returns the job library with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jobLibraryId the primary key of the job library
	 * @return the job library, or <code>null</code> if a job library with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public JobLibrary fetchByPrimaryKey(long jobLibraryId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)jobLibraryId);
	}

	/**
	 * Returns all the job libraries.
	 *
	 * @return the job libraries
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<JobLibrary> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the job libraries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.JobLibraryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of job libraries
	 * @param end the upper bound of the range of job libraries (not inclusive)
	 * @return the range of job libraries
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<JobLibrary> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the job libraries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.JobLibraryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of job libraries
	 * @param end the upper bound of the range of job libraries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of job libraries
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<JobLibrary> findAll(int start, int end,
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

		List<JobLibrary> list = (List<JobLibrary>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_JOBLIBRARY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_JOBLIBRARY;

				if (pagination) {
					sql = sql.concat(JobLibraryModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<JobLibrary>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<JobLibrary>(list);
				}
				else {
					list = (List<JobLibrary>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the job libraries from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (JobLibrary jobLibrary : findAll()) {
			remove(jobLibrary);
		}
	}

	/**
	 * Returns the number of job libraries.
	 *
	 * @return the number of job libraries
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

				Query q = session.createQuery(_SQL_COUNT_JOBLIBRARY);

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
	 * Initializes the job library persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.hrms.model.JobLibrary")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<JobLibrary>> listenersList = new ArrayList<ModelListener<JobLibrary>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<JobLibrary>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(JobLibraryImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_JOBLIBRARY = "SELECT jobLibrary FROM JobLibrary jobLibrary";
	private static final String _SQL_COUNT_JOBLIBRARY = "SELECT COUNT(jobLibrary) FROM JobLibrary jobLibrary";
	private static final String _ORDER_BY_ENTITY_ALIAS = "jobLibrary.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No JobLibrary exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(JobLibraryPersistenceImpl.class);
	private static JobLibrary _nullJobLibrary = new JobLibraryImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<JobLibrary> toCacheModel() {
				return _nullJobLibraryCacheModel;
			}
		};

	private static CacheModel<JobLibrary> _nullJobLibraryCacheModel = new CacheModel<JobLibrary>() {
			@Override
			public JobLibrary toEntityModel() {
				return _nullJobLibrary;
			}
		};
}