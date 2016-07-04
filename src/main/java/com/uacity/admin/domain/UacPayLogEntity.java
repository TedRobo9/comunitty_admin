package com.uacity.admin.domain;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by eegijmc on 7/4/2016.
 */
@Entity
@Table(name = "uac_pay_log", schema = "ua_city", catalog = "")
public class UacPayLogEntity {
    private long logId;
    private long orderId;
    private BigDecimal orderAmount;
    private int orderType;
    private boolean isPaid;

    @Id
    @Column(name = "log_id")
    public long getLogId() {
        return logId;
    }

    public void setLogId(long logId) {
        this.logId = logId;
    }

    @Basic
    @Column(name = "order_id")
    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    @Basic
    @Column(name = "order_amount")
    public BigDecimal getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(BigDecimal orderAmount) {
        this.orderAmount = orderAmount;
    }

    @Basic
    @Column(name = "order_type")
    public int getOrderType() {
        return orderType;
    }

    public void setOrderType(int orderType) {
        this.orderType = orderType;
    }

    @Basic
    @Column(name = "is_paid")
    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UacPayLogEntity that = (UacPayLogEntity) o;

        if (logId != that.logId) return false;
        if (orderId != that.orderId) return false;
        if (orderType != that.orderType) return false;
        if (isPaid != that.isPaid) return false;
        if (orderAmount != null ? !orderAmount.equals(that.orderAmount) : that.orderAmount != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (logId ^ (logId >>> 32));
        result = 31 * result + (int) (orderId ^ (orderId >>> 32));
        result = 31 * result + (orderAmount != null ? orderAmount.hashCode() : 0);
        result = 31 * result + orderType;
        result = 31 * result + (isPaid ? 1 : 0);
        return result;
    }
}
