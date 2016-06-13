package com.ws.db.model;


import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
	

@Entity(name = "HC_BIZ_INTEGRALRECORD")
public class Integralrecord {
	
	@Id
	@Column(name="id")  
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="userid") 
	private int userid;
	
	@Column(name="orderid") 
	private String orderid;
	
	@Column(name="totalpoints") 
	private int totalpoints;
	
	@Column(name="gettype") 
	private GetType gettype;
	
	@Column(name="pointstype") 
	private PointsType pointstype;
	
	@Column(name="sycpoints") 
	private double sycpoints;
	
	@Column(name="costdate") 
	private Date costdate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getOrderid() {
		return orderid;
	}

	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}

	public int getTotalpoints() {
		return totalpoints;
	}

	public void setTotalpoints(int totalpoints) {
		this.totalpoints = totalpoints;
	}

	public double getSycpoints() {
		return sycpoints;
	}

	public void setSycpoints(double sycpoints) {
		this.sycpoints = sycpoints;
	}

	public Date getCostdate() {
		return costdate;
	}

	public void setCostdate(Date costdate) {
		this.costdate = costdate;
	}
	
}
