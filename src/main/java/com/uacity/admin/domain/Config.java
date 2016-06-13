package com.ws.db.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "HC_SYS_CONFIG")
public class Config {
	
	@Id
	@Column(name="id")  
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="consume") 
	private double consume;
	
	@Column(name="commissionrate") 
	private int commissionrate;
	
	@Column(name="rateofdividend") 
	private int rateofdividend;
	
	@Column(name="raterequire") 
	private int raterequire;
	
	@Column(name="firstscale") 
	private int firstscale;
	
	@Column(name="sencondscale") 
	private int sencondscale;
	
	@Column(name="thirdscale") 
	private int thirdscale;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getConsume() {
		return consume;
	}

	public void setConsume(double consume) {
		this.consume = consume;
	}

	public int getCommissionrate() {
		return commissionrate;
	}

	public void setCommissionrate(int commissionrate) {
		this.commissionrate = commissionrate;
	}

	public int getRateofdividend() {
		return rateofdividend;
	}

	public void setRateofdividend(int rateofdividend) {
		this.rateofdividend = rateofdividend;
	}

	public int getRaterequire() {
		return raterequire;
	}

	public void setRaterequire(int raterequire) {
		this.raterequire = raterequire;
	}

	public int getFirstscale() {
		return firstscale;
	}

	public void setFirstscale(int firstscale) {
		this.firstscale = firstscale;
	}

	public int getSencondscale() {
		return sencondscale;
	}

	public void setSencondscale(int sencondscale) {
		this.sencondscale = sencondscale;
	}

	public int getThirdscale() {
		return thirdscale;
	}

	public void setThirdscale(int thirdscale) {
		this.thirdscale = thirdscale;
	}

	public int getTxdate() {
		return txdate;
	}

	public void setTxdate(int txdate) {
		this.txdate = txdate;
	}

	public int getConfirmtime() {
		return confirmtime;
	}

	public void setConfirmtime(int confirmtime) {
		this.confirmtime = confirmtime;
	}

	@Column(name="txdate") 
	private int txdate;
	
	@Column(name="confirmtime") 
	private int confirmtime;
	
}
