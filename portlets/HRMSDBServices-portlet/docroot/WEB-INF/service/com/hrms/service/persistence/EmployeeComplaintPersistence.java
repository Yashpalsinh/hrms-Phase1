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

import com.hrms.model.EmployeeComplaint;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the employee complaint service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author yashpalsinh
 * @see EmployeeComplaintPersistenceImpl
 * @see EmployeeComplaintUtil
 * @generated
 */
public interface EmployeeComplaintPersistence extends BasePersistence<EmployeeComplaint> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link EmployeeComplaintUtil} to access the employee complaint persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the employee complaints where createBy = &#63;.
	*
	* @param createBy the create by
	* @return the matching employee complaints
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hrms.model.EmployeeComplaint> findBycreateBy(
		long createBy)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the employee complaints where createBy = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeComplaintModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param createBy the create by
	* @param start the lower bound of the range of employee complaints
	* @param end the upper bound of the range of employee complaints (not inclusive)
	* @return the range of matching employee complaints
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hrms.model.EmployeeComplaint> findBycreateBy(
		long createBy, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the employee complaints where createBy = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeComplaintModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param createBy the create by
	* @param start the lower bound of the range of employee complaints
	* @param end the upper bound of the range of employee complaints (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching employee complaints
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hrms.model.EmployeeComplaint> findBycreateBy(
		long createBy, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first employee complaint in the ordered set where createBy = &#63;.
	*
	* @param createBy the create by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching employee complaint
	* @throws com.hrms.NoSuchEmployeeComplaintException if a matching employee complaint could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeComplaint findBycreateBy_First(
		long createBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hrms.NoSuchEmployeeComplaintException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first employee complaint in the ordered set where createBy = &#63;.
	*
	* @param createBy the create by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching employee complaint, or <code>null</code> if a matching employee complaint could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeComplaint fetchBycreateBy_First(
		long createBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last employee complaint in the ordered set where createBy = &#63;.
	*
	* @param createBy the create by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching employee complaint
	* @throws com.hrms.NoSuchEmployeeComplaintException if a matching employee complaint could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeComplaint findBycreateBy_Last(long createBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hrms.NoSuchEmployeeComplaintException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last employee complaint in the ordered set where createBy = &#63;.
	*
	* @param createBy the create by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching employee complaint, or <code>null</code> if a matching employee complaint could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeComplaint fetchBycreateBy_Last(
		long createBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the employee complaints before and after the current employee complaint in the ordered set where createBy = &#63;.
	*
	* @param employeeComplaintId the primary key of the current employee complaint
	* @param createBy the create by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next employee complaint
	* @throws com.hrms.NoSuchEmployeeComplaintException if a employee complaint with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeComplaint[] findBycreateBy_PrevAndNext(
		long employeeComplaintId, long createBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hrms.NoSuchEmployeeComplaintException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the employee complaints where createBy = &#63; from the database.
	*
	* @param createBy the create by
	* @throws SystemException if a system exception occurred
	*/
	public void removeBycreateBy(long createBy)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of employee complaints where createBy = &#63;.
	*
	* @param createBy the create by
	* @return the number of matching employee complaints
	* @throws SystemException if a system exception occurred
	*/
	public int countBycreateBy(long createBy)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the employee complaints where modifiedBy = &#63;.
	*
	* @param modifiedBy the modified by
	* @return the matching employee complaints
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hrms.model.EmployeeComplaint> findBymodifiedBy(
		long modifiedBy)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the employee complaints where modifiedBy = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeComplaintModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param modifiedBy the modified by
	* @param start the lower bound of the range of employee complaints
	* @param end the upper bound of the range of employee complaints (not inclusive)
	* @return the range of matching employee complaints
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hrms.model.EmployeeComplaint> findBymodifiedBy(
		long modifiedBy, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the employee complaints where modifiedBy = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeComplaintModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param modifiedBy the modified by
	* @param start the lower bound of the range of employee complaints
	* @param end the upper bound of the range of employee complaints (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching employee complaints
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hrms.model.EmployeeComplaint> findBymodifiedBy(
		long modifiedBy, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first employee complaint in the ordered set where modifiedBy = &#63;.
	*
	* @param modifiedBy the modified by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching employee complaint
	* @throws com.hrms.NoSuchEmployeeComplaintException if a matching employee complaint could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeComplaint findBymodifiedBy_First(
		long modifiedBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hrms.NoSuchEmployeeComplaintException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first employee complaint in the ordered set where modifiedBy = &#63;.
	*
	* @param modifiedBy the modified by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching employee complaint, or <code>null</code> if a matching employee complaint could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeComplaint fetchBymodifiedBy_First(
		long modifiedBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last employee complaint in the ordered set where modifiedBy = &#63;.
	*
	* @param modifiedBy the modified by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching employee complaint
	* @throws com.hrms.NoSuchEmployeeComplaintException if a matching employee complaint could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeComplaint findBymodifiedBy_Last(
		long modifiedBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hrms.NoSuchEmployeeComplaintException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last employee complaint in the ordered set where modifiedBy = &#63;.
	*
	* @param modifiedBy the modified by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching employee complaint, or <code>null</code> if a matching employee complaint could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeComplaint fetchBymodifiedBy_Last(
		long modifiedBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the employee complaints before and after the current employee complaint in the ordered set where modifiedBy = &#63;.
	*
	* @param employeeComplaintId the primary key of the current employee complaint
	* @param modifiedBy the modified by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next employee complaint
	* @throws com.hrms.NoSuchEmployeeComplaintException if a employee complaint with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeComplaint[] findBymodifiedBy_PrevAndNext(
		long employeeComplaintId, long modifiedBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hrms.NoSuchEmployeeComplaintException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the employee complaints where modifiedBy = &#63; from the database.
	*
	* @param modifiedBy the modified by
	* @throws SystemException if a system exception occurred
	*/
	public void removeBymodifiedBy(long modifiedBy)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of employee complaints where modifiedBy = &#63;.
	*
	* @param modifiedBy the modified by
	* @return the number of matching employee complaints
	* @throws SystemException if a system exception occurred
	*/
	public int countBymodifiedBy(long modifiedBy)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the employee complaint in the entity cache if it is enabled.
	*
	* @param employeeComplaint the employee complaint
	*/
	public void cacheResult(com.hrms.model.EmployeeComplaint employeeComplaint);

	/**
	* Caches the employee complaints in the entity cache if it is enabled.
	*
	* @param employeeComplaints the employee complaints
	*/
	public void cacheResult(
		java.util.List<com.hrms.model.EmployeeComplaint> employeeComplaints);

	/**
	* Creates a new employee complaint with the primary key. Does not add the employee complaint to the database.
	*
	* @param employeeComplaintId the primary key for the new employee complaint
	* @return the new employee complaint
	*/
	public com.hrms.model.EmployeeComplaint create(long employeeComplaintId);

	/**
	* Removes the employee complaint with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param employeeComplaintId the primary key of the employee complaint
	* @return the employee complaint that was removed
	* @throws com.hrms.NoSuchEmployeeComplaintException if a employee complaint with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeComplaint remove(long employeeComplaintId)
		throws com.hrms.NoSuchEmployeeComplaintException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.hrms.model.EmployeeComplaint updateImpl(
		com.hrms.model.EmployeeComplaint employeeComplaint)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the employee complaint with the primary key or throws a {@link com.hrms.NoSuchEmployeeComplaintException} if it could not be found.
	*
	* @param employeeComplaintId the primary key of the employee complaint
	* @return the employee complaint
	* @throws com.hrms.NoSuchEmployeeComplaintException if a employee complaint with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeComplaint findByPrimaryKey(
		long employeeComplaintId)
		throws com.hrms.NoSuchEmployeeComplaintException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the employee complaint with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param employeeComplaintId the primary key of the employee complaint
	* @return the employee complaint, or <code>null</code> if a employee complaint with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeComplaint fetchByPrimaryKey(
		long employeeComplaintId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the employee complaints.
	*
	* @return the employee complaints
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hrms.model.EmployeeComplaint> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the employee complaints.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeComplaintModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of employee complaints
	* @param end the upper bound of the range of employee complaints (not inclusive)
	* @return the range of employee complaints
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hrms.model.EmployeeComplaint> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the employee complaints.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeComplaintModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of employee complaints
	* @param end the upper bound of the range of employee complaints (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of employee complaints
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hrms.model.EmployeeComplaint> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the employee complaints from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of employee complaints.
	*
	* @return the number of employee complaints
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}