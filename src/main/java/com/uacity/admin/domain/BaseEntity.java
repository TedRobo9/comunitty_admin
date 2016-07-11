package com.uacity.admin.domain;

import javax.persistence.Transient;

/**
 * Created by eegijmc on 7/11/2016.
 */
public class BaseEntity {

    @Transient
    private int page;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
}
