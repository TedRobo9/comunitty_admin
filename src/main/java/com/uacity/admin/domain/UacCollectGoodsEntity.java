package com.uacity.admin.domain;

import javax.persistence.*;

/**
 * Created by eegijmc on 7/4/2016.
 */
@Entity
@Table(name = "uac_collect_goods", schema = "ua_city", catalog = "")
public class UacCollectGoodsEntity {
    private long recId;
    private long userId;
    private long goodsId;
    private int addTime;
    private boolean isAttention;

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
    @Column(name = "goods_id")
    public long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(long goodsId) {
        this.goodsId = goodsId;
    }

    @Basic
    @Column(name = "add_time")
    public int getAddTime() {
        return addTime;
    }

    public void setAddTime(int addTime) {
        this.addTime = addTime;
    }

    @Basic
    @Column(name = "is_attention")
    public boolean isAttention() {
        return isAttention;
    }

    public void setAttention(boolean attention) {
        isAttention = attention;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UacCollectGoodsEntity that = (UacCollectGoodsEntity) o;

        if (recId != that.recId) return false;
        if (userId != that.userId) return false;
        if (goodsId != that.goodsId) return false;
        if (addTime != that.addTime) return false;
        if (isAttention != that.isAttention) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (recId ^ (recId >>> 32));
        result = 31 * result + (int) (userId ^ (userId >>> 32));
        result = 31 * result + (int) (goodsId ^ (goodsId >>> 32));
        result = 31 * result + addTime;
        result = 31 * result + (isAttention ? 1 : 0);
        return result;
    }
}
