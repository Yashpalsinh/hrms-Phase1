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

import com.hrms.model.EmployeePreviousCompany;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the employee previous company service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author yashpalsinh
 * @see EmployeePreviousCompanyPersistenceImpl
 * @see EmployeePreviousCompanyUtil
 * @generated
 */
public interface EmployeePreviousCompanyPersistence extends BasePersistence<EmployeePreviousCompany> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link EmployeePreviousCompanyUtil} to access the employee previous company persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the employee previous companies where createBy = &#63;.
	*
	* @param createBy the create by
	* @return the matching employee previous companies
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hrms.model.EmployeePreviousCompany> findBycreateBy(
		long createBy)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the employee previous companies where createBy = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeePreviousCompanyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param createBy the create by
	* @param start the lower bound of the range of employee previous companies
	* @param end the upper bound of the range of employee previous companies (not inclusive)
	* @return the range of matching employee previous companies
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hrms.model.EmployeePreviousCompany> findBycreateBy(
		long createBy, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the employee previous companies where createBy = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeePreviousCompanyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param createBy the create by
	* @param start the lower bound of the range of employee previous companies
	* @param end the upper bound of the range of employee previous companies (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching employee previous companies
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hrms.model.EmployeePreviousCompany> findBycreateBy(
		long createBy, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first employee previous company in the ordered set where createBy = &#63;.
	*
	* @param createBy the create by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching employee previous company
	* @throws com.hrms.NoSuchEmployeePreviousCompanyException if a matching employee previous company could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeePreviousCompany findBycreateBy_First(
		long createBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hrms.NoSuchEmployeePreviousCompanyException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first employee previous company in the ordered set where createBy = &#63;.
	*
	* @param createBy the create by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching employee previous company, or <code>null</code> if a matching employee previous company could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeePreviousCompany fetchBycreateBy_First(
		long createBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last employee previous company in the ordered set where createBy = &#63;.
	*
	* @param createBy the create by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching employee previous company
	* @throws com.hrms.NoSuchEmployeePreviousCompanyException if a matching employee previous company could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeePreviousCompany findBycreateBy_Last(
		long createBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hrms.NoSuchEmployeePreviousCompanyException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last employee previous company in the ordered set where createBy = &#63;.
	*
	* @param createBy the create by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching employee previous company, or <code>null</code> if a matching employee previous company could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeePreviousCompany fetchBycreateBy_Last(
		long createBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the employee previous companies before and after the current employee previous company in the ordered set where createBy = &#63;.
	*
	* @param employeePreviousCompanyId the primary key of the current employee previous company
	* @param createBy the create by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next employee previous company
	* @throws com.hrms.NoSuchEmployeePreviousCompanyException if a employee previous company with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeePreviousCompany[] findBycreateBy_PrevAndNext(
		long employeePreviousCompanyId, long createBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hrms.NoSuchEmployeePreviousCompanyException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the employee previous companies where createBy = &#63; from the database.
	*
	* @param createBy the create by
	* @throws SystemException if a system exception occurred
	*/
	public void removeBycreateBy(long createBy)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of employee previous companies where createBy = &#63;.
	*
	* @param createBy the create by
	* @return the number of matching employee previous companies
	* @throws SystemException if a system exception occurred
	*/
	public int countBycreateBy(long createBy)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the employee previous companies where modifiedBy = &#63;.
	*
	* @param modifiedBy the modified by
	* @return the matching employee previous companies
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hrms.model.EmployeePreviousCompany> findBymodifiedBy(
		long modifiedBy)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the employee previous companies where modifiedBy = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeePreviousCompanyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param modifiedBy the modified by
	* @param start the lower bound of the range of employee previous companies
	* @param end the upper bound of the range of employee previous companies (not inclusive)
	* @return the range of matching employee previous companies
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hrms.model.EmployeePreviousCompany> findBymodifiedBy(
		long modifiedBy, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the employee previous companies where modifiedBy = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeePreviousCompanyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param modifiedBy the modified by
	* @param start the lower bound of the range of employee previous companies
	* @param end the upper bound of the range of employee previous companies (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching employee previous companies
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hrms.model.EmployeePreviousCompany> findBymodifiedBy(
		long modifiedBy, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first employee previous company in the ordered set where modifiedBy = &#63;.
	*
	* @param modifiedBy the modified by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching employee previous company
	* @throws com.hrms.NoSuchEmployeePreviousCompanyException if a matching employee previous company could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeePreviousCompany findBymodifiedBy_First(
		long modifiedBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hrms.NoSuchEmployeePreviousCompanyException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first employee previous company in the ordered set where modifiedBy = &#63;.
	*
	* @param modifiedBy the modified by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching employee previous company, or <code>null</code> if a matching employee previous company could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeePreviousCompany fetchBymodifiedBy_First(
		long modifiedBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last employee previous company in the ordered set where modifiedBy = &#63;.
	*
	* @param modifiedBy the modified by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching employee previous company
	* @throws com.hrms.NoSuchEmployeePreviousCompanyException if a matching employee previous company could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeePreviousCompany findBymodifiedBy_Last(
		long modifiedBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hrms.NoSuchEmployeePreviousCompanyException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last employee previous company in the ordered set where modifiedBy = &#63;.
	*
	* @param modifiedBy the modified by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching employee previous company, or <code>null</code> if a matching employee previous company could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeePreviousCompany fetchBymodifiedBy_Last(
		long modifiedBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the employee previous companies before and after the current employee previous company in the ordered set where modifiedBy = &#63;.
	*
	* @param employeePreviousCompanyId the primary key of the current employee previous company
	* @param modifiedBy the modified by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next employee previous company
	* @throws com.hrms.NoSuchEmployeePreviousCompanyException if a employee previous company with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeePreviousCompany[] findBymodifiedBy_PrevAndNext(
		long employeePreviousCompanyId, long modifiedBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hrms.NoSuchEmployeePreviousCompanyException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the employee previous companies where modifiedBy = &#63; from the database.
	*
	* @param modifiedBy the modified by
	* @throws SystemException if a system exception occurred
	*/
	public void removeBymodifiedBy(long modifiedBy)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of employee previous companies where modifiedBy = &#63;.
	*
	* @param modifiedBy the modified by
	* @return the number of matching employee previous companies
	* @throws SystemException if a system exception occurred
	*/
	public int countBymodifiedBy(long modifiedBy)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the employee previous company in the entity cache if it is enabled.
	*
	* @param employeePreviousCompany the employee previous company
	*/
	public void cacheResult(
		com.hrms.model.EmployeePreviousCompany employeePreviousCompany);

	/**
	* Caches the employee previous companies in the entity cache if it is enabled.
	*
	* @param employeePreviousCompanies the employee previous companies
	*/
	public void cacheResult(
		java.util.List<com.hrms.model.EmployeePreviousCompany> employeePreviousCompanies);

	/**
	* Creates a new employee previous company with the primary key. Does not add the employee previous company to the database.
	*
	* @param employeePreviousCompanyId the primary key for the new employee previous company
	* @return the new employee previous company
	*/
	public com.hrms.model.EmployeePreviousCompany create(
		long employeePreviousCompanyId);

	/**
	* Removes the employee previous company with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param employeePreviousCompanyId the primary key of the employee previous company
	* @return the employee previous company that was removed
	* @throws com.hrms.NoSuchEmployeePreviousCompanyException if a employee previous company with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeePreviousCompany remove(
		long employeePreviousCompanyId)
		throws com.hrms.NoSuchEmployeePreviousCompanyException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.hrms.model.EmployeePreviousCompany updateImpl(
		com.hrms.model.EmployeePreviousCompany employeePreviousCompany)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the employee previous company with the primary key or throws a {@link com.hrms.NoSuchEmployeePreviousCompanyException} if it could not be found.
	*
	* @param employeePreviousCompanyId the primary key of the employee previous company
	* @return the employee previous company
	* @throws com.hrms.NoSuchEmployeePreviousCompanyException if a employee previous company with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeePreviousCompany findByPrimaryKey(
		long employeePreviousCompanyId)
		throws com.hrms.NoSuchEmployeePreviousCompanyException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the employee previous company with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param employeePreviousCompanyId the primary key of the employee previous company
	* @return the employee previous company, or <code>null</code> if a employee previous company with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeePreviousCompany fetchByPrimaryKey(
		long employeePreviousCompanyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the employee previous companies.
	*
	* @return the employee previous companies
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hrms.model.EmployeePreviousCompany> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the employee previous companies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeePreviousCompanyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of employee previous companies
	* @param end the upper bound of the range of employee previous companies (not inclusive)
	* @return the range of employee previous companies
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hrms.model.EmployeePreviousCompany> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the employee previous companies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeePreviousCompanyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of employee previous companies
	* @param end the upper bound of the range of employee previous companies (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of employee previous companies
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hrms.model.EmployeePreviousCompany> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the employee previous companies from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of employee previous companies.
	*
	* @return the number of employee previous companies
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}