package com.uacity.admin.domain;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;

/**
 * Created by eegijmc on 7/11/2016.
 */
@MappedSuperclass
public class BaseEntity {

    @Column
    private int num;

    @Column(name = "is_valid")
    private boolean valid;

    @Transient
    private int page;

    public int getNum() {
        return num;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
}
