package com.uacity.admin.domain;

import javax.persistence.*;

/**
 * Created by eegijmc on 7/4/2016.
 */
@Entity
@Table(name = "uac_admin_user", schema = "ua_city", catalog = "")
public class UacAdminUserEntity {
    private long userId;
    private String userName;
    private String email;
    private String password;
    private int addTime;
    private int lastLogin;
    private String lastIp;
    private String actionList;
    private String navList;
    private String langType;
    private short agencyId;
    private String todolist;

    @Id
    @Column(name = "user_id")
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "user_name")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
    @Column(name = "last_login")
    public int getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(int lastLogin) {
        this.lastLogin = lastLogin;
    }

    @Basic
    @Column(name = "last_ip")
    public String getLastIp() {
        return lastIp;
    }

    public void setLastIp(String lastIp) {
        this.lastIp = lastIp;
    }

    @Basic
    @Column(name = "action_list")
    public String getActionList() {
        return actionList;
    }

    public void setActionList(String actionList) {
        this.actionList = actionList;
    }

    @Basic
    @Column(name = "nav_list")
    public String getNavList() {
        return navList;
    }

    public void setNavList(String navList) {
        this.navList = navList;
    }

    @Basic
    @Column(name = "lang_type")
    public String getLangType() {
        return langType;
    }

    public void setLangType(String langType) {
        this.langType = langType;
    }

    @Basic
    @Column(name = "agency_id")
    public short getAgencyId() {
        return agencyId;
    }

    public void setAgencyId(short agencyId) {
        this.agencyId = agencyId;
    }

    @Basic
    @Column(name = "todolist")
    public String getTodolist() {
        return todolist;
    }

    public void setTodolist(String todolist) {
        this.todolist = todolist;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UacAdminUserEntity that = (UacAdminUserEntity) o;

        if (userId != that.userId) return false;
        if (addTime != that.addTime) return false;
        if (lastLogin != that.lastLogin) return false;
        if (agencyId != that.agencyId) return false;
        if (userName != null ? !userName.equals(that.userName) : that.userName != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (lastIp != null ? !lastIp.equals(that.lastIp) : that.lastIp != null) return false;
        if (actionList != null ? !actionList.equals(that.actionList) : that.actionList != null) return false;
        if (navList != null ? !navList.equals(that.navList) : that.navList != null) return false;
        if (langType != null ? !langType.equals(that.langType) : that.langType != null) return false;
        if (todolist != null ? !todolist.equals(that.todolist) : that.todolist != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (userId ^ (userId >>> 32));
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + addTime;
        result = 31 * result + lastLogin;
        result = 31 * result + (lastIp != null ? lastIp.hashCode() : 0);
        result = 31 * result + (actionList != null ? actionList.hashCode() : 0);
        result = 31 * result + (navList != null ? navList.hashCode() : 0);
        result = 31 * result + (langType != null ? langType.hashCode() : 0);
        result = 31 * result + (int) agencyId;
        result = 31 * result + (todolist != null ? todolist.hashCode() : 0);
        return result;
    }
}
