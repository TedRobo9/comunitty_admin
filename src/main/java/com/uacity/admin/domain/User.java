package com.uacity.admin.domain;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name = "HC_BIZ_USER")
public class User {
	
	@Id
	@Column(name="id")  
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="username") 
	private String username;
	
	@Column(name="password") 
	private String password;
	
	@Column(name="realname") 
	private String realname;
	
	@Column(name="mobile") 
	private String mobile;
	
	@Column(name="papersType") 
	private PapersType papersType;
	
	@Column(name="papersNo") 
	private String papersNo;
	
	@Column(name="email") 
	private String email;
	
	@Column(name="qq") 
	private String qq;
	
	@Column(name="birthday") 
	private String birthday;
	
	@Column(name="usex") 
	private Usex usex;
	
	@Column(name="province") 
	private String province;
	
	@Column(name="city") 
	private String city;
	
	@Column(name="area") 
	private String area;
	
	@Column(name="address") 
	private String address;
	
	@Column(name="postcard") 
	private String postcard;
	
	@Column(name="isBindTel") 
	private boolean isBindTel;
	
	@Column(name="isBindEmail") 
	private boolean isBindEmail;
	
	@Column(name="isbandpapers") 
	private boolean isbandpapers;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRealname() {
		return realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public PapersType getPapersType() {
		return papersType;
	}

	public void setPapersType(PapersType papersType) {
		this.papersType = papersType;
	}

	public String getPapersNo() {
		return papersNo;
	}

	public void setPapersNo(String papersNo) {
		this.papersNo = papersNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public Usex getUsex() {
		return usex;
	}

	public void setUsex(Usex usex) {
		this.usex = usex;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPostcard() {
		return postcard;
	}

	public void setPostcard(String postcard) {
		this.postcard = postcard;
	}

	public boolean isBindTel() {
		return isBindTel;
	}

	public void setBindTel(boolean isBindTel) {
		this.isBindTel = isBindTel;
	}

	public boolean isBindEmail() {
		return isBindEmail;
	}

	public void setBindEmail(boolean isBindEmail) {
		this.isBindEmail = isBindEmail;
	}

	public boolean isIsbandpapers() {
		return isbandpapers;
	}

	public void setIsbandpapers(boolean isbandpapers) {
		this.isbandpapers = isbandpapers;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	public String getUserpic() {
		return userpic;
	}

	public void setUserpic(String userpic) {
		this.userpic = userpic;
	}

	@Column(name="regdate") 
	private Date regdate;
	
	@Column(name="userpic") 
	private String userpic;
	
	
}
