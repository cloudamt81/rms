package com.acme.rms.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "srf_transaction_details")
public class SrfTransactionDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	String srfTransId;
	String type;
	String candidateName;
	Date doj;
	Integer ectc;
	Integer ctc;
	String stage;
	Integer status;
	Date statusDate;
	String ealuator;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSrfTransId() {
		return srfTransId;
	}

	public void setSrfTransId(String srfTransId) {
		this.srfTransId = srfTransId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCandidateName() {
		return candidateName;
	}

	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}

	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}

	public Integer getEctc() {
		return ectc;
	}

	public void setEctc(Integer ectc) {
		this.ectc = ectc;
	}

	public Integer getCtc() {
		return ctc;
	}

	public void setCtc(Integer ctc) {
		this.ctc = ctc;
	}

	public String getStage() {
		return stage;
	}

	public void setStage(String stage) {
		this.stage = stage;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Date getStatusDate() {
		return statusDate;
	}

	public void setStatusDate(Date statusDate) {
		this.statusDate = statusDate;
	}

	public String getEaluator() {
		return ealuator;
	}

	public void setEaluator(String ealuator) {
		this.ealuator = ealuator;
	}

}
