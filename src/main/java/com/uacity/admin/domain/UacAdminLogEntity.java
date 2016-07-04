package com.uacity.admin.domain;

import javax.persistence.*;

/**
 * Created by eegijmc on 7/4/2016.
 */
@Entity
@Table(name = "uac_admin_log", schema = "ua_city", catalog = "")
public class UacAdminLogEntity {
    private int logId;
    private int logTime;
    private long userId;
    private String logInfo;
    private String ipAddress;

    @Id
    @Column(name = "log_id")
    public int getLogId() {
        return logId;
    }

    public void setLogId(int logId) {
        this.logId = logId;
    }

    @Basic
    @Column(name = "log_time")
    public int getLogTime() {
        return logTime;
    }

    public void setLogTime(int logTime) {
        this.logTime = logTime;
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
    @Column(name = "log_info")
    public String getLogInfo() {
        return logInfo;
    }

    public void setLogInfo(String logInfo) {
        this.logInfo = logInfo;
    }

    @Basic
    @Column(name = "ip_address")
    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UacAdminLogEntity that = (UacAdminLogEntity) o;

        if (logId != that.logId) return false;
        if (logTime != that.logTime) return false;
        if (userId != that.userId) return false;
        if (logInfo != null ? !logInfo.equals(that.logInfo) : that.logInfo != null) return false;
        if (ipAddress != null ? !ipAddress.equals(that.ipAddress) : that.ipAddress != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = logId;
        result = 31 * result + logTime;
        result = 31 * result + (int) userId;
        result = 31 * result + (logInfo != null ? logInfo.hashCode() : 0);
        result = 31 * result + (ipAddress != null ? ipAddress.hashCode() : 0);
        return result;
    }
}
