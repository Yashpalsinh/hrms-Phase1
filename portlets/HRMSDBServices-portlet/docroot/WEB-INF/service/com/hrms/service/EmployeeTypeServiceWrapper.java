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
 * Provides a wrapper for {@link EmployeeTypeService}.
 *
 * @author yashpalsinh
 * @see EmployeeTypeService
 * @generated
 */
public class EmployeeTypeServiceWrapper implements EmployeeTypeService,
	ServiceWrapper<EmployeeTypeService> {
	public EmployeeTypeServiceWrapper(EmployeeTypeService employeeTypeService) {
		_employeeTypeService = employeeTypeService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _employeeTypeService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_employeeTypeService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _employeeTypeService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public EmployeeTypeService getWrappedEmployeeTypeService() {
		return _employeeTypeService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedEmployeeTypeService(
		EmployeeTypeService employeeTypeService) {
		_employeeTypeService = employeeTypeService;
	}

	@Override
	public EmployeeTypeService getWrappedService() {
		return _employeeTypeService;
	}

	@Override
	public void setWrappedService(EmployeeTypeService employeeTypeService) {
		_employeeTypeService = employeeTypeService;
	}

	private EmployeeTypeService _employeeTypeService;
}