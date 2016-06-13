package com.ws.db.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
	

@Entity(name = "HC_BIZ_ACCOUNT")
public class Account {
	
	@Id
	@Column(name="id")  
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="record_id") 
	private int record_id;
	
	@Column(name="user_id") 
	private int user_id;
	
	@Column(name="amount") 
	private double amount;
	
	@Column(name="remarks") 
	private String remarks;
	 
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getRecord_id() {
		return record_id;
	}
	
	public void setRecord_id(int record_id) {
		this.record_id = record_id;
	}
	
	public int getUser_id() {
		return user_id;
	}
	
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public String getRemarks() {
		return remarks;
	}
	
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}


}
