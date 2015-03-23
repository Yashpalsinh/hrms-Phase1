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

import com.hrms.NoSuchEmployeeDesignationException;

import com.hrms.model.EmployeeDesignation;
import com.hrms.model.impl.EmployeeDesignationImpl;
import com.hrms.model.impl.EmployeeDesignationModelImpl;

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
 * The persistence implementation for the employee designation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author yashpalsinh
 * @see EmployeeDesignationPersistence
 * @see EmployeeDesignationUtil
 * @generated
 */
public class EmployeeDesignationPersistenceImpl extends BasePersistenceImpl<EmployeeDesignation>
	implements EmployeeDesignationPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link EmployeeDesignationUtil} to access the employee designation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = EmployeeDesignationImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(EmployeeDesignationModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeDesignationModelImpl.FINDER_CACHE_ENABLED,
			EmployeeDesignationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(EmployeeDesignationModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeDesignationModelImpl.FINDER_CACHE_ENABLED,
			EmployeeDesignationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(EmployeeDesignationModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeDesignationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_STATUS = new FinderPath(EmployeeDesignationModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeDesignationModelImpl.FINDER_CACHE_ENABLED,
			EmployeeDesignationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBystatus",
			new String[] {
				Boolean.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS =
		new FinderPath(EmployeeDesignationModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeDesignationModelImpl.FINDER_CACHE_ENABLED,
			EmployeeDesignationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBystatus",
			new String[] { Boolean.class.getName() },
			EmployeeDesignationModelImpl.STATUS_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_STATUS = new FinderPath(EmployeeDesignationModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeDesignationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBystatus",
			new String[] { Boolean.class.getName() });

	/**
	 * Returns all the employee designations where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching employee designations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EmployeeDesignation> findBystatus(boolean status)
		throws SystemException {
		return findBystatus(status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the employee designations where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeDesignationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of employee designations
	 * @param end the upper bound of the range of employee designations (not inclusive)
	 * @return the range of matching employee designations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EmployeeDesignation> findBystatus(boolean status, int start,
		int end) throws SystemException {
		return findBystatus(status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the employee designations where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeDesignationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of employee designations
	 * @param end the upper bound of the range of employee designations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching employee designations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EmployeeDesignation> findBystatus(boolean status, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS;
			finderArgs = new Object[] { status };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_STATUS;
			finderArgs = new Object[] { status, start, end, orderByComparator };
		}

		List<EmployeeDesignation> list = (List<EmployeeDesignation>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (EmployeeDesignation employeeDesignation : list) {
				if ((status != employeeDesignation.getStatus())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_EMPLOYEEDESIGNATION_WHERE);

			query.append(_FINDER_COLUMN_STATUS_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(EmployeeDesignationModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(status);

				if (!pagination) {
					list = (List<EmployeeDesignation>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<EmployeeDesignation>(list);
				}
				else {
					list = (List<EmployeeDesignation>)QueryUtil.list(q,
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
	 * Returns the first employee designation in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching employee designation
	 * @throws com.hrms.NoSuchEmployeeDesignationException if a matching employee designation could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeDesignation findBystatus_First(boolean status,
		OrderByComparator orderByComparator)
		throws NoSuchEmployeeDesignationException, SystemException {
		EmployeeDesignation employeeDesignation = fetchBystatus_First(status,
				orderByComparator);

		if (employeeDesignation != null) {
			return employeeDesignation;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchEmployeeDesignationException(msg.toString());
	}

	/**
	 * Returns the first employee designation in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching employee designation, or <code>null</code> if a matching employee designation could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeDesignation fetchBystatus_First(boolean status,
		OrderByComparator orderByComparator) throws SystemException {
		List<EmployeeDesignation> list = findBystatus(status, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last employee designation in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching employee designation
	 * @throws com.hrms.NoSuchEmployeeDesignationException if a matching employee designation could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeDesignation findBystatus_Last(boolean status,
		OrderByComparator orderByComparator)
		throws NoSuchEmployeeDesignationException, SystemException {
		EmployeeDesignation employeeDesignation = fetchBystatus_Last(status,
				orderByComparator);

		if (employeeDesignation != null) {
			return employeeDesignation;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchEmployeeDesignationException(msg.toString());
	}

	/**
	 * Returns the last employee designation in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching employee designation, or <code>null</code> if a matching employee designation could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeDesignation fetchBystatus_Last(boolean status,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countBystatus(status);

		if (count == 0) {
			return null;
		}

		List<EmployeeDesignation> list = findBystatus(status, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the employee designations before and after the current employee designation in the ordered set where status = &#63;.
	 *
	 * @param employeeDesignationId the primary key of the current employee designation
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next employee designation
	 * @throws com.hrms.NoSuchEmployeeDesignationException if a employee designation with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeDesignation[] findBystatus_PrevAndNext(
		long employeeDesignationId, boolean status,
		OrderByComparator orderByComparator)
		throws NoSuchEmployeeDesignationException, SystemException {
		EmployeeDesignation employeeDesignation = findByPrimaryKey(employeeDesignationId);

		Session session = null;

		try {
			session = openSession();

			EmployeeDesignation[] array = new EmployeeDesignationImpl[3];

			array[0] = getBystatus_PrevAndNext(session, employeeDesignation,
					status, orderByComparator, true);

			array[1] = employeeDesignation;

			array[2] = getBystatus_PrevAndNext(session, employeeDesignation,
					status, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected EmployeeDesignation getBystatus_PrevAndNext(Session session,
		EmployeeDesignation employeeDesignation, boolean status,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_EMPLOYEEDESIGNATION_WHERE);

		query.append(_FINDER_COLUMN_STATUS_STATUS_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(EmployeeDesignationModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(status);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(employeeDesignation);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<EmployeeDesignation> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the employee designations where status = &#63; from the database.
	 *
	 * @param status the status
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBystatus(boolean status) throws SystemException {
		for (EmployeeDesignation employeeDesignation : findBystatus(status,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(employeeDesignation);
		}
	}

	/**
	 * Returns the number of employee designations where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching employee designations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBystatus(boolean status) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_STATUS;

		Object[] finderArgs = new Object[] { status };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_EMPLOYEEDESIGNATION_WHERE);

			query.append(_FINDER_COLUMN_STATUS_STATUS_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(status);

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

	private static final String _FINDER_COLUMN_STATUS_STATUS_2 = "employeeDesignation.status = ?";

	public EmployeeDesignationPersistenceImpl() {
		setModelClass(EmployeeDesignation.class);
	}

	/**
	 * Caches the employee designation in the entity cache if it is enabled.
	 *
	 * @param employeeDesignation the employee designation
	 */
	@Override
	public void cacheResult(EmployeeDesignation employeeDesignation) {
		EntityCacheUtil.putResult(EmployeeDesignationModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeDesignationImpl.class, employeeDesignation.getPrimaryKey(),
			employeeDesignation);

		employeeDesignation.resetOriginalValues();
	}

	/**
	 * Caches the employee designations in the entity cache if it is enabled.
	 *
	 * @param employeeDesignations the employee designations
	 */
	@Override
	public void cacheResult(List<EmployeeDesignation> employeeDesignations) {
		for (EmployeeDesignation employeeDesignation : employeeDesignations) {
			if (EntityCacheUtil.getResult(
						EmployeeDesignationModelImpl.ENTITY_CACHE_ENABLED,
						EmployeeDesignationImpl.class,
						employeeDesignation.getPrimaryKey()) == null) {
				cacheResult(employeeDesignation);
			}
			else {
				employeeDesignation.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all employee designations.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(EmployeeDesignationImpl.class.getName());
		}

		EntityCacheUtil.clearCache(EmployeeDesignationImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the employee designation.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(EmployeeDesignation employeeDesignation) {
		EntityCacheUtil.removeResult(EmployeeDesignationModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeDesignationImpl.class, employeeDesignation.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<EmployeeDesignation> employeeDesignations) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (EmployeeDesignation employeeDesignation : employeeDesignations) {
			EntityCacheUtil.removeResult(EmployeeDesignationModelImpl.ENTITY_CACHE_ENABLED,
				EmployeeDesignationImpl.class,
				employeeDesignation.getPrimaryKey());
		}
	}

	/**
	 * Creates a new employee designation with the primary key. Does not add the employee designation to the database.
	 *
	 * @param employeeDesignationId the primary key for the new employee designation
	 * @return the new employee designation
	 */
	@Override
	public EmployeeDesignation create(long employeeDesignationId) {
		EmployeeDesignation employeeDesignation = new EmployeeDesignationImpl();

		employeeDesignation.setNew(true);
		employeeDesignation.setPrimaryKey(employeeDesignationId);

		return employeeDesignation;
	}

	/**
	 * Removes the employee designation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param employeeDesignationId the primary key of the employee designation
	 * @return the employee designation that was removed
	 * @throws com.hrms.NoSuchEmployeeDesignationException if a employee designation with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeDesignation remove(long employeeDesignationId)
		throws NoSuchEmployeeDesignationException, SystemException {
		return remove((Serializable)employeeDesignationId);
	}

	/**
	 * Removes the employee designation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the employee designation
	 * @return the employee designation that was removed
	 * @throws com.hrms.NoSuchEmployeeDesignationException if a employee designation with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeDesignation remove(Serializable primaryKey)
		throws NoSuchEmployeeDesignationException, SystemException {
		Session session = null;

		try {
			session = openSession();

			EmployeeDesignation employeeDesignation = (EmployeeDesignation)session.get(EmployeeDesignationImpl.class,
					primaryKey);

			if (employeeDesignation == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchEmployeeDesignationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(employeeDesignation);
		}
		catch (NoSuchEmployeeDesignationException nsee) {
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
	protected EmployeeDesignation removeImpl(
		EmployeeDesignation employeeDesignation) throws SystemException {
		employeeDesignation = toUnwrappedModel(employeeDesignation);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(employeeDesignation)) {
				employeeDesignation = (EmployeeDesignation)session.get(EmployeeDesignationImpl.class,
						employeeDesignation.getPrimaryKeyObj());
			}

			if (employeeDesignation != null) {
				session.delete(employeeDesignation);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (employeeDesignation != null) {
			clearCache(employeeDesignation);
		}

		return employeeDesignation;
	}

	@Override
	public EmployeeDesignation updateImpl(
		com.hrms.model.EmployeeDesignation employeeDesignation)
		throws SystemException {
		employeeDesignation = toUnwrappedModel(employeeDesignation);

		boolean isNew = employeeDesignation.isNew();

		EmployeeDesignationModelImpl employeeDesignationModelImpl = (EmployeeDesignationModelImpl)employeeDesignation;

		Session session = null;

		try {
			session = openSession();

			if (employeeDesignation.isNew()) {
				session.save(employeeDesignation);

				employeeDesignation.setNew(false);
			}
			else {
				session.merge(employeeDesignation);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !EmployeeDesignationModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((employeeDesignationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						employeeDesignationModelImpl.getOriginalStatus()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_STATUS, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS,
					args);

				args = new Object[] { employeeDesignationModelImpl.getStatus() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_STATUS, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS,
					args);
			}
		}

		EntityCacheUtil.putResult(EmployeeDesignationModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeDesignationImpl.class, employeeDesignation.getPrimaryKey(),
			employeeDesignation);

		return employeeDesignation;
	}

	protected EmployeeDesignation toUnwrappedModel(
		EmployeeDesignation employeeDesignation) {
		if (employeeDesignation instanceof EmployeeDesignationImpl) {
			return employeeDesignation;
		}

		EmployeeDesignationImpl employeeDesignationImpl = new EmployeeDesignationImpl();

		employeeDesignationImpl.setNew(employeeDesignation.isNew());
		employeeDesignationImpl.setPrimaryKey(employeeDesignation.getPrimaryKey());

		employeeDesignationImpl.setEmployeeDesignationId(employeeDesignation.getEmployeeDesignationId());
		employeeDesignationImpl.setDesignationName(employeeDesignation.getDesignationName());
		employeeDesignationImpl.setStatus(employeeDesignation.isStatus());

		return employeeDesignationImpl;
	}

	/**
	 * Returns the employee designation with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the employee designation
	 * @return the employee designation
	 * @throws com.hrms.NoSuchEmployeeDesignationException if a employee designation with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeDesignation findByPrimaryKey(Serializable primaryKey)
		throws NoSuchEmployeeDesignationException, SystemException {
		EmployeeDesignation employeeDesignation = fetchByPrimaryKey(primaryKey);

		if (employeeDesignation == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchEmployeeDesignationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return employeeDesignation;
	}

	/**
	 * Returns the employee designation with the primary key or throws a {@link com.hrms.NoSuchEmployeeDesignationException} if it could not be found.
	 *
	 * @param employeeDesignationId the primary key of the employee designation
	 * @return the employee designation
	 * @throws com.hrms.NoSuchEmployeeDesignationException if a employee designation with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeDesignation findByPrimaryKey(long employeeDesignationId)
		throws NoSuchEmployeeDesignationException, SystemException {
		return findByPrimaryKey((Serializable)employeeDesignationId);
	}

	/**
	 * Returns the employee designation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the employee designation
	 * @return the employee designation, or <code>null</code> if a employee designation with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeDesignation fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		EmployeeDesignation employeeDesignation = (EmployeeDesignation)EntityCacheUtil.getResult(EmployeeDesignationModelImpl.ENTITY_CACHE_ENABLED,
				EmployeeDesignationImpl.class, primaryKey);

		if (employeeDesignation == _nullEmployeeDesignation) {
			return null;
		}

		if (employeeDesignation == null) {
			Session session = null;

			try {
				session = openSession();

				employeeDesignation = (EmployeeDesignation)session.get(EmployeeDesignationImpl.class,
						primaryKey);

				if (employeeDesignation != null) {
					cacheResult(employeeDesignation);
				}
				else {
					EntityCacheUtil.putResult(EmployeeDesignationModelImpl.ENTITY_CACHE_ENABLED,
						EmployeeDesignationImpl.class, primaryKey,
						_nullEmployeeDesignation);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(EmployeeDesignationModelImpl.ENTITY_CACHE_ENABLED,
					EmployeeDesignationImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return employeeDesignation;
	}

	/**
	 * Returns the employee designation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param employeeDesignationId the primary key of the employee designation
	 * @return the employee designation, or <code>null</code> if a employee designation with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeDesignation fetchByPrimaryKey(long employeeDesignationId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)employeeDesignationId);
	}

	/**
	 * Returns all the employee designations.
	 *
	 * @return the employee designations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EmployeeDesignation> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the employee designations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeDesignationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of employee designations
	 * @param end the upper bound of the range of employee designations (not inclusive)
	 * @return the range of employee designations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EmployeeDesignation> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the employee designations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeDesignationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of employee designations
	 * @param end the upper bound of the range of employee designations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of employee designations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EmployeeDesignation> findAll(int start, int end,
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

		List<EmployeeDesignation> list = (List<EmployeeDesignation>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_EMPLOYEEDESIGNATION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_EMPLOYEEDESIGNATION;

				if (pagination) {
					sql = sql.concat(EmployeeDesignationModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<EmployeeDesignation>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<EmployeeDesignation>(list);
				}
				else {
					list = (List<EmployeeDesignation>)QueryUtil.list(q,
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
	 * Removes all the employee designations from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (EmployeeDesignation employeeDesignation : findAll()) {
			remove(employeeDesignation);
		}
	}

	/**
	 * Returns the number of employee designations.
	 *
	 * @return the number of employee designations
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

				Query q = session.createQuery(_SQL_COUNT_EMPLOYEEDESIGNATION);

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
	 * Initializes the employee designation persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.hrms.model.EmployeeDesignation")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<EmployeeDesignation>> listenersList = new ArrayList<ModelListener<EmployeeDesignation>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<EmployeeDesignation>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(EmployeeDesignationImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_EMPLOYEEDESIGNATION = "SELECT employeeDesignation FROM EmployeeDesignation employeeDesignation";
	private static final String _SQL_SELECT_EMPLOYEEDESIGNATION_WHERE = "SELECT employeeDesignation FROM EmployeeDesignation employeeDesignation WHERE ";
	private static final String _SQL_COUNT_EMPLOYEEDESIGNATION = "SELECT COUNT(employeeDesignation) FROM EmployeeDesignation employeeDesignation";
	private static final String _SQL_COUNT_EMPLOYEEDESIGNATION_WHERE = "SELECT COUNT(employeeDesignation) FROM EmployeeDesignation employeeDesignation WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "employeeDesignation.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No EmployeeDesignation exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No EmployeeDesignation exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(EmployeeDesignationPersistenceImpl.class);
	private static EmployeeDesignation _nullEmployeeDesignation = new EmployeeDesignationImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<EmployeeDesignation> toCacheModel() {
				return _nullEmployeeDesignationCacheModel;
			}
		};

	private static CacheModel<EmployeeDesignation> _nullEmployeeDesignationCacheModel =
		new CacheModel<EmployeeDesignation>() {
			@Override
			public EmployeeDesignation toEntityModel() {
				return _nullEmployeeDesignation;
			}
		};
}