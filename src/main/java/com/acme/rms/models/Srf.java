package com.acme.rms.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "srf")
public class Srf {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	Integer srfNo;
	String skill;
	String client;
	Integer positions;
	String location;
	String createdBy;// empId;
	String updateDate;

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

	public String getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}

	public void setPositions(Integer positions) {
		this.positions = positions;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public Integer getPositions() {
		return positions;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Srf(Integer srfNo, String skill, String client, Integer positions, String location, String createdBy,
			String updateDate) {
		
		this.srfNo = srfNo;
		this.skill = skill;
		this.client = client;
		this.positions = positions;
		this.location = location;
		this.createdBy = createdBy;
		this.updateDate = updateDate;
	}

}
