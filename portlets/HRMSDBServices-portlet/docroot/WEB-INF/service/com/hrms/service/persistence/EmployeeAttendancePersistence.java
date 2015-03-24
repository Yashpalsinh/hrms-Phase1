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

import com.hrms.model.EmployeeAttendance;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the employee attendance service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author yashpalsinh
 * @see EmployeeAttendancePersistenceImpl
 * @see EmployeeAttendanceUtil
 * @generated
 */
public interface EmployeeAttendancePersistence extends BasePersistence<EmployeeAttendance> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link EmployeeAttendanceUtil} to access the employee attendance persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the employee attendances where createBy = &#63;.
	*
	* @param createBy the create by
	* @return the matching employee attendances
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hrms.model.EmployeeAttendance> findBycreateBy(
		long createBy)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.hrms.model.EmployeeAttendance> findBycreateBy(
		long createBy, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.hrms.model.EmployeeAttendance> findBycreateBy(
		long createBy, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first employee attendance in the ordered set where createBy = &#63;.
	*
	* @param createBy the create by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching employee attendance
	* @throws com.hrms.NoSuchEmployeeAttendanceException if a matching employee attendance could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeAttendance findBycreateBy_First(
		long createBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hrms.NoSuchEmployeeAttendanceException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first employee attendance in the ordered set where createBy = &#63;.
	*
	* @param createBy the create by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching employee attendance, or <code>null</code> if a matching employee attendance could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeAttendance fetchBycreateBy_First(
		long createBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last employee attendance in the ordered set where createBy = &#63;.
	*
	* @param createBy the create by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching employee attendance
	* @throws com.hrms.NoSuchEmployeeAttendanceException if a matching employee attendance could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeAttendance findBycreateBy_Last(
		long createBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hrms.NoSuchEmployeeAttendanceException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last employee attendance in the ordered set where createBy = &#63;.
	*
	* @param createBy the create by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching employee attendance, or <code>null</code> if a matching employee attendance could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeAttendance fetchBycreateBy_Last(
		long createBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.hrms.model.EmployeeAttendance[] findBycreateBy_PrevAndNext(
		long attendanceId, long createBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hrms.NoSuchEmployeeAttendanceException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the employee attendances where createBy = &#63; from the database.
	*
	* @param createBy the create by
	* @throws SystemException if a system exception occurred
	*/
	public void removeBycreateBy(long createBy)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of employee attendances where createBy = &#63;.
	*
	* @param createBy the create by
	* @return the number of matching employee attendances
	* @throws SystemException if a system exception occurred
	*/
	public int countBycreateBy(long createBy)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the employee attendances where modifiedBy = &#63;.
	*
	* @param modifiedBy the modified by
	* @return the matching employee attendances
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hrms.model.EmployeeAttendance> findBymodifiedBy(
		long modifiedBy)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.hrms.model.EmployeeAttendance> findBymodifiedBy(
		long modifiedBy, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.hrms.model.EmployeeAttendance> findBymodifiedBy(
		long modifiedBy, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first employee attendance in the ordered set where modifiedBy = &#63;.
	*
	* @param modifiedBy the modified by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching employee attendance
	* @throws com.hrms.NoSuchEmployeeAttendanceException if a matching employee attendance could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeAttendance findBymodifiedBy_First(
		long modifiedBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hrms.NoSuchEmployeeAttendanceException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first employee attendance in the ordered set where modifiedBy = &#63;.
	*
	* @param modifiedBy the modified by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching employee attendance, or <code>null</code> if a matching employee attendance could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeAttendance fetchBymodifiedBy_First(
		long modifiedBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last employee attendance in the ordered set where modifiedBy = &#63;.
	*
	* @param modifiedBy the modified by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching employee attendance
	* @throws com.hrms.NoSuchEmployeeAttendanceException if a matching employee attendance could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeAttendance findBymodifiedBy_Last(
		long modifiedBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hrms.NoSuchEmployeeAttendanceException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last employee attendance in the ordered set where modifiedBy = &#63;.
	*
	* @param modifiedBy the modified by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching employee attendance, or <code>null</code> if a matching employee attendance could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeAttendance fetchBymodifiedBy_Last(
		long modifiedBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.hrms.model.EmployeeAttendance[] findBymodifiedBy_PrevAndNext(
		long attendanceId, long modifiedBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hrms.NoSuchEmployeeAttendanceException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the employee attendances where modifiedBy = &#63; from the database.
	*
	* @param modifiedBy the modified by
	* @throws SystemException if a system exception occurred
	*/
	public void removeBymodifiedBy(long modifiedBy)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of employee attendances where modifiedBy = &#63;.
	*
	* @param modifiedBy the modified by
	* @return the number of matching employee attendances
	* @throws SystemException if a system exception occurred
	*/
	public int countBymodifiedBy(long modifiedBy)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the employee attendance in the entity cache if it is enabled.
	*
	* @param employeeAttendance the employee attendance
	*/
	public void cacheResult(
		com.hrms.model.EmployeeAttendance employeeAttendance);

	/**
	* Caches the employee attendances in the entity cache if it is enabled.
	*
	* @param employeeAttendances the employee attendances
	*/
	public void cacheResult(
		java.util.List<com.hrms.model.EmployeeAttendance> employeeAttendances);

	/**
	* Creates a new employee attendance with the primary key. Does not add the employee attendance to the database.
	*
	* @param attendanceId the primary key for the new employee attendance
	* @return the new employee attendance
	*/
	public com.hrms.model.EmployeeAttendance create(long attendanceId);

	/**
	* Removes the employee attendance with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param attendanceId the primary key of the employee attendance
	* @return the employee attendance that was removed
	* @throws com.hrms.NoSuchEmployeeAttendanceException if a employee attendance with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeAttendance remove(long attendanceId)
		throws com.hrms.NoSuchEmployeeAttendanceException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.hrms.model.EmployeeAttendance updateImpl(
		com.hrms.model.EmployeeAttendance employeeAttendance)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the employee attendance with the primary key or throws a {@link com.hrms.NoSuchEmployeeAttendanceException} if it could not be found.
	*
	* @param attendanceId the primary key of the employee attendance
	* @return the employee attendance
	* @throws com.hrms.NoSuchEmployeeAttendanceException if a employee attendance with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeAttendance findByPrimaryKey(long attendanceId)
		throws com.hrms.NoSuchEmployeeAttendanceException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the employee attendance with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param attendanceId the primary key of the employee attendance
	* @return the employee attendance, or <code>null</code> if a employee attendance with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeAttendance fetchByPrimaryKey(
		long attendanceId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the employee attendances.
	*
	* @return the employee attendances
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hrms.model.EmployeeAttendance> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.hrms.model.EmployeeAttendance> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.hrms.model.EmployeeAttendance> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the employee attendances from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of employee attendances.
	*
	* @return the number of employee attendances
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}