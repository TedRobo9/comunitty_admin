package com.uacity.admin.domain;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
	

@Entity(name = "HC_SYS_ROLE")
public class Role {
	
	@Id
	@Column(name="id")  
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="rolename") 
	private String rolename;
	
	@Column(name="roledesc") 
	private String roledesc;
	
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
	
	public String getRolename() {
		return rolename;
	}
	
	public void setRolename(String rolename) {
		this.rolename = rolename;
	}
	
	public String getRoledesc() {
		return roledesc;
	}
	
	public void setRoledesc(String roledesc) {
		this.roledesc = roledesc;
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
