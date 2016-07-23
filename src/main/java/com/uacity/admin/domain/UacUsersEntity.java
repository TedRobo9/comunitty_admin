package com.uacity.admin.domain;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

/**
 * Created by eegijmc on 7/4/2016.
 */
@Entity
@javax.persistence.Table(name = "uac_users", schema = "ua_city", catalog = "")
public class UacUsersEntity {

    private long userId;

    @Id
    @javax.persistence.Column(name = "user_id")
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    private String openid;

    @Basic
    @javax.persistence.Column(name = "open_id")
    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    private String nickname;

    @Basic
    @javax.persistence.Column(name = "nick_name")
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    private String headimgurl;

    @Basic
    @javax.persistence.Column(name = "head_img_url")
    public String getHeadimgurl() {
        return headimgurl;
    }

    public void setHeadimgurl(String headimgurl) {
        this.headimgurl = headimgurl;
    }

    private String country;

    @Basic
    @javax.persistence.Column(name = "country")
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    private String province;

    @Basic
    @javax.persistence.Column(name = "province")
    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    private String city;

    @Basic
    @javax.persistence.Column(name = "city")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    private String email;

    @Basic
    @javax.persistence.Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String userName;

    @Basic
    @javax.persistence.Column(name = "user_name")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    private String password;

    @Basic
    @javax.persistence.Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String question;

    @Basic
    @javax.persistence.Column(name = "question")
    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    private String answer;

    @Basic
    @javax.persistence.Column(name = "answer")
    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    private int sex;

    @Basic
    @javax.persistence.Column(name = "sex")
    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    private Date birthday;

    @Basic
    @javax.persistence.Column(name = "birthday")
    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    private BigDecimal userMoney;

    @Basic
    @javax.persistence.Column(name = "user_money")
    public BigDecimal getUserMoney() {
        return userMoney;
    }

    public void setUserMoney(BigDecimal userMoney) {
        this.userMoney = userMoney;
    }

    private BigDecimal frozenMoney;

    @Basic
    @javax.persistence.Column(name = "frozen_money")
    public BigDecimal getFrozenMoney() {
        return frozenMoney;
    }

    public void setFrozenMoney(BigDecimal frozenMoney) {
        this.frozenMoney = frozenMoney;
    }

    private int payPoints;

    @Basic
    @javax.persistence.Column(name = "pay_points")
    public int getPayPoints() {
        return payPoints;
    }

    public void setPayPoints(int payPoints) {
        this.payPoints = payPoints;
    }

    private int rankPoints;

    @Basic
    @javax.persistence.Column(name = "rank_points")
    public int getRankPoints() {
        return rankPoints;
    }

    public void setRankPoints(int rankPoints) {
        this.rankPoints = rankPoints;
    }

    private long addressId;

    @Basic
    @javax.persistence.Column(name = "address_id")
    public long getAddressId() {
        return addressId;
    }

    public void setAddressId(long addressId) {
        this.addressId = addressId;
    }

    private int regTime;

    @Basic
    @javax.persistence.Column(name = "reg_time")
    public int getRegTime() {
        return regTime;
    }

    public void setRegTime(int regTime) {
        this.regTime = regTime;
    }

    private int lastLogin;

    @Basic
    @javax.persistence.Column(name = "last_login")
    public int getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(int lastLogin) {
        this.lastLogin = lastLogin;
    }

    private Timestamp lastTime;

    @Basic
    @javax.persistence.Column(name = "last_time")
    public Timestamp getLastTime() {
        return lastTime;
    }

    public void setLastTime(Timestamp lastTime) {
        this.lastTime = lastTime;
    }

    private String lastIp;

    @Basic
    @javax.persistence.Column(name = "last_ip")
    public String getLastIp() {
        return lastIp;
    }

    public void setLastIp(String lastIp) {
        this.lastIp = lastIp;
    }

    private int visitCount;

    @Basic
    @javax.persistence.Column(name = "visit_count")
    public int getVisitCount() {
        return visitCount;
    }

    public void setVisitCount(int visitCount) {
        this.visitCount = visitCount;
    }

    private int userRank;

    @Basic
    @javax.persistence.Column(name = "user_rank")
    public int getUserRank() {
        return userRank;
    }

    public void setUserRank(int userRank) {
        this.userRank = userRank;
    }

    private boolean isSpecial;

    @Basic
    @javax.persistence.Column(name = "is_special")
    public boolean isSpecial() {
        return isSpecial;
    }

    public void setSpecial(boolean special) {
        isSpecial = special;
    }

    private String salt;

    @Basic
    @javax.persistence.Column(name = "salt")
    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    private long parentId;

    @Basic
    @javax.persistence.Column(name = "parent_id")
    public long getParentId() {
        return parentId;
    }

    public void setParentId(long parentId) {
        this.parentId = parentId;
    }

    private boolean flag;

    @Basic
    @javax.persistence.Column(name = "flag")
    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    private String alias;

    @Basic
    @javax.persistence.Column(name = "alias")
    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    private String msn;

    @Basic
    @javax.persistence.Column(name = "msn")
    public String getMsn() {
        return msn;
    }

    public void setMsn(String msn) {
        this.msn = msn;
    }

    private String qq;

    @Basic
    @javax.persistence.Column(name = "qq")
    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    private String officePhone;

    @Basic
    @javax.persistence.Column(name = "office_phone")
    public String getOfficePhone() {
        return officePhone;
    }

