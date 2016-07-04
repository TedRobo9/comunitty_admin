package com.uacity.admin.domain;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by eegijmc on 7/4/2016.
 */
@Entity
@Table(name = "uac_favourable_activity", schema = "ua_city", catalog = "")
public class UacFavourableActivityEntity {
    private long actId;
    private String actName;
    private int startTime;
    private int endTime;
    private String userRank;
    private int actRange;
    private String actRangeExt;
    private BigDecimal minAmount;
    private BigDecimal maxAmount;
    private int actType;
    private BigDecimal actTypeExt;
    private String gift;
    private int sortOrder;

    @Id
    @Column(name = "act_id")
    public long getActId() {
        return actId;
    }

    public void setActId(long actId) {
        this.actId = actId;
    }

    @Basic
    @Column(name = "act_name")
    public String getActName() {
        return actName;
    }

    public void setActName(String actName) {
        this.actName = actName;
    }

    @Basic
    @Column(name = "start_time")
    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    @Basic
    @Column(name = "end_time")
    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    @Basic
    @Column(name = "user_rank")
    public String getUserRank() {
        return userRank;
    }

    public void setUserRank(String userRank) {
        this.userRank = userRank;
    }

    @Basic
    @Column(name = "act_range")
    public int getActRange() {
        return actRange;
    }

    public void setActRange(int actRange) {
        this.actRange = actRange;
    }

    @Basic
    @Column(name = "act_range_ext")
    public String getActRangeExt() {
        return actRangeExt;
    }

    public void setActRangeExt(String actRangeExt) {
        this.actRangeExt = actRangeExt;
    }

    @Basic
    @Column(name = "min_amount")
    public BigDecimal getMinAmount() {
        return minAmount;
    }

    public void setMinAmount(BigDecimal minAmount) {
        this.minAmount = minAmount;
    }

    @Basic
    @Column(name = "max_amount")
    public BigDecimal getMaxAmount() {
        return maxAmount;
    }

    public void setMaxAmount(BigDecimal maxAmount) {
        this.maxAmount = maxAmount;
    }

    @Basic
    @Column(name = "act_type")
    public int getActType() {
        return actType;
    }

    public void setActType(int actType) {
        this.actType = actType;
    }

    @Basic
    @Column(name = "act_type_ext")
    public BigDecimal getActTypeExt() {
        return actTypeExt;
    }

    public void setActTypeExt(BigDecimal actTypeExt) {
        this.actTypeExt = actTypeExt;
    }

    @Basic
    @Column(name = "gift")
    public String getGift() {
        return gift;
    }

    public void setGift(String gift) {
        this.gift = gift;
    }

    @Basic
    @Column(name = "sort_order")
    public int getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(int sortOrder) {
        this.sortOrder = sortOrder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UacFavourableActivityEntity that = (UacFavourableActivityEntity) o;

        if (actId != that.actId) return false;
        if (startTime != that.startTime) return false;
        if (endTime != that.endTime) return false;
        if (actRange != that.actRange) return false;
        if (actType != that.actType) return false;
        if (sortOrder != that.sortOrder) return false;
        if (actName != null ? !actName.equals(that.actName) : that.actName != null) return false;
        if (userRank != null ? !userRank.equals(that.userRank) : that.userRank != null) return false;
        if (actRangeExt != null ? !actRangeExt.equals(that.actRangeExt) : that.actRangeExt != null) return false;
        if (minAmount != null ? !minAmount.equals(that.minAmount) : that.minAmount != null) return false;
        if (maxAmount != null ? !maxAmount.equals(that.maxAmount) : that.maxAmount != null) return false;
        if (actTypeExt != null ? !actTypeExt.equals(that.actTypeExt) : that.actTypeExt != null) return false;
        if (gift != null ? !gift.equals(that.gift) : that.gift != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (actId ^ (actId >>> 32));
        result = 31 * result + (actName != null ? actName.hashCode() : 0);
        result = 31 * result + startTime;
        result = 31 * result + endTime;
        result = 31 * result + (userRank != null ? userRank.hashCode() : 0);
        result = 31 * result + actRange;
        result = 31 * result + (actRangeExt != null ? actRangeExt.hashCode() : 0);
        result = 31 * result + (minAmount != null ? minAmount.hashCode() : 0);
        result = 31 * result + (maxAmount != null ? maxAmount.hashCode() : 0);
        result = 31 * result + actType;
        result = 31 * result + (actTypeExt != null ? actTypeExt.hashCode() : 0);
        result = 31 * result + (gift != null ? gift.hashCode() : 0);
        result = 31 * result + sortOrder;
        return result;
    }
}
