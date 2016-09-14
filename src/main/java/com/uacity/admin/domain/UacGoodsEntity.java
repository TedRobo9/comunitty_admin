package com.uacity.admin.domain;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by eegijmc on 7/4/2016.
 */
@Entity
@javax.persistence.Table(name = "uac_goods", schema = "ua_city")
public class UacGoodsEntity {
    private long goodsId;

    @Id
    @javax.persistence.Column(name = "goods_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(long goodsId) {
        this.goodsId = goodsId;
    }

    private UacCategoryEntity category;

    @ManyToOne(cascade = {CascadeType.REFRESH }, optional = true)
    @JoinColumn(name = "cat_id", referencedColumnName = "cat_id")
    public UacCategoryEntity getCategory() {
        return category;
    }

    public void setCategory(UacCategoryEntity category) {
        this.category = category;
    }

    private String goodsSn;

    @Basic
    @javax.persistence.Column(name = "goods_sn")
    public String getGoodsSn() {
        return goodsSn;
    }

    public void setGoodsSn(String goodsSn) {
        this.goodsSn = goodsSn;
    }

    private String goodsName;

    @Basic
    @javax.persistence.Column(name = "goods_name")
    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    private String goodsNameStyle;

    @Basic
    @javax.persistence.Column(name = "goods_name_style")
    public String getGoodsNameStyle() {
        return goodsNameStyle;
    }

    public void setGoodsNameStyle(String goodsNameStyle) {
        this.goodsNameStyle = goodsNameStyle;
    }

    private int clickCount;

    @Basic
    @javax.persistence.Column(name = "click_count")
    public int getClickCount() {
        return clickCount;
    }

    public void setClickCount(int clickCount) {
        this.clickCount = clickCount;
    }

    private short brandId;

    @Basic
    @javax.persistence.Column(name = "brand_id")
    public short getBrandId() {
        return brandId;
    }

    public void setBrandId(short brandId) {
        this.brandId = brandId;
    }

    private String providerName;

    @Basic
    @javax.persistence.Column(name = "provider_name")
    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    private int goodsNumber;

