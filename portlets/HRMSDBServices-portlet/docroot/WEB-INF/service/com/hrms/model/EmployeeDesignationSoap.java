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
 * This class is used by SOAP remote services, specifically {@link com.hrms.service.http.EmployeeDesignationServiceSoap}.
 *
 * @author bhavik
 * @see com.hrms.service.http.EmployeeDesignationServiceSoap
 * @generated
 */
public class EmployeeDesignationSoap implements Serializable {
	public static EmployeeDesignationSoap toSoapModel(EmployeeDesignation model) {
		EmployeeDesignationSoap soapModel = new EmployeeDesignationSoap();

		soapModel.setEmployeeDesignationId(model.getEmployeeDesignationId());
		soapModel.setDesignationName(model.getDesignationName());
		soapModel.setStatus(model.getStatus());

		return soapModel;
	}

	public static EmployeeDesignationSoap[] toSoapModels(
		EmployeeDesignation[] models) {
		EmployeeDesignationSoap[] soapModels = new EmployeeDesignationSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static EmployeeDesignationSoap[][] toSoapModels(
		EmployeeDesignation[][] models) {
		EmployeeDesignationSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new EmployeeDesignationSoap[models.length][models[0].length];
		}
		else {
			soapModels = new EmployeeDesignationSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static EmployeeDesignationSoap[] toSoapModels(
		List<EmployeeDesignation> models) {
		List<EmployeeDesignationSoap> soapModels = new ArrayList<EmployeeDesignationSoap>(models.size());

		for (EmployeeDesignation model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new EmployeeDesignationSoap[soapModels.size()]);
	}

	public EmployeeDesignationSoap() {
	}

	public long getPrimaryKey() {
		return _employeeDesignationId;
	}

	public void setPrimaryKey(long pk) {
		setEmployeeDesignationId(pk);
	}

	public long getEmployeeDesignationId() {
		return _employeeDesignationId;
	}

	public void setEmployeeDesignationId(long employeeDesignationId) {
		_employeeDesignationId = employeeDesignationId;
	}

	public String getDesignationName() {
		return _designationName;
	}

	public void setDesignationName(String designationName) {
		_designationName = designationName;
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

	private long _employeeDesignationId;
	private String _designationName;
	private boolean _status;
}