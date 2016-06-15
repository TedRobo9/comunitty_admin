package com.uacity.admin.domain;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity(name = "HC_BIZ_PROD")
public class Prod {
	
	@Id
	@Column(name="id")  
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="code") 
	private String code;
	
	@Column(name="name") 
	private String name;
	
	@Column(name="gdspic") 
	private String gdspic;
	
	@Column(name="class_id") 
	private int classid;
	
	@Column(name="type_id") 
	private int typeid;
	
	@Column(name="sprice") 
	private double sprice;
	
	@Column(name="oprice") 
	private double oprice;
	
	@Column(name="detail") 
	private String detail;
	
	@Column(name="isvalid") 
	private boolean isvalid;
	
	@Column(name="gdstatus") 
	private boolean gdstatus;
	
	@Column(name="stock") 
	private int stock;
	
	@Column(name="salesvolume") 
	private int salesvolume;
	
	@Column(name="browservolume") 
	private int browservolume;
	
	@Column(name="issnap") 
	private boolean issnap;
	
	@Column(name="grabegindate") 
	private Date grabegindate;
	
	@Column(name="grabovrdate") 
	private Date grabovrdate;
	
	@Column(name="consume") 
	private int consume;
	
	@Column(name="distron") 
	private int distron;
	
	@Column(name="profit") 
	private double profit;
	
	@Column(name="isdistron") 
	private boolean isdistron;
	
	@Column(name="editdate") 
	private Date editdate;
	
	@Column(name="username") 
	private String username;
	
	@Column(name="createdate") 
	private Date createdate;
	
	@Column(name="createuser") 
	private String createuser;


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGdspic() {
		return gdspic;
	}

	public void setGdspic(String gdspic) {
		this.gdspic = gdspic;
	}

	public int getClassid() {
		return classid;
	}

	public void setClassid(int classid) {
		this.classid = classid;
	}

	public int getTypeid() {
		return typeid;
	}

	public void setTypeid(int typeid) {
		this.typeid = typeid;
	}

	public double getSprice() {
		return sprice;
	}

	public void setSprice(double sprice) {
		this.sprice = sprice;
	}

	public double getOprice() {
		return oprice;
	}

	public void setOprice(double oprice) {
		this.oprice = oprice;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public boolean isIsvalid() {
		return isvalid;
	}

	public void setIsvalid(boolean isvalid) {
		this.isvalid = isvalid;
	}

	public boolean isGdstatus() {
		return gdstatus;
	}

	public void setGdstatus(boolean gdstatus) {
		this.gdstatus = gdstatus;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getSalesvolume() {
		return salesvolume;
	}

	public void setSalesvolume(int salesvolume) {
		this.salesvolume = salesvolume;
	}

	public int getBrowservolume() {
		return browservolume;
	}

	public void setBrowservolume(int browservolume) {
		this.browservolume = browservolume;
	}

	public boolean isIssnap() {
		return issnap;
	}

	public void setIssnap(boolean issnap) {
		this.issnap = issnap;
	}

	public Date getGrabegindate() {
		return grabegindate;
	}

	public void setGrabegindate(Date grabegindate) {
		this.grabegindate = grabegindate;
	}

	public Date getGrabovrdate() {
		return grabovrdate;
	}

	public void setGrabovrdate(Date grabovrdate) {
		this.grabovrdate = grabovrdate;
	}

	public int getConsume() {
		return consume;
	}

	public void setConsume(int consume) {
		this.consume = consume;
	}

	public int getDistron() {
		return distron;
	}

	public void setDistron(int distron) {
		this.distron = distron;
	}

	public double getProfit() {
		return profit;
	}

	public void setProfit(double profit) {
		this.profit = profit;
	}

	public boolean isIsdistron() {
		return isdistron;
	}

	public void setIsdistron(boolean isdistron) {
		this.isdistron = isdistron;
	}

	public Date getEditdate() {
		return editdate;
	}

	public void setEditdate(Date editdate) {
		this.editdate = editdate;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Date getCreatedate() {
		return createdate;
	}

	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}

	public String getCreateuser() {
		return createuser;
	}

	public void setCreateuser(String createuser) {
		this.createuser = createuser;
	}
	
	@Transient
	private int page;
	
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	
	@Transient
	private String oper;
	
	public String getOper() {
		return oper;
	}

	public void setOper(String oper) {
		this.oper = oper;
	}	
	
}
