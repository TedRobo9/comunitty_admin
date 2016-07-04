package com.uacity.admin.domain;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * Created by eegijmc on 7/4/2016.
 */
@Entity
@javax.persistence.Table(name = "uac_order_info", schema = "ua_city", catalog = "")
public class UacOrderInfoEntity {
    private long orderId;

    @Id
    @javax.persistence.Column(name = "order_id")
    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    private String orderSn;

    @Basic
    @javax.persistence.Column(name = "order_sn")
    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    private long userId;

    @Basic
    @javax.persistence.Column(name = "user_id")
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    private int orderStatus;

    @Basic
    @javax.persistence.Column(name = "order_status")
    public int getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(int orderStatus) {
        this.orderStatus = orderStatus;
    }

    private int shippingStatus;

    @Basic
    @javax.persistence.Column(name = "shipping_status")
    public int getShippingStatus() {
        return shippingStatus;
    }

    public void setShippingStatus(int shippingStatus) {
        this.shippingStatus = shippingStatus;
    }

    private byte payStatus;

    @Basic
    @javax.persistence.Column(name = "pay_status")
    public byte getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(byte payStatus) {
        this.payStatus = payStatus;
    }

    private String consignee;

    @Basic
    @javax.persistence.Column(name = "consignee")
    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    private int country;

    @Basic
    @javax.persistence.Column(name = "country")
    public int getCountry() {
        return country;
    }

    public void setCountry(int country) {
        this.country = country;
    }

    private int province;

    @Basic
    @javax.persistence.Column(name = "province")
    public int getProvince() {
        return province;
    }

    public void setProvince(int province) {
        this.province = province;
    }

    private int city;

    @Basic
    @javax.persistence.Column(name = "city")
    public int getCity() {
        return city;
    }

    public void setCity(int city) {
        this.city = city;
    }

    private int district;

    @Basic
    @javax.persistence.Column(name = "district")
    public int getDistrict() {
        return district;
    }

    public void setDistrict(int district) {
        this.district = district;
    }

    private String address;

    @Basic
    @javax.persistence.Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    private String zipcode;

    @Basic
    @javax.persistence.Column(name = "zipcode")
    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    private String tel;

    @Basic
    @javax.persistence.Column(name = "tel")
    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    private String mobile;

    @Basic
    @javax.persistence.Column(name = "mobile")
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    private String email;

    @Basic
    @javax.persistence.Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String bestTime;

    @Basic
    @javax.persistence.Column(name = "best_time")
    public String getBestTime() {
        return bestTime;
    }

    public void setBestTime(String bestTime) {
        this.bestTime = bestTime;
    }

    private String signBuilding;

    @Basic
    @javax.persistence.Column(name = "sign_building")
    public String getSignBuilding() {
        return signBuilding;
    }

    public void setSignBuilding(String signBuilding) {
        this.signBuilding = signBuilding;
    }

    private String postscript;

    @Basic
    @javax.persistence.Column(name = "postscript")
    public String getPostscript() {
        return postscript;
    }

    public void setPostscript(String postscript) {
        this.postscript = postscript;
    }

    private long shippingId;

    @Basic
    @javax.persistence.Column(name = "shipping_id")
    public long getShippingId() {
        return shippingId;
    }

    public void setShippingId(long shippingId) {
        this.shippingId = shippingId;
    }

    private String shippingName;

    @Basic
    @javax.persistence.Column(name = "shipping_name")
    public String getShippingName() {
        return shippingName;
    }

    public void setShippingName(String shippingName) {
        this.shippingName = shippingName;
    }

    private long payId;

    @Basic
    @javax.persistence.Column(name = "pay_id")
    public long getPayId() {
        return payId;
    }

    public void setPayId(long payId) {
        this.payId = payId;
    }

    private String payName;

    @Basic
    @javax.persistence.Column(name = "pay_name")
    public String getPayName() {
        return payName;
    }

    public void setPayName(String payName) {
        this.payName = payName;
    }

    private String howOos;

    @Basic
    @javax.persistence.Column(name = "how_oos")
    public String getHowOos() {
        return howOos;
    }

    public void setHowOos(String howOos) {
        this.howOos = howOos;
    }

    private String howSurplus;

    @Basic
    @javax.persistence.Column(name = "how_surplus")
    public String getHowSurplus() {
        return howSurplus;
    }

    public void setHowSurplus(String howSurplus) {
        this.howSurplus = howSurplus;
    }

    private String invPayee;

