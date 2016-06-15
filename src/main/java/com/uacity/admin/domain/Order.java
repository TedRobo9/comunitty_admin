package com.uacity.admin.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.uacity.admin.common.util.JsonDateSerializer;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;



@Entity(name = "HC_BIZ_ORDER")
public class Order {

	@Id
	@Column(name="id")  
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String code;
	
	@OneToOne
	@PrimaryKeyJoinColumn
	private WxUser wxuserid;
	
	@OneToMany(mappedBy="orderid",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JsonBackReference
	List<SubOrder> subOrder;
	
	@Column(name="commission")
	private double commission;
	
	@Column(name="totalprice") 
	private double totalprice;
	
	//订单主表  HC_BIZ_ORDER 中的  orderstate 字段记录的是订单状态的枚举字段。
	//已新建了同 orderstate 字段相同的枚举类  OrderState
	@Enumerated(EnumType.ORDINAL)
	@Column(name="orderstate") 
	private OrderState orderstate;
	
	@Column(name="isdelete") 
	private boolean isdelete;
	
	@Column(name="addtime") 
	@JsonSerialize(using=JsonDateSerializer.class)
	private Timestamp addtime;
	
	@OneToOne
	@PrimaryKeyJoinColumn  
	private Receive receiveid;
	
	@Column(name="custremark") 
	private String custremark;
	
	@Column(name="admremarks") 
	private String admremarks;
	
	@Column(name="edituser") 
	private String edituser;
	
	@Column(name="editdate") 
	private Date editdate;
	
	private String expresscompany;
	
	private String expresscode;
	
	@Transient
	private int page;

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

	public double getCommission() {
		return commission;
	}

	public void setCommission(double commission) {
		this.commission = commission;
	}

	public double getTotalprice() {
		return totalprice;
	}

	public void setTotalprice(double totalprice) {
		this.totalprice = totalprice;
	}

	public OrderState getOrderstate() {
		return orderstate;
	}

	public void setOrderstate(OrderState orderstate) {
		this.orderstate = orderstate;
	}

	public boolean isIsdelete() {
		return isdelete;
	}

	public void setIsdelete(boolean isdelete) {
		this.isdelete = isdelete;
	}

	public String getEdituser() {
		return edituser;
	}

	public void setEdituser(String edituser) {
		this.edituser = edituser;
	}

	public Date getEditdate() {
		return editdate;
	}

	public void setEditdate(Date editdate) {
		this.editdate = editdate;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public WxUser getWxuserid() {
		return wxuserid;
	}

	public void setWxuserid(WxUser wxuserid) {
		this.wxuserid = wxuserid;
	}

	public List<SubOrder> getSubOrder() {
		return subOrder;
	}

	public void setSubOrder(List<SubOrder> subOrder) {
		this.subOrder = subOrder;
	}

	public Receive getReceiveid() {
		return receiveid;
	}

	public void setReceiveid(Receive receiveid) {
		this.receiveid = receiveid;
	}

	public String getCustremark() {
		return custremark;
	}

	public void setCustremark(String custremark) {
		this.custremark = custremark;
	}

	public String getAdmremarks() {
		return admremarks;
	}

	public void setAdmremarks(String admremarks) {
		this.admremarks = admremarks;
	}

	public Timestamp getAddtime() {
		return addtime;
	}

	public void setAddtime(Timestamp addtime) {
		this.addtime = addtime;
	}

	public String getExpresscompany() {
		return expresscompany;
	}

	public void setExpresscompany(String expresscompany) {
		this.expresscompany = expresscompany;
	}

	public String getExpresscode() {
		return expresscode;
	}

	public void setExpresscode(String expresscode) {
		this.expresscode = expresscode;
	}
	

}
