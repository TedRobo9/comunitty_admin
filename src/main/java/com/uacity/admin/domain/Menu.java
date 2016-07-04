package com.uacity.admin.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name = "HC_SYS_MENU")
public class Menu {
	
	@Id
	@Column(name="mid")  
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mid;
	
	@Column(name="parentid") 
	private String parentid;
	
	@OneToMany(mappedBy="parentid",cascade=CascadeType.ALL,fetch=FetchType.EAGER)
    private List<Menu> submenu;
	
	@Column(name="mname") 
	private String mname;
	
	@Column(name="mdesc") 
	private String mdesc;
	
	@Column(name="actionurl") 
	private String actionurl;
	
	@Column(name="msort") 
	private int msort = 0;
	
	@Column(name="isvalid") 
	private boolean isvalid;
	
	@Column(name="optusername") 
	private String optusername;
	
	@Column(name="isleaf") 
	private boolean isleaf;
	
	@Column(name="levelno") 
	private int levelno;
	
	@Column(name="style") 
	private String style;
	
	@Column(name="remark") 
	private String remark;

	public int getMid() {
		return mid;
	}

	public String getParentid() {
		return parentid;
	}

	public void setParentid(String parentid) {
		this.parentid = parentid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public List<Menu> getSubmenu() {
		return submenu;
	}

	public void setSubmenu(List<Menu> submenu) {
		this.submenu = submenu;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getMdesc() {
		return mdesc;
	}

	public void setMdesc(String mdesc) {
		this.mdesc = mdesc;
	}

	public String getActionurl() {
		return actionurl;
	}

	public void setActionurl(String actionurl) {
		this.actionurl = actionurl;
	}

	public int getMsort() {
		return msort;
	}

	public void setMsort(int msort) {
		this.msort = msort;
	}

	public boolean isIsvalid() {
		return isvalid;
	}

	public void setIsvalid(boolean isvalid) {
		this.isvalid = isvalid;
	}

	public String getOptusername() {
		return optusername;
	}

	public void setOptusername(String optusername) {
		this.optusername = optusername;
	}

	public boolean isIsleaf() {
		return isleaf;
	}

	public void setIsleaf(boolean isleaf) {
		this.isleaf = isleaf;
	}

	public int getLevelno() {
		return levelno;
	}

	public void setLevelno(int levelno) {
		this.levelno = levelno;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}
	
	
}
