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

package com.hrms.model.impl;

import com.hrms.model.Todo;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Todo in entity cache.
 *
 * @author bhavik
 * @see Todo
 * @generated
 */
public class TodoCacheModel implements CacheModel<Todo>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{taskId=");
		sb.append(taskId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", date=");
		sb.append(date);
		sb.append(", taskDetails=");
		sb.append(taskDetails);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Todo toEntityModel() {
		TodoImpl todoImpl = new TodoImpl();

		todoImpl.setTaskId(taskId);
		todoImpl.setUserId(userId);

		if (date == null) {
			todoImpl.setDate(StringPool.BLANK);
		}
		else {
			todoImpl.setDate(date);
		}

		if (taskDetails == null) {
			todoImpl.setTaskDetails(StringPool.BLANK);
		}
		else {
			todoImpl.setTaskDetails(taskDetails);
		}

		todoImpl.resetOriginalValues();

		return todoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		taskId = objectInput.readLong();
		userId = objectInput.readLong();
		date = objectInput.readUTF();
		taskDetails = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(taskId);
		objectOutput.writeLong(userId);

		if (date == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(date);
		}

		if (taskDetails == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(taskDetails);
		}
	}

	public long taskId;
	public long userId;
	public String date;
	public String taskDetails;
}