    @Basic
    @javax.persistence.Column(name = "goods_number")
    public int getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(int goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    private BigDecimal goodsWeight;

    @Basic
    @javax.persistence.Column(name = "goods_weight")
    public BigDecimal getGoodsWeight() {
        return goodsWeight;
    }

    public void setGoodsWeight(BigDecimal goodsWeight) {
        this.goodsWeight = goodsWeight;
    }

    private BigDecimal marketPrice;

    @Basic
    @javax.persistence.Column(name = "market_price")
    public BigDecimal getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(BigDecimal marketPrice) {
        this.marketPrice = marketPrice;
    }

    private BigDecimal shopPrice;

    @Basic
    @javax.persistence.Column(name = "shop_price")
    public BigDecimal getShopPrice() {
        return shopPrice;
    }

    public void setShopPrice(BigDecimal shopPrice) {
        this.shopPrice = shopPrice;
    }

    private BigDecimal promotePrice;

    @Basic
    @javax.persistence.Column(name = "promote_price")
    public BigDecimal getPromotePrice() {
        return promotePrice;
    }

    public void setPromotePrice(BigDecimal promotePrice) {
        this.promotePrice = promotePrice;
    }

    private int promoteStartDate;

    @Basic
    @javax.persistence.Column(name = "promote_start_date")
    public int getPromoteStartDate() {
        return promoteStartDate;
    }

    public void setPromoteStartDate(int promoteStartDate) {
        this.promoteStartDate = promoteStartDate;
    }

    private int promoteEndDate;

    @Basic
    @javax.persistence.Column(name = "promote_end_date")
    public int getPromoteEndDate() {
        return promoteEndDate;
    }

    public void setPromoteEndDate(int promoteEndDate) {
        this.promoteEndDate = promoteEndDate;
    }

    private int warnNumber;

    @Basic
    @javax.persistence.Column(name = "warn_number")
    public int getWarnNumber() {
        return warnNumber;
    }

    public void setWarnNumber(int warnNumber) {
        this.warnNumber = warnNumber;
    }

    private String keywords;

    @Basic
    @javax.persistence.Column(name = "keywords")
    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    private String goodsBrief;

    @Basic
    @javax.persistence.Column(name = "goods_brief")
    public String getGoodsBrief() {
        return goodsBrief;
    }

    public void setGoodsBrief(String goodsBrief) {
        this.goodsBrief = goodsBrief;
    }

    private String goodsDesc;

    @Basic
    @javax.persistence.Column(name = "goods_desc")
    public String getGoodsDesc() {
        return goodsDesc;
    }

    public void setGoodsDesc(String goodsDesc) {
        this.goodsDesc = goodsDesc;
    }

    private String goodsThumb;

    @Basic
    @javax.persistence.Column(name = "goods_thumb")
    public String getGoodsThumb() {
        return goodsThumb;
    }

    public void setGoodsThumb(String goodsThumb) {
        this.goodsThumb = goodsThumb;
    }

    private String goodsImg;

    @Basic
    @javax.persistence.Column(name = "goods_img")
    public String getGoodsImg() {
        return goodsImg;
    }

    public void setGoodsImg(String goodsImg) {
        this.goodsImg = goodsImg;
    }

    private String originalImg;

    @Basic
    @javax.persistence.Column(name = "original_img")
    public String getOriginalImg() {
        return originalImg;
    }

    public void setOriginalImg(String originalImg) {
        this.originalImg = originalImg;
    }

    private boolean isReal;

    @Basic
    @javax.persistence.Column(name = "is_real")
    public boolean isReal() {
        return isReal;
    }

    public void setReal(boolean real) {
        isReal = real;
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

    private boolean isOnSale;

    @Basic
    @javax.persistence.Column(name = "is_on_sale")
    public boolean isOnSale() {
        return isOnSale;
    }

    public void setOnSale(boolean onSale) {
        isOnSale = onSale;
    }

    private boolean isAloneSale;

    @Basic
    @javax.persistence.Column(name = "is_alone_sale")
    public boolean isAloneSale() {
        return isAloneSale;
    }

    public void setAloneSale(boolean aloneSale) {
        isAloneSale = aloneSale;
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

    private int addTime;

    @Basic
    @javax.persistence.Column(name = "add_time")
    public int getAddTime() {
        return addTime;
    }

    public void setAddTime(int addTime) {
        this.addTime = addTime;
    }

    private short sortOrder;

    @Basic
    @javax.persistence.Column(name = "sort_order")
    public short getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(short sortOrder) {
        this.sortOrder = sortOrder;
    }

    private boolean isDelete;

    @Basic
    @javax.persistence.Column(name = "is_delete")
    public boolean isDelete() {
        return isDelete;
    }

    public void setDelete(boolean delete) {
        isDelete = delete;
    }

    private boolean isBest;

    @Basic
    @javax.persistence.Column(name = "is_best")
    public boolean isBest() {
        return isBest;
    }

    public void setBest(boolean best) {
        isBest = best;
    }

    private boolean isNew;

    @Basic
    @javax.persistence.Column(name = "is_new")
    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    private boolean isHot;

    @Basic
    @javax.persistence.Column(name = "is_hot")
    public boolean isHot() {
        return isHot;
    }

    public void setHot(boolean hot) {
        isHot = hot;
    }

    private boolean isPromote;

    @Basic
    @javax.persistence.Column(name = "is_promote")
    public boolean isPromote() {
        return isPromote;
    }

    public void setPromote(boolean promote) {
        isPromote = promote;
    }

    private int bonusTypeId;

    @Basic
    @javax.persistence.Column(name = "bonus_type_id")
    public int getBonusTypeId() {
        return bonusTypeId;
    }

    public void setBonusTypeId(int bonusTypeId) {
        this.bonusTypeId = bonusTypeId;
    }

    private int lastUpdate;

    @Basic
    @javax.persistence.Column(name = "last_update")
    public int getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(int lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    private short goodsType;

    @Basic
    @javax.persistence.Column(name = "goods_type")
    public short getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(short goodsType) {
        this.goodsType = goodsType;
    }

    private String sellerNote;

    @Basic
    @javax.persistence.Column(name = "seller_note")
    public String getSellerNote() {
        return sellerNote;
    }

    public void setSellerNote(String sellerNote) {
        this.sellerNote = sellerNote;
    }

    private int giveIntegral;

    @Basic
    @javax.persistence.Column(name = "give_integral")
    public int getGiveIntegral() {
        return giveIntegral;
    }

    public void setGiveIntegral(int giveIntegral) {
        this.giveIntegral = giveIntegral;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UacGoodsEntity that = (UacGoodsEntity) o;

        if (goodsId != that.goodsId) return false;
        if (category != that.category) return false;
        if (clickCount != that.clickCount) return false;
        if (brandId != that.brandId) return false;
        if (goodsNumber != that.goodsNumber) return false;
        if (promoteStartDate != that.promoteStartDate) return false;
        if (promoteEndDate != that.promoteEndDate) return false;
        if (warnNumber != that.warnNumber) return false;
        if (isReal != that.isReal) return false;
        if (isOnSale != that.isOnSale) return false;
        if (isAloneSale != that.isAloneSale) return false;
        if (integral != that.integral) return false;
        if (addTime != that.addTime) return false;
        if (sortOrder != that.sortOrder) return false;
        if (isDelete != that.isDelete) return false;
        if (isBest != that.isBest) return false;
        if (isNew != that.isNew) return false;
        if (isHot != that.isHot) return false;
        if (isPromote != that.isPromote) return false;
        if (bonusTypeId != that.bonusTypeId) return false;
        if (lastUpdate != that.lastUpdate) return false;
        if (goodsType != that.goodsType) return false;
        if (giveIntegral != that.giveIntegral) return false;
        if (goodsSn != null ? !goodsSn.equals(that.goodsSn) : that.goodsSn != null) return false;
        if (goodsName != null ? !goodsName.equals(that.goodsName) : that.goodsName != null) return false;
        if (goodsNameStyle != null ? !goodsNameStyle.equals(that.goodsNameStyle) : that.goodsNameStyle != null)
            return false;
        if (providerName != null ? !providerName.equals(that.providerName) : that.providerName != null) return false;
        if (goodsWeight != null ? !goodsWeight.equals(that.goodsWeight) : that.goodsWeight != null) return false;
        if (marketPrice != null ? !marketPrice.equals(that.marketPrice) : that.marketPrice != null) return false;
        if (shopPrice != null ? !shopPrice.equals(that.shopPrice) : that.shopPrice != null) return false;
        if (promotePrice != null ? !promotePrice.equals(that.promotePrice) : that.promotePrice != null) return false;
        if (keywords != null ? !keywords.equals(that.keywords) : that.keywords != null) return false;
        if (goodsBrief != null ? !goodsBrief.equals(that.goodsBrief) : that.goodsBrief != null) return false;
        if (goodsDesc != null ? !goodsDesc.equals(that.goodsDesc) : that.goodsDesc != null) return false;
        if (goodsThumb != null ? !goodsThumb.equals(that.goodsThumb) : that.goodsThumb != null) return false;
        if (goodsImg != null ? !goodsImg.equals(that.goodsImg) : that.goodsImg != null) return false;
        if (originalImg != null ? !originalImg.equals(that.originalImg) : that.originalImg != null) return false;
        if (extensionCode != null ? !extensionCode.equals(that.extensionCode) : that.extensionCode != null)
            return false;
        if (sellerNote != null ? !sellerNote.equals(that.sellerNote) : that.sellerNote != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (goodsId ^ (goodsId >>> 32));
        result = 31 * result + (goodsSn != null ? goodsSn.hashCode() : 0);
        result = 31 * result + (goodsName != null ? goodsName.hashCode() : 0);
        result = 31 * result + (goodsNameStyle != null ? goodsNameStyle.hashCode() : 0);
        result = 31 * result + clickCount;
        result = 31 * result + (int) brandId;
        result = 31 * result + (providerName != null ? providerName.hashCode() : 0);
        result = 31 * result + goodsNumber;
        result = 31 * result + (goodsWeight != null ? goodsWeight.hashCode() : 0);
        result = 31 * result + (marketPrice != null ? marketPrice.hashCode() : 0);
        result = 31 * result + (shopPrice != null ? shopPrice.hashCode() : 0);
        result = 31 * result + (promotePrice != null ? promotePrice.hashCode() : 0);
        result = 31 * result + promoteStartDate;
        result = 31 * result + promoteEndDate;
        result = 31 * result + warnNumber;
        result = 31 * result + (keywords != null ? keywords.hashCode() : 0);
        result = 31 * result + (goodsBrief != null ? goodsBrief.hashCode() : 0);
        result = 31 * result + (goodsDesc != null ? goodsDesc.hashCode() : 0);
        result = 31 * result + (goodsThumb != null ? goodsThumb.hashCode() : 0);
        result = 31 * result + (goodsImg != null ? goodsImg.hashCode() : 0);
        result = 31 * result + (originalImg != null ? originalImg.hashCode() : 0);
        result = 31 * result + (isReal ? 1 : 0);
        result = 31 * result + (extensionCode != null ? extensionCode.hashCode() : 0);
        result = 31 * result + (isOnSale ? 1 : 0);
        result = 31 * result + (isAloneSale ? 1 : 0);
        result = 31 * result + integral;
        result = 31 * result + addTime;
        result = 31 * result + (int) sortOrder;
        result = 31 * result + (isDelete ? 1 : 0);
        result = 31 * result + (isBest ? 1 : 0);
        result = 31 * result + (isNew ? 1 : 0);
        result = 31 * result + (isHot ? 1 : 0);
        result = 31 * result + (isPromote ? 1 : 0);
        result = 31 * result + bonusTypeId;
        result = 31 * result + lastUpdate;
        result = 31 * result + (int) goodsType;
        result = 31 * result + (sellerNote != null ? sellerNote.hashCode() : 0);
        result = 31 * result + giveIntegral;
        return result;
    }
}
