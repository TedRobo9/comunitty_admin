package com.ws.db.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity(name = "HC_BIZ_WXUSER")
public class WxUser {
	
	@Id
	@Column(name="id")  
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@OneToOne
	@PrimaryKeyJoinColumn  
	private User userid;
	
	@Column(name="subscribe") 
	private boolean subscribe;
	
	@Column(name="openid") 
	private String openid;
	
	@Column(name="nickname") 
	private String nickname;
	
	@Column(name="sex") 
	@Enumerated(EnumType.ORDINAL)
	private Usex sex;
	
	@Column(name="language") 
	private String language;
	
	@Column(name="province") 
	private String province;

	@Column(name="city") 
	private String city;
	
	@Column(name="area") 
	private String area;
	
	@Column(name="address") 
	private String address;
	
	@Column(name="country") 
	private String country;
	
	@Column(name="subscribetime") 
	private String subscribetime;
	
	@Column(name="headimgurl") 
	private String headimgurl;
	
	@Column(name="unionid") 
	private String unionid;
	
	@Column(name="shopid") 
	private int shopid;
	
	@Column(name="referrerId") 
	private int referrerId;
	
	@Column(name="isban") 
	private boolean isban;
	
	@Column(name="regdate") 
	private Date regdate;
	
	@Column(name="fenprice") 
	private double fenprice;
	
	@Column(name="notpayfenprice") 
	private double notpayfenprice;
	
	@Column(name="payfenprice") 
	private double payfenprice;
	
	@Column(name="takefenprice") 
	private double takefenprice;
	
	@Column(name="completefenprice") 
	private double completefenprice;
	
	@Column(name="total_number_team") 
	private int total_number_team;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getUserid() {
		return userid;
	}

	public void setUserid(User userid) {
		this.userid = userid;
	}

	public boolean isSubscribe() {
		return subscribe;
	}

	public void setSubscribe(boolean subscribe) {
		this.subscribe = subscribe;
	}

	public String getOpenid() {
		return openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public Usex getSex() {
		return sex;
	}

	public void setSex(Usex sex) {
		this.sex = sex;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getSubscribetime() {
		return subscribetime;
	}

	public void setSubscribetime(String subscribetime) {
		this.subscribetime = subscribetime;
	}

	public String getHeadimgurl() {
		return headimgurl;
	}

	public void setHeadimgurl(String headimgurl) {
		this.headimgurl = headimgurl;
	}

	public String getUnionid() {
		return unionid;
	}

	public void setUnionid(String unionid) {
		this.unionid = unionid;
	}

	public int getShopid() {
		return shopid;
	}

	public void setShopid(int shopid) {
		this.shopid = shopid;
	}

	public int getReferrerId() {
		return referrerId;
	}

	public void setReferrerId(int referrerId) {
		this.referrerId = referrerId;
	}

	public boolean isIsban() {
		return isban;
	}

	public void setIsban(boolean isban) {
		this.isban = isban;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	public double getFenprice() {
		return fenprice;
	}

	public void setFenprice(double fenprice) {
		this.fenprice = fenprice;
	}

	public double getNotpayfenprice() {
		return notpayfenprice;
	}

	public void setNotpayfenprice(double notpayfenprice) {
		this.notpayfenprice = notpayfenprice;
	}

	public double getPayfenprice() {
		return payfenprice;
	}

	public void setPayfenprice(double payfenprice) {
		this.payfenprice = payfenprice;
	}

	public double getTakefenprice() {
		return takefenprice;
	}

	public void setTakefenprice(double takefenprice) {
		this.takefenprice = takefenprice;
	}

	public double getCompletefenprice() {
		return completefenprice;
	}

	public void setCompletefenprice(double completefenprice) {
		this.completefenprice = completefenprice;
	}

	public int getTotal_number_team() {
		return total_number_team;
	}

	public void setTotal_number_team(int total_number_team) {
		this.total_number_team = total_number_team;
	}

	public int getFirst_membership() {
		return first_membership;
	}

	public void setFirst_membership(int first_membership) {
		this.first_membership = first_membership;
	}

	public int getSecond_membership() {
		return second_membership;
	}

	public void setSecond_membership(int second_membership) {
		this.second_membership = second_membership;
	}

	public int getThird_membership() {
		return third_membership;
	}

	public void setThird_membership(int third_membership) {
		this.third_membership = third_membership;
	}

	@Column(name="first_membership") 
	private int first_membership;
	
	@Column(name="second_membership") 
	private int second_membership;
	
	@Column(name="third_membership") 
	private int third_membership;
	
}
