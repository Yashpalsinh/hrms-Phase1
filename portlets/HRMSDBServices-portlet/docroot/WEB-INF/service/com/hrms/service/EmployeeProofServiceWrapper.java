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
 * Provides a wrapper for {@link EmployeeProofService}.
 *
 * @author bhavik
 * @see EmployeeProofService
 * @generated
 */
public class EmployeeProofServiceWrapper implements EmployeeProofService,
	ServiceWrapper<EmployeeProofService> {
	public EmployeeProofServiceWrapper(
		EmployeeProofService employeeProofService) {
		_employeeProofService = employeeProofService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _employeeProofService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_employeeProofService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _employeeProofService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public EmployeeProofService getWrappedEmployeeProofService() {
		return _employeeProofService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedEmployeeProofService(
		EmployeeProofService employeeProofService) {
		_employeeProofService = employeeProofService;
	}

	@Override
	public EmployeeProofService getWrappedService() {
		return _employeeProofService;
	}

	@Override
	public void setWrappedService(EmployeeProofService employeeProofService) {
		_employeeProofService = employeeProofService;
	}

	private EmployeeProofService _employeeProofService;
}