    @Basic
    @javax.persistence.Column(name = "inv_payee")
    public String getInvPayee() {
        return invPayee;
    }

    public void setInvPayee(String invPayee) {
        this.invPayee = invPayee;
    }

    private String invContent;

    @Basic
    @javax.persistence.Column(name = "inv_content")
    public String getInvContent() {
        return invContent;
    }

    public void setInvContent(String invContent) {
        this.invContent = invContent;
    }

    private BigDecimal goodsAmount;

    @Basic
    @javax.persistence.Column(name = "goods_amount")
    public BigDecimal getGoodsAmount() {
        return goodsAmount;
    }

    public void setGoodsAmount(BigDecimal goodsAmount) {
        this.goodsAmount = goodsAmount;
    }

    private BigDecimal shippingFee;

    @Basic
    @javax.persistence.Column(name = "shipping_fee")
    public BigDecimal getShippingFee() {
        return shippingFee;
    }

    public void setShippingFee(BigDecimal shippingFee) {
        this.shippingFee = shippingFee;
    }

    private BigDecimal insureFee;

    @Basic
    @javax.persistence.Column(name = "insure_fee")
    public BigDecimal getInsureFee() {
        return insureFee;
    }

    public void setInsureFee(BigDecimal insureFee) {
        this.insureFee = insureFee;
    }

    private BigDecimal payFee;

    @Basic
    @javax.persistence.Column(name = "pay_fee")
    public BigDecimal getPayFee() {
        return payFee;
    }

    public void setPayFee(BigDecimal payFee) {
        this.payFee = payFee;
    }

    private BigDecimal moneyPaid;

    @Basic
    @javax.persistence.Column(name = "money_paid")
    public BigDecimal getMoneyPaid() {
        return moneyPaid;
    }

    public void setMoneyPaid(BigDecimal moneyPaid) {
        this.moneyPaid = moneyPaid;
    }

    private int integral;

    @Basic
    @javax.persistence.Column(name = "integral")
    public int getIntegral() {
        return integral;
    }

    public void setIntegral(int integral) {
        this.integral = integral;
    }

    private BigDecimal integralMoney;

    @Basic
    @javax.persistence.Column(name = "integral_money")
    public BigDecimal getIntegralMoney() {
        return integralMoney;
    }

    public void setIntegralMoney(BigDecimal integralMoney) {
        this.integralMoney = integralMoney;
    }

    private BigDecimal bonus;

    @Basic
    @javax.persistence.Column(name = "bonus")
    public BigDecimal getBonus() {
        return bonus;
    }

    public void setBonus(BigDecimal bonus) {
        this.bonus = bonus;
    }

    private BigDecimal orderAmount;

    @Basic
    @javax.persistence.Column(name = "order_amount")
    public BigDecimal getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(BigDecimal orderAmount) {
        this.orderAmount = orderAmount;
    }

    private String referer;

    @Basic
    @javax.persistence.Column(name = "referer")
    public String getReferer() {
        return referer;
    }

    public void setReferer(String referer) {
        this.referer = referer;
    }

    private int addTime;

    @Basic
    @javax.persistence.Column(name = "add_time")
    public int getAddTime() {
        return addTime;
    }

    public void setAddTime(int addTime) {
        this.addTime = addTime;
    }

    private int confirmTime;

    @Basic
    @javax.persistence.Column(name = "confirm_time")
    public int getConfirmTime() {
        return confirmTime;
    }

    public void setConfirmTime(int confirmTime) {
        this.confirmTime = confirmTime;
    }

    private int payTime;

    @Basic
    @javax.persistence.Column(name = "pay_time")
    public int getPayTime() {
        return payTime;
    }

    public void setPayTime(int payTime) {
        this.payTime = payTime;
    }

    private int shippingTime;

    @Basic
    @javax.persistence.Column(name = "shipping_time")
    public int getShippingTime() {
        return shippingTime;
    }

    public void setShippingTime(int shippingTime) {
        this.shippingTime = shippingTime;
    }

    private String invoiceNo;

    @Basic
    @javax.persistence.Column(name = "invoice_no")
    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    private String extensionCode;

    @Basic
    @javax.persistence.Column(name = "extension_code")
    public String getExtensionCode() {
        return extensionCode;
    }

    public void setExtensionCode(String extensionCode) {
        this.extensionCode = extensionCode;
    }

    private long extensionId;

    @Basic
    @javax.persistence.Column(name = "extension_id")
    public long getExtensionId() {
        return extensionId;
    }

    public void setExtensionId(long extensionId) {
        this.extensionId = extensionId;
    }

