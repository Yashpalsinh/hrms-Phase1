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

package com.hrms.service.impl;

import java.util.List;

import com.hrms.model.Todo;
import com.hrms.service.base.TodoLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the todo local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.hrms.service.TodoLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author yashpalsinh
 * @see com.hrms.service.base.TodoLocalServiceBaseImpl
 * @see com.hrms.service.TodoLocalServiceUtil
 */
public class TodoLocalServiceImpl extends TodoLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.hrms.service.TodoLocalServiceUtil} to access the todo local service.
	 */
	public List<Todo> findUserById(long userId) throws SystemException
	{
		return todoPersistence.findByuserId(userId);
		
	}
}