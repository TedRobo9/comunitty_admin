package com.uacity.admin.domain;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity(name = "HC_SYS_ADMIN")
public class AdminInfo {
	
	

	@Id
	@Column(name="userid")  
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userid;
	
	@Column(name="username") 
	private String username;
	
	@Column(name="realname") 
	private String realname;
	
	@Column(name="password") 
	private String password;
	
	@Transient
	private String password2;
	
	@Transient
	private String oper;
	
	public String getOper() {
		return oper;
	}

	public void setOper(String oper) {
		this.oper = oper;
	}

	@Transient
	private int page;
	
	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}
	
	public String getPassword2() {
		return password2;
	}

	public void setPassword2(String password2) {
		this.password2 = password2;
	}

	@Column(name="uphone") 
	private String uphone;
	
	@Column(name="descript") 
	private String desc;
	
	@Column(name="isvalid") 
	private boolean isvalid;
	
	@Column(name="regclsdate") 
	private Date regclsdate;
	
	@Column(name="optusername") 
	private String optusername;
	
	@Column(name="optdate") 
	private Date optdate;

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getRealname() {
		return realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUphone() {
		return uphone;
	}

	public void setUphone(String uphone) {
		this.uphone = uphone;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public boolean isIsvalid() {
		return isvalid;
	}

	public void setIsvalid(boolean isvalid) {
		this.isvalid = isvalid;
	}

	public Date getRegclsdate() {
		return regclsdate;
	}

	public void setRegclsdate(Date regclsdate) {
		this.regclsdate = regclsdate;
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
