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

package com.hrms.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CandidateQualificationLocalService}.
 *
 * @author bhavik
 * @see CandidateQualificationLocalService
 * @generated
 */
public class CandidateQualificationLocalServiceWrapper
	implements CandidateQualificationLocalService,
		ServiceWrapper<CandidateQualificationLocalService> {
	public CandidateQualificationLocalServiceWrapper(
		CandidateQualificationLocalService candidateQualificationLocalService) {
		_candidateQualificationLocalService = candidateQualificationLocalService;
	}

	/**
	* Adds the candidate qualification to the database. Also notifies the appropriate model listeners.
	*
	* @param candidateQualification the candidate qualification
	* @return the candidate qualification that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hrms.model.CandidateQualification addCandidateQualification(
		com.hrms.model.CandidateQualification candidateQualification)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _candidateQualificationLocalService.addCandidateQualification(candidateQualification);
	}

	/**
	* Creates a new candidate qualification with the primary key. Does not add the candidate qualification to the database.
	*
	* @param candidateQualificationId the primary key for the new candidate qualification
	* @return the new candidate qualification
	*/
	@Override
	public com.hrms.model.CandidateQualification createCandidateQualification(
		long candidateQualificationId) {
		return _candidateQualificationLocalService.createCandidateQualification(candidateQualificationId);
	}

	/**
	* Deletes the candidate qualification with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param candidateQualificationId the primary key of the candidate qualification
	* @return the candidate qualification that was removed
	* @throws PortalException if a candidate qualification with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hrms.model.CandidateQualification deleteCandidateQualification(
		long candidateQualificationId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _candidateQualificationLocalService.deleteCandidateQualification(candidateQualificationId);
	}

	/**
	* Deletes the candidate qualification from the database. Also notifies the appropriate model listeners.
	*
	* @param candidateQualification the candidate qualification
	* @return the candidate qualification that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hrms.model.CandidateQualification deleteCandidateQualification(
		com.hrms.model.CandidateQualification candidateQualification)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _candidateQualificationLocalService.deleteCandidateQualification(candidateQualification);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _candidateQualificationLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _candidateQualificationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.CandidateQualificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _candidateQualificationLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.CandidateQualificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _candidateQualificationLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _candidateQualificationLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _candidateQualificationLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.hrms.model.CandidateQualification fetchCandidateQualification(
		long candidateQualificationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _candidateQualificationLocalService.fetchCandidateQualification(candidateQualificationId);
	}

	/**
	* Returns the candidate qualification with the primary key.
	*
	* @param candidateQualificationId the primary key of the candidate qualification
	* @return the candidate qualification
	* @throws PortalException if a candidate qualification with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hrms.model.CandidateQualification getCandidateQualification(
		long candidateQualificationId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _candidateQualificationLocalService.getCandidateQualification(candidateQualificationId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _candidateQualificationLocalService.getPersistedModel(primaryKeyObj);
	}

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
	@Override
	public java.util.List<com.hrms.model.CandidateQualification> getCandidateQualifications(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _candidateQualificationLocalService.getCandidateQualifications(start,
			end);
	}

	/**
	* Returns the number of candidate qualifications.
	*
	* @return the number of candidate qualifications
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getCandidateQualificationsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _candidateQualificationLocalService.getCandidateQualificationsCount();
	}

	/**
	* Updates the candidate qualification in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param candidateQualification the candidate qualification
	* @return the candidate qualification that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hrms.model.CandidateQualification updateCandidateQualification(
		com.hrms.model.CandidateQualification candidateQualification)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _candidateQualificationLocalService.updateCandidateQualification(candidateQualification);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _candidateQualificationLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_candidateQualificationLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _candidateQualificationLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public CandidateQualificationLocalService getWrappedCandidateQualificationLocalService() {
		return _candidateQualificationLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedCandidateQualificationLocalService(
		CandidateQualificationLocalService candidateQualificationLocalService) {
		_candidateQualificationLocalService = candidateQualificationLocalService;
	}

	@Override
	public CandidateQualificationLocalService getWrappedService() {
		return _candidateQualificationLocalService;
	}

	@Override
	public void setWrappedService(
		CandidateQualificationLocalService candidateQualificationLocalService) {
		_candidateQualificationLocalService = candidateQualificationLocalService;
	}

	private CandidateQualificationLocalService _candidateQualificationLocalService;
}