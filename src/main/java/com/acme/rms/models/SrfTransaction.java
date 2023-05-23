package com.acme.rms.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "srf_transaction")
public class SrfTransaction {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	Integer srfNo;
	Date updateDate;
	String srfTransactionId;
	String empId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getSrfNo() {
		return srfNo;
	}

	public void setSrfNo(Integer srfNo) {
		this.srfNo = srfNo;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getSrfTransactionId() {
		return srfTransactionId;
	}

	public void setSrfTransactionId(String srfTransactionId) {
		this.srfTransactionId = srfTransactionId;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public SrfTransaction(Integer srfNo, Date updateDate, String srfTransactionId, String empId) {
		super();
		this.srfNo = srfNo;
		this.updateDate = updateDate;
		this.srfTransactionId = srfTransactionId;
		this.empId = empId;
	}

}
