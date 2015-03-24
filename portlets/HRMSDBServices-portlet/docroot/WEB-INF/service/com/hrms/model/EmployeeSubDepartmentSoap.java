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
 * This class is used by SOAP remote services, specifically {@link com.hrms.service.http.EmployeeSubDepartmentServiceSoap}.
 *
 * @author yashpalsinh
 * @see com.hrms.service.http.EmployeeSubDepartmentServiceSoap
 * @generated
 */
public class EmployeeSubDepartmentSoap implements Serializable {
	public static EmployeeSubDepartmentSoap toSoapModel(
		EmployeeSubDepartment model) {
		EmployeeSubDepartmentSoap soapModel = new EmployeeSubDepartmentSoap();

		soapModel.setEmployeeSubDepartmentId(model.getEmployeeSubDepartmentId());
		soapModel.setSubDepartmentName(model.getSubDepartmentName());
		soapModel.setEmployeeDepartmentId(model.getEmployeeDepartmentId());
		soapModel.setStatus(model.getStatus());

		return soapModel;
	}

	public static EmployeeSubDepartmentSoap[] toSoapModels(
		EmployeeSubDepartment[] models) {
		EmployeeSubDepartmentSoap[] soapModels = new EmployeeSubDepartmentSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static EmployeeSubDepartmentSoap[][] toSoapModels(
		EmployeeSubDepartment[][] models) {
		EmployeeSubDepartmentSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new EmployeeSubDepartmentSoap[models.length][models[0].length];
		}
		else {
			soapModels = new EmployeeSubDepartmentSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static EmployeeSubDepartmentSoap[] toSoapModels(
		List<EmployeeSubDepartment> models) {
		List<EmployeeSubDepartmentSoap> soapModels = new ArrayList<EmployeeSubDepartmentSoap>(models.size());

		for (EmployeeSubDepartment model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new EmployeeSubDepartmentSoap[soapModels.size()]);
	}

	public EmployeeSubDepartmentSoap() {
	}

	public long getPrimaryKey() {
		return _employeeSubDepartmentId;
	}

	public void setPrimaryKey(long pk) {
		setEmployeeSubDepartmentId(pk);
	}

	public long getEmployeeSubDepartmentId() {
		return _employeeSubDepartmentId;
	}

	public void setEmployeeSubDepartmentId(long employeeSubDepartmentId) {
		_employeeSubDepartmentId = employeeSubDepartmentId;
	}

	public String getSubDepartmentName() {
		return _subDepartmentName;
	}

	public void setSubDepartmentName(String subDepartmentName) {
		_subDepartmentName = subDepartmentName;
	}

	public long getEmployeeDepartmentId() {
		return _employeeDepartmentId;
	}

	public void setEmployeeDepartmentId(long employeeDepartmentId) {
		_employeeDepartmentId = employeeDepartmentId;
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

	private long _employeeSubDepartmentId;
	private String _subDepartmentName;
	private long _employeeDepartmentId;
	private boolean _status;
}