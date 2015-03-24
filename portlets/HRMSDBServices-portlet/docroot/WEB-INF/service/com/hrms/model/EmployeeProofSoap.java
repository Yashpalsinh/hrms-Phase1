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
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.hrms.service.http.EmployeeProofServiceSoap}.
 *
 * @author bhavik
 * @see com.hrms.service.http.EmployeeProofServiceSoap
 * @generated
 */
public class EmployeeProofSoap implements Serializable {
	public static EmployeeProofSoap toSoapModel(EmployeeProof model) {
		EmployeeProofSoap soapModel = new EmployeeProofSoap();

		soapModel.setEmployeeproofNo(model.getEmployeeproofNo());
		soapModel.setProofId(model.getProofId());
		soapModel.setUserId(model.getUserId());
		soapModel.setExpirationDate(model.getExpirationDate());

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
		return _employeeproofNo;
	}

	public void setPrimaryKey(long pk) {
		setEmployeeproofNo(pk);
	}

	public long getEmployeeproofNo() {
		return _employeeproofNo;
	}

	public void setEmployeeproofNo(long employeeproofNo) {
		_employeeproofNo = employeeproofNo;
	}

	public long getProofId() {
		return _proofId;
	}

	public void setProofId(long proofId) {
		_proofId = proofId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public Date getExpirationDate() {
		return _expirationDate;
	}

	public void setExpirationDate(Date expirationDate) {
		_expirationDate = expirationDate;
	}

	private long _employeeproofNo;
	private long _proofId;
	private long _userId;
	private Date _expirationDate;
}