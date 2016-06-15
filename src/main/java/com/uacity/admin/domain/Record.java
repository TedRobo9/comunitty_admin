package com.uacity.admin.domain;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "HC_BIZ_RECORD")
public class Record {
	
	@Id
	@Column(name="id")  
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="order_id") 
	private int order_id;
	
	@Column(name="user_id") 
	private int user_id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public PointsType getPointstype() {
		return pointstype;
	}

	public void setPointstype(PointsType pointstype) {
		this.pointstype = pointstype;
	}

	public double getNocommission() {
		return nocommission;
	}

	public void setNocommission(double nocommission) {
		this.nocommission = nocommission;
	}

	public Date getRecordtime() {
		return recordtime;
	}

	public void setRecordtime(Date recordtime) {
		this.recordtime = recordtime;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public GetType getGettype() {
		return gettype;
	}

	public void setGettype(GetType gettype) {
		this.gettype = gettype;
	}

	@Column(name="pointstype") 
	private PointsType pointstype;
	
	@Column(name="nocommission") 
	private double nocommission;
	
	@Column(name="recordtime") 
	private Date recordtime;
	
	@Column(name="remarks") 
	private String remarks;
	
	@Column(name="gettype") 
	private GetType gettype;
	
	
	
}
