package com.uacity.admin.domain;

import javax.persistence.*;

/**
 * Created by eegijmc on 7/4/2016.
 */
@Entity
@Table(name = "uac_brand", schema = "ua_city", catalog = "")
public class UacBrandEntity {
    private long brandId;
    private String brandName;
    private String brandLogo;
    private String brandDesc;
    private String siteUrl;
    private int sortOrder;
    private boolean isShow;

    @Id
    @Column(name = "brand_id")
    public long getBrandId() {
        return brandId;
    }

    public void setBrandId(long brandId) {
        this.brandId = brandId;
    }

    @Basic
    @Column(name = "brand_name")
    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    @Basic
    @Column(name = "brand_logo")
    public String getBrandLogo() {
        return brandLogo;
    }

    public void setBrandLogo(String brandLogo) {
        this.brandLogo = brandLogo;
    }

    @Basic
    @Column(name = "brand_desc")
    public String getBrandDesc() {
        return brandDesc;
    }

    public void setBrandDesc(String brandDesc) {
        this.brandDesc = brandDesc;
    }

    @Basic
    @Column(name = "site_url")
    public String getSiteUrl() {
        return siteUrl;
    }

    public void setSiteUrl(String siteUrl) {
        this.siteUrl = siteUrl;
    }

    @Basic
    @Column(name = "sort_order")
    public int getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(int sortOrder) {
        this.sortOrder = sortOrder;
    }

    @Basic
    @Column(name = "is_show")
    public boolean isShow() {
        return isShow;
    }

    public void setShow(boolean show) {
        isShow = show;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UacBrandEntity that = (UacBrandEntity) o;

        if (brandId != that.brandId) return false;
        if (sortOrder != that.sortOrder) return false;
        if (isShow != that.isShow) return false;
        if (brandName != null ? !brandName.equals(that.brandName) : that.brandName != null) return false;
        if (brandLogo != null ? !brandLogo.equals(that.brandLogo) : that.brandLogo != null) return false;
        if (brandDesc != null ? !brandDesc.equals(that.brandDesc) : that.brandDesc != null) return false;
        if (siteUrl != null ? !siteUrl.equals(that.siteUrl) : that.siteUrl != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (brandId ^ (brandId >>> 32));
        result = 31 * result + (brandName != null ? brandName.hashCode() : 0);
        result = 31 * result + (brandLogo != null ? brandLogo.hashCode() : 0);
        result = 31 * result + (brandDesc != null ? brandDesc.hashCode() : 0);
        result = 31 * result + (siteUrl != null ? siteUrl.hashCode() : 0);
        result = 31 * result + sortOrder;
        result = 31 * result + (isShow ? 1 : 0);
        return result;
    }
}
