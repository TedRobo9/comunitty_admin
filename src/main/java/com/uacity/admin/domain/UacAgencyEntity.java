package com.uacity.admin.domain;

import javax.persistence.*;

/**
 * Created by eegijmc on 7/4/2016.
 */
@Entity
@Table(name = "uac_agency", schema = "ua_city", catalog = "")
public class UacAgencyEntity {
    private int agencyId;
    private String agencyName;
    private String agencyDesc;

    @Id
    @Column(name = "agency_id")
    public int getAgencyId() {
        return agencyId;
    }

    public void setAgencyId(int agencyId) {
        this.agencyId = agencyId;
    }

    @Basic
    @Column(name = "agency_name")
    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    @Basic
    @Column(name = "agency_desc")
    public String getAgencyDesc() {
        return agencyDesc;
    }

    public void setAgencyDesc(String agencyDesc) {
        this.agencyDesc = agencyDesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UacAgencyEntity that = (UacAgencyEntity) o;

        if (agencyId != that.agencyId) return false;
        if (agencyName != null ? !agencyName.equals(that.agencyName) : that.agencyName != null) return false;
        if (agencyDesc != null ? !agencyDesc.equals(that.agencyDesc) : that.agencyDesc != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = agencyId;
        result = 31 * result + (agencyName != null ? agencyName.hashCode() : 0);
        result = 31 * result + (agencyDesc != null ? agencyDesc.hashCode() : 0);
        return result;
    }
}
