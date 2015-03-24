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

import com.hrms.model.Proof;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the proof service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author bhavik
 * @see ProofPersistenceImpl
 * @see ProofUtil
 * @generated
 */
public interface ProofPersistence extends BasePersistence<Proof> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ProofUtil} to access the proof persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the proof in the entity cache if it is enabled.
	*
	* @param proof the proof
	*/
	public void cacheResult(com.hrms.model.Proof proof);

	/**
	* Caches the proofs in the entity cache if it is enabled.
	*
	* @param proofs the proofs
	*/
	public void cacheResult(java.util.List<com.hrms.model.Proof> proofs);

	/**
	* Creates a new proof with the primary key. Does not add the proof to the database.
	*
	* @param proofId the primary key for the new proof
	* @return the new proof
	*/
	public com.hrms.model.Proof create(long proofId);

	/**
	* Removes the proof with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param proofId the primary key of the proof
	* @return the proof that was removed
	* @throws com.hrms.NoSuchProofException if a proof with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.Proof remove(long proofId)
		throws com.hrms.NoSuchProofException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.hrms.model.Proof updateImpl(com.hrms.model.Proof proof)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the proof with the primary key or throws a {@link com.hrms.NoSuchProofException} if it could not be found.
	*
	* @param proofId the primary key of the proof
	* @return the proof
	* @throws com.hrms.NoSuchProofException if a proof with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.Proof findByPrimaryKey(long proofId)
		throws com.hrms.NoSuchProofException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the proof with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param proofId the primary key of the proof
	* @return the proof, or <code>null</code> if a proof with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.Proof fetchByPrimaryKey(long proofId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the proofs.
	*
	* @return the proofs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hrms.model.Proof> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the proofs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.ProofModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of proofs
	* @param end the upper bound of the range of proofs (not inclusive)
	* @return the range of proofs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hrms.model.Proof> findAll(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the proofs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.ProofModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of proofs
	* @param end the upper bound of the range of proofs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of proofs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hrms.model.Proof> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the proofs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of proofs.
	*
	* @return the number of proofs
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}