package com.uacity.admin.domain;


import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
	

@Entity(name = "HC_BIZ_WITHDRAW")
public class WithDraw {
	
	@Id
	@Column(name="id")  
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@OneToOne
	@PrimaryKeyJoinColumn  
	private WxUser wxuserid;
	
	@Column(name="blankname") 
	private String blankname;
	
	@Column(name="blankcardno") 
	private String blankcardno;
	
	@Column(name="blankuser") 
	private String blankuser;
	
	@Column(name="blankmoblie") 
	private String blankmoblie;
	
	@Column(name="fenprice") 
	private double fenprice;
	
	@Column(name="blankstate") 
	private BlankState blankstate;
	
	@Column(name="addtime") 
	private Date addtime;
	
	@Column(name="paytime") 
	private Date paytime;
	
	@Column(name="fishtime") 
	private Date fishtime;
	
	@Column(name="edituser") 
	private String edituser;
	
	@Column(name="remarks") 
	private String remarks;
	
	@Column(name="remarks2") 
	private String remarks2;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public WxUser getWxuserid() {
		return wxuserid;
	}

	public void setWxuserid(WxUser wxuserid) {
		this.wxuserid = wxuserid;
	}

	public String getBlankname() {
		return blankname;
	}

	public void setBlankname(String blankname) {
		this.blankname = blankname;
	}

	public String getBlankcardno() {
		return blankcardno;
	}

	public void setBlankcardno(String blankcardno) {
		this.blankcardno = blankcardno;
	}

	public String getBlankuser() {
		return blankuser;
	}

	public void setBlankuser(String blankuser) {
		this.blankuser = blankuser;
	}

	public String getBlankmoblie() {
		return blankmoblie;
	}

	public void setBlankmoblie(String blankmoblie) {
		this.blankmoblie = blankmoblie;
	}

	public double getFenprice() {
		return fenprice;
	}

	public void setFenprice(double fenprice) {
		this.fenprice = fenprice;
	}

	public BlankState getBlankstate() {
		return blankstate;
	}

	public void setBlankstate(BlankState blankstate) {
		this.blankstate = blankstate;
	}

	public Date getAddtime() {
		return addtime;
	}

	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Date getPaytime() {
		return paytime;
	}

	public void setPaytime(Date paytime) {
		this.paytime = paytime;
	}

	public Date getFishtime() {
		return fishtime;
	}

	public void setFishtime(Date fishtime) {
		this.fishtime = fishtime;
	}

	public String getEdituser() {
		return edituser;
	}

	public void setEdituser(String edituser) {
		this.edituser = edituser;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getRemarks2() {
		return remarks2;
	}

	public void setRemarks2(String remarks2) {
		this.remarks2 = remarks2;
	}
	
}
