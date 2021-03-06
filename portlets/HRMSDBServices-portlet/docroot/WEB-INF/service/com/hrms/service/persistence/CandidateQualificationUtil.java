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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the candidate qualification service. This utility wraps {@link CandidateQualificationPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author yashpalsinh
 * @see CandidateQualificationPersistence
 * @see CandidateQualificationPersistenceImpl
 * @generated
 */
public class CandidateQualificationUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(CandidateQualification candidateQualification) {
		getPersistence().clearCache(candidateQualification);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<CandidateQualification> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CandidateQualification> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CandidateQualification> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static CandidateQualification update(
		CandidateQualification candidateQualification)
		throws SystemException {
		return getPersistence().update(candidateQualification);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static CandidateQualification update(
		CandidateQualification candidateQualification,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(candidateQualification, serviceContext);
	}

	/**
	* Caches the candidate qualification in the entity cache if it is enabled.
	*
	* @param candidateQualification the candidate qualification
	*/
	public static void cacheResult(
		com.hrms.model.CandidateQualification candidateQualification) {
		getPersistence().cacheResult(candidateQualification);
	}

	/**
	* Caches the candidate qualifications in the entity cache if it is enabled.
	*
	* @param candidateQualifications the candidate qualifications
	*/
	public static void cacheResult(
		java.util.List<com.hrms.model.CandidateQualification> candidateQualifications) {
		getPersistence().cacheResult(candidateQualifications);
	}

	/**
	* Creates a new candidate qualification with the primary key. Does not add the candidate qualification to the database.
	*
	* @param candidateQualificationId the primary key for the new candidate qualification
	* @return the new candidate qualification
	*/
	public static com.hrms.model.CandidateQualification create(
		long candidateQualificationId) {
		return getPersistence().create(candidateQualificationId);
	}

	/**
	* Removes the candidate qualification with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param candidateQualificationId the primary key of the candidate qualification
	* @return the candidate qualification that was removed
	* @throws com.hrms.NoSuchCandidateQualificationException if a candidate qualification with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.CandidateQualification remove(
		long candidateQualificationId)
		throws com.hrms.NoSuchCandidateQualificationException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(candidateQualificationId);
	}

	public static com.hrms.model.CandidateQualification updateImpl(
		com.hrms.model.CandidateQualification candidateQualification)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(candidateQualification);
	}

	/**
	* Returns the candidate qualification with the primary key or throws a {@link com.hrms.NoSuchCandidateQualificationException} if it could not be found.
	*
	* @param candidateQualificationId the primary key of the candidate qualification
	* @return the candidate qualification
	* @throws com.hrms.NoSuchCandidateQualificationException if a candidate qualification with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.CandidateQualification findByPrimaryKey(
		long candidateQualificationId)
		throws com.hrms.NoSuchCandidateQualificationException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(candidateQualificationId);
	}

	/**
	* Returns the candidate qualification with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param candidateQualificationId the primary key of the candidate qualification
	* @return the candidate qualification, or <code>null</code> if a candidate qualification with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.CandidateQualification fetchByPrimaryKey(
		long candidateQualificationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(candidateQualificationId);
	}

	/**
	* Returns all the candidate qualifications.
	*
	* @return the candidate qualifications
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hrms.model.CandidateQualification> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<com.hrms.model.CandidateQualification> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<com.hrms.model.CandidateQualification> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the candidate qualifications from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of candidate qualifications.
	*
	* @return the number of candidate qualifications
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static CandidateQualificationPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (CandidateQualificationPersistence)PortletBeanLocatorUtil.locate(com.hrms.service.ClpSerializer.getServletContextName(),
					CandidateQualificationPersistence.class.getName());

			ReferenceRegistry.registerReference(CandidateQualificationUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(CandidateQualificationPersistence persistence) {
	}

	private static CandidateQualificationPersistence _persistence;
}