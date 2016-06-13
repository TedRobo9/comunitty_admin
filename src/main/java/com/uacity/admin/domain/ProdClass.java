package com.ws.db.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "HC_BIZ_PRODCLASS")
public class ProdClass {
	
	@Id
	@Column(name="id")  
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="parentid") 
	private String parentid;
	
	@Column(name="clsename") 
	private String clsename;
	
	@Column(name="isvalid") 
	private boolean isvalid;
	
	@Column(name="editdate") 
	private Date editdate;
	
	@Column(name="remarks") 
	private String remarks;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getParentid() {
		return parentid;
	}

	public void setParentid(String parentid) {
		this.parentid = parentid;
	}

	public String getClsename() {
		return clsename;
	}

	public void setClsename(String clsename) {
		this.clsename = clsename;
	}

	public boolean isIsvalid() {
		return isvalid;
	}

	public void setIsvalid(boolean isvalid) {
		this.isvalid = isvalid;
	}

	public Date getEditdate() {
		return editdate;
	}

	public void setEditdate(Date editdate) {
		this.editdate = editdate;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	
}