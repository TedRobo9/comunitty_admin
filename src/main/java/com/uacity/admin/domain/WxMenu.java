package com.uacity.admin.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by eegijmc on 7/7/2016.
 */
@Entity
@Table(name = "uac_wechat_menu", schema = "ua_city", catalog = "")
public class WxMenu extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private Integer id;

    @Column
    private String name;

    // dir 目录, click 点击, view 跳转, oauth_base 跳转(静默授权),
    // oauth_info 跳转(网页授权), scancode_push 扫码,
    // scancode_waitmsg 扫码(带提示), pic_sysphoto 拍照, pic_weixin
    // 发图, pic_photo_or_album 拍照/发图, location_select 地理位置,
    // media_id 下发消息, view_limited 图文消息
    @Column
    private String type;

    @Column
    private String value;

    @Column
    private Integer status = 1;// 1 激活, 0 非激活

    @Column
    private Integer num;

    @Column(name="parent_id")
    private Integer parentId;

    @Transient
    private List<WxMenu> subs;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public List<WxMenu> getSubs() {
        return subs;
    }

    public void setSubs(List<WxMenu> subs) {
        this.subs = subs;
    }

}
