package com.ws.db.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "HC_SYS_ROLE_USER")
public class RoleUser {
	
	@Id
	@Column(name="id")  
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="role_id") 
	private int role_id;
	
	@Column(name="user_id") 
	private int user_id;
	
	@Column(name="optusername") 
	private String optusername;
	
	@Column(name="optdate") 
	private Date optdate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRole_id() {
		return role_id;
	}

	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getOptusername() {
		return optusername;
	}

	public void setOptusername(String optusername) {
		this.optusername = optusername;
	}

	public Date getOptdate() {
		return optdate;
	}

	public void setOptdate(Date optdate) {
		this.optdate = optdate;
	}
	
	
	
}
