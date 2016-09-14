package com.uacity.admin.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by eegijmc on 7/4/2016.
 */
@Entity
@Table(name = "uac_category", schema = "ua_city")
public class UacCategoryEntity extends BaseEntity{
    @Id
    @Column(name = "cat_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "cat_name")
    private String name;

    @Column(name = "keywords")
    private String keywords;

    @Column(name = "cat_desc")
    private String catDesc;

    @Column(name = "template_file")
    private String templateFile;

    @Column(name = "measure_unit")
    private String measureUnit;

    @Column(name = "show_in_nav")
    private int showInNav;

    @Column(name = "style")
    private String style;

    @Column(name = "grade")
    private int grade;

    @Column(name = "filter_attr")
    private short filterAttr;

    @ManyToOne
    @JoinColumn(name = "parent_id")
    private UacCategoryEntity parent;

    @OneToMany(mappedBy="parent")
    private List<UacCategoryEntity> children = new ArrayList<UacCategoryEntity>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "goodsId",fetch=FetchType.LAZY)
    private List<UacGoodsEntity> goods;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getCatDesc() {
        return catDesc;
    }

    public void setCatDesc(String catDesc) {
        this.catDesc = catDesc;
    }

    public UacCategoryEntity getParent() {
        return parent;
    }

    public void setParent(UacCategoryEntity parent) {
        this.parent = parent;
    }

    public List<UacCategoryEntity> getChildren() {
        return children;
    }

    public void setChildren(List<UacCategoryEntity> children) {
        this.children = children;
    }


    public String getTemplateFile() {
        return templateFile;
    }

    public void setTemplateFile(String templateFile) {
        this.templateFile = templateFile;
    }

    public String getMeasureUnit() {
        return measureUnit;
    }

    public void setMeasureUnit(String measureUnit) {
        this.measureUnit = measureUnit;
    }

    public int getShowInNav() {
        return showInNav;
    }

    public void setShowInNav(int showInNav) {
        this.showInNav = showInNav;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public short getFilterAttr() {
        return filterAttr;
    }

    public void setFilterAttr(short filterAttr) {
        this.filterAttr = filterAttr;
    }

    public List<UacGoodsEntity> getGoods() {
        return goods;
    }

    public void setGoods(List<UacGoodsEntity> goods) {
        this.goods = goods;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UacCategoryEntity that = (UacCategoryEntity) o;

        if (id != that.id) return false;
        if (showInNav != that.showInNav) return false;
        if (grade != that.grade) return false;
        if (filterAttr != that.filterAttr) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (keywords != null ? !keywords.equals(that.keywords) : that.keywords != null) return false;
        if (catDesc != null ? !catDesc.equals(that.catDesc) : that.catDesc != null) return false;
        if (templateFile != null ? !templateFile.equals(that.templateFile) : that.templateFile != null) return false;
        if (measureUnit != null ? !measureUnit.equals(that.measureUnit) : that.measureUnit != null) return false;
        if (style != null ? !style.equals(that.style) : that.style != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (keywords != null ? keywords.hashCode() : 0);
        result = 31 * result + (catDesc != null ? catDesc.hashCode() : 0);
        result = 31 * result + (templateFile != null ? templateFile.hashCode() : 0);
        result = 31 * result + (measureUnit != null ? measureUnit.hashCode() : 0);
        result = 31 * result + showInNav;
        result = 31 * result + (style != null ? style.hashCode() : 0);
        result = 31 * result + grade;
        result = 31 * result + (int) filterAttr;
        return result;
    }
}
