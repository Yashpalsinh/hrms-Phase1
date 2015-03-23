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
 * This class is used by SOAP remote services, specifically {@link com.hrms.service.http.ProofServiceSoap}.
 *
 * @author yashpalsinh
 * @see com.hrms.service.http.ProofServiceSoap
 * @generated
 */
public class ProofSoap implements Serializable {
	public static ProofSoap toSoapModel(Proof model) {
		ProofSoap soapModel = new ProofSoap();

		soapModel.setProofId(model.getProofId());
		soapModel.setProofType(model.getProofType());
		soapModel.setStatus(model.getStatus());

		return soapModel;
	}

	public static ProofSoap[] toSoapModels(Proof[] models) {
		ProofSoap[] soapModels = new ProofSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ProofSoap[][] toSoapModels(Proof[][] models) {
		ProofSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ProofSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ProofSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ProofSoap[] toSoapModels(List<Proof> models) {
		List<ProofSoap> soapModels = new ArrayList<ProofSoap>(models.size());

		for (Proof model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ProofSoap[soapModels.size()]);
	}

	public ProofSoap() {
	}

	public long getPrimaryKey() {
		return _proofId;
	}

	public void setPrimaryKey(long pk) {
		setProofId(pk);
	}

	public long getProofId() {
		return _proofId;
	}

	public void setProofId(long proofId) {
		_proofId = proofId;
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

	private long _proofId;
	private String _proofType;
	private boolean _status;
}