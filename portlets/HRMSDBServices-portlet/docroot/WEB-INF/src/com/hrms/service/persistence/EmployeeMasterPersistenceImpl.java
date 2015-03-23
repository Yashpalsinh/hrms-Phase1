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

import com.hrms.NoSuchEmployeeMasterException;

import com.hrms.model.EmployeeMaster;
import com.hrms.model.impl.EmployeeMasterImpl;
import com.hrms.model.impl.EmployeeMasterModelImpl;

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
 * The persistence implementation for the employee master service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author yashpalsinh
 * @see EmployeeMasterPersistence
 * @see EmployeeMasterUtil
 * @generated
 */
public class EmployeeMasterPersistenceImpl extends BasePersistenceImpl<EmployeeMaster>
	implements EmployeeMasterPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link EmployeeMasterUtil} to access the employee master persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = EmployeeMasterImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(EmployeeMasterModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeMasterModelImpl.FINDER_CACHE_ENABLED,
			EmployeeMasterImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(EmployeeMasterModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeMasterModelImpl.FINDER_CACHE_ENABLED,
			EmployeeMasterImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(EmployeeMasterModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeMasterModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_USERID = new FinderPath(EmployeeMasterModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeMasterModelImpl.FINDER_CACHE_ENABLED,
			EmployeeMasterImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByuserId", new String[] { Long.class.getName() },
			EmployeeMasterModelImpl.USERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_USERID = new FinderPath(EmployeeMasterModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeMasterModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByuserId",
			new String[] { Long.class.getName() });

	/**
	 * Returns the employee master where userId = &#63; or throws a {@link com.hrms.NoSuchEmployeeMasterException} if it could not be found.
	 *
	 * @param userId the user ID
	 * @return the matching employee master
	 * @throws com.hrms.NoSuchEmployeeMasterException if a matching employee master could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeMaster findByuserId(long userId)
		throws NoSuchEmployeeMasterException, SystemException {
		EmployeeMaster employeeMaster = fetchByuserId(userId);

		if (employeeMaster == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("userId=");
			msg.append(userId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchEmployeeMasterException(msg.toString());
		}

		return employeeMaster;
	}

	/**
	 * Returns the employee master where userId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param userId the user ID
	 * @return the matching employee master, or <code>null</code> if a matching employee master could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeMaster fetchByuserId(long userId) throws SystemException {
		return fetchByuserId(userId, true);
	}

	/**
	 * Returns the employee master where userId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param userId the user ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching employee master, or <code>null</code> if a matching employee master could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeMaster fetchByuserId(long userId, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { userId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_USERID,
					finderArgs, this);
		}

		if (result instanceof EmployeeMaster) {
			EmployeeMaster employeeMaster = (EmployeeMaster)result;

			if ((userId != employeeMaster.getUserId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_EMPLOYEEMASTER_WHERE);

			query.append(_FINDER_COLUMN_USERID_USERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				List<EmployeeMaster> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_USERID,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"EmployeeMasterPersistenceImpl.fetchByuserId(long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					EmployeeMaster employeeMaster = list.get(0);

					result = employeeMaster;

					cacheResult(employeeMaster);

					if ((employeeMaster.getUserId() != userId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_USERID,
							finderArgs, employeeMaster);
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
			return (EmployeeMaster)result;
		}
	}

	/**
	 * Removes the employee master where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @return the employee master that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeMaster removeByuserId(long userId)
		throws NoSuchEmployeeMasterException, SystemException {
		EmployeeMaster employeeMaster = findByuserId(userId);

		return remove(employeeMaster);
	}

	/**
	 * Returns the number of employee masters where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching employee masters
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

			query.append(_SQL_COUNT_EMPLOYEEMASTER_WHERE);

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

	private static final String _FINDER_COLUMN_USERID_USERID_2 = "employeeMaster.userId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CREATEBY = new FinderPath(EmployeeMasterModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeMasterModelImpl.FINDER_CACHE_ENABLED,
			EmployeeMasterImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBycreateBy",
			new String[] {
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CREATEBY =
		new FinderPath(EmployeeMasterModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeMasterModelImpl.FINDER_CACHE_ENABLED,
			EmployeeMasterImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBycreateBy",
			new String[] { Integer.class.getName() },
			EmployeeMasterModelImpl.CREATEBY_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CREATEBY = new FinderPath(EmployeeMasterModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeMasterModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBycreateBy",
			new String[] { Integer.class.getName() });

	/**
	 * Returns all the employee masters where createBy = &#63;.
	 *
	 * @param createBy the create by
	 * @return the matching employee masters
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EmployeeMaster> findBycreateBy(int createBy)
		throws SystemException {
		return findBycreateBy(createBy, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the employee masters where createBy = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param createBy the create by
	 * @param start the lower bound of the range of employee masters
	 * @param end the upper bound of the range of employee masters (not inclusive)
	 * @return the range of matching employee masters
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EmployeeMaster> findBycreateBy(int createBy, int start, int end)
		throws SystemException {
		return findBycreateBy(createBy, start, end, null);
	}

	/**
	 * Returns an ordered range of all the employee masters where createBy = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param createBy the create by
	 * @param start the lower bound of the range of employee masters
	 * @param end the upper bound of the range of employee masters (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching employee masters
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EmployeeMaster> findBycreateBy(int createBy, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CREATEBY;
			finderArgs = new Object[] { createBy };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CREATEBY;
			finderArgs = new Object[] { createBy, start, end, orderByComparator };
		}

		List<EmployeeMaster> list = (List<EmployeeMaster>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (EmployeeMaster employeeMaster : list) {
				if ((createBy != employeeMaster.getCreateBy())) {
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

			query.append(_SQL_SELECT_EMPLOYEEMASTER_WHERE);

			query.append(_FINDER_COLUMN_CREATEBY_CREATEBY_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(EmployeeMasterModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(createBy);

				if (!pagination) {
					list = (List<EmployeeMaster>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<EmployeeMaster>(list);
				}
				else {
					list = (List<EmployeeMaster>)QueryUtil.list(q,
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
	 * Returns the first employee master in the ordered set where createBy = &#63;.
	 *
	 * @param createBy the create by
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching employee master
	 * @throws com.hrms.NoSuchEmployeeMasterException if a matching employee master could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeMaster findBycreateBy_First(int createBy,
		OrderByComparator orderByComparator)
		throws NoSuchEmployeeMasterException, SystemException {
		EmployeeMaster employeeMaster = fetchBycreateBy_First(createBy,
				orderByComparator);

		if (employeeMaster != null) {
			return employeeMaster;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("createBy=");
		msg.append(createBy);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchEmployeeMasterException(msg.toString());
	}

	/**
	 * Returns the first employee master in the ordered set where createBy = &#63;.
	 *
	 * @param createBy the create by
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching employee master, or <code>null</code> if a matching employee master could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeMaster fetchBycreateBy_First(int createBy,
		OrderByComparator orderByComparator) throws SystemException {
		List<EmployeeMaster> list = findBycreateBy(createBy, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last employee master in the ordered set where createBy = &#63;.
	 *
	 * @param createBy the create by
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching employee master
	 * @throws com.hrms.NoSuchEmployeeMasterException if a matching employee master could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeMaster findBycreateBy_Last(int createBy,
		OrderByComparator orderByComparator)
		throws NoSuchEmployeeMasterException, SystemException {
		EmployeeMaster employeeMaster = fetchBycreateBy_Last(createBy,
				orderByComparator);

		if (employeeMaster != null) {
			return employeeMaster;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("createBy=");
		msg.append(createBy);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchEmployeeMasterException(msg.toString());
	}

	/**
	 * Returns the last employee master in the ordered set where createBy = &#63;.
	 *
	 * @param createBy the create by
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching employee master, or <code>null</code> if a matching employee master could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeMaster fetchBycreateBy_Last(int createBy,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countBycreateBy(createBy);

		if (count == 0) {
			return null;
		}

		List<EmployeeMaster> list = findBycreateBy(createBy, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the employee masters before and after the current employee master in the ordered set where createBy = &#63;.
	 *
	 * @param employeeMasterId the primary key of the current employee master
	 * @param createBy the create by
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next employee master
	 * @throws com.hrms.NoSuchEmployeeMasterException if a employee master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeMaster[] findBycreateBy_PrevAndNext(long employeeMasterId,
		int createBy, OrderByComparator orderByComparator)
		throws NoSuchEmployeeMasterException, SystemException {
		EmployeeMaster employeeMaster = findByPrimaryKey(employeeMasterId);

		Session session = null;

		try {
			session = openSession();

			EmployeeMaster[] array = new EmployeeMasterImpl[3];

			array[0] = getBycreateBy_PrevAndNext(session, employeeMaster,
					createBy, orderByComparator, true);

			array[1] = employeeMaster;

			array[2] = getBycreateBy_PrevAndNext(session, employeeMaster,
					createBy, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected EmployeeMaster getBycreateBy_PrevAndNext(Session session,
		EmployeeMaster employeeMaster, int createBy,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_EMPLOYEEMASTER_WHERE);

		query.append(_FINDER_COLUMN_CREATEBY_CREATEBY_2);

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
			query.append(EmployeeMasterModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(createBy);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(employeeMaster);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<EmployeeMaster> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the employee masters where createBy = &#63; from the database.
	 *
	 * @param createBy the create by
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBycreateBy(int createBy) throws SystemException {
		for (EmployeeMaster employeeMaster : findBycreateBy(createBy,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(employeeMaster);
		}
	}

	/**
	 * Returns the number of employee masters where createBy = &#63;.
	 *
	 * @param createBy the create by
	 * @return the number of matching employee masters
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBycreateBy(int createBy) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CREATEBY;

		Object[] finderArgs = new Object[] { createBy };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_EMPLOYEEMASTER_WHERE);

			query.append(_FINDER_COLUMN_CREATEBY_CREATEBY_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(createBy);

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

	private static final String _FINDER_COLUMN_CREATEBY_CREATEBY_2 = "employeeMaster.createBy = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_MODIFIEDBY =
		new FinderPath(EmployeeMasterModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeMasterModelImpl.FINDER_CACHE_ENABLED,
			EmployeeMasterImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBymodifiedBy",
			new String[] {
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MODIFIEDBY =
		new FinderPath(EmployeeMasterModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeMasterModelImpl.FINDER_CACHE_ENABLED,
			EmployeeMasterImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBymodifiedBy",
			new String[] { Integer.class.getName() },
			EmployeeMasterModelImpl.MODIFIEDBY_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_MODIFIEDBY = new FinderPath(EmployeeMasterModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeMasterModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBymodifiedBy",
			new String[] { Integer.class.getName() });

	/**
	 * Returns all the employee masters where modifiedBy = &#63;.
	 *
	 * @param modifiedBy the modified by
	 * @return the matching employee masters
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EmployeeMaster> findBymodifiedBy(int modifiedBy)
		throws SystemException {
		return findBymodifiedBy(modifiedBy, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the employee masters where modifiedBy = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param modifiedBy the modified by
	 * @param start the lower bound of the range of employee masters
	 * @param end the upper bound of the range of employee masters (not inclusive)
	 * @return the range of matching employee masters
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EmployeeMaster> findBymodifiedBy(int modifiedBy, int start,
		int end) throws SystemException {
		return findBymodifiedBy(modifiedBy, start, end, null);
	}

	/**
	 * Returns an ordered range of all the employee masters where modifiedBy = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param modifiedBy the modified by
	 * @param start the lower bound of the range of employee masters
	 * @param end the upper bound of the range of employee masters (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching employee masters
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EmployeeMaster> findBymodifiedBy(int modifiedBy, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MODIFIEDBY;
			finderArgs = new Object[] { modifiedBy };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_MODIFIEDBY;
			finderArgs = new Object[] { modifiedBy, start, end, orderByComparator };
		}

		List<EmployeeMaster> list = (List<EmployeeMaster>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (EmployeeMaster employeeMaster : list) {
				if ((modifiedBy != employeeMaster.getModifiedBy())) {
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

			query.append(_SQL_SELECT_EMPLOYEEMASTER_WHERE);

			query.append(_FINDER_COLUMN_MODIFIEDBY_MODIFIEDBY_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(EmployeeMasterModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(modifiedBy);

				if (!pagination) {
					list = (List<EmployeeMaster>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<EmployeeMaster>(list);
				}
				else {
					list = (List<EmployeeMaster>)QueryUtil.list(q,
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
	 * Returns the first employee master in the ordered set where modifiedBy = &#63;.
	 *
	 * @param modifiedBy the modified by
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching employee master
	 * @throws com.hrms.NoSuchEmployeeMasterException if a matching employee master could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeMaster findBymodifiedBy_First(int modifiedBy,
		OrderByComparator orderByComparator)
		throws NoSuchEmployeeMasterException, SystemException {
		EmployeeMaster employeeMaster = fetchBymodifiedBy_First(modifiedBy,
				orderByComparator);

		if (employeeMaster != null) {
			return employeeMaster;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("modifiedBy=");
		msg.append(modifiedBy);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchEmployeeMasterException(msg.toString());
	}

	/**
	 * Returns the first employee master in the ordered set where modifiedBy = &#63;.
	 *
	 * @param modifiedBy the modified by
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching employee master, or <code>null</code> if a matching employee master could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeMaster fetchBymodifiedBy_First(int modifiedBy,
		OrderByComparator orderByComparator) throws SystemException {
		List<EmployeeMaster> list = findBymodifiedBy(modifiedBy, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last employee master in the ordered set where modifiedBy = &#63;.
	 *
	 * @param modifiedBy the modified by
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching employee master
	 * @throws com.hrms.NoSuchEmployeeMasterException if a matching employee master could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeMaster findBymodifiedBy_Last(int modifiedBy,
		OrderByComparator orderByComparator)
		throws NoSuchEmployeeMasterException, SystemException {
		EmployeeMaster employeeMaster = fetchBymodifiedBy_Last(modifiedBy,
				orderByComparator);

		if (employeeMaster != null) {
			return employeeMaster;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("modifiedBy=");
		msg.append(modifiedBy);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchEmployeeMasterException(msg.toString());
	}

	/**
	 * Returns the last employee master in the ordered set where modifiedBy = &#63;.
	 *
	 * @param modifiedBy the modified by
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching employee master, or <code>null</code> if a matching employee master could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeMaster fetchBymodifiedBy_Last(int modifiedBy,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countBymodifiedBy(modifiedBy);

		if (count == 0) {
			return null;
		}

		List<EmployeeMaster> list = findBymodifiedBy(modifiedBy, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the employee masters before and after the current employee master in the ordered set where modifiedBy = &#63;.
	 *
	 * @param employeeMasterId the primary key of the current employee master
	 * @param modifiedBy the modified by
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next employee master
	 * @throws com.hrms.NoSuchEmployeeMasterException if a employee master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeMaster[] findBymodifiedBy_PrevAndNext(
		long employeeMasterId, int modifiedBy,
		OrderByComparator orderByComparator)
		throws NoSuchEmployeeMasterException, SystemException {
		EmployeeMaster employeeMaster = findByPrimaryKey(employeeMasterId);

		Session session = null;

		try {
			session = openSession();

			EmployeeMaster[] array = new EmployeeMasterImpl[3];

			array[0] = getBymodifiedBy_PrevAndNext(session, employeeMaster,
					modifiedBy, orderByComparator, true);

			array[1] = employeeMaster;

			array[2] = getBymodifiedBy_PrevAndNext(session, employeeMaster,
					modifiedBy, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected EmployeeMaster getBymodifiedBy_PrevAndNext(Session session,
		EmployeeMaster employeeMaster, int modifiedBy,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_EMPLOYEEMASTER_WHERE);

		query.append(_FINDER_COLUMN_MODIFIEDBY_MODIFIEDBY_2);

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
			query.append(EmployeeMasterModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(modifiedBy);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(employeeMaster);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<EmployeeMaster> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the employee masters where modifiedBy = &#63; from the database.
	 *
	 * @param modifiedBy the modified by
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBymodifiedBy(int modifiedBy) throws SystemException {
		for (EmployeeMaster employeeMaster : findBymodifiedBy(modifiedBy,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(employeeMaster);
		}
	}

	/**
	 * Returns the number of employee masters where modifiedBy = &#63;.
	 *
	 * @param modifiedBy the modified by
	 * @return the number of matching employee masters
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBymodifiedBy(int modifiedBy) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_MODIFIEDBY;

		Object[] finderArgs = new Object[] { modifiedBy };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_EMPLOYEEMASTER_WHERE);

			query.append(_FINDER_COLUMN_MODIFIEDBY_MODIFIEDBY_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(modifiedBy);

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

	private static final String _FINDER_COLUMN_MODIFIEDBY_MODIFIEDBY_2 = "employeeMaster.modifiedBy = ?";

	public EmployeeMasterPersistenceImpl() {
		setModelClass(EmployeeMaster.class);
	}

	/**
	 * Caches the employee master in the entity cache if it is enabled.
	 *
	 * @param employeeMaster the employee master
	 */
	@Override
	public void cacheResult(EmployeeMaster employeeMaster) {
		EntityCacheUtil.putResult(EmployeeMasterModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeMasterImpl.class, employeeMaster.getPrimaryKey(),
			employeeMaster);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_USERID,
			new Object[] { employeeMaster.getUserId() }, employeeMaster);

		employeeMaster.resetOriginalValues();
	}

	/**
	 * Caches the employee masters in the entity cache if it is enabled.
	 *
	 * @param employeeMasters the employee masters
	 */
	@Override
	public void cacheResult(List<EmployeeMaster> employeeMasters) {
		for (EmployeeMaster employeeMaster : employeeMasters) {
			if (EntityCacheUtil.getResult(
						EmployeeMasterModelImpl.ENTITY_CACHE_ENABLED,
						EmployeeMasterImpl.class, employeeMaster.getPrimaryKey()) == null) {
				cacheResult(employeeMaster);
			}
			else {
				employeeMaster.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all employee masters.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(EmployeeMasterImpl.class.getName());
		}

		EntityCacheUtil.clearCache(EmployeeMasterImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the employee master.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(EmployeeMaster employeeMaster) {
		EntityCacheUtil.removeResult(EmployeeMasterModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeMasterImpl.class, employeeMaster.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(employeeMaster);
	}

	@Override
	public void clearCache(List<EmployeeMaster> employeeMasters) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (EmployeeMaster employeeMaster : employeeMasters) {
			EntityCacheUtil.removeResult(EmployeeMasterModelImpl.ENTITY_CACHE_ENABLED,
				EmployeeMasterImpl.class, employeeMaster.getPrimaryKey());

			clearUniqueFindersCache(employeeMaster);
		}
	}

	protected void cacheUniqueFindersCache(EmployeeMaster employeeMaster) {
		if (employeeMaster.isNew()) {
			Object[] args = new Object[] { employeeMaster.getUserId() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_USERID, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_USERID, args,
				employeeMaster);
		}
		else {
			EmployeeMasterModelImpl employeeMasterModelImpl = (EmployeeMasterModelImpl)employeeMaster;

			if ((employeeMasterModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_USERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { employeeMaster.getUserId() };

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_USERID, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_USERID, args,
					employeeMaster);
			}
		}
	}

	protected void clearUniqueFindersCache(EmployeeMaster employeeMaster) {
		EmployeeMasterModelImpl employeeMasterModelImpl = (EmployeeMasterModelImpl)employeeMaster;

		Object[] args = new Object[] { employeeMaster.getUserId() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_USERID, args);

		if ((employeeMasterModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_USERID.getColumnBitmask()) != 0) {
			args = new Object[] { employeeMasterModelImpl.getOriginalUserId() };

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_USERID, args);
		}
	}

	/**
	 * Creates a new employee master with the primary key. Does not add the employee master to the database.
	 *
	 * @param employeeMasterId the primary key for the new employee master
	 * @return the new employee master
	 */
	@Override
	public EmployeeMaster create(long employeeMasterId) {
		EmployeeMaster employeeMaster = new EmployeeMasterImpl();

		employeeMaster.setNew(true);
		employeeMaster.setPrimaryKey(employeeMasterId);

		return employeeMaster;
	}

	/**
	 * Removes the employee master with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param employeeMasterId the primary key of the employee master
	 * @return the employee master that was removed
	 * @throws com.hrms.NoSuchEmployeeMasterException if a employee master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeMaster remove(long employeeMasterId)
		throws NoSuchEmployeeMasterException, SystemException {
		return remove((Serializable)employeeMasterId);
	}

	/**
	 * Removes the employee master with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the employee master
	 * @return the employee master that was removed
	 * @throws com.hrms.NoSuchEmployeeMasterException if a employee master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeMaster remove(Serializable primaryKey)
		throws NoSuchEmployeeMasterException, SystemException {
		Session session = null;

		try {
			session = openSession();

			EmployeeMaster employeeMaster = (EmployeeMaster)session.get(EmployeeMasterImpl.class,
					primaryKey);

			if (employeeMaster == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchEmployeeMasterException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(employeeMaster);
		}
		catch (NoSuchEmployeeMasterException nsee) {
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
	protected EmployeeMaster removeImpl(EmployeeMaster employeeMaster)
		throws SystemException {
		employeeMaster = toUnwrappedModel(employeeMaster);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(employeeMaster)) {
				employeeMaster = (EmployeeMaster)session.get(EmployeeMasterImpl.class,
						employeeMaster.getPrimaryKeyObj());
			}

			if (employeeMaster != null) {
				session.delete(employeeMaster);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (employeeMaster != null) {
			clearCache(employeeMaster);
		}

		return employeeMaster;
	}

	@Override
	public EmployeeMaster updateImpl(
		com.hrms.model.EmployeeMaster employeeMaster) throws SystemException {
		employeeMaster = toUnwrappedModel(employeeMaster);

		boolean isNew = employeeMaster.isNew();

		EmployeeMasterModelImpl employeeMasterModelImpl = (EmployeeMasterModelImpl)employeeMaster;

		Session session = null;

		try {
			session = openSession();

			if (employeeMaster.isNew()) {
				session.save(employeeMaster);

				employeeMaster.setNew(false);
			}
			else {
				session.merge(employeeMaster);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !EmployeeMasterModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((employeeMasterModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CREATEBY.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						employeeMasterModelImpl.getOriginalCreateBy()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CREATEBY, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CREATEBY,
					args);

				args = new Object[] { employeeMasterModelImpl.getCreateBy() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CREATEBY, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CREATEBY,
					args);
			}

			if ((employeeMasterModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MODIFIEDBY.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						employeeMasterModelImpl.getOriginalModifiedBy()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MODIFIEDBY,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MODIFIEDBY,
					args);

				args = new Object[] { employeeMasterModelImpl.getModifiedBy() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MODIFIEDBY,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MODIFIEDBY,
					args);
			}
		}

		EntityCacheUtil.putResult(EmployeeMasterModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeMasterImpl.class, employeeMaster.getPrimaryKey(),
			employeeMaster);

		clearUniqueFindersCache(employeeMaster);
		cacheUniqueFindersCache(employeeMaster);

		return employeeMaster;
	}

	protected EmployeeMaster toUnwrappedModel(EmployeeMaster employeeMaster) {
		if (employeeMaster instanceof EmployeeMasterImpl) {
			return employeeMaster;
		}

		EmployeeMasterImpl employeeMasterImpl = new EmployeeMasterImpl();

		employeeMasterImpl.setNew(employeeMaster.isNew());
		employeeMasterImpl.setPrimaryKey(employeeMaster.getPrimaryKey());

		employeeMasterImpl.setEmployeeMasterId(employeeMaster.getEmployeeMasterId());
		employeeMasterImpl.setEmployeeId(employeeMaster.getEmployeeId());
		employeeMasterImpl.setUserId(employeeMaster.getUserId());
		employeeMasterImpl.setGender(employeeMaster.getGender());
		employeeMasterImpl.setDateOfBirth(employeeMaster.getDateOfBirth());
		employeeMasterImpl.setJoiningDate(employeeMaster.getJoiningDate());
		employeeMasterImpl.setLeavingDate(employeeMaster.getLeavingDate());
		employeeMasterImpl.setMaritalStatus(employeeMaster.getMaritalStatus());
		employeeMasterImpl.setNationality(employeeMaster.getNationality());
		employeeMasterImpl.setEmployeeDesignationId(employeeMaster.getEmployeeDesignationId());
		employeeMasterImpl.setEmployeeDepartmentId(employeeMaster.getEmployeeDepartmentId());
		employeeMasterImpl.setEmployeeSubDepartmentId(employeeMaster.getEmployeeSubDepartmentId());
		employeeMasterImpl.setEmployeeTypeId(employeeMaster.getEmployeeTypeId());
		employeeMasterImpl.setRecruitedOnBasisOf(employeeMaster.getRecruitedOnBasisOf());
		employeeMasterImpl.setRecruitedBy(employeeMaster.getRecruitedBy());
		employeeMasterImpl.setCreateBy(employeeMaster.getCreateBy());
		employeeMasterImpl.setModifiedBy(employeeMaster.getModifiedBy());

		return employeeMasterImpl;
	}

	/**
	 * Returns the employee master with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the employee master
	 * @return the employee master
	 * @throws com.hrms.NoSuchEmployeeMasterException if a employee master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeMaster findByPrimaryKey(Serializable primaryKey)
		throws NoSuchEmployeeMasterException, SystemException {
		EmployeeMaster employeeMaster = fetchByPrimaryKey(primaryKey);

		if (employeeMaster == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchEmployeeMasterException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return employeeMaster;
	}

	/**
	 * Returns the employee master with the primary key or throws a {@link com.hrms.NoSuchEmployeeMasterException} if it could not be found.
	 *
	 * @param employeeMasterId the primary key of the employee master
	 * @return the employee master
	 * @throws com.hrms.NoSuchEmployeeMasterException if a employee master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeMaster findByPrimaryKey(long employeeMasterId)
		throws NoSuchEmployeeMasterException, SystemException {
		return findByPrimaryKey((Serializable)employeeMasterId);
	}

	/**
	 * Returns the employee master with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the employee master
	 * @return the employee master, or <code>null</code> if a employee master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeMaster fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		EmployeeMaster employeeMaster = (EmployeeMaster)EntityCacheUtil.getResult(EmployeeMasterModelImpl.ENTITY_CACHE_ENABLED,
				EmployeeMasterImpl.class, primaryKey);

		if (employeeMaster == _nullEmployeeMaster) {
			return null;
		}

		if (employeeMaster == null) {
			Session session = null;

			try {
				session = openSession();

				employeeMaster = (EmployeeMaster)session.get(EmployeeMasterImpl.class,
						primaryKey);

				if (employeeMaster != null) {
					cacheResult(employeeMaster);
				}
				else {
					EntityCacheUtil.putResult(EmployeeMasterModelImpl.ENTITY_CACHE_ENABLED,
						EmployeeMasterImpl.class, primaryKey,
						_nullEmployeeMaster);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(EmployeeMasterModelImpl.ENTITY_CACHE_ENABLED,
					EmployeeMasterImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return employeeMaster;
	}

	/**
	 * Returns the employee master with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param employeeMasterId the primary key of the employee master
	 * @return the employee master, or <code>null</code> if a employee master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeMaster fetchByPrimaryKey(long employeeMasterId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)employeeMasterId);
	}

	/**
	 * Returns all the employee masters.
	 *
	 * @return the employee masters
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EmployeeMaster> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the employee masters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of employee masters
	 * @param end the upper bound of the range of employee masters (not inclusive)
	 * @return the range of employee masters
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EmployeeMaster> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the employee masters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of employee masters
	 * @param end the upper bound of the range of employee masters (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of employee masters
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EmployeeMaster> findAll(int start, int end,
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

		List<EmployeeMaster> list = (List<EmployeeMaster>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_EMPLOYEEMASTER);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_EMPLOYEEMASTER;

				if (pagination) {
					sql = sql.concat(EmployeeMasterModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<EmployeeMaster>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<EmployeeMaster>(list);
				}
				else {
					list = (List<EmployeeMaster>)QueryUtil.list(q,
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
	 * Removes all the employee masters from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (EmployeeMaster employeeMaster : findAll()) {
			remove(employeeMaster);
		}
	}

	/**
	 * Returns the number of employee masters.
	 *
	 * @return the number of employee masters
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

				Query q = session.createQuery(_SQL_COUNT_EMPLOYEEMASTER);

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
	 * Initializes the employee master persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.hrms.model.EmployeeMaster")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<EmployeeMaster>> listenersList = new ArrayList<ModelListener<EmployeeMaster>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<EmployeeMaster>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(EmployeeMasterImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_EMPLOYEEMASTER = "SELECT employeeMaster FROM EmployeeMaster employeeMaster";
	private static final String _SQL_SELECT_EMPLOYEEMASTER_WHERE = "SELECT employeeMaster FROM EmployeeMaster employeeMaster WHERE ";
	private static final String _SQL_COUNT_EMPLOYEEMASTER = "SELECT COUNT(employeeMaster) FROM EmployeeMaster employeeMaster";
	private static final String _SQL_COUNT_EMPLOYEEMASTER_WHERE = "SELECT COUNT(employeeMaster) FROM EmployeeMaster employeeMaster WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "employeeMaster.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No EmployeeMaster exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No EmployeeMaster exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(EmployeeMasterPersistenceImpl.class);
	private static EmployeeMaster _nullEmployeeMaster = new EmployeeMasterImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<EmployeeMaster> toCacheModel() {
				return _nullEmployeeMasterCacheModel;
			}
		};

	private static CacheModel<EmployeeMaster> _nullEmployeeMasterCacheModel = new CacheModel<EmployeeMaster>() {
			@Override
			public EmployeeMaster toEntityModel() {
				return _nullEmployeeMaster;
			}
		};
}