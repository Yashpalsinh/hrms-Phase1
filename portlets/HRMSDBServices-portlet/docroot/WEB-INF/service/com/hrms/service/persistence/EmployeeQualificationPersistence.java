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

import com.hrms.model.EmployeeQualification;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the employee qualification service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author yashpalsinh
 * @see EmployeeQualificationPersistenceImpl
 * @see EmployeeQualificationUtil
 * @generated
 */
public interface EmployeeQualificationPersistence extends BasePersistence<EmployeeQualification> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link EmployeeQualificationUtil} to access the employee qualification persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the employee qualifications where createBy = &#63;.
	*
	* @param createBy the create by
	* @return the matching employee qualifications
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hrms.model.EmployeeQualification> findBycreateBy(
		long createBy)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the employee qualifications where createBy = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeQualificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param createBy the create by
	* @param start the lower bound of the range of employee qualifications
	* @param end the upper bound of the range of employee qualifications (not inclusive)
	* @return the range of matching employee qualifications
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hrms.model.EmployeeQualification> findBycreateBy(
		long createBy, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the employee qualifications where createBy = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeQualificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param createBy the create by
	* @param start the lower bound of the range of employee qualifications
	* @param end the upper bound of the range of employee qualifications (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching employee qualifications
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hrms.model.EmployeeQualification> findBycreateBy(
		long createBy, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first employee qualification in the ordered set where createBy = &#63;.
	*
	* @param createBy the create by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching employee qualification
	* @throws com.hrms.NoSuchEmployeeQualificationException if a matching employee qualification could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeQualification findBycreateBy_First(
		long createBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hrms.NoSuchEmployeeQualificationException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first employee qualification in the ordered set where createBy = &#63;.
	*
	* @param createBy the create by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching employee qualification, or <code>null</code> if a matching employee qualification could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeQualification fetchBycreateBy_First(
		long createBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last employee qualification in the ordered set where createBy = &#63;.
	*
	* @param createBy the create by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching employee qualification
	* @throws com.hrms.NoSuchEmployeeQualificationException if a matching employee qualification could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeQualification findBycreateBy_Last(
		long createBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hrms.NoSuchEmployeeQualificationException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last employee qualification in the ordered set where createBy = &#63;.
	*
	* @param createBy the create by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching employee qualification, or <code>null</code> if a matching employee qualification could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeQualification fetchBycreateBy_Last(
		long createBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the employee qualifications before and after the current employee qualification in the ordered set where createBy = &#63;.
	*
	* @param employeeQualificationId the primary key of the current employee qualification
	* @param createBy the create by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next employee qualification
	* @throws com.hrms.NoSuchEmployeeQualificationException if a employee qualification with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeQualification[] findBycreateBy_PrevAndNext(
		long employeeQualificationId, long createBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hrms.NoSuchEmployeeQualificationException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the employee qualifications where createBy = &#63; from the database.
	*
	* @param createBy the create by
	* @throws SystemException if a system exception occurred
	*/
	public void removeBycreateBy(long createBy)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of employee qualifications where createBy = &#63;.
	*
	* @param createBy the create by
	* @return the number of matching employee qualifications
	* @throws SystemException if a system exception occurred
	*/
	public int countBycreateBy(long createBy)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the employee qualifications where modifiedBy = &#63;.
	*
	* @param modifiedBy the modified by
	* @return the matching employee qualifications
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hrms.model.EmployeeQualification> findBymodifiedBy(
		long modifiedBy)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the employee qualifications where modifiedBy = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeQualificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param modifiedBy the modified by
	* @param start the lower bound of the range of employee qualifications
	* @param end the upper bound of the range of employee qualifications (not inclusive)
	* @return the range of matching employee qualifications
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hrms.model.EmployeeQualification> findBymodifiedBy(
		long modifiedBy, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the employee qualifications where modifiedBy = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeQualificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param modifiedBy the modified by
	* @param start the lower bound of the range of employee qualifications
	* @param end the upper bound of the range of employee qualifications (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching employee qualifications
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hrms.model.EmployeeQualification> findBymodifiedBy(
		long modifiedBy, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first employee qualification in the ordered set where modifiedBy = &#63;.
	*
	* @param modifiedBy the modified by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching employee qualification
	* @throws com.hrms.NoSuchEmployeeQualificationException if a matching employee qualification could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeQualification findBymodifiedBy_First(
		long modifiedBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hrms.NoSuchEmployeeQualificationException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first employee qualification in the ordered set where modifiedBy = &#63;.
	*
	* @param modifiedBy the modified by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching employee qualification, or <code>null</code> if a matching employee qualification could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeQualification fetchBymodifiedBy_First(
		long modifiedBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last employee qualification in the ordered set where modifiedBy = &#63;.
	*
	* @param modifiedBy the modified by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching employee qualification
	* @throws com.hrms.NoSuchEmployeeQualificationException if a matching employee qualification could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeQualification findBymodifiedBy_Last(
		long modifiedBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hrms.NoSuchEmployeeQualificationException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last employee qualification in the ordered set where modifiedBy = &#63;.
	*
	* @param modifiedBy the modified by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching employee qualification, or <code>null</code> if a matching employee qualification could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeQualification fetchBymodifiedBy_Last(
		long modifiedBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the employee qualifications before and after the current employee qualification in the ordered set where modifiedBy = &#63;.
	*
	* @param employeeQualificationId the primary key of the current employee qualification
	* @param modifiedBy the modified by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next employee qualification
	* @throws com.hrms.NoSuchEmployeeQualificationException if a employee qualification with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeQualification[] findBymodifiedBy_PrevAndNext(
		long employeeQualificationId, long modifiedBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hrms.NoSuchEmployeeQualificationException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the employee qualifications where modifiedBy = &#63; from the database.
	*
	* @param modifiedBy the modified by
	* @throws SystemException if a system exception occurred
	*/
	public void removeBymodifiedBy(long modifiedBy)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of employee qualifications where modifiedBy = &#63;.
	*
	* @param modifiedBy the modified by
	* @return the number of matching employee qualifications
	* @throws SystemException if a system exception occurred
	*/
	public int countBymodifiedBy(long modifiedBy)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the employee qualification in the entity cache if it is enabled.
	*
	* @param employeeQualification the employee qualification
	*/
	public void cacheResult(
		com.hrms.model.EmployeeQualification employeeQualification);

	/**
	* Caches the employee qualifications in the entity cache if it is enabled.
	*
	* @param employeeQualifications the employee qualifications
	*/
	public void cacheResult(
		java.util.List<com.hrms.model.EmployeeQualification> employeeQualifications);

	/**
	* Creates a new employee qualification with the primary key. Does not add the employee qualification to the database.
	*
	* @param employeeQualificationId the primary key for the new employee qualification
	* @return the new employee qualification
	*/
	public com.hrms.model.EmployeeQualification create(
		long employeeQualificationId);

	/**
	* Removes the employee qualification with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param employeeQualificationId the primary key of the employee qualification
	* @return the employee qualification that was removed
	* @throws com.hrms.NoSuchEmployeeQualificationException if a employee qualification with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeQualification remove(
		long employeeQualificationId)
		throws com.hrms.NoSuchEmployeeQualificationException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.hrms.model.EmployeeQualification updateImpl(
		com.hrms.model.EmployeeQualification employeeQualification)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the employee qualification with the primary key or throws a {@link com.hrms.NoSuchEmployeeQualificationException} if it could not be found.
	*
	* @param employeeQualificationId the primary key of the employee qualification
	* @return the employee qualification
	* @throws com.hrms.NoSuchEmployeeQualificationException if a employee qualification with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeQualification findByPrimaryKey(
		long employeeQualificationId)
		throws com.hrms.NoSuchEmployeeQualificationException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the employee qualification with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param employeeQualificationId the primary key of the employee qualification
	* @return the employee qualification, or <code>null</code> if a employee qualification with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.EmployeeQualification fetchByPrimaryKey(
		long employeeQualificationId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the employee qualifications.
	*
	* @return the employee qualifications
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hrms.model.EmployeeQualification> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the employee qualifications.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeQualificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of employee qualifications
	* @param end the upper bound of the range of employee qualifications (not inclusive)
	* @return the range of employee qualifications
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hrms.model.EmployeeQualification> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the employee qualifications.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeQualificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of employee qualifications
	* @param end the upper bound of the range of employee qualifications (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of employee qualifications
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hrms.model.EmployeeQualification> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the employee qualifications from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of employee qualifications.
	*
	* @return the number of employee qualifications
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}