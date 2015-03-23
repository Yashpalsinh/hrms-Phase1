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

import com.hrms.NoSuchEmployeeAttendanceException;

import com.hrms.model.EmployeeAttendance;
import com.hrms.model.impl.EmployeeAttendanceImpl;
import com.hrms.model.impl.EmployeeAttendanceModelImpl;

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
 * The persistence implementation for the employee attendance service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author yashpalsinh
 * @see EmployeeAttendancePersistence
 * @see EmployeeAttendanceUtil
 * @generated
 */
public class EmployeeAttendancePersistenceImpl extends BasePersistenceImpl<EmployeeAttendance>
	implements EmployeeAttendancePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link EmployeeAttendanceUtil} to access the employee attendance persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = EmployeeAttendanceImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(EmployeeAttendanceModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeAttendanceModelImpl.FINDER_CACHE_ENABLED,
			EmployeeAttendanceImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(EmployeeAttendanceModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeAttendanceModelImpl.FINDER_CACHE_ENABLED,
			EmployeeAttendanceImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(EmployeeAttendanceModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeAttendanceModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CREATEBY = new FinderPath(EmployeeAttendanceModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeAttendanceModelImpl.FINDER_CACHE_ENABLED,
			EmployeeAttendanceImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBycreateBy",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CREATEBY =
		new FinderPath(EmployeeAttendanceModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeAttendanceModelImpl.FINDER_CACHE_ENABLED,
			EmployeeAttendanceImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBycreateBy",
			new String[] { Long.class.getName() },
			EmployeeAttendanceModelImpl.CREATEBY_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CREATEBY = new FinderPath(EmployeeAttendanceModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeAttendanceModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBycreateBy",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the employee attendances where createBy = &#63;.
	 *
	 * @param createBy the create by
	 * @return the matching employee attendances
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EmployeeAttendance> findBycreateBy(long createBy)
		throws SystemException {
		return findBycreateBy(createBy, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the employee attendances where createBy = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeAttendanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param createBy the create by
	 * @param start the lower bound of the range of employee attendances
	 * @param end the upper bound of the range of employee attendances (not inclusive)
	 * @return the range of matching employee attendances
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EmployeeAttendance> findBycreateBy(long createBy, int start,
		int end) throws SystemException {
		return findBycreateBy(createBy, start, end, null);
	}

	/**
	 * Returns an ordered range of all the employee attendances where createBy = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeAttendanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param createBy the create by
	 * @param start the lower bound of the range of employee attendances
	 * @param end the upper bound of the range of employee attendances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching employee attendances
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EmployeeAttendance> findBycreateBy(long createBy, int start,
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

		List<EmployeeAttendance> list = (List<EmployeeAttendance>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (EmployeeAttendance employeeAttendance : list) {
				if ((createBy != employeeAttendance.getCreateBy())) {
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

			query.append(_SQL_SELECT_EMPLOYEEATTENDANCE_WHERE);

			query.append(_FINDER_COLUMN_CREATEBY_CREATEBY_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(EmployeeAttendanceModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(createBy);

				if (!pagination) {
					list = (List<EmployeeAttendance>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<EmployeeAttendance>(list);
				}
				else {
					list = (List<EmployeeAttendance>)QueryUtil.list(q,
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
	 * Returns the first employee attendance in the ordered set where createBy = &#63;.
	 *
	 * @param createBy the create by
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching employee attendance
	 * @throws com.hrms.NoSuchEmployeeAttendanceException if a matching employee attendance could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeAttendance findBycreateBy_First(long createBy,
		OrderByComparator orderByComparator)
		throws NoSuchEmployeeAttendanceException, SystemException {
		EmployeeAttendance employeeAttendance = fetchBycreateBy_First(createBy,
				orderByComparator);

		if (employeeAttendance != null) {
			return employeeAttendance;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("createBy=");
		msg.append(createBy);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchEmployeeAttendanceException(msg.toString());
	}

	/**
	 * Returns the first employee attendance in the ordered set where createBy = &#63;.
	 *
	 * @param createBy the create by
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching employee attendance, or <code>null</code> if a matching employee attendance could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeAttendance fetchBycreateBy_First(long createBy,
		OrderByComparator orderByComparator) throws SystemException {
		List<EmployeeAttendance> list = findBycreateBy(createBy, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last employee attendance in the ordered set where createBy = &#63;.
	 *
	 * @param createBy the create by
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching employee attendance
	 * @throws com.hrms.NoSuchEmployeeAttendanceException if a matching employee attendance could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeAttendance findBycreateBy_Last(long createBy,
		OrderByComparator orderByComparator)
		throws NoSuchEmployeeAttendanceException, SystemException {
		EmployeeAttendance employeeAttendance = fetchBycreateBy_Last(createBy,
				orderByComparator);

		if (employeeAttendance != null) {
			return employeeAttendance;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("createBy=");
		msg.append(createBy);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchEmployeeAttendanceException(msg.toString());
	}

	/**
	 * Returns the last employee attendance in the ordered set where createBy = &#63;.
	 *
	 * @param createBy the create by
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching employee attendance, or <code>null</code> if a matching employee attendance could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeAttendance fetchBycreateBy_Last(long createBy,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countBycreateBy(createBy);

		if (count == 0) {
			return null;
		}

		List<EmployeeAttendance> list = findBycreateBy(createBy, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the employee attendances before and after the current employee attendance in the ordered set where createBy = &#63;.
	 *
	 * @param attendanceId the primary key of the current employee attendance
	 * @param createBy the create by
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next employee attendance
	 * @throws com.hrms.NoSuchEmployeeAttendanceException if a employee attendance with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeAttendance[] findBycreateBy_PrevAndNext(long attendanceId,
		long createBy, OrderByComparator orderByComparator)
		throws NoSuchEmployeeAttendanceException, SystemException {
		EmployeeAttendance employeeAttendance = findByPrimaryKey(attendanceId);

		Session session = null;

		try {
			session = openSession();

			EmployeeAttendance[] array = new EmployeeAttendanceImpl[3];

			array[0] = getBycreateBy_PrevAndNext(session, employeeAttendance,
					createBy, orderByComparator, true);

			array[1] = employeeAttendance;

			array[2] = getBycreateBy_PrevAndNext(session, employeeAttendance,
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

	protected EmployeeAttendance getBycreateBy_PrevAndNext(Session session,
		EmployeeAttendance employeeAttendance, long createBy,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_EMPLOYEEATTENDANCE_WHERE);

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
			query.append(EmployeeAttendanceModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(createBy);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(employeeAttendance);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<EmployeeAttendance> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the employee attendances where createBy = &#63; from the database.
	 *
	 * @param createBy the create by
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBycreateBy(long createBy) throws SystemException {
		for (EmployeeAttendance employeeAttendance : findBycreateBy(createBy,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(employeeAttendance);
		}
	}

	/**
	 * Returns the number of employee attendances where createBy = &#63;.
	 *
	 * @param createBy the create by
	 * @return the number of matching employee attendances
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBycreateBy(long createBy) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CREATEBY;

		Object[] finderArgs = new Object[] { createBy };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_EMPLOYEEATTENDANCE_WHERE);

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

	private static final String _FINDER_COLUMN_CREATEBY_CREATEBY_2 = "employeeAttendance.createBy = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_MODIFIEDBY =
		new FinderPath(EmployeeAttendanceModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeAttendanceModelImpl.FINDER_CACHE_ENABLED,
			EmployeeAttendanceImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBymodifiedBy",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MODIFIEDBY =
		new FinderPath(EmployeeAttendanceModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeAttendanceModelImpl.FINDER_CACHE_ENABLED,
			EmployeeAttendanceImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBymodifiedBy",
			new String[] { Long.class.getName() },
			EmployeeAttendanceModelImpl.MODIFIEDBY_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_MODIFIEDBY = new FinderPath(EmployeeAttendanceModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeAttendanceModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBymodifiedBy",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the employee attendances where modifiedBy = &#63;.
	 *
	 * @param modifiedBy the modified by
	 * @return the matching employee attendances
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EmployeeAttendance> findBymodifiedBy(long modifiedBy)
		throws SystemException {
		return findBymodifiedBy(modifiedBy, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the employee attendances where modifiedBy = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeAttendanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param modifiedBy the modified by
	 * @param start the lower bound of the range of employee attendances
	 * @param end the upper bound of the range of employee attendances (not inclusive)
	 * @return the range of matching employee attendances
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EmployeeAttendance> findBymodifiedBy(long modifiedBy,
		int start, int end) throws SystemException {
		return findBymodifiedBy(modifiedBy, start, end, null);
	}

	/**
	 * Returns an ordered range of all the employee attendances where modifiedBy = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeAttendanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param modifiedBy the modified by
	 * @param start the lower bound of the range of employee attendances
	 * @param end the upper bound of the range of employee attendances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching employee attendances
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EmployeeAttendance> findBymodifiedBy(long modifiedBy,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
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

		List<EmployeeAttendance> list = (List<EmployeeAttendance>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (EmployeeAttendance employeeAttendance : list) {
				if ((modifiedBy != employeeAttendance.getModifiedBy())) {
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

			query.append(_SQL_SELECT_EMPLOYEEATTENDANCE_WHERE);

			query.append(_FINDER_COLUMN_MODIFIEDBY_MODIFIEDBY_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(EmployeeAttendanceModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(modifiedBy);

				if (!pagination) {
					list = (List<EmployeeAttendance>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<EmployeeAttendance>(list);
				}
				else {
					list = (List<EmployeeAttendance>)QueryUtil.list(q,
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
	 * Returns the first employee attendance in the ordered set where modifiedBy = &#63;.
	 *
	 * @param modifiedBy the modified by
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching employee attendance
	 * @throws com.hrms.NoSuchEmployeeAttendanceException if a matching employee attendance could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeAttendance findBymodifiedBy_First(long modifiedBy,
		OrderByComparator orderByComparator)
		throws NoSuchEmployeeAttendanceException, SystemException {
		EmployeeAttendance employeeAttendance = fetchBymodifiedBy_First(modifiedBy,
				orderByComparator);

		if (employeeAttendance != null) {
			return employeeAttendance;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("modifiedBy=");
		msg.append(modifiedBy);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchEmployeeAttendanceException(msg.toString());
	}

	/**
	 * Returns the first employee attendance in the ordered set where modifiedBy = &#63;.
	 *
	 * @param modifiedBy the modified by
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching employee attendance, or <code>null</code> if a matching employee attendance could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeAttendance fetchBymodifiedBy_First(long modifiedBy,
		OrderByComparator orderByComparator) throws SystemException {
		List<EmployeeAttendance> list = findBymodifiedBy(modifiedBy, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last employee attendance in the ordered set where modifiedBy = &#63;.
	 *
	 * @param modifiedBy the modified by
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching employee attendance
	 * @throws com.hrms.NoSuchEmployeeAttendanceException if a matching employee attendance could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeAttendance findBymodifiedBy_Last(long modifiedBy,
		OrderByComparator orderByComparator)
		throws NoSuchEmployeeAttendanceException, SystemException {
		EmployeeAttendance employeeAttendance = fetchBymodifiedBy_Last(modifiedBy,
				orderByComparator);

		if (employeeAttendance != null) {
			return employeeAttendance;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("modifiedBy=");
		msg.append(modifiedBy);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchEmployeeAttendanceException(msg.toString());
	}

	/**
	 * Returns the last employee attendance in the ordered set where modifiedBy = &#63;.
	 *
	 * @param modifiedBy the modified by
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching employee attendance, or <code>null</code> if a matching employee attendance could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeAttendance fetchBymodifiedBy_Last(long modifiedBy,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countBymodifiedBy(modifiedBy);

		if (count == 0) {
			return null;
		}

		List<EmployeeAttendance> list = findBymodifiedBy(modifiedBy, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the employee attendances before and after the current employee attendance in the ordered set where modifiedBy = &#63;.
	 *
	 * @param attendanceId the primary key of the current employee attendance
	 * @param modifiedBy the modified by
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next employee attendance
	 * @throws com.hrms.NoSuchEmployeeAttendanceException if a employee attendance with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeAttendance[] findBymodifiedBy_PrevAndNext(
		long attendanceId, long modifiedBy, OrderByComparator orderByComparator)
		throws NoSuchEmployeeAttendanceException, SystemException {
		EmployeeAttendance employeeAttendance = findByPrimaryKey(attendanceId);

		Session session = null;

		try {
			session = openSession();

			EmployeeAttendance[] array = new EmployeeAttendanceImpl[3];

			array[0] = getBymodifiedBy_PrevAndNext(session, employeeAttendance,
					modifiedBy, orderByComparator, true);

			array[1] = employeeAttendance;

			array[2] = getBymodifiedBy_PrevAndNext(session, employeeAttendance,
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

	protected EmployeeAttendance getBymodifiedBy_PrevAndNext(Session session,
		EmployeeAttendance employeeAttendance, long modifiedBy,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_EMPLOYEEATTENDANCE_WHERE);

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
			query.append(EmployeeAttendanceModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(modifiedBy);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(employeeAttendance);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<EmployeeAttendance> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the employee attendances where modifiedBy = &#63; from the database.
	 *
	 * @param modifiedBy the modified by
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBymodifiedBy(long modifiedBy) throws SystemException {
		for (EmployeeAttendance employeeAttendance : findBymodifiedBy(
				modifiedBy, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(employeeAttendance);
		}
	}

	/**
	 * Returns the number of employee attendances where modifiedBy = &#63;.
	 *
	 * @param modifiedBy the modified by
	 * @return the number of matching employee attendances
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBymodifiedBy(long modifiedBy) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_MODIFIEDBY;

		Object[] finderArgs = new Object[] { modifiedBy };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_EMPLOYEEATTENDANCE_WHERE);

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

	private static final String _FINDER_COLUMN_MODIFIEDBY_MODIFIEDBY_2 = "employeeAttendance.modifiedBy = ?";

	public EmployeeAttendancePersistenceImpl() {
		setModelClass(EmployeeAttendance.class);
	}

	/**
	 * Caches the employee attendance in the entity cache if it is enabled.
	 *
	 * @param employeeAttendance the employee attendance
	 */
	@Override
	public void cacheResult(EmployeeAttendance employeeAttendance) {
		EntityCacheUtil.putResult(EmployeeAttendanceModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeAttendanceImpl.class, employeeAttendance.getPrimaryKey(),
			employeeAttendance);

		employeeAttendance.resetOriginalValues();
	}

	/**
	 * Caches the employee attendances in the entity cache if it is enabled.
	 *
	 * @param employeeAttendances the employee attendances
	 */
	@Override
	public void cacheResult(List<EmployeeAttendance> employeeAttendances) {
		for (EmployeeAttendance employeeAttendance : employeeAttendances) {
			if (EntityCacheUtil.getResult(
						EmployeeAttendanceModelImpl.ENTITY_CACHE_ENABLED,
						EmployeeAttendanceImpl.class,
						employeeAttendance.getPrimaryKey()) == null) {
				cacheResult(employeeAttendance);
			}
			else {
				employeeAttendance.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all employee attendances.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(EmployeeAttendanceImpl.class.getName());
		}

		EntityCacheUtil.clearCache(EmployeeAttendanceImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the employee attendance.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(EmployeeAttendance employeeAttendance) {
		EntityCacheUtil.removeResult(EmployeeAttendanceModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeAttendanceImpl.class, employeeAttendance.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<EmployeeAttendance> employeeAttendances) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (EmployeeAttendance employeeAttendance : employeeAttendances) {
			EntityCacheUtil.removeResult(EmployeeAttendanceModelImpl.ENTITY_CACHE_ENABLED,
				EmployeeAttendanceImpl.class, employeeAttendance.getPrimaryKey());
		}
	}

	/**
	 * Creates a new employee attendance with the primary key. Does not add the employee attendance to the database.
	 *
	 * @param attendanceId the primary key for the new employee attendance
	 * @return the new employee attendance
	 */
	@Override
	public EmployeeAttendance create(long attendanceId) {
		EmployeeAttendance employeeAttendance = new EmployeeAttendanceImpl();

		employeeAttendance.setNew(true);
		employeeAttendance.setPrimaryKey(attendanceId);

		return employeeAttendance;
	}

	/**
	 * Removes the employee attendance with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param attendanceId the primary key of the employee attendance
	 * @return the employee attendance that was removed
	 * @throws com.hrms.NoSuchEmployeeAttendanceException if a employee attendance with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeAttendance remove(long attendanceId)
		throws NoSuchEmployeeAttendanceException, SystemException {
		return remove((Serializable)attendanceId);
	}

	/**
	 * Removes the employee attendance with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the employee attendance
	 * @return the employee attendance that was removed
	 * @throws com.hrms.NoSuchEmployeeAttendanceException if a employee attendance with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeAttendance remove(Serializable primaryKey)
		throws NoSuchEmployeeAttendanceException, SystemException {
		Session session = null;

		try {
			session = openSession();

			EmployeeAttendance employeeAttendance = (EmployeeAttendance)session.get(EmployeeAttendanceImpl.class,
					primaryKey);

			if (employeeAttendance == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchEmployeeAttendanceException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(employeeAttendance);
		}
		catch (NoSuchEmployeeAttendanceException nsee) {
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
	protected EmployeeAttendance removeImpl(
		EmployeeAttendance employeeAttendance) throws SystemException {
		employeeAttendance = toUnwrappedModel(employeeAttendance);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(employeeAttendance)) {
				employeeAttendance = (EmployeeAttendance)session.get(EmployeeAttendanceImpl.class,
						employeeAttendance.getPrimaryKeyObj());
			}

			if (employeeAttendance != null) {
				session.delete(employeeAttendance);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (employeeAttendance != null) {
			clearCache(employeeAttendance);
		}

		return employeeAttendance;
	}

	@Override
	public EmployeeAttendance updateImpl(
		com.hrms.model.EmployeeAttendance employeeAttendance)
		throws SystemException {
		employeeAttendance = toUnwrappedModel(employeeAttendance);

		boolean isNew = employeeAttendance.isNew();

		EmployeeAttendanceModelImpl employeeAttendanceModelImpl = (EmployeeAttendanceModelImpl)employeeAttendance;

		Session session = null;

		try {
			session = openSession();

			if (employeeAttendance.isNew()) {
				session.save(employeeAttendance);

				employeeAttendance.setNew(false);
			}
			else {
				session.merge(employeeAttendance);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !EmployeeAttendanceModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((employeeAttendanceModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CREATEBY.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						employeeAttendanceModelImpl.getOriginalCreateBy()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CREATEBY, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CREATEBY,
					args);

				args = new Object[] { employeeAttendanceModelImpl.getCreateBy() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CREATEBY, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CREATEBY,
					args);
			}

			if ((employeeAttendanceModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MODIFIEDBY.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						employeeAttendanceModelImpl.getOriginalModifiedBy()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MODIFIEDBY,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MODIFIEDBY,
					args);

				args = new Object[] { employeeAttendanceModelImpl.getModifiedBy() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MODIFIEDBY,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MODIFIEDBY,
					args);
			}
		}

		EntityCacheUtil.putResult(EmployeeAttendanceModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeAttendanceImpl.class, employeeAttendance.getPrimaryKey(),
			employeeAttendance);

		return employeeAttendance;
	}

	protected EmployeeAttendance toUnwrappedModel(
		EmployeeAttendance employeeAttendance) {
		if (employeeAttendance instanceof EmployeeAttendanceImpl) {
			return employeeAttendance;
		}

		EmployeeAttendanceImpl employeeAttendanceImpl = new EmployeeAttendanceImpl();

		employeeAttendanceImpl.setNew(employeeAttendance.isNew());
		employeeAttendanceImpl.setPrimaryKey(employeeAttendance.getPrimaryKey());

		employeeAttendanceImpl.setAttendanceId(employeeAttendance.getAttendanceId());
		employeeAttendanceImpl.setUserId(employeeAttendance.getUserId());
		employeeAttendanceImpl.setGroupId(employeeAttendance.getGroupId());
		employeeAttendanceImpl.setCompanyId(employeeAttendance.getCompanyId());
		employeeAttendanceImpl.setAttendanceDate(employeeAttendance.getAttendanceDate());
		employeeAttendanceImpl.setSigninTime(employeeAttendance.getSigninTime());
		employeeAttendanceImpl.setSignoutTime(employeeAttendance.getSignoutTime());
		employeeAttendanceImpl.setTotalTime(employeeAttendance.getTotalTime());
		employeeAttendanceImpl.setApproved(employeeAttendance.isApproved());
		employeeAttendanceImpl.setApprovedBy(employeeAttendance.getApprovedBy());
		employeeAttendanceImpl.setCreateDate(employeeAttendance.getCreateDate());
		employeeAttendanceImpl.setModifiedDate(employeeAttendance.getModifiedDate());
		employeeAttendanceImpl.setCreateBy(employeeAttendance.getCreateBy());
		employeeAttendanceImpl.setModifiedBy(employeeAttendance.getModifiedBy());

		return employeeAttendanceImpl;
	}

	/**
	 * Returns the employee attendance with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the employee attendance
	 * @return the employee attendance
	 * @throws com.hrms.NoSuchEmployeeAttendanceException if a employee attendance with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeAttendance findByPrimaryKey(Serializable primaryKey)
		throws NoSuchEmployeeAttendanceException, SystemException {
		EmployeeAttendance employeeAttendance = fetchByPrimaryKey(primaryKey);

		if (employeeAttendance == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchEmployeeAttendanceException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return employeeAttendance;
	}

	/**
	 * Returns the employee attendance with the primary key or throws a {@link com.hrms.NoSuchEmployeeAttendanceException} if it could not be found.
	 *
	 * @param attendanceId the primary key of the employee attendance
	 * @return the employee attendance
	 * @throws com.hrms.NoSuchEmployeeAttendanceException if a employee attendance with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeAttendance findByPrimaryKey(long attendanceId)
		throws NoSuchEmployeeAttendanceException, SystemException {
		return findByPrimaryKey((Serializable)attendanceId);
	}

	/**
	 * Returns the employee attendance with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the employee attendance
	 * @return the employee attendance, or <code>null</code> if a employee attendance with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeAttendance fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		EmployeeAttendance employeeAttendance = (EmployeeAttendance)EntityCacheUtil.getResult(EmployeeAttendanceModelImpl.ENTITY_CACHE_ENABLED,
				EmployeeAttendanceImpl.class, primaryKey);

		if (employeeAttendance == _nullEmployeeAttendance) {
			return null;
		}

		if (employeeAttendance == null) {
			Session session = null;

			try {
				session = openSession();

				employeeAttendance = (EmployeeAttendance)session.get(EmployeeAttendanceImpl.class,
						primaryKey);

				if (employeeAttendance != null) {
					cacheResult(employeeAttendance);
				}
				else {
					EntityCacheUtil.putResult(EmployeeAttendanceModelImpl.ENTITY_CACHE_ENABLED,
						EmployeeAttendanceImpl.class, primaryKey,
						_nullEmployeeAttendance);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(EmployeeAttendanceModelImpl.ENTITY_CACHE_ENABLED,
					EmployeeAttendanceImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return employeeAttendance;
	}

	/**
	 * Returns the employee attendance with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param attendanceId the primary key of the employee attendance
	 * @return the employee attendance, or <code>null</code> if a employee attendance with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeAttendance fetchByPrimaryKey(long attendanceId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)attendanceId);
	}

	/**
	 * Returns all the employee attendances.
	 *
	 * @return the employee attendances
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EmployeeAttendance> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the employee attendances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeAttendanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of employee attendances
	 * @param end the upper bound of the range of employee attendances (not inclusive)
	 * @return the range of employee attendances
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EmployeeAttendance> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the employee attendances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeAttendanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of employee attendances
	 * @param end the upper bound of the range of employee attendances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of employee attendances
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EmployeeAttendance> findAll(int start, int end,
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

		List<EmployeeAttendance> list = (List<EmployeeAttendance>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_EMPLOYEEATTENDANCE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_EMPLOYEEATTENDANCE;

				if (pagination) {
					sql = sql.concat(EmployeeAttendanceModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<EmployeeAttendance>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<EmployeeAttendance>(list);
				}
				else {
					list = (List<EmployeeAttendance>)QueryUtil.list(q,
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
	 * Removes all the employee attendances from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (EmployeeAttendance employeeAttendance : findAll()) {
			remove(employeeAttendance);
		}
	}

	/**
	 * Returns the number of employee attendances.
	 *
	 * @return the number of employee attendances
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

				Query q = session.createQuery(_SQL_COUNT_EMPLOYEEATTENDANCE);

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
	 * Initializes the employee attendance persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.hrms.model.EmployeeAttendance")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<EmployeeAttendance>> listenersList = new ArrayList<ModelListener<EmployeeAttendance>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<EmployeeAttendance>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(EmployeeAttendanceImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_EMPLOYEEATTENDANCE = "SELECT employeeAttendance FROM EmployeeAttendance employeeAttendance";
	private static final String _SQL_SELECT_EMPLOYEEATTENDANCE_WHERE = "SELECT employeeAttendance FROM EmployeeAttendance employeeAttendance WHERE ";
	private static final String _SQL_COUNT_EMPLOYEEATTENDANCE = "SELECT COUNT(employeeAttendance) FROM EmployeeAttendance employeeAttendance";
	private static final String _SQL_COUNT_EMPLOYEEATTENDANCE_WHERE = "SELECT COUNT(employeeAttendance) FROM EmployeeAttendance employeeAttendance WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "employeeAttendance.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No EmployeeAttendance exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No EmployeeAttendance exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(EmployeeAttendancePersistenceImpl.class);
	private static EmployeeAttendance _nullEmployeeAttendance = new EmployeeAttendanceImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<EmployeeAttendance> toCacheModel() {
				return _nullEmployeeAttendanceCacheModel;
			}
		};

	private static CacheModel<EmployeeAttendance> _nullEmployeeAttendanceCacheModel =
		new CacheModel<EmployeeAttendance>() {
			@Override
			public EmployeeAttendance toEntityModel() {
				return _nullEmployeeAttendance;
			}
		};
}