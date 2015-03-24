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

import com.hrms.model.EmployeeWarning;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the employee warning service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author yashpalsinh
 * @see EmployeeWarningPersistenceImpl
 * @see EmployeeWarningUtil
 * @generated
 */
public interface EmployeeWarningPersistence extends BasePersistence<EmployeeWarning> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link EmployeeWarningUtil} to access the employee warning persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the employee warnings where createBy = &#63;.
	*
	* @param createBy the create by
	* @return the matching employee warnings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hrms.model.EmployeeWarning> findBycreateBy(
		long createBy)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the employee warnings where createBy = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeWarningModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param createBy the create by
	* @param start the lower bound of the range of employee warnings
	* @param end the upper bound of the range of employee warnings (not inclusive)
	* @return the range of matching employee warnings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hrms.model.EmployeeWarning> findBycreateBy(
		long createBy, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the employee warnings where createBy = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeWarningModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param createBy the create by
	* @param start the lower bound of the range of employee warnings
	* @param end the upper bound of the range of employee warnings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching employee warnings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hrms.model.EmployeeWarning> findBycreateBy(
		long createBy, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first employee warning in the ordered set where createBy = &#63;.
	*
	* @param createBy the create by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching employee warning
	* @throws com.hrms.NoSuchEmployeeWarningException if a matching employee warning could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeWarning findBycreateBy_First(long createBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hrms.NoSuchEmployeeWarningException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first employee warning in the ordered set where createBy = &#63;.
	*
	* @param createBy the create by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching employee warning, or <code>null</code> if a matching employee warning could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeWarning fetchBycreateBy_First(long createBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last employee warning in the ordered set where createBy = &#63;.
	*
	* @param createBy the create by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching employee warning
	* @throws com.hrms.NoSuchEmployeeWarningException if a matching employee warning could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeWarning findBycreateBy_Last(long createBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hrms.NoSuchEmployeeWarningException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last employee warning in the ordered set where createBy = &#63;.
	*
	* @param createBy the create by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching employee warning, or <code>null</code> if a matching employee warning could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeWarning fetchBycreateBy_Last(long createBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the employee warnings before and after the current employee warning in the ordered set where createBy = &#63;.
	*
	* @param employeeWarningId the primary key of the current employee warning
	* @param createBy the create by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next employee warning
	* @throws com.hrms.NoSuchEmployeeWarningException if a employee warning with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeWarning[] findBycreateBy_PrevAndNext(
		long employeeWarningId, long createBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hrms.NoSuchEmployeeWarningException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the employee warnings where createBy = &#63; from the database.
	*
	* @param createBy the create by
	* @throws SystemException if a system exception occurred
	*/
	public void removeBycreateBy(long createBy)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of employee warnings where createBy = &#63;.
	*
	* @param createBy the create by
	* @return the number of matching employee warnings
	* @throws SystemException if a system exception occurred
	*/
	public int countBycreateBy(long createBy)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the employee warnings where modifiedBy = &#63;.
	*
	* @param modifiedBy the modified by
	* @return the matching employee warnings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hrms.model.EmployeeWarning> findBymodifiedBy(
		long modifiedBy)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the employee warnings where modifiedBy = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeWarningModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param modifiedBy the modified by
	* @param start the lower bound of the range of employee warnings
	* @param end the upper bound of the range of employee warnings (not inclusive)
	* @return the range of matching employee warnings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hrms.model.EmployeeWarning> findBymodifiedBy(
		long modifiedBy, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the employee warnings where modifiedBy = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeWarningModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param modifiedBy the modified by
	* @param start the lower bound of the range of employee warnings
	* @param end the upper bound of the range of employee warnings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching employee warnings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hrms.model.EmployeeWarning> findBymodifiedBy(
		long modifiedBy, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first employee warning in the ordered set where modifiedBy = &#63;.
	*
	* @param modifiedBy the modified by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching employee warning
	* @throws com.hrms.NoSuchEmployeeWarningException if a matching employee warning could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeWarning findBymodifiedBy_First(
		long modifiedBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hrms.NoSuchEmployeeWarningException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first employee warning in the ordered set where modifiedBy = &#63;.
	*
	* @param modifiedBy the modified by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching employee warning, or <code>null</code> if a matching employee warning could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeWarning fetchBymodifiedBy_First(
		long modifiedBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last employee warning in the ordered set where modifiedBy = &#63;.
	*
	* @param modifiedBy the modified by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching employee warning
	* @throws com.hrms.NoSuchEmployeeWarningException if a matching employee warning could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeWarning findBymodifiedBy_Last(
		long modifiedBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hrms.NoSuchEmployeeWarningException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last employee warning in the ordered set where modifiedBy = &#63;.
	*
	* @param modifiedBy the modified by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching employee warning, or <code>null</code> if a matching employee warning could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeWarning fetchBymodifiedBy_Last(
		long modifiedBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the employee warnings before and after the current employee warning in the ordered set where modifiedBy = &#63;.
	*
	* @param employeeWarningId the primary key of the current employee warning
	* @param modifiedBy the modified by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next employee warning
	* @throws com.hrms.NoSuchEmployeeWarningException if a employee warning with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeWarning[] findBymodifiedBy_PrevAndNext(
		long employeeWarningId, long modifiedBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hrms.NoSuchEmployeeWarningException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the employee warnings where modifiedBy = &#63; from the database.
	*
	* @param modifiedBy the modified by
	* @throws SystemException if a system exception occurred
	*/
	public void removeBymodifiedBy(long modifiedBy)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of employee warnings where modifiedBy = &#63;.
	*
	* @param modifiedBy the modified by
	* @return the number of matching employee warnings
	* @throws SystemException if a system exception occurred
	*/
	public int countBymodifiedBy(long modifiedBy)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the employee warning in the entity cache if it is enabled.
	*
	* @param employeeWarning the employee warning
	*/
	public void cacheResult(com.hrms.model.EmployeeWarning employeeWarning);

	/**
	* Caches the employee warnings in the entity cache if it is enabled.
	*
	* @param employeeWarnings the employee warnings
	*/
	public void cacheResult(
		java.util.List<com.hrms.model.EmployeeWarning> employeeWarnings);

	/**
	* Creates a new employee warning with the primary key. Does not add the employee warning to the database.
	*
	* @param employeeWarningId the primary key for the new employee warning
	* @return the new employee warning
	*/
	public com.hrms.model.EmployeeWarning create(long employeeWarningId);

	/**
	* Removes the employee warning with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param employeeWarningId the primary key of the employee warning
	* @return the employee warning that was removed
	* @throws com.hrms.NoSuchEmployeeWarningException if a employee warning with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeWarning remove(long employeeWarningId)
		throws com.hrms.NoSuchEmployeeWarningException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.hrms.model.EmployeeWarning updateImpl(
		com.hrms.model.EmployeeWarning employeeWarning)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the employee warning with the primary key or throws a {@link com.hrms.NoSuchEmployeeWarningException} if it could not be found.
	*
	* @param employeeWarningId the primary key of the employee warning
	* @return the employee warning
	* @throws com.hrms.NoSuchEmployeeWarningException if a employee warning with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeWarning findByPrimaryKey(
		long employeeWarningId)
		throws com.hrms.NoSuchEmployeeWarningException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the employee warning with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param employeeWarningId the primary key of the employee warning
	* @return the employee warning, or <code>null</code> if a employee warning with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeWarning fetchByPrimaryKey(
		long employeeWarningId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the employee warnings.
	*
	* @return the employee warnings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hrms.model.EmployeeWarning> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the employee warnings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeWarningModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of employee warnings
	* @param end the upper bound of the range of employee warnings (not inclusive)
	* @return the range of employee warnings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hrms.model.EmployeeWarning> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the employee warnings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeWarningModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of employee warnings
	* @param end the upper bound of the range of employee warnings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of employee warnings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hrms.model.EmployeeWarning> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the employee warnings from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of employee warnings.
	*
	* @return the number of employee warnings
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}