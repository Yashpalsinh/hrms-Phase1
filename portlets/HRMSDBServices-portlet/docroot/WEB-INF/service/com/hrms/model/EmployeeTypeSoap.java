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
 * This class is used by SOAP remote services, specifically {@link com.hrms.service.http.EmployeeTypeServiceSoap}.
 *
 * @author yashpalsinh
 * @see com.hrms.service.http.EmployeeTypeServiceSoap
 * @generated
 */
public class EmployeeTypeSoap implements Serializable {
	public static EmployeeTypeSoap toSoapModel(EmployeeType model) {
		EmployeeTypeSoap soapModel = new EmployeeTypeSoap();

		soapModel.setEmployeeTypeId(model.getEmployeeTypeId());
		soapModel.setEmployeeTypeName(model.getEmployeeTypeName());
		soapModel.setStatus(model.getStatus());

		return soapModel;
	}

	public static EmployeeTypeSoap[] toSoapModels(EmployeeType[] models) {
		EmployeeTypeSoap[] soapModels = new EmployeeTypeSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static EmployeeTypeSoap[][] toSoapModels(EmployeeType[][] models) {
		EmployeeTypeSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new EmployeeTypeSoap[models.length][models[0].length];
		}
		else {
			soapModels = new EmployeeTypeSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static EmployeeTypeSoap[] toSoapModels(List<EmployeeType> models) {
		List<EmployeeTypeSoap> soapModels = new ArrayList<EmployeeTypeSoap>(models.size());

		for (EmployeeType model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new EmployeeTypeSoap[soapModels.size()]);
	}

	public EmployeeTypeSoap() {
	}

	public long getPrimaryKey() {
		return _employeeTypeId;
	}

	public void setPrimaryKey(long pk) {
		setEmployeeTypeId(pk);
	}

	public long getEmployeeTypeId() {
		return _employeeTypeId;
	}

	public void setEmployeeTypeId(long employeeTypeId) {
		_employeeTypeId = employeeTypeId;
	}

	public String getEmployeeTypeName() {
		return _employeeTypeName;
	}

	public void setEmployeeTypeName(String employeeTypeName) {
		_employeeTypeName = employeeTypeName;
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

	private long _employeeTypeId;
	private String _employeeTypeName;
	private boolean _status;
}