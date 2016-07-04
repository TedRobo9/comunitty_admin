package com.uacity.admin.domain;

import javax.persistence.*;

/**
 * Created by eegijmc on 7/4/2016.
 */
@Entity
@Table(name = "uac_payment", schema = "ua_city", catalog = "")
public class UacPaymentEntity {
    private long payId;
    private String payCode;
    private String payName;
    private String payFee;
    private String payDesc;
    private int payOrder;
    private String payConfig;
    private boolean enabled;
    private boolean isCod;
    private boolean isOnline;

    @Id
    @Column(name = "pay_id")
    public long getPayId() {
        return payId;
    }

    public void setPayId(long payId) {
        this.payId = payId;
    }

    @Basic
    @Column(name = "pay_code")
    public String getPayCode() {
        return payCode;
    }

    public void setPayCode(String payCode) {
        this.payCode = payCode;
    }

    @Basic
    @Column(name = "pay_name")
    public String getPayName() {
        return payName;
    }

    public void setPayName(String payName) {
        this.payName = payName;
    }

    @Basic
    @Column(name = "pay_fee")
    public String getPayFee() {
        return payFee;
    }

    public void setPayFee(String payFee) {
        this.payFee = payFee;
    }

    @Basic
    @Column(name = "pay_desc")
    public String getPayDesc() {
        return payDesc;
    }

    public void setPayDesc(String payDesc) {
        this.payDesc = payDesc;
    }

    @Basic
    @Column(name = "pay_order")
    public int getPayOrder() {
        return payOrder;
    }

    public void setPayOrder(int payOrder) {
        this.payOrder = payOrder;
    }

    @Basic
    @Column(name = "pay_config")
    public String getPayConfig() {
        return payConfig;
    }

    public void setPayConfig(String payConfig) {
        this.payConfig = payConfig;
    }

    @Basic
    @Column(name = "enabled")
    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    @Basic
    @Column(name = "is_cod")
    public boolean isCod() {
        return isCod;
    }

    public void setCod(boolean cod) {
        isCod = cod;
    }

    @Basic
    @Column(name = "is_online")
    public boolean isOnline() {
        return isOnline;
    }

    public void setOnline(boolean online) {
        isOnline = online;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UacPaymentEntity that = (UacPaymentEntity) o;

        if (payId != that.payId) return false;
        if (payOrder != that.payOrder) return false;
        if (enabled != that.enabled) return false;
        if (isCod != that.isCod) return false;
        if (isOnline != that.isOnline) return false;
        if (payCode != null ? !payCode.equals(that.payCode) : that.payCode != null) return false;
        if (payName != null ? !payName.equals(that.payName) : that.payName != null) return false;
        if (payFee != null ? !payFee.equals(that.payFee) : that.payFee != null) return false;
        if (payDesc != null ? !payDesc.equals(that.payDesc) : that.payDesc != null) return false;
        if (payConfig != null ? !payConfig.equals(that.payConfig) : that.payConfig != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (payId ^ (payId >>> 32));
        result = 31 * result + (payCode != null ? payCode.hashCode() : 0);
        result = 31 * result + (payName != null ? payName.hashCode() : 0);
        result = 31 * result + (payFee != null ? payFee.hashCode() : 0);
        result = 31 * result + (payDesc != null ? payDesc.hashCode() : 0);
        result = 31 * result + payOrder;
        result = 31 * result + (payConfig != null ? payConfig.hashCode() : 0);
        result = 31 * result + (enabled ? 1 : 0);
        result = 31 * result + (isCod ? 1 : 0);
        result = 31 * result + (isOnline ? 1 : 0);
        return result;
    }
}