    public void setOfficePhone(String officePhone) {
        this.officePhone = officePhone;
    }

    private String homePhone;

    @Basic
    @javax.persistence.Column(name = "home_phone")
    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    private String mobilePhone;

    @Basic
    @javax.persistence.Column(name = "mobile_phone")
    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    private boolean isValidated;

    @Basic
    @javax.persistence.Column(name = "is_validated")
    public boolean isValidated() {
        return isValidated;
    }

    public void setValidated(boolean validated) {
        isValidated = validated;
    }

    private BigDecimal creditLine;

    @Basic
    @javax.persistence.Column(name = "credit_line")
    public BigDecimal getCreditLine() {
        return creditLine;
    }

    public void setCreditLine(BigDecimal creditLine) {
        this.creditLine = creditLine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UacUsersEntity that = (UacUsersEntity) o;

        if (userId != that.userId) return false;
        if (sex != that.sex) return false;
        if (payPoints != that.payPoints) return false;
        if (rankPoints != that.rankPoints) return false;
        if (addressId != that.addressId) return false;
        if (regTime != that.regTime) return false;
        if (lastLogin != that.lastLogin) return false;
        if (visitCount != that.visitCount) return false;
        if (userRank != that.userRank) return false;
        if (isSpecial != that.isSpecial) return false;
        if (parentId != that.parentId) return false;
        if (flag != that.flag) return false;
        if (isValidated != that.isValidated) return false;
        if (openid != null ? !openid.equals(that.openid) : that.openid != null) return false;
        if (nickname != null ? !nickname.equals(that.nickname) : that.nickname != null) return false;
        if (headimgurl != null ? !headimgurl.equals(that.headimgurl) : that.headimgurl != null) return false;
        if (country != null ? !country.equals(that.country) : that.country != null) return false;
        if (province != null ? !province.equals(that.province) : that.province != null) return false;
        if (city != null ? !city.equals(that.city) : that.city != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (userName != null ? !userName.equals(that.userName) : that.userName != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (question != null ? !question.equals(that.question) : that.question != null) return false;
        if (answer != null ? !answer.equals(that.answer) : that.answer != null) return false;
        if (birthday != null ? !birthday.equals(that.birthday) : that.birthday != null) return false;
        if (userMoney != null ? !userMoney.equals(that.userMoney) : that.userMoney != null) return false;
        if (frozenMoney != null ? !frozenMoney.equals(that.frozenMoney) : that.frozenMoney != null) return false;
        if (lastTime != null ? !lastTime.equals(that.lastTime) : that.lastTime != null) return false;
        if (lastIp != null ? !lastIp.equals(that.lastIp) : that.lastIp != null) return false;
        if (salt != null ? !salt.equals(that.salt) : that.salt != null) return false;
        if (alias != null ? !alias.equals(that.alias) : that.alias != null) return false;
        if (msn != null ? !msn.equals(that.msn) : that.msn != null) return false;
        if (qq != null ? !qq.equals(that.qq) : that.qq != null) return false;
        if (officePhone != null ? !officePhone.equals(that.officePhone) : that.officePhone != null) return false;
        if (homePhone != null ? !homePhone.equals(that.homePhone) : that.homePhone != null) return false;
        if (mobilePhone != null ? !mobilePhone.equals(that.mobilePhone) : that.mobilePhone != null) return false;
        if (creditLine != null ? !creditLine.equals(that.creditLine) : that.creditLine != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (userId ^ (userId >>> 32));
        result = 31 * result + (openid != null ? openid.hashCode() : 0);
        result = 31 * result + (nickname != null ? nickname.hashCode() : 0);
        result = 31 * result + (headimgurl != null ? headimgurl.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (province != null ? province.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (question != null ? question.hashCode() : 0);
        result = 31 * result + (answer != null ? answer.hashCode() : 0);
        result = 31 * result + sex;
        result = 31 * result + (birthday != null ? birthday.hashCode() : 0);
        result = 31 * result + (userMoney != null ? userMoney.hashCode() : 0);
        result = 31 * result + (frozenMoney != null ? frozenMoney.hashCode() : 0);
        result = 31 * result + payPoints;
        result = 31 * result + rankPoints;
        result = 31 * result + (int) (addressId ^ (addressId >>> 32));
        result = 31 * result + regTime;
        result = 31 * result + lastLogin;
        result = 31 * result + (lastTime != null ? lastTime.hashCode() : 0);
        result = 31 * result + (lastIp != null ? lastIp.hashCode() : 0);
        result = 31 * result + visitCount;
        result = 31 * result + userRank;
        result = 31 * result + (isSpecial ? 1 : 0);
        result = 31 * result + (salt != null ? salt.hashCode() : 0);
        result = 31 * result + (int) (parentId ^ (parentId >>> 32));
        result = 31 * result + (flag ? 1 : 0);
        result = 31 * result + (alias != null ? alias.hashCode() : 0);
        result = 31 * result + (msn != null ? msn.hashCode() : 0);
        result = 31 * result + (qq != null ? qq.hashCode() : 0);
        result = 31 * result + (officePhone != null ? officePhone.hashCode() : 0);
        result = 31 * result + (homePhone != null ? homePhone.hashCode() : 0);
        result = 31 * result + (mobilePhone != null ? mobilePhone.hashCode() : 0);
        result = 31 * result + (isValidated ? 1 : 0);
        result = 31 * result + (creditLine != null ? creditLine.hashCode() : 0);
        return result;
    }
}
