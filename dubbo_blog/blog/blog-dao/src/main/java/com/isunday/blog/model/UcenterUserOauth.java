package com.isunday.blog.model;

import java.util.Date;

public class UcenterUserOauth implements java.io.Serializable{
    private Integer userOauthId;

    private Integer userId;

    private Integer oauthId;

    private Byte status;

    private Date createTime;

    private byte[] openId;

    public Integer getUserOauthId() {
        return userOauthId;
    }

    public void setUserOauthId(Integer userOauthId) {
        this.userOauthId = userOauthId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getOauthId() {
        return oauthId;
    }

    public void setOauthId(Integer oauthId) {
        this.oauthId = oauthId;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public byte[] getOpenId() {
        return openId;
    }

    public void setOpenId(byte[] openId) {
        this.openId = openId;
    }
}