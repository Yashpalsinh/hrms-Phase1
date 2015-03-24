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

import com.hrms.model.EmployeeLanguageDetail;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the employee language detail service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author yashpalsinh
 * @see EmployeeLanguageDetailPersistenceImpl
 * @see EmployeeLanguageDetailUtil
 * @generated
 */
public interface EmployeeLanguageDetailPersistence extends BasePersistence<EmployeeLanguageDetail> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link EmployeeLanguageDetailUtil} to access the employee language detail persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the employee language details where createBy = &#63;.
	*
	* @param createBy the create by
	* @return the matching employee language details
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hrms.model.EmployeeLanguageDetail> findBycreateBy(
		long createBy)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the employee language details where createBy = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeLanguageDetailModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param createBy the create by
	* @param start the lower bound of the range of employee language details
	* @param end the upper bound of the range of employee language details (not inclusive)
	* @return the range of matching employee language details
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hrms.model.EmployeeLanguageDetail> findBycreateBy(
		long createBy, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the employee language details where createBy = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeLanguageDetailModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param createBy the create by
	* @param start the lower bound of the range of employee language details
	* @param end the upper bound of the range of employee language details (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching employee language details
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hrms.model.EmployeeLanguageDetail> findBycreateBy(
		long createBy, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first employee language detail in the ordered set where createBy = &#63;.
	*
	* @param createBy the create by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching employee language detail
	* @throws com.hrms.NoSuchEmployeeLanguageDetailException if a matching employee language detail could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeLanguageDetail findBycreateBy_First(
		long createBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hrms.NoSuchEmployeeLanguageDetailException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first employee language detail in the ordered set where createBy = &#63;.
	*
	* @param createBy the create by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching employee language detail, or <code>null</code> if a matching employee language detail could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeLanguageDetail fetchBycreateBy_First(
		long createBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last employee language detail in the ordered set where createBy = &#63;.
	*
	* @param createBy the create by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching employee language detail
	* @throws com.hrms.NoSuchEmployeeLanguageDetailException if a matching employee language detail could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeLanguageDetail findBycreateBy_Last(
		long createBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hrms.NoSuchEmployeeLanguageDetailException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last employee language detail in the ordered set where createBy = &#63;.
	*
	* @param createBy the create by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching employee language detail, or <code>null</code> if a matching employee language detail could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeLanguageDetail fetchBycreateBy_Last(
		long createBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the employee language details before and after the current employee language detail in the ordered set where createBy = &#63;.
	*
	* @param employeeLanguageDetailId the primary key of the current employee language detail
	* @param createBy the create by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next employee language detail
	* @throws com.hrms.NoSuchEmployeeLanguageDetailException if a employee language detail with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeLanguageDetail[] findBycreateBy_PrevAndNext(
		long employeeLanguageDetailId, long createBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hrms.NoSuchEmployeeLanguageDetailException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the employee language details where createBy = &#63; from the database.
	*
	* @param createBy the create by
	* @throws SystemException if a system exception occurred
	*/
	public void removeBycreateBy(long createBy)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of employee language details where createBy = &#63;.
	*
	* @param createBy the create by
	* @return the number of matching employee language details
	* @throws SystemException if a system exception occurred
	*/
	public int countBycreateBy(long createBy)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the employee language details where modifiedBy = &#63;.
	*
	* @param modifiedBy the modified by
	* @return the matching employee language details
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hrms.model.EmployeeLanguageDetail> findBymodifiedBy(
		long modifiedBy)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the employee language details where modifiedBy = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeLanguageDetailModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param modifiedBy the modified by
	* @param start the lower bound of the range of employee language details
	* @param end the upper bound of the range of employee language details (not inclusive)
	* @return the range of matching employee language details
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hrms.model.EmployeeLanguageDetail> findBymodifiedBy(
		long modifiedBy, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the employee language details where modifiedBy = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeLanguageDetailModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param modifiedBy the modified by
	* @param start the lower bound of the range of employee language details
	* @param end the upper bound of the range of employee language details (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching employee language details
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hrms.model.EmployeeLanguageDetail> findBymodifiedBy(
		long modifiedBy, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first employee language detail in the ordered set where modifiedBy = &#63;.
	*
	* @param modifiedBy the modified by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching employee language detail
	* @throws com.hrms.NoSuchEmployeeLanguageDetailException if a matching employee language detail could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeLanguageDetail findBymodifiedBy_First(
		long modifiedBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hrms.NoSuchEmployeeLanguageDetailException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first employee language detail in the ordered set where modifiedBy = &#63;.
	*
	* @param modifiedBy the modified by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching employee language detail, or <code>null</code> if a matching employee language detail could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeLanguageDetail fetchBymodifiedBy_First(
		long modifiedBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last employee language detail in the ordered set where modifiedBy = &#63;.
	*
	* @param modifiedBy the modified by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching employee language detail
	* @throws com.hrms.NoSuchEmployeeLanguageDetailException if a matching employee language detail could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeLanguageDetail findBymodifiedBy_Last(
		long modifiedBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hrms.NoSuchEmployeeLanguageDetailException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last employee language detail in the ordered set where modifiedBy = &#63;.
	*
	* @param modifiedBy the modified by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching employee language detail, or <code>null</code> if a matching employee language detail could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeLanguageDetail fetchBymodifiedBy_Last(
		long modifiedBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the employee language details before and after the current employee language detail in the ordered set where modifiedBy = &#63;.
	*
	* @param employeeLanguageDetailId the primary key of the current employee language detail
	* @param modifiedBy the modified by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next employee language detail
	* @throws com.hrms.NoSuchEmployeeLanguageDetailException if a employee language detail with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeLanguageDetail[] findBymodifiedBy_PrevAndNext(
		long employeeLanguageDetailId, long modifiedBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hrms.NoSuchEmployeeLanguageDetailException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the employee language details where modifiedBy = &#63; from the database.
	*
	* @param modifiedBy the modified by
	* @throws SystemException if a system exception occurred
	*/
	public void removeBymodifiedBy(long modifiedBy)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of employee language details where modifiedBy = &#63;.
	*
	* @param modifiedBy the modified by
	* @return the number of matching employee language details
	* @throws SystemException if a system exception occurred
	*/
	public int countBymodifiedBy(long modifiedBy)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the employee language detail in the entity cache if it is enabled.
	*
	* @param employeeLanguageDetail the employee language detail
	*/
	public void cacheResult(
		com.hrms.model.EmployeeLanguageDetail employeeLanguageDetail);

	/**
	* Caches the employee language details in the entity cache if it is enabled.
	*
	* @param employeeLanguageDetails the employee language details
	*/
	public void cacheResult(
		java.util.List<com.hrms.model.EmployeeLanguageDetail> employeeLanguageDetails);

	/**
	* Creates a new employee language detail with the primary key. Does not add the employee language detail to the database.
	*
	* @param employeeLanguageDetailId the primary key for the new employee language detail
	* @return the new employee language detail
	*/
	public com.hrms.model.EmployeeLanguageDetail create(
		long employeeLanguageDetailId);

	/**
	* Removes the employee language detail with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param employeeLanguageDetailId the primary key of the employee language detail
	* @return the employee language detail that was removed
	* @throws com.hrms.NoSuchEmployeeLanguageDetailException if a employee language detail with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeLanguageDetail remove(
		long employeeLanguageDetailId)
		throws com.hrms.NoSuchEmployeeLanguageDetailException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.hrms.model.EmployeeLanguageDetail updateImpl(
		com.hrms.model.EmployeeLanguageDetail employeeLanguageDetail)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the employee language detail with the primary key or throws a {@link com.hrms.NoSuchEmployeeLanguageDetailException} if it could not be found.
	*
	* @param employeeLanguageDetailId the primary key of the employee language detail
	* @return the employee language detail
	* @throws com.hrms.NoSuchEmployeeLanguageDetailException if a employee language detail with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeLanguageDetail findByPrimaryKey(
		long employeeLanguageDetailId)
		throws com.hrms.NoSuchEmployeeLanguageDetailException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the employee language detail with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param employeeLanguageDetailId the primary key of the employee language detail
	* @return the employee language detail, or <code>null</code> if a employee language detail with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeLanguageDetail fetchByPrimaryKey(
		long employeeLanguageDetailId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the employee language details.
	*
	* @return the employee language details
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hrms.model.EmployeeLanguageDetail> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the employee language details.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeLanguageDetailModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of employee language details
	* @param end the upper bound of the range of employee language details (not inclusive)
	* @return the range of employee language details
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hrms.model.EmployeeLanguageDetail> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the employee language details.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeLanguageDetailModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of employee language details
	* @param end the upper bound of the range of employee language details (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of employee language details
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hrms.model.EmployeeLanguageDetail> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the employee language details from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of employee language details.
	*
	* @return the number of employee language details
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}