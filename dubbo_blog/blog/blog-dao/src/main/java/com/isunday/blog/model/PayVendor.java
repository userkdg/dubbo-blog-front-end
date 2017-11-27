package com.isunday.blog.model;

public class PayVendor implements java.io.Serializable {
    private Integer payVendorId;

    private String name;

    private String appid;

    private String appsecret;

    private String config;

    public Integer getPayVendorId() {
        return payVendorId;
    }

    public void setPayVendorId(Integer payVendorId) {
        this.payVendorId = payVendorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid == null ? null : appid.trim();
    }

    public String getAppsecret() {
        return appsecret;
    }

    public void setAppsecret(String appsecret) {
        this.appsecret = appsecret == null ? null : appsecret.trim();
    }

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config == null ? null : config.trim();
    }
}