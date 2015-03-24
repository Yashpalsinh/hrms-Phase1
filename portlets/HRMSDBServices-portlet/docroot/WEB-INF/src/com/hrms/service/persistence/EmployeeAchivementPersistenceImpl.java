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

import com.hrms.NoSuchEmployeeAchivementException;

import com.hrms.model.EmployeeAchivement;
import com.hrms.model.impl.EmployeeAchivementImpl;
import com.hrms.model.impl.EmployeeAchivementModelImpl;

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
 * The persistence implementation for the employee achivement service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author yashpalsinh
 * @see EmployeeAchivementPersistence
 * @see EmployeeAchivementUtil
 * @generated
 */
public class EmployeeAchivementPersistenceImpl extends BasePersistenceImpl<EmployeeAchivement>
	implements EmployeeAchivementPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link EmployeeAchivementUtil} to access the employee achivement persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = EmployeeAchivementImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(EmployeeAchivementModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeAchivementModelImpl.FINDER_CACHE_ENABLED,
			EmployeeAchivementImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(EmployeeAchivementModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeAchivementModelImpl.FINDER_CACHE_ENABLED,
			EmployeeAchivementImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(EmployeeAchivementModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeAchivementModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CREATEBY = new FinderPath(EmployeeAchivementModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeAchivementModelImpl.FINDER_CACHE_ENABLED,
			EmployeeAchivementImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBycreateBy",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CREATEBY =
		new FinderPath(EmployeeAchivementModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeAchivementModelImpl.FINDER_CACHE_ENABLED,
			EmployeeAchivementImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBycreateBy",
			new String[] { Long.class.getName() },
			EmployeeAchivementModelImpl.CREATEBY_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CREATEBY = new FinderPath(EmployeeAchivementModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeAchivementModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBycreateBy",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the employee achivements where createBy = &#63;.
	 *
	 * @param createBy the create by
	 * @return the matching employee achivements
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EmployeeAchivement> findBycreateBy(long createBy)
		throws SystemException {
		return findBycreateBy(createBy, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the employee achivements where createBy = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeAchivementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param createBy the create by
	 * @param start the lower bound of the range of employee achivements
	 * @param end the upper bound of the range of employee achivements (not inclusive)
	 * @return the range of matching employee achivements
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EmployeeAchivement> findBycreateBy(long createBy, int start,
		int end) throws SystemException {
		return findBycreateBy(createBy, start, end, null);
	}

	/**
	 * Returns an ordered range of all the employee achivements where createBy = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeAchivementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param createBy the create by
	 * @param start the lower bound of the range of employee achivements
	 * @param end the upper bound of the range of employee achivements (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching employee achivements
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EmployeeAchivement> findBycreateBy(long createBy, int start,
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

		List<EmployeeAchivement> list = (List<EmployeeAchivement>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (EmployeeAchivement employeeAchivement : list) {
				if ((createBy != employeeAchivement.getCreateBy())) {
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

			query.append(_SQL_SELECT_EMPLOYEEACHIVEMENT_WHERE);

			query.append(_FINDER_COLUMN_CREATEBY_CREATEBY_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(EmployeeAchivementModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(createBy);

				if (!pagination) {
					list = (List<EmployeeAchivement>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<EmployeeAchivement>(list);
				}
				else {
					list = (List<EmployeeAchivement>)QueryUtil.list(q,
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
	 * Returns the first employee achivement in the ordered set where createBy = &#63;.
	 *
	 * @param createBy the create by
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching employee achivement
	 * @throws com.hrms.NoSuchEmployeeAchivementException if a matching employee achivement could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeAchivement findBycreateBy_First(long createBy,
		OrderByComparator orderByComparator)
		throws NoSuchEmployeeAchivementException, SystemException {
		EmployeeAchivement employeeAchivement = fetchBycreateBy_First(createBy,
				orderByComparator);

		if (employeeAchivement != null) {
			return employeeAchivement;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("createBy=");
		msg.append(createBy);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchEmployeeAchivementException(msg.toString());
	}

	/**
	 * Returns the first employee achivement in the ordered set where createBy = &#63;.
	 *
	 * @param createBy the create by
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching employee achivement, or <code>null</code> if a matching employee achivement could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeAchivement fetchBycreateBy_First(long createBy,
		OrderByComparator orderByComparator) throws SystemException {
		List<EmployeeAchivement> list = findBycreateBy(createBy, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last employee achivement in the ordered set where createBy = &#63;.
	 *
	 * @param createBy the create by
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching employee achivement
	 * @throws com.hrms.NoSuchEmployeeAchivementException if a matching employee achivement could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeAchivement findBycreateBy_Last(long createBy,
		OrderByComparator orderByComparator)
		throws NoSuchEmployeeAchivementException, SystemException {
		EmployeeAchivement employeeAchivement = fetchBycreateBy_Last(createBy,
				orderByComparator);

		if (employeeAchivement != null) {
			return employeeAchivement;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("createBy=");
		msg.append(createBy);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchEmployeeAchivementException(msg.toString());
	}

	/**
	 * Returns the last employee achivement in the ordered set where createBy = &#63;.
	 *
	 * @param createBy the create by
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching employee achivement, or <code>null</code> if a matching employee achivement could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeAchivement fetchBycreateBy_Last(long createBy,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countBycreateBy(createBy);

		if (count == 0) {
			return null;
		}

		List<EmployeeAchivement> list = findBycreateBy(createBy, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the employee achivements before and after the current employee achivement in the ordered set where createBy = &#63;.
	 *
	 * @param employeeAchivementId the primary key of the current employee achivement
	 * @param createBy the create by
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next employee achivement
	 * @throws com.hrms.NoSuchEmployeeAchivementException if a employee achivement with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeAchivement[] findBycreateBy_PrevAndNext(
		long employeeAchivementId, long createBy,
		OrderByComparator orderByComparator)
		throws NoSuchEmployeeAchivementException, SystemException {
		EmployeeAchivement employeeAchivement = findByPrimaryKey(employeeAchivementId);

		Session session = null;

		try {
			session = openSession();

			EmployeeAchivement[] array = new EmployeeAchivementImpl[3];

			array[0] = getBycreateBy_PrevAndNext(session, employeeAchivement,
					createBy, orderByComparator, true);

			array[1] = employeeAchivement;

			array[2] = getBycreateBy_PrevAndNext(session, employeeAchivement,
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

	protected EmployeeAchivement getBycreateBy_PrevAndNext(Session session,
		EmployeeAchivement employeeAchivement, long createBy,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_EMPLOYEEACHIVEMENT_WHERE);

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
			query.append(EmployeeAchivementModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(createBy);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(employeeAchivement);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<EmployeeAchivement> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the employee achivements where createBy = &#63; from the database.
	 *
	 * @param createBy the create by
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBycreateBy(long createBy) throws SystemException {
		for (EmployeeAchivement employeeAchivement : findBycreateBy(createBy,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(employeeAchivement);
		}
	}

	/**
	 * Returns the number of employee achivements where createBy = &#63;.
	 *
	 * @param createBy the create by
	 * @return the number of matching employee achivements
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

			query.append(_SQL_COUNT_EMPLOYEEACHIVEMENT_WHERE);

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

	private static final String _FINDER_COLUMN_CREATEBY_CREATEBY_2 = "employeeAchivement.createBy = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_MODIFIEDBY =
		new FinderPath(EmployeeAchivementModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeAchivementModelImpl.FINDER_CACHE_ENABLED,
			EmployeeAchivementImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBymodifiedBy",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MODIFIEDBY =
		new FinderPath(EmployeeAchivementModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeAchivementModelImpl.FINDER_CACHE_ENABLED,
			EmployeeAchivementImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBymodifiedBy",
			new String[] { Long.class.getName() },
			EmployeeAchivementModelImpl.MODIFIEDBY_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_MODIFIEDBY = new FinderPath(EmployeeAchivementModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeAchivementModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBymodifiedBy",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the employee achivements where modifiedBy = &#63;.
	 *
	 * @param modifiedBy the modified by
	 * @return the matching employee achivements
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EmployeeAchivement> findBymodifiedBy(long modifiedBy)
		throws SystemException {
		return findBymodifiedBy(modifiedBy, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the employee achivements where modifiedBy = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeAchivementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param modifiedBy the modified by
	 * @param start the lower bound of the range of employee achivements
	 * @param end the upper bound of the range of employee achivements (not inclusive)
	 * @return the range of matching employee achivements
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EmployeeAchivement> findBymodifiedBy(long modifiedBy,
		int start, int end) throws SystemException {
		return findBymodifiedBy(modifiedBy, start, end, null);
	}

	/**
	 * Returns an ordered range of all the employee achivements where modifiedBy = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeAchivementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param modifiedBy the modified by
	 * @param start the lower bound of the range of employee achivements
	 * @param end the upper bound of the range of employee achivements (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching employee achivements
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EmployeeAchivement> findBymodifiedBy(long modifiedBy,
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

		List<EmployeeAchivement> list = (List<EmployeeAchivement>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (EmployeeAchivement employeeAchivement : list) {
				if ((modifiedBy != employeeAchivement.getModifiedBy())) {
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

			query.append(_SQL_SELECT_EMPLOYEEACHIVEMENT_WHERE);

			query.append(_FINDER_COLUMN_MODIFIEDBY_MODIFIEDBY_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(EmployeeAchivementModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(modifiedBy);

				if (!pagination) {
					list = (List<EmployeeAchivement>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<EmployeeAchivement>(list);
				}
				else {
					list = (List<EmployeeAchivement>)QueryUtil.list(q,
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
	 * Returns the first employee achivement in the ordered set where modifiedBy = &#63;.
	 *
	 * @param modifiedBy the modified by
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching employee achivement
	 * @throws com.hrms.NoSuchEmployeeAchivementException if a matching employee achivement could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeAchivement findBymodifiedBy_First(long modifiedBy,
		OrderByComparator orderByComparator)
		throws NoSuchEmployeeAchivementException, SystemException {
		EmployeeAchivement employeeAchivement = fetchBymodifiedBy_First(modifiedBy,
				orderByComparator);

		if (employeeAchivement != null) {
			return employeeAchivement;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("modifiedBy=");
		msg.append(modifiedBy);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchEmployeeAchivementException(msg.toString());
	}

	/**
	 * Returns the first employee achivement in the ordered set where modifiedBy = &#63;.
	 *
	 * @param modifiedBy the modified by
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching employee achivement, or <code>null</code> if a matching employee achivement could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeAchivement fetchBymodifiedBy_First(long modifiedBy,
		OrderByComparator orderByComparator) throws SystemException {
		List<EmployeeAchivement> list = findBymodifiedBy(modifiedBy, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last employee achivement in the ordered set where modifiedBy = &#63;.
	 *
	 * @param modifiedBy the modified by
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching employee achivement
	 * @throws com.hrms.NoSuchEmployeeAchivementException if a matching employee achivement could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeAchivement findBymodifiedBy_Last(long modifiedBy,
		OrderByComparator orderByComparator)
		throws NoSuchEmployeeAchivementException, SystemException {
		EmployeeAchivement employeeAchivement = fetchBymodifiedBy_Last(modifiedBy,
				orderByComparator);

		if (employeeAchivement != null) {
			return employeeAchivement;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("modifiedBy=");
		msg.append(modifiedBy);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchEmployeeAchivementException(msg.toString());
	}

	/**
	 * Returns the last employee achivement in the ordered set where modifiedBy = &#63;.
	 *
	 * @param modifiedBy the modified by
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching employee achivement, or <code>null</code> if a matching employee achivement could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeAchivement fetchBymodifiedBy_Last(long modifiedBy,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countBymodifiedBy(modifiedBy);

		if (count == 0) {
			return null;
		}

		List<EmployeeAchivement> list = findBymodifiedBy(modifiedBy, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the employee achivements before and after the current employee achivement in the ordered set where modifiedBy = &#63;.
	 *
	 * @param employeeAchivementId the primary key of the current employee achivement
	 * @param modifiedBy the modified by
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next employee achivement
	 * @throws com.hrms.NoSuchEmployeeAchivementException if a employee achivement with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeAchivement[] findBymodifiedBy_PrevAndNext(
		long employeeAchivementId, long modifiedBy,
		OrderByComparator orderByComparator)
		throws NoSuchEmployeeAchivementException, SystemException {
		EmployeeAchivement employeeAchivement = findByPrimaryKey(employeeAchivementId);

		Session session = null;

		try {
			session = openSession();

			EmployeeAchivement[] array = new EmployeeAchivementImpl[3];

			array[0] = getBymodifiedBy_PrevAndNext(session, employeeAchivement,
					modifiedBy, orderByComparator, true);

			array[1] = employeeAchivement;

			array[2] = getBymodifiedBy_PrevAndNext(session, employeeAchivement,
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

	protected EmployeeAchivement getBymodifiedBy_PrevAndNext(Session session,
		EmployeeAchivement employeeAchivement, long modifiedBy,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_EMPLOYEEACHIVEMENT_WHERE);

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
			query.append(EmployeeAchivementModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(modifiedBy);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(employeeAchivement);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<EmployeeAchivement> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the employee achivements where modifiedBy = &#63; from the database.
	 *
	 * @param modifiedBy the modified by
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBymodifiedBy(long modifiedBy) throws SystemException {
		for (EmployeeAchivement employeeAchivement : findBymodifiedBy(
				modifiedBy, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(employeeAchivement);
		}
	}

	/**
	 * Returns the number of employee achivements where modifiedBy = &#63;.
	 *
	 * @param modifiedBy the modified by
	 * @return the number of matching employee achivements
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

			query.append(_SQL_COUNT_EMPLOYEEACHIVEMENT_WHERE);

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

	private static final String _FINDER_COLUMN_MODIFIEDBY_MODIFIEDBY_2 = "employeeAchivement.modifiedBy = ?";

	public EmployeeAchivementPersistenceImpl() {
		setModelClass(EmployeeAchivement.class);
	}

	/**
	 * Caches the employee achivement in the entity cache if it is enabled.
	 *
	 * @param employeeAchivement the employee achivement
	 */
	@Override
	public void cacheResult(EmployeeAchivement employeeAchivement) {
		EntityCacheUtil.putResult(EmployeeAchivementModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeAchivementImpl.class, employeeAchivement.getPrimaryKey(),
			employeeAchivement);

		employeeAchivement.resetOriginalValues();
	}

	/**
	 * Caches the employee achivements in the entity cache if it is enabled.
	 *
	 * @param employeeAchivements the employee achivements
	 */
	@Override
	public void cacheResult(List<EmployeeAchivement> employeeAchivements) {
		for (EmployeeAchivement employeeAchivement : employeeAchivements) {
			if (EntityCacheUtil.getResult(
						EmployeeAchivementModelImpl.ENTITY_CACHE_ENABLED,
						EmployeeAchivementImpl.class,
						employeeAchivement.getPrimaryKey()) == null) {
				cacheResult(employeeAchivement);
			}
			else {
				employeeAchivement.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all employee achivements.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(EmployeeAchivementImpl.class.getName());
		}

		EntityCacheUtil.clearCache(EmployeeAchivementImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the employee achivement.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(EmployeeAchivement employeeAchivement) {
		EntityCacheUtil.removeResult(EmployeeAchivementModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeAchivementImpl.class, employeeAchivement.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<EmployeeAchivement> employeeAchivements) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (EmployeeAchivement employeeAchivement : employeeAchivements) {
			EntityCacheUtil.removeResult(EmployeeAchivementModelImpl.ENTITY_CACHE_ENABLED,
				EmployeeAchivementImpl.class, employeeAchivement.getPrimaryKey());
		}
	}

	/**
	 * Creates a new employee achivement with the primary key. Does not add the employee achivement to the database.
	 *
	 * @param employeeAchivementId the primary key for the new employee achivement
	 * @return the new employee achivement
	 */
	@Override
	public EmployeeAchivement create(long employeeAchivementId) {
		EmployeeAchivement employeeAchivement = new EmployeeAchivementImpl();

		employeeAchivement.setNew(true);
		employeeAchivement.setPrimaryKey(employeeAchivementId);

		return employeeAchivement;
	}

	/**
	 * Removes the employee achivement with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param employeeAchivementId the primary key of the employee achivement
	 * @return the employee achivement that was removed
	 * @throws com.hrms.NoSuchEmployeeAchivementException if a employee achivement with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeAchivement remove(long employeeAchivementId)
		throws NoSuchEmployeeAchivementException, SystemException {
		return remove((Serializable)employeeAchivementId);
	}

	/**
	 * Removes the employee achivement with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the employee achivement
	 * @return the employee achivement that was removed
	 * @throws com.hrms.NoSuchEmployeeAchivementException if a employee achivement with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeAchivement remove(Serializable primaryKey)
		throws NoSuchEmployeeAchivementException, SystemException {
		Session session = null;

		try {
			session = openSession();

			EmployeeAchivement employeeAchivement = (EmployeeAchivement)session.get(EmployeeAchivementImpl.class,
					primaryKey);

			if (employeeAchivement == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchEmployeeAchivementException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(employeeAchivement);
		}
		catch (NoSuchEmployeeAchivementException nsee) {
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
	protected EmployeeAchivement removeImpl(
		EmployeeAchivement employeeAchivement) throws SystemException {
		employeeAchivement = toUnwrappedModel(employeeAchivement);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(employeeAchivement)) {
				employeeAchivement = (EmployeeAchivement)session.get(EmployeeAchivementImpl.class,
						employeeAchivement.getPrimaryKeyObj());
			}

			if (employeeAchivement != null) {
				session.delete(employeeAchivement);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (employeeAchivement != null) {
			clearCache(employeeAchivement);
		}

		return employeeAchivement;
	}

	@Override
	public EmployeeAchivement updateImpl(
		com.hrms.model.EmployeeAchivement employeeAchivement)
		throws SystemException {
		employeeAchivement = toUnwrappedModel(employeeAchivement);

		boolean isNew = employeeAchivement.isNew();

		EmployeeAchivementModelImpl employeeAchivementModelImpl = (EmployeeAchivementModelImpl)employeeAchivement;

		Session session = null;

		try {
			session = openSession();

			if (employeeAchivement.isNew()) {
				session.save(employeeAchivement);

				employeeAchivement.setNew(false);
			}
			else {
				session.merge(employeeAchivement);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !EmployeeAchivementModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((employeeAchivementModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CREATEBY.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						employeeAchivementModelImpl.getOriginalCreateBy()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CREATEBY, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CREATEBY,
					args);

				args = new Object[] { employeeAchivementModelImpl.getCreateBy() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CREATEBY, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CREATEBY,
					args);
			}

			if ((employeeAchivementModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MODIFIEDBY.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						employeeAchivementModelImpl.getOriginalModifiedBy()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MODIFIEDBY,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MODIFIEDBY,
					args);

				args = new Object[] { employeeAchivementModelImpl.getModifiedBy() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MODIFIEDBY,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MODIFIEDBY,
					args);
			}
		}

		EntityCacheUtil.putResult(EmployeeAchivementModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeAchivementImpl.class, employeeAchivement.getPrimaryKey(),
			employeeAchivement);

		return employeeAchivement;
	}

	protected EmployeeAchivement toUnwrappedModel(
		EmployeeAchivement employeeAchivement) {
		if (employeeAchivement instanceof EmployeeAchivementImpl) {
			return employeeAchivement;
		}

		EmployeeAchivementImpl employeeAchivementImpl = new EmployeeAchivementImpl();

		employeeAchivementImpl.setNew(employeeAchivement.isNew());
		employeeAchivementImpl.setPrimaryKey(employeeAchivement.getPrimaryKey());

		employeeAchivementImpl.setEmployeeAchivementId(employeeAchivement.getEmployeeAchivementId());
		employeeAchivementImpl.setAchivedBy(employeeAchivement.getAchivedBy());
		employeeAchivementImpl.setGroupId(employeeAchivement.getGroupId());
		employeeAchivementImpl.setCompanyId(employeeAchivement.getCompanyId());
		employeeAchivementImpl.setAchivementDate(employeeAchivement.getAchivementDate());
		employeeAchivementImpl.setAchivementTitle(employeeAchivement.getAchivementTitle());
		employeeAchivementImpl.setAchivementDiscription(employeeAchivement.getAchivementDiscription());
		employeeAchivementImpl.setStatus(employeeAchivement.isStatus());
		employeeAchivementImpl.setCreateDate(employeeAchivement.getCreateDate());
		employeeAchivementImpl.setModifiedDate(employeeAchivement.getModifiedDate());
		employeeAchivementImpl.setCreateBy(employeeAchivement.getCreateBy());
		employeeAchivementImpl.setModifiedBy(employeeAchivement.getModifiedBy());

		return employeeAchivementImpl;
	}

	/**
	 * Returns the employee achivement with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the employee achivement
	 * @return the employee achivement
	 * @throws com.hrms.NoSuchEmployeeAchivementException if a employee achivement with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeAchivement findByPrimaryKey(Serializable primaryKey)
		throws NoSuchEmployeeAchivementException, SystemException {
		EmployeeAchivement employeeAchivement = fetchByPrimaryKey(primaryKey);

		if (employeeAchivement == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchEmployeeAchivementException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return employeeAchivement;
	}

	/**
	 * Returns the employee achivement with the primary key or throws a {@link com.hrms.NoSuchEmployeeAchivementException} if it could not be found.
	 *
	 * @param employeeAchivementId the primary key of the employee achivement
	 * @return the employee achivement
	 * @throws com.hrms.NoSuchEmployeeAchivementException if a employee achivement with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeAchivement findByPrimaryKey(long employeeAchivementId)
		throws NoSuchEmployeeAchivementException, SystemException {
		return findByPrimaryKey((Serializable)employeeAchivementId);
	}

	/**
	 * Returns the employee achivement with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the employee achivement
	 * @return the employee achivement, or <code>null</code> if a employee achivement with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeAchivement fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		EmployeeAchivement employeeAchivement = (EmployeeAchivement)EntityCacheUtil.getResult(EmployeeAchivementModelImpl.ENTITY_CACHE_ENABLED,
				EmployeeAchivementImpl.class, primaryKey);

		if (employeeAchivement == _nullEmployeeAchivement) {
			return null;
		}

		if (employeeAchivement == null) {
			Session session = null;

			try {
				session = openSession();

				employeeAchivement = (EmployeeAchivement)session.get(EmployeeAchivementImpl.class,
						primaryKey);

				if (employeeAchivement != null) {
					cacheResult(employeeAchivement);
				}
				else {
					EntityCacheUtil.putResult(EmployeeAchivementModelImpl.ENTITY_CACHE_ENABLED,
						EmployeeAchivementImpl.class, primaryKey,
						_nullEmployeeAchivement);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(EmployeeAchivementModelImpl.ENTITY_CACHE_ENABLED,
					EmployeeAchivementImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return employeeAchivement;
	}

	/**
	 * Returns the employee achivement with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param employeeAchivementId the primary key of the employee achivement
	 * @return the employee achivement, or <code>null</code> if a employee achivement with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeAchivement fetchByPrimaryKey(long employeeAchivementId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)employeeAchivementId);
	}

	/**
	 * Returns all the employee achivements.
	 *
	 * @return the employee achivements
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EmployeeAchivement> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the employee achivements.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeAchivementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of employee achivements
	 * @param end the upper bound of the range of employee achivements (not inclusive)
	 * @return the range of employee achivements
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EmployeeAchivement> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the employee achivements.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeAchivementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of employee achivements
	 * @param end the upper bound of the range of employee achivements (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of employee achivements
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EmployeeAchivement> findAll(int start, int end,
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

		List<EmployeeAchivement> list = (List<EmployeeAchivement>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_EMPLOYEEACHIVEMENT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_EMPLOYEEACHIVEMENT;

				if (pagination) {
					sql = sql.concat(EmployeeAchivementModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<EmployeeAchivement>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<EmployeeAchivement>(list);
				}
				else {
					list = (List<EmployeeAchivement>)QueryUtil.list(q,
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
	 * Removes all the employee achivements from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (EmployeeAchivement employeeAchivement : findAll()) {
			remove(employeeAchivement);
		}
	}

	/**
	 * Returns the number of employee achivements.
	 *
	 * @return the number of employee achivements
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

				Query q = session.createQuery(_SQL_COUNT_EMPLOYEEACHIVEMENT);

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
	 * Initializes the employee achivement persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.hrms.model.EmployeeAchivement")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<EmployeeAchivement>> listenersList = new ArrayList<ModelListener<EmployeeAchivement>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<EmployeeAchivement>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(EmployeeAchivementImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_EMPLOYEEACHIVEMENT = "SELECT employeeAchivement FROM EmployeeAchivement employeeAchivement";
	private static final String _SQL_SELECT_EMPLOYEEACHIVEMENT_WHERE = "SELECT employeeAchivement FROM EmployeeAchivement employeeAchivement WHERE ";
	private static final String _SQL_COUNT_EMPLOYEEACHIVEMENT = "SELECT COUNT(employeeAchivement) FROM EmployeeAchivement employeeAchivement";
	private static final String _SQL_COUNT_EMPLOYEEACHIVEMENT_WHERE = "SELECT COUNT(employeeAchivement) FROM EmployeeAchivement employeeAchivement WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "employeeAchivement.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No EmployeeAchivement exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No EmployeeAchivement exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(EmployeeAchivementPersistenceImpl.class);
	private static EmployeeAchivement _nullEmployeeAchivement = new EmployeeAchivementImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<EmployeeAchivement> toCacheModel() {
				return _nullEmployeeAchivementCacheModel;
			}
		};

	private static CacheModel<EmployeeAchivement> _nullEmployeeAchivementCacheModel =
		new CacheModel<EmployeeAchivement>() {
			@Override
			public EmployeeAchivement toEntityModel() {
				return _nullEmployeeAchivement;
			}
		};
}