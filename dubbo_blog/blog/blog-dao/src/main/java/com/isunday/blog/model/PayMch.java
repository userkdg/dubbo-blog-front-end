package com.isunday.blog.model;

public class PayMch implements java.io.Serializable {
    private Integer payMchId;

    private String mchId;

    private String name;

    private String reqkey;

    private String reskey;

    public Integer getPayMchId() {
        return payMchId;
    }

    public void setPayMchId(Integer payMchId) {
        this.payMchId = payMchId;
    }

    public String getMchId() {
        return mchId;
    }

    public void setMchId(String mchId) {
        this.mchId = mchId == null ? null : mchId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getReqkey() {
        return reqkey;
    }

    public void setReqkey(String reqkey) {
        this.reqkey = reqkey == null ? null : reqkey.trim();
    }

    public String getReskey() {
        return reskey;
    }

    public void setReskey(String reskey) {
        this.reskey = reskey == null ? null : reskey.trim();
    }
}