    private String toBuyer;

    @Basic
    @javax.persistence.Column(name = "to_buyer")
    public String getToBuyer() {
        return toBuyer;
    }

    public void setToBuyer(String toBuyer) {
        this.toBuyer = toBuyer;
    }

    private String payNote;

    @Basic
    @javax.persistence.Column(name = "pay_note")
    public String getPayNote() {
        return payNote;
    }

    public void setPayNote(String payNote) {
        this.payNote = payNote;
    }

    private long agencyId;

    @Basic
    @javax.persistence.Column(name = "agency_id")
    public long getAgencyId() {
        return agencyId;
    }

    public void setAgencyId(long agencyId) {
        this.agencyId = agencyId;
    }

    private String invType;

    @Basic
    @javax.persistence.Column(name = "inv_type")
    public String getInvType() {
        return invType;
    }

    public void setInvType(String invType) {
        this.invType = invType;
    }

    private BigDecimal tax;

    @Basic
    @javax.persistence.Column(name = "tax")
    public BigDecimal getTax() {
        return tax;
    }

    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }

    private boolean isSeparate;

    @Basic
    @javax.persistence.Column(name = "is_separate")
    public boolean isSeparate() {
        return isSeparate;
    }

    public void setSeparate(boolean separate) {
        isSeparate = separate;
    }

    private long parentId;

    @Basic
    @javax.persistence.Column(name = "parent_id")
    public long getParentId() {
        return parentId;
    }

    public void setParentId(long parentId) {
        this.parentId = parentId;
    }

    private BigDecimal discount;

    @Basic
    @javax.persistence.Column(name = "discount")
    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UacOrderInfoEntity that = (UacOrderInfoEntity) o;

        if (orderId != that.orderId) return false;
        if (userId != that.userId) return false;
        if (orderStatus != that.orderStatus) return false;
        if (shippingStatus != that.shippingStatus) return false;
        if (payStatus != that.payStatus) return false;
        if (country != that.country) return false;
        if (province != that.province) return false;
        if (city != that.city) return false;
        if (district != that.district) return false;
        if (shippingId != that.shippingId) return false;
        if (payId != that.payId) return false;
        if (integral != that.integral) return false;
        if (addTime != that.addTime) return false;
        if (confirmTime != that.confirmTime) return false;
        if (payTime != that.payTime) return false;
        if (shippingTime != that.shippingTime) return false;
        if (extensionId != that.extensionId) return false;
        if (agencyId != that.agencyId) return false;
        if (isSeparate != that.isSeparate) return false;
        if (parentId != that.parentId) return false;
        if (orderSn != null ? !orderSn.equals(that.orderSn) : that.orderSn != null) return false;
        if (consignee != null ? !consignee.equals(that.consignee) : that.consignee != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (zipcode != null ? !zipcode.equals(that.zipcode) : that.zipcode != null) return false;
        if (tel != null ? !tel.equals(that.tel) : that.tel != null) return false;
        if (mobile != null ? !mobile.equals(that.mobile) : that.mobile != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (bestTime != null ? !bestTime.equals(that.bestTime) : that.bestTime != null) return false;
        if (signBuilding != null ? !signBuilding.equals(that.signBuilding) : that.signBuilding != null) return false;
        if (postscript != null ? !postscript.equals(that.postscript) : that.postscript != null) return false;
        if (shippingName != null ? !shippingName.equals(that.shippingName) : that.shippingName != null) return false;
        if (payName != null ? !payName.equals(that.payName) : that.payName != null) return false;
        if (howOos != null ? !howOos.equals(that.howOos) : that.howOos != null) return false;
        if (howSurplus != null ? !howSurplus.equals(that.howSurplus) : that.howSurplus != null) return false;
        if (invPayee != null ? !invPayee.equals(that.invPayee) : that.invPayee != null) return false;
        if (invContent != null ? !invContent.equals(that.invContent) : that.invContent != null) return false;
        if (goodsAmount != null ? !goodsAmount.equals(that.goodsAmount) : that.goodsAmount != null) return false;
        if (shippingFee != null ? !shippingFee.equals(that.shippingFee) : that.shippingFee != null) return false;
        if (insureFee != null ? !insureFee.equals(that.insureFee) : that.insureFee != null) return false;
        if (payFee != null ? !payFee.equals(that.payFee) : that.payFee != null) return false;
        if (moneyPaid != null ? !moneyPaid.equals(that.moneyPaid) : that.moneyPaid != null) return false;
        if (integralMoney != null ? !integralMoney.equals(that.integralMoney) : that.integralMoney != null)
            return false;
        if (bonus != null ? !bonus.equals(that.bonus) : that.bonus != null) return false;
        if (orderAmount != null ? !orderAmount.equals(that.orderAmount) : that.orderAmount != null) return false;
        if (referer != null ? !referer.equals(that.referer) : that.referer != null) return false;
        if (invoiceNo != null ? !invoiceNo.equals(that.invoiceNo) : that.invoiceNo != null) return false;
        if (extensionCode != null ? !extensionCode.equals(that.extensionCode) : that.extensionCode != null)
            return false;
        if (toBuyer != null ? !toBuyer.equals(that.toBuyer) : that.toBuyer != null) return false;
        if (payNote != null ? !payNote.equals(that.payNote) : that.payNote != null) return false;
        if (invType != null ? !invType.equals(that.invType) : that.invType != null) return false;
        if (tax != null ? !tax.equals(that.tax) : that.tax != null) return false;
        if (discount != null ? !discount.equals(that.discount) : that.discount != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (orderId ^ (orderId >>> 32));
        result = 31 * result + (orderSn != null ? orderSn.hashCode() : 0);
        result = 31 * result + (int) (userId ^ (userId >>> 32));
        result = 31 * result + orderStatus;
        result = 31 * result + shippingStatus;
        result = 31 * result + (int) payStatus;
        result = 31 * result + (consignee != null ? consignee.hashCode() : 0);
        result = 31 * result + country;
        result = 31 * result + province;
        result = 31 * result + city;
        result = 31 * result + district;
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (zipcode != null ? zipcode.hashCode() : 0);
        result = 31 * result + (tel != null ? tel.hashCode() : 0);
        result = 31 * result + (mobile != null ? mobile.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (bestTime != null ? bestTime.hashCode() : 0);
        result = 31 * result + (signBuilding != null ? signBuilding.hashCode() : 0);
        result = 31 * result + (postscript != null ? postscript.hashCode() : 0);
        result = 31 * result + (int) (shippingId ^ (shippingId >>> 32));
        result = 31 * result + (shippingName != null ? shippingName.hashCode() : 0);
        result = 31 * result + (int) (payId ^ (payId >>> 32));
        result = 31 * result + (payName != null ? payName.hashCode() : 0);
        result = 31 * result + (howOos != null ? howOos.hashCode() : 0);
        result = 31 * result + (howSurplus != null ? howSurplus.hashCode() : 0);
        result = 31 * result + (invPayee != null ? invPayee.hashCode() : 0);
        result = 31 * result + (invContent != null ? invContent.hashCode() : 0);
        result = 31 * result + (goodsAmount != null ? goodsAmount.hashCode() : 0);
        result = 31 * result + (shippingFee != null ? shippingFee.hashCode() : 0);
        result = 31 * result + (insureFee != null ? insureFee.hashCode() : 0);
        result = 31 * result + (payFee != null ? payFee.hashCode() : 0);
        result = 31 * result + (moneyPaid != null ? moneyPaid.hashCode() : 0);
        result = 31 * result + integral;
        result = 31 * result + (integralMoney != null ? integralMoney.hashCode() : 0);
        result = 31 * result + (bonus != null ? bonus.hashCode() : 0);
        result = 31 * result + (orderAmount != null ? orderAmount.hashCode() : 0);
        result = 31 * result + (referer != null ? referer.hashCode() : 0);
        result = 31 * result + addTime;
        result = 31 * result + confirmTime;
        result = 31 * result + payTime;
        result = 31 * result + shippingTime;
        result = 31 * result + (invoiceNo != null ? invoiceNo.hashCode() : 0);
        result = 31 * result + (extensionCode != null ? extensionCode.hashCode() : 0);
        result = 31 * result + (int) (extensionId ^ (extensionId >>> 32));
        result = 31 * result + (toBuyer != null ? toBuyer.hashCode() : 0);
        result = 31 * result + (payNote != null ? payNote.hashCode() : 0);
        result = 31 * result + (int) (agencyId ^ (agencyId >>> 32));
        result = 31 * result + (invType != null ? invType.hashCode() : 0);
        result = 31 * result + (tax != null ? tax.hashCode() : 0);
        result = 31 * result + (isSeparate ? 1 : 0);
        result = 31 * result + (int) (parentId ^ (parentId >>> 32));
        result = 31 * result + (discount != null ? discount.hashCode() : 0);
        return result;
    }
}
