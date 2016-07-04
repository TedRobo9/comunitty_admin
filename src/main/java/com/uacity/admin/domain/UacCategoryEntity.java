package com.uacity.admin.domain;

import javax.persistence.*;

/**
 * Created by eegijmc on 7/4/2016.
 */
@Entity
@Table(name = "uac_category", schema = "ua_city", catalog = "")
public class UacCategoryEntity {
    private long catId;
    private String catName;
    private String keywords;
    private String catDesc;
    private long parentId;
    private int sortOrder;
    private String templateFile;
    private String measureUnit;
    private int showInNav;
    private String style;
    private boolean isShow;
    private int grade;
    private short filterAttr;

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
    @Column(name = "parent_id")
    public long getParentId() {
        return parentId;
    }

    public void setParentId(long parentId) {
        this.parentId = parentId;
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
    @Column(name = "template_file")
    public String getTemplateFile() {
        return templateFile;
    }

    public void setTemplateFile(String templateFile) {
        this.templateFile = templateFile;
    }

    @Basic
    @Column(name = "measure_unit")
    public String getMeasureUnit() {
        return measureUnit;
    }

    public void setMeasureUnit(String measureUnit) {
        this.measureUnit = measureUnit;
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
    @Column(name = "style")
    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    @Basic
    @Column(name = "is_show")
    public boolean isShow() {
        return isShow;
    }

    public void setShow(boolean show) {
        isShow = show;
    }

    @Basic
    @Column(name = "grade")
    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Basic
    @Column(name = "filter_attr")
    public short getFilterAttr() {
        return filterAttr;
    }

    public void setFilterAttr(short filterAttr) {
        this.filterAttr = filterAttr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UacCategoryEntity that = (UacCategoryEntity) o;

        if (catId != that.catId) return false;
        if (parentId != that.parentId) return false;
        if (sortOrder != that.sortOrder) return false;
        if (showInNav != that.showInNav) return false;
        if (isShow != that.isShow) return false;
        if (grade != that.grade) return false;
        if (filterAttr != that.filterAttr) return false;
        if (catName != null ? !catName.equals(that.catName) : that.catName != null) return false;
        if (keywords != null ? !keywords.equals(that.keywords) : that.keywords != null) return false;
        if (catDesc != null ? !catDesc.equals(that.catDesc) : that.catDesc != null) return false;
        if (templateFile != null ? !templateFile.equals(that.templateFile) : that.templateFile != null) return false;
        if (measureUnit != null ? !measureUnit.equals(that.measureUnit) : that.measureUnit != null) return false;
        if (style != null ? !style.equals(that.style) : that.style != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (catId ^ (catId >>> 32));
        result = 31 * result + (catName != null ? catName.hashCode() : 0);
        result = 31 * result + (keywords != null ? keywords.hashCode() : 0);
        result = 31 * result + (catDesc != null ? catDesc.hashCode() : 0);
        result = 31 * result + (int) (parentId ^ (parentId >>> 32));
        result = 31 * result + sortOrder;
        result = 31 * result + (templateFile != null ? templateFile.hashCode() : 0);
        result = 31 * result + (measureUnit != null ? measureUnit.hashCode() : 0);
        result = 31 * result + showInNav;
        result = 31 * result + (style != null ? style.hashCode() : 0);
        result = 31 * result + (isShow ? 1 : 0);
        result = 31 * result + grade;
        result = 31 * result + (int) filterAttr;
        return result;
    }
}
