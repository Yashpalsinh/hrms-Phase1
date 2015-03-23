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

import com.hrms.NoSuchEmployeeMstException;

import com.hrms.model.EmployeeMst;
import com.hrms.model.impl.EmployeeMstImpl;
import com.hrms.model.impl.EmployeeMstModelImpl;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
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
import com.liferay.portal.kernel.util.StringPool;
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
 * The persistence implementation for the employee mst service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author yashpalsinh
 * @see EmployeeMstPersistence
 * @see EmployeeMstUtil
 * @generated
 */
public class EmployeeMstPersistenceImpl extends BasePersistenceImpl<EmployeeMst>
	implements EmployeeMstPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link EmployeeMstUtil} to access the employee mst persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = EmployeeMstImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(EmployeeMstModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeMstModelImpl.FINDER_CACHE_ENABLED, EmployeeMstImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(EmployeeMstModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeMstModelImpl.FINDER_CACHE_ENABLED, EmployeeMstImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(EmployeeMstModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeMstModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_USERID = new FinderPath(EmployeeMstModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeMstModelImpl.FINDER_CACHE_ENABLED, EmployeeMstImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByuserId",
			new String[] { Long.class.getName() },
			EmployeeMstModelImpl.USERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_USERID = new FinderPath(EmployeeMstModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeMstModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByuserId",
			new String[] { Long.class.getName() });

	/**
	 * Returns the employee mst where userId = &#63; or throws a {@link com.hrms.NoSuchEmployeeMstException} if it could not be found.
	 *
	 * @param userId the user ID
	 * @return the matching employee mst
	 * @throws com.hrms.NoSuchEmployeeMstException if a matching employee mst could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeMst findByuserId(long userId)
		throws NoSuchEmployeeMstException, SystemException {
		EmployeeMst employeeMst = fetchByuserId(userId);

		if (employeeMst == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("userId=");
			msg.append(userId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchEmployeeMstException(msg.toString());
		}

		return employeeMst;
	}

	/**
	 * Returns the employee mst where userId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param userId the user ID
	 * @return the matching employee mst, or <code>null</code> if a matching employee mst could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeMst fetchByuserId(long userId) throws SystemException {
		return fetchByuserId(userId, true);
	}

	/**
	 * Returns the employee mst where userId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param userId the user ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching employee mst, or <code>null</code> if a matching employee mst could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeMst fetchByuserId(long userId, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { userId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_USERID,
					finderArgs, this);
		}

		if (result instanceof EmployeeMst) {
			EmployeeMst employeeMst = (EmployeeMst)result;

			if ((userId != employeeMst.getUserId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_EMPLOYEEMST_WHERE);

			query.append(_FINDER_COLUMN_USERID_USERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				List<EmployeeMst> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_USERID,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"EmployeeMstPersistenceImpl.fetchByuserId(long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					EmployeeMst employeeMst = list.get(0);

					result = employeeMst;

					cacheResult(employeeMst);

					if ((employeeMst.getUserId() != userId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_USERID,
							finderArgs, employeeMst);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_USERID,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (EmployeeMst)result;
		}
	}

	/**
	 * Removes the employee mst where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @return the employee mst that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeMst removeByuserId(long userId)
		throws NoSuchEmployeeMstException, SystemException {
		EmployeeMst employeeMst = findByuserId(userId);

		return remove(employeeMst);
	}

	/**
	 * Returns the number of employee msts where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching employee msts
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByuserId(long userId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_USERID;

		Object[] finderArgs = new Object[] { userId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_EMPLOYEEMST_WHERE);

			query.append(_FINDER_COLUMN_USERID_USERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_USERID_USERID_2 = "employeeMst.userId = ?";

	public EmployeeMstPersistenceImpl() {
		setModelClass(EmployeeMst.class);
	}

	/**
	 * Caches the employee mst in the entity cache if it is enabled.
	 *
	 * @param employeeMst the employee mst
	 */
	@Override
	public void cacheResult(EmployeeMst employeeMst) {
		EntityCacheUtil.putResult(EmployeeMstModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeMstImpl.class, employeeMst.getPrimaryKey(), employeeMst);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_USERID,
			new Object[] { employeeMst.getUserId() }, employeeMst);

		employeeMst.resetOriginalValues();
	}

	/**
	 * Caches the employee msts in the entity cache if it is enabled.
	 *
	 * @param employeeMsts the employee msts
	 */
	@Override
	public void cacheResult(List<EmployeeMst> employeeMsts) {
		for (EmployeeMst employeeMst : employeeMsts) {
			if (EntityCacheUtil.getResult(
						EmployeeMstModelImpl.ENTITY_CACHE_ENABLED,
						EmployeeMstImpl.class, employeeMst.getPrimaryKey()) == null) {
				cacheResult(employeeMst);
			}
			else {
				employeeMst.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all employee msts.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(EmployeeMstImpl.class.getName());
		}

		EntityCacheUtil.clearCache(EmployeeMstImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the employee mst.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(EmployeeMst employeeMst) {
		EntityCacheUtil.removeResult(EmployeeMstModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeMstImpl.class, employeeMst.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(employeeMst);
	}

	@Override
	public void clearCache(List<EmployeeMst> employeeMsts) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (EmployeeMst employeeMst : employeeMsts) {
			EntityCacheUtil.removeResult(EmployeeMstModelImpl.ENTITY_CACHE_ENABLED,
				EmployeeMstImpl.class, employeeMst.getPrimaryKey());

			clearUniqueFindersCache(employeeMst);
		}
	}

	protected void cacheUniqueFindersCache(EmployeeMst employeeMst) {
		if (employeeMst.isNew()) {
			Object[] args = new Object[] { employeeMst.getUserId() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_USERID, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_USERID, args,
				employeeMst);
		}
		else {
			EmployeeMstModelImpl employeeMstModelImpl = (EmployeeMstModelImpl)employeeMst;

			if ((employeeMstModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_USERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { employeeMst.getUserId() };

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_USERID, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_USERID, args,
					employeeMst);
			}
		}
	}

	protected void clearUniqueFindersCache(EmployeeMst employeeMst) {
		EmployeeMstModelImpl employeeMstModelImpl = (EmployeeMstModelImpl)employeeMst;

		Object[] args = new Object[] { employeeMst.getUserId() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_USERID, args);

		if ((employeeMstModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_USERID.getColumnBitmask()) != 0) {
			args = new Object[] { employeeMstModelImpl.getOriginalUserId() };

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_USERID, args);
		}
	}

	/**
	 * Creates a new employee mst with the primary key. Does not add the employee mst to the database.
	 *
	 * @param employeeMstId the primary key for the new employee mst
	 * @return the new employee mst
	 */
	@Override
	public EmployeeMst create(long employeeMstId) {
		EmployeeMst employeeMst = new EmployeeMstImpl();

		employeeMst.setNew(true);
		employeeMst.setPrimaryKey(employeeMstId);

		return employeeMst;
	}

	/**
	 * Removes the employee mst with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param employeeMstId the primary key of the employee mst
	 * @return the employee mst that was removed
	 * @throws com.hrms.NoSuchEmployeeMstException if a employee mst with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeMst remove(long employeeMstId)
		throws NoSuchEmployeeMstException, SystemException {
		return remove((Serializable)employeeMstId);
	}

	/**
	 * Removes the employee mst with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the employee mst
	 * @return the employee mst that was removed
	 * @throws com.hrms.NoSuchEmployeeMstException if a employee mst with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeMst remove(Serializable primaryKey)
		throws NoSuchEmployeeMstException, SystemException {
		Session session = null;

		try {
			session = openSession();

			EmployeeMst employeeMst = (EmployeeMst)session.get(EmployeeMstImpl.class,
					primaryKey);

			if (employeeMst == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchEmployeeMstException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(employeeMst);
		}
		catch (NoSuchEmployeeMstException nsee) {
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
	protected EmployeeMst removeImpl(EmployeeMst employeeMst)
		throws SystemException {
		employeeMst = toUnwrappedModel(employeeMst);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(employeeMst)) {
				employeeMst = (EmployeeMst)session.get(EmployeeMstImpl.class,
						employeeMst.getPrimaryKeyObj());
			}

			if (employeeMst != null) {
				session.delete(employeeMst);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (employeeMst != null) {
			clearCache(employeeMst);
		}

		return employeeMst;
	}

	@Override
	public EmployeeMst updateImpl(com.hrms.model.EmployeeMst employeeMst)
		throws SystemException {
		employeeMst = toUnwrappedModel(employeeMst);

		boolean isNew = employeeMst.isNew();

		Session session = null;

		try {
			session = openSession();

			if (employeeMst.isNew()) {
				session.save(employeeMst);

				employeeMst.setNew(false);
			}
			else {
				session.merge(employeeMst);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !EmployeeMstModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(EmployeeMstModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeMstImpl.class, employeeMst.getPrimaryKey(), employeeMst);

		clearUniqueFindersCache(employeeMst);
		cacheUniqueFindersCache(employeeMst);

		return employeeMst;
	}

	protected EmployeeMst toUnwrappedModel(EmployeeMst employeeMst) {
		if (employeeMst instanceof EmployeeMstImpl) {
			return employeeMst;
		}

		EmployeeMstImpl employeeMstImpl = new EmployeeMstImpl();

		employeeMstImpl.setNew(employeeMst.isNew());
		employeeMstImpl.setPrimaryKey(employeeMst.getPrimaryKey());

		employeeMstImpl.setEmployeeMstId(employeeMst.getEmployeeMstId());
		employeeMstImpl.setEmployeeId(employeeMst.getEmployeeId());
		employeeMstImpl.setUserId(employeeMst.getUserId());
		employeeMstImpl.setGender(employeeMst.getGender());
		employeeMstImpl.setDateOfBirth(employeeMst.getDateOfBirth());
		employeeMstImpl.setJoiningDate(employeeMst.getJoiningDate());
		employeeMstImpl.setLeavingDate(employeeMst.getLeavingDate());
		employeeMstImpl.setMaritualStatus(employeeMst.getMaritualStatus());
		employeeMstImpl.setNationality(employeeMst.getNationality());
		employeeMstImpl.setEmployeeDesignationId(employeeMst.getEmployeeDesignationId());
		employeeMstImpl.setEmployeeDepartmentId(employeeMst.getEmployeeDepartmentId());
		employeeMstImpl.setEmployeeTypeId(employeeMst.getEmployeeTypeId());
		employeeMstImpl.setEmployeeProofId(employeeMst.getEmployeeProofId());
		employeeMstImpl.setProofNumber(employeeMst.getProofNumber());
		employeeMstImpl.setCreateBy(employeeMst.getCreateBy());
		employeeMstImpl.setModifiedBy(employeeMst.getModifiedBy());

		return employeeMstImpl;
	}

	/**
	 * Returns the employee mst with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the employee mst
	 * @return the employee mst
	 * @throws com.hrms.NoSuchEmployeeMstException if a employee mst with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeMst findByPrimaryKey(Serializable primaryKey)
		throws NoSuchEmployeeMstException, SystemException {
		EmployeeMst employeeMst = fetchByPrimaryKey(primaryKey);

		if (employeeMst == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchEmployeeMstException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return employeeMst;
	}

	/**
	 * Returns the employee mst with the primary key or throws a {@link com.hrms.NoSuchEmployeeMstException} if it could not be found.
	 *
	 * @param employeeMstId the primary key of the employee mst
	 * @return the employee mst
	 * @throws com.hrms.NoSuchEmployeeMstException if a employee mst with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeMst findByPrimaryKey(long employeeMstId)
		throws NoSuchEmployeeMstException, SystemException {
		return findByPrimaryKey((Serializable)employeeMstId);
	}

	/**
	 * Returns the employee mst with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the employee mst
	 * @return the employee mst, or <code>null</code> if a employee mst with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeMst fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		EmployeeMst employeeMst = (EmployeeMst)EntityCacheUtil.getResult(EmployeeMstModelImpl.ENTITY_CACHE_ENABLED,
				EmployeeMstImpl.class, primaryKey);

		if (employeeMst == _nullEmployeeMst) {
			return null;
		}

		if (employeeMst == null) {
			Session session = null;

			try {
				session = openSession();

				employeeMst = (EmployeeMst)session.get(EmployeeMstImpl.class,
						primaryKey);

				if (employeeMst != null) {
					cacheResult(employeeMst);
				}
				else {
					EntityCacheUtil.putResult(EmployeeMstModelImpl.ENTITY_CACHE_ENABLED,
						EmployeeMstImpl.class, primaryKey, _nullEmployeeMst);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(EmployeeMstModelImpl.ENTITY_CACHE_ENABLED,
					EmployeeMstImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return employeeMst;
	}

	/**
	 * Returns the employee mst with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param employeeMstId the primary key of the employee mst
	 * @return the employee mst, or <code>null</code> if a employee mst with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeMst fetchByPrimaryKey(long employeeMstId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)employeeMstId);
	}

	/**
	 * Returns all the employee msts.
	 *
	 * @return the employee msts
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EmployeeMst> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the employee msts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeMstModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of employee msts
	 * @param end the upper bound of the range of employee msts (not inclusive)
	 * @return the range of employee msts
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EmployeeMst> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the employee msts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeMstModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of employee msts
	 * @param end the upper bound of the range of employee msts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of employee msts
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EmployeeMst> findAll(int start, int end,
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

		List<EmployeeMst> list = (List<EmployeeMst>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_EMPLOYEEMST);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_EMPLOYEEMST;

				if (pagination) {
					sql = sql.concat(EmployeeMstModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<EmployeeMst>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<EmployeeMst>(list);
				}
				else {
					list = (List<EmployeeMst>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the employee msts from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (EmployeeMst employeeMst : findAll()) {
			remove(employeeMst);
		}
	}

	/**
	 * Returns the number of employee msts.
	 *
	 * @return the number of employee msts
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

				Query q = session.createQuery(_SQL_COUNT_EMPLOYEEMST);

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
	 * Initializes the employee mst persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.hrms.model.EmployeeMst")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<EmployeeMst>> listenersList = new ArrayList<ModelListener<EmployeeMst>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<EmployeeMst>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(EmployeeMstImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_EMPLOYEEMST = "SELECT employeeMst FROM EmployeeMst employeeMst";
	private static final String _SQL_SELECT_EMPLOYEEMST_WHERE = "SELECT employeeMst FROM EmployeeMst employeeMst WHERE ";
	private static final String _SQL_COUNT_EMPLOYEEMST = "SELECT COUNT(employeeMst) FROM EmployeeMst employeeMst";
	private static final String _SQL_COUNT_EMPLOYEEMST_WHERE = "SELECT COUNT(employeeMst) FROM EmployeeMst employeeMst WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "employeeMst.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No EmployeeMst exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No EmployeeMst exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(EmployeeMstPersistenceImpl.class);
	private static EmployeeMst _nullEmployeeMst = new EmployeeMstImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<EmployeeMst> toCacheModel() {
				return _nullEmployeeMstCacheModel;
			}
		};

	private static CacheModel<EmployeeMst> _nullEmployeeMstCacheModel = new CacheModel<EmployeeMst>() {
			@Override
			public EmployeeMst toEntityModel() {
				return _nullEmployeeMst;
			}
		};
}