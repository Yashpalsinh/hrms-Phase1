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

import com.hrms.NoSuchEmployeeTimesheetException;

import com.hrms.model.EmployeeTimesheet;
import com.hrms.model.impl.EmployeeTimesheetImpl;
import com.hrms.model.impl.EmployeeTimesheetModelImpl;

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
 * The persistence implementation for the employee timesheet service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author yashpalsinh
 * @see EmployeeTimesheetPersistence
 * @see EmployeeTimesheetUtil
 * @generated
 */
public class EmployeeTimesheetPersistenceImpl extends BasePersistenceImpl<EmployeeTimesheet>
	implements EmployeeTimesheetPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link EmployeeTimesheetUtil} to access the employee timesheet persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = EmployeeTimesheetImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(EmployeeTimesheetModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeTimesheetModelImpl.FINDER_CACHE_ENABLED,
			EmployeeTimesheetImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(EmployeeTimesheetModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeTimesheetModelImpl.FINDER_CACHE_ENABLED,
			EmployeeTimesheetImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(EmployeeTimesheetModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeTimesheetModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CREATEBY = new FinderPath(EmployeeTimesheetModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeTimesheetModelImpl.FINDER_CACHE_ENABLED,
			EmployeeTimesheetImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBycreateBy",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CREATEBY =
		new FinderPath(EmployeeTimesheetModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeTimesheetModelImpl.FINDER_CACHE_ENABLED,
			EmployeeTimesheetImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBycreateBy",
			new String[] { Long.class.getName() },
			EmployeeTimesheetModelImpl.CREATEBY_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CREATEBY = new FinderPath(EmployeeTimesheetModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeTimesheetModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBycreateBy",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the employee timesheets where createBy = &#63;.
	 *
	 * @param createBy the create by
	 * @return the matching employee timesheets
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EmployeeTimesheet> findBycreateBy(long createBy)
		throws SystemException {
		return findBycreateBy(createBy, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the employee timesheets where createBy = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeTimesheetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param createBy the create by
	 * @param start the lower bound of the range of employee timesheets
	 * @param end the upper bound of the range of employee timesheets (not inclusive)
	 * @return the range of matching employee timesheets
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EmployeeTimesheet> findBycreateBy(long createBy, int start,
		int end) throws SystemException {
		return findBycreateBy(createBy, start, end, null);
	}

	/**
	 * Returns an ordered range of all the employee timesheets where createBy = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeTimesheetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param createBy the create by
	 * @param start the lower bound of the range of employee timesheets
	 * @param end the upper bound of the range of employee timesheets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching employee timesheets
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EmployeeTimesheet> findBycreateBy(long createBy, int start,
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

		List<EmployeeTimesheet> list = (List<EmployeeTimesheet>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (EmployeeTimesheet employeeTimesheet : list) {
				if ((createBy != employeeTimesheet.getCreateBy())) {
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

			query.append(_SQL_SELECT_EMPLOYEETIMESHEET_WHERE);

			query.append(_FINDER_COLUMN_CREATEBY_CREATEBY_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(EmployeeTimesheetModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(createBy);

				if (!pagination) {
					list = (List<EmployeeTimesheet>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<EmployeeTimesheet>(list);
				}
				else {
					list = (List<EmployeeTimesheet>)QueryUtil.list(q,
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
	 * Returns the first employee timesheet in the ordered set where createBy = &#63;.
	 *
	 * @param createBy the create by
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching employee timesheet
	 * @throws com.hrms.NoSuchEmployeeTimesheetException if a matching employee timesheet could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeTimesheet findBycreateBy_First(long createBy,
		OrderByComparator orderByComparator)
		throws NoSuchEmployeeTimesheetException, SystemException {
		EmployeeTimesheet employeeTimesheet = fetchBycreateBy_First(createBy,
				orderByComparator);

		if (employeeTimesheet != null) {
			return employeeTimesheet;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("createBy=");
		msg.append(createBy);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchEmployeeTimesheetException(msg.toString());
	}

	/**
	 * Returns the first employee timesheet in the ordered set where createBy = &#63;.
	 *
	 * @param createBy the create by
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching employee timesheet, or <code>null</code> if a matching employee timesheet could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeTimesheet fetchBycreateBy_First(long createBy,
		OrderByComparator orderByComparator) throws SystemException {
		List<EmployeeTimesheet> list = findBycreateBy(createBy, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last employee timesheet in the ordered set where createBy = &#63;.
	 *
	 * @param createBy the create by
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching employee timesheet
	 * @throws com.hrms.NoSuchEmployeeTimesheetException if a matching employee timesheet could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeTimesheet findBycreateBy_Last(long createBy,
		OrderByComparator orderByComparator)
		throws NoSuchEmployeeTimesheetException, SystemException {
		EmployeeTimesheet employeeTimesheet = fetchBycreateBy_Last(createBy,
				orderByComparator);

		if (employeeTimesheet != null) {
			return employeeTimesheet;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("createBy=");
		msg.append(createBy);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchEmployeeTimesheetException(msg.toString());
	}

	/**
	 * Returns the last employee timesheet in the ordered set where createBy = &#63;.
	 *
	 * @param createBy the create by
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching employee timesheet, or <code>null</code> if a matching employee timesheet could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeTimesheet fetchBycreateBy_Last(long createBy,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countBycreateBy(createBy);

		if (count == 0) {
			return null;
		}

		List<EmployeeTimesheet> list = findBycreateBy(createBy, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the employee timesheets before and after the current employee timesheet in the ordered set where createBy = &#63;.
	 *
	 * @param timesheetId the primary key of the current employee timesheet
	 * @param createBy the create by
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next employee timesheet
	 * @throws com.hrms.NoSuchEmployeeTimesheetException if a employee timesheet with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeTimesheet[] findBycreateBy_PrevAndNext(long timesheetId,
		long createBy, OrderByComparator orderByComparator)
		throws NoSuchEmployeeTimesheetException, SystemException {
		EmployeeTimesheet employeeTimesheet = findByPrimaryKey(timesheetId);

		Session session = null;

		try {
			session = openSession();

			EmployeeTimesheet[] array = new EmployeeTimesheetImpl[3];

			array[0] = getBycreateBy_PrevAndNext(session, employeeTimesheet,
					createBy, orderByComparator, true);

			array[1] = employeeTimesheet;

			array[2] = getBycreateBy_PrevAndNext(session, employeeTimesheet,
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

	protected EmployeeTimesheet getBycreateBy_PrevAndNext(Session session,
		EmployeeTimesheet employeeTimesheet, long createBy,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_EMPLOYEETIMESHEET_WHERE);

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
			query.append(EmployeeTimesheetModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(createBy);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(employeeTimesheet);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<EmployeeTimesheet> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the employee timesheets where createBy = &#63; from the database.
	 *
	 * @param createBy the create by
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBycreateBy(long createBy) throws SystemException {
		for (EmployeeTimesheet employeeTimesheet : findBycreateBy(createBy,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(employeeTimesheet);
		}
	}

	/**
	 * Returns the number of employee timesheets where createBy = &#63;.
	 *
	 * @param createBy the create by
	 * @return the number of matching employee timesheets
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

			query.append(_SQL_COUNT_EMPLOYEETIMESHEET_WHERE);

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

	private static final String _FINDER_COLUMN_CREATEBY_CREATEBY_2 = "employeeTimesheet.createBy = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_MODIFIEDBY =
		new FinderPath(EmployeeTimesheetModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeTimesheetModelImpl.FINDER_CACHE_ENABLED,
			EmployeeTimesheetImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBymodifiedBy",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MODIFIEDBY =
		new FinderPath(EmployeeTimesheetModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeTimesheetModelImpl.FINDER_CACHE_ENABLED,
			EmployeeTimesheetImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBymodifiedBy",
			new String[] { Long.class.getName() },
			EmployeeTimesheetModelImpl.MODIFIEDBY_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_MODIFIEDBY = new FinderPath(EmployeeTimesheetModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeTimesheetModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBymodifiedBy",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the employee timesheets where modifiedBy = &#63;.
	 *
	 * @param modifiedBy the modified by
	 * @return the matching employee timesheets
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EmployeeTimesheet> findBymodifiedBy(long modifiedBy)
		throws SystemException {
		return findBymodifiedBy(modifiedBy, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the employee timesheets where modifiedBy = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeTimesheetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param modifiedBy the modified by
	 * @param start the lower bound of the range of employee timesheets
	 * @param end the upper bound of the range of employee timesheets (not inclusive)
	 * @return the range of matching employee timesheets
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EmployeeTimesheet> findBymodifiedBy(long modifiedBy, int start,
		int end) throws SystemException {
		return findBymodifiedBy(modifiedBy, start, end, null);
	}

	/**
	 * Returns an ordered range of all the employee timesheets where modifiedBy = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeTimesheetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param modifiedBy the modified by
	 * @param start the lower bound of the range of employee timesheets
	 * @param end the upper bound of the range of employee timesheets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching employee timesheets
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EmployeeTimesheet> findBymodifiedBy(long modifiedBy, int start,
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

		List<EmployeeTimesheet> list = (List<EmployeeTimesheet>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (EmployeeTimesheet employeeTimesheet : list) {
				if ((modifiedBy != employeeTimesheet.getModifiedBy())) {
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

			query.append(_SQL_SELECT_EMPLOYEETIMESHEET_WHERE);

			query.append(_FINDER_COLUMN_MODIFIEDBY_MODIFIEDBY_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(EmployeeTimesheetModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(modifiedBy);

				if (!pagination) {
					list = (List<EmployeeTimesheet>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<EmployeeTimesheet>(list);
				}
				else {
					list = (List<EmployeeTimesheet>)QueryUtil.list(q,
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
	 * Returns the first employee timesheet in the ordered set where modifiedBy = &#63;.
	 *
	 * @param modifiedBy the modified by
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching employee timesheet
	 * @throws com.hrms.NoSuchEmployeeTimesheetException if a matching employee timesheet could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeTimesheet findBymodifiedBy_First(long modifiedBy,
		OrderByComparator orderByComparator)
		throws NoSuchEmployeeTimesheetException, SystemException {
		EmployeeTimesheet employeeTimesheet = fetchBymodifiedBy_First(modifiedBy,
				orderByComparator);

		if (employeeTimesheet != null) {
			return employeeTimesheet;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("modifiedBy=");
		msg.append(modifiedBy);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchEmployeeTimesheetException(msg.toString());
	}

	/**
	 * Returns the first employee timesheet in the ordered set where modifiedBy = &#63;.
	 *
	 * @param modifiedBy the modified by
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching employee timesheet, or <code>null</code> if a matching employee timesheet could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeTimesheet fetchBymodifiedBy_First(long modifiedBy,
		OrderByComparator orderByComparator) throws SystemException {
		List<EmployeeTimesheet> list = findBymodifiedBy(modifiedBy, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last employee timesheet in the ordered set where modifiedBy = &#63;.
	 *
	 * @param modifiedBy the modified by
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching employee timesheet
	 * @throws com.hrms.NoSuchEmployeeTimesheetException if a matching employee timesheet could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeTimesheet findBymodifiedBy_Last(long modifiedBy,
		OrderByComparator orderByComparator)
		throws NoSuchEmployeeTimesheetException, SystemException {
		EmployeeTimesheet employeeTimesheet = fetchBymodifiedBy_Last(modifiedBy,
				orderByComparator);

		if (employeeTimesheet != null) {
			return employeeTimesheet;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("modifiedBy=");
		msg.append(modifiedBy);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchEmployeeTimesheetException(msg.toString());
	}

	/**
	 * Returns the last employee timesheet in the ordered set where modifiedBy = &#63;.
	 *
	 * @param modifiedBy the modified by
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching employee timesheet, or <code>null</code> if a matching employee timesheet could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeTimesheet fetchBymodifiedBy_Last(long modifiedBy,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countBymodifiedBy(modifiedBy);

		if (count == 0) {
			return null;
		}

		List<EmployeeTimesheet> list = findBymodifiedBy(modifiedBy, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the employee timesheets before and after the current employee timesheet in the ordered set where modifiedBy = &#63;.
	 *
	 * @param timesheetId the primary key of the current employee timesheet
	 * @param modifiedBy the modified by
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next employee timesheet
	 * @throws com.hrms.NoSuchEmployeeTimesheetException if a employee timesheet with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeTimesheet[] findBymodifiedBy_PrevAndNext(long timesheetId,
		long modifiedBy, OrderByComparator orderByComparator)
		throws NoSuchEmployeeTimesheetException, SystemException {
		EmployeeTimesheet employeeTimesheet = findByPrimaryKey(timesheetId);

		Session session = null;

		try {
			session = openSession();

			EmployeeTimesheet[] array = new EmployeeTimesheetImpl[3];

			array[0] = getBymodifiedBy_PrevAndNext(session, employeeTimesheet,
					modifiedBy, orderByComparator, true);

			array[1] = employeeTimesheet;

			array[2] = getBymodifiedBy_PrevAndNext(session, employeeTimesheet,
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

	protected EmployeeTimesheet getBymodifiedBy_PrevAndNext(Session session,
		EmployeeTimesheet employeeTimesheet, long modifiedBy,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_EMPLOYEETIMESHEET_WHERE);

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
			query.append(EmployeeTimesheetModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(modifiedBy);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(employeeTimesheet);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<EmployeeTimesheet> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the employee timesheets where modifiedBy = &#63; from the database.
	 *
	 * @param modifiedBy the modified by
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBymodifiedBy(long modifiedBy) throws SystemException {
		for (EmployeeTimesheet employeeTimesheet : findBymodifiedBy(
				modifiedBy, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(employeeTimesheet);
		}
	}

	/**
	 * Returns the number of employee timesheets where modifiedBy = &#63;.
	 *
	 * @param modifiedBy the modified by
	 * @return the number of matching employee timesheets
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

			query.append(_SQL_COUNT_EMPLOYEETIMESHEET_WHERE);

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

	private static final String _FINDER_COLUMN_MODIFIEDBY_MODIFIEDBY_2 = "employeeTimesheet.modifiedBy = ?";

	public EmployeeTimesheetPersistenceImpl() {
		setModelClass(EmployeeTimesheet.class);
	}

	/**
	 * Caches the employee timesheet in the entity cache if it is enabled.
	 *
	 * @param employeeTimesheet the employee timesheet
	 */
	@Override
	public void cacheResult(EmployeeTimesheet employeeTimesheet) {
		EntityCacheUtil.putResult(EmployeeTimesheetModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeTimesheetImpl.class, employeeTimesheet.getPrimaryKey(),
			employeeTimesheet);

		employeeTimesheet.resetOriginalValues();
	}

	/**
	 * Caches the employee timesheets in the entity cache if it is enabled.
	 *
	 * @param employeeTimesheets the employee timesheets
	 */
	@Override
	public void cacheResult(List<EmployeeTimesheet> employeeTimesheets) {
		for (EmployeeTimesheet employeeTimesheet : employeeTimesheets) {
			if (EntityCacheUtil.getResult(
						EmployeeTimesheetModelImpl.ENTITY_CACHE_ENABLED,
						EmployeeTimesheetImpl.class,
						employeeTimesheet.getPrimaryKey()) == null) {
				cacheResult(employeeTimesheet);
			}
			else {
				employeeTimesheet.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all employee timesheets.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(EmployeeTimesheetImpl.class.getName());
		}

		EntityCacheUtil.clearCache(EmployeeTimesheetImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the employee timesheet.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(EmployeeTimesheet employeeTimesheet) {
		EntityCacheUtil.removeResult(EmployeeTimesheetModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeTimesheetImpl.class, employeeTimesheet.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<EmployeeTimesheet> employeeTimesheets) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (EmployeeTimesheet employeeTimesheet : employeeTimesheets) {
			EntityCacheUtil.removeResult(EmployeeTimesheetModelImpl.ENTITY_CACHE_ENABLED,
				EmployeeTimesheetImpl.class, employeeTimesheet.getPrimaryKey());
		}
	}

	/**
	 * Creates a new employee timesheet with the primary key. Does not add the employee timesheet to the database.
	 *
	 * @param timesheetId the primary key for the new employee timesheet
	 * @return the new employee timesheet
	 */
	@Override
	public EmployeeTimesheet create(long timesheetId) {
		EmployeeTimesheet employeeTimesheet = new EmployeeTimesheetImpl();

		employeeTimesheet.setNew(true);
		employeeTimesheet.setPrimaryKey(timesheetId);

		return employeeTimesheet;
	}

	/**
	 * Removes the employee timesheet with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param timesheetId the primary key of the employee timesheet
	 * @return the employee timesheet that was removed
	 * @throws com.hrms.NoSuchEmployeeTimesheetException if a employee timesheet with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeTimesheet remove(long timesheetId)
		throws NoSuchEmployeeTimesheetException, SystemException {
		return remove((Serializable)timesheetId);
	}

	/**
	 * Removes the employee timesheet with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the employee timesheet
	 * @return the employee timesheet that was removed
	 * @throws com.hrms.NoSuchEmployeeTimesheetException if a employee timesheet with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeTimesheet remove(Serializable primaryKey)
		throws NoSuchEmployeeTimesheetException, SystemException {
		Session session = null;

		try {
			session = openSession();

			EmployeeTimesheet employeeTimesheet = (EmployeeTimesheet)session.get(EmployeeTimesheetImpl.class,
					primaryKey);

			if (employeeTimesheet == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchEmployeeTimesheetException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(employeeTimesheet);
		}
		catch (NoSuchEmployeeTimesheetException nsee) {
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
	protected EmployeeTimesheet removeImpl(EmployeeTimesheet employeeTimesheet)
		throws SystemException {
		employeeTimesheet = toUnwrappedModel(employeeTimesheet);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(employeeTimesheet)) {
				employeeTimesheet = (EmployeeTimesheet)session.get(EmployeeTimesheetImpl.class,
						employeeTimesheet.getPrimaryKeyObj());
			}

			if (employeeTimesheet != null) {
				session.delete(employeeTimesheet);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (employeeTimesheet != null) {
			clearCache(employeeTimesheet);
		}

		return employeeTimesheet;
	}

	@Override
	public EmployeeTimesheet updateImpl(
		com.hrms.model.EmployeeTimesheet employeeTimesheet)
		throws SystemException {
		employeeTimesheet = toUnwrappedModel(employeeTimesheet);

		boolean isNew = employeeTimesheet.isNew();

		EmployeeTimesheetModelImpl employeeTimesheetModelImpl = (EmployeeTimesheetModelImpl)employeeTimesheet;

		Session session = null;

		try {
			session = openSession();

			if (employeeTimesheet.isNew()) {
				session.save(employeeTimesheet);

				employeeTimesheet.setNew(false);
			}
			else {
				session.merge(employeeTimesheet);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !EmployeeTimesheetModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((employeeTimesheetModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CREATEBY.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						employeeTimesheetModelImpl.getOriginalCreateBy()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CREATEBY, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CREATEBY,
					args);

				args = new Object[] { employeeTimesheetModelImpl.getCreateBy() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CREATEBY, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CREATEBY,
					args);
			}

			if ((employeeTimesheetModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MODIFIEDBY.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						employeeTimesheetModelImpl.getOriginalModifiedBy()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MODIFIEDBY,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MODIFIEDBY,
					args);

				args = new Object[] { employeeTimesheetModelImpl.getModifiedBy() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MODIFIEDBY,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MODIFIEDBY,
					args);
			}
		}

		EntityCacheUtil.putResult(EmployeeTimesheetModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeTimesheetImpl.class, employeeTimesheet.getPrimaryKey(),
			employeeTimesheet);

		return employeeTimesheet;
	}

	protected EmployeeTimesheet toUnwrappedModel(
		EmployeeTimesheet employeeTimesheet) {
		if (employeeTimesheet instanceof EmployeeTimesheetImpl) {
			return employeeTimesheet;
		}

		EmployeeTimesheetImpl employeeTimesheetImpl = new EmployeeTimesheetImpl();

		employeeTimesheetImpl.setNew(employeeTimesheet.isNew());
		employeeTimesheetImpl.setPrimaryKey(employeeTimesheet.getPrimaryKey());

		employeeTimesheetImpl.setTimesheetId(employeeTimesheet.getTimesheetId());
		employeeTimesheetImpl.setUserId(employeeTimesheet.getUserId());
		employeeTimesheetImpl.setGroupId(employeeTimesheet.getGroupId());
		employeeTimesheetImpl.setCompanyId(employeeTimesheet.getCompanyId());
		employeeTimesheetImpl.setTaskTitle(employeeTimesheet.getTaskTitle());
		employeeTimesheetImpl.setTaskDescription(employeeTimesheet.getTaskDescription());
		employeeTimesheetImpl.setTaskFileId(employeeTimesheet.getTaskFileId());
		employeeTimesheetImpl.setTaskFilePath(employeeTimesheet.getTaskFilePath());
		employeeTimesheetImpl.setTaskStarttime(employeeTimesheet.getTaskStarttime());
		employeeTimesheetImpl.setTaskEndtime(employeeTimesheet.getTaskEndtime());
		employeeTimesheetImpl.setTaskDate(employeeTimesheet.getTaskDate());
		employeeTimesheetImpl.setDuration(employeeTimesheet.getDuration());
		employeeTimesheetImpl.setTaskCompleted(employeeTimesheet.isTaskCompleted());
		employeeTimesheetImpl.setBillable(employeeTimesheet.isBillable());
		employeeTimesheetImpl.setBilled(employeeTimesheet.isBilled());
		employeeTimesheetImpl.setCreateDate(employeeTimesheet.getCreateDate());
		employeeTimesheetImpl.setModifiedDate(employeeTimesheet.getModifiedDate());
		employeeTimesheetImpl.setCreateBy(employeeTimesheet.getCreateBy());
		employeeTimesheetImpl.setModifiedBy(employeeTimesheet.getModifiedBy());

		return employeeTimesheetImpl;
	}

	/**
	 * Returns the employee timesheet with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the employee timesheet
	 * @return the employee timesheet
	 * @throws com.hrms.NoSuchEmployeeTimesheetException if a employee timesheet with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeTimesheet findByPrimaryKey(Serializable primaryKey)
		throws NoSuchEmployeeTimesheetException, SystemException {
		EmployeeTimesheet employeeTimesheet = fetchByPrimaryKey(primaryKey);

		if (employeeTimesheet == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchEmployeeTimesheetException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return employeeTimesheet;
	}

	/**
	 * Returns the employee timesheet with the primary key or throws a {@link com.hrms.NoSuchEmployeeTimesheetException} if it could not be found.
	 *
	 * @param timesheetId the primary key of the employee timesheet
	 * @return the employee timesheet
	 * @throws com.hrms.NoSuchEmployeeTimesheetException if a employee timesheet with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeTimesheet findByPrimaryKey(long timesheetId)
		throws NoSuchEmployeeTimesheetException, SystemException {
		return findByPrimaryKey((Serializable)timesheetId);
	}

	/**
	 * Returns the employee timesheet with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the employee timesheet
	 * @return the employee timesheet, or <code>null</code> if a employee timesheet with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeTimesheet fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		EmployeeTimesheet employeeTimesheet = (EmployeeTimesheet)EntityCacheUtil.getResult(EmployeeTimesheetModelImpl.ENTITY_CACHE_ENABLED,
				EmployeeTimesheetImpl.class, primaryKey);

		if (employeeTimesheet == _nullEmployeeTimesheet) {
			return null;
		}

		if (employeeTimesheet == null) {
			Session session = null;

			try {
				session = openSession();

				employeeTimesheet = (EmployeeTimesheet)session.get(EmployeeTimesheetImpl.class,
						primaryKey);

				if (employeeTimesheet != null) {
					cacheResult(employeeTimesheet);
				}
				else {
					EntityCacheUtil.putResult(EmployeeTimesheetModelImpl.ENTITY_CACHE_ENABLED,
						EmployeeTimesheetImpl.class, primaryKey,
						_nullEmployeeTimesheet);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(EmployeeTimesheetModelImpl.ENTITY_CACHE_ENABLED,
					EmployeeTimesheetImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return employeeTimesheet;
	}

	/**
	 * Returns the employee timesheet with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param timesheetId the primary key of the employee timesheet
	 * @return the employee timesheet, or <code>null</code> if a employee timesheet with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeTimesheet fetchByPrimaryKey(long timesheetId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)timesheetId);
	}

	/**
	 * Returns all the employee timesheets.
	 *
	 * @return the employee timesheets
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EmployeeTimesheet> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the employee timesheets.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeTimesheetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of employee timesheets
	 * @param end the upper bound of the range of employee timesheets (not inclusive)
	 * @return the range of employee timesheets
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EmployeeTimesheet> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the employee timesheets.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeTimesheetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of employee timesheets
	 * @param end the upper bound of the range of employee timesheets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of employee timesheets
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EmployeeTimesheet> findAll(int start, int end,
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

		List<EmployeeTimesheet> list = (List<EmployeeTimesheet>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_EMPLOYEETIMESHEET);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_EMPLOYEETIMESHEET;

				if (pagination) {
					sql = sql.concat(EmployeeTimesheetModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<EmployeeTimesheet>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<EmployeeTimesheet>(list);
				}
				else {
					list = (List<EmployeeTimesheet>)QueryUtil.list(q,
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
	 * Removes all the employee timesheets from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (EmployeeTimesheet employeeTimesheet : findAll()) {
			remove(employeeTimesheet);
		}
	}

	/**
	 * Returns the number of employee timesheets.
	 *
	 * @return the number of employee timesheets
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

				Query q = session.createQuery(_SQL_COUNT_EMPLOYEETIMESHEET);

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
	 * Initializes the employee timesheet persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.hrms.model.EmployeeTimesheet")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<EmployeeTimesheet>> listenersList = new ArrayList<ModelListener<EmployeeTimesheet>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<EmployeeTimesheet>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(EmployeeTimesheetImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_EMPLOYEETIMESHEET = "SELECT employeeTimesheet FROM EmployeeTimesheet employeeTimesheet";
	private static final String _SQL_SELECT_EMPLOYEETIMESHEET_WHERE = "SELECT employeeTimesheet FROM EmployeeTimesheet employeeTimesheet WHERE ";
	private static final String _SQL_COUNT_EMPLOYEETIMESHEET = "SELECT COUNT(employeeTimesheet) FROM EmployeeTimesheet employeeTimesheet";
	private static final String _SQL_COUNT_EMPLOYEETIMESHEET_WHERE = "SELECT COUNT(employeeTimesheet) FROM EmployeeTimesheet employeeTimesheet WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "employeeTimesheet.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No EmployeeTimesheet exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No EmployeeTimesheet exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(EmployeeTimesheetPersistenceImpl.class);
	private static EmployeeTimesheet _nullEmployeeTimesheet = new EmployeeTimesheetImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<EmployeeTimesheet> toCacheModel() {
				return _nullEmployeeTimesheetCacheModel;
			}
		};

	private static CacheModel<EmployeeTimesheet> _nullEmployeeTimesheetCacheModel =
		new CacheModel<EmployeeTimesheet>() {
			@Override
			public EmployeeTimesheet toEntityModel() {
				return _nullEmployeeTimesheet;
			}
		};
}