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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for LeavesApplied. This utility wraps
 * {@link com.hrms.service.impl.LeavesAppliedLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author bhavik
 * @see LeavesAppliedLocalService
 * @see com.hrms.service.base.LeavesAppliedLocalServiceBaseImpl
 * @see com.hrms.service.impl.LeavesAppliedLocalServiceImpl
 * @generated
 */
public class LeavesAppliedLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.hrms.service.impl.LeavesAppliedLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the leaves applied to the database. Also notifies the appropriate model listeners.
	*
	* @param leavesApplied the leaves applied
	* @return the leaves applied that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.LeavesApplied addLeavesApplied(
		com.hrms.model.LeavesApplied leavesApplied)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addLeavesApplied(leavesApplied);
	}

	/**
	* Creates a new leaves applied with the primary key. Does not add the leaves applied to the database.
	*
	* @param appliedLeaveId the primary key for the new leaves applied
	* @return the new leaves applied
	*/
	public static com.hrms.model.LeavesApplied createLeavesApplied(
		long appliedLeaveId) {
		return getService().createLeavesApplied(appliedLeaveId);
	}

	/**
	* Deletes the leaves applied with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param appliedLeaveId the primary key of the leaves applied
	* @return the leaves applied that was removed
	* @throws PortalException if a leaves applied with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.LeavesApplied deleteLeavesApplied(
		long appliedLeaveId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteLeavesApplied(appliedLeaveId);
	}

	/**
	* Deletes the leaves applied from the database. Also notifies the appropriate model listeners.
	*
	* @param leavesApplied the leaves applied
	* @return the leaves applied that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.LeavesApplied deleteLeavesApplied(
		com.hrms.model.LeavesApplied leavesApplied)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteLeavesApplied(leavesApplied);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.LeavesAppliedModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.LeavesAppliedModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.hrms.model.LeavesApplied fetchLeavesApplied(
		long appliedLeaveId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchLeavesApplied(appliedLeaveId);
	}

	/**
	* Returns the leaves applied with the primary key.
	*
	* @param appliedLeaveId the primary key of the leaves applied
	* @return the leaves applied
	* @throws PortalException if a leaves applied with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.LeavesApplied getLeavesApplied(
		long appliedLeaveId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getLeavesApplied(appliedLeaveId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the leaves applieds.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.LeavesAppliedModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of leaves applieds
	* @param end the upper bound of the range of leaves applieds (not inclusive)
	* @return the range of leaves applieds
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hrms.model.LeavesApplied> getLeavesApplieds(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getLeavesApplieds(start, end);
	}

	/**
	* Returns the number of leaves applieds.
	*
	* @return the number of leaves applieds
	* @throws SystemException if a system exception occurred
	*/
	public static int getLeavesAppliedsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getLeavesAppliedsCount();
	}

	/**
	* Updates the leaves applied in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param leavesApplied the leaves applied
	* @return the leaves applied that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.hrms.model.LeavesApplied updateLeavesApplied(
		com.hrms.model.LeavesApplied leavesApplied)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateLeavesApplied(leavesApplied);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static void clearService() {
		_service = null;
	}

	public static LeavesAppliedLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					LeavesAppliedLocalService.class.getName());

			if (invokableLocalService instanceof LeavesAppliedLocalService) {
				_service = (LeavesAppliedLocalService)invokableLocalService;
			}
			else {
				_service = new LeavesAppliedLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(LeavesAppliedLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(LeavesAppliedLocalService service) {
	}

	private static LeavesAppliedLocalService _service;
}