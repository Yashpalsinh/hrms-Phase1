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

import com.hrms.NoSuchEmployeeSubDepartmentException;

import com.hrms.model.EmployeeSubDepartment;
import com.hrms.model.impl.EmployeeSubDepartmentImpl;
import com.hrms.model.impl.EmployeeSubDepartmentModelImpl;

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
 * The persistence implementation for the employee sub department service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author yashpalsinh
 * @see EmployeeSubDepartmentPersistence
 * @see EmployeeSubDepartmentUtil
 * @generated
 */
public class EmployeeSubDepartmentPersistenceImpl extends BasePersistenceImpl<EmployeeSubDepartment>
	implements EmployeeSubDepartmentPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link EmployeeSubDepartmentUtil} to access the employee sub department persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = EmployeeSubDepartmentImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(EmployeeSubDepartmentModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeSubDepartmentModelImpl.FINDER_CACHE_ENABLED,
			EmployeeSubDepartmentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(EmployeeSubDepartmentModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeSubDepartmentModelImpl.FINDER_CACHE_ENABLED,
			EmployeeSubDepartmentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(EmployeeSubDepartmentModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeSubDepartmentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_EMPLOYEEDEPARTMENTID = new FinderPath(EmployeeSubDepartmentModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeSubDepartmentModelImpl.FINDER_CACHE_ENABLED,
			EmployeeSubDepartmentImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByemployeeDepartmentId",
			new String[] { Long.class.getName() },
			EmployeeSubDepartmentModelImpl.EMPLOYEEDEPARTMENTID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_EMPLOYEEDEPARTMENTID = new FinderPath(EmployeeSubDepartmentModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeSubDepartmentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByemployeeDepartmentId", new String[] { Long.class.getName() });

	/**
	 * Returns the employee sub department where employeeDepartmentId = &#63; or throws a {@link com.hrms.NoSuchEmployeeSubDepartmentException} if it could not be found.
	 *
	 * @param employeeDepartmentId the employee department ID
	 * @return the matching employee sub department
	 * @throws com.hrms.NoSuchEmployeeSubDepartmentException if a matching employee sub department could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeSubDepartment findByemployeeDepartmentId(
		long employeeDepartmentId)
		throws NoSuchEmployeeSubDepartmentException, SystemException {
		EmployeeSubDepartment employeeSubDepartment = fetchByemployeeDepartmentId(employeeDepartmentId);

		if (employeeSubDepartment == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("employeeDepartmentId=");
			msg.append(employeeDepartmentId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchEmployeeSubDepartmentException(msg.toString());
		}

		return employeeSubDepartment;
	}

	/**
	 * Returns the employee sub department where employeeDepartmentId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param employeeDepartmentId the employee department ID
	 * @return the matching employee sub department, or <code>null</code> if a matching employee sub department could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeSubDepartment fetchByemployeeDepartmentId(
		long employeeDepartmentId) throws SystemException {
		return fetchByemployeeDepartmentId(employeeDepartmentId, true);
	}

	/**
	 * Returns the employee sub department where employeeDepartmentId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param employeeDepartmentId the employee department ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching employee sub department, or <code>null</code> if a matching employee sub department could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeSubDepartment fetchByemployeeDepartmentId(
		long employeeDepartmentId, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { employeeDepartmentId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_EMPLOYEEDEPARTMENTID,
					finderArgs, this);
		}

		if (result instanceof EmployeeSubDepartment) {
			EmployeeSubDepartment employeeSubDepartment = (EmployeeSubDepartment)result;

			if ((employeeDepartmentId != employeeSubDepartment.getEmployeeDepartmentId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_EMPLOYEESUBDEPARTMENT_WHERE);

			query.append(_FINDER_COLUMN_EMPLOYEEDEPARTMENTID_EMPLOYEEDEPARTMENTID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(employeeDepartmentId);

				List<EmployeeSubDepartment> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_EMPLOYEEDEPARTMENTID,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"EmployeeSubDepartmentPersistenceImpl.fetchByemployeeDepartmentId(long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					EmployeeSubDepartment employeeSubDepartment = list.get(0);

					result = employeeSubDepartment;

					cacheResult(employeeSubDepartment);

					if ((employeeSubDepartment.getEmployeeDepartmentId() != employeeDepartmentId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_EMPLOYEEDEPARTMENTID,
							finderArgs, employeeSubDepartment);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_EMPLOYEEDEPARTMENTID,
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
			return (EmployeeSubDepartment)result;
		}
	}

	/**
	 * Removes the employee sub department where employeeDepartmentId = &#63; from the database.
	 *
	 * @param employeeDepartmentId the employee department ID
	 * @return the employee sub department that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeSubDepartment removeByemployeeDepartmentId(
		long employeeDepartmentId)
		throws NoSuchEmployeeSubDepartmentException, SystemException {
		EmployeeSubDepartment employeeSubDepartment = findByemployeeDepartmentId(employeeDepartmentId);

		return remove(employeeSubDepartment);
	}

	/**
	 * Returns the number of employee sub departments where employeeDepartmentId = &#63;.
	 *
	 * @param employeeDepartmentId the employee department ID
	 * @return the number of matching employee sub departments
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByemployeeDepartmentId(long employeeDepartmentId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_EMPLOYEEDEPARTMENTID;

		Object[] finderArgs = new Object[] { employeeDepartmentId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_EMPLOYEESUBDEPARTMENT_WHERE);

			query.append(_FINDER_COLUMN_EMPLOYEEDEPARTMENTID_EMPLOYEEDEPARTMENTID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(employeeDepartmentId);

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

	private static final String _FINDER_COLUMN_EMPLOYEEDEPARTMENTID_EMPLOYEEDEPARTMENTID_2 =
		"employeeSubDepartment.employeeDepartmentId = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_STATUS = new FinderPath(EmployeeSubDepartmentModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeSubDepartmentModelImpl.FINDER_CACHE_ENABLED,
			EmployeeSubDepartmentImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchBystatus", new String[] { Boolean.class.getName() },
			EmployeeSubDepartmentModelImpl.STATUS_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_STATUS = new FinderPath(EmployeeSubDepartmentModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeSubDepartmentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBystatus",
			new String[] { Boolean.class.getName() });

	/**
	 * Returns the employee sub department where status = &#63; or throws a {@link com.hrms.NoSuchEmployeeSubDepartmentException} if it could not be found.
	 *
	 * @param status the status
	 * @return the matching employee sub department
	 * @throws com.hrms.NoSuchEmployeeSubDepartmentException if a matching employee sub department could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeSubDepartment findBystatus(boolean status)
		throws NoSuchEmployeeSubDepartmentException, SystemException {
		EmployeeSubDepartment employeeSubDepartment = fetchBystatus(status);

		if (employeeSubDepartment == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("status=");
			msg.append(status);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchEmployeeSubDepartmentException(msg.toString());
		}

		return employeeSubDepartment;
	}

	/**
	 * Returns the employee sub department where status = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param status the status
	 * @return the matching employee sub department, or <code>null</code> if a matching employee sub department could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeSubDepartment fetchBystatus(boolean status)
		throws SystemException {
		return fetchBystatus(status, true);
	}

	/**
	 * Returns the employee sub department where status = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param status the status
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching employee sub department, or <code>null</code> if a matching employee sub department could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeSubDepartment fetchBystatus(boolean status,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { status };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_STATUS,
					finderArgs, this);
		}

		if (result instanceof EmployeeSubDepartment) {
			EmployeeSubDepartment employeeSubDepartment = (EmployeeSubDepartment)result;

			if ((status != employeeSubDepartment.getStatus())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_EMPLOYEESUBDEPARTMENT_WHERE);

			query.append(_FINDER_COLUMN_STATUS_STATUS_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(status);

				List<EmployeeSubDepartment> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_STATUS,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"EmployeeSubDepartmentPersistenceImpl.fetchBystatus(boolean, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					EmployeeSubDepartment employeeSubDepartment = list.get(0);

					result = employeeSubDepartment;

					cacheResult(employeeSubDepartment);

					if ((employeeSubDepartment.getStatus() != status)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_STATUS,
							finderArgs, employeeSubDepartment);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_STATUS,
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
			return (EmployeeSubDepartment)result;
		}
	}

	/**
	 * Removes the employee sub department where status = &#63; from the database.
	 *
	 * @param status the status
	 * @return the employee sub department that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeSubDepartment removeBystatus(boolean status)
		throws NoSuchEmployeeSubDepartmentException, SystemException {
		EmployeeSubDepartment employeeSubDepartment = findBystatus(status);

		return remove(employeeSubDepartment);
	}

	/**
	 * Returns the number of employee sub departments where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching employee sub departments
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

			query.append(_SQL_COUNT_EMPLOYEESUBDEPARTMENT_WHERE);

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

	private static final String _FINDER_COLUMN_STATUS_STATUS_2 = "employeeSubDepartment.status = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DEPTANDSTATUS =
		new FinderPath(EmployeeSubDepartmentModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeSubDepartmentModelImpl.FINDER_CACHE_ENABLED,
			EmployeeSubDepartmentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDeptAndStatus",
			new String[] {
				Long.class.getName(), Boolean.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEPTANDSTATUS =
		new FinderPath(EmployeeSubDepartmentModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeSubDepartmentModelImpl.FINDER_CACHE_ENABLED,
			EmployeeSubDepartmentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDeptAndStatus",
			new String[] { Long.class.getName(), Boolean.class.getName() },
			EmployeeSubDepartmentModelImpl.EMPLOYEEDEPARTMENTID_COLUMN_BITMASK |
			EmployeeSubDepartmentModelImpl.STATUS_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DEPTANDSTATUS = new FinderPath(EmployeeSubDepartmentModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeSubDepartmentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDeptAndStatus",
			new String[] { Long.class.getName(), Boolean.class.getName() });

	/**
	 * Returns all the employee sub departments where employeeDepartmentId = &#63; and status = &#63;.
	 *
	 * @param employeeDepartmentId the employee department ID
	 * @param status the status
	 * @return the matching employee sub departments
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EmployeeSubDepartment> findByDeptAndStatus(
		long employeeDepartmentId, boolean status) throws SystemException {
		return findByDeptAndStatus(employeeDepartmentId, status,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the employee sub departments where employeeDepartmentId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeSubDepartmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param employeeDepartmentId the employee department ID
	 * @param status the status
	 * @param start the lower bound of the range of employee sub departments
	 * @param end the upper bound of the range of employee sub departments (not inclusive)
	 * @return the range of matching employee sub departments
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EmployeeSubDepartment> findByDeptAndStatus(
		long employeeDepartmentId, boolean status, int start, int end)
		throws SystemException {
		return findByDeptAndStatus(employeeDepartmentId, status, start, end,
			null);
	}

	/**
	 * Returns an ordered range of all the employee sub departments where employeeDepartmentId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeSubDepartmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param employeeDepartmentId the employee department ID
	 * @param status the status
	 * @param start the lower bound of the range of employee sub departments
	 * @param end the upper bound of the range of employee sub departments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching employee sub departments
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EmployeeSubDepartment> findByDeptAndStatus(
		long employeeDepartmentId, boolean status, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEPTANDSTATUS;
			finderArgs = new Object[] { employeeDepartmentId, status };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DEPTANDSTATUS;
			finderArgs = new Object[] {
					employeeDepartmentId, status,
					
					start, end, orderByComparator
				};
		}

		List<EmployeeSubDepartment> list = (List<EmployeeSubDepartment>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (EmployeeSubDepartment employeeSubDepartment : list) {
				if ((employeeDepartmentId != employeeSubDepartment.getEmployeeDepartmentId()) ||
						(status != employeeSubDepartment.getStatus())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_EMPLOYEESUBDEPARTMENT_WHERE);

			query.append(_FINDER_COLUMN_DEPTANDSTATUS_EMPLOYEEDEPARTMENTID_2);

			query.append(_FINDER_COLUMN_DEPTANDSTATUS_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(EmployeeSubDepartmentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(employeeDepartmentId);

				qPos.add(status);

				if (!pagination) {
					list = (List<EmployeeSubDepartment>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<EmployeeSubDepartment>(list);
				}
				else {
					list = (List<EmployeeSubDepartment>)QueryUtil.list(q,
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
	 * Returns the first employee sub department in the ordered set where employeeDepartmentId = &#63; and status = &#63;.
	 *
	 * @param employeeDepartmentId the employee department ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching employee sub department
	 * @throws com.hrms.NoSuchEmployeeSubDepartmentException if a matching employee sub department could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeSubDepartment findByDeptAndStatus_First(
		long employeeDepartmentId, boolean status,
		OrderByComparator orderByComparator)
		throws NoSuchEmployeeSubDepartmentException, SystemException {
		EmployeeSubDepartment employeeSubDepartment = fetchByDeptAndStatus_First(employeeDepartmentId,
				status, orderByComparator);

		if (employeeSubDepartment != null) {
			return employeeSubDepartment;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("employeeDepartmentId=");
		msg.append(employeeDepartmentId);

		msg.append(", status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchEmployeeSubDepartmentException(msg.toString());
	}

	/**
	 * Returns the first employee sub department in the ordered set where employeeDepartmentId = &#63; and status = &#63;.
	 *
	 * @param employeeDepartmentId the employee department ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching employee sub department, or <code>null</code> if a matching employee sub department could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeSubDepartment fetchByDeptAndStatus_First(
		long employeeDepartmentId, boolean status,
		OrderByComparator orderByComparator) throws SystemException {
		List<EmployeeSubDepartment> list = findByDeptAndStatus(employeeDepartmentId,
				status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last employee sub department in the ordered set where employeeDepartmentId = &#63; and status = &#63;.
	 *
	 * @param employeeDepartmentId the employee department ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching employee sub department
	 * @throws com.hrms.NoSuchEmployeeSubDepartmentException if a matching employee sub department could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeSubDepartment findByDeptAndStatus_Last(
		long employeeDepartmentId, boolean status,
		OrderByComparator orderByComparator)
		throws NoSuchEmployeeSubDepartmentException, SystemException {
		EmployeeSubDepartment employeeSubDepartment = fetchByDeptAndStatus_Last(employeeDepartmentId,
				status, orderByComparator);

		if (employeeSubDepartment != null) {
			return employeeSubDepartment;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("employeeDepartmentId=");
		msg.append(employeeDepartmentId);

		msg.append(", status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchEmployeeSubDepartmentException(msg.toString());
	}

	/**
	 * Returns the last employee sub department in the ordered set where employeeDepartmentId = &#63; and status = &#63;.
	 *
	 * @param employeeDepartmentId the employee department ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching employee sub department, or <code>null</code> if a matching employee sub department could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeSubDepartment fetchByDeptAndStatus_Last(
		long employeeDepartmentId, boolean status,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByDeptAndStatus(employeeDepartmentId, status);

		if (count == 0) {
			return null;
		}

		List<EmployeeSubDepartment> list = findByDeptAndStatus(employeeDepartmentId,
				status, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the employee sub departments before and after the current employee sub department in the ordered set where employeeDepartmentId = &#63; and status = &#63;.
	 *
	 * @param employeeSubDepartmentId the primary key of the current employee sub department
	 * @param employeeDepartmentId the employee department ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next employee sub department
	 * @throws com.hrms.NoSuchEmployeeSubDepartmentException if a employee sub department with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeSubDepartment[] findByDeptAndStatus_PrevAndNext(
		long employeeSubDepartmentId, long employeeDepartmentId,
		boolean status, OrderByComparator orderByComparator)
		throws NoSuchEmployeeSubDepartmentException, SystemException {
		EmployeeSubDepartment employeeSubDepartment = findByPrimaryKey(employeeSubDepartmentId);

		Session session = null;

		try {
			session = openSession();

			EmployeeSubDepartment[] array = new EmployeeSubDepartmentImpl[3];

			array[0] = getByDeptAndStatus_PrevAndNext(session,
					employeeSubDepartment, employeeDepartmentId, status,
					orderByComparator, true);

			array[1] = employeeSubDepartment;

			array[2] = getByDeptAndStatus_PrevAndNext(session,
					employeeSubDepartment, employeeDepartmentId, status,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected EmployeeSubDepartment getByDeptAndStatus_PrevAndNext(
		Session session, EmployeeSubDepartment employeeSubDepartment,
		long employeeDepartmentId, boolean status,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_EMPLOYEESUBDEPARTMENT_WHERE);

		query.append(_FINDER_COLUMN_DEPTANDSTATUS_EMPLOYEEDEPARTMENTID_2);

		query.append(_FINDER_COLUMN_DEPTANDSTATUS_STATUS_2);

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
			query.append(EmployeeSubDepartmentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(employeeDepartmentId);

		qPos.add(status);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(employeeSubDepartment);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<EmployeeSubDepartment> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the employee sub departments where employeeDepartmentId = &#63; and status = &#63; from the database.
	 *
	 * @param employeeDepartmentId the employee department ID
	 * @param status the status
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByDeptAndStatus(long employeeDepartmentId, boolean status)
		throws SystemException {
		for (EmployeeSubDepartment employeeSubDepartment : findByDeptAndStatus(
				employeeDepartmentId, status, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(employeeSubDepartment);
		}
	}

	/**
	 * Returns the number of employee sub departments where employeeDepartmentId = &#63; and status = &#63;.
	 *
	 * @param employeeDepartmentId the employee department ID
	 * @param status the status
	 * @return the number of matching employee sub departments
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByDeptAndStatus(long employeeDepartmentId, boolean status)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DEPTANDSTATUS;

		Object[] finderArgs = new Object[] { employeeDepartmentId, status };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_EMPLOYEESUBDEPARTMENT_WHERE);

			query.append(_FINDER_COLUMN_DEPTANDSTATUS_EMPLOYEEDEPARTMENTID_2);

			query.append(_FINDER_COLUMN_DEPTANDSTATUS_STATUS_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(employeeDepartmentId);

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

	private static final String _FINDER_COLUMN_DEPTANDSTATUS_EMPLOYEEDEPARTMENTID_2 =
		"employeeSubDepartment.employeeDepartmentId = ? AND ";
	private static final String _FINDER_COLUMN_DEPTANDSTATUS_STATUS_2 = "employeeSubDepartment.status = ?";

	public EmployeeSubDepartmentPersistenceImpl() {
		setModelClass(EmployeeSubDepartment.class);
	}

	/**
	 * Caches the employee sub department in the entity cache if it is enabled.
	 *
	 * @param employeeSubDepartment the employee sub department
	 */
	@Override
	public void cacheResult(EmployeeSubDepartment employeeSubDepartment) {
		EntityCacheUtil.putResult(EmployeeSubDepartmentModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeSubDepartmentImpl.class,
			employeeSubDepartment.getPrimaryKey(), employeeSubDepartment);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_EMPLOYEEDEPARTMENTID,
			new Object[] { employeeSubDepartment.getEmployeeDepartmentId() },
			employeeSubDepartment);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_STATUS,
			new Object[] { employeeSubDepartment.getStatus() },
			employeeSubDepartment);

		employeeSubDepartment.resetOriginalValues();
	}

	/**
	 * Caches the employee sub departments in the entity cache if it is enabled.
	 *
	 * @param employeeSubDepartments the employee sub departments
	 */
	@Override
	public void cacheResult(List<EmployeeSubDepartment> employeeSubDepartments) {
		for (EmployeeSubDepartment employeeSubDepartment : employeeSubDepartments) {
			if (EntityCacheUtil.getResult(
						EmployeeSubDepartmentModelImpl.ENTITY_CACHE_ENABLED,
						EmployeeSubDepartmentImpl.class,
						employeeSubDepartment.getPrimaryKey()) == null) {
				cacheResult(employeeSubDepartment);
			}
			else {
				employeeSubDepartment.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all employee sub departments.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(EmployeeSubDepartmentImpl.class.getName());
		}

		EntityCacheUtil.clearCache(EmployeeSubDepartmentImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the employee sub department.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(EmployeeSubDepartment employeeSubDepartment) {
		EntityCacheUtil.removeResult(EmployeeSubDepartmentModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeSubDepartmentImpl.class,
			employeeSubDepartment.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(employeeSubDepartment);
	}

	@Override
	public void clearCache(List<EmployeeSubDepartment> employeeSubDepartments) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (EmployeeSubDepartment employeeSubDepartment : employeeSubDepartments) {
			EntityCacheUtil.removeResult(EmployeeSubDepartmentModelImpl.ENTITY_CACHE_ENABLED,
				EmployeeSubDepartmentImpl.class,
				employeeSubDepartment.getPrimaryKey());

			clearUniqueFindersCache(employeeSubDepartment);
		}
	}

	protected void cacheUniqueFindersCache(
		EmployeeSubDepartment employeeSubDepartment) {
		if (employeeSubDepartment.isNew()) {
			Object[] args = new Object[] {
					employeeSubDepartment.getEmployeeDepartmentId()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_EMPLOYEEDEPARTMENTID,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_EMPLOYEEDEPARTMENTID,
				args, employeeSubDepartment);

			args = new Object[] { employeeSubDepartment.getStatus() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_STATUS, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_STATUS, args,
				employeeSubDepartment);
		}
		else {
			EmployeeSubDepartmentModelImpl employeeSubDepartmentModelImpl = (EmployeeSubDepartmentModelImpl)employeeSubDepartment;

			if ((employeeSubDepartmentModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_EMPLOYEEDEPARTMENTID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						employeeSubDepartment.getEmployeeDepartmentId()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_EMPLOYEEDEPARTMENTID,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_EMPLOYEEDEPARTMENTID,
					args, employeeSubDepartment);
			}

			if ((employeeSubDepartmentModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_STATUS.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { employeeSubDepartment.getStatus() };

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_STATUS, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_STATUS, args,
					employeeSubDepartment);
			}
		}
	}

	protected void clearUniqueFindersCache(
		EmployeeSubDepartment employeeSubDepartment) {
		EmployeeSubDepartmentModelImpl employeeSubDepartmentModelImpl = (EmployeeSubDepartmentModelImpl)employeeSubDepartment;

		Object[] args = new Object[] {
				employeeSubDepartment.getEmployeeDepartmentId()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_EMPLOYEEDEPARTMENTID,
			args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_EMPLOYEEDEPARTMENTID,
			args);

		if ((employeeSubDepartmentModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_EMPLOYEEDEPARTMENTID.getColumnBitmask()) != 0) {
			args = new Object[] {
					employeeSubDepartmentModelImpl.getOriginalEmployeeDepartmentId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_EMPLOYEEDEPARTMENTID,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_EMPLOYEEDEPARTMENTID,
				args);
		}

		args = new Object[] { employeeSubDepartment.getStatus() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_STATUS, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_STATUS, args);

		if ((employeeSubDepartmentModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_STATUS.getColumnBitmask()) != 0) {
			args = new Object[] {
					employeeSubDepartmentModelImpl.getOriginalStatus()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_STATUS, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_STATUS, args);
		}
	}

	/**
	 * Creates a new employee sub department with the primary key. Does not add the employee sub department to the database.
	 *
	 * @param employeeSubDepartmentId the primary key for the new employee sub department
	 * @return the new employee sub department
	 */
	@Override
	public EmployeeSubDepartment create(long employeeSubDepartmentId) {
		EmployeeSubDepartment employeeSubDepartment = new EmployeeSubDepartmentImpl();

		employeeSubDepartment.setNew(true);
		employeeSubDepartment.setPrimaryKey(employeeSubDepartmentId);

		return employeeSubDepartment;
	}

	/**
	 * Removes the employee sub department with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param employeeSubDepartmentId the primary key of the employee sub department
	 * @return the employee sub department that was removed
	 * @throws com.hrms.NoSuchEmployeeSubDepartmentException if a employee sub department with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeSubDepartment remove(long employeeSubDepartmentId)
		throws NoSuchEmployeeSubDepartmentException, SystemException {
		return remove((Serializable)employeeSubDepartmentId);
	}

	/**
	 * Removes the employee sub department with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the employee sub department
	 * @return the employee sub department that was removed
	 * @throws com.hrms.NoSuchEmployeeSubDepartmentException if a employee sub department with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeSubDepartment remove(Serializable primaryKey)
		throws NoSuchEmployeeSubDepartmentException, SystemException {
		Session session = null;

		try {
			session = openSession();

			EmployeeSubDepartment employeeSubDepartment = (EmployeeSubDepartment)session.get(EmployeeSubDepartmentImpl.class,
					primaryKey);

			if (employeeSubDepartment == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchEmployeeSubDepartmentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(employeeSubDepartment);
		}
		catch (NoSuchEmployeeSubDepartmentException nsee) {
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
	protected EmployeeSubDepartment removeImpl(
		EmployeeSubDepartment employeeSubDepartment) throws SystemException {
		employeeSubDepartment = toUnwrappedModel(employeeSubDepartment);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(employeeSubDepartment)) {
				employeeSubDepartment = (EmployeeSubDepartment)session.get(EmployeeSubDepartmentImpl.class,
						employeeSubDepartment.getPrimaryKeyObj());
			}

			if (employeeSubDepartment != null) {
				session.delete(employeeSubDepartment);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (employeeSubDepartment != null) {
			clearCache(employeeSubDepartment);
		}

		return employeeSubDepartment;
	}

	@Override
	public EmployeeSubDepartment updateImpl(
		com.hrms.model.EmployeeSubDepartment employeeSubDepartment)
		throws SystemException {
		employeeSubDepartment = toUnwrappedModel(employeeSubDepartment);

		boolean isNew = employeeSubDepartment.isNew();

		EmployeeSubDepartmentModelImpl employeeSubDepartmentModelImpl = (EmployeeSubDepartmentModelImpl)employeeSubDepartment;

		Session session = null;

		try {
			session = openSession();

			if (employeeSubDepartment.isNew()) {
				session.save(employeeSubDepartment);

				employeeSubDepartment.setNew(false);
			}
			else {
				session.merge(employeeSubDepartment);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !EmployeeSubDepartmentModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((employeeSubDepartmentModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEPTANDSTATUS.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						employeeSubDepartmentModelImpl.getOriginalEmployeeDepartmentId(),
						employeeSubDepartmentModelImpl.getOriginalStatus()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DEPTANDSTATUS,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEPTANDSTATUS,
					args);

				args = new Object[] {
						employeeSubDepartmentModelImpl.getEmployeeDepartmentId(),
						employeeSubDepartmentModelImpl.getStatus()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DEPTANDSTATUS,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEPTANDSTATUS,
					args);
			}
		}

		EntityCacheUtil.putResult(EmployeeSubDepartmentModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeSubDepartmentImpl.class,
			employeeSubDepartment.getPrimaryKey(), employeeSubDepartment);

		clearUniqueFindersCache(employeeSubDepartment);
		cacheUniqueFindersCache(employeeSubDepartment);

		return employeeSubDepartment;
	}

	protected EmployeeSubDepartment toUnwrappedModel(
		EmployeeSubDepartment employeeSubDepartment) {
		if (employeeSubDepartment instanceof EmployeeSubDepartmentImpl) {
			return employeeSubDepartment;
		}

		EmployeeSubDepartmentImpl employeeSubDepartmentImpl = new EmployeeSubDepartmentImpl();

		employeeSubDepartmentImpl.setNew(employeeSubDepartment.isNew());
		employeeSubDepartmentImpl.setPrimaryKey(employeeSubDepartment.getPrimaryKey());

		employeeSubDepartmentImpl.setEmployeeSubDepartmentId(employeeSubDepartment.getEmployeeSubDepartmentId());
		employeeSubDepartmentImpl.setSubDepartmentName(employeeSubDepartment.getSubDepartmentName());
		employeeSubDepartmentImpl.setEmployeeDepartmentId(employeeSubDepartment.getEmployeeDepartmentId());
		employeeSubDepartmentImpl.setStatus(employeeSubDepartment.isStatus());

		return employeeSubDepartmentImpl;
	}

	/**
	 * Returns the employee sub department with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the employee sub department
	 * @return the employee sub department
	 * @throws com.hrms.NoSuchEmployeeSubDepartmentException if a employee sub department with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeSubDepartment findByPrimaryKey(Serializable primaryKey)
		throws NoSuchEmployeeSubDepartmentException, SystemException {
		EmployeeSubDepartment employeeSubDepartment = fetchByPrimaryKey(primaryKey);

		if (employeeSubDepartment == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchEmployeeSubDepartmentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return employeeSubDepartment;
	}

	/**
	 * Returns the employee sub department with the primary key or throws a {@link com.hrms.NoSuchEmployeeSubDepartmentException} if it could not be found.
	 *
	 * @param employeeSubDepartmentId the primary key of the employee sub department
	 * @return the employee sub department
	 * @throws com.hrms.NoSuchEmployeeSubDepartmentException if a employee sub department with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeSubDepartment findByPrimaryKey(long employeeSubDepartmentId)
		throws NoSuchEmployeeSubDepartmentException, SystemException {
		return findByPrimaryKey((Serializable)employeeSubDepartmentId);
	}

	/**
	 * Returns the employee sub department with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the employee sub department
	 * @return the employee sub department, or <code>null</code> if a employee sub department with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeSubDepartment fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		EmployeeSubDepartment employeeSubDepartment = (EmployeeSubDepartment)EntityCacheUtil.getResult(EmployeeSubDepartmentModelImpl.ENTITY_CACHE_ENABLED,
				EmployeeSubDepartmentImpl.class, primaryKey);

		if (employeeSubDepartment == _nullEmployeeSubDepartment) {
			return null;
		}

		if (employeeSubDepartment == null) {
			Session session = null;

			try {
				session = openSession();

				employeeSubDepartment = (EmployeeSubDepartment)session.get(EmployeeSubDepartmentImpl.class,
						primaryKey);

				if (employeeSubDepartment != null) {
					cacheResult(employeeSubDepartment);
				}
				else {
					EntityCacheUtil.putResult(EmployeeSubDepartmentModelImpl.ENTITY_CACHE_ENABLED,
						EmployeeSubDepartmentImpl.class, primaryKey,
						_nullEmployeeSubDepartment);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(EmployeeSubDepartmentModelImpl.ENTITY_CACHE_ENABLED,
					EmployeeSubDepartmentImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return employeeSubDepartment;
	}

	/**
	 * Returns the employee sub department with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param employeeSubDepartmentId the primary key of the employee sub department
	 * @return the employee sub department, or <code>null</code> if a employee sub department with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeSubDepartment fetchByPrimaryKey(long employeeSubDepartmentId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)employeeSubDepartmentId);
	}

	/**
	 * Returns all the employee sub departments.
	 *
	 * @return the employee sub departments
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EmployeeSubDepartment> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the employee sub departments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeSubDepartmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of employee sub departments
	 * @param end the upper bound of the range of employee sub departments (not inclusive)
	 * @return the range of employee sub departments
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EmployeeSubDepartment> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the employee sub departments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeSubDepartmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of employee sub departments
	 * @param end the upper bound of the range of employee sub departments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of employee sub departments
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EmployeeSubDepartment> findAll(int start, int end,
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

		List<EmployeeSubDepartment> list = (List<EmployeeSubDepartment>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_EMPLOYEESUBDEPARTMENT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_EMPLOYEESUBDEPARTMENT;

				if (pagination) {
					sql = sql.concat(EmployeeSubDepartmentModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<EmployeeSubDepartment>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<EmployeeSubDepartment>(list);
				}
				else {
					list = (List<EmployeeSubDepartment>)QueryUtil.list(q,
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
	 * Removes all the employee sub departments from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (EmployeeSubDepartment employeeSubDepartment : findAll()) {
			remove(employeeSubDepartment);
		}
	}

	/**
	 * Returns the number of employee sub departments.
	 *
	 * @return the number of employee sub departments
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

				Query q = session.createQuery(_SQL_COUNT_EMPLOYEESUBDEPARTMENT);

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
	 * Initializes the employee sub department persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.hrms.model.EmployeeSubDepartment")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<EmployeeSubDepartment>> listenersList = new ArrayList<ModelListener<EmployeeSubDepartment>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<EmployeeSubDepartment>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(EmployeeSubDepartmentImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_EMPLOYEESUBDEPARTMENT = "SELECT employeeSubDepartment FROM EmployeeSubDepartment employeeSubDepartment";
	private static final String _SQL_SELECT_EMPLOYEESUBDEPARTMENT_WHERE = "SELECT employeeSubDepartment FROM EmployeeSubDepartment employeeSubDepartment WHERE ";
	private static final String _SQL_COUNT_EMPLOYEESUBDEPARTMENT = "SELECT COUNT(employeeSubDepartment) FROM EmployeeSubDepartment employeeSubDepartment";
	private static final String _SQL_COUNT_EMPLOYEESUBDEPARTMENT_WHERE = "SELECT COUNT(employeeSubDepartment) FROM EmployeeSubDepartment employeeSubDepartment WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "employeeSubDepartment.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No EmployeeSubDepartment exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No EmployeeSubDepartment exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(EmployeeSubDepartmentPersistenceImpl.class);
	private static EmployeeSubDepartment _nullEmployeeSubDepartment = new EmployeeSubDepartmentImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<EmployeeSubDepartment> toCacheModel() {
				return _nullEmployeeSubDepartmentCacheModel;
			}
		};

	private static CacheModel<EmployeeSubDepartment> _nullEmployeeSubDepartmentCacheModel =
		new CacheModel<EmployeeSubDepartment>() {
			@Override
			public EmployeeSubDepartment toEntityModel() {
				return _nullEmployeeSubDepartment;
			}
		};
}