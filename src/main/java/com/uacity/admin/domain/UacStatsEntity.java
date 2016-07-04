package com.uacity.admin.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by eegijmc on 7/4/2016.
 */
@Entity
@Table(name = "uac_stats", schema = "ua_city", catalog = "")
public class UacStatsEntity {
    private int accessTime;
    private String ipAddress;
    private int visitTimes;
    private String browser;
    private String system;
    private String language;
    private String area;
    private String refererDomain;
    private String refererPath;
    private String accessUrl;

    @Basic
    @Column(name = "access_time")
    public int getAccessTime() {
        return accessTime;
    }

    public void setAccessTime(int accessTime) {
        this.accessTime = accessTime;
    }

    @Basic
    @Column(name = "ip_address")
    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    @Basic
    @Column(name = "visit_times")
    public int getVisitTimes() {
        return visitTimes;
    }

    public void setVisitTimes(int visitTimes) {
        this.visitTimes = visitTimes;
    }

    @Basic
    @Column(name = "browser")
    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    @Basic
    @Column(name = "system")
    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    @Basic
    @Column(name = "language")
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Basic
    @Column(name = "area")
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Basic
    @Column(name = "referer_domain")
    public String getRefererDomain() {
        return refererDomain;
    }

    public void setRefererDomain(String refererDomain) {
        this.refererDomain = refererDomain;
    }

    @Basic
    @Column(name = "referer_path")
    public String getRefererPath() {
        return refererPath;
    }

    public void setRefererPath(String refererPath) {
        this.refererPath = refererPath;
    }

    @Basic
    @Column(name = "access_url")
    public String getAccessUrl() {
        return accessUrl;
    }

    public void setAccessUrl(String accessUrl) {
        this.accessUrl = accessUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UacStatsEntity that = (UacStatsEntity) o;

        if (accessTime != that.accessTime) return false;
        if (visitTimes != that.visitTimes) return false;
        if (ipAddress != null ? !ipAddress.equals(that.ipAddress) : that.ipAddress != null) return false;
        if (browser != null ? !browser.equals(that.browser) : that.browser != null) return false;
        if (system != null ? !system.equals(that.system) : that.system != null) return false;
        if (language != null ? !language.equals(that.language) : that.language != null) return false;
        if (area != null ? !area.equals(that.area) : that.area != null) return false;
        if (refererDomain != null ? !refererDomain.equals(that.refererDomain) : that.refererDomain != null)
            return false;
        if (refererPath != null ? !refererPath.equals(that.refererPath) : that.refererPath != null) return false;
        if (accessUrl != null ? !accessUrl.equals(that.accessUrl) : that.accessUrl != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = accessTime;
        result = 31 * result + (ipAddress != null ? ipAddress.hashCode() : 0);
        result = 31 * result + visitTimes;
        result = 31 * result + (browser != null ? browser.hashCode() : 0);
        result = 31 * result + (system != null ? system.hashCode() : 0);
        result = 31 * result + (language != null ? language.hashCode() : 0);
        result = 31 * result + (area != null ? area.hashCode() : 0);
        result = 31 * result + (refererDomain != null ? refererDomain.hashCode() : 0);
        result = 31 * result + (refererPath != null ? refererPath.hashCode() : 0);
        result = 31 * result + (accessUrl != null ? accessUrl.hashCode() : 0);
        return result;
    }
}
