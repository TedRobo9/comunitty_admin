package com.uacity.admin.domain;

import javax.persistence.*;

/**
 * Created by Ted on 16/7/11.
 */
@Entity
@Table(name = "uac_shop", schema = "ua_city")
public class UacShopEntity extends BaseEntity{

    @Id
    @Column(name = "shop_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "shop_name")
    private String name;

    @ManyToOne(cascade = {CascadeType.REFRESH }, optional = true)
    @JoinColumn(name = "shop_type", referencedColumnName = "shop_type_id")
    private UacShopTypeEntity type;

    @ManyToOne(cascade = {CascadeType.REFRESH }, optional = true)
    @JoinColumn(name = "shop_keeper", referencedColumnName = "user_id")
    private UacUsersEntity keeper;

    @OneToOne(optional = true)
    @JoinColumn(name = "shop_sales", referencedColumnName = "user_id")
    private UacUsersEntity sales;

    @Column(name = "shop_address")
    private String address;

    @Column(name = "shop_phone")
    private String phone;

    @Column(name = "shop_thumb")
    private String thumb;

    @Column(name = "shop_image")
    private String image;

    @Column(name = "shop_grade")
    private int grade;

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

    public UacShopTypeEntity getType() {
        return type;
    }

    public void setType(UacShopTypeEntity type) {
        this.type = type;
    }

    public UacUsersEntity getKeeper() {
        return keeper;
    }

    public void setKeeper(UacUsersEntity keeper) {
        this.keeper = keeper;
    }

    public UacUsersEntity getSales() {
        return sales;
    }

    public void setSales(UacUsersEntity sales) {
        this.sales = sales;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
