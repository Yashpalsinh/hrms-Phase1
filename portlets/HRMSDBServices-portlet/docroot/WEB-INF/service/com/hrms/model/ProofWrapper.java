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
 * This class is a wrapper for {@link Proof}.
 * </p>
 *
 * @author bhavik
 * @see Proof
 * @generated
 */
public class ProofWrapper implements Proof, ModelWrapper<Proof> {
	public ProofWrapper(Proof proof) {
		_proof = proof;
	}

	@Override
	public Class<?> getModelClass() {
		return Proof.class;
	}

	@Override
	public String getModelClassName() {
		return Proof.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("proofId", getProofId());
		attributes.put("proofType", getProofType());
		attributes.put("status", getStatus());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long proofId = (Long)attributes.get("proofId");

		if (proofId != null) {
			setProofId(proofId);
		}

		String proofType = (String)attributes.get("proofType");

		if (proofType != null) {
			setProofType(proofType);
		}

		Boolean status = (Boolean)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}
	}

	/**
	* Returns the primary key of this proof.
	*
	* @return the primary key of this proof
	*/
	@Override
	public long getPrimaryKey() {
		return _proof.getPrimaryKey();
	}

	/**
	* Sets the primary key of this proof.
	*
	* @param primaryKey the primary key of this proof
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_proof.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the proof ID of this proof.
	*
	* @return the proof ID of this proof
	*/
	@Override
	public long getProofId() {
		return _proof.getProofId();
	}

	/**
	* Sets the proof ID of this proof.
	*
	* @param proofId the proof ID of this proof
	*/
	@Override
	public void setProofId(long proofId) {
		_proof.setProofId(proofId);
	}

	/**
	* Returns the proof type of this proof.
	*
	* @return the proof type of this proof
	*/
	@Override
	public java.lang.String getProofType() {
		return _proof.getProofType();
	}

	/**
	* Sets the proof type of this proof.
	*
	* @param proofType the proof type of this proof
	*/
	@Override
	public void setProofType(java.lang.String proofType) {
		_proof.setProofType(proofType);
	}

	/**
	* Returns the status of this proof.
	*
	* @return the status of this proof
	*/
	@Override
	public boolean getStatus() {
		return _proof.getStatus();
	}

	/**
	* Returns <code>true</code> if this proof is status.
	*
	* @return <code>true</code> if this proof is status; <code>false</code> otherwise
	*/
	@Override
	public boolean isStatus() {
		return _proof.isStatus();
	}

	/**
	* Sets whether this proof is status.
	*
	* @param status the status of this proof
	*/
	@Override
	public void setStatus(boolean status) {
		_proof.setStatus(status);
	}

	@Override
	public boolean isNew() {
		return _proof.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_proof.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _proof.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_proof.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _proof.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _proof.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_proof.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _proof.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_proof.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_proof.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_proof.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ProofWrapper((Proof)_proof.clone());
	}

	@Override
	public int compareTo(Proof proof) {
		return _proof.compareTo(proof);
	}

	@Override
	public int hashCode() {
		return _proof.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<Proof> toCacheModel() {
		return _proof.toCacheModel();
	}

	@Override
	public Proof toEscapedModel() {
		return new ProofWrapper(_proof.toEscapedModel());
	}

	@Override
	public Proof toUnescapedModel() {
		return new ProofWrapper(_proof.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _proof.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _proof.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_proof.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ProofWrapper)) {
			return false;
		}

		ProofWrapper proofWrapper = (ProofWrapper)obj;

		if (Validator.equals(_proof, proofWrapper._proof)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Proof getWrappedProof() {
		return _proof;
	}

	@Override
	public Proof getWrappedModel() {
		return _proof;
	}

	@Override
	public void resetOriginalValues() {
		_proof.resetOriginalValues();
	}

	private Proof _proof;
}