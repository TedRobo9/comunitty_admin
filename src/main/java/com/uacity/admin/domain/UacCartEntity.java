package com.uacity.admin.domain;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by eegijmc on 7/4/2016.
 */
@Entity
@Table(name = "uac_cart", schema = "ua_city", catalog = "")
public class UacCartEntity {
    private long recId;
    private long userId;
    private String sessionId;
    private long goodsId;
    private String goodsSn;
    private String goodsName;
    private BigDecimal marketPrice;
    private BigDecimal goodsPrice;
    private short goodsNumber;
    private String goodsAttr;
    private boolean isReal;
    private String extensionCode;
    private long parentId;
    private int recType;
    private boolean isGift;
    private boolean canHandsel;
    private long goodsAttrId;

    @Id
    @Column(name = "rec_id")
    public long getRecId() {
        return recId;
    }

    public void setRecId(long recId) {
        this.recId = recId;
    }

    @Basic
    @Column(name = "user_id")
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "session_id")
    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    @Basic
    @Column(name = "goods_id")
    public long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(long goodsId) {
        this.goodsId = goodsId;
    }

    @Basic
    @Column(name = "goods_sn")
    public String getGoodsSn() {
        return goodsSn;
    }

    public void setGoodsSn(String goodsSn) {
        this.goodsSn = goodsSn;
    }

    @Basic
    @Column(name = "goods_name")
    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    @Basic
    @Column(name = "market_price")
    public BigDecimal getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(BigDecimal marketPrice) {
        this.marketPrice = marketPrice;
    }

    @Basic
    @Column(name = "goods_price")
    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    @Basic
    @Column(name = "goods_number")
    public short getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(short goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    @Basic
    @Column(name = "goods_attr")
    public String getGoodsAttr() {
        return goodsAttr;
    }

    public void setGoodsAttr(String goodsAttr) {
        this.goodsAttr = goodsAttr;
    }

    @Basic
    @Column(name = "is_real")
    public boolean isReal() {
        return isReal;
    }

    public void setReal(boolean real) {
        isReal = real;
    }

    @Basic
    @Column(name = "extension_code")
    public String getExtensionCode() {
        return extensionCode;
    }

    public void setExtensionCode(String extensionCode) {
        this.extensionCode = extensionCode;
    }

    @Basic
    @Column(name = "parent_id")
    public long getParentId() {
        return parentId;
    }

    public void setParentId(long parentId) {
        this.parentId = parentId;
    }

    @Basic
    @Column(name = "rec_type")
    public int getRecType() {
        return recType;
    }

    public void setRecType(int recType) {
        this.recType = recType;
    }

    @Basic
    @Column(name = "is_gift")
    public boolean isGift() {
        return isGift;
    }

    public void setGift(boolean gift) {
        isGift = gift;
    }

    @Basic
    @Column(name = "can_handsel")
    public boolean isCanHandsel() {
        return canHandsel;
    }

    public void setCanHandsel(boolean canHandsel) {
        this.canHandsel = canHandsel;
    }

    @Basic
    @Column(name = "goods_attr_id")
    public long getGoodsAttrId() {
        return goodsAttrId;
    }

    public void setGoodsAttrId(long goodsAttrId) {
        this.goodsAttrId = goodsAttrId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UacCartEntity that = (UacCartEntity) o;

        if (recId != that.recId) return false;
        if (userId != that.userId) return false;
        if (goodsId != that.goodsId) return false;
        if (goodsNumber != that.goodsNumber) return false;
        if (isReal != that.isReal) return false;
        if (parentId != that.parentId) return false;
        if (recType != that.recType) return false;
        if (isGift != that.isGift) return false;
        if (canHandsel != that.canHandsel) return false;
        if (goodsAttrId != that.goodsAttrId) return false;
        if (sessionId != null ? !sessionId.equals(that.sessionId) : that.sessionId != null) return false;
        if (goodsSn != null ? !goodsSn.equals(that.goodsSn) : that.goodsSn != null) return false;
        if (goodsName != null ? !goodsName.equals(that.goodsName) : that.goodsName != null) return false;
        if (marketPrice != null ? !marketPrice.equals(that.marketPrice) : that.marketPrice != null) return false;
        if (goodsPrice != null ? !goodsPrice.equals(that.goodsPrice) : that.goodsPrice != null) return false;
        if (goodsAttr != null ? !goodsAttr.equals(that.goodsAttr) : that.goodsAttr != null) return false;
        if (extensionCode != null ? !extensionCode.equals(that.extensionCode) : that.extensionCode != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (recId ^ (recId >>> 32));
        result = 31 * result + (int) (userId ^ (userId >>> 32));
        result = 31 * result + (sessionId != null ? sessionId.hashCode() : 0);
        result = 31 * result + (int) (goodsId ^ (goodsId >>> 32));
        result = 31 * result + (goodsSn != null ? goodsSn.hashCode() : 0);
        result = 31 * result + (goodsName != null ? goodsName.hashCode() : 0);
        result = 31 * result + (marketPrice != null ? marketPrice.hashCode() : 0);
        result = 31 * result + (goodsPrice != null ? goodsPrice.hashCode() : 0);
        result = 31 * result + (int) goodsNumber;
        result = 31 * result + (goodsAttr != null ? goodsAttr.hashCode() : 0);
        result = 31 * result + (isReal ? 1 : 0);
        result = 31 * result + (extensionCode != null ? extensionCode.hashCode() : 0);
        result = 31 * result + (int) (parentId ^ (parentId >>> 32));
        result = 31 * result + recType;
        result = 31 * result + (isGift ? 1 : 0);
        result = 31 * result + (canHandsel ? 1 : 0);
        result = 31 * result + (int) (goodsAttrId ^ (goodsAttrId >>> 32));
        return result;
    }
}
