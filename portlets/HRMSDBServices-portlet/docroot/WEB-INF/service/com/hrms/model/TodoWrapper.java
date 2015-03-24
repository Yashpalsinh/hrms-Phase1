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

package com.hrms.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Todo}.
 * </p>
 *
 * @author yashpalsinh
 * @see Todo
 * @generated
 */
public class TodoWrapper implements Todo, ModelWrapper<Todo> {
	public TodoWrapper(Todo todo) {
		_todo = todo;
	}

	@Override
	public Class<?> getModelClass() {
		return Todo.class;
	}

	@Override
	public String getModelClassName() {
		return Todo.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("taskId", getTaskId());
		attributes.put("userId", getUserId());
		attributes.put("date", getDate());
		attributes.put("taskDetails", getTaskDetails());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long taskId = (Long)attributes.get("taskId");

		if (taskId != null) {
			setTaskId(taskId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String date = (String)attributes.get("date");

		if (date != null) {
			setDate(date);
		}

		String taskDetails = (String)attributes.get("taskDetails");

		if (taskDetails != null) {
			setTaskDetails(taskDetails);
		}
	}

	/**
	* Returns the primary key of this todo.
	*
	* @return the primary key of this todo
	*/
	@Override
	public long getPrimaryKey() {
		return _todo.getPrimaryKey();
	}

	/**
	* Sets the primary key of this todo.
	*
	* @param primaryKey the primary key of this todo
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_todo.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the task ID of this todo.
	*
	* @return the task ID of this todo
	*/
	@Override
	public long getTaskId() {
		return _todo.getTaskId();
	}

	/**
	* Sets the task ID of this todo.
	*
	* @param taskId the task ID of this todo
	*/
	@Override
	public void setTaskId(long taskId) {
		_todo.setTaskId(taskId);
	}

	/**
	* Returns the user ID of this todo.
	*
	* @return the user ID of this todo
	*/
	@Override
	public long getUserId() {
		return _todo.getUserId();
	}

	/**
	* Sets the user ID of this todo.
	*
	* @param userId the user ID of this todo
	*/
	@Override
	public void setUserId(long userId) {
		_todo.setUserId(userId);
	}

	/**
	* Returns the user uuid of this todo.
	*
	* @return the user uuid of this todo
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _todo.getUserUuid();
	}

	/**
	* Sets the user uuid of this todo.
	*
	* @param userUuid the user uuid of this todo
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_todo.setUserUuid(userUuid);
	}

	/**
	* Returns the date of this todo.
	*
	* @return the date of this todo
	*/
	@Override
	public java.lang.String getDate() {
		return _todo.getDate();
	}

	/**
	* Sets the date of this todo.
	*
	* @param date the date of this todo
	*/
	@Override
	public void setDate(java.lang.String date) {
		_todo.setDate(date);
	}

	/**
	* Returns the task details of this todo.
	*
	* @return the task details of this todo
	*/
	@Override
	public java.lang.String getTaskDetails() {
		return _todo.getTaskDetails();
	}

	/**
	* Sets the task details of this todo.
	*
	* @param taskDetails the task details of this todo
	*/
	@Override
	public void setTaskDetails(java.lang.String taskDetails) {
		_todo.setTaskDetails(taskDetails);
	}

	@Override
	public boolean isNew() {
		return _todo.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_todo.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _todo.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_todo.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _todo.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _todo.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_todo.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _todo.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_todo.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_todo.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_todo.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TodoWrapper((Todo)_todo.clone());
	}

	@Override
	public int compareTo(com.hrms.model.Todo todo) {
		return _todo.compareTo(todo);
	}

	@Override
	public int hashCode() {
		return _todo.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.hrms.model.Todo> toCacheModel() {
		return _todo.toCacheModel();
	}

	@Override
	public com.hrms.model.Todo toEscapedModel() {
		return new TodoWrapper(_todo.toEscapedModel());
	}

	@Override
	public com.hrms.model.Todo toUnescapedModel() {
		return new TodoWrapper(_todo.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _todo.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _todo.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_todo.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TodoWrapper)) {
			return false;
		}

		TodoWrapper todoWrapper = (TodoWrapper)obj;

		if (Validator.equals(_todo, todoWrapper._todo)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Todo getWrappedTodo() {
		return _todo;
	}

	@Override
	public Todo getWrappedModel() {
		return _todo;
	}

	@Override
	public void resetOriginalValues() {
		_todo.resetOriginalValues();
	}

	private Todo _todo;
}