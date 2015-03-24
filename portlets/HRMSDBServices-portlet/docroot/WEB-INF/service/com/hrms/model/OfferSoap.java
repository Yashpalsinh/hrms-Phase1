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
 * This class is used by SOAP remote services, specifically {@link com.hrms.service.http.OfferServiceSoap}.
 *
 * @author bhavik
 * @see com.hrms.service.http.OfferServiceSoap
 * @generated
 */
public class OfferSoap implements Serializable {
	public static OfferSoap toSoapModel(Offer model) {
		OfferSoap soapModel = new OfferSoap();

		soapModel.setOfferId(model.getOfferId());
		soapModel.setCandidateId(model.getCandidateId());
		soapModel.setEmployeeDepartmentId(model.getEmployeeDepartmentId());
		soapModel.setEmployeeSubDepartmentId(model.getEmployeeSubDepartmentId());
		soapModel.setEmployeeDesignationId(model.getEmployeeDesignationId());
		soapModel.setEmployeeTypeId(model.getEmployeeTypeId());
		soapModel.setSalary(model.getSalary());
		soapModel.setJoiningDate(model.getJoiningDate());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setCreateBy(model.getCreateBy());
		soapModel.setModifiedBy(model.getModifiedBy());

		return soapModel;
	}

	public static OfferSoap[] toSoapModels(Offer[] models) {
		OfferSoap[] soapModels = new OfferSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static OfferSoap[][] toSoapModels(Offer[][] models) {
		OfferSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new OfferSoap[models.length][models[0].length];
		}
		else {
			soapModels = new OfferSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static OfferSoap[] toSoapModels(List<Offer> models) {
		List<OfferSoap> soapModels = new ArrayList<OfferSoap>(models.size());

		for (Offer model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new OfferSoap[soapModels.size()]);
	}

	public OfferSoap() {
	}

	public long getPrimaryKey() {
		return _OfferId;
	}

	public void setPrimaryKey(long pk) {
		setOfferId(pk);
	}

	public long getOfferId() {
		return _OfferId;
	}

	public void setOfferId(long OfferId) {
		_OfferId = OfferId;
	}

	public long getCandidateId() {
		return _candidateId;
	}

	public void setCandidateId(long candidateId) {
		_candidateId = candidateId;
	}

	public long getEmployeeDepartmentId() {
		return _employeeDepartmentId;
	}

	public void setEmployeeDepartmentId(long employeeDepartmentId) {
		_employeeDepartmentId = employeeDepartmentId;
	}

	public long getEmployeeSubDepartmentId() {
		return _employeeSubDepartmentId;
	}

	public void setEmployeeSubDepartmentId(long employeeSubDepartmentId) {
		_employeeSubDepartmentId = employeeSubDepartmentId;
	}

	public long getEmployeeDesignationId() {
		return _employeeDesignationId;
	}

	public void setEmployeeDesignationId(long employeeDesignationId) {
		_employeeDesignationId = employeeDesignationId;
	}

	public long getEmployeeTypeId() {
		return _employeeTypeId;
	}

	public void setEmployeeTypeId(long employeeTypeId) {
		_employeeTypeId = employeeTypeId;
	}

	public long getSalary() {
		return _salary;
	}

	public void setSalary(long salary) {
		_salary = salary;
	}

	public Date getJoiningDate() {
		return _joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		_joiningDate = joiningDate;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public long getCreateBy() {
		return _createBy;
	}

	public void setCreateBy(long createBy) {
		_createBy = createBy;
	}

	public long getModifiedBy() {
		return _modifiedBy;
	}

	public void setModifiedBy(long modifiedBy) {
		_modifiedBy = modifiedBy;
	}

	private long _OfferId;
	private long _candidateId;
	private long _employeeDepartmentId;
	private long _employeeSubDepartmentId;
	private long _employeeDesignationId;
	private long _employeeTypeId;
	private long _salary;
	private Date _joiningDate;
	private Date _createDate;
	private Date _modifiedDate;
	private long _createBy;
	private long _modifiedBy;
}