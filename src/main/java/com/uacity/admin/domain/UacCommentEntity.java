package com.uacity.admin.domain;

import javax.persistence.*;

/**
 * Created by eegijmc on 7/4/2016.
 */
@Entity
@Table(name = "uac_comment", schema = "ua_city", catalog = "")
public class UacCommentEntity {
    private long commentId;
    private int commentType;
    private boolean idValue;
    private String email;
    private String userName;
    private String content;
    private int commentRank;
    private int addTime;
    private String ipAddress;
    private int status;
    private int parentId;
    private int userId;

    @Id
    @Column(name = "comment_id")
    public long getCommentId() {
        return commentId;
    }

    public void setCommentId(long commentId) {
        this.commentId = commentId;
    }

    @Basic
    @Column(name = "comment_type")
    public int getCommentType() {
        return commentType;
    }

    public void setCommentType(int commentType) {
        this.commentType = commentType;
    }

    @Basic
    @Column(name = "id_value")
    public boolean isIdValue() {
        return idValue;
    }

    public void setIdValue(boolean idValue) {
        this.idValue = idValue;
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
    @Column(name = "user_name")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "content")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Basic
    @Column(name = "comment_rank")
    public int getCommentRank() {
        return commentRank;
    }

    public void setCommentRank(int commentRank) {
        this.commentRank = commentRank;
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
    @Column(name = "ip_address")
    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    @Basic
    @Column(name = "status")
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Basic
    @Column(name = "parent_id")
    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    @Basic
    @Column(name = "user_id")
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UacCommentEntity that = (UacCommentEntity) o;

        if (commentId != that.commentId) return false;
        if (commentType != that.commentType) return false;
        if (idValue != that.idValue) return false;
        if (commentRank != that.commentRank) return false;
        if (addTime != that.addTime) return false;
        if (status != that.status) return false;
        if (parentId != that.parentId) return false;
        if (userId != that.userId) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (userName != null ? !userName.equals(that.userName) : that.userName != null) return false;
        if (content != null ? !content.equals(that.content) : that.content != null) return false;
        if (ipAddress != null ? !ipAddress.equals(that.ipAddress) : that.ipAddress != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (commentId ^ (commentId >>> 32));
        result = 31 * result + commentType;
        result = 31 * result + (idValue ? 1 : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + commentRank;
        result = 31 * result + addTime;
        result = 31 * result + (ipAddress != null ? ipAddress.hashCode() : 0);
        result = 31 * result + status;
        result = 31 * result + parentId;
        result = 31 * result + userId;
        return result;
    }
}
