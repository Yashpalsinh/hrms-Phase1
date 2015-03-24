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

import com.hrms.model.CandidateQualification;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the candidate qualification service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author bhavik
 * @see CandidateQualificationPersistenceImpl
 * @see CandidateQualificationUtil
 * @generated
 */
public interface CandidateQualificationPersistence extends BasePersistence<CandidateQualification> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CandidateQualificationUtil} to access the candidate qualification persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the candidate qualification in the entity cache if it is enabled.
	*
	* @param candidateQualification the candidate qualification
	*/
	public void cacheResult(
		com.hrms.model.CandidateQualification candidateQualification);

	/**
	* Caches the candidate qualifications in the entity cache if it is enabled.
	*
	* @param candidateQualifications the candidate qualifications
	*/
	public void cacheResult(
		java.util.List<com.hrms.model.CandidateQualification> candidateQualifications);

	/**
	* Creates a new candidate qualification with the primary key. Does not add the candidate qualification to the database.
	*
	* @param candidateQualificationId the primary key for the new candidate qualification
	* @return the new candidate qualification
	*/
	public com.hrms.model.CandidateQualification create(
		long candidateQualificationId);

	/**
	* Removes the candidate qualification with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param candidateQualificationId the primary key of the candidate qualification
	* @return the candidate qualification that was removed
	* @throws com.hrms.NoSuchCandidateQualificationException if a candidate qualification with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.CandidateQualification remove(
		long candidateQualificationId)
		throws com.hrms.NoSuchCandidateQualificationException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.hrms.model.CandidateQualification updateImpl(
		com.hrms.model.CandidateQualification candidateQualification)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the candidate qualification with the primary key or throws a {@link com.hrms.NoSuchCandidateQualificationException} if it could not be found.
	*
	* @param candidateQualificationId the primary key of the candidate qualification
	* @return the candidate qualification
	* @throws com.hrms.NoSuchCandidateQualificationException if a candidate qualification with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.CandidateQualification findByPrimaryKey(
		long candidateQualificationId)
		throws com.hrms.NoSuchCandidateQualificationException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the candidate qualification with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param candidateQualificationId the primary key of the candidate qualification
	* @return the candidate qualification, or <code>null</code> if a candidate qualification with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hrms.model.CandidateQualification fetchByPrimaryKey(
		long candidateQualificationId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the candidate qualifications.
	*
	* @return the candidate qualifications
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hrms.model.CandidateQualification> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the candidate qualifications.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.CandidateQualificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of candidate qualifications
	* @param end the upper bound of the range of candidate qualifications (not inclusive)
	* @return the range of candidate qualifications
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hrms.model.CandidateQualification> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the candidate qualifications.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.CandidateQualificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of candidate qualifications
	* @param end the upper bound of the range of candidate qualifications (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of candidate qualifications
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hrms.model.CandidateQualification> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the candidate qualifications from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of candidate qualifications.
	*
	* @return the number of candidate qualifications
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}