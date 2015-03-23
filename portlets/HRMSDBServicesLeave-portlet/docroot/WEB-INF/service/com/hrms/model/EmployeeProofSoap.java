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
 * This class is used by SOAP remote services, specifically {@link com.hrms.service.http.EmployeeProofServiceSoap}.
 *
 * @author yashpalsinh
 * @see com.hrms.service.http.EmployeeProofServiceSoap
 * @generated
 */
public class EmployeeProofSoap implements Serializable {
	public static EmployeeProofSoap toSoapModel(EmployeeProof model) {
		EmployeeProofSoap soapModel = new EmployeeProofSoap();

		soapModel.setEmployeeProofId(model.getEmployeeProofId());
		soapModel.setProofType(model.getProofType());
		soapModel.setStatus(model.getStatus());

		return soapModel;
	}

	public static EmployeeProofSoap[] toSoapModels(EmployeeProof[] models) {
		EmployeeProofSoap[] soapModels = new EmployeeProofSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static EmployeeProofSoap[][] toSoapModels(EmployeeProof[][] models) {
		EmployeeProofSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new EmployeeProofSoap[models.length][models[0].length];
		}
		else {
			soapModels = new EmployeeProofSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static EmployeeProofSoap[] toSoapModels(List<EmployeeProof> models) {
		List<EmployeeProofSoap> soapModels = new ArrayList<EmployeeProofSoap>(models.size());

		for (EmployeeProof model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new EmployeeProofSoap[soapModels.size()]);
	}

	public EmployeeProofSoap() {
	}

	public long getPrimaryKey() {
		return _employeeProofId;
	}

	public void setPrimaryKey(long pk) {
		setEmployeeProofId(pk);
	}

	public long getEmployeeProofId() {
		return _employeeProofId;
	}

	public void setEmployeeProofId(long employeeProofId) {
		_employeeProofId = employeeProofId;
	}

	public String getProofType() {
		return _proofType;
	}

	public void setProofType(String proofType) {
		_proofType = proofType;
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

	private long _employeeProofId;
	private String _proofType;
	private boolean _status;
}