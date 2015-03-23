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

import com.hrms.model.Leave;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the leave service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author yashpalsinh
 * @see LeavePersistenceImpl
 * @see LeaveUtil
 * @generated
 */
public interface LeavePersistence extends BasePersistence<Leave> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link LeaveUtil} to access the leave persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the leave in the entity cache if it is enabled.
	*
	* @param leave the leave
	*/
	public void cacheResult(com.hrms.model.Leave leave);

	/**
	* Caches the leaves in the entity cache if it is enabled.
	*
	* @param leaves the leaves
	*/
	public void cacheResult(java.util.List<com.hrms.model.Leave> leaves);

	/**
	* Creates a new leave with the primary key. Does not add the leave to the database.
	*
	* @param leaveId the primary key for the new leave
	* @return the new leave
	*/
	public com.hrms.model.Leave create(long leaveId);

	/**
	* Removes the leave with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param leaveId the primary key of the leave
	* @return the leave that was removed
	* @throws com.hrms.NoSuchLeaveException if a leave with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.Leave remove(long leaveId)
		throws com.hrms.NoSuchLeaveException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.hrms.model.Leave updateImpl(com.hrms.model.Leave leave)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the leave with the primary key or throws a {@link com.hrms.NoSuchLeaveException} if it could not be found.
	*
	* @param leaveId the primary key of the leave
	* @return the leave
	* @throws com.hrms.NoSuchLeaveException if a leave with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.Leave findByPrimaryKey(long leaveId)
		throws com.hrms.NoSuchLeaveException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the leave with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param leaveId the primary key of the leave
	* @return the leave, or <code>null</code> if a leave with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.Leave fetchByPrimaryKey(long leaveId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the leaves.
	*
	* @return the leaves
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hrms.model.Leave> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the leaves.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.LeaveModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of leaves
	* @param end the upper bound of the range of leaves (not inclusive)
	* @return the range of leaves
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hrms.model.Leave> findAll(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the leaves.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.LeaveModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of leaves
	* @param end the upper bound of the range of leaves (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of leaves
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hrms.model.Leave> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the leaves from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of leaves.
	*
	* @return the number of leaves
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}