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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.hrms.service.http.EmployeeDepartmentServiceSoap}.
 *
 * @author yashpalsinh
 * @see com.hrms.service.http.EmployeeDepartmentServiceSoap
 * @generated
 */
public class EmployeeDepartmentSoap implements Serializable {
	public static EmployeeDepartmentSoap toSoapModel(EmployeeDepartment model) {
		EmployeeDepartmentSoap soapModel = new EmployeeDepartmentSoap();

		soapModel.setEmployeeDepartmentId(model.getEmployeeDepartmentId());
		soapModel.setDepartmentName(model.getDepartmentName());
		soapModel.setStatus(model.getStatus());

		return soapModel;
	}

	public static EmployeeDepartmentSoap[] toSoapModels(
		EmployeeDepartment[] models) {
		EmployeeDepartmentSoap[] soapModels = new EmployeeDepartmentSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static EmployeeDepartmentSoap[][] toSoapModels(
		EmployeeDepartment[][] models) {
		EmployeeDepartmentSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new EmployeeDepartmentSoap[models.length][models[0].length];
		}
		else {
			soapModels = new EmployeeDepartmentSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static EmployeeDepartmentSoap[] toSoapModels(
		List<EmployeeDepartment> models) {
		List<EmployeeDepartmentSoap> soapModels = new ArrayList<EmployeeDepartmentSoap>(models.size());

		for (EmployeeDepartment model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new EmployeeDepartmentSoap[soapModels.size()]);
	}

	public EmployeeDepartmentSoap() {
	}

	public long getPrimaryKey() {
		return _employeeDepartmentId;
	}

	public void setPrimaryKey(long pk) {
		setEmployeeDepartmentId(pk);
	}

	public long getEmployeeDepartmentId() {
		return _employeeDepartmentId;
	}

	public void setEmployeeDepartmentId(long employeeDepartmentId) {
		_employeeDepartmentId = employeeDepartmentId;
	}

	public String getDepartmentName() {
		return _departmentName;
	}

	public void setDepartmentName(String departmentName) {
		_departmentName = departmentName;
	}

	public boolean getStatus() {
		return _status;
	}

	public boolean isStatus() {
		return _status;
	}

	public void setStatus(boolean status) {
		_status = status;
	}

	private long _employeeDepartmentId;
	private String _departmentName;
	private boolean _status;
}