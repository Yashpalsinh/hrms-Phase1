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

import com.hrms.model.EmployeeTimesheet;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the employee timesheet service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author yashpalsinh
 * @see EmployeeTimesheetPersistenceImpl
 * @see EmployeeTimesheetUtil
 * @generated
 */
public interface EmployeeTimesheetPersistence extends BasePersistence<EmployeeTimesheet> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link EmployeeTimesheetUtil} to access the employee timesheet persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the employee timesheets where createBy = &#63;.
	*
	* @param createBy the create by
	* @return the matching employee timesheets
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hrms.model.EmployeeTimesheet> findBycreateBy(
		long createBy)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.hrms.model.EmployeeTimesheet> findBycreateBy(
		long createBy, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.hrms.model.EmployeeTimesheet> findBycreateBy(
		long createBy, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first employee timesheet in the ordered set where createBy = &#63;.
	*
	* @param createBy the create by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching employee timesheet
	* @throws com.hrms.NoSuchEmployeeTimesheetException if a matching employee timesheet could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeTimesheet findBycreateBy_First(
		long createBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hrms.NoSuchEmployeeTimesheetException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first employee timesheet in the ordered set where createBy = &#63;.
	*
	* @param createBy the create by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching employee timesheet, or <code>null</code> if a matching employee timesheet could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeTimesheet fetchBycreateBy_First(
		long createBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last employee timesheet in the ordered set where createBy = &#63;.
	*
	* @param createBy the create by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching employee timesheet
	* @throws com.hrms.NoSuchEmployeeTimesheetException if a matching employee timesheet could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeTimesheet findBycreateBy_Last(long createBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hrms.NoSuchEmployeeTimesheetException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last employee timesheet in the ordered set where createBy = &#63;.
	*
	* @param createBy the create by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching employee timesheet, or <code>null</code> if a matching employee timesheet could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeTimesheet fetchBycreateBy_Last(
		long createBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.hrms.model.EmployeeTimesheet[] findBycreateBy_PrevAndNext(
		long timesheetId, long createBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hrms.NoSuchEmployeeTimesheetException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the employee timesheets where createBy = &#63; from the database.
	*
	* @param createBy the create by
	* @throws SystemException if a system exception occurred
	*/
	public void removeBycreateBy(long createBy)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of employee timesheets where createBy = &#63;.
	*
	* @param createBy the create by
	* @return the number of matching employee timesheets
	* @throws SystemException if a system exception occurred
	*/
	public int countBycreateBy(long createBy)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the employee timesheets where modifiedBy = &#63;.
	*
	* @param modifiedBy the modified by
	* @return the matching employee timesheets
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hrms.model.EmployeeTimesheet> findBymodifiedBy(
		long modifiedBy)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.hrms.model.EmployeeTimesheet> findBymodifiedBy(
		long modifiedBy, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.hrms.model.EmployeeTimesheet> findBymodifiedBy(
		long modifiedBy, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first employee timesheet in the ordered set where modifiedBy = &#63;.
	*
	* @param modifiedBy the modified by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching employee timesheet
	* @throws com.hrms.NoSuchEmployeeTimesheetException if a matching employee timesheet could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeTimesheet findBymodifiedBy_First(
		long modifiedBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hrms.NoSuchEmployeeTimesheetException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first employee timesheet in the ordered set where modifiedBy = &#63;.
	*
	* @param modifiedBy the modified by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching employee timesheet, or <code>null</code> if a matching employee timesheet could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeTimesheet fetchBymodifiedBy_First(
		long modifiedBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last employee timesheet in the ordered set where modifiedBy = &#63;.
	*
	* @param modifiedBy the modified by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching employee timesheet
	* @throws com.hrms.NoSuchEmployeeTimesheetException if a matching employee timesheet could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeTimesheet findBymodifiedBy_Last(
		long modifiedBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hrms.NoSuchEmployeeTimesheetException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last employee timesheet in the ordered set where modifiedBy = &#63;.
	*
	* @param modifiedBy the modified by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching employee timesheet, or <code>null</code> if a matching employee timesheet could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeTimesheet fetchBymodifiedBy_Last(
		long modifiedBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.hrms.model.EmployeeTimesheet[] findBymodifiedBy_PrevAndNext(
		long timesheetId, long modifiedBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hrms.NoSuchEmployeeTimesheetException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the employee timesheets where modifiedBy = &#63; from the database.
	*
	* @param modifiedBy the modified by
	* @throws SystemException if a system exception occurred
	*/
	public void removeBymodifiedBy(long modifiedBy)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of employee timesheets where modifiedBy = &#63;.
	*
	* @param modifiedBy the modified by
	* @return the number of matching employee timesheets
	* @throws SystemException if a system exception occurred
	*/
	public int countBymodifiedBy(long modifiedBy)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the employee timesheet in the entity cache if it is enabled.
	*
	* @param employeeTimesheet the employee timesheet
	*/
	public void cacheResult(com.hrms.model.EmployeeTimesheet employeeTimesheet);

	/**
	* Caches the employee timesheets in the entity cache if it is enabled.
	*
	* @param employeeTimesheets the employee timesheets
	*/
	public void cacheResult(
		java.util.List<com.hrms.model.EmployeeTimesheet> employeeTimesheets);

	/**
	* Creates a new employee timesheet with the primary key. Does not add the employee timesheet to the database.
	*
	* @param timesheetId the primary key for the new employee timesheet
	* @return the new employee timesheet
	*/
	public com.hrms.model.EmployeeTimesheet create(long timesheetId);

	/**
	* Removes the employee timesheet with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param timesheetId the primary key of the employee timesheet
	* @return the employee timesheet that was removed
	* @throws com.hrms.NoSuchEmployeeTimesheetException if a employee timesheet with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeTimesheet remove(long timesheetId)
		throws com.hrms.NoSuchEmployeeTimesheetException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.hrms.model.EmployeeTimesheet updateImpl(
		com.hrms.model.EmployeeTimesheet employeeTimesheet)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the employee timesheet with the primary key or throws a {@link com.hrms.NoSuchEmployeeTimesheetException} if it could not be found.
	*
	* @param timesheetId the primary key of the employee timesheet
	* @return the employee timesheet
	* @throws com.hrms.NoSuchEmployeeTimesheetException if a employee timesheet with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeTimesheet findByPrimaryKey(long timesheetId)
		throws com.hrms.NoSuchEmployeeTimesheetException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the employee timesheet with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param timesheetId the primary key of the employee timesheet
	* @return the employee timesheet, or <code>null</code> if a employee timesheet with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeTimesheet fetchByPrimaryKey(long timesheetId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the employee timesheets.
	*
	* @return the employee timesheets
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hrms.model.EmployeeTimesheet> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.hrms.model.EmployeeTimesheet> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.hrms.model.EmployeeTimesheet> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the employee timesheets from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of employee timesheets.
	*
	* @return the number of employee timesheets
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}