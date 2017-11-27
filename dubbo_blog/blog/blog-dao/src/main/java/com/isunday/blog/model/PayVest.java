package com.isunday.blog.model;

public class PayVest implements java.io.Serializable{
    private Integer payVestId;

    private Integer payTypeId;

    private String prefix;

    private String param;

    public Integer getPayVestId() {
        return payVestId;
    }

    public void setPayVestId(Integer payVestId) {
        this.payVestId = payVestId;
    }

    public Integer getPayTypeId() {
        return payTypeId;
    }

    public void setPayTypeId(Integer payTypeId) {
        this.payTypeId = payTypeId;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix == null ? null : prefix.trim();
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param == null ? null : param.trim();
    }
}