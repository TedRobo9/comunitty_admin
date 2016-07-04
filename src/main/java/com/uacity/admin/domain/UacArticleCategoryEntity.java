package com.uacity.admin.domain;

import javax.persistence.*;

/**
 * Created by eegijmc on 7/4/2016.
 */
@Entity
@Table(name = "uac_article_category", schema = "ua_city", catalog = "")
public class UacArticleCategoryEntity {
    private long catId;
    private String catName;
    private int catType;
    private String keywords;
    private String catDesc;
    private int sortOrder;
    private int showInNav;
    private long parentId;

    @Id
    @Column(name = "cat_id")
    public long getCatId() {
        return catId;
    }

    public void setCatId(long catId) {
        this.catId = catId;
    }

    @Basic
    @Column(name = "cat_name")
    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    @Basic
    @Column(name = "cat_type")
    public int getCatType() {
        return catType;
    }

    public void setCatType(int catType) {
        this.catType = catType;
    }

    @Basic
    @Column(name = "keywords")
    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    @Basic
    @Column(name = "cat_desc")
    public String getCatDesc() {
        return catDesc;
    }

    public void setCatDesc(String catDesc) {
        this.catDesc = catDesc;
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
    @Column(name = "show_in_nav")
    public int getShowInNav() {
        return showInNav;
    }

    public void setShowInNav(int showInNav) {
        this.showInNav = showInNav;
    }

    @Basic
    @Column(name = "parent_id")
    public long getParentId() {
        return parentId;
    }

    public void setParentId(long parentId) {
        this.parentId = parentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UacArticleCategoryEntity that = (UacArticleCategoryEntity) o;

        if (catId != that.catId) return false;
        if (catType != that.catType) return false;
        if (sortOrder != that.sortOrder) return false;
        if (showInNav != that.showInNav) return false;
        if (parentId != that.parentId) return false;
        if (catName != null ? !catName.equals(that.catName) : that.catName != null) return false;
        if (keywords != null ? !keywords.equals(that.keywords) : that.keywords != null) return false;
        if (catDesc != null ? !catDesc.equals(that.catDesc) : that.catDesc != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (catId ^ (catId >>> 32));
        result = 31 * result + (catName != null ? catName.hashCode() : 0);
        result = 31 * result + catType;
        result = 31 * result + (keywords != null ? keywords.hashCode() : 0);
        result = 31 * result + (catDesc != null ? catDesc.hashCode() : 0);
        result = 31 * result + sortOrder;
        result = 31 * result + showInNav;
        result = 31 * result + (int) (parentId ^ (parentId >>> 32));
        return result;
    }
}
