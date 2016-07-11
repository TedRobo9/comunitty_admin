package com.uacity.admin.domain;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Ted on 16/7/11.
 */
@Entity
@Table(name = "uac_shop_type", schema = "ua_city")
public class UacShopTypeEntity extends BaseEntity{

    @Id
    @Column(name = "shop_type_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "shop_type_name")
    private String name;

    @Column(name = "is_top")
    private boolean top;


    @OneToMany(cascade = CascadeType.ALL,fetch=FetchType.LAZY)
    private List<UacShopEntity> shops;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isTop() {
        return top;
    }

    public void setTop(boolean top) {
        this.top = top;
    }

}
